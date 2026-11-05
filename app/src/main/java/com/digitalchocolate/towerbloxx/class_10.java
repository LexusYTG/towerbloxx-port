package com.digitalchocolate.towerbloxx;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

// $VF: renamed from: q
public final class class_10 {
   // $VF: renamed from: a java.util.Hashtable
   private static Hashtable field_224;
   // $VF: renamed from: b java.util.Hashtable
   private static Hashtable field_225;
   // $VF: renamed from: a int[]
   private static int[] field_226;
   // $VF: renamed from: a int
   private static int field_227;
   // $VF: renamed from: b int
   private static int field_228;
   // $VF: renamed from: a java.util.Vector
   private static Vector field_229 = new Vector(618, 618);
   // $VF: renamed from: a short[]
   private static short[] field_230 = new short[618];
   // $VF: renamed from: b int[]
   private static int[] field_231 = new int[618];
   // $VF: renamed from: a byte[]
   private static byte[] field_232 = new byte[618];
   // $VF: renamed from: b short[]
   private static short[] field_233 = new short[618];
   // $VF: renamed from: a int[][]
   private static int[][] field_234;
   // $VF: renamed from: b java.util.Vector
   private static Vector field_235;
   // $VF: renamed from: c short[]
   private static short[] field_236;
   // $VF: renamed from: c int[]
   private static int[] field_237;
   // $VF: renamed from: a java.lang.Object
   private static Object field_238;

   // $VF: renamed from: a () void
   public static void method_134() {
      class_24 var0;
      int var1;
      field_234 = new int[var1 = (var0 = class_37.method_627(1376258)).method_282() >> 2][];

      for (int var2 = 0; var2 < var1; var2++) {
         try {
            if (false) { throw new IOException(); } // port: el decompilador perdio los throws originales
            int var10000 = var0.method_287();
            boolean var3 = false;
            class_24 var10;
            int var4 = (var10 = class_37.method_627(var10000)).method_282() / 3;
            field_234[var2] = new int[var4];

            for (int var5 = 0; var5 < var4; var5++) {
               int var6 = var10.method_285();
               int var7 = var10.method_285();
               int var8 = var10.method_285();
               field_234[var2][var5] = var6 << 16 | var7 << 8 | var8 | 0xFF000000;
            }

            field_234[var2][0] = 0;
         } catch (IOException var9) {
         }
      }
   }

   // $VF: renamed from: b () void
   public static void method_135() {
      field_228 = 0;
   }

   // $VF: renamed from: a (int, boolean) r
   public static class_9 method_136(int var0, boolean var1) {
      if (!var1) {
         field_228 = 0;
      }

      if (field_225 == null) {
         field_225 = new Hashtable();
      } else {
         class_9 var2;
         if ((var2 = (class_9)field_225.get(new Integer(var0))) != null) {
            if (var0 != 131610) {
               return var2;
            }

            var2.method_132();
         }
      }

      class_9 var4 = null;

      try {
         if (false) { throw new IOException(); } // port: el decompilador perdio los throws originales
         var4 = new class_9(var0, var1);
      } catch (IOException var3) {
      }

      field_225.put(new Integer(var0), var4);
      return var4;
   }

   // $VF: renamed from: a (int) r
   public static class_9 method_137(int var0) {
      return method_136(var0, false);
   }

   // $VF: renamed from: a (int[]) r[]
   public static class_9[] method_138(int[] var0) {
      boolean var3 = false;
      int[] var4 = var0;
      class_9[] var1 = new class_9[var0.length];

      for (int var2 = 0; var2 < var4.length; var2++) {
         var1[var2] = method_136(var4[var2], false);
      }

      return var1;
   }

   // $VF: renamed from: a (int) javax.microedition.lcdui.Image
   public static Image method_139(int var0) {
      return method_140(var0).field_296;
   }

