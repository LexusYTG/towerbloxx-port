package com.digitalchocolate.towerbloxx;
// $VF: renamed from: r
public final class class_9 {
   // $VF: renamed from: a int
   private int field_203;
   // $VF: renamed from: b int
   private int field_204;
   // $VF: renamed from: c int
   private int field_205;
   // $VF: renamed from: d int
   private int field_206;
   // $VF: renamed from: a ae[]
   private class_32[] field_207;
   // $VF: renamed from: a int[]
   private int[] field_208;
   // $VF: renamed from: b int[]
   private int[] field_209;
   // $VF: renamed from: c int[]
   private int[] field_210;
   // $VF: renamed from: e int
   private int field_211 = Integer.MAX_VALUE;
   // $VF: renamed from: a boolean
   private boolean field_212;
   // $VF: renamed from: b boolean
   private boolean field_213;
   // $VF: renamed from: a d[]
   private class_23[] field_214;
   // $VF: renamed from: f int
   private int field_215;
   // $VF: renamed from: g int
   private int field_216;
   // $VF: renamed from: h int
   private int field_217;
   // $VF: renamed from: i int
   private int field_218;
   // $VF: renamed from: c boolean
   private boolean field_219 = true;
   // $VF: renamed from: j int
   private int field_220;
   // $VF: renamed from: d int[]
   private static final int[] field_221 = new int[1];
   // $VF: renamed from: e int[]
   private static final int[] field_222 = new int[]{Integer.MAX_VALUE};
   // $VF: renamed from: b ae[]
   private static class_32[] field_223;

   // $VF: renamed from: a () r
   public final class_9 method_113() {
      class_9 var1;
      (var1 = new class_9()).field_208 = this.field_208;
      var1.field_209 = this.field_209;
      var1.field_210 = this.field_210;
      var1.field_212 = this.field_212;
      var1.field_211 = this.field_211;
      var1.field_213 = this.field_213;
      var1.field_203 = this.field_203;
      var1.field_204 = this.field_204;
      var1.field_205 = this.field_205;
      var1.field_206 = this.field_206;
      var1.field_220 = this.field_220;
      var1.field_215 = this.field_215;
      var1.field_216 = this.field_216;
      var1.field_217 = this.field_217;
      var1.field_218 = this.field_218;
      var1.field_214 = this.field_214;
      var1.field_219 = this.field_219;
      int var2 = this.field_207.length;
      var1.field_207 = new class_32[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         if (!this.method_129(var3)) {
            var1.field_207[var3] = this.field_207[var3].method_423(var1);
         }
      }

      if (var2 > 1) {
         for (int var5 = 0; var5 < var2; var5++) {
            int var4 = this.field_210[var5];
            if (this.method_129(var5)) {
               var1.field_207[var5] = var1.field_207[var4];
            }
         }
      }

      return var1;
   }

   private class_9() {
   }

