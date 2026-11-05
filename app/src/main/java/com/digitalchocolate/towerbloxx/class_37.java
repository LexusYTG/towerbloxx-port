package com.digitalchocolate.towerbloxx;
import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

// $VF: renamed from: ad
public final class class_37 extends FullCanvas implements PlayerListener {
   // $VF: renamed from: a ag
   private static class_0 field_1027;
   // $VF: renamed from: a boolean
   private static boolean field_1028;
   // $VF: renamed from: b boolean
   private static boolean field_1029;
   // $VF: renamed from: a int
   private static int field_1030;
   // $VF: renamed from: a java.lang.String
   private static String field_1031;
   // $VF: renamed from: a javax.microedition.lcdui.Image
   private static Image field_1032;
   // $VF: renamed from: b int
   private static int field_1033;
   // $VF: renamed from: c int
   private static int field_1034;
   // $VF: renamed from: b java.lang.String
   private static String field_1035;
   // $VF: renamed from: b javax.microedition.lcdui.Image
   private static Image field_1036;
   // $VF: renamed from: d int
   private static int field_1037;
   // $VF: renamed from: a java.util.Hashtable
   private static Hashtable field_1038;
   // $VF: renamed from: a javax.microedition.lcdui.Font
   private static Font field_1039;
   // $VF: renamed from: c boolean
   private static boolean field_1040;
   // $VF: renamed from: a ad
   private static class_37 field_1041;
   // $VF: renamed from: a int[]
   private static int[] field_1042;
   // $VF: renamed from: e int
   private static int field_1043;
   // $VF: renamed from: b int[]
   private static int[] field_1044;
   // $VF: renamed from: f int
   private static int field_1045;
   // $VF: renamed from: c int[]
   private static int[] field_1046;
   // $VF: renamed from: g int
   private static int field_1047;
   // $VF: renamed from: d int[]
   private static int[] field_1048;
   // $VF: renamed from: h int
   private static int field_1049;
   // $VF: renamed from: d boolean
   private static boolean field_1050 = false;
   // $VF: renamed from: e boolean
   private static boolean field_1051 = false;
   // $VF: renamed from: f boolean
   private static boolean field_1052 = false;
   // $VF: renamed from: a y
   private static class_2 field_1053;
   // $VF: renamed from: i int
   private static int field_1054;
   // $VF: renamed from: a java.lang.String[]
   private static final String[] field_1055 = new String[]{"audio/midi", "audio/wav", "audio/amr", "audio/mpeg"};
   // $VF: renamed from: a javax.microedition.media.Player
   private static Player field_1056;
   // $VF: renamed from: j int
   private static int field_1057;
   // $VF: renamed from: c java.lang.String
   private static String field_1058;
   // $VF: renamed from: a byte[]
   private static byte[] field_1059;
   // $VF: renamed from: b java.util.Hashtable
   private static Hashtable field_1060;
   // $VF: renamed from: c java.util.Hashtable
   private static Hashtable field_1061;
   // $VF: renamed from: k int
   private static int field_1062;
   // $VF: renamed from: b java.lang.String[]
   private static String[] field_1063;
   // $VF: renamed from: a java.lang.String[][]
   private static String[][] field_1064;
   // $VF: renamed from: c java.lang.String[]
   private static String[] field_1065;
   // $VF: renamed from: d java.util.Hashtable
   private static Hashtable field_1066;
   // $VF: renamed from: d java.lang.String
   private static String field_1067 = "";
   // $VF: renamed from: g boolean
   private static boolean field_1068;
   // $VF: renamed from: a m
   private static class_14 field_1069;
   // $VF: renamed from: a b
   private static class_25 field_1070;

   public class_37() {
      field_1042 = new int[5];
      field_1044 = new int[5];
      field_1046 = new int[5];
      field_1048 = new int[5];
      field_1043 = -1;
      field_1045 = -1;
      field_1047 = -1;
      field_1049 = -1;
   }

   // $VF: renamed from: a () void
   public static void method_600() {
      if (field_1056 != null) {
         method_645(field_1056);
      }
   }

