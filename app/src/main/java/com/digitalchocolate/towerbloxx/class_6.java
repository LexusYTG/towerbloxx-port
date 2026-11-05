package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Image;

// $VF: renamed from: u
public final class class_6 implements Runnable {
   // $VF: renamed from: a e
   static class_22 field_129;
   // $VF: renamed from: a e[]
   static class_22[] field_130;
   // $VF: renamed from: a java.lang.String
   static String field_131;
   // $VF: renamed from: a int
   static int field_132;
   // $VF: renamed from: b int
   static int field_133;
   // $VF: renamed from: c int
   static int field_134;
   // $VF: renamed from: d int
   public static int field_135;
   // $VF: renamed from: a java.lang.String[]
   static String[] field_136;
   // $VF: renamed from: b e
   static class_22 field_137;
   // $VF: renamed from: c e
   static class_22 field_138;
   // $VF: renamed from: a javax.microedition.lcdui.Image
   static Image field_139;
   // $VF: renamed from: b javax.microedition.lcdui.Image
   static Image field_140;
   // $VF: renamed from: e int
   static int field_141;
   // $VF: renamed from: a int[][]
   static int[][] field_142;
   // $VF: renamed from: f int
   static int field_143;

   // $VF: renamed from: run () void
   public final void run() {
      if (!class_0.method_6(field_131)) {
         field_133 = -1;
      }
   }

   // $VF: renamed from: a (int[], int[], int[], int[], java.lang.String[], int, int) void
   public static void method_57(int[] var0, int[] var1, int[] var2, int[] var3, String[] var4, int var5, int var6) {
      String[] var22 = new String[var5 = var0.length];
      Image[] var7 = new Image[var5];
      String[] var8 = new String[var5];
      Image[] var9 = new Image[var5];

      for (int var10 = 0; var10 < var5; var10++) {
         var22[var10] = class_37.method_618(var0[var10]);
         var7[var10] = class_37.method_641(var1[var10]);
         var8[var10] = class_37.method_618(var2[var10]);
         var9[var10] = class_37.method_641(var3[var10]);
      }

      Image[] var17 = var9;
      String[] var16 = var8;
      Image[] var15 = var7;
      String[] var14 = var22;
      field_136 = var4;
      field_143 = 0;

      for (int var29 = 0; var29 < var4.length; var29++) {
         if (var4[var29] != null) {
            field_143++;
         }
      }

      field_141 = 34;
      int var30 = 0;
      if (field_143 > 1) {
         field_139 = class_37.method_641(65547);
         field_140 = class_37.method_641(65548);
         var30 = field_139.getWidth() + field_140.getWidth() + 10;
      }

      field_136 = new String[field_143];
      field_130 = new class_22[field_143];
      int var31 = 0;

      for (int var32 = 0; var32 < var4.length; var32++) {
         if (var4[var32] != null) {
            field_136[var31] = var4[var32];
            byte var34 = 0;
            Image var19 = null;
            if (var15[var32] != null) {
               var19 = var15[var32];
            }

            String var23 = null;
            if (var14[var32] != null) {
               var23 = var14[var32];
            }

            Image var11 = null;
            if (var17[var32] != null) {
               var11 = var17[var32];
               var34 = 1;
            }

            String var12 = null;
            if (var16[var32] != null) {
               var12 = var16[var32];
               var12 = var12 + class_37.method_614(2);
            }

            class_22 var13;
            (var13 = new class_22()).method_240(1, 2, var34);
            var13.method_242(var23, var19, 1);
            if (var11 != null) {
               var13.method_244(0, 1, null, new Image[]{var11}, 0);
               var13.method_244(1, 1, var12, null, 0);
            } else {
               var13.method_244(0, 1, var12, null, 0);
            }

            int var24 = 0;
            boolean var20 = false;
            var13.field_477[0] = 34;
            var13.field_477[1] = 5;
            int var10001 = class_37.method_608() - var30;
            var24 = class_37.method_621();
            var13.method_252(var10001, var24, false);
            field_130[var31] = var13;
            var31++;
         }
      }

      String var33 = class_37.method_618(46);
      (field_138 = new class_22()).method_240(1, 1, 0);
      field_138.method_242(var33, null, 1);
      field_138.method_244(0, 1, class_37.method_618(136), null, 0);
      int var26 = 0;
      boolean var21 = false;
      field_138.field_477[0] = 1;
      class_22 var10000 = field_138;
      int var37 = class_37.method_608();
      var26 = class_37.method_621();
      var10000.method_252(var37, var26, false);
      (field_137 = new class_22()).method_240(1, 1, 0);
      field_137.method_242(var33, null, 1);
      field_137.method_244(0, 1, class_37.method_618(137), null, 0);
      field_137.field_477[0] = 1;
      var10000 = field_137;
      var37 = class_37.method_608();
      var26 = class_37.method_621();
      var10000.method_252(var37, var26, false);
   }
}