   // $VF: renamed from: a (int) k
   public static class_16 method_140(int var0) {
      class_16 var1 = null;
      if (var0 != -1) {
         int var2 = 0;
         int var3 = 0;
         class_16 var10000;
         if (field_224 == null) {
            var10000 = null;
         } else {
            String var7 = "" + 0 + "." + 1024 + "." + 1024 + "." + var0;
            var10000 = (class_16)field_224.get(var7);
         }

         var1 = var10000;
         if (var10000 != null) {
            return var1;
         }

         class_24 var8;
         if ((var8 = class_37.method_627(var0)).method_282() == 6) {
            try {
                if (false) { throw new IOException(); } // port: el decompilador perdio los throws originales
               var3 = (var8.method_285() >> 4) + 1;
               int var4 = var8.method_287();
               var2 = var8.method_285();
               var1 = method_144(var4, var2, 0, var3 << 10, -1);
            } catch (IOException var5) {
            }
         } else {
            class_9 var12 = method_136(var0, true);
            class_16[] var13 = new class_16[1];
            var12.method_128(0).method_432(var13);
            var1 = var13[0];
            var12.method_132();
         }

         boolean var10 = false;
         if (field_224 == null) {
            field_224 = new Hashtable();
         }

         String var6 = "" + 0 + "." + 1024 + "." + 1024 + "." + var0;
         field_224.put(var6, var1);
      }

      return var1;
   }

   // $VF: renamed from: a (int, int, int, int, boolean, int[]) void
   public static void method_141(int var0, int var1, int var2, int var3, boolean var4, int[] var5) {
      var5[1] = 0;
      int var6 = var3 - 1 << 8;
      int var10 = var6;
      int var9 = var1;
      int var8 = var0;
      int var11 = field_229.size();

      int var10000;
      while (true) {
         if (--var11 >= 0) {
            if (field_231[var11] != var8 || var8 != -1 && (var9 != (field_232[var11] & 255) || var10 != field_233[var11])) {
               continue;
            }

            var10000 = var11;
            break;
         }

         var10000 = -1;
         break;
      }

      int var7 = var10000;
      if (var10000 != -1) {
         var5[0] = var7;
         var5[1] = var2;
      } else {
         if ((var7 = field_229.size()) == field_231.length) {
            int[] var20 = new int[var7 << 1];
            byte[] var23 = new byte[var7 << 1];
            short[] var25 = new short[var7 << 1];
            short[] var27 = new short[var7 << 1];
            System.arraycopy(field_231, 0, var20, 0, var7);
            System.arraycopy(field_232, 0, var23, 0, var7);
            System.arraycopy(field_230, 0, var25, 0, var7);
            System.arraycopy(field_233, 0, var27, 0, var7);
            field_231 = var20;
            field_232 = var23;
            field_230 = var25;
            field_233 = var27;
         }

         field_230[var7] = 0;
         field_231[var7] = var0;
         field_232[var7] = (byte)var1;
         field_233[var7] = (short)var6;
         if (var7 == field_229.size()) {
            field_229.addElement(null);
         }

         if (var4) {
            class_16 var21 = method_144(var0, var1, 0, var3 << 10, -1);
            field_229.setElementAt(var21, var7);
         } else {
            if (field_226 == null) {
               field_226 = new int[3090];
            }

            int qOff = field_227 * 5;
            if (qOff == field_226.length) {
               int[] var15 = new int[field_226.length << 1];
               System.arraycopy(field_226, 0, var15, 0, qOff);
               field_226 = var15;
            }

            field_226[qOff] = var7;
            field_226[qOff + 1] = var0;
            field_226[qOff + 2] = var1;
            field_226[qOff + 3] = 0;
            field_226[qOff + 4] = var3;
            field_227++;

            while (qOff > 0 && field_226[qOff + 1] < field_226[qOff + 1 - 5]) {
               int var10002 = qOff - 5;
               var6 = 5;
               int var4i = var10002;
               var3 = qOff;

               for (int[] var13 = field_226; --var6 >= 0; var4i++) {
                  var8 = var13[var3];
                  var13[var3] = var13[var4i];
                  var13[var4i] = var8;
                  var3++;
               }

               qOff -= 5;
            }
         }

         var5[0] = var7;
         var5[1] = var2;
      }
   }

