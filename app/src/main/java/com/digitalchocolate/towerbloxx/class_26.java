package com.digitalchocolate.towerbloxx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: al
public final class class_26 {
   // $VF: renamed from: d int
   private int field_568;
   // $VF: renamed from: e int
   private static int field_569;
   // $VF: renamed from: a int
   public static int field_570;
   // $VF: renamed from: f int
   private static int field_571;
   // $VF: renamed from: b int
   public static int field_572;
   // $VF: renamed from: g int
   private static int field_573;
   // $VF: renamed from: c int
   public static int field_574;
   // $VF: renamed from: h int
   private int field_575;
   // $VF: renamed from: i int
   private int field_576;
   // $VF: renamed from: j int
   private int field_577;
   // $VF: renamed from: k int
   private int field_578;
   // $VF: renamed from: l int
   private int field_579;
   // $VF: renamed from: m int
   private int field_580;
   // $VF: renamed from: n int
   private int field_581 = 0;
   // $VF: renamed from: o int
   private int field_582;
   // $VF: renamed from: p int
   private int field_583;
   // $VF: renamed from: q int
   private int field_584;
   // $VF: renamed from: r int
   private int field_585;
   // $VF: renamed from: s int
   private int field_586 = 0;
   // $VF: renamed from: t int
   private int field_587;
   // $VF: renamed from: a int[]
   private int[] field_588;
   // $VF: renamed from: b int[]
   private int[] field_589;
   // $VF: renamed from: a short[]
   private short[] field_590;
   // $VF: renamed from: u int
   private int field_591;
   // $VF: renamed from: v int
   private int field_592 = 0;
   // $VF: renamed from: w int
   private int field_593;
   // $VF: renamed from: x int
   private int field_594;
   // $VF: renamed from: a af[]
   private class_31[] field_595;
   // $VF: renamed from: b af[]
   private class_31[] field_596;
   // $VF: renamed from: y int
   private int field_597;
   // $VF: renamed from: z int
   private int field_598;
   // $VF: renamed from: c int[]
   private int[] field_599;
   // $VF: renamed from: A int
   private int field_600;
   // $VF: renamed from: a boolean
   private boolean field_601;
   // $VF: renamed from: B int
   private int field_602;
   // $VF: renamed from: C int
   private int field_603;
   // $VF: renamed from: D int
   private int field_604;
   // $VF: renamed from: E int
   private int field_605;
   // $VF: renamed from: F int
   private int field_606;
   // $VF: renamed from: G int
   private int field_607;
   // $VF: renamed from: H int
   private int field_608;
   // $VF: renamed from: I int
   private int field_609;
   // $VF: renamed from: a p
   private class_11 field_610;
   // $VF: renamed from: J int
   private int field_611;
   // $VF: renamed from: K int
   private int field_612;
   // $VF: renamed from: b boolean
   private boolean field_613;
   // $VF: renamed from: L int
   private int field_614;
   // $VF: renamed from: M int
   private int field_615;
   // $VF: renamed from: N int
   private int field_616;
   // $VF: renamed from: a z
   private class_1 field_617;
   // $VF: renamed from: a ab
   private class_34 field_618;
   // $VF: renamed from: a ai
   private class_29 field_619;
   // $VF: renamed from: a n[]
   private class_13[] field_620;
   // $VF: renamed from: O int
   private int field_621;
   // $VF: renamed from: P int
   private int field_622;
   // $VF: renamed from: a ak
   private class_27 field_623;
   // $VF: renamed from: a f
   private class_21 field_624;
   // $VF: renamed from: Q int
   private int field_625;
   // $VF: renamed from: R int
   private int field_626;
   // $VF: renamed from: d int[]
   private int[] field_627;
   // $VF: renamed from: e int[]
   private int[] field_628;
   // $VF: renamed from: S int
   private int field_629;
   // $VF: renamed from: T int
   private int field_630;
   // $VF: renamed from: a aa
   private class_35 field_631;
   // $VF: renamed from: b aa
   private class_35 field_632;
   // $VF: renamed from: U int
   private int field_633;
   // $VF: renamed from: V int
   private int field_634;
   // $VF: renamed from: W int
   private int field_635;
   // $VF: renamed from: X int
   private int field_636;
   // $VF: renamed from: Y int
   private int field_637;
   // $VF: renamed from: Z int
   private int field_638;
   // $VF: renamed from: aa int
   private int field_639;
   // $VF: renamed from: ab int
   private int field_640;
   // $VF: renamed from: ac int
   private int field_641;
   // $VF: renamed from: ad int
   private int field_642;
   // $VF: renamed from: ae int
   private int field_643;
   // $VF: renamed from: af int
   private int field_644;
   // $VF: renamed from: ag int
   private int field_645;
   // $VF: renamed from: ah int
   private int field_646;
   // $VF: renamed from: ai int
   private int field_647;
   // $VF: renamed from: aj int
   private int field_648;
   // $VF: renamed from: c boolean
   private boolean field_649;
   // $VF: renamed from: a java.lang.String
   private String field_650;
   // $VF: renamed from: b java.lang.String
   private String field_651;
   // $VF: renamed from: c java.lang.String
   private String field_652;
   // $VF: renamed from: d java.lang.String
   private String field_653;
   // $VF: renamed from: e java.lang.String
   private String field_654;
   // $VF: renamed from: f java.lang.String
   private String field_655;
   // $VF: renamed from: a java.lang.StringBuffer
   private StringBuffer field_656;
   // $VF: renamed from: a i
   private class_18 field_657;
   // $VF: renamed from: ak int
   private int field_658;
   // $VF: renamed from: f int[]
   private static final int[] field_659 = new int[]{0, 150, 350, 550, 750};
   // $VF: renamed from: g int[]
   private int[] field_660 = new int[5];
   // $VF: renamed from: c aa
   private class_35 field_661;
   // $VF: renamed from: d aa
   private class_35 field_662;
   // $VF: renamed from: e aa
   private class_35 field_663;
   // $VF: renamed from: f aa
   private class_35 field_664;
   // $VF: renamed from: h int[]
   private int[] field_665;
   // $VF: renamed from: i int[]
   private int[] field_666;
   // $VF: renamed from: al int
   private int field_667;
   // $VF: renamed from: am int
   private int field_668;
   // $VF: renamed from: j int[]
   private int[] field_669;
   // $VF: renamed from: an int
   private int field_670;
   // $VF: renamed from: ao int
   private int field_671;
   // $VF: renamed from: ap int
   private int field_672;
   // $VF: renamed from: aq int
   private int field_673;
   // $VF: renamed from: ar int
   private int field_674;
   // $VF: renamed from: g aa
   private class_35 field_675;

   // $VF: renamed from: a () java.lang.String
   public final String method_339() {
      return this.field_650;
   }

   // $VF: renamed from: b () java.lang.String
   public final String method_340() {
      return this.field_651;
   }

   // $VF: renamed from: c () java.lang.String
   public final String method_341() {
      return this.field_652;
   }

   // $VF: renamed from: d () java.lang.String
   public final String method_342() {
      return this.field_653;
   }

   // $VF: renamed from: h () void
   private void method_343() {
      this.field_656.append(this.field_609);
      this.field_650 = this.field_656.toString();
      this.field_656.delete(0, this.field_656.length());
   }

   // $VF: renamed from: i () void
   private void method_344() {
      this.field_656.append(this.field_579);
      this.field_651 = this.field_656.toString();
      this.field_656.delete(0, this.field_656.length());
   }

   // $VF: renamed from: j () void
   private void method_345() {
      this.field_656.append(this.field_578);
      this.field_652 = this.field_656.toString();
      this.field_656.delete(0, this.field_656.length());
   }

   // $VF: renamed from: k () void
   private void method_346() {
      int var1 = this.field_622 / 1000 / 60;
      int var2 = this.field_622 / 1000 % 60;
      this.field_656.append(var1);
      if (var2 < 10) {
         this.field_656.append(this.field_655);
      } else {
         this.field_656.append(this.field_654);
      }

      this.field_656.append(var2);
      this.field_653 = this.field_656.toString();
      this.field_656.delete(0, this.field_656.length());
   }

   class_26(class_18 var1) {
      this.field_657 = var1;
      this.field_656 = new StringBuffer(5);
   }

