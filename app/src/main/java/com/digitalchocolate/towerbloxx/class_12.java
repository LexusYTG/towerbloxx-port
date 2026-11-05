package com.digitalchocolate.towerbloxx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: o
public final class class_12 {
   // $VF: renamed from: a java.lang.String[][]
   private static String[][] field_249;
   // $VF: renamed from: a int[][][]
   private static int[][][] field_250;
   // $VF: renamed from: a int[]
   private static int[] field_251;
   // $VF: renamed from: a boolean
   private boolean field_252;
   // $VF: renamed from: a e
   private class_22 field_253;
   // $VF: renamed from: a int
   private int field_254;
   // $VF: renamed from: a int[][]
   private static final int[][] field_255 = new int[][]{{0, 1}, {2}};
   // $VF: renamed from: b int[]
   private static final int[] field_256 = new int[]{38, 39};
   // $VF: renamed from: b boolean
   private boolean field_257;

   public class_12() {
      (field_251 = new int[5])[0] = 3;
      field_251[1] = 1;
      field_250 = new int[field_251[0]][6][field_251[1]];
      method_160();
      this.field_254 = 0;
      this.field_257 = true;
   }

   // $VF: renamed from: a (int, int[], java.lang.String) int
   public final int method_153(int var1, int[] var2, String var3) {
      field_251[2] = var1;
      var1 = var1;
      int var5 = 6;
      int[] var7 = new int[1];

      for (int var4 = 0; var4 < var2.length; var4++) {
         var7[var4] = var2[var4];
      }

      int var10002;
      if (var7[0] > field_250[var1][4][0]) {
         for (int var8 = 4; var8 >= 0; var8--) {
            if (var7[0] > field_250[var1][var8][0]) {
               field_250[var1][var8 + 1] = field_250[var1][var8];
               var5--;
               if (var8 == 0) {
                  field_250[var1][var8] = var7;
                  break;
               }
            }

            if (var7[0] <= field_250[var1][var8][0]) {
               field_250[var1][var8 + 1] = var7;
               break;
            }
         }

         method_159();
         var10002 = var5;
      } else {
         var10002 = -1;
      }

      field_251[4] = var10002;
      return field_251[4];
   }

   // $VF: renamed from: a (int) boolean
   public final boolean method_154(int var1) {
      this.field_257 = true;
      this.field_252 = var1 == 1;
      if (field_251[0] != 1 && !this.field_252) {
         field_251[3] = 0;
      } else {
         field_251[3] = 1;
      }

      return var1 != 2 && var1 != 1;
   }

   // $VF: renamed from: a (int) int
   public final int method_155(int var1) {
      if (this.field_257) {
         class_37.method_629();
         class_37.method_620(5, 0);
         this.field_257 = false;
      }

      class_0.field_12 = true;
      this.field_253.method_255(var1);
      var1 = this.field_254;
      this.field_254 = 0;
      return var1;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_156(Graphics var1) {
      if (this.field_253 != null) {
         this.field_253.method_259(var1);
      }
   }

   // $VF: renamed from: a (int, int) void
   public final void method_157(int var1, int var2) {
      if (var2 == 3 && var1 == 5) {
         this.field_254 = 1;
      }

      if (this.field_253 != null) {
         this.field_253.method_260(var1, var2);
         if (var2 == 0 || var2 == 1) {
            switch (class_37.method_632(var1)) {
               case 52:
               case 54:
                  this.field_257 = true;
            }
         }
      }
   }

   // $VF: renamed from: a (int, int) java.lang.String
   private static String method_158(int var0, int var1) {
      String var3 = "";

      for (int var2 = 0; var2 < 1; var2++) {
         String var4 = var3 + field_250[var0][0][0];
         var3 = var4 + " ";
      }

      return var3;
   }

   // $VF: renamed from: c () void
   private static void method_159() {
      if (!class_8.field_181) {
         try {
            ByteArrayOutputStream var0 = new ByteArrayOutputStream();
            DataOutputStream var1 = new DataOutputStream(var0);

            for (int var2 = 0; var2 < field_251[0]; var2++) {
               for (int var3 = 0; var3 < 5; var3++) {
                  for (int var4 = 0; var4 < field_251[1]; var4++) {
                     var1.writeInt(field_250[var2][var3][var4]);
                  }
               }
            }

            class_37.method_639("hs", var0.toByteArray());
            var1.close();
            var0.close();
         } catch (Exception var5) {
         }
      }
   }

   // $VF: renamed from: d () void
   private static void method_160() {
      try {
         byte[] var0;
         if ((var0 = class_37.method_636("hs")) != null) {
            ByteArrayInputStream var6 = new ByteArrayInputStream(var0);
            DataInputStream var1 = new DataInputStream(var6);

            for (int var2 = 0; var2 < field_251[0]; var2++) {
               for (int var3 = 0; var3 < 5; var3++) {
                  for (int var4 = 0; var4 < field_251[1]; var4++) {
                     field_250[var2][var3][var4] = var1.readInt();
                  }
               }
            }

            var1.close();
            var6.close();
         }
      } catch (Exception var5) {
      }
   }

   // $VF: renamed from: a () void
   public final void method_161() {
      for (int var3 = 0; var3 < field_251[0]; var3++) {
         for (int var1 = 0; var1 < 5; var1++) {
            for (int var2 = 0; var2 < field_251[1]; var2++) {
               field_250[var3][var1][var2] = 0;
            }
         }
      }

      method_159();
   }

   // $VF: renamed from: b () void
   public final void method_162() {
      if (field_249 != null) {
         for (int var4 = 0; var4 < field_249.length; var4++) {
            for (int var6 = 0; var6 < field_249[var4].length; var6++) {
               field_249[var4][var6] = null;
            }
         }

         field_249 = null;
      }

      field_249 = new String[][]{
         {class_37.method_618(38), class_37.method_618(52), class_37.method_618(53)}, {class_37.method_618(39), class_37.method_618(54)}
      };
      this.field_253 = new class_22();
      this.field_253.method_240(3, field_256.length, 3);
      class_22[] var1 = new class_22[field_256.length];
      boolean var2 = false;
      int var3 = 0;
      class_22 var9 = null;
      int[] var5 = new int[2];
      var5[0] = 2;
      var5[1] = 2;

      for (int var8 = 0; var8 < field_256.length; var8++) {
         var1[var8] = new class_22();
         var1[var8].method_240(1, 5, 3);
         var1[var8].method_243(class_37.method_618(field_256[var8]), null, 1);

         for (int var13 = 0; var13 < field_255[var8].length; var13++) {
            String var9s = field_249[var8][var13 + 1];
            var1[var8].method_244(var13, 1, var9s + ": " + method_158(var3, 1), null, -1);
            var3++;
         }

         var1[var8].field_525 = var5;
         class_22 var10000 = var1[var8];
         int var10001 = class_37.method_608();
         int var7 = class_37.method_621();
         var10000.method_252(var10001, var7, false);
         class_22 var14 = var1[var8];
         var9 = this.field_253;
         if (this.field_253.field_496[var8] != -1) {
            var9.method_248(var8);
         }

         if (var14 != null) {
            var9.field_496[var8] = 7;
         } else {
            var9.field_496[var8] = -1;
         }

         var9.field_521[var8] = var14;
      }

      this.field_253.method_261(0);
      class_22 var16 = this.field_253;
      int var17 = class_37.method_608();
      int var15 = class_37.method_621();
      var16.method_252(var17, var15, false);
   }

   // $VF: renamed from: a () java.lang.String
   public static String method_163() {
      return class_37.method_618(43);
   }
}