   // $VF: renamed from: a () int
   public static int method_142() {
      return field_227;
   }

   // $VF: renamed from: c () void
   public static void method_143() {
      int var0 = field_228 * 5;
      int var1;
      if (method_147(var1 = field_226[var0++]) == null) {
         int var2 = field_226[var0++];
         int var3 = field_226[var0++];
         int var4 = field_226[var0++];
         var0 = field_226[var0];
         class_16 var10 = method_144(var2, var3, var4, var0 << 10, -1);
         field_229.setElementAt(var10, var1);
      }

      if (++field_228 == field_227) {
         field_226 = null;
         field_228 = 0;
         field_227 = 0;
      }
   }

   // $VF: renamed from: a (int, int, int, int, int) k
   private static class_16 method_144(int var0, int var1, int var2, int var3, int var4) {
      if (var1 == 253) {
         return new class_16(var0);
      } else {
         byte[] var20;
         var4 = (var20 = class_37.method_601(var0))[0] << 8 | var20[1] & 255;
         int[] var7 = null;
         int var5;
         int var8;
         int var36;
         if (var1 != 254 && var1 != 255) {
            var5 = 10;
            var36 = (var20.length - 10) / var4;
            var7 = field_234[var1];
            var8 = -1;
         } else {
            var8 = var1;
            var5 = 2;
            var36 = (var20.length - 2) / var4;
            if (var1 == 254) {
               var36 /= 3;
            } else {
               var36 >>= 2;
            }
         }

         int var9 = var5;
         var8 = var8;
         int var38 = var36;
         var5 = var4;
         byte[] var24 = var20;
         int[] var21 = var7;
         int[] var12 = new int[var4 * var36];
         int var13 = 0;
         int var14 = var36;

         while (--var14 >= 0) {
            if (var8 == -1) {
               int var55 = var5;

               while (--var55 >= 0) {
                  var12[var13++] = var21[var24[var9++] & 255];
               }
            } else {
               int var15 = var5;

               while (--var15 >= 0) {
                  int var16 = (var24[var9++] & 255) << 16;
                  int var17 = (var24[var9++] & 255) << 8;
                  int var18 = var24[var9++] & 255;
                  int var19 = -16777216;
                  if (var8 == 255) {
                     var19 = (var24[var9++] & 255) << 24;
                  }

                  var12[var13++] = var19 | var16 | var17 | var18;
               }
            }
         }

         if (var3 != 1024) {
            var8 = var36;
            var1 = var5;
            int[] var22 = var12;
            int var46 = method_145(var5, var3);
            var9 = method_145(var36, var3);
            int[] var47 = new int[var46 * var9];
            var14 = 0;

            for (int var56 = 0; var56 < var9; var56++) {
               int var60 = var56 * var8 / var9 * var1;

               for (int var64 = 0; var64 < var46; var64++) {
                  var47[var14++] = var22[var60 + var64 * var1 / var46];
               }
            }

            var12 = var47;
            var5 = method_145(var5, var3);
            var38 = method_145(var36, var3);
         }

         var1 = var5;
         int[] var23 = var12;
         if (var2 != 0) {
            if ((var2 & 3) == 3) {
               var13 = 0;
               int var57 = (var14 = var5 * var38) >> 1;
               int var61 = var14 - 1;

               while (var61 >= var57) {
                  int var65 = var23[var61];
                  var23[var61--] = var23[var13];
                  var23[var13++] = var65;
               }
            } else if ((var2 & 1) != 0) {
               var13 = var5 >> 1;
               var14 = 0;

               for (int var58 = var38; --var58 >= 0; var14 += var1 - var13) {
                  int var62 = var14 + var1 - 1;
                  int var66 = var14 + var13;

                  while (var14 < var66) {
                     var5 = var23[var14];
                     var23[var14++] = var23[var62];
                     var23[var62--] = var5;
                  }
               }
            } else {
               var13 = (var38 - 1) * var5;
               var14 = (var38 >> 1) * var5;
               int var59 = var5;

               while (--var59 >= 0) {
                  int var63 = var59;
                  int var67 = var13 + var59;

                  for (int var35 = var59 + var14; var63 < var35; var67 -= var1) {
                     var36 = var23[var63];
                     var23[var63] = var23[var67];
                     var23[var67] = var36;
                     var63 += var1;
                  }
               }
            }
         }

         var2 = method_145(var4, var3);
         var3 = method_145(var36, var3);
         return new class_16(Image.createRGBImage(var12, var2, var3, var8 != 254));
      }
   }