   // $VF: renamed from: a (int, int) void
   public final void method_347(int var1, int var2) {
      this.field_608 = var1;
      this.field_577 = var2;
      this.field_618 = new class_34();
      this.field_617 = new class_1();
      this.field_620 = new class_13[25];

      for (int var3 = 0; var3 < 25; var3++) {
         this.field_620[var3] = new class_13();
      }

      this.field_595 = new class_31[5];

      for (int var4 = 0; var4 < 5; var4++) {
         this.field_595[var4] = new class_31();
      }

      this.field_596 = new class_31[5];

      for (int var5 = 0; var5 < 5; var5++) {
         this.field_596[var5] = new class_31();
      }

      this.field_590 = new short[512];
      this.field_619 = new class_29();
      this.field_624 = new class_21();
      if (this.field_608 == 2) {
         this.field_623 = new class_27();
      }

      this.field_599 = new int[20];
      if (this.field_608 != 2) {
         this.field_631 = class_15.method_178(131265);
         this.field_632 = class_15.method_178(131264);
         this.field_632.method_451(0, -1, false);
         this.field_632.method_454(0);
         this.field_633 = this.field_632.method_446(0).field_394;
         this.field_634 = this.field_632.method_446(0).field_395;
         this.field_639 = this.field_633;
         this.field_640 = this.field_634 >> 1;
         this.field_627 = new int[3];
         this.field_628 = new int[3];
      }

      if (this.field_608 == 0) {
         this.field_669 = new int[class_17.field_310[2]];
         this.field_662 = class_15.method_178(131267);
         this.field_663 = class_15.method_178(131266);
         this.field_662.method_451(0, 1, false);
         this.field_663.method_451(0, 1, false);
         this.field_667 = this.field_662.method_442();
         this.field_668 = this.field_663.method_442();
         this.field_664 = class_15.method_178(131458);
      }

      if (this.field_608 == 0) {
         this.field_673 = 137330;
         this.field_673 = class_8.method_112(this.field_673);
         this.field_674 = 44300;
         this.field_674 = class_8.method_112(this.field_674);
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_348(Graphics var1) {
      this.field_617.method_11(var1, this.field_602, this.field_603, this.field_604);
      if (this.field_578 == 0 && this.field_595[0] != null) {
         int var5 = this.field_602 + (15 * this.field_595[0].method_396() >> 8);
         int var6 = this.field_603 - (15 * (-this.field_617.method_18() + (this.field_617.method_18() - this.field_604) * class_1.field_31[0] / 1000) >> 8);
         this.field_675.method_449(var5, var6 - this.field_617.method_13());
      }

      if (this.field_649) {
         this.field_632.method_450(var1, this.field_635, this.field_636);
         this.field_631.method_450(var1, this.field_635, this.field_636);
      }

      if (this.field_608 == 2) {
         class_27 var10000 = this.field_623;
         int var10002 = this.field_617.method_13();
         int var8 = this.field_604;
         int var2 = this.field_603;
         int var7 = this.field_602;
         int var27 = var10002;
         Graphics var25 = var1;
         class_27 var4 = var10000;
         class_37.method_621();
         int var12 = var2 - (15 * (0 - var8) >> 8);
         var1.setColor(255, 0, 0);
         int var13 = var7;
         int var45;
         if (var4.field_676 == null) {
            var45 = 0;
         } else {
            if (var4.field_677 < var4.field_678 && var4.field_681 > var4.field_676[var4.field_677] * 100) {
               var4.field_677++;
            }

            var45 = var4.field_677;
         }

         int var14 = var45;
         int var15 = var12 - var27 - (var14 - 1) * field_569;

         for (int var17 = 0; var17 < var14; var15 += field_569) {
            var4.field_683.method_450(var25, var13 + var4.field_682[var14 - var17], var15);
            var17++;
         }
      }

      if (this.field_610 != null) {
         class_11 var46 = this.field_610;
         int var48 = this.field_602;
         int var10003 = this.field_603;
         int var10004 = this.field_604;
         int var9 = this.field_617.method_13();
         int var34 = var10004;
         int var31 = var10003;
         int var28 = var48;
         class_11 var22 = var46;
         if (var46.field_239 != -1) {
            int var11 = var31 - (15 * -var34 >> 8) - var9 + field_569 / 2 - class_17.field_312[var22.field_240][var22.field_239] * field_569;
            var22.field_242.method_450(var1, var28, var11);
         }
      }

      int var18 = Math.min(this.field_578, 5);

      for (int var3 = 0; var3 < var18; var3++) {
         this.field_596[var3].method_390(var1, this.field_602, this.field_603, 0, this.field_604, this.field_618);
         int var37 = var3;
         int var35 = this.field_604;
         int var32 = this.field_603;
         int var29 = this.field_602;
         Graphics var26 = var1;
         class_21 var23 = this.field_624;

         for (int var10 = 0; var10 < 5; var10++) {
            int var39;
            if ((var39 = var23.field_399[var10]) != -1 && (var23.field_402[var10] < 0 || var37 == var23.field_402[var10])) {
               int var41 = var29 + (15 * var23.field_397[var10] >> 8);
               int var42 = var32 - (15 * (var23.field_398[var10] - var35) >> 8);
               switch (var39) {
                  case 3:
                     int var43 = var23.field_401[var10];
                     char var44 = ' ';
                     if (var43 >= 20000) {
                        var43 -= 20000;
                        var44 = 'p';
                     } else if (var43 >= 10000) {
                        var43 -= 10000;
                        var44 = 's';
                     }

                     int var16 = Math.min(1024, (var23.field_400[var10] << 10) / 500);
                     if (var23.field_400[var10] > var23.field_405[var39] - 500) {
                        var16 = Math.min(1024, (var23.field_405[var39] - var23.field_400[var10] << 10) / 500);
                     }

                     class_37.method_648().method_304(var16, var16);
                     if (var23.field_403[var39] != null) {
                        class_7.method_67(var26, var23.field_403[var39], var43, -1, var44, true, var41, var42, 3);
                     } else {
                        if (var23.field_411 != var43) {
                           var23.field_411 = var43;
                           var23.field_412 = null;
                           var23.field_412 = "+" + var43 + "" + var44;
                        }

                        class_8.field_195.method_22(var26, var23.field_412, var41, var42, 17);
                     }

                     class_37.method_648().method_293(0);
                     class_37.method_648().method_304(1024, 1024);
                     break;
                  default:
                     if ((var39 < 4 || var39 > 7) && var23.field_403[var39] != null) {
                        var23.field_403[var39].method_450(var26, var41, var42);
                     }
               }
            }
         }
      }

      boolean var21;
      if (!(var21 = this.field_595[0].method_408() == 6 || this.field_595[0].method_408() == 1 || this.field_595[0].method_408() == 3)) {
         this.field_618.method_433(var1, this.field_602, this.field_603, 0, this.field_604, var21, this.field_595[0]);
      }

      for (int var19 = 0; var19 < 5; var19++) {
         this.field_595[var19].method_390(var1, this.field_602, this.field_603, 0, this.field_604, this.field_618);
      }

      this.field_624.method_238(var1, this.field_602, 0);
      if (var21) {
         this.field_618.method_433(var1, this.field_602, this.field_603, 0, this.field_604, var21, this.field_595[0]);
      }

      for (int var20 = 0; var20 < 25; var20++) {
         this.field_620[var20].method_164(var1, this.field_602, this.field_603, 0, this.field_604);
      }

      if (this.field_610 != null) {
         class_11 var47 = this.field_610;
         int var49 = this.field_602;
         int var50 = this.field_603;
         int var51 = this.field_604;
         int var38 = this.field_617.method_13();
         int var36 = var51;
         int var33 = var50;
         int var30 = var49;
         class_11 var24 = var47;
         if (var47.field_239 != -1) {
            int var40 = var33 - (15 * -var36 >> 8) - var38 + field_569 / 2 - class_17.field_312[var24.field_240][var24.field_239] * field_569;
            var24.field_241.method_450(var1, var30, var40);
         }
      }

      if (this.field_661 != null) {
         this.field_661.method_450(var1, class_37.method_608() >> 1, class_37.method_621() >> 1);
      }
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics) void
   public final void method_349(Graphics var1) {
      class_29 var7 = this.field_619;
      int var2;
      int var3 = (var2 = class_37.method_608()) >> 1;
      int var4 = class_37.method_621();
      if (var7.field_700 > 0) {
         int var5 = 0;
         switch (class_18.method_216()) {
            case 1:
            case 2:
               var5 = 0 + var7.field_709.method_458() - var7.field_709.method_460() / 8;
            default:
               var7.field_707.method_450(var1, var3, var5);
               int var6 = var7.field_700 * var7.field_707.method_459() / 6000;
               var1.setClip(var3 - var7.field_707.method_459() / 2, 0, var6, var4);
               var7.field_708.method_450(var1, var3, var5);
               var1.setClip(0, 0, var2, var4);
               var7.field_709.method_450(var1, var3, var5);
               if (var7.field_701 > 0) {
                  var2 = class_37.method_608() >> 1;
                  if (var7.field_706 < 3) {
                     var3 = Math.min(1024, (var7.field_701 << 10) / 500);
                     class_37.method_648().method_304(var3, var3);
                     if (var7.field_701 < 500) {
                        class_37.method_648().method_293((var7.field_701 << 8) / 500 << 8);
                     }
                  }

                  var3 = -var7.field_707.method_458() + var7.field_710.method_460() / 2;
                  switch (class_18.method_216()) {
                     case 1:
                     case 2:
                        var3 = var3 + var7.field_709.method_458() - var7.field_709.method_460() / 8;
                     default:
                        class_7.method_67(var1, var7.field_710, var7.field_699, -1, 'x', false, var2, var3, 33);
                        class_37.method_648().method_293(0);
                        class_37.method_648().method_304(1024, 1024);
                  }
               }
         }
      }
   }

   // $VF: renamed from: a (int) int
   public final int method_350(int var1) {
      if (var1 == 0) {
         return -1;
      } else {
         int var2 = class_37.method_608();
         this.field_602 = var2 >> 1;
         this.field_603 = field_569 / 3;
         if (this.field_607 > 0) {
            this.field_602 = this.field_602 + (class_7.method_63(4) - 2);
            this.field_603 = this.field_603 + (class_7.method_63(4) - 2);
         }

         this.field_611 += var1;
         this.method_359(var1);
         this.field_617.method_12(var1);
         this.field_618.method_434(this.field_595[0], var1);
         int var3 = var1;
         class_26 var13 = this;
         int var4 = 0;
            boolean var4f = false;
         this.field_613 = false;
         int var5 = 0;

         while (true) {
            if (var5 >= 5) {
               var5 = var13.field_608 == 2 ? 100 : 400;
               if (var13.field_595[0].method_408() == 4 && var13.field_616 < var13.field_611 - var5 && !var4f && var13.field_576 != 2) {
                  var13.field_595[0].method_407(1);
                  class_31 var76 = var13.field_595[0];
                  Object var38 = null;
                  var76.method_393(var13.field_618.field_763);
                  var13.field_595[0].method_394(var13.field_618.field_764);
                  var13.field_595[0].method_402(var13.field_618.field_765);
                  var13.field_595[0].method_397(0, 0);
                  var13.field_595[0].method_412(var13.field_608, var13.field_577, var13.field_578);
                  var13.field_594++;
                  if (var13.field_609 <= 0) {
                     var13.method_373();
                     var13.field_568 = 0;
                  }

                  var13.field_587 = Math.max(0, Math.min(4, var13.field_578 - 1));
               }
               break;
            }

            if (var13.field_595[var5] != null) {
               class_31 var6;
               int var7;
               if ((var7 = (var6 = var13.field_595[var5]).method_408()) == 1 || var7 == 6) {
                  break;
               }

               if (var7 == 3) {
                  var13.field_595[var5].method_394(var13.field_595[var5].method_395() + (15 * (var13.field_611 - var13.field_616) >> 8));
                  int var74 = var13.field_595[var5].method_395();
                  Object var36 = null;
                  if (var74 >= var13.field_618.field_762 - 512 && var13.field_576 != 2) {
                     var13.field_595[0].method_407(6);
                     boolean var51 = false;
                     var13.field_618.field_761 = 0;
                     var13.field_587 = Math.min(4, var13.field_578 - 1);
                     var13.field_618.method_437();
                  }

                  class_34 var75 = var13.field_618;
                  var4 = var13.field_595[0].method_395();
                  int var68 = var13.field_595[0].method_396();
                  class_34 var62 = var75;
                  var75.field_763 = var68;
                  var62.field_764 = var4;
                  break;
               }

               if (var7 == 7) {
                  if (var13.field_616 + var13.field_660[var5] < var13.field_611) {
                     class_31 var8;
                     (var8 = var13.field_595[var5]).method_392(var13.field_596[var13.field_585].method_396(), var13.field_596[var13.field_585].method_395());
                     var8.method_407(5);
                     var8.method_417(var13.field_596[var13.field_585].method_418());
                     var8.method_400(var8.method_395());
                     var8.method_403(var13.field_596[var13.field_585].method_404());
                     var13.method_355(-1);
                  }

                  var4f = true;
               } else if (var7 == 2 || var7 == 5) {
                  int var59 = var13.field_611 - var13.field_616;
                  var4 = var13.field_595[var5].method_404();
                  int var9 = var13.field_595[var5].method_406();
                  if (var4 < var9 && var4 != 999) {
                     var13.field_595[var5].method_403(Math.min(var9, var4 + var59 * (var9 - var4) / 5000));
                  } else if (var4 > var9 && var4 != 999) {
                     var13.field_595[var5].method_403(Math.max(var9, var4 - var59 * (var4 - var9) / 5000));
                  }

                  int var10 = var6.method_395();
                  int var11 = field_570;
                  if (var13.field_578 == var13.field_593 - 1) {
                     var11 = field_574;
                  }

                  var6.method_394(var6.method_401() + var6.method_399() * var59 / var11 - var59 * var59 / 100);
                  int var12 = var11 * 3 >> 2;
                  if (var6.method_395() < var10 - var12) {
                     var6.method_394(var10 - var12);
                  }

                  var6.method_393(var6.method_396() + var6.method_398() * var3 / 256);
                  if (var6.method_395() < var13.field_604 - (class_37.method_621() << 8) / 15 * 3 / 2) {
                     var6.method_407(4);
                     if (var7 == 2) {
                        var13.field_619.method_384();
                        var13.method_371(1);
                        var13.field_613 = true;
                     }
                  }

                  if (var7 == 2) {
                     if (var13.field_649 && var13.method_362()) {
                        var13.method_361();
                     }

                     boolean var10000;
                     label550: {
                        if (var13.field_578 == 0) {
                           if (var13.field_595[0].method_395() - field_570 >= var13.field_617.method_14()) {
                              var10000 = false;
                              break label550;
                           }

                           var11 = 1;
                        } else {
                           var11 = var13.method_354(false);
                        }

                        if (var13.field_576 == 1 && var13.field_587 != 4 && var11 != 4) {
                           var13.field_595[0].method_407(3);
                           var13.method_371(1);
                        } else if (var11 != -1) {
                           var13.field_616 = var13.field_611;
                           int var46 = Math.abs(var4 = var13.field_595[0].method_396() - var13.field_596[var11].method_396());
                           if (var13.field_578 == 0) {
                              switch (var13.field_595[0].method_416()) {
                                 case 2:
                                    var13.field_619.method_385(var13.field_608, var13.field_576, var13.field_578);
                                 default:
                                    var13.field_612 = var13.field_611;
                                    Object var33 = null;
                                    var13.field_607 = 600;
                                    var4 = var13.field_595[0].method_396();
                                    var13.field_595[0].method_407(4);
                                    var13.field_595[0].method_403(0);
                                    var13.field_586 = var4;
                                    var13.field_592 = var4;
                                    var13.field_590[0] = (short)var4;
                                    var13.field_589[0] = var13.field_595[0].method_413();
                                    var13.method_355(1);
                                    var10000 = true;
                                    break label550;
                              }
                           }

                           if (var11 != Math.min(4, var13.field_578 - 1)) {
                              var13.field_597 = 0;
                              int var49 = var4 / var46;
                              var7 = Math.min(4, var13.field_578 - 1) - var11 + 1;
                              var13.method_356(-var49, var7);
                              var13.field_619.method_384();
                              var13.field_595[0].method_407(5);
                              var13.field_595[0].method_397(var49 * 250, 50);
                              var13.field_595[0].method_400(var13.field_595[0].method_395());
                              var13.field_595[0].method_405(-var49 * 45);
                              var13.field_616 = var13.field_611;
                              var10000 = true;
                              break label550;
                           }

                           var13.method_357(var4);
                           if (var4 <= 443 && var4 >= -443) {
                              boolean var48 = var46 < class_17.field_311[var13.field_577];
                              if (var13.field_595[0].method_419()) {
                                 if ((var7 = var13.field_595[0].method_418()) == 12) {
                                    var13.field_619.method_385(var13.field_608, var13.field_576, var13.field_578);
                                 } else if (var7 == 13) {
                                    var13.field_583 = 7000;
                                 } else if (var7 == 14) {
                                    var13.field_609++;
                                    var13.method_343();
                                 } else if (var7 == 15) {
                                    var13.method_358(50, var13.field_578, true);
                                 }

                                 var13.method_381(var7);
                                 var13.field_624
                                    .method_239(
                                       var13.field_596[var13.field_587 + 1].method_396(),
                                       var13.field_596[var13.field_587 + 1].method_395(),
                                       var7 + 4 - 12,
                                       var13.field_587 + 1,
                                       0
                                    );
                              }

                              switch (var13.field_595[0].method_416()) {
                                 case 2:
                                    var13.field_619.method_385(var13.field_608, var13.field_576, var13.field_578);
                              }

                              var13.field_595[0].method_407(4);
                              var13.field_612 = var13.field_611;
                              var13.field_592 += var4;
                              if (!var48) {
                                 var13.field_624
                                    .method_239(
                                       var13.field_596[var13.field_587 + 1].method_396(),
                                       var13.field_596[var13.field_587 + 1].method_395(),
                                       1,
                                       var13.field_587 + 1,
                                       0
                                    );
                                 var13.field_619.method_386();
                                 var13.field_598--;
                                 var7 = class_31.field_713[var13.field_595[0].method_413()][3];
                                 if (var13.field_598 < var7) {
                                    var13.field_598 = var7;
                                 }

                                 var13.field_597 = 0;
                                 var13.field_588[var13.field_578 % 20] = var4;
                                 var13.field_589[var13.field_578 % 20] = var13.field_595[0].method_413();
                                 var13.method_358(var13.field_598, var13.field_578, false);
                              } else {
                                 var13.field_624
                                    .method_239(
                                       var13.field_596[var13.field_587 + 1].method_396(),
                                       var13.field_596[var13.field_587 + 1].method_395(),
                                       1,
                                       var13.field_587 + 1,
                                       0
                                    );
                                 var13.field_592 -= var4;
                                 if (var13.field_578 > 0) {
                                    var13.field_624
                                       .method_239(
                                          var13.field_596[var13.field_587 + 1].method_396(),
                                          var13.field_596[var13.field_587 + 1].method_395(),
                                          2,
                                          var13.field_587 + 1,
                                          0
                                       );
                                 }

                                 var13.field_598++;
                                 var7 = class_31.field_713[var13.field_595[0].method_413()][4];
                                 if (var13.field_598 > var7) {
                                    var13.field_598 = var7;
                                 }

                                 var13.field_597++;
                                 var13.field_657.method_229(1, var13.field_597);
                                 label466:
                                 if (var13.field_608 == 2 && var13.field_622 >= 0) {
                                    var13.field_622 += 1000;
                                    var13.method_346();
                                    if (var13.field_610 != null) {
                                       Object var32 = null;
                                       if (var13.field_610.field_239 != -1 && var13.field_578 + 1 >= class_17.field_312[1][var13.field_610.field_239]) {
                                          break label466;
                                       }
                                    }

                                    var13.field_624
                                       .method_239(
                                          var13.field_596[var13.field_587 + 1].method_396(),
                                          var13.field_596[var13.field_587 + 1].method_395() + field_570 / 2,
                                          3,
                                          -1,
                                          10001
                                       );
                                 }

                                 var13.field_588[var13.field_578 % 20] = 0;
                                 var13.field_589[var13.field_578 % 20] = var13.field_595[0].method_413();
                                 var13.field_619.method_385(var13.field_608, var13.field_576, var13.field_578);
                                 var13.method_358(var13.field_598, var13.field_578, false);
                              }

                              if (var13.field_608 == 0) {
                                 var13.method_369(false);
                              }

                              var13.method_355(1);
                              if (var13.field_576 == 1) {
                                 var13.field_619.method_384();
                              }

                              var10000 = true;
                              break label550;
                           }

                           var13.field_619.method_384();
                           var13.field_597 = 0;
                           if (var13.field_576 == 1) {
                              var13.field_595[0].method_407(3);
                              var13.method_371(1);
                           } else {
                              var13.field_595[0].method_407(5);
                              int var47 = var4 / Math.abs(var4);
                              var13.method_356(var47, -1);
                              var13.field_595[0].method_397(var47 * 250, 50);
                              var13.field_595[0].method_400(var13.field_595[0].method_395());
                              var13.field_595[0].method_405(var47 * 45);
                              var13.field_616 = var13.field_611;
                           }
                        }

                        var10000 = false;
                     }

                     if (var10000) {
                        if (var13.field_576 == 4) {
                           var13.field_576 = 0;
                        } else if (var13.field_578 == var13.field_593 - 1 && var13.field_608 == 0 && var13.field_576 != 1) {
                           var13.field_576 = 1;
                           var13.field_619.method_384();
                           class_31 var73 = var13.field_595[0];
                           Object var35 = null;
                           var73.method_394(var13.field_618.field_762);
                           var13.field_595[0].method_407(6);
                           var13.field_595[0].method_412(var13.field_608, var13.field_577, var13.field_578);
                           boolean var50 = false;
                           var13.field_618.field_761 = 0;
                           var13.field_618.method_437();
                           var13.field_618.method_434(var13.field_595[0], 1);
                           var13.field_587 = Math.min(4, var13.field_578 - 1);
                        } else if (var13.field_576 == 1) {
                           var13.method_353();
                        }
                     }
                  }

                  var4 = 1;
               }
            }

            var5++;
         }

         if (this.field_583 > 0) {
            this.field_583 -= var1;
            if (this.field_583 <= 0) {
               this.method_381(-1);
            }
         } else {
            this.field_658 = 0;
            if (this.field_576 == 2) {
               if (this.field_580 > 0) {
                  this.field_580--;
               } else if (this.field_580 < 0) {
                  this.field_580++;
               }
            } else {
               this.field_582 = (this.field_582 + var1) % 2560;
               this.field_658 = class_7.method_62(this.field_582 / 10);
               this.field_580 = this.field_581 * this.field_658 >> 16;
            }

            if (this.field_578 <= 4) {
               this.field_658 = 0;
            }

            this.field_591 = -(this.field_658 * this.field_581) / 100;
         }

         class_26 var14 = this;
         var3 = 0;
         var4 = this.field_586 + this.field_591;
         int var52 = (var5 = Math.max(0, this.field_578 - 5)) * field_570 + this.field_617.method_14();
         int var57 = 0;
         int var60 = 0;

         for (int var61 = var5; var61 < var14.field_578; var61++) {
            var5 = var14.field_588[var61 % 20];
            var14.field_596[var3].method_411(var14.field_589[var61 % 20]);
            int var63;
            if (var14.field_658 > 0) {
               if (var5 < 0) {
                  var63 = var60 + var14.field_614 * var5 * var14.field_658;
               } else {
                  var63 = var60 + -(var14.field_614 * var5 * var14.field_658) / 2;
               }
            } else if (var5 > 0) {
               var63 = var60 - var14.field_614 * var5 * var14.field_658;
            } else {
               var63 = var60 + var14.field_614 * var5 * var14.field_658 / 2;
            }

            int var64;
            var60 = var64 = var63 / 2;
            var63 = var64 / 30500;
            int var69 = 0;
            if (var61 == var14.field_578 - 1 && var61 != var14.field_593 - 1) {
               int var71;
               if ((var71 = var14.field_611 - var14.field_612) < 100) {
                  var69 = 0 + var5 / 36 + var71 * var5 / 3600;
               } else if (var71 < 500) {
                  var69 = 0 + var5 / 36 + (400 - (var71 - 100)) * var5 / 14400;
                  var14.field_615 = var69;
               } else if (var71 < 800) {
                  var69 = var14.field_615 - var14.field_615 * (var71 - 500) / 300;
               }
            }

            int var70;
            int var72 = (var70 = (var69 << 8) + var63) >> 8;
            if (var14.field_658 > 0) {
               var57 = var72 * 300 / 100;
            } else {
               var57 = -var72 * 300 / 100;
            }

            var14.field_596[var3].method_403(var70);
            if (var14.field_583 > 0) {
               var14.field_596[var3].method_403(0);
            }

            var63 = var72 * 1100 / 100;
            var4 += var5 + var63;
            var14.field_596[var3].method_407(9);
            var14.field_596[var3].method_420(var14.field_619.field_700 >= 0 && var61 >= var14.field_619.field_704);
            var14.field_596[var3].method_393(var4);
            var14.field_596[var3].method_394(var52 + var57 + var14.field_575);
            var52 = var14.field_596[var3].method_395();
            var3++;
         }

         if (this.field_578 == 0 && this.field_595[0] != null && this.field_595[0].method_408() != 6 && this.field_595[0].method_408() != 1) {
            this.field_675.method_448(var1);
         }

         var3 = var1;
         class_21 var15 = this.field_624;

         for (int var40 = 0; var40 < 5; var40++) {
            if (var15.field_399[var40] != -1) {
               var5 = var15.field_399[var40];
               if (var15.field_403[var5] != null) {
                  var15.field_403[var5].method_448(var3);
               }

               if (var15.field_405[var5] != -1 || var15.field_403[var5] == null) {
                  var15.field_400[var40] = var15.field_400[var40] + var3;
                  if (var15.field_400[var40] >= var15.field_405[var5]) {
                     var15.field_399[var40] = -1;
                  }
               } else if (var15.field_403[var5].method_456()) {
                  var15.field_399[var40] = -1;
               }
            }
         }

         class_29 var16 = this.field_619;
         if (this.field_619.field_700 > 0) {
            var16.field_700 = var16.field_700 - var1 - (var16.field_698 - 1) * var1 / 6;
            var16.field_701 += var1;
            var16.field_709.method_448(var1);
            var16.field_708.method_448(var1);
            if (var16.field_700 <= 0) {
               var16.method_384();
            }
         } else {
            if (var16.field_700 > -2000) {
               var16.field_700 -= var1;
            }

            if (var16.field_701 > 0) {
               var16.field_701 += var1;
               if (var16.field_701 > 3000) {
                  var16.field_701 = 0;
               }
            }
         }

         class_29 var17 = this.field_619;
         var3 = this.field_619.field_703;
         var17.field_703 = 0;
         if (var3 > 0) {
            this.method_358(var3, this.field_578 - 1, true);
         }

         if (this.field_610 != null) {
            class_11 var18 = this.field_610;
            this.field_610.field_242.method_448(var1);
            var18.field_241.method_448(var1);
         }

         for (int var19 = 0; var19 < 5; var19++) {
            this.field_595[var19].method_391(var1);
         }

         for (int var20 = 0; var20 < Math.min(this.field_578, 5); var20++) {
            this.field_596[var20].method_391(var1);
         }

         if (this.field_608 == 0) {
            this.field_671 = this.field_595[0].method_396();
            if (this.field_578 >= 1) {
               var2 = Math.min(this.field_578, 5);
               this.field_672 = this.field_596[var2 - 1].method_396();
            }
         }

         for (int var22 = 0; var22 < 25; var22++) {
            this.field_620[var22].method_165(var1, this.field_578, this.field_596);
         }

         if (this.field_608 == 2 && this.field_622 > 0 && this.field_601) {
            this.field_622 -= var1;
            if (this.field_622 < 0) {
               this.field_622 = 0;
            }

            this.method_346();
            if (this.field_622 <= 0) {
               this.method_373();
               this.field_568 = 0;
            }
         }

         if (this.field_608 == 2 && this.field_578 > 0) {
            Object var23 = null;
            this.field_623.field_681 += var1;
         }

         if (this.field_649) {
            this.field_632.method_448(var1);
            this.field_630 += var1;
            if (this.field_630 >= 650) {
               this.field_630 = 0;
               this.field_629++;
               if (this.field_629 >= 4) {
                  this.field_629 = 0;
               }

               this.field_631.method_454(this.field_629);
            }

            this.field_641 += var1;
            if (this.field_641 > this.field_645) {
               this.field_641 = this.field_641 - this.field_645;
               if (this.field_647 == 3) {
                  this.field_637 = this.field_637 - this.field_639;
               } else if (this.field_647 == 4) {
                  this.field_637 = this.field_637 + this.field_639;
               }
            }

            this.field_642 += var1;
            if (this.field_642 > this.field_646) {
               this.field_642 = this.field_642 - this.field_646;
               if (this.field_648 == 1) {
                  this.field_638 = this.field_638 - this.field_640;
                  this.field_648 = 2;
               } else if (this.field_648 == 2) {
                  this.field_638 = this.field_638 + this.field_640;
                  this.field_648 = 1;
               }
            }

            this.field_643 = this.field_639 * this.field_641 / this.field_645;
            this.field_644 = this.field_640 * this.field_642 / this.field_646;
            if (this.field_647 == 3) {
               this.field_635 = this.field_637 - this.field_643;
            } else if (this.field_647 == 4) {
               this.field_635 = this.field_637 + this.field_643;
            }

            if (this.field_648 == 1) {
               this.field_636 = this.field_638 - this.field_644;
            } else if (this.field_648 == 2) {
               this.field_636 = this.field_638 + this.field_644;
            }

            switch (this.field_647) {
               case 3:
                  if (this.field_635 < -(this.field_633 >> 1)) {
                     this.field_649 = false;
                  }
                  break;
               case 4:
                  if (this.field_635 > class_37.method_608() + (this.field_633 >> 1)) {
                     this.field_649 = false;
                  }
            }

            if (this.field_636 > class_37.method_621() + (this.field_634 >> 1)) {
               this.field_649 = false;
            }
         }

         if (this.field_661 != null) {
            this.field_661.method_448(var1);
         }

         if (this.field_608 == 0) {
            var3 = var1;
            class_26 var24 = this;

            for (int var41 = 0; var41 < var24.field_666.length; var41++) {
               var24.field_666[var41] = var24.field_666[var41] + var3;
               switch (var24.field_665[var41]) {
                  case 0:
                     if (var24.field_666[var41] > var24.field_667) {
                        var24.field_666[var41] = var24.field_667;
                     }
                     break;
                  case 1:
                     if (var24.field_666[var41] > var24.field_668) {
                        var24.field_666[var41] = var24.field_668;
                     }
               }
            }
         }

         var2 = this.field_568;
         this.field_568 = -1;
         if (var2 == 0) {
            this.field_595[0].method_407(0);
            this.field_619.method_384();
         }

         return var2;
      }
   }

   // $VF: renamed from: a () void
   public final void method_351() {
      switch (this.field_577) {
         case 0:
            field_569 = 56;
            field_571 = 54;
            field_573 = 58;
            break;
         case 1:
            field_569 = 54;
            field_571 = 55;
            field_573 = 53;
            break;
         case 2:
            field_569 = 54;
            field_571 = 57;
            field_573 = 51;
      }

      field_570 = (field_569 << 8) / 15;
      field_572 = (field_571 << 8) / 15;
      field_574 = (field_573 << 8) / 15;
      this.field_575 = field_570 - 85;
      this.field_602 = class_37.method_608() >> 1;
      this.field_603 = field_569 / 3;
      class_8.field_200 = true;
      this.field_675 = class_15.method_178(131233);
      this.field_675.method_451(0, 1, false);

      for (int var1 = 0; var1 < 25; var1++) {
         this.field_620[var1].method_166(0, false);
      }

      this.field_621 = 0;

      for (int var8 = 0; var8 < 5; var8++) {
         this.field_595[var8].method_407(0);
      }

      for (int var9 = 0; var9 < 5; var9++) {
         this.field_596[var9].method_407(0);
         this.field_596[var9].method_421();
      }

      this.field_609 = 3;
      this.field_601 = false;
      this.field_611 = 0;
      this.field_612 = this.field_611 - 100;
      this.field_614 = 0;
      this.field_568 = -1;
      this.field_576 = 0;
      this.field_578 = 0;
      this.method_345();
      this.field_586 = 0;
      this.field_591 = 0;
      this.field_592 = 0;
      this.field_587 = 1;
      this.field_594 = 0;
      this.field_583 = 0;
      this.field_579 = 0;
      this.method_344();
      this.field_598 = 1;
      this.field_625 = 0;
      this.field_597 = 0;
      this.field_588 = new int[20];
      this.field_589 = new int[20];
      class_21 var10 = this.field_624;

      for (int var2 = 0; var2 < 5; var2++) {
         var10.field_399[var2] = -1;
      }

      this.field_604 = (class_37.method_621() << 8) / 15;
      this.field_604 = this.field_604 + this.field_617.method_14();
      this.field_604 = this.field_604 - 2 * this.field_617.method_16();
      this.field_604 = this.field_604 - (field_572 + (field_572 >> 1));
      this.field_605 = this.field_604;
      this.field_607 = 0;
      this.field_617.method_17(this.field_604);
      this.method_359(0);
      int var10000 = (class_37.method_621() << 8) / 15;
      boolean var11 = false;
      int var12 = var10000 - this.field_617.method_14() - this.field_617.method_16() + (field_572 >> 1);
      int var25 = field_570;
      int var13;
      if ((var13 = var12 - var25) < field_570) {
         var13 = field_570;
      }

      class_34 var14 = null;
      this.field_618.field_776 = var13;
      int var5 = this.field_593;
      int var4 = this.field_578;
      int var3 = this.field_577;
      var25 = this.field_604;
      var14 = this.field_618;
      this.field_618.method_436(var25, var4, var5);
      var4 = var14.field_776 / 3;
      Object var28 = null;
      var14.field_761 = var4;
      var14.field_765 = 0;
      var14.field_775 = 0;
      var14.field_766 = 0;
      var14.field_767 = class_17.field_308[var3];
      var14.field_768 = 128;
      var14.field_769 = 64;
      var14.field_763 = var14.field_768 * class_7.method_62(200 * var14.field_775 / var14.field_767 % 256) >> 8;
      int var6 = -(var14.field_769 * class_7.method_61(200 * var14.field_775 / var14.field_767 % 256) >> 8);
      var14.field_764 = var14.field_762 - var14.field_766 - var14.field_761 + var6;
      class_29 var16 = this.field_619;
      this.field_619.field_700 = -2000;
      var16.field_701 = 0;
      var16.field_699 = var16.field_698 = 0;
      var16.field_702 = 0;
      var16.field_705 = 0;
      var16.field_703 = 0;

      for (int var17 = 0; var17 < this.field_599.length; var17++) {
         this.field_599[var17] = 0;
      }

      this.field_600 = 0;
      this.field_661 = null;
      label258:
      switch (this.field_608) {
         case 0:
            this.field_610 = null;
            this.field_593 = class_17.field_310[this.field_577];

            for (int var20 = 0; var20 < this.field_669.length; var20++) {
               this.field_669[var20] = -1;
            }

            this.field_665 = new int[3];
            this.field_666 = new int[3];
            if (this.field_657.method_184() == 45) {
               for (int var22 = 0; var22 < this.field_665.length; var22++) {
                  this.field_665[var22] = 1;
               }
            } else {
               for (int var21 = 0; var21 < this.field_665.length; var21++) {
                  this.field_665[var21] = 0;
               }
            }

            for (int var23 = 0; var23 < this.field_665.length; var23++) {
               this.field_666[var23] = 0;
            }

            var25 = class_7.method_64(1, 100);
            switch (this.field_577) {
               case 0:
                  if (var25 <= 30) {
                     this.field_626 = 0;
                  } else {
                     this.field_626 = 1;
                  }
                  break;
               case 1:
                  if (var25 <= 20) {
                     this.field_626 = 0;
                  } else if (var25 <= 80) {
                     this.field_626 = 1;
                  } else {
                     this.field_626 = 2;
                  }
                  break;
               case 2:
                  if (var25 <= 20) {
                     this.field_626 = 0;
                  } else if (var25 <= 50) {
                     this.field_626 = 1;
                  } else if (var25 <= 80) {
                     this.field_626 = 2;
                  } else {
                     this.field_626 = 3;
                  }
            }

            class_26 var24 = this;

            for (int var32 = 0; var32 < var24.field_627.length; var32++) {
               var24.field_627[var32] = class_17.field_310[2] + 1;
            }

            for (int var33 = 0; var33 < var24.field_627.length; var33++) {
               var24.field_628[var33] = -1;
            }

            for (int var37 = 0; var37 < var24.field_626; var37++) {
               boolean var34 = true;
               if (var37 <= 0) {
                  var24.field_628[var37] = class_7.method_64(3, class_17.field_310[var24.field_577] - 2);
               } else {
                  while (var34) {
                     var24.field_628[var37] = class_7.method_64(3, class_17.field_310[var24.field_577] - 2);
                     var34 = false;

                     for (int var42 = 0; var42 < var37; var42++) {
                        if (var24.field_628[var37] == var24.field_628[var42]) {
                           var34 = true;
                        }
                     }
                  }
               }
            }

            for (int var43 = 0; var43 < var24.field_626; var43++) {
               for (int var45 = 0; var45 < var24.field_626; var45++) {
                  if (var43 == 0) {
                     if (var24.field_628[var45] < var24.field_627[var43]) {
                        var24.field_627[var43] = var24.field_628[var45];
                     }
                  } else if (var43 < var24.field_626 - 1) {
                     if (var24.field_628[var45] < var24.field_627[var43]) {
                        for (int var48 = 0; var48 < var43; var48++) {
                           if (var24.field_628[var45] > var24.field_627[var48]) {
                              var24.field_627[var43] = var24.field_628[var45];
                           }
                        }
                     }
                  } else {
                     boolean var38 = false;

                     for (int var47 = 0; var47 < var24.field_627.length - 1; var47++) {
                        if (var24.field_628[var45] == var24.field_627[var47]) {
                           var38 = true;
                        }
                     }

                     if (!var38) {
                        var24.field_627[var43] = var24.field_628[var45];
                     }
                  }
               }
            }

            switch (this.field_577) {
               case 0:
                  this.field_645 = 500;
                  this.field_646 = 800;
                  break label258;
               case 1:
                  this.field_645 = 400;
                  this.field_646 = 700;
                  break label258;
               case 2:
                  this.field_645 = 300;
                  this.field_646 = 600;
               default:
                  break label258;
            }
         case 1:
            this.field_645 = 500;
            this.field_646 = 800;
            class_3 var19;
            if ((var25 = (var19 = class_3.method_25()).method_30(0)) > 0) {
               for (int var36 = 0; var36 < this.field_588.length; var36++) {
                  this.field_588[var36] = var19.method_30(var36 + 6);
               }

               this.field_592 = var19.method_30(4);
               this.field_586 = var19.method_30(5);
               this.field_658 = var19.method_30(1);
               this.field_609 = var19.method_30(2);
               this.field_579 = var19.method_30(3);
               this.method_344();
               this.method_355(1);
               this.method_355(class_17.field_312[0][var25 - 1] - 1);
               this.field_587 = Math.max(0, Math.min(4, this.field_578 - 1));
            }

            this.field_610 = new class_11(0);
            this.field_610.method_151(this.field_578);
            this.field_610.method_152(this.field_609, this.field_579, this.field_658, this.field_586, this.field_592, this.field_588);
            break;
         case 2:
            class_27 var18 = this.field_623;
            if (this.field_623.field_676 == null) {
               class_27 var29 = var18;
               byte[] var35;
               if ((var35 = class_37.method_636("GHST")) != null) {
                  try {
                     ByteArrayInputStream var40 = new ByteArrayInputStream(var35);
                     DataInputStream var44 = new DataInputStream(var40);
                     var29.field_678 = var35.length / 2;
                     var29.field_676 = new short[500];

                     for (int var46 = 0; var46 < var29.field_678; var46++) {
                        var29.field_676[var46] = var44.readShort();
                     }
                  } catch (IOException var7) {
                  }
               }

               var29.field_682 = new int[500];
               var29.field_682[0] = 0;

               for (int var41 = 1; var41 < 500; var41++) {
                  var29.field_682[var41] = class_7.method_63(26) - 13;
               }
            }

            if (var18.field_678 < var18.field_680) {
               var18.field_676 = var18.field_679;
               var18.field_678 = var18.field_680;
            }

            var18.field_677 = 0;
            var18.field_679 = new short[500];
            var18.field_680 = 0;
            var18.field_681 = 0;
            this.field_654 = ":";
            this.field_655 = ":0";
            this.field_622 = 30000;
            this.method_346();
            this.field_610 = new class_11(1);
      }

      this.method_343();
      this.field_595[0].method_407(6);
      this.field_595[0].method_412(this.field_608, this.field_577, this.field_578);
      this.field_618.method_435(this.field_608, this.field_577, this.field_578, this.field_593);
      this.field_618.method_434(this.field_595[0], 1);
      this.method_350(1);
   }

   // $VF: renamed from: b () void
   public final void method_352() {
      if (this.field_595[0] != null && (this.field_595[0].method_408() == 1 || this.field_595[0].method_408() == 6)) {
         this.field_601 = true;
         this.field_616 = this.field_611;
         this.field_595[0].method_407(2);
         int var1 = -this.field_618.field_770.method_446(0).field_393 * class_7.method_62(this.field_618.field_765) >> 10;
         var1 = this.field_618.field_764 - (var1 << 8) / 15;
         this.field_595[0].method_400(var1);
         this.field_595[0].method_405(0);
      }
   }

   // $VF: renamed from: l () void
   private void method_353() {
      this.field_576 = 2;
      this.field_568 = 0;
      this.field_616 = this.field_611;
   }

   // $VF: renamed from: a (boolean) int
   private int method_354(boolean var1) {
      int var2 = -1;
      int var3 = this.field_595[0].method_396();
      int var4 = this.field_595[0].method_395();
      int var5 = field_570;
      if (this.field_578 == this.field_593 - 1) {
         var5 = field_574;
      }

      if (this.field_587 == -1) {
         this.field_587 = 0;
      }

      if (var1) {
         class_31 var10000 = this.field_596[this.field_587];
         Object var8 = null;
         int var9 = var10000.method_395() - 85;
         if (var4 < var9) {
            this.field_587 = Math.max(0, this.field_587 - 1);
         }

         return this.field_587--;
      } else {
         do {
            class_31 var7;
            int var6 = (var7 = this.field_596[this.field_587]).method_395() - 85;
            if (var4 < var6) {
               this.field_587 = Math.max(0, this.field_587 - 1);
               var6 = (var7 = this.field_596[this.field_587]).method_395() - 85;
            }

            if (var4 >= var6 + var5 || var4 <= var6 - var5 || var3 >= var7.method_396() + 887 || var3 <= var7.method_396() - 887) {
               return var2;
            }

            var2 = this.field_587--;
         } while (this.field_587 >= 0);

         return var2;
      }
   }

   // $VF: renamed from: b (int) void
   private void method_355(int var1) {
      if (var1 > 0 && this.field_578 > 4) {
         this.field_586 = this.field_586 + this.field_588[this.field_584 % 20];
      } else if (var1 < 0) {
         this.field_592 = this.field_592 - this.field_588[(this.field_578 - 1) % 20];
      }

      this.field_578 += var1;
      this.method_345();
      if (this.field_608 == 2) {
         class_27 var2 = this.field_623;
         if (var1 == 1) {
            if (var2.field_680 < var2.field_679.length) {
               var2.field_679[var2.field_680++] = (short)(var2.field_681 / 100);
            }
         } else if (var2.field_680 > 0) {
            var2.field_680--;
         }
      }

      if (var1 < 0) {
         for (int var8 = 0; var8 < -var1; var8++) {
            this.field_600--;
            if (this.field_600 < 0) {
               this.field_600 = this.field_599.length - 1;
            }

            this.method_358(-this.field_599[this.field_600], -1, false);
         }
      }

      if (this.field_608 == 1) {
         this.field_657.method_229(3, this.field_578);
      }

      if (this.field_610 != null) {
         boolean var10000 = this.field_610.method_151(this.field_578);
         boolean var9 = false;
         if (var10000) {
            if (this.field_608 == 1) {
               this.method_360();
               this.field_610.method_152(this.field_609, this.field_579, this.field_658, this.field_586, this.field_592, this.field_588);
            } else if (this.field_608 == 2) {
               this.field_624
                  .method_239(this.field_596[this.field_587 + 1].method_396(), this.field_596[this.field_587 + 1].method_395() + field_570 / 2, 3, -1, 10012);
               this.field_622 += 12000;
               this.method_346();
            }
         }
      }

      this.field_584 = Math.max(0, this.field_578 - 5);
      this.field_585 = Math.min(4, this.field_578 - 1);
      if (var1 < 0) {
         this.field_586 = this.field_586 - this.field_588[this.field_584 % 20];
      }

      this.field_614 = 0;

      for (int var10 = this.field_584; var10 < this.field_578; var10++) {
         this.field_614 = this.field_614 + Math.abs(this.field_588[var10 % 20]);
      }

      this.field_614 /= 5;
      this.field_614 = Math.min(this.field_578 * this.field_614 / 20, 100);
      this.field_581 = Math.min(this.field_578 / 2 + Math.abs(this.field_592) / 20, this.field_578 * (this.field_578 / 2 + Math.abs(this.field_592) / 20) / 6);
      this.field_618.method_435(this.field_608, this.field_577, this.field_578, this.field_593);
      if (this.field_576 != 1 && this.field_576 != 4) {
         int var3 = var1 * field_570;
         this.field_606 = this.field_611;
         if (var3 > 0 && this.field_578 > 1 || var3 < 0 && this.field_578 >= 1) {
            this.field_605 += var3;
         }
      }

      if (this.field_608 == 0) {
         class_26 var11 = this;
         if (this.field_578 >= 2) {
            int var12;
            label117: {
               var12 = this.field_670;
               if (this.field_578 >= 1) {
                  int var4 = 0;

                  for (int var6 = 0; var6 < var11.field_578 - 1 && var11.field_669[var6] != -1; var6++) {
                     var4 += 1000 * var11.field_669[var6];
                  }

                  if ((var1 = var4 / (var11.field_578 - 1)) >= 1000) {
                     if (var1 >= 1000 && var1 < 1500) {
                        var11.field_670 = 1;
                        break label117;
                     }

                     if (var1 >= 1500 && var1 < 2500) {
                        var11.field_670 = 2;
                        break label117;
                     }

                     if (var1 >= 2500) {
                        var11.field_670 = 3;
                     }
                     break label117;
                  }
               }

               var11.field_670 = 0;
            }

            if (var12 != var11.field_670) {
               for (int var5 = 0; var5 < var11.field_665.length; var5++) {
                  if (var11.field_670 >= var5 + 1 && var5 + 1 > var12) {
                     var11.field_665[var5] = 1;
                     var11.field_666[var5] = 0;
                  } else if (var11.field_670 < var5 + 1 && var5 + 1 <= var12) {
                     var11.field_665[var5] = 0;
                     var11.field_666[var5] = 0;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: b (int, int) void
   private void method_356(int var1, int var2) {
      if (var2 != -1) {
         int var10 = this.field_585;
         if (var2 > 4) {
            var2 = 4;
         }

         for (int var11 = 0; var11 < var2; var11++) {
            if (this.field_578 == 1) {
               this.method_371(1);
               return;
            }

            class_31 var13;
            (var13 = this.field_595[var11 + 1]).method_405(-var1 * 45);
            var13.method_397(var1 * 400 - (4 - var11) * 30, 50 + (4 - var11) * 30);
            var13.method_407(5);
            class_31 var14 = this.field_596[var10];
            var13.method_392(var14.method_396(), var14.method_395());
            var13.method_411(var14.method_413());
            var13.method_400(var14.method_401());
            var13.method_403(var14.method_404());
            this.field_660[var11 + 1] = 0;
            this.method_355(-1);
            var10--;
         }

         if (!this.field_613) {
            this.method_371(1);
         }
      } else {
         int var3 = 1;
         byte var4 = 50;
         int var5 = 0;

         for (int var6 = Math.min(4, this.field_578 - 1);
            var6 > 0 && Math.abs(var1 = this.field_596[var6].method_396() - this.field_596[var6 - 1].method_396()) > var4;
            var6--
         ) {
            var5 = var1 / Math.abs(var1);
            class_31 var8;
            (var8 = this.field_595[var3]).method_402(-var5 * 45);
            var8.method_397(var5 * 400, 50);
            var8.method_407(7);
            var8.method_411(this.field_596[var6].method_413());
            this.field_660[var3] = field_659[var3];
            if (this.field_608 != 2) {
               for (int var9 = 0; var9 < 25; var9++) {
                  if (this.field_620[var9].method_167() == 0) {
                     this.field_620[var9].method_169(0, this.field_596[var6].method_395());
                     break;
                  }
               }
            }

            var3++;
            var4 <<= 1;
         }

         this.method_371(1);
      }
   }

   // $VF: renamed from: c (int) void
   private void method_357(int var1) {
      if (this.field_595[0].method_398() != 0) {
         Math.abs(this.field_595[0].method_398());
      }

      if (this.field_582 < 1800) {
         this.field_582 = this.field_582;
      } else {
         this.field_582 = this.field_582;
      }
   }

   // $VF: renamed from: a (int, int, boolean) void
   private void method_358(int var1, int var2, boolean var3) {
      boolean var9 = false;
      if (!var3) {
         class_29 var13 = this.field_619;
         if (this.field_619.field_700 > 0) {
            var13.field_702 += var1;
         }
      }

      if (this.field_576 == 1) {
         this.field_579 += var1;
      } else if (var1 > 0) {
         this.field_579 += var1;
         this.field_599[this.field_600] = var1;
         this.field_600++;
         if (this.field_600 > this.field_599.length - 1) {
            this.field_600 = 0;
         }
      } else {
         this.field_579 += var1;
         if (this.field_579 < 0) {
            this.field_579 = 0;
         }
      }

      if (this.field_608 == 1) {
         if (this.field_578 < 50) {
            this.field_657.method_229(5, this.field_579);
         }

         if (this.field_578 < 100) {
            this.field_657.method_229(6, this.field_579);
         }

         this.field_657.method_229(4, this.field_579);
      }

      if (var2 >= 0) {
         int var11 = var2;
         class_26 var14 = this;
         int var15 = Math.min(var1 * 100 / 100, 2);

         for (int var12 = 0; var12 < var15; var12++) {
            int var7 = 0;
            int var6 = var11;
            class_26 var5 = var14;
            if (var14.field_608 != 2) {
               var7 = var14.field_621;
               boolean var8 = true;

               while (var8) {
                  if (var5.field_620[var7].method_167() == 0) {
                     var5.field_620[var7].method_168(var6, 0, var5.field_596[Math.min(4, var6 - 1)].method_395());
                     if (++var7 == 25) {
                        var7 = 0;
                     }

                     var5.field_621 = var7;
                     var8 = false;
                  } else if (++var7 == 25) {
                     var7 = 0;
                  }
               }
            }
         }
      }

      this.method_344();
   }

   // $VF: renamed from: d (int) void
   private void method_359(int var1) {
      this.field_607 -= var1;
      if (this.field_604 < this.field_605) {
         if (this.field_606 == -1) {
            this.field_606 = this.field_611;
         }

         this.field_604 = Math.min(this.field_605, this.field_605 + (this.field_611 - this.field_606 - 500) * field_570 / 500);
         if (this.field_604 > this.field_605) {
            this.field_604 = this.field_605;
         }

         if (this.field_604 >= this.field_605 && this.field_608 == 0) {
            class_26 var4 = this;
            if (!this.field_649 && this.field_576 == 0 && this.field_625 < this.field_626) {
               boolean var2 = false;

               for (int var3 = 0; var3 < var4.field_627.length; var3++) {
                  if (var4.field_627[var3] == var4.field_578 + 1) {
                     var2 = true;
                  }
               }

               if (!var2 && var4.field_578 + 1 > var4.field_627[var4.field_627.length - 1]) {
                  var2 = true;
               }

               if (var2) {
                  var4.method_360();
               }
            }
         }

         if (this.field_576 != 1 && this.field_576 != 4) {
            this.field_618.method_436(this.field_604, this.field_578, this.field_593);
            return;
         }
      } else if (this.field_604 > this.field_605) {
         if (this.field_606 == -1) {
            this.field_606 = this.field_611;
         }

         this.field_604 = Math.max(this.field_605, this.field_605 - (this.field_611 - this.field_606 - 500) * field_570 / 500);
         if (this.field_604 < this.field_605) {
            this.field_604 = this.field_605;
         }

         if (this.field_576 != 1 && this.field_576 != 4) {
            this.field_618.method_436(this.field_604, this.field_578, this.field_593);
         }
      }
   }

   // $VF: renamed from: m () void
   private void method_360() {
      int var1 = class_37.method_608();
      int var2 = class_37.method_621();
      switch (class_7.method_64(1, 2)) {
         case 1:
            this.field_647 = 3;
            this.field_648 = 1;
            this.field_635 = var1 + 2 + this.field_633;
            break;
         case 2:
            this.field_647 = 4;
            this.field_648 = 2;
            this.field_635 = -(2 + this.field_633);
      }

      this.field_636 = var2;
      this.field_636 = this.field_636 - this.field_617.method_13();
      this.field_636 = this.field_636 - this.field_617.method_15();
      this.field_636 = this.field_636 + (field_571 >> 1);
      this.field_636 = this.field_636 - this.field_634;
      switch (class_7.method_64(1, 2)) {
         case 1:
            this.field_648 = 1;
            break;
         case 2:
            this.field_648 = 2;
            this.field_636 = this.field_636 - this.field_640;
      }

      this.field_637 = this.field_635;
      this.field_638 = this.field_636;
      switch (class_7.method_64(1, 4)) {
         case 1:
            this.field_629 = 0;
            break;
         case 2:
            this.field_629 = 1;
            break;
         case 3:
            this.field_629 = 2;
            break;
         case 4:
            this.field_629 = 3;
      }

      this.field_631.method_454(this.field_629);
      this.field_641 = 0;
      this.field_642 = 0;
      this.field_630 = 0;
      this.field_649 = true;
   }

   // $VF: renamed from: n () void
   private void method_361() {
      switch (this.field_629) {
         case 0:
            this.field_595[0].method_417(12);
            break;
         case 1:
            this.field_595[0].method_417(13);
            break;
         case 2:
            this.field_595[0].method_417(14);
            break;
         case 3:
            this.field_595[0].method_417(15);
      }

      this.field_625++;
      this.field_649 = false;
   }

   // $VF: renamed from: b () boolean
   private boolean method_362() {
      int var1 = field_569;
      if (this.field_578 == this.field_593 - 1) {
         var1 = field_573;
      }

      int var2 = this.field_602 + (15 * this.field_595[0].method_396() >> 8);
      int var10000 = this.field_603 - (15 * (this.field_595[0].method_395() - this.field_604) >> 8);
      int var3 = 0;
      var1 = var10000 + this.field_595[0].method_410() + var1;
      var3 = this.field_635 - (this.field_633 >> 1);
      int var4 = this.field_635 + (this.field_633 >> 1);
      return var3 >= var2 - 3 - 26 && var4 <= var2 + 3 + 26 && this.field_636 - (this.field_634 >> 1) <= var1;
   }

   // $VF: renamed from: a (int) void
   public final void method_363(int var1) {
      if (var1 != -1) {
         switch (var1) {
            case 0:
               this.field_661 = class_15.method_178(131447);
               break;
            case 1:
               this.field_661 = class_15.method_178(131448);
               break;
            case 2:
               this.field_661 = class_15.method_178(131462);
               break;
            case 3:
               this.field_661 = class_15.method_178(131461);
         }

         if (this.field_661 != null) {
            this.field_661.method_451(0, -1, false);
         }
      }
   }

   // $VF: renamed from: c () void
   public final void method_364() {
      int var1;
      if ((var1 = class_7.method_64(1, 100)) >= 11 && var1 <= 20
         || var1 >= 31 && var1 <= 40
         || var1 >= 51 && var1 <= 60
         || var1 >= 71 && var1 <= 80
         || var1 >= 91 && var1 <= 100) {
         if ((var1 = class_7.method_64(1, 40)) >= 1 && var1 <= 10) {
            this.field_661 = class_15.method_178(131462);
         } else if (var1 >= 11 && var1 <= 20) {
            this.field_661 = class_15.method_178(131448);
         } else if (var1 >= 21 && var1 <= 30) {
            this.field_661 = class_15.method_178(131461);
         } else {
            this.field_661 = class_15.method_178(131447);
         }

         if (this.field_661 != null) {
            this.field_661.method_451(0, -1, false);
         }
      }
   }

   // $VF: renamed from: d () void
   public final void method_365() {
      for (int var1 = 0; var1 < this.field_665.length; var1++) {
         this.field_665[var1] = 0;
      }
   }

   // $VF: renamed from: a () int
   public final int method_366() {
      return this.field_663 != null ? this.field_663.method_460() : 0;
   }

   // $VF: renamed from: b () int
   public final int method_367() {
      return this.field_670;
   }

   // $VF: renamed from: a () boolean
   public final boolean method_368() {
      return this.field_578 == class_17.field_310[this.field_577];
   }

   // $VF: renamed from: a (boolean) void
   private void method_369(boolean var1) {
      if (this.field_578 >= 1) {
         if (var1) {
            this.field_669[this.field_578 - 1] = 3;
            return;
         }

         int var1i = this.field_672 - this.field_674;
         int var2 = this.field_672 + this.field_674;
         if (this.field_671 >= var1i && this.field_671 <= var2) {
            this.field_669[this.field_578 - 1] = 3;
            return;
         }

         var1i = this.field_672 - this.field_673;
         var2 = this.field_672 + this.field_673;
         if (this.field_671 >= var1i && this.field_671 <= var2) {
            this.field_669[this.field_578 - 1] = 2;
            return;
         }

         this.field_669[this.field_578 - 1] = 1;
      }
   }

   // $VF: renamed from: c (javax.microedition.lcdui.Graphics) void
   public final void method_370(Graphics var1) {
      int var10000 = class_37.method_608();
      int var2 = 0;
      var2 = var10000 >> 1;
      Object var3 = null;

      for (int var4 = 0; var4 < this.field_665.length; var4++) {
         var3 = this.field_664.method_446(var4);
         switch (this.field_665[var4]) {
            case 0:
               this.field_662.method_447(this.field_666[var4]);
               this.field_662.method_450(var1, var2 + ((class_20)var3).field_392, 0 + ((class_20)var3).field_393);
               break;
            case 1:
               this.field_663.method_447(this.field_666[var4]);
               this.field_663.method_450(var1, var2 + ((class_20)var3).field_392, 0 + ((class_20)var3).field_393);
         }
      }
   }

   // $VF: renamed from: e (int) void
   private void method_371(int var1) {
      if (this.field_608 != 2) {
         this.field_595[0].method_417(-1);
         this.field_607 = 900;
         if (this.field_608 != 2) {
            this.field_609--;
            if (this.field_609 < 0) {
               this.field_609 = 0;
            }

            this.method_343();
         }

         if (this.field_576 == 1 && this.field_609 <= 0) {
            this.method_373();
            this.field_568 = 0;
         }
      }
   }

   // $VF: renamed from: e () void
   public final void method_372() {
      if (this.field_578 != 0 && this.field_595[0].method_408() == 1) {
         if (this.field_649 && this.method_362()) {
            this.method_361();
         }

         this.method_354(true);
         this.field_616 = this.field_611;
         this.method_357(0);
         switch (this.field_595[0].method_416()) {
            case 2:
               this.field_619.method_385(this.field_608, this.field_576, this.field_578);
         }

         this.field_595[0].method_407(4);
         this.field_612 = this.field_611;
         this.field_592 = this.field_592;
         this.field_624.method_239(this.field_596[this.field_587 + 1].method_396(), this.field_596[this.field_587 + 1].method_395(), 1, this.field_587 + 1, 0);
         this.field_592 = this.field_592;
         if (this.field_578 > 0) {
            this.field_624
               .method_239(this.field_596[this.field_587 + 1].method_396(), this.field_596[this.field_587 + 1].method_395(), 2, this.field_587 + 1, 0);
         }

         this.field_598++;
         int var2 = class_31.field_713[this.field_595[0].method_413()][4];
         if (this.field_598 > var2) {
            this.field_598 = var2;
         }

         this.field_597++;
         this.field_657.method_229(1, this.field_597);
         if (this.field_608 == 2 && this.field_622 >= 0) {
            this.field_622 += 1000;
            this.method_346();
            if (this.field_610 == null || this.field_610.field_239 == -1 || this.field_578 + 1 < class_17.field_312[1][this.field_610.field_239]) {
               this.field_624
                  .method_239(this.field_596[this.field_587 + 1].method_396(), this.field_596[this.field_587 + 1].method_395() + field_570 / 2, 3, -1, 10001);
            }
         }

         this.field_588[this.field_578 % 20] = 0;
         this.field_589[this.field_578 % 20] = this.field_595[0].method_413();
         this.field_619.method_385(this.field_608, this.field_576, this.field_578);
         this.method_358(this.field_598, this.field_578, false);
         if (this.field_608 == 0) {
            this.method_369(true);
         }

         this.method_355(1);
         if (this.field_576 == 1) {
            this.field_619.method_384();
         }

         if (this.field_576 == 4) {
            this.field_576 = 0;
         } else if (this.field_578 == this.field_593 - 1 && this.field_608 == 0 && this.field_576 != 1) {
            this.field_576 = 1;
            this.field_619.method_384();
            this.field_595[0].method_394(this.field_618.field_762);
            this.field_595[0].method_407(6);
            this.field_595[0].method_412(this.field_608, this.field_577, this.field_578);
            boolean var1 = false;
            this.field_618.field_761 = 0;
            this.field_618.method_437();
            this.field_618.method_434(this.field_595[0], 1);
            this.field_587 = Math.min(4, this.field_578 - 1);
         } else {
            if (this.field_576 == 1) {
               this.method_353();
            }
         }
      }
   }

   // $VF: renamed from: f () void
   public final void method_373() {
      class_3 var1 = class_3.method_25();
      Object var2 = null;
      if (this.field_608 == 1) {
         int var9 = this.field_610.field_239;
         if (this.field_610.field_239 == -1) {
            var9 = class_17.field_312[0][class_17.field_312[0].length - 1];
         }

         Object var10 = null;
         var1.method_31(this.field_610.field_248, this.field_610.field_245, var9, this.field_610.field_247, this.field_610.field_246);
         var1.method_29(2, this.field_610.field_243);
         var1.method_29(3, this.field_610.field_244);
      } else {
         if (this.field_608 == 2) {
            class_27 var3 = this.field_623;
            if (this.field_623.field_678 < var3.field_680) {
               ByteArrayOutputStream var5 = new ByteArrayOutputStream();
               DataOutputStream var6 = new DataOutputStream(var5);

               try {
                  for (int var7 = 0; var7 < var3.field_680; var7++) {
                     var6.writeShort(var3.field_679[var7]);
                  }
               } catch (IOException var4) {
               }

               var2 = var5.toByteArray();
               class_37.method_639("GHST", (byte[])var2);
            }
         }
      }
   }

   // $VF: renamed from: c () int
   public final int method_374() {
      return this.field_568;
   }

   // $VF: renamed from: d () int
   public final int method_375() {
      return this.field_578;
   }

   // $VF: renamed from: e () int
   public final int method_376() {
      return this.field_579;
   }

   // $VF: renamed from: f () int
   public final int method_377() {
      if (this.field_608 != 1 && this.field_608 != 2) {
         return -1;
      } else {
         int var1 = this.field_610.field_239;
         if (this.field_610.field_239 == -1) {
            if (this.field_608 == 1) {
               var1 = class_17.field_312[0][class_17.field_312[0].length - 1];
            } else if (this.field_608 == 2) {
               var1 = class_17.field_312[1][class_17.field_312[1].length - 1];
            }
         }

         return var1;
      }
   }

   // $VF: renamed from: g () int
   public final int method_378() {
      return this.field_608;
   }

   // $VF: renamed from: h () int
   public final int method_379() {
      return this.field_577;
   }

   // $VF: renamed from: i () int
   public final int method_380() {
      return this.field_622;
   }

   // $VF: renamed from: f (int) void
   private void method_381(int var1) {
      if (var1 == -1 || var1 == 13) {
         for (int var2 = 0; var2 < Math.min(this.field_578, 5); var2++) {
            this.field_596[var2].method_422(var1);
         }
      }
   }

   // $VF: renamed from: g () void
   public final void method_382() {
      if (this.field_656 != null) {
         this.field_656.delete(0, this.field_656.length());
         this.field_656 = null;
      }

      this.field_650 = null;
      this.field_651 = null;
      this.field_652 = null;
      this.field_653 = null;
      this.field_654 = null;
      this.field_655 = null;
      this.field_660 = null;
      if (class_31.field_715 != null) {
         class_31.field_715 = null;
      }

      if (this.field_617 != null) {
         this.field_617.method_10();
         this.field_617 = null;
      }

      if (this.field_618 != null) {
         this.field_618 = null;
      }

      if (this.field_620 != null) {
         for (int var1 = 0; var1 < 25; var1++) {
            this.field_620[var1] = null;
         }

         this.field_620 = null;
      }

      if (this.field_595 != null) {
         for (int var2 = 0; var2 < 5; var2++) {
            this.field_595[var2] = null;
         }

         this.field_595 = null;
      }

      if (this.field_596 != null) {
         for (int var3 = 0; var3 < 5; var3++) {
            this.field_596[var3] = null;
         }

         this.field_596 = null;
      }

      if (this.field_675 != null) {
         this.field_675 = null;
      }

      this.field_590 = null;
      this.field_588 = null;
      this.field_589 = null;
      if (this.field_619 != null) {
         this.field_619 = null;
      }

      if (this.field_624 != null) {
         this.field_624 = null;
      }

      if (this.field_623 != null) {
         this.field_623 = null;
      }

      this.field_599 = null;
      if (this.field_631 != null) {
         this.field_631 = null;
      }

      if (this.field_632 != null) {
         this.field_632 = null;
      }

      this.field_627 = null;
      this.field_628 = null;
      if (this.field_661 != null) {
         this.field_661 = null;
      }

      if (this.field_608 == 0) {
         this.field_669 = null;
         this.field_665 = null;
         this.field_666 = null;
         if (this.field_662 != null) {
            this.field_662 = null;
         }

         if (this.field_663 != null) {
            this.field_663 = null;
         }

         if (this.field_664 != null) {
            this.field_664 = null;
         }
      }

      System.gc();
   }
}
