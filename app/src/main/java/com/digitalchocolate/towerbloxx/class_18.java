package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: i
public final class class_18 {
   // $VF: renamed from: a s
   private class_8 field_313;
   // $VF: renamed from: a y
   private static class_2 field_314;
   // $VF: renamed from: b y
   private static class_2 field_315;
   // $VF: renamed from: b boolean
   private boolean field_316;
   // $VF: renamed from: a int
   private int field_317;
   // $VF: renamed from: c boolean
   private boolean field_318;
   // $VF: renamed from: d boolean
   private boolean field_319;
   // $VF: renamed from: e boolean
   private boolean field_320;
   // $VF: renamed from: f boolean
   private boolean field_321;
   // $VF: renamed from: g boolean
   private boolean field_322;
   // $VF: renamed from: h boolean
   private boolean field_323;
   // $VF: renamed from: b int
   private int field_324 = -1;
   // $VF: renamed from: c int
   private int field_325;
   // $VF: renamed from: d int
   private int field_326;
   // $VF: renamed from: e int
   private int field_327;
   // $VF: renamed from: f int
   private int field_328;
   // $VF: renamed from: g int
   private int field_329;
   // $VF: renamed from: i boolean
   private boolean field_330;
   // $VF: renamed from: a boolean
   public boolean field_331;
   // $VF: renamed from: a e
   private class_22 field_332;
   // $VF: renamed from: b e
   private class_22 field_333;
   // $VF: renamed from: j boolean
   private boolean field_334;
   // $VF: renamed from: k boolean
   private boolean field_335;
   // $VF: renamed from: l boolean
   private boolean field_336;
   // $VF: renamed from: m boolean
   private boolean field_337;
   // $VF: renamed from: n boolean
   private boolean field_338;
   // $VF: renamed from: o boolean
   private boolean field_339;
   // $VF: renamed from: h int
   private int field_340;
   // $VF: renamed from: i int
   private int field_341;
   // $VF: renamed from: j int
   private int field_342;
   // $VF: renamed from: k int
   private int field_343;
   // $VF: renamed from: l int
   private int field_344;
   // $VF: renamed from: a int[]
   private int[] field_345;
   // $VF: renamed from: b int[]
   private int[] field_346;
   // $VF: renamed from: c int[]
   private int[] field_347;
   // $VF: renamed from: d int[]
   private int[] field_348;
   // $VF: renamed from: e int[]
   private int[] field_349;
   // $VF: renamed from: p boolean
   private boolean field_350;
   // $VF: renamed from: a java.lang.StringBuffer
   private StringBuffer field_351;
   // $VF: renamed from: a java.lang.String
   private String field_352;
   // $VF: renamed from: b java.lang.String
   private String field_353;
   // $VF: renamed from: c java.lang.String
   private String field_354;
   // $VF: renamed from: d java.lang.String
   private String field_355;
   // $VF: renamed from: e java.lang.String
   private String field_356;
   // $VF: renamed from: f java.lang.String
   private String field_357;
   // $VF: renamed from: g java.lang.String
   private String field_358;
   // $VF: renamed from: h java.lang.String
   private String field_359;
   // $VF: renamed from: i java.lang.String
   private String field_360;
   // $VF: renamed from: j java.lang.String
   private String field_361;
   // $VF: renamed from: k java.lang.String
   private String field_362;
   // $VF: renamed from: l java.lang.String
   private String field_363;
   // $VF: renamed from: m java.lang.String
   private String field_364;
   // $VF: renamed from: n java.lang.String
   private String field_365;
   // $VF: renamed from: o java.lang.String
   private String field_366;
   // $VF: renamed from: p java.lang.String
   private String field_367;
   // $VF: renamed from: a a
   private class_36 field_368;
   // $VF: renamed from: a al
   private class_26 field_369;
   // $VF: renamed from: q boolean
   private boolean field_370;
   // $VF: renamed from: m int
   private int field_371;
   // $VF: renamed from: n int
   private int field_372;
   // $VF: renamed from: a aa
   private static class_35 field_373;
   // $VF: renamed from: b aa
   private class_35 field_374;
   // $VF: renamed from: c aa
   private class_35 field_375;
   // $VF: renamed from: d aa
   private class_35 field_376;
   // $VF: renamed from: e aa
   private class_35 field_377;
   // $VF: renamed from: f aa
   private class_35 field_378;
   // $VF: renamed from: g aa
   private class_35 field_379;
   // $VF: renamed from: h aa
   private class_35 field_380;
   // $VF: renamed from: i aa
   private class_35 field_381;
   // $VF: renamed from: j aa
   private class_35 field_382;
   // $VF: renamed from: f int[]
   private static final int[] field_383 = new int[]{131457, 131452, 131451, 131450, 131454, 131453, 131455, 131456};
   // $VF: renamed from: k aa
   private class_35 field_384;
   // $VF: renamed from: a aa[]
   private class_35[] field_385;
   // $VF: renamed from: l aa
   private class_35 field_386;
   // $VF: renamed from: r boolean
   private boolean field_387;
   // $VF: renamed from: o int
   private static int field_388;
   // $VF: renamed from: p int
   private static int field_389;
   // $VF: renamed from: s boolean
   private boolean field_390;
   // $VF: renamed from: g int[]
   private int[] field_391;

   // $VF: renamed from: a () int
   public final int method_184() {
      return this.field_325;
   }

   // $VF: renamed from: a () void
   public final void method_185() {
      this.field_330 = false;
   }

   public class_18(class_8 var1, class_2 var2, class_2 var3) {
      this.field_313 = var1;
      field_314 = var2;
      field_315 = var3;
      this.field_351 = new StringBuffer(5);
      this.field_352 = "0";
      this.field_353 = "+";
      this.method_227();
      this.field_368 = new class_36(this, var2, var3);
      this.field_384 = new class_35(class_10.method_136(131433, true));
      this.field_385 = new class_35[field_383.length];

      for (int var4 = 0; var4 < field_383.length; var4++) {
         this.field_385[var4] = new class_35(class_10.method_137(field_383[var4]));
      }

      this.field_386 = new class_35(class_10.method_136(131591, true));
      this.field_387 = false;
      this.field_345 = new int[4];
      this.field_345[0] = 1;
      this.field_345[1] = 3;
      this.field_345[2] = 1;
      this.field_345[3] = 3;
      this.field_346 = new int[6];
      this.field_346[0] = 1;
      this.field_346[1] = 3;
      this.field_346[2] = 1;
      this.field_346[3] = 3;
      this.field_346[4] = 1;
      this.field_346[5] = 3;
      this.field_334 = true;
      this.field_347 = new int[1];
      this.field_347[0] = 3;
      this.field_348 = new int[4];
      this.field_348[0] = 1;
      this.field_348[1] = 3;
      this.field_348[2] = 1;
      this.field_348[3] = 3;
      this.field_349 = new int[7];
      this.field_349[0] = 1;
      this.field_349[1] = 3;
      this.field_349[2] = 3;
      this.field_349[3] = 3;
      this.field_349[4] = 3;
      this.field_349[5] = 3;
      this.field_349[6] = 3;
   }

   // $VF: renamed from: b () void
   public final void method_186() {
      this.field_370 = false;
   }

   // $VF: renamed from: b () int
   public final int method_187() {
      this.field_371 = class_15.method_176(2);
      return 5 + this.field_371 + 31;
   }

   // $VF: renamed from: a (int) void
   public final void method_188(int var1) {
      if (var1 <= this.field_371 - 1) {
         class_15.method_177(2, var1);
      } else if (var1 == this.field_371) {
         this.field_391[8] = 0;
         this.field_391[9] = 0;
         this.field_391[10] = 0;
      } else {
         if (var1 == this.field_371 + 1) {
            if (this.field_391[7] == 0) {
               this.field_368.method_470();
               return;
            }
         } else if (var1 == this.field_371 + 2) {
            if (this.field_391[11] == 0) {
               this.field_368.method_475();
               return;
            }
         } else if (var1 == this.field_371 + 3) {
            if (this.field_391[11] == 0) {
               this.field_368.method_475();
               return;
            }
         } else {
            if (var1 >= this.field_371 + 4 && var1 <= this.field_371 + 4 + 31 - 1) {
               this.field_368.method_534(this.field_371 + 4, var1);
               return;
            }

            if (var1 == this.field_371 + 4 + 31) {
               if (this.field_313.method_68()) {
                  this.field_359 = class_37.method_618(62);
               }

               this.field_360 = class_37.method_618(63);
               this.field_361 = class_37.method_618(64);
               this.field_362 = class_37.method_618(65);
               this.field_363 = class_37.method_618(67);
               this.field_364 = class_37.method_618(66);
               if (this.field_391[14] == 0) {
                  this.field_365 = class_37.method_618(73);
               }

               this.field_368.method_535();
               if (this.field_334) {
                  this.field_334 = false;
                  this.field_333 = new class_22();
                  this.field_333.method_240(1, 6, 3);
                  this.field_333.method_241(2);
                  this.field_333.method_245(0, 1, this.field_362, null, 0);
                  this.field_351.append("");
                  this.field_333.method_245(1, 1, this.field_351.toString(), null, 0);
                  this.field_333.method_245(2, 1, this.field_351.toString(), null, 0);
                  this.field_333.method_245(3, 1, this.field_351.toString(), null, 0);
                  this.field_333.method_245(4, 1, this.field_351.toString(), null, 0);
                  this.field_333.method_245(5, 1, this.field_351.toString(), null, 0);
                  this.field_351.delete(0, this.field_351.length());
                  int[] var3 = this.field_349;
                  Object var2 = null;
                  this.field_333.field_525 = var3;
                  int var10000 = class_37.method_621();
                  boolean var5 = false;
                  int var6 = var10000 - class_37.method_617();
                  int var11 = this.field_368.method_494();
                  int var7 = var6 - var11;
                  int var12 = class_37.method_608() * 9 / 10;
                  int var8 = var7 - 2 * this.field_385[0].method_460();
                  int var4;
                  if ((var4 = this.field_333.method_251(var12, var8)) > var8) {
                     var4 = var8;
                  }

                  var2 = null;
                  this.field_333.method_252(var12, var4, false);
                  var2 = this.field_333;
                  if (this.field_333.field_425 > ((class_22)var2).field_494
                     ? ((class_22)var2).field_422 + ((class_22)var2).field_494 < ((class_22)var2).field_425
                     : false) {
                     this.field_335 = false;
                  } else {
                     this.field_335 = true;
                  }

                  this.method_207();
               }

               this.field_370 = true;
            }
         }
      }
   }

   // $VF: renamed from: c () int
   public final int method_189() {
      this.field_372 = class_15.method_176(3);
      return this.field_372 + 1;
   }

