package com.digitalchocolate.towerbloxx;
// $VF: renamed from: w
public final class class_4 {
   // $VF: renamed from: a aj[]
   class_28[] field_54;
   // $VF: renamed from: a aa[]
   class_35[] field_55;
   // $VF: renamed from: a int
   int field_56;
   // $VF: renamed from: b int
   int field_57;
   // $VF: renamed from: c int
   int field_58;
   // $VF: renamed from: d int
   int field_59;
   // $VF: renamed from: e int
   int field_60;
   // $VF: renamed from: v int
   private int field_61;
   // $VF: renamed from: f int
   int field_62;
   // $VF: renamed from: w int
   private int field_63;
   // $VF: renamed from: g int
   int field_64;
   // $VF: renamed from: h int
   int field_65;
   // $VF: renamed from: a boolean
   boolean field_66 = true;
   // $VF: renamed from: b boolean
   boolean field_67 = true;
   // $VF: renamed from: c boolean
   boolean field_68;
   // $VF: renamed from: d boolean
   boolean field_69;
   // $VF: renamed from: x int
   private int field_70;
   // $VF: renamed from: e boolean
   boolean field_71 = true;
   // $VF: renamed from: y int
   private int field_72 = Integer.MIN_VALUE;
   // $VF: renamed from: i int
   int field_73;
   // $VF: renamed from: j int
   int field_74;
   // $VF: renamed from: k int
   int field_75;
   // $VF: renamed from: l int
   int field_76;
   // $VF: renamed from: m int
   int field_77;
   // $VF: renamed from: n int
   int field_78;
   // $VF: renamed from: o int
   int field_79;
   // $VF: renamed from: p int
   int field_80;
   // $VF: renamed from: q int
   int field_81;
   // $VF: renamed from: r int
   int field_82;
   // $VF: renamed from: s int
   int field_83;
   // $VF: renamed from: t int
   int field_84;
   // $VF: renamed from: u int
   int field_85;

   public class_4(int var1, int var2, int var3, int var4) {
      this.field_56 = var1;
      this.field_57 = var2;
      this.field_58 = var3;
      this.field_59 = var4;
   }

   public class_4() {
   }

   // $VF: renamed from: a (int) void
   public final void method_32(int var1) {
      this.field_61 = var1;
      this.field_54 = new class_28[var1];

      while (--var1 >= 0) {
         this.field_54[var1] = new class_28();
      }

      this.method_34();
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_33(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method_34();
      } else {
         int var4;
         if ((var4 = var1 - this.field_63) > 0) {
            int var5 = var3;
            int var13 = var2;
            var3 = var4;
            class_4 var10 = this;
            this.field_63 += var4;
            int var6 = this.field_61;
            int var7 = this.field_61;

            while (--var7 >= 0) {
               class_28 var8;
               class_28 var10000 = var8 = var10.field_54[var7];
               Object var9 = null;
               if (var10000.field_687) {
                  var8.field_685 += var3;
                  if (var8.field_685 >= var8.field_686) {
                     var8.method_383(false);
                  }

                  var6--;
               }
            }

            if (var10.field_62 == 0 ? true : var10.field_63 < var10.field_62) {
               if (var10.field_64 == 0) {
                  var7 = var6;

                  while (--var7 >= 0) {
                     var10.method_35(var13, var5);
                  }
               } else {
                  if (var10.field_65 > var10.field_63) {
                     var10.field_65 = 0;
                  }

                  if ((var7 = var10.field_63 - var10.field_65) >= var10.field_64) {
                     int var16;
                     if ((var16 = var7 / var10.field_64) > var6) {
                        var16 = var6;
                     }

                     var3 = var16;

                     while (--var3 >= 0) {
                        var10.method_35(var13, var5);
                     }

                     var10.field_65 = var10.field_63;
                  }
               }
            }
         }
      }

      this.field_63 = var1;
   }

   // $VF: renamed from: a () void
   private void method_34() {
      int var1 = this.field_61;

      while (--var1 >= 0) {
         this.field_54[var1].method_383(false);
      }

      this.field_70 = 0;
      this.field_72 = Integer.MIN_VALUE;
      this.field_63 = 0;
   }

