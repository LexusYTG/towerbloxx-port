package com.digitalchocolate.towerbloxx;
import java.io.EOFException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: v
public final class class_5 {
   // $VF: renamed from: a s
   private class_8 field_86;
   // $VF: renamed from: a byte[]
   private byte[] field_87;
   // $VF: renamed from: a short[]
   private short[] field_88;
   // $VF: renamed from: b short[]
   private short[] field_89;
   // $VF: renamed from: b byte[]
   private byte[] field_90;
   // $VF: renamed from: a int
   private int field_91 = -1;
   // $VF: renamed from: b int
   private int field_92 = -1;
   // $VF: renamed from: a e
   private class_22 field_93;
   // $VF: renamed from: a int[]
   private int[] field_94;
   // $VF: renamed from: b int[]
   private int[] field_95;
   // $VF: renamed from: a e[]
   private class_22[] field_96;
   // $VF: renamed from: a short[][]
   private short[][] field_97;
   // $VF: renamed from: a int[][]
   private int[][] field_98;
   // $VF: renamed from: b int[][]
   private int[][] field_99;
   // $VF: renamed from: c int
   private int field_100;
   // $VF: renamed from: d int
   private int field_101;
   // $VF: renamed from: e int
   private int field_102;
   // $VF: renamed from: f int
   private int field_103;
   // $VF: renamed from: g int
   private int field_104;
   // $VF: renamed from: a boolean
   private boolean field_105;
   // $VF: renamed from: b boolean
   private boolean field_106;
   // $VF: renamed from: c short[]
   private short[] field_107;
   // $VF: renamed from: h int
   private int field_108;
   // $VF: renamed from: i int
   private int field_109;
   // $VF: renamed from: j int
   private int field_110;
   // $VF: renamed from: k int
   private int field_111;
   // $VF: renamed from: l int
   private int field_112;
   // $VF: renamed from: m int
   private int field_113;
   // $VF: renamed from: c boolean
   private boolean field_114;
   // $VF: renamed from: d short[]
   private short[] field_115;
   // $VF: renamed from: c byte[]
   private byte[] field_116;
   // $VF: renamed from: a boolean[]
   private boolean[] field_117;
   // $VF: renamed from: d boolean
   private boolean field_118;
   // $VF: renamed from: a long
   private long field_119;
   // $VF: renamed from: a java.util.Hashtable
   private static Hashtable field_120;
   // $VF: renamed from: n int
   private int field_121;
   // $VF: renamed from: o int
   private int field_122;
   // $VF: renamed from: p int
   private int field_123;
   // $VF: renamed from: q int
   private int field_124;
   // $VF: renamed from: r int
   private int field_125;
   // $VF: renamed from: s int
   private int field_126;
   // $VF: renamed from: e boolean
   private boolean field_127;
   // $VF: renamed from: c int[]
   private static final int[] field_128 = new int[0];

   public class_5(int var1, class_8 var2) {
      try {
         if (false) { throw new EOFException(); } // port: el decompilador perdio los throws originales
         this.method_45(var1, var2);
      } catch (EOFException var3) {
      }
   }

