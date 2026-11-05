package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: af
public final class class_31 {
   // $VF: renamed from: a int[][]
   public static final int[][] field_713 = new int[][]{
      {0, -1, 0, 1, 5},
      {0, 1, 0, 5, 10},
      {0, 2, 1, 5, 10},
      {0, 0, 0, 1, 3},
      {1, -1, 0, 1, 5},
      {1, 1, 0, 5, 10},
      {1, 2, 1, 5, 10},
      {1, 0, 0, 1, 3},
      {2, -1, 0, 1, 5},
      {2, 1, 0, 5, 10},
      {2, 2, 1, 5, 10},
      {2, 0, 0, 1, 3}
   };
   // $VF: renamed from: a int[]
   private static final int[] field_714 = new int[]{131220, 131215, 131210, 131189, 131204, 131190, 131221, 131227, 131229, 131219, 131195, 131212};
   // $VF: renamed from: a aa[]
   public static class_35[] field_715;
   // $VF: renamed from: a int
   private int field_716;
   // $VF: renamed from: b int
   private int field_717;
   // $VF: renamed from: c int
   private int field_718;
   // $VF: renamed from: d int
   private int field_719;
   // $VF: renamed from: e int
   private int field_720;
   // $VF: renamed from: f int
   private int field_721;
   // $VF: renamed from: g int
   private int field_722;
   // $VF: renamed from: h int
   private int field_723;
   // $VF: renamed from: i int
   private int field_724;
   // $VF: renamed from: j int
   private int field_725;
   // $VF: renamed from: a aa
   private class_35 field_726;
   // $VF: renamed from: b aa
   private class_35 field_727;
   // $VF: renamed from: a boolean
   private boolean field_728;
   // $VF: renamed from: k int
   private int field_729;
   // $VF: renamed from: l int
   private int field_730;
   // $VF: renamed from: m int
   private int field_731;
   // $VF: renamed from: n int
   private int field_732;
   // $VF: renamed from: c aa
   private class_35 field_733;
   // $VF: renamed from: b int[]
   private static final int[] field_734 = new int[]{131244, 131240, 131242, 131246};
   // $VF: renamed from: c int[]
   private static final int[] field_735 = new int[]{1, 1, 1, 1};

   class_31() {
      field_715 = null;
      field_715 = new class_35[field_714.length];

      for (int var1 = 0; var1 < field_714.length; var1++) {
         if (var1 == 0 || var1 >= 12 || field_713[var1][0] == class_18.method_218()) {
            field_715[var1] = class_15.method_178(field_714[var1]);
         }
      }

      this.method_407(0);
      this.field_716 = -1;
      this.field_727 = class_15.method_178(131232);
      this.field_727.method_451(0, -1, false);
      this.field_731 = -1;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, ab) void
   public final void method_390(Graphics var1, int var2, int var3, int var4, int var5, class_34 var6) {
      if (this.field_725 != 0 && this.field_725 != 4) {
         int var7 = var2 + (15 * this.field_717 >> 8);
         int var8 = var3 - (15 * (this.field_718 - var5) >> 8);
         if (field_713[this.field_716][1] == -1 || field_713[this.field_716][1] == 2) {
            byte var9 = 0;
            var9 = 3;
            if (this.field_721 > 364) {
               if (this.field_721 >= 1274) {
                  if (this.field_721 >= 2184) {
                     var9 = 0;
                  } else {
                     var9 = 1;
                  }
               } else {
                  var9 = 2;
               }
            } else if (this.field_721 <= -1274) {
               if (this.field_721 <= -2184) {
                  var9 = 6;
               } else {
                  var9 = 5;
               }
            } else if (this.field_721 <= -364) {
               var9 = 4;
            }

            this.field_726.method_454(var9);
         }

         var1.setColor(0, 255, 0);
         if (this.field_725 == 1 || this.field_725 == 6 || this.field_725 == 3) {
            var4 = -var6.field_770.method_446(0).field_393 * class_7.method_62(this.field_721) >> 10;
            var4 = var6.field_764 - (var4 << 8) / 15;
            var7 = var2 + (15 * var6.field_763 >> 8);
            var8 = var3 - (15 * (var4 - var5) >> 8);
            var7 += -var6.field_770.method_446(0).field_393 * class_7.method_61(this.field_721) >> 10;
         }

         this.field_726.method_450(var1, var7, var8);
         if (this.field_731 >= 0) {
            this.field_733.method_450(var1, var7, var8);
         }

         if (this.field_728) {
            this.field_727.method_447(this.field_729);
            this.field_727.method_450(var1, var7, var8);
         }
      }
   }

   // $VF: renamed from: a (int) int
   public final int method_391(int var1) {
      Object var2 = null;
      if (this.field_725 == 0) {
         return -1;
      } else {
         this.field_724 += var1;
         if (this.field_731 >= 0) {
            this.field_732 += var1;
            this.field_733.method_447(this.field_732);
            if (this.field_732 >= this.field_733.method_442()) {
               this.field_731 = -1;
            }
         }

         this.field_729 += var1;
         if (this.field_729 < 0) {
            this.field_729 = 0;
         }

         return -1;
      }
   }

