package com.digitalchocolate.towerbloxx;
// $VF: renamed from: p
public final class class_11 {
   // $VF: renamed from: a int
   int field_239;
   // $VF: renamed from: b int
   int field_240;
   // $VF: renamed from: a aa
   class_35 field_241;
   // $VF: renamed from: b aa
   class_35 field_242;
   // $VF: renamed from: c int
   int field_243;
   // $VF: renamed from: d int
   int field_244;
   // $VF: renamed from: e int
   int field_245;
   // $VF: renamed from: f int
   int field_246;
   // $VF: renamed from: g int
   int field_247;
   // $VF: renamed from: a int[]
   int[] field_248;

   public class_11(int var1) {
      this.field_240 = var1;
      this.field_242 = class_15.method_178(131237);
      this.field_241 = class_15.method_178(131238);
   }

   // $VF: renamed from: a (int) boolean
   public final boolean method_151(int var1) {
      boolean var2 = false;

      while (this.field_239 != -1 && var1 >= class_17.field_312[this.field_240][this.field_239]) {
         var2 = true;
         this.field_239++;
         if (this.field_239 == class_17.field_312[this.field_240].length) {
            this.field_239 = -1;
         }
      }

      return var2;
   }

   // $VF: renamed from: a (int, int, int, int, int, int[]) void
   public final void method_152(int var1, int var2, int var3, int var4, int var5, int[] var6) {
      this.field_243 = var1;
      this.field_244 = var2;
      this.field_245 = var3;
      this.field_246 = var4;
      this.field_247 = var5;
      this.field_248 = var6;
   }
}
