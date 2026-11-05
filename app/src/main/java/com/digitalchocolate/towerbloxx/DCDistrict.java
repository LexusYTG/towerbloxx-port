package com.digitalchocolate.towerbloxx;
import java.io.EOFException;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class DCDistrict extends class_0 {
   protected void a() { /* TODO: stub, metodo original no existe */ }
   // $VF: renamed from: a v
   private class_5 field_13;
   // $VF: renamed from: b v
   private class_5 field_14;
   // $VF: renamed from: c v
   private class_5 field_15;
   // $VF: renamed from: c boolean
   private boolean field_16;
   // $VF: renamed from: d boolean
   private boolean field_17;
   // $VF: renamed from: a int
   private int field_18;
   // $VF: renamed from: b int
   private int field_19;
   // $VF: renamed from: c int
   private int field_20;
   // $VF: renamed from: e boolean
   private boolean field_21;
   // $VF: renamed from: a y
   private class_2 field_22;
   // $VF: renamed from: b y
   private class_2 field_23;
   // $VF: renamed from: c y
   private class_2 field_24;
   // $VF: renamed from: d y
   private class_2 field_25;
   // $VF: renamed from: e y
   private class_2 field_26;
   // $VF: renamed from: d int
   private static int field_27;
   // $VF: renamed from: e int
   private static int field_28;

   // $VF: renamed from: a (int) void
   public final void method_1(int var1) {
      if (this.field_16) {
         if (this.field_15 != this.field_14) {
            this.field_14 = this.field_15;
         }

         if (this.field_14 != null) {
            this.field_14.method_37(var1);
            if (this.field_20 != -1) {
               this.field_20 = this.field_14.method_56();
            }
         }
      } else if (!this.field_17) {
         this.field_18 = 6;
         this.field_19 = 0;
         this.field_17 = true;
      } else if (this.field_19 >= this.field_18) {
         this.field_16 = true;
         this.field_17 = false;
         this.field_15 = this.field_13;
         this.a();
      } else {
         switch (this.field_19) {
            case 0:
               class_10.method_134();
               break;
            case 1:
               DCDistrict var18 = this;

               try {
                  if (false) { throw new IOException(); } // port: el decompilador perdio los throws originales
                  Object var20 = null;
                  Object var25 = null;
                  Object var4 = null;
                  Object var5 = null;
                  Object var6 = null;
                  Font var7 = null;
                  Font var8 = null;
                  Font var9 = null;
                  Font var10 = null;
                  Font var11 = null;
                  var20 = class_10.method_140(131075);
                  var25 = class_10.method_140(131074);
                  var4 = class_10.method_140(131073);
                  var5 = class_10.method_140(131077);
                  var6 = class_10.method_140(131078);
                  if (var20 == null) {
                     var7 = Font.getFont(32, 0, 8);
                  }

                  if (var25 == null) {
                     var8 = Font.getFont(32, 1, 8);
                  }

                  if (var4 == null) {
                     var9 = Font.getFont(32, 1, 0);
                  }

                  if (var5 == null) {
                     var10 = Font.getFont(32, 0, 8);
                  }

                  if (var6 == null) {
                     var11 = Font.getFont(32, 0, 8);
                  }

                  var18.field_22 = new class_2((class_16)var20, var20 != null ? class_37.method_627(65539) : null, var7, 0, -1);
                  var18.field_23 = new class_2((class_16)var25, var25 != null ? class_37.method_627(65538) : null, var8, 16777215, 0);
                  var18.field_24 = new class_2((class_16)var4, var4 != null ? class_37.method_627(65537) : null, var9, 16776960, 0);
                  var18.field_25 = new class_2((class_16)var5, var5 != null ? class_37.method_627(65541) : null, var10, 0, -1);
                  var18.field_26 = new class_2((class_16)var6, var6 != null ? class_37.method_627(65542) : null, var11, 0, -1);
                  var4 = var18.field_25;
                  var25 = var18.field_26;
                  class_22.field_438 = var18.field_24;
                  class_22.field_439 = (class_2)var25;
                  class_22.field_440 = (class_2)var4;
                  class_37.method_623(var18.field_26);
               } catch (IOException var12) {
               }
               break;
            case 2:
               class_35 var14 = new class_35(new int[]{131082, 131084, 131083});
               class_35 var2 = new class_35(new int[]{131085, 131087, 131086});
               class_35 var15;
               class_22.field_414 = var15 = var14;
               class_22.field_415 = var2;
               class_22.field_419 = 0;

               for (int var3 = 0; var3 < var15.method_453(); var3++) {
                  var15.method_451(var3, -1, true);
                  class_22.field_419 = Math.max(class_22.field_419, var15.method_460() + 2);
               }

               class_22.field_420 = 0;

               for (int var22 = 0; var22 < var2.method_453(); var22++) {
                  var2.method_451(var22, -1, true);
                  class_22.field_420 = Math.max(class_22.field_420, var2.method_460() + 2);
               }

               class_35 var16 = new class_35(new int[]{131088, 131089});
               var2 = new class_35(new int[]{131090, 131091});
               class_35 var17 = var16;
               class_22.field_433 = 0;
               class_22.field_434 = 0;

               for (int var23 = 0; var23 < var17.method_453(); var23++) {
                  var17.method_451(var23, -1, true);
                  class_22.field_433 = Math.max(class_22.field_433, var17.method_459() + 2);
               }

               for (int var24 = 0; var24 < var2.method_453(); var24++) {
                  var2.method_451(var24, -1, true);
                  class_22.field_434 = Math.max(class_22.field_434, var2.method_459() + 2);
               }

               class_22.field_431 = var17;
               class_22.field_432 = var2;
               class_22.field_413 = new class_35(class_10.method_136(131470, true));
               break;
            case 3:
               this.field_13 = new class_5(65536, new class_8(this, this.field_24, this.field_23, this.field_25, this.field_26));
               break;
            case 4:
               this.method_7();
               break;
            case 5:
               for (int var13 = 0; var13 < class_10.method_142(); var13++) {
                  class_10.method_143();
               }
         }

         this.field_19++;
      }
   }

   // $VF: renamed from: b () void
   private void method_7() {
      if (!this.field_21) {
         class_24 var1 = class_37.method_627(1376309);
         byte var2 = 0;
         int var3 = var1.method_282();

         try {
            if (false) { throw new EOFException(); } // port: el decompilador perdio los throws originales
            while (var2 < var3) {
               int var4 = var1.method_285();
               int var5 = var1.method_287();
               boolean var6 = var1.method_285() == 1;
               int var7 = var1.method_287();
               int var8 = var1.method_285();
               var2 += 11;
               class_16 var9 = null;
               if (var7 != -1) {
                  if (var6) {
                     var9 = class_10.method_140(var7);
                  } else {
                     var9 = new class_16(var7);
                  }
               }

               Image var11 = null;
               if (var9 != null) {
                  var11 = var9.field_296;
               }

               class_37.method_637(var4, var5, var11, var8);
            }
         } catch (EOFException var10) {
         }

         this.field_21 = true;
      }
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics) void
   public final void method_5(Graphics var1) {
      if (this.field_14 != null) {
         this.field_14.method_38(var1);
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_0(Graphics var1) {
      class_37.method_648().method_313(var1);
      if (this.field_17) {
         method_9(this.field_19 * 50 / this.field_18);
      } else {
         if (this.field_14 != null) {
            if (this.field_20 != -1) {
               method_9(50 + (this.field_20 >> 1));
               return;
            }

            this.field_14.method_39(var1);
         }
      }
   }

   // $VF: renamed from: a (int, int) void
   public final void method_2(int var1, int var2) {
      if (!this.field_17) {
         if (this.field_14 != null) {
            this.field_14.method_40(var1, var2);
         }
      }
   }

   // $VF: renamed from: b (int) void
   public final void method_3(int var1) {
      if (!this.field_17) {
         if (this.field_14 != null) {
            if (var1 == 1) {
               this.field_14.method_43();
               return;
            }

            if (var1 == 5) {
               this.field_14.method_44();
            }
         }
      }
   }

   // $VF: renamed from: c (int) void
   public final void method_8(int var1) {
      if (this.field_16) {
         this.field_13.method_41();
      }

      class_37.method_643(var1);
      this.field_21 = false;
      this.method_7();
   }

   // $VF: renamed from: d (int) void
   private static void method_9(int var0) {
      class_25 var1;
      (var1 = class_37.method_648()).method_331(0, 0, class_37.method_608(), class_37.method_621());
      var1.method_309(16777215);
      var1.method_308(0, 0, class_37.method_608(), class_37.method_621());
      if (field_28 == 0) {
         if ((field_28 = (class_37.method_621() << 3) / 208) < 5) {
            field_28 = 5;
         }

         field_27 = class_37.method_621() - field_28 >> 1;
      }

      int var2 = class_37.method_608() * 88 / 176;
      int var3 = class_37.method_608() - var2 >> 1;
      int var4 = field_28;
      int var5 = field_27;
      var0 = (var2 - 4) * var0 / 100;
      var1.method_309(0);
      var1.method_307(var3, var5, var2 - 1, var4 - 1);
      var1.method_308(var3 + 2, var5 + 2, var0, var4 - 4);
   }
}
