package com.digitalchocolate.towerbloxx;
// $VF: renamed from: ae
public final class class_32 {
   // $VF: renamed from: a int
   private int field_736;
   // $VF: renamed from: b int
   private int field_737;
   // $VF: renamed from: a g[]
   private class_20[] field_738;
   // $VF: renamed from: a int[][]
   private int[][] field_739;
   // $VF: renamed from: a k
   private class_16 field_740;
   // $VF: renamed from: a r
   private class_9 field_741;
   // $VF: renamed from: b g[]
   private static final class_20[] field_742 = new class_20[0];
   // $VF: renamed from: a w[]
   private static final class_4[] field_743 = new class_4[0];
   // $VF: renamed from: b int[][]
   private static final int[][] field_744 = new int[0][];
   // $VF: renamed from: a int[]
   private static int[] field_745 = new int[2];
   // $VF: renamed from: b w[]
   private class_4[] field_746;

   private class_32() {
   }

   // $VF: renamed from: a (r) ae
   public final class_32 method_423(class_9 var1) {
      class_32 var2;
      (var2 = new class_32()).field_741 = var1;
      var2.field_740 = this.field_740;
      var2.field_739 = this.field_739;
      var2.field_738 = this.field_738;
      var2.field_736 = this.field_736;
      var2.field_737 = this.field_737;
      if (this.field_746 != null) {
         class_32 var4 = this;
         int var10000;
         if (this.field_746 == null) {
            var10000 = 0;
         } else {
            int var5 = 0;

            for (int var6 = 0; var6 < var4.field_746.length; var6++) {
               if (var4.field_746[var6] != null) {
                  var5++;
               }
            }

            var10000 = var5;
         }

         int var7 = var10000;
         var2.field_746 = new class_4[var7];

         for (int var3 = 0; var3 < var7; var3++) {
            class_4[] var11 = var2.field_746;
            class_4 var8 = this.field_746[var3];
            class_4 var9;
            (var9 = new class_4()).method_32(var8.field_54.length);
            var9.field_55 = new class_35[var8.field_55.length];

            for (int var10 = 0; var10 < var8.field_55.length; var10++) {
               var9.field_55[var10] = var8.field_55[var10].method_438();
            }

            var9.field_56 = var8.field_56;
            var9.field_57 = var8.field_57;
            var9.field_58 = var8.field_58;
            var9.field_59 = var8.field_59;
            var9.field_60 = var8.field_60;
            var9.field_62 = var8.field_62;
            var9.field_64 = var8.field_64;
            var9.field_65 = 0;
            var9.field_66 = var8.field_66;
            var9.field_67 = var8.field_67;
            var9.field_68 = var8.field_68;
            var9.field_69 = var8.field_69;
            var9.field_71 = var8.field_71;
            var9.field_73 = var8.field_73;
            var9.field_74 = var8.field_74;
            var9.field_75 = var8.field_75;
            var9.field_76 = var8.field_76;
            var9.field_77 = var8.field_77;
            var9.field_78 = var8.field_78;
            var9.field_79 = var8.field_79;
            var9.field_80 = var8.field_80;
            var9.field_81 = var8.field_81;
            var9.field_82 = var8.field_82;
            var9.field_83 = var8.field_83;
            var9.field_84 = var8.field_84;
            var9.field_85 = var8.field_85;
            var11[var3] = var9;
         }
      }

      return var2;
   }

   public class_32(boolean var1, class_9 var2) {
      if (var1) {
         this.field_738 = field_742;
         this.field_746 = field_743;
         this.field_739 = field_744;
      }

      this.field_741 = var2;
   }