   // $VF: renamed from: a (int, int) int
   private static int method_145(int var0, int var1) {
      int var2;
      return (var2 = var0 * var1 >> 10) > 0 ? var2 : 1;
   }

   // $VF: renamed from: a (int, boolean) int
   public static int method_146(int var0, boolean var1) {
      if (field_237 == null) {
         field_237 = new int[618];
         field_236 = new short[618];
         field_235 = new Vector(618);
      }

      int var2 = field_235.size();
      class_35 var3 = null;

      for (int var4 = 0; var4 < var2; var4++) {
         if (var0 == field_237[var4] && field_235.elementAt(var4) != null) {
            class_35 var10000 = method_148(var4);
            Object var5 = null;
            class_9 var6 = var10000.method_444().method_113();
            var3 = new class_35(var6);
            break;
         }
      }

      int var8 = 0;

      while (var8 < var2 && field_235.elementAt(var8) != null) {
         var8++;
      }

      if (var8 >= field_237.length) {
         int var9;
         int var11;
         short[] var7 = new short[var11 = (var9 = field_237.length) << 1];
         int[] var12 = new int[var11];
         System.arraycopy(field_236, 0, var7, 0, var9);
         System.arraycopy(field_237, 0, var12, 0, var9);
         field_236 = var7;
         field_237 = var12;
      }

      if (var8 == var2) {
         field_235.addElement(null);
      }

      if (field_238 == null) {
         field_238 = new Object();
      }

      if (var3 == null) {
         field_235.setElementAt(field_238, var8);
         class_9 var10 = method_136(var0, var1);
         var3 = new class_35(var10);
      }

      var3.method_451(0, -2, false);
      field_235.setElementAt(var3, var8);
      field_237[var8] = var0;
      return var8;
   }

   // $VF: renamed from: b (int) k
   public static class_16 method_147(int var0) {
      return (class_16)field_229.elementAt(var0);
   }

   // $VF: renamed from: a (int) aa
   public static class_35 method_148(int var0) {
      return (class_35)field_235.elementAt(var0);
   }

   // $VF: renamed from: a (int, int, int, int) int
   public static int method_149(int var0, int var1, int var2, int var3) {
      int var4 = method_150(var0 >>> 24, var1 >>> 24, var2, var3);
      int var5 = method_150(var0 >> 16 & 0xFF, var1 >> 16 & 0xFF, var2, var3);
      int var6 = method_150(var0 & 0xFF00, var1 & 0xFF00, var2, var3);
      var0 = method_150(var0 & 0xFF, var1 & 0xFF, var2, var3);
      return var4 << 24 | var5 << 16 | var6 & 0xFF00 | var0;
   }

   // $VF: renamed from: b (int, int, int, int) int
   public static int method_150(int var0, int var1, int var2, int var3) {
      return var0 + (var1 - var0) * var2 / var3;
   }
}