   public final void keyReleased(int var1) {
      int var3 = 0;

      for (int var2 = 0; var2 <= field_1043; var2++) {
         if (field_1042[var2] == var1) {
            var3++;
         }

         if (var2 + var3 <= field_1043) {
            field_1042[var2] = field_1042[var2 + var3];
         }
      }

      field_1043 -= var3;
      if (field_1047 < 4) {
         field_1046[++field_1047] = var1;
      }

      field_1051 = true;
   }

   public final void hideNotify() {
      try {
         field_1027.pauseApp();
      } catch (Throwable var1) {
      }
   }

   // $VF: renamed from: a (int) byte[]
   public static byte[] method_601(int var0) {
      byte[] var1 = null;
      if (var0 != -1) {
         Integer var3;
         if (field_1066 != null && (var3 = (Integer)field_1066.get(field_1063[field_1062] + var0)) != null && (var0 = var3) == -1) {
            return null;
         }

         if ((var1 = (byte[])field_1060.get(new Integer(var0))) == null) {
            int var4 = var0 >>> 16;
            int var2 = var0 & 65535;
            String var10000 = "r" + var4;
            Object var5 = null;
            method_602(var10000);
            var1 = method_638(var2);
            field_1060.put(new Integer(var0), var1);
         }
      }

      return var1;
   }

