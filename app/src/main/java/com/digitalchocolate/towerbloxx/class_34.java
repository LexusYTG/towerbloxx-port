package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: ab
public final class class_34 {
   // $VF: renamed from: a int
   int field_761;
   // $VF: renamed from: b int
   int field_762;
   // $VF: renamed from: c int
   int field_763;
   // $VF: renamed from: d int
   int field_764;
   // $VF: renamed from: e int
   int field_765;
   // $VF: renamed from: f int
   int field_766;
   // $VF: renamed from: g int
   int field_767;
   // $VF: renamed from: h int
   int field_768;
   // $VF: renamed from: i int
   int field_769;
   // $VF: renamed from: a aa
   public class_35 field_770;
   // $VF: renamed from: b aa
   private class_35 field_771;
   // $VF: renamed from: c aa
   private class_35 field_772;
   // $VF: renamed from: l int
   private int field_773 = 0;
   // $VF: renamed from: m int
   private int field_774 = 0;
   // $VF: renamed from: j int
   int field_775 = 0;
   // $VF: renamed from: k int
   int field_776;

   class_34() {
      this.field_770 = class_15.method_178(131197);
      this.field_771 = class_15.method_178(131231);
      this.field_772 = class_15.method_178(131196);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, boolean, af) void
   public final void method_433(Graphics var1, int var2, int var3, int var4, int var5, boolean var6, class_31 var7) {
      int var9 = var3 - (15 * (this.field_762 - var5) >> 8);
      var2 += 15 * this.field_763 >> 8;
      var4 = var3 - (15 * (this.field_764 - var5) >> 8);
      if (var7.method_414() || var7.method_415() && var7.method_408() != 2 && var7.method_408() != 4) {
         class_20 var18;
         int var20 = (var18 = var7.method_409()).field_392;
         int var11 = -this.field_770.method_446(0).field_393 * class_7.method_62(var7.method_404()) >> 10;
         var11 = this.field_764 - (var11 << 8) / 15;
         var3 -= 15 * (var11 - var5) >> 8;
         var5 = var4 - 30;
         var3 = var3 + var18.field_393 - var5;
         var1.setColor(5202537);
         var1.drawLine(var2, var9, var2, var4 - 30);
         var1.setColor(6915212);
         var1.drawLine(var2 + 1, var9, var2 + 1, var4 - 30);
         int var60 = var7.method_408();
            if ((var60 == 1 || var60 == 6 || var60 == 3 || var60 == 4) && (!var7.method_415() || var60 == 1 || var60 == 6)) {
            var1.setColor(5202537);
            var1.drawLine(var2, var5, var2 - var20, var5 + var3);
            var1.drawLine(var2, var5, var2 + var20, var5 + var3);
            var1.setColor(6915212);
            var1.drawLine(var2 + 1, var5, var2 + 1 - var20, var5 + var3);
            var1.drawLine(var2 + 1, var5, var2 + 1 + var20, var5 + var3);
         }

         this.field_772.method_450(var1, var2, var4 - 30);
      } else {
         var1.setColor(5202537);
         var1.drawLine(var2, var9, var2, var4);
         var1.setColor(6915212);
         var1.drawLine(var2 + 1, var9, var2 + 1, var4);
         var3 = this.field_765 << 8;
         byte var10 = 2;
         if (var3 > 910) {
            if (var3 >= 2184) {
               var10 = 0;
            } else {
               var10 = 1;
            }
         } else if (var3 <= -910) {
            if (var3 <= -2184) {
               var10 = 4;
            } else {
               var10 = 3;
            }
         }

         this.field_771.method_454(var10);
         this.field_770.method_454(var10);
         if (var6) {
            this.field_771.method_450(var1, var2, var4);
         } else {
            this.field_770.method_450(var1, var2, var4);
         }
      }
   }

