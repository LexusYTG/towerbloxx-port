package com.digitalchocolate.towerbloxx;
// $VF: renamed from: ah
public final class class_30 {
   // $VF: renamed from: a int[]
   private static int[] field_711;
   // $VF: renamed from: a int
   private static int field_712;

   // $VF: renamed from: a (int) int
   public static final int method_387(int var0) {
      if (field_711 == null) {
         field_711 = new int[256];
         int var1 = 0;
         int var2 = 32768;

         int var3;
         for (var3 = 0; var3 < 64; var3++) {
            field_711[var3] = var1;
            var2 -= var1 * 804 >> 15;
            var1 += var2 * 804 >> 15;
         }

         for (field_711[var3++] = 32768; var3 <= 128; var3++) {
            field_711[var3] = field_711[64 - (var3 - 64)];
         }

         while (var3 < 256) {
            field_711[var3] = -field_711[var3 - 128];
            var3++;
         }
      }

      int var5 = var0 & 0xFF;
      var0 >>= 8;
      return field_711[var0 + 1 & 0xFF] * var5 + field_711[var0 & 0xFF] * (256 - var5) >> 8;
   }

   // $VF: renamed from: b (int) int
   public static final int method_388(int var0) {
      return method_387(var0 + 16384);
   }

   // $VF: renamed from: c (int) int
   public static final int method_389(int var0) {
      int var1 = 0;
      field_712 = var1 = field_712 * 1103515245 + 12345;
      return (var1 >>> 15) * var0 >>> 17;
   }
}
