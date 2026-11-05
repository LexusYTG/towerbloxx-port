package com.digitalchocolate.towerbloxx;
// $VF: renamed from: x
public final class class_3 {
   // $VF: renamed from: a x
   private static class_3 field_52 = null;
   // $VF: renamed from: a int[]
   private int[] field_53 = new int[26];

   protected class_3() {
      this.method_26();
   }

   // $VF: renamed from: a () x
   public static class_3 method_25() {
      if (field_52 == null) {
         field_52 = new class_3();
      }

      return field_52;
   }

   // $VF: renamed from: a () void
   public final void method_26() {
      this.field_53[0] = 0;
      this.field_53[1] = 0;
   }

   // $VF: renamed from: a (c) c
   public final class_24 method_27(class_24 var1) {
      var1.method_290(this.field_53.length);

      for (int var2 = 0; var2 < this.field_53.length; var2++) {
         var1.method_290(this.field_53[var2]);
      }

      return var1;
   }

   // $VF: renamed from: b (c) c
   public final class_24 method_28(class_24 var1) {
      this.field_53 = new int[var1.method_287()];

      for (int var2 = 0; var2 < this.field_53.length; var2++) {
         this.field_53[var2] = var1.method_287();
      }

      return var1;
   }

   // $VF: renamed from: a (int, int) void
   public final void method_29(int var1, int var2) {
      this.field_53[var1] = var2;
   }

   // $VF: renamed from: a (int) int
   public final int method_30(int var1) {
      return this.field_53[var1];
   }

   // $VF: renamed from: a (int[], int, int, int, int) void
   public final void method_31(int[] var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < var1.length; var6++) {
         int var10001 = var6 + 6;
         int var8 = var1[var6];
         int var7 = var10001;
         this.field_53[var7] = var8;
      }

      this.field_53[0] = var3;
      this.field_53[1] = var2;
      this.field_53[4] = var4;
      this.field_53[5] = var5;
   }
}