   // $VF: renamed from: b (int, int) void
   private void method_35(int var1, int var2) {
      class_28 var3 = null;
      if (this.field_66) {
         for (int var4 = 0; var4 < this.field_61; var4++) {
            class_28 var10000 = this.field_54[var4];
            Object var5 = null;
            if (!var10000.field_687) {
               var3 = this.field_54[var4];
               break;
            }
         }
      } else {
         int var13 = this.field_61;

         while (--var13 >= 0) {
            class_28 var21 = this.field_54[var13];
            Object var15 = null;
            if (!var21.field_687) {
               var3 = this.field_54[var13];
               break;
            }
         }
      }

      if (var3 != null) {
         int var14;
         if (this.field_67) {
            var14 = class_30.method_389(this.field_55.length);
         } else {
            var14 = this.field_70++;
            this.field_70 = this.field_70 % this.field_55.length;
         }

         class_35 var6 = this.field_55[var14];
         Object var16 = null;
         var3.field_684 = var6;
         int var10001 = this.field_56 + class_30.method_389(this.field_58) + var1;
         var1 = this.field_57 + class_30.method_389(this.field_59) + var2;
         int var17 = var10001;
         var3.field_688 = var17;
         var3.field_689 = var1;
         if (this.field_69) {
            var3.field_686 = this.field_55[var14].method_442();
         } else {
            var3.field_686 = this.field_74 + class_30.method_389(this.field_75 - this.field_74);
         }

         var1 = this.field_85;
         int var18 = this.field_84;
         var3.field_694 = var18;
         var3.field_695 = var1;
         var1 = this.field_79;
         int var19 = this.field_78;
         var3.field_691 = var19;
         var3.field_692 = var1;
         if (this.field_77 != this.field_76) {
            var1 = this.field_76 + class_30.method_389(this.field_77 - this.field_76);
         } else {
            var1 = this.field_76;
         }

         var3.field_690 = Math.min(var3.field_692, Math.max(var3.field_691, var1));
         if (this.field_81 != this.field_80) {
            var1 = this.field_80 + class_30.method_389(this.field_81 - this.field_80);
         } else {
            var1 = this.field_80;
         }

         var3.field_693 = var1;
         var1 = this.field_82;
         if (this.field_83 != this.field_82) {
            if (this.field_71) {
               var1 = this.field_82 + class_30.method_389(this.field_83 - this.field_82);
            } else {
               if (this.field_72 == Integer.MIN_VALUE) {
                  this.field_72 = this.field_82;
               }

               var1 = this.field_72;
               this.field_72 = this.field_72 + this.field_73;
               if (this.field_72 < this.field_82) {
                  this.field_72 = this.field_83;
               } else if (this.field_72 > this.field_83) {
                  this.field_72 = this.field_82;
               }
            }
         }

         int var20 = (var1 << 16) / 360;
         var3.field_696 = class_30.method_388(var20);
         var3.field_697 = -class_30.method_387(var20);
         var3.method_383(true);
      }
   }

   // $VF: renamed from: a (int, int) void
   public final void method_36(int var1, int var2) {
      for (int var3 = 0; var3 < this.field_61; var3++) {
         class_28 var4;
         if ((var4 = this.field_54[var3]).field_687) {
            int var7 = var4.field_685 * var4.field_685 >> 10;
            int var8 = 0;
            int var9 = 0;
            if (var4.field_693 != 0) {
               if (var4.field_693 > 0) {
                  var9 = var4.field_692;
               } else if (var4.field_693 < 0) {
                  var9 = var4.field_691;
               }

               var8 = (var9 - var4.field_690 << 10) / var4.field_693;
            }

            if (var8 == 0) {
               var8 = var4.field_690 * var4.field_685 >> 10;
            } else if (var4.field_685 < var8) {
               var8 = (var4.field_685 * var4.field_690 >> 10) + (var4.field_693 * var7 >> 11);
            } else {
               int var10 = var4.field_685 - var8;
               var8 = (var8 * var4.field_690 >> 10) + (var4.field_693 * (var8 * var8 >> 10) >> 11);
               var9 = var10 * var9 >> 10;
               var8 += var9;
            }

            int var16 = var4.field_688 + (var4.field_696 * var8 >> 15);
            var8 = var4.field_689 + (var4.field_697 * var8 >> 15);
            var16 += var4.field_694 * var7 >> 11;
            var8 += var4.field_695 * var7 >> 11;
            var4.field_684.method_447(var4.field_685 * var4.field_684.method_442() / var4.field_686);
            var4.field_684.method_449(var16 + var1, var8 + var2);
         }
      }
   }
}
