package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: f
public final class class_21 {
   // $VF: renamed from: a int[]
   int[] field_397;
   // $VF: renamed from: b int[]
   int[] field_398;
   // $VF: renamed from: c int[]
   int[] field_399;
   // $VF: renamed from: d int[]
   int[] field_400;
   // $VF: renamed from: e int[]
   int[] field_401;
   // $VF: renamed from: f int[]
   int[] field_402;
   // $VF: renamed from: a aa[]
   class_35[] field_403;
   // $VF: renamed from: h int[]
   private int[] field_404 = new int[]{-1, 131287, 131239, 131248, 131245, 131241, 131243, 131247};
   // $VF: renamed from: g int[]
   int[] field_405 = new int[]{-1, -1, -1, 3000, 900, 900, 900, 900};
   // $VF: renamed from: b java.lang.String
   private String field_406;
   // $VF: renamed from: c java.lang.String
   private String field_407;
   // $VF: renamed from: d java.lang.String
   private String field_408;
   // $VF: renamed from: e java.lang.String
   private String field_409;
   // $VF: renamed from: f java.lang.String
   private String field_410;
   // $VF: renamed from: a int
   int field_411 = -1;
   // $VF: renamed from: a java.lang.String
   String field_412;

   public class_21() {
      this.field_397 = new int[5];
      this.field_398 = new int[5];
      this.field_399 = new int[5];
      this.field_402 = new int[5];
      this.field_401 = new int[5];
      this.field_400 = new int[5];
      this.field_403 = new class_35[this.field_404.length];

      for (int var1 = this.field_404.length - 1; var1 >= 0; var1--) {
         if (this.field_404[var1] != -1) {
            this.field_403[var1] = class_15.method_178(this.field_404[var1]);
         }
      }

      this.field_407 = class_37.method_618(74);
      this.field_408 = class_37.method_618(75);
      this.field_409 = class_37.method_618(76);
      this.field_410 = class_37.method_616(class_37.method_618(77), new String[]{"50"});
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void method_238(Graphics var1, int var2, int var3) {
      for (int var8 = 0; var8 < 5; var8++) {
         int var4;
         if ((var4 = this.field_399[var8]) != -1 && var4 >= 4 && var4 <= 7) {
            int var5 = var2 + (15 * this.field_397[var8] >> 8);
            int var6 = class_37.method_621() * 6 / 10;
            if (this.field_403[var4] != null) {
               this.field_403[var4].method_450(var1, var5, var6);
            }

            if (this.field_403[var4] != null && this.field_406 != null && this.field_406 != "") {
               int var7 = this.field_403[var4].method_446(0).field_393;
               var4 = this.field_403[var4].method_446(0).field_395;
               class_8.field_195.method_22(var1, this.field_406, var5, var6 + var7 + var4, 33);
            }
         }
      }
   }

   // $VF: renamed from: a (int, int, int, int, int) void
   public final void method_239(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 5; var6++) {
         if (this.field_399[var6] == -1) {
            if (var4 >= 4) {
               var4 = 3;
            }

            this.field_399[var6] = var3;
            this.field_397[var6] = var1;
            this.field_398[var6] = var2;
            this.field_401[var6] = var5;
            this.field_400[var6] = 0;
            this.field_402[var6] = var4;
            if (this.field_403[var3] != null) {
               this.field_403[var3].method_451(0, 1, true);
            }

            switch (var3) {
               case 4:
                  this.field_406 = this.field_407;
                  return;
               case 5:
                  this.field_406 = this.field_408;
                  return;
               case 6:
                  this.field_406 = this.field_409;
                  return;
               case 7:
                  this.field_406 = this.field_410;
               default:
                  return;
            }
         }
      }
   }
}