   // $VF: renamed from: a (af, int) void
   public final void method_434(class_31 var1, int var2) {
      this.field_775 += var2;
      if (var1.method_408() == 6 || this.field_761 < this.field_776) {
         int var4 = this.field_761 + (var2 << 1) / 3;
         Object var3 = null;
         this.field_761 = var4;
         if (var1.method_414()) {
            if (this.field_761 >= this.field_776 * 70 / 100) {
               this.field_761 = this.field_776 * 70 / 100;
               if (var1.method_408() == 6) {
                  var1.method_407(1);
               }
            }
         } else if (this.field_761 >= this.field_776) {
            var4 = this.field_776;
            this.field_761 = this.field_776;
            if (var1.method_408() == 6) {
               var1.method_407(1);
            }
         }
      }

      this.field_763 = this.field_768 * class_7.method_62(200 * this.field_775 / this.field_767 % 256) >> 8;
      if (var1.method_414()) {
         this.field_765 = 0;
      } else {
         this.field_765 = -this.field_763 / 32;
      }

      int var5 = -(this.field_769 * class_7.method_61(200 * this.field_775 / this.field_767 % 256) >> 8);
      this.field_764 = this.field_762 - this.field_766 - this.field_761 + var5;
      if (var2 <= 0) {
         var2 = 1;
      }

      if (var1.method_408() == 1 || var1.method_408() == 6) {
         var5 = Math.min(0, (this.field_764 - this.field_774 << 8) / var2);
         var1.method_397((this.field_763 - this.field_773 << 3) * 13 / var2, var5);
         var1.method_392(this.field_763, this.field_764);
         var1.method_402(this.field_765 * 80 / 100);
      }

      this.field_773 = this.field_763;
      this.field_774 = this.field_764;
   }

   // $VF: renamed from: a (int, int, int, int) void
   public final void method_435(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         if (var3 + 1 == var4) {
            int var5 = class_17.field_309[var2] - var3 * (class_17.field_309[var2] - class_17.field_309[var2 + 2]) / class_17.field_310[var2];
            Object var6 = null;
            this.field_767 = var5;
            this.field_768 = class_17.field_306[var2] * (100 + var3 * 100 / 80) / 100;
            this.field_769 = class_17.field_307[var2] * (100 + var3 * 100 / 80) / 100;
         } else {
            int var8 = class_17.field_308[var2] - var3 * (class_17.field_308[var2] - class_17.field_308[var2 + 2]) / class_17.field_310[var2];
            Object var7 = null;
            this.field_767 = var8;
            this.field_768 = class_17.field_304[var2] * (100 + var3 * 100 / 80) / 100;
            this.field_769 = class_17.field_305[var2] * (100 + var3 * 100 / 80) / 100;
         }

         if (var3 == 0) {
            this.field_766 = -(var3 * class_26.field_572 / 100);
         } else if (var3 == var4 - 1) {
            this.field_766 = -(var3 * class_26.field_574 / 100);
         } else {
            this.field_766 = -(var3 * class_26.field_570 / 100);
         }
      } else {
         this.field_768 = class_17.field_304[var2] * (100 + var3 * 100 / 200) / 100;
         this.field_769 = class_17.field_305[var2] * (100 + var3 * 100 / 200) / 100;
         if (var3 < 100) {
            this.field_767 = Math.max(class_17.field_308[var2 + 2], class_17.field_308[0] - var3 * (class_17.field_308[0] - class_17.field_308[var2 + 2]) / 100);
         } else {
            this.field_766 = -Math.min(256, 128 + (var3 - 100 << 8) / 300);
         }

         if (var3 == 0) {
            this.field_766 = -(var3 * class_26.field_572 / 200);
         } else if (var3 == var4 - 1) {
            this.field_766 = -(var3 * class_26.field_574 / 200);
         } else {
            this.field_766 = -(var3 * class_26.field_570 / 200);
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_436(int var1, int var2, int var3) {
      if (var2 == 0) {
         this.field_762 = var1 - class_7.method_66(class_37.method_621() * -23 / 100) + class_26.field_572 / 2;
      } else if (var2 == var3 - 1) {
         this.field_762 = var1 - class_7.method_66(class_37.method_621() * -23 / 100) + class_26.field_574 / 2;
      } else {
         this.field_762 = var1 - class_7.method_66(class_37.method_621() * -23 / 100) + class_26.field_570 / 2;
      }
   }

   // $VF: renamed from: a () void
   public final void method_437() {
      this.field_767 = class_17.field_308[1];
   }
}
