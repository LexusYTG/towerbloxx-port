package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: t
public final class class_7 {
   // $VF: renamed from: a long
   private static long field_144;
   // $VF: renamed from: a short[]
   private static short[] field_145 = null;
   // $VF: renamed from: a int
   private static final int field_146 = class_19.method_234(70710 << 12, 100000 << 12);
   // $VF: renamed from: b int
   private static final int field_147 = class_19.method_234('\uf56f' << '\f', 10000 << 12);
   // $VF: renamed from: c int
   private static int field_148 = 256 << 12;
   // $VF: renamed from: a int[]
   private static int[] field_149;
   // $VF: renamed from: b short[]
   private static short[] field_150;
   // $VF: renamed from: b int[]
   private static int[] field_151;
   // $VF: renamed from: a java.lang.String[]
   private static String[] field_152;
   // $VF: renamed from: b java.lang.String[]
   private static String[] field_153;
   // $VF: renamed from: a boolean
   private static boolean field_154;
   // $VF: renamed from: d int
   private static int field_155 = 10;
   // $VF: renamed from: e int
   private static int field_156 = 11;
   // $VF: renamed from: f int
   private static int field_157 = 11;
   // $VF: renamed from: g int
   private static int field_158 = 12;
   // $VF: renamed from: h int
   private static int field_159 = 13;
   // $VF: renamed from: i int
   private static int field_160 = 10;

   // $VF: renamed from: a () void
   public static final void method_58() {
      field_149 = new int[128];

      for (int var0 = 0; var0 < 128; var0++) {
         int[] var10000 = field_149;
         int var1 = 0;
         int var10002 = var1 = class_19.method_234(class_19.method_235(field_146, var0 << 12), 128 << 12);
         int var2;
         int var3;
         int var4;
         var2 = class_19.method_235(var4 = class_19.method_235(var3 = class_19.method_235(var2 = class_19.method_235(var10002, var10002), var1), var2), var2);
         int var5 = class_19.method_236(1, 6);
         int var6 = class_19.method_236(3, 40);
         int var7 = class_19.method_236(15, 336);
         var10000[var0] = class_19.method_234(
            var1 + class_19.method_235(var5, var3) + class_19.method_235(var6, var4) + class_19.method_235(var7, var2), field_147
         );
      }

      field_150 = new short[256];

      for (int var8 = 0; var8 < 256; var8++) {
         int var10 = var8 << 8;
         short var12 = 0;

         for (short var13 = 256; var13 != 0; var13 >>= 1) {
            if ((var12 ^ var13) * (var12 ^= var13) > var10) {
               var12 ^= var13;
            }
         }

         field_150[var8] = (short)var12;
      }
   }

   // $VF: renamed from: a (int) int
   public static final int method_59(int var0) {
      return class_19.method_237(class_30.method_387(class_19.method_237(class_19.method_234(class_19.method_235(var0, 256 << 12), field_148), -4)), -3);
   }

   // $VF: renamed from: b () void
   public static void method_60() {
      int var0 = 0;
      int var1 = 1024;
      field_144 = (System.currentTimeMillis() ^ 25214903917L) & 281474976710655L;
      if (field_145 == null) {
         field_145 = new short[256];

         for (int var2 = 0; var2 < 256; var2++) {
            field_145[var2] = (short)var0;
            var1 -= var0 * 25 >> 10;
            var0 += var1 * 25 >> 10;
         }
      }
   }

   // $VF: renamed from: b (int) int
   public static final int method_61(int var0) {
      return field_145[var0 & 0xFF];
   }

   // $VF: renamed from: c (int) int
   public static final int method_62(int var0) {
      return method_61(var0 - 64);
   }

   // $VF: renamed from: d (int) int
   public static final int method_63(int var0) {
      return ((int)((field_144 = field_144 * 25214903917L + 11L & 281474976710655L) >>> 16) & 16777215) % var0;
   }

   // $VF: renamed from: a (int, int) int
   public static final int method_64(int var0, int var1) {
      var1 = method_63(var1 - var0 + 1);
      return var0 + var1;
   }