   public final void keyRepeated(int var1) {
      if (var1 != -6 && var1 != -7) {
         if (field_1049 < 4) {
            field_1048[++field_1049] = var1;
         }

         field_1052 = true;
      }
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private static boolean method_602(String var0) {
      boolean var1 = false;
      if (var0.equals(field_1058)) {
         var1 = true;
      } else {
         class_0.field_12 = true;
         field_1058 = null;
         field_1059 = null;

         try {
            field_1059 = new byte[4];
            InputStream var2;
            if ((var2 = com.dranp.rally3d.Res.open(var0)) != null) {
               var2.read(field_1059, 0, 4);
               int var3 = method_631(0);
               int var4 = 4;
               field_1059 = new byte[var3];

               while (var4 < var3) {
                  var4 += var2.read(field_1059, var4, var3 - var4);
               }

               var2.close();
               field_1058 = var0;
               var1 = true;
            }
         } catch (Exception var5) {
         }
      }

      return var1;
   }

   // $VF: renamed from: a (java.lang.String) void
   public static void method_603(String var0) {
      field_1038.put(new Integer(16777216), var0);
      if (field_1030 == 0) {
         field_1031 = var0;
      }

      if (field_1034 == 0) {
         field_1035 = var0;
      }
   }

   // $VF: renamed from: a (int) int
   public static int method_604(int var0) {
      return (Integer)field_1038.get(new Integer(50331648 | var0));
   }

   // $VF: renamed from: b () void
   public static void method_605() {
      method_645(null);
   }

   // $VF: renamed from: a (boolean) void
   public static void method_606(boolean var0) {
      field_1028 = false;
      field_1029 = true;
      class_37 var1 = field_1041;
      Display.getDisplay(class_0.field_10).setCurrent(var1);
   }

   // $VF: renamed from: a (ag) void
   public static void method_607(class_0 var0) {
      if (field_1041 == null) {
         field_1041 = new class_37();
      }

      field_1027 = var0;
   }

   // $VF: renamed from: a () int
   public static int method_608() {
      return field_1041.getWidth();
   }

   // $VF: renamed from: b () int
   public static int method_609() {
      return field_1062;
   }

   // $VF: renamed from: c () void
   public static void method_610() {
      class_0.field_12 = true;
      field_1065 = new String[25];
      if (!"null".equals("null")) {
         field_1067 = "null";
      }

      try {
         InputStream var0;
         if ((var0 = com.dranp.rally3d.Res.open("p")) != null) {
            DataInputStream var1 = new DataInputStream(var0);

            try {
               while (true) {
                  byte var17 = var1.readByte();
                  field_1065[var17 - 1] = var1.readUTF();
               }
            } catch (EOFException var7) {
               var1.close();
            }
         }
      } catch (Exception var8) {
      }

      for (int var9 = 1; var9 <= 25; var9++) {
         String var12;
         if ((var12 = class_0.field_10.getAppProperty("DCHOC-" + var9)) != null) {
            field_1065[var9 - 1] = var12;
         }
      }

      field_1060 = new Hashtable();
      field_1061 = new Hashtable();
      int var10 = 0;
      Vector var13 = new Vector();
      Object var2 = null;

      do {
         method_643(var10);
         var13.addElement(method_618(0));
         var13.addElement(method_618(1));
         var13.addElement(method_618(3));
      } while (method_602("l" + ++var10 + "_0"));

      field_1064 = new String[var10][2];
      field_1063 = new String[var10];
      int var3 = 0;
      int var15 = 0;

      for (int var4 = 0; var4 < var10; var4++) {
         field_1064[var4][0] = (String)var13.elementAt(var3++);
         field_1063[var4] = (String)var13.elementAt(var3++);
         if (field_1063[var4].equals(field_1065[6])) {
            var15 = var4;
         }

         field_1064[var4][1] = (String)var13.elementAt(var3++);
      }

      method_643(var15);
      field_1066 = new Hashtable();

      try {
         DataInputStream var11 = new DataInputStream(new ByteArrayInputStream(method_601(1376310)));

         try {
            while (true) {
               String var14 = var11.readUTF();
               if ("void".equals(var14)) {
                  field_1066 = null;
                  break;
               }

               int var16 = var11.readInt();
               var3 = var11.readInt();
               field_1066.put(var14 + var16, new Integer(var3));
            }
         } catch (EOFException var5) {
         }

         var11.close();
      } catch (Exception var6) {
      }

      field_1038 = new Hashtable();
      field_1030 = -1;
      field_1034 = -1;
      field_1054 = (field_1039 = Font.getFont(32, 1, 8)).getHeight() + 2 + 2 + 2;
   }

   // $VF: renamed from: a () java.lang.String[][]
   public static String[][] method_611() {
      return field_1064;
   }

   // $VF: renamed from: a (int) void
   public static void method_612(int var0) {
      field_1057 = var0;
      if (var0 == 0) {
         method_624();
      } else {
         method_645(field_1056);
      }
   }

   // $VF: renamed from: a (int, int, int) javax.microedition.media.Player
   private static Player method_613(int var0, int var1, int var2) {
      Player var3 = null;

      try {
         if ((var3 = method_633(var0)).getState() != 300) {
            var3.prefetch();
         }

         var3.setLoopCount(var1);
         VolumeControl var5;
         if ((var5 = (VolumeControl)var3.getControl("VolumeControl")) != null) {
            var5.setLevel(var2 * 20);
         }

         var3.start();
      } catch (Exception var4) {
      }

      return var3;
   }

   public final void keyPressed(int var1) {
      if (var1 != -10) {
         if (++field_1043 >= field_1042.length) {
            int[] var2 = field_1042;
            field_1042 = new int[field_1042.length + 1];
            System.arraycopy(var2, 0, field_1042, 0, var2.length);
         }

         field_1042[field_1043] = var1;
         if (field_1045 < 4) {
            field_1044[++field_1045] = var1;
         }

         field_1050 = true;
      }
   }

   // $VF: renamed from: a (int) java.lang.String
   public static String method_614(int var0) {
      String var3 = null;
      int[][] var1 = new int[][]{{-1, -2, -2, -2, -2}, {-1, -2, -2, -2, -1}, {-1, 129, -2, 130, 131}};
      String var2;
      if ((var2 = method_622(22)) != null) {
         var0 = Integer.parseInt(var2);
         if ((var3 = method_618(var1[2][var0])) != null && var3.length() == 1) {
            var3 = null;
         }
      }

      return var3 != null ? var3 : "";
   }

   // $VF: renamed from: d () void
   public static void method_615() {
      if (field_1050) {
         for (int var0 = 0; var0 <= field_1045; var0++) {
            method_625(3);
            int var1;
            if ((var1 = field_1044[var0]) == -6) {
               if (field_1030 != -1) {
                  field_1027.method_2(field_1030, 3);
               }
            } else if (var1 == -7) {
               if (field_1034 != -1) {
                  field_1027.method_2(field_1034, 3);
               }
            } else {
               field_1027.method_2(var1, 0);
            }
         }

         field_1050 = false;
         field_1045 = -1;
      }

      if (field_1051) {
         for (int var4 = 0; var4 <= field_1047; var4++) {
            int var6 = field_1046[var4];
            int var2 = 0;

            for (int var3 = 0; var3 <= field_1043; var3++) {
               if (field_1042[var3] == var6) {
                  var2++;
               }

               if (var3 + var2 <= field_1043) {
                  field_1042[var3] = field_1042[var3 + var2];
               }
            }

            field_1043 -= var2;
            if (var6 != -6 && var6 != -7) {
               field_1027.method_2(var6, 1);
            }
         }

         field_1051 = false;
         field_1047 = -1;
      }

      if (field_1052) {
         for (int var5 = 0; var5 <= field_1049; var5++) {
            int var7 = field_1048[var5];
            field_1027.method_2(var7, 2);
         }

         field_1052 = false;
         field_1049 = -1;
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String[]) java.lang.String
   public static String method_616(String var0, String[] var1) {
      try {
         if (var1.length == 1) {
            var0 = method_644(var0, "%U", var1[0]);
         } else {
            for (int var2 = 0; var2 < var1.length; var2++) {
               var0 = method_644(var0, "%" + var2 + "U", var1[var2]);
            }
         }
      } catch (Exception var3) {
      }

      return var0;
   }

   // $VF: renamed from: c () int
   public static int method_617() {
      return field_1054;
   }

   // $VF: renamed from: b (int) java.lang.String
   public static String method_618(int var0) {
      String var1 = null;
      if (var0 == -1) {
         return null;
      } else if (var0 == -2) {
         return "";
      } else {
         if ((var1 = (String)field_1061.get(new Integer(var0))) == null) {
            try {
               int var2 = var0 >>> 16;
               int var3 = var0 & 65535;
               String var10000 = "l" + field_1062 + "_" + var2;
               Object var6 = null;
               method_602(var10000);
               byte[] var7 = method_638(var3);
               DataInputStream var8;
               var1 = (var8 = new DataInputStream(new ByteArrayInputStream(var7))).readUTF();
               var8.close();
            } catch (Exception var4) {
            }

            if (var1 != null) {
               field_1061.put(new Integer(var0), var1);
            }
         }

         return var1;
      }
   }

   // $VF: renamed from: a (java.lang.String, byte[], int) void
   public static void method_619(String var0, byte[] var1, int var2) {
      class_0.field_12 = true;
      if (!field_1068 || var2 == 1) {
         try {
            RecordStore.deleteRecordStore(var0);
         } catch (Exception var3) {
         }

         if (var1 != null) {
            try {
               RecordStore var5;
               (var5 = RecordStore.openRecordStore(var0, true)).addRecord(var1, 0, var1.length);
               var5.closeRecordStore();
               return;
            } catch (Exception var4) {
            }
         }
      }
   }

   // $VF: renamed from: a (int, int) void
   public static void method_620(int var0, int var1) {
      String var2 = (String)field_1038.get(new Integer(16777216 | var0));
      Image var3 = (Image)field_1038.get(new Integer(33554432 | var0));
      int var4 = (Integer)field_1038.get(new Integer(50331648 | var0));
      boolean var5 = true;
      int var6 = -1;
      if (var1 == 0) {
         if (var4 != 0 && var4 != 1) {
            if (field_1034 == -1) {
               var5 = false;
            } else if (var4 > field_1037) {
               var6 = field_1034;
               var5 = false;
            }
         } else if (field_1030 != -1) {
            if (var4 < field_1033) {
               var6 = field_1030;
            } else {
               var5 = false;
            }
         }

         if (var6 != -1) {
            method_629();
            if (var5) {
               method_620(var6, 3);
            } else {
               method_620(var6, 1);
            }
         }
      } else if (var1 != 1) {
         var5 = false;
      }

      if (var5) {
         field_1030 = var0;
         field_1032 = var3;
         field_1031 = var2;
         field_1033 = var4;
      } else {
         field_1034 = var0;
         field_1036 = var3;
         field_1035 = var2;
         field_1037 = var4;
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
   }

   // $VF: renamed from: d () int
   public static int method_621() {
      return field_1041.getHeight();
   }

   // $VF: renamed from: c (int) java.lang.String
   public static String method_622(int var0) {
      String var1 = field_1065[var0 - 1];
      if (var0 == 5) {
         String var9 = var1;
         var1 = null;
         if (var9 != null) {
            String var2 = field_1065[24];
            boolean var3 = true;
            int var4 = 0;
            int var5 = 0;

            while (var4 < var9.length()) {
               var5++;
               int var6;
               if ((var6 = var9.indexOf("!.!", var4)) == -1) {
                  var6 = var9.length();
               }

               var4 = var6 + "!.!".length();
            }

            String[] var14 = new String[var5];
            var4 = 0;

            for (int var12 = 0; var12 < var14.length; var12++) {
               int var7;
               if ((var7 = var9.indexOf("!.!", var4)) == -1) {
                  var7 = var9.length();
               }

               String var11 = var9.substring(var4, var7);
               String var8 = "DCHOC-GMG-" + var12;
               if ((var8 = class_0.field_10.getAppProperty(var8)) != null && !var8.equals("")) {
                  if (var8.equals(var2)) {
                     var8 = "none";
                  }

                  var11 = var8;
               }

               if (!var11.equals("none") && var3) {
                  var3 = false;
               }

               var14[var12] = var11;
               var4 = var7 + "!.!".length();
            }

            if (!var3) {
               var1 = var14[0];

               for (int var13 = 1; var13 < var14.length; var13++) {
                  var1 = var1 + "!.!" + var14[var13];
               }
            }
         }
      }

      return var1;
   }

   // $VF: renamed from: a (y) void
   public static void method_623(class_2 var0) {
      field_1053 = var0;
      int var1;
      if (var0 != null && (var1 = field_1053.method_21() + 2 + 2) > field_1054) {
         field_1054 = var1;
      }
   }

   // $VF: renamed from: e () void
   public static void method_624() {
      method_645(field_1056);
      field_1056 = null;
   }

   // $VF: renamed from: b (int) void
   public static void method_625(int var0) {
      if (var0 == 0) {
         for (int var1 = 0; var1 <= field_1043; var1++) {
            field_1027.method_2(field_1042[var1], 1);
         }

         field_1043 = -1;
      }
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public static String method_626(String var0) {
      return class_0.field_10.getAppProperty(var0);
   }

   // $VF: renamed from: a (int) c
   public static class_24 method_627(int var0) {
      class_24 var1 = null;
      if (var0 != -1) {
         Integer var2;
         if (field_1066 != null && (var2 = (Integer)field_1066.get(field_1063[field_1062] + var0)) != null && (var0 = var2) == -1) {
            return null;
         }

         byte[] var7;
         if ((var7 = (byte[])field_1060.get(new Integer(var0))) != null) {
            var1 = class_24.method_280(var7, 0, var7.length);
         }

         if (var1 == null) {
            int var8 = var0 >>> 16;
            int var5 = var0 & 65535;
            String var10000 = "r" + var8;
            Object var9 = null;
            method_602(var10000);
            var8 = field_1059.length;
            int var3 = method_631(4);
            int var4 = method_631(8 + (var5 << 2));
            int var6;
            if (var5 == var3 - 1) {
               var6 = var8 - var4;
            } else {
               var6 = method_631(8 + (var5 << 2) + 4) - var4;
            }

            var1 = class_24.method_280(field_1059, var4, var6);
            field_1060.put(new Integer(var0), var1.method_291());
         }
      }

      return var1;
   }

   // $VF: renamed from: a (java.lang.String, c, int) void
   public static void method_628(String var0, class_24 var1, int var2) {
      byte[] var3 = null;
      if (var1 != null) {
         var3 = var1.method_291();
      }

      method_619(var0, var3, var2);
   }

   // $VF: renamed from: f () void
   public static void method_629() {
      field_1030 = -1;
      field_1032 = null;
      field_1031 = null;
      field_1034 = -1;
      field_1036 = null;
      field_1035 = null;
   }

   // $VF: renamed from: b (int, int) void
   public static void method_630(int var0, int var1) {
      if (field_1057 != 0 && var0 != -1) {
         method_645(null);
         method_624();
         field_1056 = method_613(var0, var1, field_1057);
      }
   }

   // $VF: renamed from: c (int) int
   private static int method_631(int var0) {
      return (field_1059[var0] & 0xFF) << 24 | (field_1059[var0 + 1] & 0xFF) << 16 | (field_1059[var0 + 2] & 0xFF) << 8 | field_1059[var0 + 3] & 0xFF;
   }

   // $VF: renamed from: b (int) int
   public static int method_632(int var0) {
      if ((var0 < 48 || var0 > 57) && var0 != 42 && var0 != 35) {
         int var1 = 0;

         try {
            if (var0 != -11111) {
               var1 = field_1041.getGameAction(var0);
            }
         } catch (Exception var2) {
         }

         if (var1 != 0) {
            byte var3;
            if (var1 == 8) {
               var3 = 53;
            } else if (var1 == 1) {
               var3 = 50;
            } else if (var1 == 6) {
               var3 = 56;
            } else if (var1 == 2) {
               var3 = 52;
            } else if (var1 == 5) {
               var3 = 54;
            } else {
               var3 = 0;
            }

            return var3;
         } else {
            return 0;
         }
      } else {
         return var0;
      }
   }

   // $VF: renamed from: a (int) javax.microedition.media.Player
   private static Player method_633(int var0) {
      try {
         Player var2;
         (var2 = Manager.createPlayer(new ByteArrayInputStream(method_601(var0)), field_1055[0])).addPlayerListener(field_1041);
         return var2;
      } catch (Exception var1) {
         return null;
      }
   }

   // $VF: renamed from: g () void
   public static void method_634() {
      field_1040 = true;
      field_1041.repaint();
      field_1041.serviceRepaints();
      field_1040 = false;
   }

   // $VF: renamed from: h () void
   public static void method_635() {
      field_1068 = true;
   }

   // $VF: renamed from: a (java.lang.String) byte[]
   public static byte[] method_636(String var0) {
      class_0.field_12 = true;
      byte[] var1 = null;

      try {
         RecordStore var3;
         var1 = (var3 = RecordStore.openRecordStore(var0, false)).getRecord(1);
         var3.closeRecordStore();
      } catch (Exception var2) {
      }

      return var1;
   }

   // $VF: renamed from: a (int, int, javax.microedition.lcdui.Image, int) void
   public static void method_637(int var0, int var1, Image var2, int var3) {
      field_1038.put(new Integer(0 | var0), new Integer(var1));
      field_1038.put(new Integer(16777216 | var0), method_618(var1));
      if (var2 != null) {
         field_1038.put(new Integer(33554432 | var0), var2);
      }

      field_1038.put(new Integer(50331648 | var0), new Integer(var3));
   }

   // $VF: renamed from: b (int) byte[]
   private static byte[] method_638(int var0) {
      int var1 = field_1059.length;
      int var2 = method_631(4);
      int var3 = method_631(8 + (var0 << 2));
      if (var0 == var2 - 1) {
         var1 -= var3;
      } else {
         var1 = method_631(8 + (var0 << 2) + 4) - var3;
      }

      byte[] var4 = new byte[var1];
      System.arraycopy(field_1059, var3, var4, 0, var1);
      return var4;
   }

   public final void paint(Graphics var1) {
      if (field_1040) {
         field_1027.method_0(var1);
         int var2 = field_1041.getWidth();
         int var3 = field_1041.getHeight();
         var1.setClip(0, 0, var2, var3);
         var3 -= 2;
         var1.setFont(field_1039);
         if (field_1030 != -1) {
            if (field_1032 != null) {
               var1.drawImage(field_1032, 2, var3 - field_1032.getHeight(), 20);
            } else if (field_1053 != null) {
               field_1053.method_22(var1, field_1031, 2, var3, 36);
            } else {
               boolean var4 = false;
               int var5 = var3 - 1;
               var1.setColor(0);
               var1.drawString(field_1031, 2, var5, 36);
               var1.drawString(field_1031, 3, var5 - 1, 36);
               var1.drawString(field_1031, 4, var5, 36);
               var1.drawString(field_1031, 3, var5 + 1, 36);
               var1.setColor(16777215);
               var1.drawString(field_1031, 3, var5, 36);
            }
         }

         if (field_1034 != -1) {
            if (field_1036 != null) {
               var1.drawImage(field_1036, var2 - 2 - field_1036.getWidth(), var3 - field_1036.getHeight(), 20);
            } else if (field_1053 != null) {
               field_1053.method_22(var1, field_1035, field_1041.getWidth() - 2 - field_1053.method_20(field_1035), var3, 36);
            } else {
               int var7 = var2 - 2;
               int var8 = var3 - 1;
               var1.setColor(0);
               var1.drawString(field_1035, var7 - 1, var8, 40);
               var1.drawString(field_1035, var7, var8 - 1, 40);
               var1.drawString(field_1035, var7 + 1, var8, 40);
               var1.drawString(field_1035, var7, var8 + 1, 40);
               var1.setColor(16777215);
               var1.drawString(field_1035, var7, var8, 40);
            }
         }

         field_1027.method_5(var1);
      }
   }

   // $VF: renamed from: a (java.lang.String, byte[]) void
   public static void method_639(String var0, byte[] var1) {
      class_0.field_12 = true;
      if (!field_1068) {
         try {
            RecordStore.deleteRecordStore(var0);
         } catch (Exception var2) {
         }

         if (var1 != null) {
            try {
               RecordStore var4;
               (var4 = RecordStore.openRecordStore(var0, true)).addRecord(var1, 0, var1.length);
               var4.closeRecordStore();
               return;
            } catch (Exception var3) {
            }
         }
      }
   }

   // $VF: renamed from: e () int
   public static int method_640() {
      return field_1057;
   }

   // $VF: renamed from: a (int) javax.microedition.lcdui.Image
   public static Image method_641(int var0) {
      Image var1 = null;
      if (var0 != -1) {
         Integer var2;
         if (field_1066 != null && (var2 = (Integer)field_1066.get(field_1063[field_1062] + var0)) != null && (var0 = var2) == -1) {
            return null;
         }

         if ((var1 = (Image)field_1060.get(new Integer(var0))) == null) {
            byte[] var3;
            var1 = Image.createImage(var3 = method_601(var0), 0, var3.length);
            field_1060.put(new Integer(var0), var1);
         }
      }

      return var1;
   }

   // $VF: renamed from: a (java.lang.String) c
   public static class_24 method_642(String var0) {
      byte[] var1;
      return (var1 = method_636(var0)) != null ? class_24.method_280(var1, 0, var1.length) : null;
   }

   // $VF: renamed from: c (int) void
   public static void method_643(int var0) {
      field_1062 = var0;
      field_1061.clear();
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   private static String method_644(String var0, String var1, String var2) {
      int var3;
      return (var3 = var0.indexOf(var1)) >= 0 ? var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length()) : var0;
   }

   // $VF: renamed from: a (javax.microedition.media.Player) void
   private static void method_645(Player var0) {
      if (var0 != null) {
         try {
            var0.stop();
            var0.deallocate();
            var0.close();
            return;
         } catch (Exception var1) {
         }
      }
   }

   // $VF: renamed from: f () int
   public static int method_646() {
      return field_1030;
   }

   public final void showNotify() {
      try {
         if (field_1029) {
            field_1029 = false;
         } else {
            field_1027.startApp();
         }
      } catch (Throwable var1) {
      }
   }

   // $VF: renamed from: a () m
   public static class_14 method_647() {
      if (field_1069 == null) {
         field_1069 = new class_14();
      }

      return field_1069;
   }

   // $VF: renamed from: a () b
   public static class_25 method_648() {
      if (field_1070 == null) {
         field_1070 = new class_25();
      }

      return field_1070;
   }

   // $VF: renamed from: a () o
   public static class_12 method_649() {
      return new class_12();
   }

   static {
      String[] var10000 = new String[]{".mid", ".wav", ".amr", ".mp3"};
      char[] var0 = new char[]{'#', '−', '-'};
      int[] var1 = new int[]{65543, 65544, 65545, 65546};
   }
}
