package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: y
public final class class_2 {
   // $VF: renamed from: a javax.microedition.lcdui.Image
   Image field_38;
   // $VF: renamed from: a javax.microedition.lcdui.Font
   Font field_39;
   // $VF: renamed from: b int
   private int field_40;
   // $VF: renamed from: c int
   private int field_41;
   // $VF: renamed from: a boolean
   boolean field_42;
   // $VF: renamed from: a int
   int field_43;
   // $VF: renamed from: d int
   private int field_44;
   // $VF: renamed from: e int
   private int field_45;
   // $VF: renamed from: a short[]
   private short[] field_46;
   // $VF: renamed from: b short[]
   private short[] field_47;
   // $VF: renamed from: a byte[]
   byte[] field_48;
   // $VF: renamed from: b byte[]
   private byte[] field_49;
   // $VF: renamed from: c byte[]
   private byte[] field_50;
   // $VF: renamed from: a int[]
   private int[] field_51;

   public class_2(class_16 var1, class_24 var2, Font var3, int var4, int var5) {
      if (var1 != null) {
         Object var9 = null;
         this.field_38 = var1.field_296;
         int var6 = var2.method_286();
         this.field_43 = var2.method_284();
         this.field_44 = var2.method_284();
         this.field_45 = var2.method_284();
         int var10 = 1;

         while (var10 < var6) {
            var10 <<= 1;
         }

         this.field_51 = new int[var10];
         this.field_46 = new short[var6];
         this.field_47 = new short[var6];
         this.field_48 = new byte[var6];
         this.field_49 = new byte[var6];
         this.field_50 = new byte[var6];

         while (var6 > 0) {
            int var11 = var2.method_285();
            byte var7 = var2.method_284();
            int var8 = var2.method_285();

            for (char var12 = (char)(var7 << 8 | var8); var11-- > 0; var12++) {
               this.field_46[--var6] = (short)var2.method_285();
               this.field_47[var6] = (short)var2.method_286();
               this.field_48[var6] = (byte)var2.method_284();
               this.field_49[var6] = (byte)var2.method_284();
               this.field_50[var6] = (byte)var2.method_284();
               this.method_23(var12, var6);
            }
         }
      }

      this.field_39 = var3;
      this.field_40 = var4;
      this.field_41 = var5;
      this.field_42 = var5 != -1;
   }

   // $VF: renamed from: a (char) int
   final int method_19(char var1) {
      int var2 = this.method_24(var1);
         if (var2 == -1) {
             var2 = this.method_24(' ');
      }

      return var2;
   }

   // $VF: renamed from: a (java.lang.String) int
   public final int method_20(String var1) {
      if (this.field_38 == null) {
         return this.field_39.stringWidth(var1) + (this.field_42 ? 2 : 0);
      } else {
         int var2 = 0;
         int var3 = var1.length();

         while (--var3 >= 0) {
            int var4 = var1.charAt(var3);
            var4 = this.method_19((char)var4);
            var2 += this.field_48[var4] + this.field_43;
         }

         if (this.field_43 < 0) {
            var2 -= this.field_43;
         }

         return var2;
      }
   }

   // $VF: renamed from: a () int
   public final int method_21() {
      return this.field_38 != null ? this.field_44 + this.field_45 : this.field_39.getHeight() + (this.field_42 ? 2 : 0);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
   public final void method_22(Graphics var1, String var2, int var3, int var4, int var5) {
      if (this.field_38 != null) {
         if ((var5 & 1) != 0) {
            var3 -= this.method_20(var2) >> 1;
         } else if ((var5 & 8) != 0) {
            var3 -= this.method_20(var2);
         }

         if ((var5 & 16) != 0) {
            var4 += this.field_44;
         } else if ((var5 & 32) != 0) {
            var4 -= this.field_45;
         }

         if ((var5 & 2) == 0) {
            Object var21 = null;
            var5 = var1.getClipX();
            int var22 = var1.getClipY();
            int var7 = var1.getClipWidth();
            int var8 = var1.getClipHeight();
            int var9 = var2.length();

            for (int var10 = 0; var10 < var9; var10++) {
               char var11 = var2.charAt(var10);
               int var12 = this.method_19(var11);
               byte var13 = this.field_48[var12];
               if (var11 != ' ') {
                  byte var23 = this.field_50[var12];
                  int var14 = this.field_49[var12];
                  short var15 = this.field_46[var12];
                  int var16 = var5 + var7;
                  int var17 = var22 + var8;
                  int var18 = Math.max(var5, var3);
                  int var19 = Math.max(var22, var4 - var23);
                  var16 = Math.max(var18, Math.min(var16, var3 + var13));
                  var14 = Math.max(var19, Math.min(var17, var4 - var23 + var14));
                  var1.setClip(var18, var19, var16 - var18, var14 - var19);
                  var1.drawImage(this.field_38, var3 - var15, var4 - this.field_47[var12] - var23, 20);
               }

               var3 += var13 + this.field_43;
            }

            var1.setClip(var5, var22, var7, var8);
         }
      } else {
         var1.setFont(this.field_39);
         int var6 = var1.getColor();
         if (this.field_42) {
            if ((var5 & 4) != 0) {
               var3++;
            } else if ((var5 & 8) != 0) {
               var3--;
            }

            if ((var5 & 16) != 0) {
               var4++;
            } else if ((var5 & 32) != 0) {
               var4--;
            }

            var1.setColor(this.field_41);
            var1.drawString(var2, var3, var4 - 1, var5);
            var1.drawString(var2, var3 - 1, var4, var5);
            var1.drawString(var2, var3 + 1, var4, var5);
            var1.drawString(var2, var3, var4 + 1, var5);
         }

         var1.setColor(this.field_40);
         var1.drawString(var2, var3, var4, var5);
         var1.setColor(var6);
      }
   }

   // $VF: renamed from: a (char, int) void
   private void method_23(char var1, int var2) {
      int var6 = var1;

      int var4;
      for (int var5 = var4 = this.field_51.length - 1; var5 >= 0; var5--) {
         var6 &= var4;
         if (this.field_51[var6] == 0) {
            this.field_51[var6] = var1 << 16 | var2;
            return;
         }

         var6++;
      }
   }

   // $VF: renamed from: b (char) int
   private int method_24(char var1) {
      int var2 = var1;

      int var3;
      for (int var4 = var3 = this.field_51.length - 1; var4 >= 0; var4--) {
         int var5;
         if ((var5 = this.field_51[var2 & var3]) >>> 16 == var1) {
            return var5 & 65535;
         }

         if (var5 == 0) {
            break;
         }

         var2++;
      }

      return -1;
   }
}