   // $VF: renamed from: a (int, int, int, int, int, int, int) int
   public static int method_65(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      return ((var1 << 1 << 8) + (-var0 + var2) * var4 + ((var0 << 1) - var1 * 5 + (var2 << 2) - var3) * var5 + (-var0 + var1 * 3 - var2 * 3 + var3) * var6)
            / 2
         >> 8;
   }

   // $VF: renamed from: e (int) int
   public static int method_66(int var0) {
      return (var0 << 8) / 15;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, aa, int, int, char, boolean, int, int, int) int
   public static int method_67(Graphics var0, class_35 var1, int var2, int var3, char var4, boolean var5, int var6, int var7, int var8) {
      var3 = 0;
      if (field_152 == null) {
         field_152 = new String[field_155];
      }

      if (field_151 == null) {
         field_151 = new int[field_155];
      }

      if (field_153 == null) {
         field_153 = new String[61];

         for (int var9 = 0; var9 < field_153.length; var9++) {
            field_153[var9] = Integer.toString(var9);
         }
      }

      field_154 = false;
      int var17 = Math.abs(var2);
      String var10 = field_152[0];
      if (var17 < field_153.length) {
         var10 = field_153[var17];
      } else {
         for (int var11 = 0; var11 < field_155 && !field_154; var11++) {
            if (field_151[var11] == var17) {
               var10 = field_152[var11];
               field_154 = true;
            }
         }

         if (!field_154) {
            var10 = Integer.toString(var17);

            for (int var20 = field_155 - 1; var20 > 0; var20--) {
               field_151[var20] = field_151[var20 - 1];
               field_152[var20] = field_152[var20 - 1];
            }

            field_151[0] = var17;
            field_152[0] = var10;
         }
      }

      var17 = var10.length();

      while (--var17 >= 0) {
         var1.method_454(var10.charAt(var17) - '0');
         var3 += 0 + var1.method_446(0).field_394;
      }

      if (var4 == 'x') {
         var1.method_454(field_160);
         var3 += 0 + var1.method_446(0).field_394;
      } else if (var4 == 's') {
         var1.method_454(field_158);
         var3 += 0 + var1.method_446(0).field_394;
      } else if (var4 == 'p') {
         var1.method_454(field_159);
         var3 += 0 + var1.method_446(0).field_394;
      }

      if (var5) {
         if (var2 >= 0) {
            var1.method_454(field_156);
         } else {
            var1.method_454(field_157);
         }

         var3 += 0 + var1.method_446(0).field_394;
      }

      var17 = -1;
      if ((var8 & 1) != 0) {
         var6 -= var3 >> 1;
      } else if ((var8 & 8) != 0) {
         var17 = var6 -= var3;
      }

      if ((var8 & 16) != 0) {
         var7 += var1.method_460();
      } else if ((var8 & 2) != 0) {
         var7 += var1.method_460() >> 1;
      }

      if (var5) {
         if (var2 >= 0) {
            var1.method_454(field_156);
         } else {
            var1.method_454(field_157);
         }

         var1.method_450(var0, var6, var7);
         var6 += var1.method_446(0).field_394;
      }

      var2 = Math.abs(var2);
      int var14 = 1;

      while (var14 * 10 <= var2) {
         var14 *= 10;
      }

      while (var14 != 0) {
         int var5i = var2 / var14;
         var1.method_454(var5i);
         var8 = var1.method_446(0).field_394;
         var1.method_450(var0, var6, var7);
         var6 += var8;
         var2 -= var5i * var14;
         var14 /= 10;
      }

      if (var4 != ' ') {
         if (var4 == 'x') {
            var1.method_454(field_160);
         } else if (var4 == 's') {
            var1.method_454(field_158);
         } else if (var4 == 'p') {
            var1.method_454(field_159);
         }

         if (var1.method_455() > 9) {
            var1.method_450(var0, var6, var7);
            var6 += var1.method_446(0).field_394;
         }
      }

      return var17 == -1 ? var6 : var17;
   }
}