   // $VF: renamed from: a (c, boolean, boolean) void
   public final void method_424(class_24 var1, boolean var2, boolean var3) {
      if (var2) {
         this.field_736 = var1.method_285();
         this.field_737 = var1.method_285();
      } else {
         this.field_736 = var1.method_286();
         this.field_737 = var1.method_286();
      }

      int var4;
      if ((var4 = var1.method_285()) == 0) {
         this.field_738 = field_742;
      } else {
         this.field_738 = new class_20[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            int var10 = var1.method_285();
            short var6;
            short var7;
            int var8;
            int var9;
            if (var2) {
               var6 = var1.method_284();
               var7 = var1.method_284();
               var8 = var1.method_285();
               var9 = var1.method_285();
            } else {
               var6 = var1.method_286();
               var7 = var1.method_286();
               var8 = var1.method_286();
               var9 = var1.method_286();
            }

            this.field_738[var5] = new class_20(var6, var7, var8, var9, var10);
         }
      }

      short var20;
      if ((var20 = var1.method_286()) == 0) {
         this.field_739 = field_744;
      } else {
         this.field_739 = new int[var20][];
      }

      for (int var21 = 0; var21 < var20; var21++) {
         int[] var22 = null;
         int var23;
         if ((var23 = var1.method_285()) == 1) {
            var22 = new int[5];
            if (var2) {
               var22[1] = var1.method_284();
               var22[2] = var1.method_284();
            } else {
               var22[1] = var1.method_286();
               var22[2] = var1.method_286();
            }

            int var30;
            int var33 = ((var30 = var1.method_285()) >> 4) + 1;
            var4 = var30 & 15;
            int var41 = var1.method_287();
            int var46 = var1.method_285();
            class_10.method_141(var41, var46, var4, var33, var3, field_745);
            var22[3] = field_745[0];
            var22[4] = field_745[1];
         } else if (var23 == 9) {
            var22 = new int[5];
            if (var2) {
               var22[1] = var1.method_284();
               var22[2] = var1.method_284();
            } else {
               var22[1] = var1.method_286();
               var22[2] = var1.method_286();
            }

            var1.method_285();
            int var29 = var1.method_287();
            var22[4] = class_10.method_146(var29, var3);
         } else if (var23 == 7) {
            var22 = new int[5];
            if (var2) {
               var22[1] = var1.method_284();
               var22[2] = var1.method_284();
               var22[3] = var1.method_285();
               var22[4] = var1.method_285();
            } else {
               var22[1] = var1.method_286();
               var22[2] = var1.method_286();
               var22[3] = var1.method_286();
               var22[4] = var1.method_286();
            }
         } else if (var23 == 10) {
            short var25;
            (var22 = new int[(var25 = var1.method_286()) + 3])[2] = var25;
            class_35[] var32 = new class_35[var25];

            for (int var15 = 0; var15 < var25; var15++) {
               int var10000 = var1.method_287();
               boolean var37 = false;
               int var43 = class_10.method_146(var10000, var3);
               var22[var15 + 3] = var43;
               var32[var15] = class_10.method_148(var43);
            }

            class_4 var17;
            if (var2) {
               byte var38 = var1.method_284();
               byte var44 = var1.method_284();
               var4 = var1.method_285();
               int var25b = var1.method_285();
               var17 = new class_4(var38, var44, var4, var25b);
            } else {
               short var39 = var1.method_286();
               short var45 = var1.method_286();
               short var18 = var1.method_286();
               short var27 = var1.method_286();
               var17 = new class_4(var39, var45, var18, var27);
            }

            Object var28 = null;
            var17.field_55 = var32;
            var17.field_67 = var1.method_284() == 1;
            var17.field_66 = var1.method_284() == 1;
            var17.field_71 = var1.method_284() == 1;
            var17.field_68 = var1.method_284() == 1;
            var17.field_69 = var1.method_284() == 1;
            var17.field_60 = var1.method_286();
            var17.method_32(var1.method_286());
            var17.field_84 = var1.method_286();
            var17.field_85 = var1.method_286();
            var17.field_80 = var1.method_286();
            var17.field_81 = var1.method_286();
            var17.field_82 = var1.method_286();
            var17.field_83 = var1.method_286();
            var17.field_73 = var1.method_286();
            var17.field_76 = var1.method_286();
            var17.field_77 = var1.method_286();
            var17.field_78 = var1.method_286();
            var17.field_79 = var1.method_286();
            var17.field_74 = var1.method_287();
            var17.field_75 = var1.method_287();
            var17.field_62 = var1.method_287();
            var17.field_64 = var1.method_287();
            if (this.field_746 == null) {
               this.field_746 = new class_4[var20 - var21];
            }

            for (int var40 = 0; var40 < this.field_746.length; var40++) {
               if (this.field_746[var40] == null) {
                  this.field_746[var40] = var17;
                  var22[1] = var40;
                  break;
               }
            }
         } else {
            int var24 = var1.method_287();
            boolean var31 = false;
            byte var13 = 2;
            if (var23 != 8 && var23 != 6) {
               var22 = new int[6];
            } else {
               if (var23 == 8) {
                  var13 = 6;
               }

               var31 = true;
            }

            if (var2) {
               if (var31) {
                  int var11 = var1.method_285();
                  (var22 = new int[3 + var11 * var13])[2] = var11;
                  var11 *= var13;

                  for (int var12 = 0; var12 < var11; var12++) {
                     var22[var12 + 3] = var1.method_284();
                  }
               } else {
                  var22[2] = var1.method_284();
                  var22[3] = var1.method_284();
                  var22[4] = var1.method_285();
                  var22[5] = var1.method_285();
               }
            } else {
               int var35 = 4;
               byte var42 = 2;
               if (var31) {
                  var35 = var1.method_285();
                  (var22 = new int[3 + var35 * var13])[2] = var35;
                  var42 = 3;
                  var35 *= var13;
               }

               for (int var14 = 0; var14 < var35; var14++) {
                  var22[var42 + var14] = var1.method_286();
               }
            }

            var22[1] = var24;
         }

         var22[0] = var23;
         this.field_739[var21] = var22;
      }
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_425(int var1, int var2, int var3) {
      boolean var4 = false;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      class_25 var9;
      int var10 = (var9 = class_37.method_648()).method_318();
      int var11 = var9.method_319();
      var9.method_317(var1, var2);
      int var12 = this.field_739.length;

      for (int var13 = 0; var13 < var12; var13++) {
         int[] var14;
         int var15;
         if ((var15 = (var14 = this.field_739[var13])[0]) == 1) {
            var15 = var14[1];
            int var16 = var14[2];
            int var10000 = var14[3];
            boolean var17 = false;
            class_16 var26 = class_10.method_147(var10000);
            int var19 = var14[4];
            byte var18 = 0;
            if ((var19 & 1) != 0) {
               var18 = 1;
            }

            if ((var19 & 2) != 0) {
               var18 |= 2;
            }

            var9.method_298(var26, var15, var16, var18, 20);
         } else if (var15 == 7) {
            if (!var4) {
               var4 = true;
               var5 = var9.method_329();
               var6 = var9.method_330();
               var7 = var9.method_328();
               var8 = var9.method_327();
            } else {
               var9.method_331(var5, var6, var7, var8);
            }

            var9.method_332(var14[1] + var1, var14[2] + var2, var14[3], var14[4]);
         } else if (var15 == 9) {
            var15 = var14[1] + var1;
            int var24 = var14[2] + var2;
            int var29 = var14[4];
            boolean var27 = false;
            class_35 var28;
            class_9 var20 = (var28 = class_10.method_148(var29)).method_444();
            if (var15 - var20.method_118() + var20.method_120() > var9.method_329()
               && var24 - var20.method_119() + var20.method_121() > var9.method_330()
               && var15 - var20.method_118() < var9.method_329() + var9.method_328()
               && var24 - var20.method_119() < var9.method_330() + var9.method_327()) {
               var28.method_447(var3);
               var28.method_449(var15, var24);
            }
         } else if (var15 == 10) {
            var15 = var14[1];
            class_4 var25;
            if ((var25 = this.field_746[var15]).field_68) {
               var25.method_33(var3, var1, var2);
               var25.method_36(0, 0);
            } else {
               var25.method_33(var3, 0, 0);
               var25.method_36(var1, var2);
            }
         } else {
            var9.method_310(var14[1]);
            if (var15 == 3) {
               var9.method_307(var14[2], var14[3], var14[4], var14[5]);
            } else if (var15 == 2) {
               var9.method_308(var14[2], var14[3], var14[4], var14[5]);
            } else if (var15 == 6) {
               var9.method_333(var14, 3, var14[2]);
            } else {
               var9.method_335(var14, 3, var14[2]);
            }
         }
      }

      if (var4) {
         var9.method_331(var5, var6, var7, var8);
      }

      var9.method_317(var10, var11);
   }

   // $VF: renamed from: a () g[]
   public final class_20[] method_426() {
      return this.field_738;
   }

   // $VF: renamed from: a (int) g
   public final class_20 method_427(int var1) {
      int var2 = this.field_738.length;

      while (--var2 >= 0) {
         if (this.field_738[var2].field_396 == var1) {
            return this.field_738[var2];
         }
      }

      return null;
   }

   // $VF: renamed from: a () int[][]
   public final int[][] method_428() {
      return this.field_739;
   }

   // $VF: renamed from: a () k
   public final class_16 method_429() {
      if (this.field_740 == null) {
         int var2 = this.field_741.method_116();
         int var1 = this.field_741.method_117();
         this.field_740 = new class_16(var2, var1);
      }

      return this.field_740;
   }

   // $VF: renamed from: a () boolean
   public final boolean method_430() {
      int[][] var2;
      int var1 = (var2 = this.field_739).length;

      while (--var1 >= 0) {
         if (var2[var1][0] == 9) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a () void
   public final void method_431() {
      if (this.field_740 != null) {
         this.field_740 = null;
      }
   }

   // $VF: renamed from: a (k[]) int
   public final int method_432(class_16[] var1) {
      int var2 = 0;
      int var3 = 0;
      var3 = var1.length;
      int var4 = this.field_739.length;

      for (int var5 = 0; var5 < var4; var5++) {
         int[] var6;
         if ((var6 = this.field_739[var5])[0] == 1) {
            if (var2 < var3) {
               int var8 = var6[3];
               var1[var2] = class_10.method_147(var8);
            }

            var2++;
         }
      }

      return var2;
   }
}
