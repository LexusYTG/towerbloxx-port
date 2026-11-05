package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: n
public final class class_13 {
   // $VF: renamed from: a aa[]
   private class_35[] field_258;
   // $VF: renamed from: a aa
   private class_35 field_259;
   // $VF: renamed from: a int
   private int field_260;
   // $VF: renamed from: b int
   private int field_261;
   // $VF: renamed from: c int
   private int field_262;
   // $VF: renamed from: d int
   private int field_263;
   // $VF: renamed from: e int
   private int field_264;
   // $VF: renamed from: f int
   private int field_265;
   // $VF: renamed from: g int
   private int field_266;
   // $VF: renamed from: h int
   private int field_267;
   // $VF: renamed from: i int
   private int field_268;
   // $VF: renamed from: j int
   private int field_269;
   // $VF: renamed from: k int
   private int field_270;
   // $VF: renamed from: l int
   private static int field_271;
   // $VF: renamed from: m int
   private int field_272;
   // $VF: renamed from: a int[]
   private static final int[] field_273 = new int[]{131228, 131216, 131618, 131619};
   // $VF: renamed from: b int[]
   private static final int[] field_274 = new int[]{2000, 2000, 3000, 3000, 3000};
   // $VF: renamed from: a int[][]
   private static final int[][] field_275 = new int[][]{
      {-1000, -1000, -500, 250, -250, 333, 0, 500, 333, 700},
      {1000, -1000, 500, 250, 250, 333, 0, 500, -333, 700},
      {-1000, -166, -500, 0, 250, 333, 0, 500, -333, 700},
      {1000, -166, 500, 0, -250, 333, 0, 500, 333, 700},
      {0, -166, 0, 0, -250, 500, 250, 1000, -250, 1300}
   };

   class_13() {
      this.field_258 = new class_35[field_273.length];

      for (int var1 = field_273.length - 1; var1 >= 0; var1--) {
         this.field_258[var1] = class_15.method_178(field_273[var1]);
      }

      this.field_259 = class_15.method_178(131200);
      this.method_166(0, false);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   public final void method_164(Graphics var1, int var2, int var3, int var4, int var5) {
      if (this.field_272 != 0) {
         var2 = var2 + this.field_261 + (15 * this.field_263 >> 8);
         var3 = var3 + this.field_262 - (15 * (this.field_264 - var5) >> 8);
         if (this.field_272 == 4) {
            this.field_259.method_450(var1, var2, var3);
         } else {
            this.field_258[this.field_265].method_450(var1, var2, var3);
         }
      }
   }

   // $VF: renamed from: a (int, int, af[]) void
   public final void method_165(int var1, int var2, class_31[] var3) {
      if (this.field_272 != 0) {
         this.field_269 += var1;
         this.field_258[this.field_265].method_448(var1);
         if (this.field_272 == 4) {
            this.field_260 += var1;
            if (this.field_260 >= 1000) {
               this.method_166(0, false);
            } else {
               this.field_259.method_447(this.field_260);
            }
         } else {
            if (this.field_272 == 1 || this.field_272 == 5) {
               int var4 = this.field_270;
               int var5 = this.field_268;
               if (this.field_272 == 1 && var5 > var2) {
                  this.field_269 = 0;
                  this.method_166(2, false);
                  return;
               }

               if (this.field_269 >= field_274[var4]) {
                  if (this.field_272 == 5) {
                     this.method_166(0, false);
                     return;
                  }

                  this.method_166(4, false);
                  return;
               }

               int var6 = (this.field_269 * (field_275[var4].length - 6) / 2 << 8) / field_274[var4];

               int var7;
               for (var7 = 0; var6 > 256; var7 += 2) {
                  var6 -= 256;
               }

               var2 = Math.min(4, var2 - 1) - (var2 - var5);
               var5 = 0;
               if (var2 < var3.length && var2 >= 0) {
                  var5 = 15 * var3[var2].method_396();
               }

               int var12 = (var2 = var6 * var6 >> 8) * var6 >> 8;
               int[] var13 = field_275[var4];
               int var8 = class_37.method_608();
               int var9 = class_37.method_621();
               this.field_266 = this.field_261;
               this.field_267 = this.field_262;
               this.field_261 = class_7.method_65(
                  var13[var7] * var8 / 1000, var13[var7 + 2] * var8 / 1000, var13[var7 + 4] * var8 / 1000, var13[var7 + 6] * var8 / 1000, var6, var2, var12
               );
               var7++;
               this.field_262 = class_7.method_65(
                  var13[var7] * var9 / 1000, var13[var7 + 2] * var9 / 1000, var13[var7 + 4] * var9 / 1000, var13[var7 + 6] * var9 / 1000, var6, var2, var12
               );
               this.field_266 = (this.field_261 - this.field_266) * 1000 / var1;
               this.field_267 = (this.field_262 - this.field_267) * 1000 / var1;
               if (var7 > 2) {
                  this.field_261 += var5 * var6 >> 8 >> 8;
                  return;
               }
            } else if (this.field_272 == 2) {
               this.field_269 += var1;
               this.field_261 = this.field_261 + this.field_266 * var1 / 1000;
               this.field_267 = 150;
               this.field_262 = this.field_262 + this.field_267 * var1 / 1000;
               if (this.field_269 > 4000) {
                  this.method_166(0, false);
               }
            }
         }
      }
   }

   // $VF: renamed from: a (int, boolean) void
   public final void method_166(int var1, boolean var2) {
      if (var1 == 1 && var2) {
         this.field_265 = class_7.method_63(field_273.length);
         this.field_258[this.field_265].method_451(0, -1, false);
      } else if (var1 == 4) {
         this.field_260 = 0;
         this.field_269 = 0;
      }

      this.field_272 = var1;
   }

   // $VF: renamed from: a () int
   public final int method_167() {
      return this.field_272;
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_168(int var1, int var2, int var3) {
      if (++field_271 >= 4) {
         field_271 = 0;
      }

      this.field_263 = 0;
      this.field_264 = var3 + ((class_37.method_621() << 1) / 3 / 15 << 8) - class_26.field_570 / 2;
      this.field_268 = var1 + 1;
      this.method_166(1, true);
      this.field_269 = 0;
      this.field_270 = field_271;
   }

   // $VF: renamed from: a (int, int) void
   public final void method_169(int var1, int var2) {
      this.field_263 = 0;
      this.field_264 = var2;
      this.method_166(5, false);
      this.field_269 = 0;
      this.field_270 = 4;
   }
}
