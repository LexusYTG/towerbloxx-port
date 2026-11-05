package com.digitalchocolate.towerbloxx;
// $VF: renamed from: ai
public final class class_29 {
   // $VF: renamed from: a int
   int field_698;
   // $VF: renamed from: b int
   int field_699;
   // $VF: renamed from: c int
   int field_700;
   // $VF: renamed from: d int
   int field_701;
   // $VF: renamed from: e int
   int field_702;
   // $VF: renamed from: f int
   int field_703;
   // $VF: renamed from: g int
   int field_704;
   // $VF: renamed from: h int
   int field_705;
   // $VF: renamed from: i int
   int field_706;
   // $VF: renamed from: a aa
   class_35 field_707 = class_15.method_178(131234);
   // $VF: renamed from: b aa
   class_35 field_708 = class_15.method_178(131449);
   // $VF: renamed from: c aa
   class_35 field_709 = class_15.method_178(131236);
   // $VF: renamed from: d aa
   class_35 field_710 = class_15.method_178(131248);

   // $VF: renamed from: a () void
   public final void method_384() {
      if (this.field_703 == 0) {
         this.field_703 = this.field_702 * this.field_698;
      }

      this.field_698 = 0;
      this.field_700 = 0;
   }

   // $VF: renamed from: a (int, int, int) boolean
   public final boolean method_385(int var1, int var2, int var3) {
      if (var1 == 2) {
         return false;
      } else if (this.field_700 > 0) {
         this.field_700 = 6000;
         this.method_386();
         return false;
      } else {
         this.field_701 = 0;
         this.field_704 = var3;
         this.field_702 = 0;
         this.field_706 = 0;
         this.field_699 = this.field_698 = 1;
         this.field_709.method_451(0, -1, true);
         if (var2 != 1) {
            this.field_700 = 6000;
         }

         return true;
      }
   }

   // $VF: renamed from: b () void
   public final void method_386() {
      if (this.field_700 > 0) {
         this.field_701 = 0;
         this.field_706++;
         this.field_705 = Math.max(this.field_705, this.field_706);
         if (this.field_698 < 3) {
            this.field_698++;
            this.field_699++;
         }
      }
   }
}
