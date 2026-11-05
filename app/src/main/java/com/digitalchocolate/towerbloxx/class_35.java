package com.digitalchocolate.towerbloxx;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: aa
public final class class_35 {
   // $VF: renamed from: a r[]
   private class_9[] field_777;
   // $VF: renamed from: a r
   private class_9 field_778;
   // $VF: renamed from: a int
   private int field_779;
   // $VF: renamed from: b int
   private int field_780;
   // $VF: renamed from: a boolean
   private boolean field_781;
   // $VF: renamed from: c int
   private int field_782;
   // $VF: renamed from: d int
   private int field_783;
   // $VF: renamed from: b boolean
   private static boolean field_784 = true;
   // $VF: renamed from: a java.util.Vector
   private static Vector field_785;
   // $VF: renamed from: b java.util.Vector
   private static Vector field_786;
   // $VF: renamed from: e int
   private static int field_787 = 10;
   // $VF: renamed from: f int
   private static int field_788 = 1 << field_787;
   // $VF: renamed from: g int
   private int field_789 = field_788;
   // $VF: renamed from: h int
   private int field_790;

   public class_35(int var1) {
      this(class_10.method_137(var1));
   }

   public class_35(int[] var1) {
      this(class_10.method_138(var1));
   }

   public class_35(class_9[] var1) {
      if (var1.length == 1) {
         this.method_439(null, var1[0], -2);
      } else {
         this.method_439(var1, null, -2);
      }
   }

   public class_35(class_9 var1) {
      this.method_439(null, var1, -2);
   }

   private class_35(class_9[] var1, boolean var2) {
      if (var1.length == 1) {
         this.method_439(null, var1[0], var2 ? -1 : 1);
      } else {
         this.method_439(var1, null, var2 ? -1 : 1);
      }
   }

   private class_35(class_9 var1, boolean var2) {
      this.method_439(null, var1, var2 ? -1 : 1);
   }

   public class_35() {
   }

   // $VF: renamed from: a () aa
   public final class_35 method_438() {
      if (this.field_782 == -2) {
         return this.field_777 == null ? new class_35(this.field_778) : new class_35(this.field_777);
      } else {
         return this.field_777 == null ? new class_35(this.field_778, this.field_782 == -1) : new class_35(this.field_777, this.field_782 == -1);
      }
   }

   // $VF: renamed from: a (r[], r, int) void
   private void method_439(class_9[] var1, class_9 var2, int var3) {
      if (this.field_777 != null) {
         this.method_461();
      } else if (this.field_778 != null) {
         this.field_778.method_132();
      }

      this.field_777 = var1;
      if (var1 != null) {
         int var4 = var1.length;

         while (--var4 >= 0) {
         }
      } else {
         this.field_778 = var2;
      }

      this.method_451(0, var3, true);
   }

   // $VF: renamed from: a (aa) void
   public final void method_440(class_35 var1) {
      var1.method_439(this.field_777, this.field_778, this.field_782);
   }

   // $VF: renamed from: a () int
   public final int method_441() {
      return this.field_778.method_122();
   }

   // $VF: renamed from: b () int
   public final int method_442() {
      return this.field_778.method_124();
   }

   // $VF: renamed from: c () int
   public final int method_443() {
      return this.field_778.method_125(this.field_779) + (this.field_780 >> field_787);
   }

   // $VF: renamed from: a () r
   public final class_9 method_444() {
      return this.field_778;
   }

   // $VF: renamed from: a () g[]
   public final class_20[] method_445() {
      return this.field_778.method_128(this.field_779).method_426();
   }

   // $VF: renamed from: a (int) g
   public final class_20 method_446(int var1) {
      return this.field_778.method_128(this.field_779).method_427(var1);
   }

   // $VF: renamed from: a (int) void
   public final void method_447(int var1) {
      int var2 = var1;
      Object var3 = null;
      int var7 = this.field_778.method_124();
      boolean var4;
      if (var4 = this.method_462()) {
         var2 = var1 % var7;
      } else if (var1 > var7) {
         var2 = var7;
      }

      this.method_454(0);
      boolean var5 = this.field_781;
      int var6 = this.field_789;
      this.field_781 = false;
      this.field_789 = field_788;
      this.method_448(var2);
      this.field_789 = var6;
      this.field_781 = var5;
      if (var4) {
         this.field_790 = var1 / var7;
      }
   }