   // $VF: renamed from: a (int) void
   public final void method_37(int var1) {
      if (this.field_124 != 0) {
         class_0.field_12 = true;
         if (this.field_124 == 3) {
            if (this.field_110 >= this.field_109) {
               int var59;
               if (!this.field_114 && (var59 = class_10.method_142()) > 0) {
                  this.field_110 = 0;
                  this.field_109 = var59;
                  this.field_114 = true;
                  return;
               }

               long var77 = System.currentTimeMillis();
               if (!this.field_118) {
                  this.field_118 = true;
                  this.field_119 = var77;
               }

               int var10000 = (int)(var77 - this.field_119);
               boolean var32 = false;
               boolean var78;
               if (var10000 < 150) {
                  var78 = false;
               } else {
                  this.field_118 = false;
                  var78 = true;
               }

               if (var78) {
                  this.method_48();
               }

               return;
            }

            long var10 = System.currentTimeMillis();

            do {
               if (this.field_114) {
                  class_10.method_143();
               } else {
                  var1 = this.field_110;
                  if (this.field_110 < this.field_111) {
                     byte var28 = this.field_90[this.field_92];
                     this.field_86.method_84(var28, var1);
                  } else if ((var1 = var1 - this.field_111) < this.field_112) {
                     this.field_86.method_88(this.field_92, var1);
                  } else {
                     var1 -= this.field_112;
                     short var2 = this.field_115[var1];

                     try {
                        if (false) { throw new EOFException(); } // port: el decompilador perdio los throws originales
                        class_5 var25 = this;
                        if (field_120 == null) {
                           field_120 = new Hashtable();
                        }

                        short var17 = this.field_89[var2];
                        class_24 var18;
                        int var3 = (var18 = class_24.method_280(this.field_87, var17, this.field_87.length - var17)).method_285();
                        Vector var4 = new Vector();
                        Image[][] var5 = new Image[1][];
                        class_35[] var6 = new class_35[1];
                        int var7 = var18.method_285();
                        int var8 = var18.method_285();
                        class_22 var9 = new class_22();
                        this.field_86.method_80(var2, var9, 0);
                        this.field_86.method_98(var2, var9, var7, var3, var8);
                        var7 = var18.method_285();
                        class_8.method_105(var9, var7);
                        var8 = var18.method_287();
                        String var12 = this.field_86.method_79(var2, var8, -1);
                        method_52(var18, 1, var5, var6);
                        Image var39 = var5[0] == null ? null : var5[0][0];
                        class_35 var13 = var6[0];
                        var8 = var18.method_285();
                        if (var12 != null || var13 != null || var39 != null) {
                           if (var13 != null) {
                              class_8.method_99(var9, var12, var13, var8);
                           } else {
                              class_8.method_100(var9, var12, var39, var8);
                           }
                        }

                        byte var40 = var18.method_284();
                        if ((var8 = var18.method_285()) != 255) {
                           var4.addElement(new Integer(var40));
                           var4.addElement(new Integer(var8));
                        }

                        this.field_86.method_101(var9, var40, 0);
                        var40 = var18.method_284();
                        if ((var8 = var18.method_285()) != 255) {
                           var4.addElement(new Integer(var40));
                           var4.addElement(new Integer(var8));
                        }

                        this.field_86.method_101(var9, var40, 1);

                        for (int var14 = 0; var14 < var3; var14++) {
                           int var15;
                           switch (var15 = var18.method_285()) {
                              case 0:
                                 var8 = var18.method_287();
                                 var12 = var25.field_86.method_79(var2, var8, var14);
                                 method_52(var18, 3, var5, var6);
                                 Image[] var46 = var5[0];
                                 var13 = var6[0];
                                 var8 = method_53(var18);
                                 var25.field_86.method_102(var2, var9, var14, var15, var12, var13, var46, var8);
                                 break;
                              case 1:
                                 var8 = var18.method_287();
                                 var12 = var25.field_86.method_79(var2, var8, var14);
                                 method_52(var18, 4, var5, var6);
                                 Image[] var45 = var5[0];
                                 var13 = var6[0];
                                 String[] var74 = new String[var15 = var18.method_285()];

                                 for (int var75 = 0; var75 < var15; var75++) {
                                    var8 = var18.method_287();
                                    var74[var75] = var25.field_86.method_79(var2, var8, var14);
                                 }

                                 method_52(var18, var15, var5, var6);
                                 Image[] var76 = var5[0];
                                 class_35 var72 = var6[0];
                                 var8 = method_53(var18);
                                 var25.field_86.method_103(var2, var9, var14, var12, var13, var45, var74, var72, var76, var8);
                                 break;
                              case 2:
                                 var8 = var18.method_287();
                                 var12 = var25.field_86.method_79(var2, var8, var14);
                                 method_52(var18, 4, var5, var6);
                                 Image[] var44 = var5[0];
                                 var13 = var6[0];
                                 var15 = var18.method_285();
                                 int var16 = var18.method_285();
                                 var8 = method_53(var18);
                                 var25.field_86.method_104(var2, var9, var14, var12, var13, var44, var15, var16, var8);
                                 break;
                              case 3:
                                 class_24 var43 = var18;

                                 try {
                                    var43.field_535.skipBytes(26);
                                 } catch (IOException var19) {
                                 }
                                 break;
                              case 4:
                                 var8 = var18.method_287();
                                 var12 = var25.field_86.method_79(var2, var8, var14);
                                 method_52(var18, 1, var5, var6);
                                 Image[] var42 = var5[0];
                                 var13 = var6[0];
                                 var25.field_86.method_102(var2, var9, var14, 1, var12, var13, var42, -1);
                           }
                        }

                        var25.field_86.method_80(var2, var9, 1);
                        var25.field_86.method_106(var9);
                        var9.method_261(0);
                        var25.field_96[var2] = var9;
                        if (var4.size() > 0) {
                           short[] var69 = new short[var4.size()];

                           for (int var73 = 0; var73 < var4.size(); var73++) {
                              var69[var73] = (short)((Integer)var4.elementAt(var73)).intValue();
                           }

                           var25.field_97[var2] = var69;
                        }
                     } catch (EOFException var20) {
                     }
                  }
               }

               this.field_110++;
               var1 = (int)(System.currentTimeMillis() - var10);
            } while (this.field_110 < this.field_109 && var1 < 50);

            return;
         }

         this.field_122 += var1;
         if (this.field_122 < this.field_123) {
            if (this.field_124 != 5) {
               return;
            }
         } else if (this.field_122 >= this.field_123) {
            this.field_122 = this.field_123;
            this.method_48();
            return;
         }
      } else if (this.field_92 != -1) {
         class_0.field_12 = true;
         this.method_49();
         return;
      }

      int var29 = this.field_86.method_71(this.field_91, var1);
      this.method_54(var29);
      if (this.field_93 != null) {
         int[] var27 = this.field_93.method_255(var1);
         Object var30 = null;
         this.field_116[this.field_91] = (byte)this.field_93.field_506;
         if (var27 != null) {
            if (var27[0] == 1) {
               this.method_54(var27[1]);
               return;
            }

            if (var27[0] == 0) {
               boolean var31 = false;
               short[] var33;
               if ((var33 = this.field_97[this.field_91]) != null) {
                  int var34 = 0;

                  while (var34 < var33.length) {
                     short var36 = var33[var34++];
                     short var37 = var33[var34++];
                     if (var36 == var27[1]) {
                        this.method_54(var37);
                        var31 = true;
                     }
                  }
               }

               if (!var31) {
                  int var60 = var27[1];
                  if (var60 != -1 && class_37.method_604(var60) == 2) {
                     this.method_54(-3);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_38(Graphics var1) {
      if (this.field_124 != 5 && this.field_124 != 1) {
         if (this.field_124 == 2 || this.field_124 == 4) {
            this.field_86.method_111(this.field_121, this.field_125, this.field_122);
         }
      } else {
         this.field_86.method_110(this.field_121, this.field_125, this.field_126, this.field_122, var1);
      }
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics) void
   public final void method_39(Graphics var1) {
      if (this.method_42()) {
         this.field_86.method_108(var1, this.method_56());
      } else {
         this.field_86.method_72(this.field_91, var1);
         if (this.field_93 != null) {
            this.field_86.method_76(this.field_91, var1, this.field_93);
         }
      }
   }

   // $VF: renamed from: a (int, int) void
   public final void method_40(int var1, int var2) {
      if (this.field_92 != -1 ? false : this.field_124 == 0 || this.field_124 == 5) {
         if (this.field_93 != null) {
            this.field_93.method_260(var1, var2);
         }

         if (this.field_86 != null) {
            this.field_86.method_74(this.field_91, var1, var2, this.field_124);
         }
      }
   }

   // $VF: renamed from: a () void
   public final void method_41() {
      this.field_127 = true;
      if (this.field_92 == -1) {
         this.field_92 = this.field_91;
      }

      if (this.field_124 != 0) {
         this.field_124 = 1;
         this.method_49();
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_42() {
      return this.field_124 >= 2 && this.field_124 <= 4;
   }

   // $VF: renamed from: b () void
   public final void method_43() {
      if (!this.method_42()) {
         if (this.field_93 != null) {
            this.field_93.field_421 = 0;
         }

         this.field_86.method_70();
      }
   }

   // $VF: renamed from: c () void
   public final void method_44() {
      this.field_86.method_95();
   }

   // $VF: renamed from: a (int, s) void
   private void method_45(int var1, class_8 var2) {
      this.field_86 = var2;
      this.field_87 = class_37.method_601(var1);
      class_24 var10;
      int var13 = (var10 = class_24.method_280(this.field_87, 0, this.field_87.length)).method_285();
      var10.method_285();
      this.field_88 = new short[var13];

      for (int var3 = 0; var3 < var13; var3++) {
         this.field_88[var3] = var10.method_286();
      }

      int var15 = var10.method_285();
      this.field_117 = new boolean[var15];
      this.field_100 = var10.method_285();
      this.field_101 = this.field_100;
      this.field_102 = var10.method_285();
      this.field_103 = this.field_101 + this.field_102;
      int var14 = var10.method_285();
      var15 = this.field_100 + this.field_102 + var14;
      this.field_90 = new byte[var15];

      for (int var4 = 0; var4 < var15; var4++) {
         this.field_90[var4] = var10.method_284();
      }

      this.field_89 = new short[var15];

      for (int var17 = 0; var17 < var15; var17++) {
         this.field_89[var17] = var10.method_286();
      }

      this.field_92 = var10.method_285();
      this.field_96 = new class_22[this.field_100];
      this.field_97 = new short[this.field_100][];
      this.field_98 = new int[this.field_102][];
      this.field_99 = new int[var14][];
      this.field_116 = new byte[this.field_100];
      int var18 = this.field_100;

      for (int var11 = 0; var11 < this.field_102; var11++) {
         int[] var6 = field_128;
         int var7 = this.field_89[this.field_100 + (var18 - this.field_101)];
         class_24 var8;
         if ((var7 = (var8 = class_24.method_280(this.field_87, var7, this.field_87.length - var7)).method_285()) > 0) {
            var6 = new int[var7];

            for (int var9 = 0; var9 < var7; var9++) {
               var6[var9] = method_53(var8);
            }
         }

         this.field_98[var18 - this.field_101] = var6;
         var18++;
      }

      for (int var12 = 0; var12 < var14; var12++) {
         short var19 = this.field_89[this.field_100 + this.field_102 + (var18 - this.field_103)];
         class_24 var21 = class_24.method_280(this.field_87, var19, this.field_87.length - var19);
         int[] var22;
         (var22 = new int[2])[0] = method_53(var21);
         var22[1] = method_53(var21);
         this.field_99[var18 - this.field_103] = var22;
         var18++;
      }

      this.field_104 = var14;
      this.field_107 = new short[this.field_100 + var14 + this.field_102];
      this.field_108 = 0;
      this.field_106 = false;
   }

   // $VF: renamed from: b (int) void
   private void method_46(int var1) {
      this.field_122 = 0;
      this.field_124 = var1;
   }

   // $VF: renamed from: b () boolean
   private boolean method_47() {
      return this.field_109 > 0;
   }

   // $VF: renamed from: d () void
   private void method_48() {
      int var1 = this.field_124;

      boolean var10000;
      do {
         switch (var1) {
            case 1:
               if (this.field_91 != -1) {
                  class_5 var8 = this;
                  if (this.field_127) {
                     this.field_127 = false;
                     int var10 = this.field_100;

                     while (--var10 >= 0) {
                        var8.method_55(var10);
                     }

                     field_120 = null;
                     var8.field_93 = null;
                  }

                  byte var11 = var8.field_90[var8.field_92];
                  byte var12;
                  if ((var12 = var8.field_91 != -1 ? var8.field_90[var8.field_91] : -1) == -1) {
                     if (var8.method_50(var8.field_91)) {
                        var8.method_55(var8.field_91);
                     }
                  } else if (var12 != var11 && !class_8.method_82(var12, var11)) {
                     int var14 = var8.field_117.length;

                     while (--var14 >= 0) {
                        if (var8.field_117[var14] && var14 != var11) {
                           var8.field_86.method_85(var14);
                           int var6 = var8.field_90.length;

                           while (--var6 >= 0) {
                              if (var8.field_90[var6] == var14 && var8.method_50(var6)) {
                                 var8.method_55(var6);
                              }
                           }

                           var8.field_117[var14] = false;
                        }
                     }
                  }

                  var8.field_86.method_89(var8.field_91);
                  var8.field_93 = null;
                  var8.field_94 = null;
                  var8.field_95 = null;
                  class_37.method_629();
               }
            case 2:
            case 3:
            default:
               break;
            case 4:
               class_5 var2 = this;
               int var3;
               if ((var3 = this.field_90[this.field_92]) != -1) {
                  this.field_117[var3] = true;
               }

               field_120 = null;
               this.field_86.method_87(false);
               int var4 = this.field_91;
               this.field_91 = this.field_92;
               this.field_92 = -1;
               int var5 = this.field_108;

               while (--var5 >= 0) {
                  if (var2.field_107[var5] == var2.field_91) {
                     var2.field_108 = var5;
                     break;
                  }
               }

               var3 = var2.field_91;
               if (var2.method_50(var3)) {
                  var2.field_93 = var2.field_96[var3];
                  if (var2.field_105) {
                     var2.field_93.method_261(0);
                  } else {
                     var2.field_93.method_261(var2.field_116[var2.field_91] & 255);
                  }

                  var2.field_86.method_80(var3, var2.field_93, 2);
                  var2.field_93.method_254();
                  var2.field_86.method_80(var3, var2.field_93, 3);
                  var2.field_106 = class_8.method_107(var3);
               } else if (var3 >= var2.field_101 && var3 < var2.field_101 + var2.field_102) {
                  var2.field_94 = var2.field_98[var3 - var2.field_101];
                  var2.field_106 = class_8.method_107(var3);
               } else {
                  var2.method_51(var3);
               }

               var2.field_86.method_73(var4, var2.field_91, var2.field_93);
               var2.field_86.method_71(var2.field_91, 0);
               break;
            case 5:
               this.method_46(0);
               class_0.field_10.method_4();
               return;
         }

         var1++;
         int var15 = this.field_126;
         int var13 = this.field_125;
         if (var1 == 3) {
            var10000 = this.method_47();
         } else {
            if (var13 != var15 || this.method_47()) {
               switch (var1) {
                  case 1:
                     if (var13 == -1) {
                        break;
                     }

                     this.field_121 = 0;
                  case 5:
                     if (var1 == 5) {
                        this.field_121 = 1;
                     }

                     if (this.method_47()) {
                        this.field_121 |= 2;
                     }

                     this.field_123 = 400;
                     var10000 = this.field_123 > 0;
                     continue;
                  case 2:
                     if (var13 == -1 || !this.method_47()) {
                        var10000 = false;
                        continue;
                     }

                     this.field_121 = 3;
                  case 4:
                     label110: {
                        if (var1 == 4) {
                           if (this.field_124 != 3) {
                              break label110;
                           }

                           this.field_121 = 2;
                        }

                        this.field_123 = 400;
                        var10000 = this.field_123 > 0;
                        continue;
                     }
                  case 3:
               }
            }

            var10000 = false;
         }
      } while (!var10000);

      switch (var1) {
         case 3:
            this.field_86.method_87(true);
            this.field_110 = 0;
            this.field_114 = false;
            class_37.method_629();
         case 1:
         case 2:
         case 4:
         case 5:
         default:
            this.method_46(var1);
      }
   }

   // $VF: renamed from: e () void
   private void method_49() {
      this.field_125 = this.field_91;

      while (true) {
         int var2 = this.field_92;
         int var3 = this.field_101 + this.field_102;
         if (var2 < var3 || var2 >= var3 + this.field_104) {
            this.field_91 = this.field_125;
            this.field_126 = this.field_92;
            class_5 var1 = this;
            this.field_111 = 0;
            byte var6 = this.field_90[this.field_92];
            int var8 = -1;
            if (!this.field_127 && this.field_91 != -1) {
               var8 = this.field_90[this.field_91];
            }

            if (var6 != -1 && var6 != var8) {
               if (!class_8.method_82(var6, var8)) {
                  this.field_111 = this.field_86.method_83(var6);
               }

               Vector var10 = new Vector();

               for (int var4 = 0; var4 < var1.field_90.length; var4++) {
                  if (var1.field_90[var4] == var6 && var1.method_50(var4) && (var1.field_96[var4] == null || var1.field_127) && class_8.method_81(var4)) {
                     var10.addElement(new Short((short)var4));
                  }
               }

               int var11 = var10.size();
               var1.field_115 = new short[var11];

               for (int var7 = 0; var7 < var11; var7++) {
                  var1.field_115[var7] = (Short)var10.elementAt(var7);
               }
            } else {
               var8 = this.field_92;
               if (this.method_50(var8) && this.field_96[var8] == null) {
                  this.field_115 = new short[]{(short)var8};
               } else {
                  this.field_115 = new short[0];
               }
            }

            var1.field_112 = var1.field_86.method_86(var1.field_92);
            var1.field_109 = var1.field_111 + var1.field_112 + var1.field_115.length;
            var1.field_113 = 75;
            this.method_48();
            return;
         }

         this.field_91 = this.field_92;
         this.method_51(this.field_92);
         var2 = this.field_92;
         if (this.field_86.method_75(var2)) {
            this.method_54(this.field_95[0]);
         } else {
            this.method_54(this.field_95[1]);
         }
      }
   }

   // $VF: renamed from: a (int) boolean
   private boolean method_50(int var1) {
      return var1 < this.field_100;
   }

   // $VF: renamed from: c (int) void
   private void method_51(int var1) {
      this.field_95 = this.field_99[var1 - this.field_103];
      this.field_106 = false;
   }

   // $VF: renamed from: a (c, int, javax.microedition.lcdui.Image[][], aa[]) void
   private static void method_52(class_24 var0, int var1, Image[][] var2, class_35[] var3) {
      var2[0] = null;
      var3[0] = null;
      int[] var4 = new int[var1];
      byte[] var5 = new byte[var1];
      int var6 = 0;
      boolean var7 = false;

      for (int var8 = 0; var8 < var1; var8++) {
         var4[var8] = var0.method_287();
         var5[var8] = var0.method_284();
         if (var5[var8] == 2 || var5[var8] == 3) {
            var6 = 1;
         }

         if (var4[var8] != -1) {
            var7 = true;
         }
      }

      if (var7) {
         if (var6 != 0) {
            class_9[] var17 = new class_9[var1];

            for (int var10 = 0; var10 < var1; var10++) {
               var6 = var4[var10];
               Integer var15 = new Integer(var6);
               class_9 var11;
               if ((var11 = (class_9)field_120.get(var15)) == null) {
                  var11 = class_10.method_137(var6);
                  field_120.put(var15, var11);
               }

               var17[var10] = var11;
            }

            var3[0] = new class_35(var17);
         } else {
            var2[0] = new Image[var1];

            for (int var16 = 0; var16 < var1; var16++) {
               int var9 = var4[var16];
               Integer var12 = new Integer(var9);
               Image var14;
               if ((var14 = (Image)field_120.get(var12)) == null) {
                  if (var5[var16] == 0) {
                     var14 = class_37.method_641(var9);
                  } else if (var5[var16] == 1) {
                     var14 = class_10.method_139(var9);
                  }

                  if (var14 != null) {
                     field_120.put(var12, var14);
                  }
               }

               var2[0][var16] = var14;
            }
         }
      }
   }

   // $VF: renamed from: a (c) int
   private static int method_53(class_24 var0) {
      int var1;
      return (var1 = var0.method_285()) == 255 ? -1 : var1;
   }

   // $VF: renamed from: d (int) void
   private void method_54(int var1) {
      short var2 = -1;
      if (this.field_108 > 0) {
         var2 = this.field_107[this.field_108 - 1];
      }

      if (var1 != -1) {
         if (var1 == -2) {
            if (this.field_94 != null && this.field_94.length > 0) {
               this.method_54(this.field_94[0]);
               return;
            }
         } else {
            if (var1 == -3) {
               this.field_105 = false;
               this.field_92 = var2;
               this.field_108--;
               return;
            }

            if (var1 >= 0) {
               short var3;
               if ((var3 = this.field_88[var1]) != -1) {
                  this.field_105 = true;
                  this.field_92 = var3;
                  if (this.method_50(this.field_91)) {
                     this.field_116[this.field_91] = (byte)this.field_93.field_506;
                  }

                  if (var2 == var3) {
                     this.field_105 = false;
                     this.field_108--;
                  } else if (this.field_106) {
                     this.field_107[this.field_108++] = (short)this.field_91;
                  }
               }

               this.field_86.method_78(var1);
            }
         }
      }
   }

   // $VF: renamed from: e (int) void
   private void method_55(int var1) {
      if (this.field_96[var1] != null) {
         this.field_96[var1].method_272();
         this.field_96[var1] = null;
      }
   }

   // $VF: renamed from: a () int
   public final int method_56() {
      int var1 = -1;
      if (this.field_124 == 2) {
         return 0;
      } else if (this.field_124 == 4) {
         return 100;
      } else {
         if (this.field_124 == 3) {
            if (this.field_118) {
               return 100;
            }

            var1 = 100 - this.field_113;
            if (this.field_114) {
               var1 += this.field_110 * this.field_113 / this.field_109;
            } else {
               var1 = this.field_110 * var1 / this.field_109;
            }
         }

         return var1;
      }
   }
}
