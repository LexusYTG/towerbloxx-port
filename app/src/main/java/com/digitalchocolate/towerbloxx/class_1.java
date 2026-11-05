package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: z
public final class class_1 {
   // $VF: renamed from: a aa[]
   private class_35[] field_29;
   // $VF: renamed from: b int[]
   private static final int[] field_30 = new int[]{131225, 131199, 131223, 131198, -1, -1};
   // $VF: renamed from: a int[]
   public static final int[] field_31 = new int[]{1000, 500, 505, 515, 525, 530};
   // $VF: renamed from: a int
   private int field_32;
   // $VF: renamed from: b int
   private int field_33;
   // $VF: renamed from: c int
   private int field_34;
   // $VF: renamed from: d int
   private int field_35 = 5;
   // $VF: renamed from: c int[]
   private int[] field_36;
   // $VF: renamed from: d int[]
   private static final int[] field_37 = new int[]{12116991, 5620223, 4548312, 1712458, 1249337};

   class_1() {
      this.field_29 = new class_35[field_30.length];

      for (int var1 = 0; var1 < field_30.length; var1++) {
         if (var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3) {
            if (var1 == 5) {
            }
         } else if (class_18.method_216() != 0 || field_30[var1] != -1 && field_30[var1] != -1) {
            this.field_29[var1] = class_15.method_178(field_30[var1]);
         }
      }

      class_20 var10001 = this.field_29[0].method_446(0);
      class_20 var3 = null;
      this.field_32 = var10001.field_393;
      this.field_33 = this.field_29[0].method_446(0).field_395;
      this.field_36 = new int[this.field_35];
      class_35 var4 = class_15.method_178(131235);

      for (int var2 = 0; var2 < this.field_35; var2++) {
         if ((var3 = var4.method_446(var2)) == null) {
            this.field_36[var2] = -1;
         } else {
            this.field_36[var2] = -var3.field_393;
         }
      }
   }

   // $VF: renamed from: a () void
   public final void method_10() {
      this.field_36 = null;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
   public final void method_11(Graphics var1, int var2, int var3, int var4) {
      System.currentTimeMillis();
      int var5 = class_37.method_608();
      int var6 = class_37.method_621();
      int var7 = var3 - (15 * (0 - var4) >> 8);
      int var10000 = (var6 >> 1) - this.field_36[this.field_35 - 1] + var7;
      int var8 = 0;
      if (var10000 >= 0) {
         var1.setColor(field_37[this.field_35 - 2]);
         var1.fillRect(0, 0, var5, var6);
      }

      for (int var9 = 0; var9 < this.field_35 - 1; var9++) {
         var8 = var7 - this.field_36[var9 + 1];
         int var10 = var7 - this.field_36[var9];
         if (var8 < var6 && var10 >= 0) {
            class_22.method_262(var1, 0, var8, var5, var10 - var8, field_37[var9 + 1], field_37[var9], 5);
         }
      }

      for (int var12 = field_30.length - 1; var12 >= 0; var12--) {
         if (this.field_29[var12] != null) {
            int var13 = var3 - (15 * (-this.field_34 + (this.field_34 - var4) * (field_31[var12] - 50) / 1000) >> 8);
            this.field_29[var12].method_450(var1, var2, var13);
         }
      }
   }

   // $VF: renamed from: a (int) int
   public final int method_12(int var1) {
      for (int var2 = field_30.length - 1; var2 >= 0; var2--) {
         if (this.field_29[var2] != null) {
            this.field_29[var2].method_448(var1);
         }
      }

      return -1;
   }

   // $VF: renamed from: a () int
   public final int method_13() {
      return -this.field_32;
   }

   // $VF: renamed from: b () int
   public final int method_14() {
      return (-this.field_32 << 8) / 15;
   }

   // $VF: renamed from: c () int
   public final int method_15() {
      return this.field_33;
   }

   // $VF: renamed from: d () int
   public final int method_16() {
      return (this.field_33 << 8) / 15;
   }

   // $VF: renamed from: a (int) void
   public final void method_17(int var1) {
      this.field_34 = var1;
   }

   // $VF: renamed from: e () int
   public final int method_18() {
      return this.field_34;
   }
}