   // $VF: renamed from: b (int) void
   public final void method_448(int var1) {
      if (this.field_783 != 0) {
         if (var1 > 0 && (var1 *= this.field_789) == 0 && this.field_789 > 0) {
            var1 = 1;
         }

         int var2 = this.field_778.method_126(this.field_779);
         this.field_780 += var1;
         if (this.field_780 < 0) {
            this.field_780 -= Integer.MIN_VALUE;
         }

         for (; this.field_780 >> field_787 >= var2; var2 = this.field_778.method_126(this.field_779)) {
            var1 = var2 << field_787;
            this.field_780 -= var1;
            if (this.field_781) {
               this.field_780 = 0;
            }

            var2 = this.field_778.method_122();
            this.field_779++;
            if (this.field_779 >= var2) {
               if (this.field_783 > 0) {
                  this.field_783--;
               }

               if (this.field_783 == 0) {
                  this.field_779 = var2 - 1;
                  this.field_780 = var1 - 1;
                  return;
               }

               this.field_779 = 0;
               this.field_790++;
            }
         }
      }
   }

   // $VF: renamed from: a (int, int) void
   public final void method_449(int var1, int var2) {
      class_9 var3 = this.field_778;
      class_32 var4;
      int[][] var5;
      int var6;
      if ((var6 = (var5 = (var4 = this.field_778.method_128(this.field_779)).method_428()).length) != 0) {
         class_25 var7;
         int var8 = (var7 = class_37.method_648()).method_301();
         int var9 = var7.method_300();
         int var10 = var7.method_302();
         int var11 = var7.method_303();
         int var12 = this.method_443();
         Object var14 = null;
         boolean var13;
         if (var13 = this.field_778.method_131()) {
            var1 += this.field_778.method_131() ? this.field_778.method_130(1, this.method_443(), this.method_462()) : 0;
            var2 += this.field_778.method_131() ? this.field_778.method_130(2, this.method_443(), this.method_462()) : 0;
            boolean var35 = this.method_462();
            int var15 = var3.method_130(5, var12, var35);
            if (var8 == -8355712) {
               var8 = var3.method_130(0, var12, var35);
            }

            int var16 = var3.method_130(3, var12, var35);
            int var36 = var3.method_130(4, var12, var35);
            var9 += var15;
            var10 = var16 * var10 >> 10;
            var11 = var36 * var11 >> 10;
         }

         int var10000 = var8 & 0xFF000000;
         boolean var37 = false;
         if (var10000 != 0) {
            if (var13) {
               var7.method_325();
               var7.method_311(var8);
               var7.method_293(var9);
               var7.method_304(var10, var11);
            }

            int var39 = var3.method_114();
            int var40 = var3.method_115();
            boolean var38 = false;
            byte var29 = 0;
            boolean var30 = false;
            class_16 var32 = null;
            int[] var17;
            if (var6 == 1 && (var17 = var5[0])[0] == 1) {
               var30 = true;
               var38 = true;
               var39 = -var17[1];
               var40 = -var17[2];
               var32 = class_10.method_147(var17[3]);
               int var18;
               if (((var18 = var17[4]) & 1) != 0) {
                  var29 = 1;
               }

               if ((var18 & 2) != 0) {
                  var29 |= 2;
               }
            }

            if (!var30) {
               if (var8 == -8355712 && var7.method_296() <= 1 && var7.method_297() <= 1 && var7.method_305() == 0) {
                  if (var7.method_302() != 1024 || var7.method_303() != 1024 || var7.method_300() != 0) {
                     for (int var41 = 0; var41 < var6; var41++) {
                        int[] var47 = var5[var41];
                        Object var44 = null;
                        switch (var47[0]) {
                           case 1:
                           case 5:
                           case 7:
                           case 9:
                              var30 = true;
                              var41 = var6;
                              break;
                           case 2:
                           case 3:
                           case 4:
                           case 6:
                           case 8:
                        }
                     }
                  }
               } else {
                  var30 = true;
               }
            }

            boolean var42 = false;
            Object var19 = null;
            int var43 = var12 + this.field_790 * var3.method_124();
            if (!var30) {
               var3.method_127(var1, var2, var43);
               if (var13) {
                  var7.method_324();
               }
            } else {
               boolean var45 = field_784 && var3.method_133();
               if (!var38) {
                  int var20 = var3.method_116();
                  int var24 = var3.method_117();
                  boolean var26 = false;
                  if (var45) {
                     var32 = var4.method_429();
                     if (!var4.method_430()) {
                        var26 = var7.method_326(var32);
                     }
                  } else {
                     var4.method_431();
                     int var22 = var24;
                     int var46 = var20;
                     if (field_785 == null) {
                        field_785 = new Vector();
                        field_786 = new Vector();
                     }

                     int var27 = 0;
                    boolean var27f = false;
                     class_16 var31 = null;
                     var11 = field_786.size();

                     while (--var11 >= 0) {
                        (var31 = (class_16)field_786.elementAt(var11)).method_179(0, 0, 0);
                        if (var46 <= var31.method_183() && var22 <= var31.method_181()) {
                           field_786.removeElementAt(var11);
                           var27 = 1;
                           var27f = true;
                           break;
                        }
                     }

                     if (!var27f) {
                        var11 = var46 * 12 / 10;
                        var27 = var22 * 12 / 10;
                        var31 = new class_16(var11, var27);
                     }

                     if (var46 != var31.method_183() || var22 != var31.method_181()) {
                        var31.method_179(0, var46, var22);
                     }

                     field_785.addElement(var31);
                     var32 = var31;
                  }

                  if (!var26) {
                     var7.method_325();
                     int var23 = var7.method_321();
                     var7.method_306();
                     var7.method_323(var23);
                     var7.method_338(var32, var20, var24);
                     var7.method_317(0, 0);
                     var7.method_312(var32);
                     var3.method_127(var39, var40, var43);
                     var7.method_324();
                  }
               }

               int var21 = var7.method_318();
               int var25 = var7.method_319();
               var7.method_317(var1, var2);
               var7.method_298(var32, -var39, -var40, var29, 20);
               var7.method_317(var21, var25);
               if (!var45 && !var38) {
                  field_785.removeElement(var32);
                  field_786.addElement(var32);
               }

               if (var13) {
                  var7.method_324();
               }
            }
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void method_450(Graphics var1, int var2, int var3) {
      class_25 var4;
      Graphics var5 = (var4 = class_37.method_648()).method_314();
      var4.method_313(var1);
      this.method_449(var2, var3);
      var4.method_313(var5);
   }

   // $VF: renamed from: a (int, int, boolean) void
   public final void method_451(int var1, int var2, boolean var3) {
      if (this.field_777 != null) {
         this.field_778 = this.field_777[var1];
      }

      this.field_782 = var2;
      this.field_781 = var3;
      this.method_454(0);
   }

   // $VF: renamed from: d () int
   public final int method_452() {
      if (this.field_777 == null) {
         return 0;
      } else {
         int var1 = 0;

         while (this.field_778 != this.field_777[var1]) {
            var1++;
         }

         return var1;
      }
   }

   // $VF: renamed from: e () int
   public final int method_453() {
      if (this.field_777 == null) {
         return this.field_778 != null ? 1 : 0;
      } else {
         return this.field_777.length;
      }
   }

   // $VF: renamed from: c (int) void
   public final void method_454(int var1) {
      this.field_779 = var1;
      this.field_790 = 0;
      if (this.field_782 == -2) {
         if (this.field_778.method_123()) {
            this.field_783 = -1;
         } else {
            this.field_783 = 1;
         }
      } else {
         this.field_783 = this.field_782;
      }

      this.field_780 = 0;
   }

   // $VF: renamed from: f () int
   public final int method_455() {
      return this.field_779;
   }

   // $VF: renamed from: a () boolean
   public final boolean method_456() {
      return this.field_783 == 0;
   }

   // $VF: renamed from: g () int
   public final int method_457() {
      return this.field_778.method_118();
   }

   // $VF: renamed from: h () int
   public final int method_458() {
      return this.field_778.method_119();
   }

   // $VF: renamed from: i () int
   public final int method_459() {
      return this.field_778.method_120();
   }

   // $VF: renamed from: j () int
   public final int method_460() {
      return this.field_778.method_121();
   }

   // $VF: renamed from: a () void
   public final void method_461() {
      if (this.field_777 != null) {
         int var1 = this.field_777.length;

         while (--var1 >= 0) {
            this.field_777[var1].method_132();
         }

         this.field_777 = null;
      } else if (this.field_778 != null) {
         this.field_778.method_132();
      }

      this.field_778 = null;
   }

   // $VF: renamed from: b () boolean
   private boolean method_462() {
      return this.field_783 == -1 ? true : this.field_783 > 1;
   }
}
