package com.digitalchocolate.towerbloxx;
// $VF: renamed from: m
public final class class_14 implements Runnable {
   // $VF: renamed from: a e
   class_22 field_276;
   // $VF: renamed from: a e[]
   private class_22[] field_277;
   // $VF: renamed from: a java.lang.String
   private String field_278;
   // $VF: renamed from: a int
   int field_279 = 0;
   // $VF: renamed from: b int
   int field_280;
   // $VF: renamed from: c int
   int field_281;
   // $VF: renamed from: a boolean
   boolean field_282;
   // $VF: renamed from: d int
   private int field_283;
   // $VF: renamed from: e int
   private int field_284;
   // $VF: renamed from: d boolean
   private boolean field_285;
   // $VF: renamed from: b boolean
   boolean field_286;
   // $VF: renamed from: c boolean
   boolean field_287;

   public class_14() {
      this.field_278 = class_37.method_622(10);
      this.field_286 = this.field_278 != null;
      this.field_285 = !"nolink".equals(this.field_278);
      String var1;
      if ((var1 = class_37.method_622(11)) != null) {
         this.field_281 = Integer.parseInt(var1) * 1000;
      }

      if ((var1 = class_37.method_622(12)) != null) {
         this.field_284 = Integer.parseInt(var1);
         if (this.field_284 != 0) {
            byte[] var3;
            if ((var3 = class_37.method_636("pc")) != null) {
               this.field_283 = var3[0];
            } else {
               var3 = new byte[1];
            }

            this.field_283++;
            var3[0] = (byte)this.field_283;
            class_37.method_619("pc", var3, 1);
            if (this.field_283 > this.field_284) {
               this.field_279 = 1;
            }
         }
      }
   }

   // $VF: renamed from: a (int) boolean
   public final boolean method_170(int var1) {
      if (!this.field_286) {
         return false;
      } else if (var1 == 2) {
         class_37.method_635();
         if (this.field_283 > this.field_284) {
            this.field_279 = 1;
         } else {
            this.field_279 = 0;
         }

         return true;
      } else if (var1 == 4) {
         this.field_282 = false;
         this.field_279 = 2;
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (int) int
   public final int method_171(int var1) {
      if (!this.field_286) {
         return 2;
      } else if (this.field_287) {
         return 0;
      } else {
         byte var2 = 0;
         if (this.field_277 == null) {
            this.method_172();
         }

         if (this.field_276 != null && this.field_276 == this.field_277[this.field_279]) {
            int[] var4;
            if ((var4 = this.field_276.method_255(var1)) != null) {
               if (var4[1] == 1) {
                  this.field_282 = true;
                  var2 = 4;
               } else if (var4[1] == 24) {
                  class_0.method_6(this.field_278);
                  this.field_287 = true;
               } else if (var4[1] == 5) {
                  this.field_282 = true;
                  var2 = 4;
               } else if (var4[1] == 6) {
                  this.field_287 = true;
               }
            }
         } else {
            this.field_276 = this.field_277[this.field_279];
            this.field_276.method_254();
         }

         if (var2 != 0) {
            this.field_279 = 0;
            class_37.method_629();
            this.field_276 = null;
            this.field_277 = null;
         }

         if (this.field_287) {
            try {
               class_0.field_10.destroyApp(false);
            } catch (Exception var3) {
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: run () void
   public final void run() {
   }

   // $VF: renamed from: a () void
   public final void method_172() {
      String var1 = class_37.method_618(138);
      String var2;
      if (this.field_284 > 0) {
         var1 = var1 + "\\n" + class_37.method_616(class_37.method_618(139), new String[]{"" + (this.field_284 - this.field_283 + 1)});
         if (this.field_283 > this.field_284) {
            var2 = class_37.method_618(140);
         } else {
            var2 = class_37.method_618(141);
         }
      } else {
         var2 = class_37.method_618(141);
      }

      String var3;
      if (this.field_285) {
         class_37.method_637(24, 142, null, 0);
         var2 = var2 + "\\n" + class_37.method_618(143);
         var3 = class_37.method_618(144);
      } else {
         var3 = class_37.method_618(145);
         var2 = var2 + "\\n" + var3;
      }

      this.field_277 = new class_22[3];
      String var4 = class_37.method_618(146);
      this.field_277[0] = new class_22();
      this.field_277[0].method_240(1, 2, 0);
      this.field_277[0].method_242(var4, null, 1);
      this.field_277[0].method_244(1, 1, var1, null, 0);
      class_22 var10000 = this.field_277[0];
      int var5 = 0;
      boolean var6 = false;
      var10000.field_477[0] = 1;
      var10000 = this.field_277[0];
      int var10001 = class_37.method_608();
      var5 = class_37.method_621();
      var10000.method_252(var10001, var5, false);
      this.field_277[1] = new class_22();
      this.field_277[1].method_240(1, 2, 0);
      this.field_277[1].method_242(var4, null, 1);
      this.field_277[1].method_244(1, 1, var2, null, 0);
      if (this.field_285) {
         this.field_277[1].field_477[0] = 24;
      }

      this.field_277[1].field_477[1] = 6;
      var10000 = this.field_277[1];
      var10001 = class_37.method_608();
      var5 = class_37.method_621();
      var10000.method_252(var10001, var5, false);
      this.field_277[2] = new class_22();
      this.field_277[2].method_240(1, 2, 0);
      this.field_277[2].method_242(var4, null, 1);
      this.field_277[2].method_244(1, 1, var3, null, 0);
      if (this.field_285) {
         this.field_277[2].field_477[0] = 24;
      }

      if (this.field_283 > this.field_284) {
         this.field_277[2].field_477[1] = 6;
      } else {
         this.field_277[2].field_477[1] = 5;
      }

      var10000 = this.field_277[2];
      var10001 = class_37.method_608();
      var5 = class_37.method_621();
      var10000.method_252(var10001, var5, false);
   }

   // $VF: renamed from: a () java.lang.String
   public final String method_173() {
      return !this.field_286 ? null : class_37.method_618(45);
   }

   // $VF: renamed from: a () int
   public final int method_174() {
      return this.field_286 ? 4 : 2;
   }
}