   // $VF: renamed from: a (int, int) void
   public final void method_392(int var1, int var2) {
      this.field_717 = var1;
      this.field_718 = var2;
   }

   // $VF: renamed from: a (int) void
   public final void method_393(int var1) {
      this.field_717 = var1;
   }

   // $VF: renamed from: b (int) void
   public final void method_394(int var1) {
      this.field_718 = var1;
   }

   // $VF: renamed from: a () int
   public final int method_395() {
      return this.field_718;
   }

   // $VF: renamed from: b () int
   public final int method_396() {
      return this.field_717;
   }

   // $VF: renamed from: b (int, int) void
   public final void method_397(int var1, int var2) {
      this.field_719 = var1;
      this.field_720 = var2;
   }

   // $VF: renamed from: c () int
   public final int method_398() {
      return this.field_719;
   }

   // $VF: renamed from: d () int
   public final int method_399() {
      return this.field_720;
   }

   // $VF: renamed from: c (int) void
   public final void method_400(int var1) {
      this.field_723 = var1;
   }

   // $VF: renamed from: e () int
   public final int method_401() {
      return this.field_723;
   }

   // $VF: renamed from: d (int) void
   public final void method_402(int var1) {
      this.field_721 = var1 << 8;
   }

   // $VF: renamed from: e (int) void
   public final void method_403(int var1) {
      this.field_721 = var1;
   }

   // $VF: renamed from: f () int
   public final int method_404() {
      return this.field_721;
   }

   // $VF: renamed from: f (int) void
   public final void method_405(int var1) {
      this.field_722 = var1 << 8;
   }

   // $VF: renamed from: g () int
   public final int method_406() {
      return this.field_722;
   }

   // $VF: renamed from: g (int) void
   public final void method_407(int var1) {
      this.field_725 = var1;
      this.field_724 = 0;
   }

   // $VF: renamed from: h () int
   public final int method_408() {
      return this.field_725;
   }

   // $VF: renamed from: a () g
   public final class_20 method_409() {
      return this.field_726.method_446(0);
   }

   // $VF: renamed from: i () int
   public final int method_410() {
      return this.field_726.method_458();
   }

   // $VF: renamed from: h (int) void
   public final void method_411(int var1) {
      this.field_730 = -1;
      if (var1 != this.field_716) {
         this.field_726 = field_715[var1];
      }

      this.field_716 = var1;
      this.field_724 = 0;
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_412(int var1, int var2, int var3) {
      byte var4 = -1;
      if (var3 == 0) {
         var4 = 0;
      } else if (var1 == 0 && var3 == class_17.field_310[var2] - 1) {
         var4 = 1;
      }

      int var5 = -1;

      for (int var6 = 0; var6 < field_713.length; var6++) {
         if (field_713[var6][0] == var2 && (field_713[var6][1] == -1 || field_713[var6][1] == var4 || field_713[var6][1] == 2 && var3 > 0 && var3 % 5 == 0)) {
            var5 = var6;
            if (var1 != 0 && field_713[var6][1] != -1) {
               break;
            }
         }
      }

      this.method_411(var5);
   }

   // $VF: renamed from: j () int
   public final int method_413() {
      return this.field_716;
   }

   // $VF: renamed from: a () boolean
   public final boolean method_414() {
      return field_713[this.field_716][1] == 1;
   }

   // $VF: renamed from: b () boolean
   public final boolean method_415() {
      return field_713[this.field_716][1] == 0;
   }

   // $VF: renamed from: k () int
   public final int method_416() {
      return field_713[this.field_716][2];
   }

   // $VF: renamed from: i (int) void
   public final void method_417(int var1) {
      this.field_730 = var1;
   }

   // $VF: renamed from: l () int
   public final int method_418() {
      return this.field_730;
   }

   // $VF: renamed from: c () boolean
   public final boolean method_419() {
      return this.field_730 != -1;
   }

   // $VF: renamed from: a (boolean) void
   public final void method_420(boolean var1) {
      if (!this.field_728) {
         this.field_729 = 0;
      }

      this.field_728 = var1;
   }

   // $VF: renamed from: a () void
   public final void method_421() {
      this.field_731 = -1;
   }

   // $VF: renamed from: j (int) void
   public final void method_422(int var1) {
      this.field_732 = 0;
      if (var1 == -1) {
         this.field_731 = -1;
      } else {
         this.field_731 = var1 - 12;
         this.field_733 = new class_35();
         this.field_733 = class_15.method_178(field_734[this.field_731]);
         this.field_733.method_451(0, field_735[this.field_731], true);
      }
   }

   static {
      int[] var10000 = new int[]{-1, -1, -1};
   }
}
