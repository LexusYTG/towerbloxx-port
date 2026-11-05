package com.digitalchocolate.towerbloxx;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

// $VF: renamed from: ag
public abstract class class_0 extends MIDlet implements Runnable {
   // $VF: renamed from: a long
   private long field_0;
   // $VF: renamed from: a int
   private int field_1;
   // $VF: renamed from: a int[]
   private int[] field_2;
   // $VF: renamed from: b int
   private int field_3;
   // $VF: renamed from: c boolean
   private boolean field_4;
   // $VF: renamed from: d boolean
   private boolean field_5;
   // $VF: renamed from: a boolean
   protected boolean field_6;
   // $VF: renamed from: e boolean
   private boolean field_7;
   // $VF: renamed from: f boolean
   private boolean field_8;
   // $VF: renamed from: g boolean
   private boolean field_9;
   // $VF: renamed from: a ag
   static class_0 field_10;
   // $VF: renamed from: a java.lang.Thread
   private static Thread field_11;
   // $VF: renamed from: b boolean
   static boolean field_12;

   protected class_0() {
      field_10 = this;
      class_37.method_607(this);
   }

   // $VF: renamed from: run () void
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void run() {
      do {
         try {
            try {
               if (!this.field_5) {
                  this.field_2 = new int[8];
                  this.method_4();
                  class_37.method_610();
                  this.method_3(2);
                  this.field_5 = true;
               }

               if (this.field_9) {
                  this.method_3(1);
                  class_37.method_625(1);
                  this.field_8 = false;
                  this.field_9 = false;
                  class_37.method_634();
               }

               if (!this.field_8 && !this.field_6) {
                  long var3;
                  int var1 = (int)((var3 = System.currentTimeMillis()) - this.field_0);
                  this.field_0 = var3;
                  this.field_3 = this.field_3 - Math.min(this.field_2[this.field_1], 500);
                  this.field_3 = this.field_3 + Math.min(var1, 500);
                  this.field_2[this.field_1] = var1;
                  this.field_1 = this.field_1 + 1 & 7;
                  var1 = this.field_3 >> 3;
                  if (!field_12) {
                     class_14 var10000 = class_37.method_647();
                     int var10;
                     if ((var10 = this.field_1 - 1) < 0) {
                        var10 = 7;
                     }

                     int var11 = this.field_2[var10];
                     class_14 var2 = var10000;
                     if (var10000.field_282 && var2.field_281 != 0) {
                        var2.field_280 += var11;
                        if (var2.field_280 > var2.field_281) {
                           var2.field_279 = 1;
                           var2.field_282 = false;
                           field_10.method_3(5);
                        }
                     }
                  }

                  field_12 = false;
                  class_37.method_615();
                  this.method_1(var1);
                  class_37.method_625(2);
                  class_37.method_634();
               }

               Thread.sleep(1L);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         } catch (Throwable var8) {
            throw var8;
         }
      } while (!this.field_6);

      if (this.field_6 && !this.field_7) {
         class_37.method_605();
         class_37.method_624();
         this.method_3(3);
         this.notifyDestroyed();
      }
   }

   public void destroyApp(boolean var1) {
      class_37.method_605();
      class_37.method_624();
      this.field_7 = var1;
      this.field_6 = true;
      if (var1) {
         this.method_3(3);

         try {
            if (field_11 != null) {
               field_11.join();
               field_11 = null;
            }

            return;
         } catch (Exception var2) {
         }
      }
   }

   public void pauseApp() {
      if (!this.field_8) {
         class_37.method_600();
         class_37.method_605();
         this.method_3(0);
         class_37.method_625(0);
         this.field_8 = true;
      }
   }

   public void startApp() {
      if (this.field_4 && this.field_8) {
         this.field_0 = System.currentTimeMillis();
         this.field_9 = true;
      } else {
         if (!this.field_4) {
            class_37.method_606(true);
            if (field_11 == null) {
               (field_11 = new Thread(this)).start();
            }

            this.field_4 = true;
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public abstract void method_0(Graphics var1);

   // $VF: renamed from: a (int) void
   public abstract void method_1(int var1);

   // $VF: renamed from: a (int, int) void
   public abstract void method_2(int var1, int var2);

   // $VF: renamed from: b (int) void
   public abstract void method_3(int var1);

   // $VF: renamed from: a () void
   public final void method_4() {
      this.field_0 = System.currentTimeMillis();
      this.field_1 = 0;

      for (int var1 = 0; var1 < 8; var1++) {
         this.field_2[var1] = 0;
      }

      this.field_3 = 0;
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics) void
   public void method_5(Graphics var1) {
   }

   // $VF: renamed from: a (java.lang.String) boolean
   public static boolean method_6(String var0) {
      boolean var1 = true;

      try {
         if (field_10.platformRequest(var0)) {
            field_10.destroyApp(false);
         }
      } catch (Exception var2) {
         var1 = false;
      }

      return var1;
   }
}
