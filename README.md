# Tower Bloxx (port a Android)

Port a Android de **Tower Bloxx** (Digital Chocolate, Java ME, MIDlet `DCDistrict`, versión MyCity N80). El juego corre de forma nativa en Android, sin emulador de J2ME: el código original del juego se ejecuta sobre una capa de compatibilidad MIDP escrita para este proyecto.

Probado en un Redmi con Android: todos los modos de juego funcionan.

## Descarga

La APK compilada (debug) está en la sección **Releases** del repositorio.

## Estructura

| Ruta | Contenido |
|---|---|
| `app/src/main/java/com/digitalchocolate/towerbloxx/` | Código del juego, decompilado con CFR |
| `app/src/main/java/javax/microedition/...` | Capa de compatibilidad MIDP/LCDUI propia (`Canvas`, `Graphics`, `Image`, etc.) sobre las APIs de Android |
| `app/src/main/java/com/dranp/rally3d/` | Glue de Android: `MainActivity`, vista, carga de recursos, Bluetooth |
| `app/src/main/assets/` | Recursos extraídos del JAR original |

## Cómo se logró que funcione

1. **Decompilar el JAR.** Se decompiló el JAR original con CFR. El resultado conserva los nombres ofuscados (`class_25`, `method_325`, `field_542`...), así que no es código limpio.
2. **Mover las clases a un paquete.** Las clases del juego estaban en el paquete por defecto, y Java no permite importarlas desde otro paquete. Se movieron a `com.digitalchocolate.towerbloxx` para que `MainActivity` pueda usarlas.
3. **Capa MIDP.** En vez de usar un emulador, se implementaron en `javax.microedition.lcdui` las clases que el juego espera (`Canvas`, `Graphics`, `Image`...) apoyadas en `android.graphics`. El `paint()` del juego dibuja directamente sobre un `android.graphics.Canvas`.
4. **Visibilidad.** `startApp`, `pauseApp` y `destroyApp` pasaron de `protected` a `public`, porque `MainActivity` las llama desde otro paquete.
5. **Recursos.** `getResourceAsStream(...)` del MIDlet original se sustituyó por `Res.open(nombre)`, que lee desde `assets/`.
6. **Corregir los artefactos del decompilador.** Fue lo que impedía que el juego arrancara bien. Al decompilar, algunas variables locales quedan mal tipadas o reutilizadas, y eso compila pero falla en ejecución:
   - **`ClassCastException: int[] cannot be cast to java.lang.Object[]`** en `class_25.method_325` (y un caso igual en `class_12`). El decompilador declaró un `int[]` como `Object` y luego lo trató como `Object[]`. Se corrigió declarándolo como `int[]`.
   - **`ArrayIndexOutOfBoundsException`** en `class_22.method_265`. Al inlinear un método, el decompilador reutilizó `var2` como índice del elemento y como ancho, y siguió usándolo como índice después de sobrescribirlo. Se separaron en `idx` y `w`.
7. **Depurar en el dispositivo.** `MainActivity` incluye un watchdog que, cada pocos segundos, vuelca al logcat (etiqueta `TBX`) la pila del hilo del juego. Con eso se ve dónde está el juego si se cuelga. Todos los fallos anteriores se encontraron leyendo `System.err` y esta etiqueta en logcat.

## Compilar

Requisitos: Android SDK y Gradle 8.14.5 (o el `gradlew` del proyecto). Crea `local.properties` con tu `sdk.dir`:

```properties
sdk.dir=/ruta/a/tu/android-sdk
```

```bash
./gradlew assembleDebug
```

La APK queda en `app/build/outputs/apk/debug/app-debug.apk`.

### Compilar, instalar y ver el log (Termux + adb)

```bash
./tbx.sh        # 20 s de logcat; ./tbx.sh 30 para otra duración
```

El script compila, instala, lanza el juego, lee logcat durante el tiempo indicado, cierra la app y guarda el resultado en `~/tbx_log.txt` con un resumen de las excepciones.

## Aviso

Tower Bloxx y el material original (código, gráficos, sonidos) pertenecen a Digital Chocolate y sus titulares. Este repositorio es un proyecto de preservación y aprendizaje, sin ánimo de lucro ni afiliación con los titulares. Si eres titular de derechos y quieres que se retire algo, abre un issue.