   public class_9(int var1, boolean var2) {
      if (var1 == -1) {
         if (field_223 == null) {
            (field_223 = new class_32[1])[0] = new class_32(true, this);
         }

         this.field_207 = field_223;
         this.field_208 = field_222;
         this.field_210 = field_221;
         this.field_209 = field_221;
      } else {
         if (!var2) {
            class_10.method_135();
         }

         int var3;
         class_24 var10;
         boolean var4 = ((var3 = (var10 = class_37.method_627(var1)).method_285()) & 1) == 0;
         boolean var12 = (var3 & 2) == 0;
         int var5 = var10.method_285();
         this.field_208 = new int[var5];
         this.field_209 = new int[var5];
         if (var5 > 1) {
            this.field_210 = new int[var5];
         }

         this.field_207 = new class_32[var5];
         this.field_212 = var10.method_283();
         this.field_213 = var10.method_283();
         if (var4) {
            this.field_203 = var10.method_284();
            this.field_204 = var10.method_284();
            this.field_205 = var10.method_285();
            this.field_206 = var10.method_285();
         } else {
            this.field_203 = var10.method_286();
            this.field_204 = var10.method_286();
            this.field_205 = var10.method_286();
            this.field_206 = var10.method_286();
         }

         this.field_220 = var10.method_285();

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = var10.method_285();
            if (var5 > 1) {
               this.field_210[var6] = var7;
            }

            if (!this.method_129(var6)) {
               this.field_207[var6] = new class_32(false, this);
            }
         }

         boolean var13 = false;
         int var14 = 0;

         for (int var8 = 0; var8 < var5; var8++) {
            int var9;
            if (var12) {
               var9 = var10.method_285();
            } else {
               var9 = var10.method_286() & '\uffff';
            }

            if (var9 == 0) {
               var9 = Integer.MAX_VALUE;
               var13 = true;
            }

            this.field_208[var8] = var9;
            this.field_209[var8] = var14;
            var14 += var9;
         }

         if (!var13) {
            this.field_211 = this.field_209[var5 - 1] + this.field_208[var5 - 1];
         }

         boolean var15 = var10.method_283();
         this.field_215 = this.field_203;
         this.field_216 = this.field_204;
         this.field_217 = this.field_205;
         this.field_218 = this.field_206;
         if (var15) {
            if (var4) {
               this.field_215 = var10.method_284();
               this.field_216 = var10.method_284();
               this.field_217 = var10.method_285();
               this.field_218 = var10.method_285();
            } else {
               this.field_215 = var10.method_286();
               this.field_216 = var10.method_286();
               this.field_217 = var10.method_286();
               this.field_218 = var10.method_286();
            }

            this.field_214 = new class_23[6];

            for (int var16 = 0; var16 < 6; var16++) {
               this.field_214[var16] = new class_23(var16, this.field_211);
               this.field_214[var16].method_274(var10, var4);
            }
         }

         for (int var17 = 0; var17 < var5; var17++) {
            if (!this.method_129(var17)) {
               this.field_207[var17].method_424(var10, var4, var2);
            }
         }

         if (var5 > 1) {
            for (int var18 = 0; var18 < var5; var18++) {
               var1 = this.field_210[var18];
               if (this.method_129(var18)) {
                  this.field_207[var18] = this.field_207[var1];
               }
            }
         }
      }
   }

   // $VF: renamed from: a () int
   public final int method_114() {
      return this.field_203;
   }

   // $VF: renamed from: b () int
   public final int method_115() {
      return this.field_204;
   }

   // $VF: renamed from: c () int
   public final int method_116() {
      return this.field_205;
   }

   // $VF: renamed from: d () int
   public final int method_117() {
      return this.field_206;
   }

   // $VF: renamed from: e () int
   public final int method_118() {
      return this.field_215;
   }

   // $VF: renamed from: f () int
   public final int method_119() {
      return this.field_216;
   }

   // $VF: renamed from: g () int
   public final int method_120() {
      return this.field_217;
   }

   // $VF: renamed from: h () int
   public final int method_121() {
      return this.field_218;
   }

   // $VF: renamed from: i () int
   public final int method_122() {
      return this.field_207.length;
   }

   // $VF: renamed from: a () boolean
   public final boolean method_123() {
      return this.field_212;
   }

   // $VF: renamed from: j () int
   public final int method_124() {
      return this.field_211;
   }

   // $VF: renamed from: a (int) int
   public final int method_125(int var1) {
      return this.field_209[var1];
   }

   // $VF: renamed from: b (int) int
   public final int method_126(int var1) {
      return this.field_208[var1];
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_127(int var1, int var2, int var3) {
      int var4 = var3;
      Object var6 = null;
      int var5 = this.field_211;
      if (var3 >= var5) {
         var4 = var3 % var5;
      }

      var5 = var4;
      var6 = this;
      int var7 = this.field_208.length;

      int var10000;
      while (true) {
         if (--var7 >= 0) {
            if (var5 < ((class_9)var6).field_209[var7]) {
               continue;
            }

            var10000 = var7;
            break;
         }

         var10000 = -1;
         break;
      }

      var5 = var10000;
      if (!this.field_213) {
         var3 = var4 - this.field_209[var5];
      }

      this.field_207[var5].method_425(var1, var2, var3);
   }

   // $VF: renamed from: a (int) ae
   public final class_32 method_128(int var1) {
      return this.field_207[var1];
   }

   // $VF: renamed from: a (int) boolean
   private boolean method_129(int var1) {
      return this.field_207.length > 1 && this.field_210[var1] != 255;
   }

   // $VF: renamed from: a (int, int, boolean) int
   public final int method_130(int var1, int var2, boolean var3) {
      return this.field_214[var1].method_275(var2, var3);
   }

   // $VF: renamed from: b () boolean
   public final boolean method_131() {
      if (this.field_214 != null) {
         int var1 = 6;

         while (--var1 >= 0) {
            if (this.field_214[var1].method_276() > 0) {
               return true;
            }
         }
      }

      return false;
   }

   // $VF: renamed from: a () void
   public final void method_132() {
      int var1 = this.field_207.length;

      while (--var1 >= 0) {
         this.field_207[var1].method_431();
      }
   }

   // $VF: renamed from: c () boolean
   public final boolean method_133() {
      return this.field_219;
   }
}
