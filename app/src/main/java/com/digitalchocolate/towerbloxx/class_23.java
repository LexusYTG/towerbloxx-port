package com.digitalchocolate.towerbloxx;
// $VF: renamed from: d
public final class class_23 {
   // $VF: renamed from: a int
   private int field_526;
   // $VF: renamed from: a int[]
   private int[] field_527;
   // $VF: renamed from: b int[]
   private int[] field_528;
   // $VF: renamed from: c int[]
   private int[] field_529;
   // $VF: renamed from: b int
   private int field_530;
   // $VF: renamed from: d int[]
   private static final int[] field_531 = new int[0];

   public class_23(int var1, int var2) {
      this.field_526 = var1;
      this.field_530 = var2;
   }

   // $VF: renamed from: a (c, boolean) void
   public final void method_274(class_24 var1, boolean var2) {
      int var3;
      if ((var3 = var1.method_285()) == 0) {
         this.field_527 = field_531;
         this.field_528 = field_531;
         this.field_529 = field_531;
      } else {
         this.field_527 = new int[var3];
         this.field_528 = new int[var3];
         this.field_529 = new int[var3];
      }

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var1.method_287();
         this.field_528[var4] = var5;
         this.field_529[var4] = var1.method_285();
         var5 = -1;
         if (this.field_526 == 0 || this.field_526 == 3 || this.field_526 == 4) {
            var5 = var1.method_287();
         } else if (this.field_526 != 1 && this.field_526 != 2) {
            if (this.field_526 == 5) {
               var5 = var1.method_287();
            }
         } else if (var2) {
            var5 = var1.method_284();
         } else {
            var5 = var1.method_286();
         }

         this.field_527[var4] = var5;
      }
   }

   // $VF: renamed from: a (int, boolean) int
   public final int method_275(int var1, boolean var2) {
      if (this.field_528.length == 0) {
         if (this.field_526 == 0) {
            return -8355712;
         } else {
            return this.field_526 != 3 && this.field_526 != 4 ? 0 : 1024;
         }
      } else {
         int var4 = var1;
         class_23 var3 = this;
         int var5 = this.field_528.length;

         int var10000;
         while (true) {
            if (--var5 >= 0) {
               if (var4 < var3.field_528[var5]) {
                  continue;
               }

               var10000 = var5;
               break;
            }

            var10000 = -1;
            break;
         }

         int var15 = var10000;
         if (this.field_529[var15] == 1) {
            return this.field_527[var15];
         } else {
            var1 -= this.field_528[var15];
            if ((var5 = var15 + 1) == this.field_528.length) {
               if (!var2) {
                  return this.field_527[var15];
               }

               var5 = 0;
               var4 = this.field_530 - this.field_528[var15];
            } else {
               var4 = this.field_528[var5] - this.field_528[var15];
            }

            int var2i = this.field_527[var15];
            var5 = this.field_527[var5];
            if (this.field_529[var15] == 0) {
               return this.field_526 == 0 ? class_10.method_149(var2i, var5, var1, var4) : class_10.method_150(var2i, var5, var1, var4);
            } else if (this.field_529[var15] == 2) {
               if (this.field_526 == 0) {
                  int var9 = method_277(var2i >>> 24, var5 >>> 24, var1, var4);
                  int var18 = method_277(var2i >> 16 & 0xFF, var5 >> 16 & 0xFF, var1, var4);
                  int var23 = method_277(var2i >> 8 & 0xFF, var5 >> 8 & 0xFF, var1, var4);
                  var1 = method_277(var2i & 0xFF, var5 & 0xFF, var1, var4);
                  return var9 << 24 | var18 << 16 | var23 << 8 | var1;
               } else {
                  return method_277(var2i, var5, var1, var4);
               }
            } else if (this.field_529[var15] == 3) {
               if (this.field_526 == 0) {
                  int var8 = method_278(var2i >>> 24, var5 >>> 24, var1, var4);
                  int var17 = method_278(var2i >> 16 & 0xFF, var5 >> 16 & 0xFF, var1, var4);
                  int var22 = method_278(var2i >> 8 & 0xFF, var5 >> 8 & 0xFF, var1, var4);
                  var1 = method_278(var2i & 0xFF, var5 & 0xFF, var1, var4);
                  return var8 << 24 | var17 << 16 | var22 << 8 | var1;
               } else {
                  return method_278(var2i, var5, var1, var4);
               }
            } else if (this.field_529[var15] == 4) {
               if (this.field_526 == 0) {
                  int var7 = method_279(var2i >>> 24, var5 >>> 24, var1, var4);
                  int var16 = method_279(var2i >> 16 & 0xFF, var5 >> 16 & 0xFF, var1, var4);
                  int var6 = method_279(var2i >> 8 & 0xFF, var5 >> 8 & 0xFF, var1, var4);
                  var1 = method_279(var2i & 0xFF, var5 & 0xFF, var1, var4);
                  return var7 << 24 | var16 << 16 | var6 << 8 | var1;
               } else {
                  return method_279(var2i, var5, var1, var4);
               }
            } else {
               return -1;
            }
         }
      }
   }

   // $VF: renamed from: a () int
   public final int method_276() {
      return this.field_528.length;
   }

   // $VF: renamed from: a (int, int, int, int) int
   private static int method_277(int var0, int var1, int var2, int var3) {
      return (var1 - var0) * (var2 * var2 / var3) / var3 + var0;
   }

   // $VF: renamed from: b (int, int, int, int) int
   private static int method_278(int var0, int var1, int var2, int var3) {
      return -(var1 - var0) * var2 / var3 * (var2 - (var3 << 1)) / var3 + var0;
   }

   // $VF: renamed from: c (int, int, int, int) int
   private static int method_279(int var0, int var1, int var2, int var3) {
      if ((var2 = var2 << 1) < var3) {
         return (var1 - var0 >> 1) * (var2 * var2 / var3) / var3 + var0;
      } else {
         var2 -= var3;
         return -(var1 - var0 >> 1) * (var2 * (var2 - (var3 << 1)) / var3 - var3) / var3 + var0;
      }
   }
}