   // $VF: renamed from: b (int) void
   public final void method_190(int var1) {
      if (var1 <= this.field_372 - 1) {
         class_15.method_177(3, var1);
      } else {
         if (var1 == this.field_372) {
            this.method_206();
            this.field_355 = class_37.method_618(79);
            if (field_388 == 0) {
               this.field_354 = class_37.method_618(78);
               this.field_358 = class_37.method_618(82);
               this.field_368.method_536();
            } else if (field_388 == 1) {
               if (this.field_391[12] == 0) {
                  this.field_366 = class_37.method_618(94);
               }

               this.field_356 = class_37.method_618(80);
               this.field_357 = class_37.method_618(81);
            } else if (field_388 == 2) {
               if (this.field_391[13] == 0) {
                  this.field_367 = class_37.method_618(95);
               }

               this.field_356 = class_37.method_618(80);
               this.field_357 = class_37.method_618(81);
            }

            this.field_374 = class_15.method_178(131262);
            this.field_375 = class_15.method_178(131259);
            this.field_376 = class_15.method_178(131258);
            if (field_388 == 0) {
               if (field_389 == 0) {
                  this.field_378 = class_15.method_178(131260);
               } else if (field_389 == 1) {
                  this.field_378 = class_15.method_178(131257);
               } else if (field_389 == 2) {
                  this.field_378 = class_15.method_178(131261);
               }
            } else {
               this.field_377 = class_15.method_178(131256);
            }

            this.field_379 = class_15.method_178(131255);
            this.field_380 = class_15.method_178(131254);
            this.field_381 = class_15.method_178(131263);
            this.field_382 = class_15.method_178(131253);
            this.field_369 = new class_26(this);
            this.field_369.method_347(field_388, field_389);
            this.method_191();
            if (field_388 == 0 || this.field_326 != 46 && this.field_326 != 47) {
               this.method_192();
            }
         }
      }
   }

   // $VF: renamed from: c () void
   public final void method_191() {
      this.field_382.method_451(0, -1, true);
      this.field_369.method_351();
      this.field_350 = true;
   }

   // $VF: renamed from: d () void
   public final void method_192() {
      if (field_388 == 0) {
         if (this.field_369 != null) {
            this.field_369.method_363(this.field_368.method_491());
            return;
         }
      } else {
         this.field_369.method_364();
      }
   }

   // $VF: renamed from: e () void
   public final void method_193() {
      this.field_355 = null;
      this.field_356 = null;
      this.field_357 = null;
      this.field_368.method_595();
      this.field_354 = null;
      this.field_358 = null;
      this.field_369.method_382();
      this.field_369 = null;
   }

   // $VF: renamed from: f () void
   public static void method_194() {
      class_3.method_25().method_29(0, 0);
      class_8.field_179 = true;
   }

