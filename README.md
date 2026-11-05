# Tower Bloxx (port a Android)

Port a Android de Tower Bloxx (Digital Chocolate, Java ME, MIDlet `DCDistrict`, version MyCity N80). Usa la capa de compatibilidad MIDP propia en `app/src/main/java/javax/...`.

- Codigo del juego (decompilado con CFR): `app/src/main/java/com/digitalchocolate/towerbloxx/`
- Recursos del JAR original: `app/src/main/assets/`
- Glue de Android (Activity, vista, recursos, Bluetooth): `app/src/main/java/com/dranp/rally3d/`

## Notas
- Probado en dispositivo (Redmi, Android): todos los modos de juego funcionan.
- Las clases del juego estaban en el paquete por defecto; se las movio a `com.digitalchocolate.towerbloxx` para que `MainActivity` pueda importarlas.
- `ag.startApp/pauseApp/destroyApp` pasaron de `protected` a `public` (los llama `MainActivity` desde otro paquete).
- `ad.java`: `getResourceAsStream(d + nombre)` se reemplazo por `Res.open(nombre)`.
