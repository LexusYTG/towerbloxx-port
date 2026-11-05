package com.digitalchocolate.towerbloxx;
// $VF: renamed from: h
public final class class_19 {
   // $VF: renamed from: a (int, int) int
   public static final int method_234(int var0, int var1) {
      return (int)(((long)var0 << 12) / var1);
   }

   // $VF: renamed from: b (int, int) int
   public static final int method_235(int var0, int var1) {
      return (int)((long)var0 * var1 >> 12);
   }

   // $VF: renamed from: c (int, int) int
   public static final int method_236(int var0, int var1) {
      return method_234(var0 << 12, var1 << 12);
   }

   // $VF: renamed from: d (int, int) int
   public static final int method_237(int var0, int var1) {
      return var1 > 0 ? var0 << Math.abs(var1) : var0 >> Math.abs(var1);
   }
}
