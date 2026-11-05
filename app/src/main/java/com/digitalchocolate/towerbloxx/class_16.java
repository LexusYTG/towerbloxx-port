package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: k
public final class class_16 {
   // $VF: renamed from: a javax.microedition.lcdui.Image
   Image field_296;
   // $VF: renamed from: a javax.microedition.lcdui.Graphics
   Graphics field_297;
   // $VF: renamed from: a int[]
   int[] field_298;
   // $VF: renamed from: a int[][]
   int[][] field_299;
   // $VF: renamed from: a int
   int field_300;
   // $VF: renamed from: b int
   int field_301;
   // $VF: renamed from: c int
   int field_302;
   // $VF: renamed from: d int
   int field_303;

   public class_16(Image var1) {
      this.field_296 = var1;
      if (var1.isMutable()) {
         this.field_297 = var1.getGraphics();
      }
   }

   public class_16(int var1, int var2) {
      this.field_296 = Image.createImage(var1, var2);
      this.field_297 = this.field_296.getGraphics();
   }

   public class_16(int var1) {
      this(class_37.method_641(var1));
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_179(int var1, int var2, int var3) {
      this.field_300 = 0;
      this.field_301 = 0;
      this.field_302 = var2;
      this.field_303 = var3;
      if (this.field_296.isMutable()) {
         if (this.method_180()) {
            this.field_297.setClip(0, 0, var2, var3);
            return;
         }

         this.field_297.setClip(0, 0, this.field_296.getWidth(), this.field_296.getHeight());
      }
   }

   // $VF: renamed from: a () boolean
   public final boolean method_180() {
      return this.field_302 != 0 && this.field_303 != 0;
   }

   // $VF: renamed from: a () int
   public final int method_181() {
      return this.field_303 != 0 ? this.field_303 : this.field_296.getHeight();
   }

   // $VF: renamed from: a (int[], int, int, int, int, int, int) void
   public final void method_182(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.method_180()) {
         var4 = var4;
         var5 = var5;
      }

      this.field_296.getRGB(var1, var2, var3, var4, var5, var6, var7);
   }

   // $VF: renamed from: b () int
   public final int method_183() {
      return this.field_302 != 0 ? this.field_302 : this.field_296.getWidth();
   }
}