   // $VF: renamed from: a (int, o) int
   public final int method_195(int var1, class_12 var2) {
      if (this.field_316) {
         this.field_316 = false;
         this.method_223();
      }

      if (this.field_326 != 0) {
         this.field_325 = this.field_326;
         this.field_326 = 0;
         this.field_387 = false;
         if (this.field_325 == 5) {
            this.field_387 = true;
            this.method_206();
            this.method_198();
            this.field_344 = 0;
            this.field_332 = new class_22();
            this.field_332.method_240(1, 1, 3);
            this.field_332.method_241(2);
            this.field_332.method_245(0, 1, this.field_359, null, 0);
            int[] var126 = this.field_347;
            this.field_332.field_525 = this.field_347;
            int var11 = class_37.method_608();
            var1 = class_37.method_621() - class_37.method_617();
            boolean var31 = false;
            int var32 = this.field_385[0].method_458();
            int var5 = class_37.method_608() * 9 / 10;
            int var6 = (var1 << 3) / 10;
            if (this.field_387) {
               var6 = var1 - this.method_209();
            }

            var6 -= var32;
            if (this.field_387) {
               var6 -= 5;
            }

            int var7;
            if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
               var7 = var6;
            }

            this.field_332.method_252(var5, var7, false);
            this.field_342 = (var11 >> 1) - (var5 >> 1);
            if (this.field_387) {
               int var8 = this.method_209();
               if (var7 == var6) {
                  this.field_343 = var8 + 5;
               } else {
                  this.field_343 = var8 + 5 + (var6 - var7 >> 1);
               }
            } else {
               this.field_343 = (class_37.method_621() >> 1) - (var7 >> 1);
            }

            class_0.field_10.method_4();
            this.field_368.method_549();
         } else if (this.field_325 == 6) {
            this.field_368.method_463();
         } else if (this.field_325 == 7) {
            this.field_331 = false;
            if (this.field_330) {
               this.field_330 = false;
               class_8.field_179 = true;
            }

            this.field_368.method_506();
            this.field_368.method_578();
         } else if (this.field_325 == 11 || this.field_325 == 12) {
            this.field_368.method_483();
         } else if (this.field_325 == 13 || this.field_325 == 16) {
            this.field_368.method_500();
         } else if (this.field_325 == 17) {
            this.field_368.method_500();
            this.field_368.method_498();
            if (this.field_368.method_497()) {
               this.field_368.method_499();
            }
         } else if (this.field_325 == 14) {
            if (this.field_368.method_504()) {
               this.field_368.method_510();
            }
         } else if (this.field_325 == 15) {
            if (this.field_368.method_504()) {
               this.field_368.method_512();
            }
         } else if (this.field_325 == 19) {
            this.field_387 = true;
            this.method_205(this.field_360);
         } else if (this.field_325 == 20) {
            this.field_387 = true;
            this.method_205(this.field_361);
         } else if (this.field_325 == 21) {
            this.field_368.method_564(21);
            this.field_368.method_517();
         } else if (this.field_325 == 22) {
            this.field_368.method_564(22);
         } else if (this.field_325 == 32) {
            this.field_387 = true;
            this.method_205(this.field_365);
         } else if (this.field_325 == 33) {
            this.field_387 = true;
            this.method_205(this.field_368.method_481());
         } else if (this.field_325 == 34) {
            this.field_387 = true;
            this.method_205(this.field_368.method_482());
         } else if (this.field_325 != 35 && this.field_325 != 36) {
            if (this.field_325 == 42) {
               this.field_390 = false;
            } else if (this.field_325 == 24) {
               this.field_331 = true;
               this.field_368.method_570();
               this.method_207();
               this.method_198();
               this.field_344 = 0;
               this.field_333 = new class_22();
               if (this.field_335) {
                  this.field_333.method_240(1, 6, 3);
               } else {
                  this.field_333.method_240(1, 7, 3);
               }

               this.field_333.method_241(2);
               this.field_333.method_245(0, 1, this.field_362, null, 0);
               this.field_351.append("");
               this.field_333.method_245(1, 1, this.field_351.toString(), null, 0);
               if (this.field_335) {
                  this.field_333.method_245(2, 1, this.field_351.toString(), null, 0);
                  this.field_333.method_245(3, 1, this.field_351.toString(), null, 0);
                  this.field_333.method_245(4, 1, this.field_351.toString(), null, 0);
                  this.field_333.method_245(5, 1, this.field_351.toString(), null, 0);
               }

               this.field_351.delete(0, this.field_351.length());
               if (!this.field_335) {
                  int var12 = this.field_368.method_568();
                  var1 = this.field_368.method_569();
                  this.field_333.method_245(2, 1, this.field_363, null, 0);
                  if (var12 > 0) {
                     this.field_351.append(this.field_353);
                     this.field_351.append(var12);
                     this.field_333.method_245(3, 1, this.field_351.toString(), null, 0);
                     this.field_351.delete(0, this.field_351.length());
                  } else {
                     this.field_351.append(var12);
                     this.field_333.method_245(3, 1, this.field_351.toString(), null, 0);
                     this.field_351.delete(0, this.field_351.length());
                  }

                  this.field_351.append("");
                  this.field_333.method_245(4, 1, this.field_351.toString(), null, 0);
                  this.field_351.delete(0, this.field_351.length());
                  this.field_333.method_245(5, 1, this.field_364, null, 0);
                  if (var1 > 0) {
                     this.field_351.append(this.field_353);
                     this.field_351.append(var1);
                     this.field_333.method_245(6, 1, this.field_351.toString(), null, 0);
                     this.field_351.delete(0, this.field_351.length());
                  } else {
                     this.field_351.append(var1);
                     this.field_333.method_245(6, 1, this.field_351.toString(), null, 0);
                     this.field_351.delete(0, this.field_351.length());
                  }
               }

               int[] var127 = this.field_349;
               this.field_333.field_525 = this.field_349;
               int var13 = class_37.method_608();
               int var10000 = var1 = class_37.method_621();
               boolean var33 = false;
               int var34 = var10000 - class_37.method_617();
               int var50 = this.field_368.method_494();
               int var35 = var34 - var50;
               int var57 = class_37.method_608() * 9 / 10;
               int var64 = 0;
               var64 = var35 - 2 * this.field_385[0].method_460();
               int var71;
               if ((var71 = this.field_333.method_251(var57, var64)) > var64) {
                  var71 = var64;
               }

               this.field_333.method_252(var57, var71, false);
               this.field_342 = (var13 >> 1) - (var57 >> 1);
               this.field_343 = var1 - class_37.method_617() - var71;
               if (this.field_335) {
                  this.field_343 = this.field_343 - class_37.method_617();
               }

               class_0.field_10.method_4();
               class_18 var49 = this;
               this.method_206();
               this.field_344 = 0;
               this.field_332 = new class_22();
               int var14 = Math.abs(2 * this.field_368.method_514());
               var1 = 0;

               int var36;
            for (var36 = field_315.method_21(); var14 > 0; var1++) {
                  var14 -= var36;
               }

               this.field_332.method_240(1, var1 + 2, 3);
               this.field_332.method_241(2);
               this.field_332.method_245(0, 1, this.field_362, null, 0);
               this.field_351.append("");
               this.field_332.method_245(1, 1, this.field_351.toString(), null, 0);

               for (int var51 = 2; var51 <= 2 + (var1 - 1); var51++) {
                  var49.field_332.method_245(var51, 1, var49.field_351.toString(), null, 0);
               }

               var49.field_351.delete(0, var49.field_351.length());
               var127 = var49.field_349;
               var49.field_332.field_525 = var49.field_349;
               var50 = class_37.method_621() - (class_37.method_617() << 1);
               var57 = class_37.method_608() * 9 / 10;
               var64 = var50 * 9 / 10;
               var71 = var49.field_332.method_251(var57, var64);
               var49.field_332.method_252(var57, var71, false);
               var49.field_332.method_254();
               var49.field_368.method_522(var49.field_342, var49.field_343, var57, var71, var36);
               class_0.field_10.method_4();
            } else if (this.field_325 == 26) {
               this.field_368.method_520(true);
            } else if (this.field_325 == 29) {
               this.field_368.method_566();
            } else if (this.field_325 == 31) {
               this.field_368.method_520(false);
            } else if (this.field_325 == 38) {
               this.field_387 = true;
               this.field_368.method_471();
               this.method_205(this.field_368.method_473());
            } else if (this.field_325 == 39) {
               this.field_387 = true;
               this.method_205(this.field_368.method_542(39));
            } else if (this.field_325 == 40) {
               this.field_387 = true;
               this.method_205(this.field_368.method_542(40));
               this.field_368.method_466();
            } else if (this.field_325 == 41) {
               this.field_387 = true;
               this.method_205(this.field_368.method_542(41));
            } else if (this.field_325 == 45) {
               this.field_387 = true;
               this.field_368.method_476();
               this.method_205(this.field_368.method_478());
            } else if (this.field_325 == 46) {
               this.field_387 = true;
               this.method_205(this.field_366);
            } else if (this.field_325 == 47) {
               this.field_387 = true;
               this.method_205(this.field_367);
            } else if (this.field_325 == 43) {
               this.field_328 = 0;
            } else if (this.field_325 == 44 && this.field_332 == null) {
               if (this.field_369.method_378() == 0) {
                  int var37 = this.field_369.method_376();
                  var1 = this.field_369.method_367();
                  this.method_206();
                  this.method_198();
                  this.field_344 = 0;
                  this.field_332 = new class_22();
                  if (this.field_369.method_368()) {
                     this.field_332.method_240(1, 4, 3);
                     this.field_332.method_241(2);
                     this.field_332.method_245(0, 1, this.field_354, null, 0);
                     this.field_351.append(var1);
                     this.field_332.method_245(1, 1, this.field_351.toString(), null, 0);
                     this.field_351.delete(0, this.field_351.length());
                     this.field_332.method_245(2, 1, this.field_355, null, 0);
                     this.field_351.append(var37);
                     this.field_332.method_245(3, 1, this.field_351.toString(), null, 0);
                     this.field_351.delete(0, this.field_351.length());
                     int[] var129 = this.field_348;
                     this.field_332.field_525 = this.field_348;
                  } else {
                     this.field_332.method_240(1, 1, 3);
                     this.field_332.method_241(2);
                     this.field_332.method_245(0, 1, this.field_358, null, 0);
                  }

                  int var53 = class_37.method_608();
                  int var132 = class_37.method_621();
                  int var59 = 0;
                  var59 = var132 - class_37.method_617();
                  int var67 = class_37.method_608() * 9 / 10;
                  int var73 = (var59 << 3) / 10;
                  var1 = this.field_332.method_251(var67, var73);
                  this.field_332.method_252(var67, var1, false);
                  this.field_342 = (var53 >> 1) - (var67 >> 1);
                  this.field_343 = (class_37.method_621() >> 1) - (var1 >> 1);
                  class_0.field_10.method_4();
               } else if (this.field_369.method_378() == 2) {
                  int var38 = this.field_369.method_377();
                  var1 = this.field_369.method_375();
                  this.method_206();
                  this.method_198();
                  this.field_344 = 0;
                  this.field_332 = new class_22();
                  this.field_332.method_240(1, 4, 3);
                  this.field_332.method_241(2);
                  this.field_332.method_245(0, 1, this.field_356, null, 0);
                  this.field_351.append(var1);
                  this.field_332.method_245(1, 1, this.field_351.toString(), null, 0);
                  this.field_351.delete(0, this.field_351.length());
                  this.field_332.method_245(2, 1, this.field_357, null, 0);
                  this.field_351.append(var38);
                  this.field_332.method_245(3, 1, this.field_351.toString(), null, 0);
                  this.field_351.delete(0, this.field_351.length());
                  int[] var130 = this.field_345;
                  this.field_332.field_525 = this.field_345;
                  int var54 = class_37.method_608();
                  int var133 = class_37.method_621();
                  int var61 = 0;
                  var61 = var133 - class_37.method_617();
                  int var68 = class_37.method_608() * 9 / 10;
                  int var74 = (var61 << 3) / 10;
                  if (this.field_387) {
                     var74 = var61 - this.method_209();
                     var74 -= 5;
                  }

                  var1 = this.field_332.method_251(var68, var74);
                  this.field_332.method_252(var68, var1, false);
                  this.field_342 = (var54 >> 1) - (var68 >> 1);
                  this.field_343 = (class_37.method_621() >> 1) - (var1 >> 1);
                  class_0.field_10.method_4();
               } else {
                  int var10001 = this.field_369.method_375();
                  int var55 = this.field_369.method_377();
                  int var39 = this.field_369.method_376();
                  var1 = var10001;
                  this.method_206();
                  this.method_198();
                  this.field_344 = 0;
                  this.field_332 = new class_22();
                  this.field_332.method_240(1, 6, 3);
                  this.field_332.method_241(2);
                  this.field_332.method_245(0, 1, this.field_356, null, 0);
                  this.field_351.append(var1);
                  this.field_332.method_245(1, 1, this.field_351.toString(), null, 0);
                  this.field_351.delete(0, this.field_351.length());
                  this.field_332.method_245(2, 1, this.field_355, null, 0);
                  this.field_351.append(var39);
                  this.field_332.method_245(3, 1, this.field_351.toString(), null, 0);
                  this.field_351.delete(0, this.field_351.length());
                  this.field_332.method_245(4, 1, this.field_357, null, 0);
                  this.field_351.append(var55);
                  this.field_332.method_245(5, 1, this.field_351.toString(), null, 0);
                  this.field_351.delete(0, this.field_351.length());
                  int[] var131 = this.field_346;
                  this.field_332.field_525 = this.field_346;
                  int var63 = class_37.method_608();
                  int var134 = class_37.method_621();
                  int var69 = 0;
                  var69 = var134 - class_37.method_617();
                  int var76 = class_37.method_608() * 9 / 10;
                  var1 = (var69 << 3) / 10;
                  if (this.field_387) {
                     var1 = var69 - this.method_209();
                     var1 -= 5;
                  }

                  var1 = this.field_332.method_251(var76, var1);
                  this.field_332.method_252(var76, var1, false);
                  this.field_342 = (var63 >> 1) - (var76 >> 1);
                  this.field_343 = (class_37.method_621() >> 1) - (var1 >> 1);
                  class_0.field_10.method_4();
               }
            }
         }

         this.method_223();
         this.method_224();
         return 0;
      } else {
         if ((field_388 != 1 || this.field_325 != 1) && (field_388 != 2 || this.field_325 != 3) && (field_388 != 0 || this.field_325 != 42)) {
            if (field_388 == 0) {
               if (this.field_325 != 7 && this.field_325 != 13 && this.field_325 != 16) {
                  if (this.field_325 == 14) {
                     if (this.field_368.method_507() == 0) {
                        if ((this.field_317 & 4) != 0) {
                           if (this.field_318) {
                              this.field_318 = false;
                              this.field_317 &= -5;
                           }
                        } else if ((this.field_317 & 8) != 0) {
                           if (this.field_319) {
                              this.field_319 = false;
                              this.field_317 &= -9;
                           }
                        } else if ((this.field_317 & 1) != 0) {
                           this.field_368.method_509(3);
                           if (this.field_320) {
                              this.field_320 = false;
                              this.field_317 &= -2;
                           }
                        } else if ((this.field_317 & 2) != 0) {
                           this.field_368.method_509(4);
                           if (this.field_321) {
                              this.field_321 = false;
                              this.field_317 &= -3;
                           }
                        } else if ((this.field_317 & 16) != 0) {
                           this.field_323 = true;
                           if (this.field_322) {
                              this.field_322 = false;
                              this.field_317 &= -17;
                           }
                        }
                     }
                  } else if (this.field_325 == 15) {
                     if (this.field_368.method_507() == 0) {
                        if ((this.field_317 & 4) != 0) {
                           if (this.field_318) {
                              this.field_318 = false;
                              this.field_317 &= -5;
                           }
                        } else if ((this.field_317 & 8) != 0) {
                           if (this.field_319) {
                              this.field_319 = false;
                              this.field_317 &= -9;
                           }
                        } else if ((this.field_317 & 1) != 0) {
                           this.field_368.method_511(3);
                           if (this.field_320) {
                              this.field_320 = false;
                              this.field_317 &= -2;
                           }
                        } else if ((this.field_317 & 2) != 0) {
                           this.field_368.method_511(4);
                           if (this.field_321) {
                              this.field_321 = false;
                              this.field_317 &= -3;
                           }
                        } else if ((this.field_317 & 16) != 0) {
                           this.field_323 = true;
                           if (this.field_322) {
                              this.field_322 = false;
                              this.field_317 &= -17;
                           }
                        }
                     }
                  } else if (this.field_325 == 6) {
                     if ((this.field_317 & 16) != 0) {
                        if (class_37.method_646() == 14) {
                           this.field_323 = true;
                        }

                        if (this.field_322) {
                           this.field_322 = false;
                           this.field_317 &= -17;
                        }
                     }
                  } else if (this.field_325 == 44 && (this.field_317 & 16) != 0) {
                     if (class_37.method_646() == 1) {
                        this.field_323 = true;
                     }

                     if (this.field_322) {
                        this.field_322 = false;
                        this.field_317 &= -17;
                     }
                  }
               } else if (this.field_368.method_559() == 0) {
                  if ((this.field_317 & 4) != 0) {
                     if (this.field_325 == 7) {
                        this.field_368.method_560(1);
                     } else {
                        this.field_368.method_561(1);
                     }

                     if (this.field_318) {
                        this.field_318 = false;
                        this.field_317 &= -5;
                     }
                  } else if ((this.field_317 & 8) != 0) {
                     if (this.field_325 == 7) {
                        this.field_368.method_560(2);
                     } else {
                        this.field_368.method_561(2);
                     }

                     if (this.field_319) {
                        this.field_319 = false;
                        this.field_317 &= -9;
                     }
                  } else if ((this.field_317 & 1) != 0) {
                     if (this.field_325 == 7) {
                        this.field_368.method_560(3);
                     } else {
                        this.field_368.method_561(3);
                     }

                     if (this.field_320) {
                        this.field_320 = false;
                        this.field_317 &= -2;
                     }
                  } else if ((this.field_317 & 2) != 0) {
                     if (this.field_325 == 7) {
                        this.field_368.method_560(4);
                     } else {
                        this.field_368.method_561(4);
                     }

                     if (this.field_321) {
                        this.field_321 = false;
                        this.field_317 &= -3;
                     }
                  } else if ((this.field_317 & 16) != 0) {
                     this.field_323 = true;
                     if (this.field_325 == 7) {
                        this.field_390 = true;
                     }

                     if (this.field_322) {
                        this.field_322 = false;
                        this.field_317 &= -17;
                     }
                  }
               }
            } else if ((field_388 == 1 || field_388 == 2) && this.field_325 == 44 && (this.field_317 & 16) != 0) {
               if (class_37.method_646() == 23) {
                  this.field_323 = true;
               }

               if (this.field_322) {
                  this.field_322 = false;
                  this.field_317 &= -17;
               }
            }
         } else if ((this.field_317 & 16) != 0) {
            this.field_369.method_352();
            if (this.field_322) {
               this.field_322 = false;
               this.field_317 &= -17;
            }
         }

         int var3 = 0;
         if (field_388 == 1) {
            if (this.field_325 == 1) {
               if (this.field_369.method_350(var1) == 0) {
                  boolean var9 = false;
                  this.field_326 = 43;
                  return 0;
               }
            } else if (this.field_325 == 43) {
               this.field_369.method_350(var1);
               this.field_328 += var1;
               if (this.field_328 >= 2000) {
                  boolean var77 = false;
                  this.field_326 = 2;
                  return 0;
               }
            } else if (this.field_325 == 44) {
               this.field_369.method_350(var1);
            }
         } else if (field_388 == 2) {
            if (this.field_325 == 3) {
               if (this.field_369.method_350(var1) == 0) {
                  boolean var78 = false;
                  this.field_326 = 43;
                  return 0;
               }
            } else if (this.field_325 == 43) {
               this.field_369.method_350(var1);
               this.field_328 += var1;
               if (this.field_328 >= 2000) {
                  boolean var79 = false;
                  this.field_326 = 4;
                  return 0;
               }
            } else if (this.field_325 == 44) {
               this.field_369.method_350(var1);
            }
         } else if (field_388 == 0) {
            if (this.field_325 == 42) {
               if (this.field_325 == 42 && this.field_369.method_350(var1) == 0) {
                  boolean var80 = false;
                  this.field_326 = 43;
                  return 0;
               }
            } else if (this.field_325 == 43) {
               this.field_369.method_350(var1);
               this.field_328 += var1;
               if (this.field_328 >= 2000) {
                  boolean var81 = false;
                  this.field_326 = 44;
                  return 0;
               }
            } else if (this.field_325 == 44) {
               this.field_369.method_350(var1);
            }
         }

         if (var1 > 0 && (this.field_325 == 1 || this.field_325 == 3 || this.field_325 == 42)) {
            if (this.field_369.method_380() < 5000) {
               this.field_382.method_448(var1);
            } else {
               this.field_382.method_454(0);
            }
         }

         if (this.field_350) {
            this.method_224();
            this.field_350 = false;
         }

         if (this.field_324 != -1 || this.field_323) {
            var3 = 0;
            if (this.field_323) {
               this.field_323 = false;
               var3 = class_37.method_646();
            } else {
               var3 = this.field_324;
            }

            this.method_223();
            if (var3 == 9) {
               return 1;
            }

            if (field_388 == 0) {
               if (var3 == 14) {
                  if (this.field_325 == 6) {
                     this.field_368.method_464();
                     boolean var82 = false;
                     this.field_326 = 38;
                     return 0;
                  }
               } else if (var3 == 0) {
                  if (this.field_325 == 14) {
                     switch (this.field_368.method_508()) {
                        case 5:
                           this.field_368.method_550();
                           boolean var85 = false;
                           this.field_326 = 13;
                           return 0;
                        case 6:
                        default:
                           break;
                        case 7:
                           this.field_368.method_550();
                           boolean var84 = false;
                           this.field_326 = 13;
                           return 0;
                        case 8:
                           this.field_327 = 14;
                           boolean var83 = false;
                           this.field_326 = 19;
                           return 0;
                     }
                  } else if (this.field_325 == 15) {
                     switch (this.field_368.method_508()) {
                        case 6:
                           this.field_368.method_550();
                           boolean var89 = false;
                           this.field_326 = 16;
                           return 0;
                        case 7:
                           this.field_368.method_550();
                           boolean var88 = false;
                           this.field_326 = 16;
                           return 0;
                        case 8:
                           this.field_327 = 15;
                           boolean var87 = false;
                           this.field_326 = 19;
                           return 0;
                        case 9:
                           boolean var86 = false;
                           this.field_326 = 7;
                           return 0;
                     }
                  }
               } else if (var3 == 42) {
                  if (this.field_325 == 7 && this.field_368.method_545()) {
                     boolean var92 = false;
                     this.field_326 = 8;
                     return 0;
                  }

                  if (this.field_325 == 13) {
                     field_389 = 0;
                     this.field_368.method_487(0);
                     this.field_327 = 13;
                     if (this.field_391[11] == 0) {
                        boolean var90 = false;
                        this.field_326 = 45;
                     } else {
                        boolean var91 = false;
                        this.field_326 = 42;
                     }

                     return 4;
                  }
               } else if (var3 == 43) {
                  if (this.field_325 == 7 && this.field_368.method_546()) {
                     boolean var93 = false;
                     this.field_326 = 15;
                     return 0;
                  }
               } else if (var3 == 44) {
                  if (this.field_325 == 16) {
                     if (this.field_368.method_528()) {
                        field_389 = 1;
                        this.field_368.method_487(1);
                     } else if (this.field_368.method_529()) {
                        field_389 = 2;
                        this.field_368.method_487(2);
                     }

                     this.field_327 = 16;
                     boolean var94 = false;
                     this.field_326 = 42;
                     return 4;
                  }
               } else if (var3 == 45) {
                  if (this.field_325 == 13) {
                     this.field_327 = 14;
                     boolean var96 = false;
                     this.field_326 = 20;
                     return 0;
                  }

                  if (this.field_325 == 16) {
                     this.field_327 = 15;
                     boolean var95 = false;
                     this.field_326 = 20;
                     return 0;
                  }
               } else if (var3 == 5 && this.field_325 == 15) {
                  switch (this.field_368.method_508()) {
                     case 9:
                        boolean var125 = false;
                        this.field_326 = 7;
                        return 0;
                  }
               }
            }
         }

         this.field_329 += var1;
         if (this.field_329 < 16) {
            return 0;
         } else {
            var1 = this.field_329;
            if (this.field_329 > 333) {
               var1 = 333;
            }

            this.field_329 = 0;
            if (this.field_325 == 45) {
               this.field_368.method_468(var1);
            }

            if (field_388 == 0 && this.field_325 >= 6 && this.field_325 <= 41) {
               this.field_368.method_574(this.field_325, var1);
            }

            if (this.field_336) {
               this.method_196();
            } else if (this.field_337) {
               return this.method_197();
            }

            if (this.field_325 == 40) {
               this.field_368.method_565(var1);
            }

            if (this.field_332 == null
               || this.field_332 != null
                  && (
                     this.field_325 == 38
                        || this.field_325 == 26
                        || this.field_331 && this.field_325 == 27
                        || this.field_325 == 28
                        || this.field_325 == 29
                        || this.field_325 == 30
                        || this.field_325 == 31
                  )) {
               if (field_388 == 1) {
                  if (this.field_325 == 2) {
                     this.method_222(var2);
                     this.field_369.method_373();
                     boolean var124 = false;
                     this.field_326 = 44;
                  }
               } else if (field_388 == 2) {
                  if (this.field_325 == 4) {
                     this.method_222(var2);
                     this.field_369.method_373();
                     boolean var123 = false;
                     this.field_326 = 44;
                  }
               } else if (field_388 == 0) {
                  if (class_8.field_181 && this.field_368.method_588()) {
                     this.field_368.method_589();
                     if ((var3 = this.field_368.method_590()) == 6) {
                        this.field_368.method_496(true);
                        this.field_368.method_578();
                        return 0;
                     }

                     if (var3 != 0 && var3 != 1 && var3 != 2) {
                        if (var3 == 3 || var3 == 4 || var3 == 5) {
                           switch (this.field_368.method_508()) {
                              case 5:
                                 field_389 = 0;
                                 this.field_368.method_487(0);
                                 break;
                              case 6:
                                 if (this.field_368.method_528()) {
                                    field_389 = 1;
                                    this.field_368.method_487(1);
                                 } else if (this.field_368.method_529()) {
                                    field_389 = 2;
                                    this.field_368.method_487(2);
                                 }
                                 break;
                              case 7:
                                 field_389 = 0;
                                 this.field_368.method_487(0);
                                 this.field_368.method_573();
                           }

                           switch (this.field_368.method_590()) {
                              case 3:
                                 this.field_368.method_592(1);
                                 break;
                              case 4:
                                 this.field_368.method_592(2);
                                 break;
                              case 5:
                                 this.field_368.method_592(3);
                           }

                           this.field_368.method_486(true);
                           this.field_327 = this.field_325;
                           boolean var122 = false;
                           this.field_326 = 18;
                           return 0;
                        }
                     } else if (this.field_368.method_593() == 5) {
                        this.field_368.method_567();
                        if (var3 == 0) {
                           this.field_368.method_594(1);
                        } else if (var3 == 1) {
                           this.field_368.method_594(2);
                        } else if (var3 == 2) {
                           this.field_368.method_594(3);
                        }

                        boolean var97 = false;
                        this.field_326 = 24;
                        return 0;
                     }
                  }

                  var3 = this.field_368.method_565(var1);
                  if (this.field_325 == 6) {
                     if (this.field_368.method_465()) {
                        boolean var98 = false;
                        this.field_326 = 38;
                     }
                  } else if (this.field_325 == 7 && this.field_390) {
                     this.field_390 = false;
                     if (this.field_368.method_539()) {
                        boolean var99 = false;
                        this.field_326 = 39;
                     } else if (this.field_368.method_540()) {
                        boolean var100 = false;
                        this.field_326 = 40;
                     } else if (this.field_368.method_541()) {
                        boolean var101 = false;
                        this.field_326 = 41;
                     }
                  } else if (this.field_325 == 26 && this.field_368.method_515()) {
                     this.method_207();
                  } else if (this.field_325 == 31 && !this.field_336 && this.field_332 != null && this.field_368.method_516()) {
                     this.field_336 = true;
                     this.method_196();
                  }

                  if (var3 == 2) {
                     if (this.field_325 == 8) {
                        boolean var102 = false;
                        this.field_326 = 11;
                     } else if (this.field_325 == 11) {
                        this.field_368.method_502(0);
                        boolean var103 = false;
                        this.field_326 = 37;
                     } else if (this.field_325 == 18) {
                        if ((this.field_327 == 13 || this.field_327 == 16 || this.field_327 == 22 || this.field_327 == 23) && !this.field_368.method_485()) {
                           this.field_368.method_564(23);
                           boolean var109 = false;
                           this.field_326 = 23;
                           return 0;
                        }

                        if (this.field_327 == 13) {
                           boolean var104 = false;
                           this.field_326 = 17;
                        } else if (this.field_327 == 16) {
                           this.field_327 = 24;
                           boolean var105 = false;
                           this.field_326 = 17;
                        } else if (this.field_327 == 22) {
                           this.field_327 = 24;
                           boolean var106 = false;
                           this.field_326 = 17;
                        } else if (this.field_327 == 23) {
                           if (this.field_368.field_949) {
                              this.field_327 = 24;
                              boolean var107 = false;
                              this.field_326 = 17;
                           } else {
                              this.field_327 = 13;
                              boolean var108 = false;
                              this.field_326 = 17;
                           }
                        }
                     } else {
                        if (this.field_325 == 22 || this.field_325 == 23) {
                           if (this.field_325 == 22) {
                              if (this.field_327 == 14) {
                                 this.field_327 = 13;
                              } else {
                                 this.field_327 = 22;
                              }
                           }

                           if (this.field_325 == 23) {
                              this.field_327 = 23;
                           }

                           field_389 = 0;
                           this.field_368.method_487(0);
                           boolean var121 = false;
                           this.field_326 = 42;
                           return 4;
                        }

                        if (this.field_325 == 17) {
                           if (this.field_368.method_527()) {
                              if (this.field_368.field_949) {
                                 boolean var110 = false;
                                 this.field_326 = 24;
                              } else {
                                 this.field_368.method_505();
                                 this.field_368.method_519();
                                 boolean var111 = false;
                                 this.field_326 = 27;
                              }
                           } else {
                              int var112 = this.field_327;
                              this.field_326 = this.field_327;
                           }
                        } else if (this.field_325 == 21) {
                           boolean var113 = false;
                           this.field_326 = 12;
                        } else if (this.field_325 == 12) {
                           boolean var114 = false;
                           this.field_326 = 24;
                        } else if (this.field_325 == 37) {
                           if (this.field_368.method_503()) {
                              switch (this.field_368.method_501()) {
                                 case 0:
                                    boolean var119 = false;
                                    this.field_326 = 14;
                                    this.field_368.method_502(1);
                                    break;
                                 case 4:
                                    this.field_368.field_990 = false;
                                    this.field_368.method_502(-1);
                                    if (this.field_391[14] == 0 && this.field_368.method_484()) {
                                       boolean var118 = false;
                                       this.field_326 = 32;
                                    } else if (this.field_368.method_479()) {
                                       boolean var115 = false;
                                       this.field_326 = 33;
                                    } else if (this.field_368.method_480()) {
                                       boolean var116 = false;
                                       this.field_326 = 34;
                                    } else {
                                       boolean var117 = false;
                                       this.field_326 = 7;
                                    }
                              }
                           }
                        } else if (this.field_325 != 35 && this.field_325 != 36) {
                           if (this.field_325 == 26) {
                              this.field_368.method_519();
                              if (this.field_368.method_527()) {
                                 this.field_326 = 27;
                              } else {
                                 this.field_326 = 28;
                              }
                           } else if (this.field_325 == 27) {
                              if (this.field_331) {
                                 this.field_368.method_524();
                                 this.field_368.field_990 = false;
                                 if (!this.field_368.method_528() && !this.field_368.method_529()) {
                                    this.field_326 = 30;
                                 } else {
                                    this.field_326 = 29;
                                 }
                              } else {
                                 this.field_327 = 35;
                                 this.field_326 = 14;
                              }
                           } else if (this.field_325 == 28) {
                              boolean var44 = this.field_368.method_528();
                              boolean var28 = this.field_368.method_529();
                              this.field_368.method_524();
                              this.field_368.field_990 = false;
                              if (var44 && !this.field_368.method_528()) {
                                 this.field_326 = 29;
                              } else if (var28 && !this.field_368.method_529()) {
                                 this.field_326 = 29;
                              } else {
                                 this.field_326 = 30;
                              }
                           } else if (this.field_325 == 29) {
                              this.field_326 = 30;
                           } else {
                              label969:
                              if (this.field_325 == 31 && this.field_332 == null) {
                                 this.field_368.method_493();
                                 if (this.field_368.method_527()) {
                                    if (!this.field_368.field_1021) {
                                       this.field_368.method_502(2);
                                       this.field_326 = 37;
                                       break label969;
                                    }

                                    this.field_368.field_1021 = false;
                                    this.field_368.method_502(-1);
                                 } else {
                                    this.field_368.field_990 = false;
                                    if (this.field_391[14] == 0 && this.field_368.method_484()) {
                                       this.field_326 = 32;
                                       break label969;
                                    }
                                 }

                                 this.field_326 = 7;
                              }
                           }
                        } else {
                           if (this.field_325 == 35) {
                              int var120 = this.field_327;
                              this.field_326 = this.field_327;
                           } else if (this.field_325 == 36) {
                              if (this.field_391[14] == 0 && this.field_368.method_484()) {
                                 this.field_326 = 32;
                              } else if (this.field_368.method_479()) {
                                 this.field_326 = 33;
                              } else if (this.field_368.method_480()) {
                                 this.field_326 = 34;
                              } else {
                                 if (this.field_368.method_527()) {
                                    this.field_368.method_502(-1);
                                 }

                                 this.field_326 = 7;
                              }
                           }

                           this.field_327 = this.field_325;
                        }
                     }
                  }
               }
            }

            if (this.field_332 != null && this.field_333 == null) {
               this.method_199(var1);
               var3 = this.field_344;
               this.field_344 += var1;
               if ((this.field_317 & 16) != 0) {
                  this.field_344 = 333;
               }

               if (this.field_344 >= 333) {
                  if (this.field_387) {
                     this.field_386.method_448(var1);
                  }

                  this.field_344 = 333;
                  if (var3 < 333) {
                     this.method_200();
                     this.method_224();
                  }

                  int[] var29;
                  if ((var29 = this.field_332.method_255(var1)) != null && var29[0] == 0 && var29[1] != 9) {
                     if (this.field_325 == 5) {
                        this.field_340 = 6;
                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 38) {
                        if (this.field_368.method_472()) {
                           this.field_330 = true;
                           if (class_37.method_647().method_174() != 4) {
                              this.field_313.method_69();
                           }

                           this.method_228(7);
                           this.field_340 = 7;
                        } else {
                           this.field_340 = 38;
                        }

                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 39) {
                        this.method_228(8);
                        this.field_340 = 7;
                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 40) {
                        this.method_228(9);
                        this.field_340 = 7;
                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 41) {
                        this.method_228(10);
                        this.field_340 = 7;
                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 45) {
                        if (this.field_368.method_477()) {
                           this.field_369.method_365();
                           this.method_228(11);
                           this.field_340 = 42;
                        } else {
                           this.field_340 = 45;
                        }

                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 46) {
                        this.method_228(12);
                        this.field_340 = 1;
                        class_8.field_179 = true;
                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 47) {
                        this.method_228(13);
                        this.field_340 = 3;
                        class_8.field_179 = true;
                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 32) {
                        this.method_228(14);
                        if (this.field_368.method_479()) {
                           this.field_340 = 33;
                        } else if (this.field_368.method_480()) {
                           this.field_340 = 34;
                        } else {
                           this.field_340 = 7;
                        }

                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 33) {
                        if (this.field_368.method_480()) {
                           this.field_340 = 34;
                        } else {
                           this.field_340 = 7;
                        }

                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 34) {
                        this.field_340 = 7;
                        this.field_337 = true;
                        return this.method_197();
                     }

                     if (this.field_325 == 30) {
                        this.field_326 = 31;
                     } else {
                        if (this.field_325 == 19) {
                           if (var29[1] == 2) {
                              this.field_340 = 21;
                           } else if (var29[1] == 7) {
                              this.field_340 = this.field_327;
                           }

                           this.field_337 = true;
                           return this.method_197();
                        }

                        if (this.field_325 == 20) {
                           if (var29[1] == 2) {
                              if (this.field_327 != 14) {
                                 this.field_327 = 16;
                              }

                              this.field_340 = 22;
                           } else if (var29[1] == 7) {
                              this.field_340 = this.field_327;
                           }

                           this.field_337 = true;
                           return this.method_197();
                        }

                        if (this.field_325 == 44) {
                           if (field_388 != 1 && field_388 != 2) {
                              if (field_388 == 0) {
                                 if (this.field_369.method_368()) {
                                    this.field_368.method_486(true);
                                    this.field_368.method_488(this.field_369.method_376());
                                    this.field_368.method_489(this.field_369.method_367());
                                 } else {
                                    this.field_368.method_486(false);
                                 }

                                 this.field_341 = 3;
                                 this.field_340 = 18;
                                 this.field_337 = true;
                                 return this.method_197();
                              }
                           } else {
                              if (var29[1] == 23) {
                                 this.field_339 = true;
                                 this.field_337 = true;
                                 return this.method_197();
                              }

                              if (var29[1] == 13) {
                                 this.field_341 = 2;
                                 this.field_337 = true;
                                 return this.method_197();
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (this.field_333 != null) {
               this.method_199(var1);
               var3 = this.field_344;
               this.field_344 += var1;
               if ((this.field_317 & 16) != 0) {
                  this.field_344 = 333;
               }

               if (this.field_344 >= 333) {
                  if (this.field_387) {
                     this.field_386.method_448(var1);
                  }

                  this.field_344 = 333;
                  if (var3 < 333) {
                     this.method_200();
                     this.method_224();
                  }

                  int[] var30;
                  if ((var30 = this.field_333.method_255(var1)) != null && var30[0] == 0) {
                     if (this.field_325 == 24) {
                        this.field_368.method_572();
                        this.field_340 = 25;
                     } else if (this.field_325 == 25) {
                        this.field_330 = true;
                        this.field_368.method_519();
                        if (!this.field_368.method_518() && !this.field_368.method_525()) {
                           this.field_337 = true;
                           this.field_338 = true;
                           this.field_368.method_493();
                           this.field_368.field_990 = false;
                           if (this.field_368.method_526() <= 3) {
                              this.field_368.method_490();
                           }

                           if (this.field_368.method_527()) {
                              if (this.field_368.field_1021) {
                                 this.field_368.field_1021 = false;
                                 this.field_368.method_502(-1);
                                 this.field_340 = 7;
                              } else {
                                 this.field_368.method_502(2);
                                 this.field_340 = 37;
                              }
                           } else {
                              this.field_368.field_990 = false;
                              this.field_340 = 7;
                           }

                           return this.method_197();
                        }

                        this.field_326 = 26;
                     }
                  }
               }
            }

            if (this.field_325 == 24 && this.field_344 >= 333 && this.field_368.method_565(var1) == 2) {
               this.field_326 = 25;
            }

            return 0;
         }
      }
   }

   // $VF: renamed from: m () void
   private void method_196() {
      if (this.field_325 == 31) {
         this.method_206();
         this.field_336 = false;
      }
   }

   // $VF: renamed from: f () int
   private int method_197() {
      this.field_337 = false;
      if (this.field_338) {
         this.field_338 = false;
         this.method_206();
         this.method_207();
      } else {
         this.method_206();
      }

      int var1 = this.field_340;
      this.field_326 = this.field_340;
      if (this.field_339) {
         this.method_191();
         this.method_221();
      }

      return this.field_341 != 0 ? this.field_341 : 0;
   }

   // $VF: renamed from: n () void
   private void method_198() {
      this.field_336 = false;
      this.field_337 = false;
      this.field_339 = false;
      this.field_341 = 0;
      if (this.field_384 != null) {
         this.field_384.method_451(0, 1, false);
      }

      if (this.field_385 != null) {
         for (int var1 = 0; var1 < this.field_385.length; var1++) {
            if (this.field_385[var1] != null) {
               this.field_385[var1].method_451(0, 1, false);
            }
         }
      }

      if (this.field_387 && this.field_386 != null) {
         this.field_386.method_451(0, -1, false);
      }
   }

   // $VF: renamed from: g (int) void
   private void method_199(int var1) {
      if (this.field_384 != null) {
         this.field_384.method_448(var1);
      }

      for (int var2 = 0; var2 < this.field_385.length; var2++) {
         if (this.field_385[var2] != null) {
            this.field_385[var2].method_448(var1);
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_200() {
      if (this.field_384 != null) {
         this.field_384.method_447(this.field_384.method_442());
      }

      for (int var1 = 0; var1 < this.field_385.length; var1++) {
         if (this.field_385[var1] != null) {
            this.field_385[var1].method_447(this.field_385[var1].method_442());
         }
      }
   }

   // $VF: renamed from: g () void
   public static void method_201() {
      (field_373 = new class_35(class_10.method_136(131366, true))).method_451(0, -1, false);
   }

   // $VF: renamed from: c (int) void
   public static void method_202(int var0) {
      if (field_373 != null) {
         field_373.method_448(var0);
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) boolean
   public static boolean method_203(Graphics var0) {
      if (field_373 != null) {
         field_373.method_450(var0, class_37.method_608() >> 1, class_37.method_621() >> 1);
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_204(Graphics var1) {
      int var2 = class_37.method_608();
      int var3 = class_37.method_621();
      class_25 var4;
      (var4 = class_37.method_648()).method_316();
      var4.method_309(16777215);
      var4.method_308(0, 0, var2, var3);
      if (field_388 == 0) {
         if (this.field_325 == 45) {
            this.field_369.method_348(var1);
            switch (this.field_368.method_474()) {
               case 0:
                  if (this.field_368.method_467()) {
                     this.field_369.method_370(var1);
                  }
                  break;
               case 1:
                  if (this.field_368.method_467()) {
                     this.method_211(var1);
                  }
                  break;
               case 2:
                  if (this.field_368.method_467()) {
                     this.method_213(var1);
                  }
                  break;
               case 3:
                  if (this.field_368.method_467()) {
                     this.method_214(var1);
                  }
            }
         } else if (this.field_325 != 42 && this.field_325 != 43 && this.field_325 != 44) {
            this.field_368.method_576(var1);
         } else {
            this.field_369.method_348(var1);
            this.method_210(var1);
            this.field_369.method_349(var1);
         }
      } else {
         this.field_369.method_348(var1);
         this.method_210(var1);
         this.field_369.method_349(var1);
      }

      if (field_388 == 0
         && (
            this.field_325 == 26
               || this.field_331 && this.field_325 == 27
               || this.field_325 == 28
               || this.field_325 == 29
               || this.field_325 == 30
               || this.field_325 == 31
         )) {
         this.field_368.method_531(var1);
      }

      if (this.field_332 != null && this.field_333 == null) {
         Object var5 = null;
         var2 = this.field_332.field_471;
         var3 = this.field_332.field_472;
         int var14 = this.field_332.field_471 * this.field_344 / 333;
         int var17 = this.field_332.field_472 * this.field_344 / 333;
         int var6 = this.field_342;
         int var7 = this.field_343;
         this.method_208(var1, var2, var3, var14, var17);
         if (this.field_344 >= 333 && !this.field_337) {
            if (this.field_325 < 26 || this.field_325 > 31 || this.field_368.method_515()) {
               this.field_332.method_258(var1, var6, var7);
            }

            if (this.field_387 && !this.field_337) {
               var5 = null;
               this.field_386.method_450(var1, var6 + (this.field_332.field_471 >> 1), var7 + 5);
            }
         }
      }

      if (this.field_333 != null) {
         Object var19 = null;
         var2 = this.field_333.field_471;
         var3 = this.field_333.field_472;
         int var15 = this.field_333.field_471 * this.field_344 / 333 + 15;
         int var20 = this.field_333.field_472 * this.field_344 / 333;
         this.method_208(var1, var2, var3, var15, var20);
         if (this.field_344 >= 333 && !this.field_337) {
            this.field_333.method_258(var1, this.field_342, this.field_343);
         }
      }

      if (this.field_335 && (this.field_325 == 24 || this.field_325 == 25 || this.field_325 == 26) && this.field_333 != null && this.field_344 == 333) {
         var2 = 0;
         var3 = 0;
         if (this.field_325 == 24) {
            var2 = this.field_368.method_568();
            var3 = this.field_368.method_569();
         }

         Object var21 = null;
         int var16 = this.field_342 + (this.field_333.field_471 >> 1);
         int var22 = this.field_333.field_476 + this.field_333.field_492 + this.field_333.field_494;
         int var28 = field_315.method_21();
         int var23 = var22 - (var28 + 2) - (var28 + 2) - (var28 + 2) - (var28 + 2);
         int var24 = var23 + 6;
         field_315.method_22(var1, this.field_363, var16, var24, 17);
         int var25 = var24 + var28;
         if (this.field_325 == 24) {
            if (var2 > 0) {
               this.field_351.append(this.field_353);
               this.field_351.append(var2);
            } else {
               this.field_351.append(var2);
            }

            field_315.method_22(var1, this.field_351.toString(), var16, var25, 17);
            this.field_351.delete(0, this.field_351.length());
         } else {
            field_315.method_22(var1, this.field_352, var16, var25, 17);
         }

         int var26 = var25 + var28;
         field_315.method_22(var1, this.field_364, var16, var26, 17);
         int var27 = var26 + var28;
         if (this.field_325 == 24) {
            if (var3 > 0) {
               this.field_351.append(this.field_353);
               this.field_351.append(var3);
            } else {
               this.field_351.append(var3);
            }

            field_315.method_22(var1, this.field_351.toString(), var16, var27, 17);
            this.field_351.delete(0, this.field_351.length());
         } else {
            field_315.method_22(var1, this.field_352, var16, var27, 17);
         }
      }

      if (field_388 == 0
         && (
            this.field_325 == 26
               || this.field_331 && this.field_325 == 27
               || this.field_325 == 28
               || this.field_325 == 29
               || this.field_325 == 30
               || this.field_325 == 31
         )) {
         this.field_368.method_532(var1, this.field_325);
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   private void method_205(String var1) {
      this.method_206();
      this.method_198();
      this.field_344 = 0;
      this.field_332 = new class_22();
      this.field_332.method_240(1, 1, 3);
      this.field_332.method_241(2);
      this.field_332.method_245(0, 1, var1, null, 0);
      int var10 = class_37.method_608();
      int var10000 = class_37.method_621();
      int var2 = 0;
      var2 = var10000 - class_37.method_617();
      int var3 = 0;
      int var4 = 0;
      var3 = this.field_385[2].method_457();
      var4 = this.field_385[0].method_458();
      int var5 = class_37.method_608() * 9 / 10;
      int var6 = (var2 << 3) / 10;
      if (this.field_387) {
         var6 = var2 - this.method_209();
      }

      var6 -= var4;
      this.field_342 = (var10 >> 1) - (var5 >> 1);
      int var7 = 0;
      if (this.field_325 == 38 && this.field_368.method_469() == 0) {
         int var18 = this.field_368.method_513();
         var6 -= var18;
         if (this.field_387) {
            var6 -= var4;
         }

         if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
            var7 = var6;
         }

         Object var28 = null;
         this.field_332.method_252(var5, var7, false);
         if (this.field_387) {
            var3 = this.method_209();
            if (var7 == var6) {
               this.field_343 = var18 + var3 + var4;
            } else {
               this.field_343 = var18 + var3 + (var6 - var7 >> 1);
            }
         } else {
            this.field_343 = (class_37.method_621() >> 1) - (var7 >> 1);
         }
      } else if (this.field_325 == 38 && this.field_368.method_469() == 2) {
         int var17 = this.field_368.method_494();
         if (this.field_387) {
            var6 -= 5;
         } else {
            var6 = var2 - class_37.method_617() - var17 - var4;
         }

         if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
            var7 = var6;
         }

         Object var27 = null;
         this.field_332.method_252(var5, var7, false);
         if (this.field_387) {
            var3 = this.method_209();
            if (var7 == var6) {
               this.field_343 = var3 + 5;
            } else {
               this.field_343 = var3 + 5 + (var6 - var7 >> 1);
            }
         } else if (var7 == var6) {
            this.field_343 = var17 + var4;
         } else {
            this.field_343 = var17 + (var6 - var7 >> 1);
         }
      } else if (this.field_325 == 38 && this.field_368.method_469() == 3) {
         if (this.field_387) {
            var6 -= 5;
         }

         var5 = class_37.method_608() - this.field_368.method_495() - 4;
         if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
            var7 = var6;
         }

         Object var26 = null;
         this.field_332.method_252(var5, var7, false);
         this.field_342 = class_37.method_608() - 2 - var5;
         this.field_342 -= var3;
         if (this.field_387) {
            int var16 = this.method_209();
            if (var7 == var6) {
               this.field_343 = var16 + 5;
            } else {
               this.field_343 = var16 + 5 + (var6 - var7 >> 1);
            }
         } else {
            this.field_343 = (class_37.method_621() >> 1) - (var7 >> 1);
         }
      } else if (this.field_325 == 45 && this.field_368.method_474() == 0) {
         int var15 = this.field_369.method_366();
         if (this.field_387) {
            var6 -= var15;
         } else {
            var6 = var2 - (var15 << 1);
         }

         if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
            var7 = var6;
         }

         Object var25 = null;
         this.field_332.method_252(var5, var7, false);
         if (this.field_387) {
            var3 = this.method_209();
            if (var7 == var6) {
               this.field_343 = var15 + var3;
            } else {
               this.field_343 = var15 + var3 + (var6 - var7 >> 1);
            }
         } else if (var7 == var6) {
            this.field_343 = var15 << 1;
         } else {
            this.field_343 = (var15 << 1) + (var6 - var7 >> 1);
         }
      } else if (this.field_325 == 45 && this.field_368.method_474() == 1) {
         if (this.field_387) {
            var6 -= 5;
         }

         var5 -= this.field_378.method_459();
         if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
            var7 = var6;
         }

         Object var24 = null;
         this.field_332.method_252(var5, var7, false);
         this.field_342 = (var10 >> 1) - (var5 >> 1) + this.field_378.method_459();
         if (this.field_387) {
            int var14 = this.method_209();
            if (var7 == var6) {
               this.field_343 = var14 + 5;
            } else {
               this.field_343 = var14 + 5 + (var6 - var7 >> 1);
            }
         } else {
            this.field_343 = (class_37.method_621() >> 1) - (var7 >> 1);
         }
      } else if (this.field_325 == 46) {
         int var11 = Math.abs(this.field_379.method_458()) + this.field_379.method_460();
         var2 = Math.abs((var3 = class_37.method_621() - this.field_380.method_458()) - var2);
         if (this.field_387) {
            var6 -= var2 / 2;
            if (this.field_387) {
               var6 -= 5;
            }
         } else {
            var6 = var3 - var11 - ((var4 << 1) + 4);
         }

         if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
            var7 = var6;
         }

         Object var21 = null;
         this.field_332.method_252(var5, var7, false);
         if (this.field_387) {
            var2 = this.method_209();
            if (var7 == var6) {
               this.field_343 = var2 + 5;
            } else {
               this.field_343 = var2 + 5 + (var6 - var7 >> 1);
            }
         } else {
            var2 = (var3 - var11 - var7) / 2;
            this.field_343 = var11 + var2;
         }
      } else {
         if (this.field_387) {
            var6 -= 5;
         }

         if ((var7 = this.field_332.method_251(var5, var6)) > var6) {
            var7 = var6;
         }

         this.field_332.method_252(var5, var7, false);
         if (this.field_387) {
            int var12 = this.method_209();
            if (var7 == var6) {
               this.field_343 = var12 + 5;
            } else {
               this.field_343 = var12 + 5 + (var6 - var7 >> 1);
            }
         } else {
            this.field_343 = (class_37.method_621() >> 1) - (var7 >> 1);
            if (this.field_325 == 45 && this.field_368.method_474() == 3) {
               int var13 = class_37.method_621() - this.field_380.method_458();
               if (this.field_343 + var7 + var4 > var13) {
                  this.field_343 = this.field_343 - (this.field_343 + var7 + var4 - var13 + 2);
               }
            }
         }
      }

      class_0.field_10.method_4();
   }

   // $VF: renamed from: p () void
   private void method_206() {
      if (this.field_332 != null) {
         this.field_332.method_272();
         this.field_332 = null;
      }
   }

   // $VF: renamed from: q () void
   private void method_207() {
      if (this.field_333 != null) {
         this.field_333.method_272();
         this.field_333 = null;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private void method_208(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.getClipX();
      int var7 = var1.getClipY();
      int var8 = var1.getClipWidth();
      int var9 = var1.getClipHeight();
      int var10 = this.field_342 + (var2 >> 1) - (var4 >> 1);
      int var11 = this.field_343 + (var3 >> 1) - (var5 >> 1);
      var1.setClip(var10, var11, var4, var5);
      int var12 = var10;
      int var13 = var11;
      int var14 = 0;
      int var15 = 0;
      if (this.field_384 != null) {
         var14 = this.field_384.method_459();
         var15 = this.field_384.method_460();
         if (var14 > 0 && var15 > 0) {
            while (var13 < var11 + var5) {
               while (var12 < var10 + var4) {
                  this.field_384.method_449(var12, var13);
                  var12 += var14;
               }

               var12 = var10;
               var13 += var15;
            }
         }
      } else {
         class_22.method_262(var1, this.field_342, this.field_343, var2, var3, 11781073, 13689327, 1);
      }

      var1.setClip(var6, var7, var8, var9);
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      var14 = this.field_385[4].method_459();
      var15 = this.field_385[4].method_460();
      int var16 = this.field_385[0].method_459();
      int var17 = this.field_385[0].method_460();
      var1.setClip(
         var10 + (var14 - this.field_385[4].method_457()), var11 - this.field_385[0].method_458(), var4 - 2 * (var14 - this.field_385[4].method_457()), var17
      );

      for (int var24 = 0; var24 < var4; var24 += var16) {
         var18 = true;
         this.field_385[0].method_449(var10 + var24, var11);
      }

      var16 = this.field_385[3].method_459();
      var17 = this.field_385[3].method_460();
      var1.setClip(
         var10 + var4 - this.field_385[3].method_457(),
         var11 + (var15 - this.field_385[5].method_458()),
         var16,
         var5 - 2 * (var15 - this.field_385[5].method_458())
      );

      for (int var25 = 0; var25 < var5; var25 += var17) {
         var21 = true;
         this.field_385[3].method_449(var10 + var4, var11 + var25);
      }

      var14 = this.field_385[7].method_459();
      var16 = this.field_385[1].method_459();
      var17 = this.field_385[1].method_460();
      var1.setClip(var10 + (var14 - this.field_385[4].method_457()), var11 + var5, var4 - 2 * (var14 - this.field_385[4].method_457()), var17);

      for (int var27 = 0; var27 < var4; var27 += var16) {
         var19 = true;
         this.field_385[1].method_450(var1, var10 + var27, var11 + var5);
      }

      var15 = this.field_385[4].method_460();
      var16 = this.field_385[2].method_459();
      var17 = this.field_385[2].method_460();
      var1.setClip(
         var10 - this.field_385[2].method_457(), var11 + (var15 - this.field_385[4].method_458()), var16, var5 - 2 * (var15 - this.field_385[4].method_458())
      );

      for (int var28 = 0; var28 < var5; var28 += var17) {
         var20 = true;
         this.field_385[2].method_449(var10, var11 + var28);
      }

      var1.setClip(var6, var7, var8, var9);
      if (var18 || var19 || var20 || var21) {
         this.field_385[4].method_449(var10, var11);
         this.field_385[5].method_449(var10 + var4, var11);
         this.field_385[7].method_449(var10 + var4, var11 + var5);
         this.field_385[6].method_449(var10, var11 + var5);
      }
   }

   // $VF: renamed from: g () int
   private int method_209() {
      return this.field_386.method_460() - 5;
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics) void
   private void method_210(Graphics var1) {
      this.method_211(var1);
      this.method_213(var1);
      this.method_214(var1);
      int var4 = class_37.method_608();
      if (this.field_369.method_378() == 2) {
         class_20 var5 = this.field_382.method_446(0);
         Object var7 = null;
         int var6 = var4 + var5.field_392;
         boolean var8 = false;
         var7 = null;
         int var10 = var5.field_393 + (var5.field_395 >> 1) - (field_314.method_21() >> 1);
         this.field_382.method_450(var1, var4, 0);
         field_314.method_22(var1, this.field_369.method_342(), var6, var10, 20);
      }

      if (field_388 == 0) {
         this.field_369.method_370(var1);
      }
   }

   // $VF: renamed from: c (javax.microedition.lcdui.Graphics) void
   private void method_211(Graphics var1) {
      int var2 = this.field_369.method_379();
      int var3 = this.field_369.method_375();
      if (field_388 == 0) {
         this.method_212(var1, var2, var3);
      } else if (field_388 == 1) {
         this.method_212(var1, -1, var3);
      } else {
         if (field_388 == 2) {
            this.method_212(var1, -1, var3);
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   private void method_212(Graphics var1, int var2, int var3) {
      int var4 = class_37.method_621();
      if (var2 == -1) {
         this.field_377.method_450(var1, 0, var4);
      } else {
         this.field_376.method_450(var1, 0, var4);
         int var5 = var4 - this.field_376.method_458();

         for (int var6 = class_17.field_310[var2] / 5 - 1; var6 > 0; var5 -= this.field_375.method_460()) {
            this.field_375.method_450(var1, 0, var5);
            var6--;
         }

         this.field_374.method_450(var1, 0, var5);
         class_20 var10001 = this.field_376.method_446(0);
         Object var11 = null;
         var5 = var4 + var10001.field_393;
         int var12 = this.field_378.method_446(0).field_395;

         for (int var7 = 0; var7 < var3; var5 -= var12) {
            if (var7 == 0) {
               this.field_378.method_454(0);
            } else if (var7 == class_17.field_310[var2] - 1) {
               this.field_378.method_454(2);
            } else {
               this.field_378.method_454(1);
            }

            this.field_378.method_450(var1, 0, var5);
            var7++;
         }
      }

      int var9 = 0;
      int var13 = 0;
      if (field_388 != 1 && field_388 != 2) {
         class_20 var18;
         class_20 var19 = var18 = this.field_381.method_446(1);
         Object var16 = null;
         var9 = var19.field_392 + var18.field_394;
         var13 = var4 + var18.field_393 + (var18.field_395 >> 1) - (field_314.method_21() >> 1);
      } else {
         class_20 var17;
         class_20 var10000 = var17 = this.field_381.method_446(0);
         Object var14 = null;
         var9 = var10000.field_392 + var17.field_394;
         var13 = var4 + var17.field_393 + (var17.field_395 >> 1) - (field_314.method_21() >> 1);
      }

      this.field_381.method_450(var1, 0, var4);
      field_314.method_22(var1, this.field_369.method_341(), var9, var13, 24);
   }

   // $VF: renamed from: d (javax.microedition.lcdui.Graphics) void
   private void method_213(Graphics var1) {
      int var2 = class_37.method_608();
      boolean var3 = true;
      if (this.field_369.method_378() == 2) {
         var3 = false;
      }

      if (var3 && this.field_379 != null) {
         class_20 var6 = this.field_379.method_446(0);
         Object var5 = null;
         int var4 = var2 + var6.field_392;
         boolean var7 = false;
         var5 = null;
         int var9 = var6.field_393 + (var6.field_395 >> 1) - (field_314.method_21() >> 1);
         this.field_379.method_450(var1, var2, 0);
         field_314.method_22(var1, this.field_369.method_339(), var4, var9, 20);
      }
   }

   // $VF: renamed from: e (javax.microedition.lcdui.Graphics) void
   private void method_214(Graphics var1) {
      int var2 = class_37.method_608();
      int var3 = class_37.method_621();
      boolean var4 = true;
      if (this.field_369.method_378() == 2) {
         var4 = false;
      }

      if (var4 && this.field_380 != null) {
         class_20 var7 = this.field_380.method_446(0);
         Object var6 = null;
         int var5 = var2 + var7.field_392;
         boolean var8 = false;
         var6 = null;
         int var10 = var3 + var7.field_393 + (var7.field_395 >> 1) - (field_314.method_21() >> 1);
         this.field_380.method_450(var1, var2, var3);
         field_314.method_22(var1, this.field_369.method_340(), var5, var10, 20);
      }
   }

   // $VF: renamed from: d (int) void
   public static void method_215(int var0) {
      field_388 = var0;
      if (var0 != 0) {
         field_389 = 0;
      }
   }

   // $VF: renamed from: d () int
   public static int method_216() {
      return field_388;
   }

   // $VF: renamed from: e (int) void
   public static void method_217(int var0) {
      field_389 = 0;
   }

   // $VF: renamed from: e () int
   public static int method_218() {
      return field_389;
   }

   // $VF: renamed from: a (int, int) void
   public final void method_219(int var1, int var2) {
      if (var2 == 3) {
         this.field_324 = var1;
      }

      if (this.field_332 != null && this.field_325 != 24 && this.field_325 != 25 && this.field_344 == 333) {
         this.field_332.method_260(var1, var2);
      } else if (this.field_333 != null && this.field_344 == 333) {
         this.field_333.method_260(var1, var2);
      } else {
         int var3 = class_37.method_632(var1);
         if (var2 == 0) {
            switch (var3) {
               case 50:
                  this.field_317 |= 4;
                  this.field_318 = true;
               case 51:
               case 55:
               default:
                  break;
               case 52:
                  this.field_317 |= 1;
                  this.field_320 = true;
                  break;
               case 53:
                  this.field_317 |= 16;
                  this.field_322 = true;
                  break;
               case 54:
                  this.field_317 |= 2;
                  this.field_321 = true;
                  break;
               case 56:
                  this.field_317 |= 8;
                  this.field_319 = true;
            }

            if (class_8.field_181) {
               if (this.field_325 == 7) {
                  switch (var1) {
                     case 48:
                        this.field_368.method_591(1);
                        return;
                     case 49:
                        this.field_368.method_591(6);
                        return;
                     case 55:
                        this.field_368.method_591(0);
                        return;
                     case 57:
                        this.field_368.method_591(2);
                     case 50:
                     case 51:
                     case 52:
                     case 53:
                     case 54:
                     case 56:
                     default:
                        return;
                  }
               }

               if (this.field_325 != 13 && this.field_325 != 16) {
                  if (this.field_325 != 1 && this.field_325 != 3 && this.field_325 != 42) {
                     return;
                  }

                  switch (var1) {
                     case 48:
                        if (this.field_369.method_374() != 0) {
                           this.field_369.method_372();
                        }
                     default:
                        return;
                  }
               }

               switch (var1) {
                  case 48:
                     this.field_368.method_591(4);
                     return;
                  case 55:
                     this.field_368.method_591(3);
                     return;
                  case 57:
                     this.field_368.method_591(5);
                  default:
                     return;
               }
            }
         } else if (var2 == 1) {
            switch (var3) {
               case 50:
                  if (!this.field_318) {
                     this.field_317 &= -5;
                     return;
                  }
               case 51:
               case 55:
               default:
                  break;
               case 52:
                  if (!this.field_320) {
                     this.field_317 &= -2;
                     return;
                  }
                  break;
               case 53:
                  if (!this.field_322) {
                     this.field_317 &= -17;
                  }
                  break;
               case 54:
                  if (!this.field_321) {
                     this.field_317 &= -3;
                     return;
                  }
                  break;
               case 56:
                  if (!this.field_319) {
                     this.field_317 &= -9;
                     return;
                  }
            }
         }
      }
   }

   // $VF: renamed from: h () void
   public final void method_220() {
      this.method_223();
      this.field_390 = false;
      this.field_350 = true;
      class_0.field_10.method_4();
   }

   // $VF: renamed from: i () void
   public final void method_221() {
      this.field_330 = false;
      this.field_390 = false;
      this.field_350 = true;
      this.method_223();
      this.field_316 = true;
      this.method_206();
      this.method_207();
      if (field_388 == 1) {
         if (this.field_391[12] == 0) {
            this.field_326 = 46;
         } else {
            this.field_326 = 1;
         }
      } else if (field_388 == 2) {
         if (this.field_391[13] == 0) {
            this.field_326 = 47;
         } else {
            this.field_326 = 3;
         }
      } else {
         if (field_388 == 0) {
            this.field_368.method_596();
            if (this.field_313.method_68()) {
               this.field_326 = 5;
               this.field_368.method_492();
            } else {
               this.field_326 = 7;
            }

            this.field_368.method_533();
         }
      }
   }

   // $VF: renamed from: a (o) void
   private void method_222(class_12 var1) {
      if (this.field_369.method_378() == 1) {
         var1.method_153(0, new int[]{this.field_369.method_375()}, null);
         var1.method_153(1, new int[]{this.field_369.method_376()}, null);
      } else {
         if (this.field_369.method_378() == 2) {
            var1.method_153(2, new int[]{this.field_369.method_375()}, null);
         }
      }
   }

   // $VF: renamed from: r () void
   private void method_223() {
      this.field_324 = -1;
      this.field_317 = 0;
      this.field_318 = false;
      this.field_319 = false;
      this.field_320 = false;
      this.field_321 = false;
      this.field_322 = false;
      this.field_323 = false;
   }

   // $VF: renamed from: s () void
   private void method_224() {
      class_37.method_629();
      if (field_388 == 0) {
         switch (this.field_325) {
            case 5:
            case 32:
            case 33:
            case 34:
            case 38:
            case 39:
            case 40:
            case 41:
            case 44:
            case 45:
               if (this.field_344 == 333) {
                  Object var7 = null;
                  this.field_332.field_477[0] = 1;
                  this.field_332.field_477[1] = 9;
                  this.field_332.method_254();
                  return;
               }

               class_37.method_620(9, 0);
               return;
            case 6:
               class_37.method_620(14, 0);
               break;
            case 7:
            case 13:
            case 14:
            case 15:
            case 16:
               this.field_368.method_575();
               return;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 17:
            case 18:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 35:
            case 36:
            case 37:
            case 43:
            default:
               return;
            case 19:
            case 20:
               if (this.field_344 == 333) {
                  Object var6 = null;
                  this.field_332.field_477[0] = 2;
                  this.field_332.field_477[1] = 7;
                  this.field_332.method_254();
                  return;
               }

               class_37.method_620(9, 0);
               return;
            case 24:
               if (this.field_344 == 333) {
                  Object var5 = null;
                  this.field_333.field_477[0] = 14;
                  this.field_333.method_254();
                  return;
               }

               return;
            case 25:
               if (!this.field_368.method_518() && !this.field_368.method_525()) {
                  Object var2 = null;
                  this.field_333.field_477[0] = 1;
               } else {
                  Object var1 = null;
                  this.field_333.field_477[0] = 12;
               }

               class_22 var3 = this.field_333;
               this.field_333.field_423 = this.field_333.field_422;
               this.field_333.method_254();
               var3 = this.field_333;
               this.field_333.field_422 = this.field_333.field_423;
               return;
            case 30:
               this.field_332.field_477[0] = 1;
               this.field_332.method_254();
               return;
            case 42:
               class_37.method_620(9, 0);
               return;
         }
      } else {
         if (field_388 == 1) {
            if (this.field_325 == 46) {
               if (this.field_344 == 333) {
                  this.field_332.field_477[0] = 1;
                  this.field_332.field_477[1] = 9;
                  this.field_332.method_254();
                  return;
               }

               class_37.method_620(9, 0);
               return;
            }

            if (this.field_325 == 44) {
               if (this.field_344 == 333) {
                  this.field_332.field_477[0] = 23;
                  this.field_332.field_477[1] = 13;
                  this.field_332.method_254();
                  return;
               }

               class_37.method_620(9, 0);
               return;
            }

            class_37.method_620(9, 0);
            return;
         }

         if (field_388 != 2) {
            return;
         }

         if (this.field_325 == 47) {
            if (this.field_344 == 333) {
               this.field_332.field_477[0] = 1;
               this.field_332.field_477[1] = 9;
               this.field_332.method_254();
               return;
            }

            class_37.method_620(9, 0);
            return;
         }

         if (this.field_325 == 44) {
            if (this.field_344 == 333) {
               this.field_332.field_477[0] = 23;
               this.field_332.field_477[1] = 13;
               this.field_332.method_254();
               return;
            }

            class_37.method_620(9, 0);
            return;
         }
      }

      class_37.method_620(9, 0);
   }

   // $VF: renamed from: j () void
   public final void method_225() {
      this.field_359 = null;
      this.field_360 = null;
      this.field_361 = null;
      this.field_362 = null;
      this.field_363 = null;
      this.field_364 = null;
      this.field_365 = null;
      this.field_368.method_596();
      this.field_370 = false;
   }

   // $VF: renamed from: k () void
   public final void method_226() {
      this.field_355 = null;
      this.field_356 = null;
      this.field_357 = null;
      this.field_354 = null;
      this.field_358 = null;
      this.field_359 = null;
      this.field_360 = null;
      this.field_361 = null;
      this.field_362 = null;
      this.field_363 = null;
      this.field_364 = null;
      this.field_366 = null;
      this.field_367 = null;
      if (this.field_368 != null) {
         this.field_368.method_595();
         this.field_368.method_596();
      }

      if (this.field_369 != null) {
         this.field_369.method_382();
         this.field_369 = null;
      }

      if (this.field_374 != null) {
         this.field_374 = null;
      }

      if (this.field_375 != null) {
         this.field_375 = null;
      }

      if (this.field_376 != null) {
         this.field_376 = null;
      }

      if (this.field_377 != null) {
         this.field_377 = null;
      }

      if (this.field_378 != null) {
         this.field_378 = null;
      }

      if (this.field_379 != null) {
         this.field_379 = null;
      }

      if (this.field_380 != null) {
         this.field_380 = null;
      }

      if (this.field_381 != null) {
         this.field_381 = null;
      }

      if (this.field_382 != null) {
         this.field_382 = null;
      }
   }

   // $VF: renamed from: t () void
   private void method_227() {
      if (this.field_391 == null) {
         this.field_391 = new int[23];

         for (int var1 = 0; var1 < 23; var1++) {
            this.field_391[var1] = 0;
         }
      }
   }

   // $VF: renamed from: f (int) void
   public final void method_228(int var1) {
      if (var1 != -1 && var1 < 23) {
         this.field_391[var1]++;
      }
   }

   // $VF: renamed from: b (int, int) void
   public final void method_229(int var1, int var2) {
      if (var1 != -1 && var1 < 23 && var2 > this.field_391[var1]) {
         this.field_391[var1] = var2;
      }
   }

   // $VF: renamed from: a (int) int
   public final int method_230(int var1) {
      return this.field_391[var1];
   }

   // $VF: renamed from: a (c) c
   public final class_24 method_231(class_24 var1) {
      class_24 var2 = var1;
      class_18 var4 = this;

      for (int var3 = 0; var3 < 23; var3++) {
         var2.method_290(var4.field_391[var3]);
      }

      return this.field_368.method_597(var2);
   }

   // $VF: renamed from: b (c) c
   public final class_24 method_232(class_24 var1) {
      class_24 var2 = var1;
      class_18 var4 = this;
      this.method_227();

      for (int var3 = 0; var3 < 23; var3++) {
         var4.field_391[var3] = var2.method_287();
      }

      return this.field_368.method_598(var2);
   }

   // $VF: renamed from: l () void
   public final void method_233() {
      class_18 var1 = this;

      for (int var2 = 0; var2 < 23; var2++) {
         var1.field_391[var2] = 0;
      }

      this.field_368.method_599();
   }

   static {
      int[] var10000 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1};
   }
}
