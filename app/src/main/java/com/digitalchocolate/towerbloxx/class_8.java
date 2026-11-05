package com.digitalchocolate.towerbloxx;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: s
public final class class_8 {
   // $VF: renamed from: a DCDistrict
   private DCDistrict field_161;
   // $VF: renamed from: a i
   private class_18 field_162;
   // $VF: renamed from: a aa
   private class_35 field_163;
   // $VF: renamed from: b aa
   private class_35 field_164;
   // $VF: renamed from: c aa
   private class_35 field_165;
   // $VF: renamed from: d boolean
   private boolean field_166;
   // $VF: renamed from: a e
   private class_22 field_167;
   // $VF: renamed from: a int
   private int field_168;
   // $VF: renamed from: b int
   private int field_169;
   // $VF: renamed from: e boolean
   private boolean field_170;
   // $VF: renamed from: c int
   private int field_171 = -1;
   // $VF: renamed from: f boolean
   private boolean field_172;
   // $VF: renamed from: g boolean
   private boolean field_173;
   // $VF: renamed from: d int
   private int field_174 = -1;
   // $VF: renamed from: h boolean
   private boolean field_175;
   // $VF: renamed from: i boolean
   private boolean field_176;
   // $VF: renamed from: j boolean
   private static boolean field_177;
   // $VF: renamed from: k boolean
   private static boolean field_178;
   // $VF: renamed from: a boolean
   public static boolean field_179;
   // $VF: renamed from: a int[]
   private static final int[] field_180 = new int[]{55, 56, 54, 51, 50, 50, 52, 51, 50, 56};
   // $VF: renamed from: b boolean
   public static boolean field_181;
   // $VF: renamed from: b int[]
   private int[] field_182;
   // $VF: renamed from: e int
   private int field_183;
   // $VF: renamed from: b e
   private class_22 field_184;
   // $VF: renamed from: f int
   private int field_185;
   // $VF: renamed from: l boolean
   private boolean field_186;
   // $VF: renamed from: m boolean
   private boolean field_187 = false;
   // $VF: renamed from: a o
   private class_12 field_188;
   // $VF: renamed from: a m
   private class_14 field_189;
   // $VF: renamed from: n boolean
   private boolean field_190;
   // $VF: renamed from: o boolean
   private boolean field_191;
   // $VF: renamed from: p boolean
   private boolean field_192;
   // $VF: renamed from: q boolean
   private boolean field_193;
   // $VF: renamed from: b y
   private class_2 field_194;
   // $VF: renamed from: a y
   public static class_2 field_195;
   // $VF: renamed from: c y
   private class_2 field_196;
   // $VF: renamed from: d y
   private static class_2 field_197;
   // $VF: renamed from: r boolean
   private boolean field_198;
   // $VF: renamed from: g int
   private int field_199 = -1;
   // $VF: renamed from: c boolean
   public static boolean field_200;
   // $VF: renamed from: s boolean
   private static boolean field_201;
   // $VF: renamed from: c int[]
   private static int[] field_202 = new int[10];

   // $VF: renamed from: a () boolean
   public final boolean method_68() {
      return this.field_175;
   }

   // $VF: renamed from: a () void
   public final void method_69() {
      this.field_175 = false;
   }

   public class_8(DCDistrict var1, class_2 var2, class_2 var3, class_2 var4, class_2 var5) {
      this.field_161 = var1;
      class_7.method_58();
      class_7.method_60();
      field_179 = false;
      field_181 = false;
      field_200 = false;
      this.field_162 = new class_18(this, var4, var5);
      this.field_165 = new class_35(class_10.method_136(131367, true));
      field_195 = var2;
      field_197 = var3;
      this.field_186 = class_37.method_622(5) != null;
      this.field_188 = class_37.method_649();
      this.field_192 = this.field_188.method_154(2);
      this.field_189 = class_37.method_647();
      this.field_187 = this.field_189.method_174() == 4;
      this.field_191 = this.field_189.method_170(2);

      {
         this.field_194 = new class_2(null, null, Font.getFont(32, 0, 8), 0, -1);
      }

      field_178 = false;
      field_177 = false;
      this.field_176 = false;
      this.method_94();
      this.field_171 = -1;
      if (class_37.method_622(7) != null) {
         this.field_174 = class_37.method_609();
      } else if (class_37.method_611().length == 1) {
         this.field_174 = 0;
      }

      class_24 var8;
      if ((var8 = class_37.method_642("settings")) != null) {
         {
            this.field_174 = var8.method_285();
            if (this.field_174 < 0 || this.field_174 >= class_37.method_611().length) {
               this.field_174 = 0;
            }

            this.field_161.method_8(this.field_174);
            class_37.method_612(var8.method_285());
            this.field_173 = var8.method_283();
            return;
         }
      }
   }

   // $VF: renamed from: b () void
   public final void method_70() {
      this.field_170 = true;
      this.field_171 = -1;
   }

   // $VF: renamed from: a (int, int) int
   public final int method_71(int var1, int var2) {
      if (!this.field_190) {
         class_0.field_12 = true;
      }

      if (this.field_193) {
         this.field_193 = false;
         return 0;
      } else {
         if (field_179) {
            if (class_37.method_647().method_174() != 4 && !field_181) {
               class_24 var4;
               (var4 = class_24.method_281()).method_288(this.field_175);
               var4 = class_3.method_25().method_27(var4);
               var4 = this.field_162.method_231(var4);
               class_37.method_628("gamedata", var4, 0);
            }

            field_179 = false;
         }

         if (this.field_170) {
            this.field_170 = false;
            if (var1 == 33) {
               return 7;
            }

            if (var1 == 44) {
               return 18;
            }

            this.method_91(var1);
         }

         if (field_200) {
            this.method_91(this.field_168);
            field_200 = false;
         }

         int var3 = 0;
         switch (var1) {
            case 25:
            case 42:
            case 43:
               if (this.field_166 || this.field_163.method_456()) {
                  this.field_166 = false;
                  return -2;
               }

               this.field_163.method_448(var2);
               break;
            case 26:
               if (this.field_166) {
                  return -2;
               }

               if (this.field_164.method_456()) {
                  return -2;
               }

               this.field_164.method_448(var2);
               break;
            case 27:
               class_18.method_202(var2);
               if (this.field_188.method_155(var2) != 0) {
                  return -3;
               }
               break;
            case 28:
            case 29:
               class_18.method_202(var2);
               class_0.field_12 = true;
               byte var14 = 0;
               class_6.field_135 += var2;
               byte var15;
               if (class_6.field_136.length == 0) {
                  var15 = 2;
               } else {
                  class_22 var5 = null;
                  if (class_6.field_133 >= 0) {
                     var5 = class_6.field_130[class_6.field_133];
                  } else if (class_6.field_133 == -1) {
                     var5 = class_6.field_137;
                  } else if (class_6.field_133 == -2) {
                     var5 = class_6.field_138;
                  }

                  if (class_6.field_129 != null && class_6.field_129 == var5) {
                     int[] var6;
                     if ((var6 = class_6.field_129.method_255(var2)) != null) {
                        if (class_6.field_132 < 0) {
                           if (class_6.field_132 == -2) {
                              class_6.field_133 = class_6.field_134;
                           } else {
                              var14 = 2;
                           }
                        } else if (var6[1] == class_6.field_141) {
                           if ((class_6.field_131 = class_6.field_136[class_6.field_132]).equals("nolink")) {
                              class_6.field_134 = class_6.field_132;
                              class_6.field_133 = -2;
                           } else {
                              boolean var10000 = class_0.method_6(class_6.field_131);
                              boolean var7 = false;
                              if (var10000) {
                                 var14 = 1;
                              } else {
                                 class_6.field_133 = -1;
                              }
                           }
                        } else {
                           var14 = 2;
                        }
                     }
                  } else {
                     class_6.field_132 = class_6.field_133;
                     class_6.field_129 = var5;
                     var5.method_254();
                  }

                  if (var14 != 0) {
                     class_6.field_132 = 0;
                     class_6.field_133 = 0;
                     class_37.method_629();
                     class_6.field_129 = null;
                     class_6.field_130 = null;
                     class_6.field_137 = null;
                     class_6.field_138 = null;
                     class_6.field_139 = null;
                     class_6.field_140 = null;
                  }

                  var15 = var14;
               }

               byte var11 = var15;
               if (var15 != 0) {
                  this.field_172 = var11 == 1;
                  return -3;
               }
               break;
            case 30:
            case 31:
            case 32:
            case 35:
            case 36:
               if ((var3 = this.field_189.method_171(var2)) != 0) {
                  this.field_187 = var3 == 4;
                  if (var1 == 32) {
                     return -3;
                  }

                  return -2;
               }
               break;
            case 33:
               if ((var3 = this.field_162.method_195(var2, this.field_188)) == 0) {
                  return -1;
               }

               if (var3 == 1) {
                  return 7;
               }

               if (var3 == 3) {
                  return 9;
               }

               if (var3 == 2) {
                  this.field_176 = true;
                  if (class_18.method_216() == 1) {
                     field_179 = true;
                  }

                  return -2;
               }
            case 34:
            case 37:
               class_18.method_202(var2);
               if (this.field_188.method_155(var2) != 0) {
                  return -2;
               }
            case 38:
            case 39:
            case 40:
            case 41:
            default:
               break;
            case 44:
               if ((var3 = this.field_162.method_195(var2, this.field_188)) == 0) {
                  return -1;
               }

               if (var3 == 1) {
                  return 18;
               }

               if (var3 == 4) {
                  return 17;
               }
         }

         if (this.field_185 > 0) {
            this.field_185 -= var2;
            if (this.field_185 <= 0 && this.field_184 != null) {
               this.field_184.method_272();
               this.field_184 = null;
            }
         }

         return -1;
      }
   }

   // $VF: renamed from: a (int, javax.microedition.lcdui.Graphics) void
   public final void method_72(int var1, Graphics var2) {
      class_25 var3;
      (var3 = class_37.method_648()).method_313(var2);
      switch (var1) {
         case 25:
            var3.method_309(16777215);
            var3.method_308(0, 0, class_37.method_608(), class_37.method_621());
            this.field_163.method_449(class_37.method_608() >> 1, class_37.method_621() >> 1);
            return;
         case 26:
            class_25 var7;
            (var7 = class_37.method_648()).method_309(16777215);
            var7.method_308(0, 0, class_37.method_608(), class_37.method_621());
            this.field_164.method_449(class_37.method_608() >> 1, class_37.method_621() >> 1);
            return;
         case 27:
         case 34:
         case 37:
            method_77(var2);
            this.field_188.method_156(var2);
            return;
         case 28:
         case 29:
            method_77(var2);
            if (class_6.field_132 < 0) {
               if (class_6.field_132 == -1) {
                  class_6.field_137.method_258(var2, 0, 0);
               }

               if (class_6.field_132 == -2) {
                  class_6.field_138.method_258(var2, 0, 0);
               }

               return;
            }

            if (class_6.field_129 != null) {
               var1 = 0;
               if (class_6.field_143 > 1) {
                  var1 = class_6.field_140.getWidth() + 5;
               }

               class_6.field_129.method_258(var2, var1, 0);
               if (class_6.field_132 > -1 && class_6.field_143 > 1) {
                  var1 = class_6.field_135 / 120 % 5;
                  var2.drawImage(class_6.field_139, 5 - var1, class_37.method_621() / 2, 6);
                  var2.drawImage(class_6.field_140, class_37.method_608() - 5 + var1, class_37.method_621() / 2, 10);
               }
            }

            return;
         case 30:
         case 31:
         case 32:
         case 35:
         case 36:
         case 42:
         case 43:
            method_77(var2);
            class_14 var4;
            if ((var4 = this.field_189).field_286 && var4.field_276 != null) {
               var4.field_276.method_258(var2, 0, 0);
            }

            return;
         case 33:
         case 44:
            this.field_162.method_204(var2);
            return;
         case 38:
         case 39:
         case 40:
         case 41:
            var3.method_309(0);
            var3.method_308(0, 0, class_37.method_608(), class_37.method_621());
      }
   }

   // $VF: renamed from: a (int, int, e) void
   public final void method_73(int var1, int var2, class_22 var3) {
      switch (var2) {
         case 0:
         case 43:
            this.field_190 = false;
            if (var1 == 29) {
               var3.method_261(6);
            } else if (this.field_199 != -1) {
               var3.method_261(this.field_199);
               this.field_199 = -1;
            }
            break;
         case 3:
         case 9:
            this.field_190 = false;
            break;
         case 33:
            this.field_190 = true;
            break;
         case 41:
            class_0.field_10.field_6 = true;
      }

      if (var1 == 3) {
         this.method_92();
      }

      this.field_169 = var1;
      if (!this.field_172 || var1 != 29) {
         this.method_91(var2);
      }

      this.field_167 = var3;
      this.field_168 = var2;
   }

   // $VF: renamed from: a (int, int, int, int) void
   public final void method_74(int var1, int var2, int var3, int var4) {
      int var5 = class_37.method_632(var2);
      boolean var6 = var3 == 0 && var5 == 53 || var3 == 3 && class_37.method_604(var2) == 0;
      switch (var1) {
         case 0:
            if (var3 == 0 && class_37.method_622(16) != null) {
               if (this.field_182 == null) {
                  this.field_182 = new int[field_180.length];
               }

               this.field_182[this.field_183 % field_180.length] = var5;
               var1 = 0;

               boolean var12;
            for (var12 = false; var1 < field_180.length && !var12; var1++) {
                  if (this.field_182[(this.field_183 + var1 + 1) % field_180.length] != field_180[var1]) {
                     var12 = true;
                  }
               }

               if (!var12) {
                  field_181 = true;
                  var2 = class_37.method_608() - (class_37.method_608() >> 2);
                  var3 = class_37.method_621() - (class_37.method_621() >> 2) - class_37.method_617();
                  var4 = class_37.method_608() - var2 >> 1;
                  var5 = class_37.method_621() - var3 >> 1;
                  this.field_185 = 2000;
                  this.field_184 = new class_22();
                  this.field_184.method_240(1, 1, 3);
                  this.field_184.method_244(0, 1, class_37.method_618(20), null, -1);
                  this.field_184.field_477[0] = 1;
                  this.field_184.method_241(4);
                  this.field_184.method_253(var4, var5, var2, var3);
               }

               this.field_183++;
            }
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 41:
         case 42:
         case 43:
         default:
            break;
         case 7:
            if (var3 == 0 && (var5 == 50 || var5 == 56)) {
               Object var18 = null;
               var1 = this.field_167.field_506;
               class_37.method_603(class_37.method_611()[var1][1]);
               return;
            }
            break;
         case 25:
         case 26:
            if (var6) {
               this.field_166 = true;
               return;
            }
            break;
         case 27:
         case 34:
         case 37:
            this.field_188.method_157(var2, var3);
            return;
         case 28:
         case 29:
            if (class_6.field_129 != null) {
               if (class_6.field_130 != null) {
                  var3 = 0;
                  if (var3 == 0) {
                     var3 = class_37.method_632(var2);
                  }

                  if (class_6.field_132 >= 0) {
                     if (var3 == 52) {
                        if (--class_6.field_133 < 0) {
                           class_6.field_133 = class_6.field_130.length - 1;
                        }
                     } else if (var3 == 54 && ++class_6.field_133 > class_6.field_130.length - 1) {
                        class_6.field_133 = 0;
                     }
                  }
               }

               class_6.field_129.method_260(var2, var3);
            }

            return;
         case 30:
         case 31:
         case 32:
         case 35:
         case 36:
            class_14 var7 = this.field_189;
            if (this.field_189.field_286 && !var7.field_287) {
               if (var7.field_276 != null) {
                  var7.field_276.method_260(var2, var3);
               }

               return;
            }

            return;
         case 33:
         case 38:
         case 39:
         case 40:
         case 44:
            if (var4 == 0) {
               this.field_162.method_219(var2, var3);
               return;
            }
      }
   }

   // $VF: renamed from: a (int) boolean
   public final boolean method_75(int var1) {
      switch (var1) {
         case 45:
            if (this.field_174 == -1) {
               return true;
            }

            return false;
         case 46:
            return this.field_191;
         case 47:
            return true;
         case 48:
            return this.field_192;
         case 49:
            return this.field_189.method_170(3);
         case 50:
            return this.field_189.method_170(5);
         case 51:
            return false;
         case 52:
            return false;
         case 53:
            return true;
         case 54:
         case 55:
         case 56:
            return false;
         case 57:
            if (class_18.method_216() == 0) {
               return true;
            }

            return false;
         case 58:
            int var2;
            if (class_18.method_216() == 0 && (var2 = this.field_162.method_184()) >= 5 && var2 <= 41) {
               return true;
            }

            return false;
         default:
            return false;
      }
   }

   // $VF: renamed from: a (int, javax.microedition.lcdui.Graphics, e) void
   public final void method_76(int var1, Graphics var2, class_22 var3) {
      if (method_96(var3)) {
         class_25 var4;
         (var4 = class_37.method_648()).method_309(16777215);
         var4.method_308(0, 0, class_37.method_608(), class_37.method_621());
      } else {
         method_77(var2);
      }

      var3.method_259(var2);
      if (var1 == 0 && this.field_184 != null) {
         this.field_184.method_259(var2);
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   private static void method_77(Graphics var0) {
      if (!class_18.method_203(var0)) {
         class_25 var1;
         (var1 = class_37.method_648()).method_309(16777215);
         var1.method_308(0, 0, class_37.method_608(), class_37.method_621());
      }
   }

   // $VF: renamed from: a (int) void
   public final void method_78(int var1) {
      switch (var1) {
         case 2:
            this.field_173 = true;
         case 3:
         case 8:
         default:
            break;
         case 4:
            class_18.method_215(0);
            this.field_162.method_186();
            this.field_162.method_221();
            field_178 = true;
            field_177 = true;
            return;
         case 5:
            class_18.method_215(1);
            class_18.method_217(0);
            this.field_162.method_221();
            field_177 = true;
            return;
         case 6:
            class_18.method_215(2);
            class_18.method_217(0);
            this.field_162.method_221();
            field_177 = true;
            return;
         case 7:
            field_177 = false;
            return;
         case 9:
            field_177 = true;
            return;
         case 10:
            this.field_162.method_220();
            return;
         case 11:
            this.field_162.method_191();
            this.field_162.method_221();
            return;
         case 12:
         case 13:
         case 20:
         case 21:
            int var2 = var1 == 21 ? 1 : 4;
            class_37.method_612(this.field_167.field_516[var2]);
            class_37.method_630(65544, 1);
            if (var1 == 13) {
               field_200 = true;
               field_201 = true;
            }

            this.method_92();
            return;
         case 14:
         case 15:
         case 22:
         case 23:
         case 25:
            this.method_93();
            return;
         case 16:
            this.field_176 = true;
            if (class_18.method_216() == 0) {
               this.field_162.method_185();
               this.method_94();
               return;
            }

            if (class_18.method_216() == 1) {
               field_179 = true;
               return;
            }
            break;
         case 17:
            this.field_162.method_192();
            field_178 = true;
            return;
         case 18:
            field_178 = false;
            return;
         case 19:
            class_18.method_194();
            this.field_162.method_191();
            this.field_162.method_221();
            return;
         case 24:
            this.field_174 = this.field_167.field_506;
            if (this.field_174 != class_37.method_609()) {
               this.field_161.method_8(this.field_174);
               this.method_92();
               return;
            }
            break;
         case 26:
            method_90(true);
            return;
         case 27:
            method_90(false);
            return;
         case 28:
            this.field_174 = this.field_167.field_506;
            this.field_161.method_8(this.field_174);
            this.method_92();
            return;
      }
   }

   // $VF: renamed from: a (int, int, int) java.lang.String
   public final String method_79(int var1, int var2, int var3) {
      if (var1 == 2) {
         if (var3 == 0 && this.field_187) {
            var2 = 19;
         }
      } else if (var1 == 0) {
         if (var3 == 0) {
            return this.field_189.method_173();
         }

         if (var3 != 10 && var3 == 3) {
            return class_12.method_163();
         }
      }

      String var4;
      return (var4 = class_37.method_618(var2)) != null && var4.length() == 0 ? null : var4;
   }

   // $VF: renamed from: a (int, e, int) void
   public final void method_80(int var1, class_22 var2, int var3) {
      if (var3 != 0) {
         if (var3 == 1) {
            switch (var1) {
               case 6:
                  var2.method_249(null, this.field_194, this.field_194);
               default:
                  return;
               case 7:
                  var2.method_249(null, this.field_194, this.field_194);
                  return;
            }
         }

         if (var3 == 2) {
            int var4 = class_37.method_640();
            switch (var1) {
               case 3:
                  var2.field_516[1] = var4;
                  break;
               case 9:
                  Object var5 = null;
                  var2.field_516[4] = var4;
                  return;
            }
         }
      }
   }

   // $VF: renamed from: b (int) boolean
   public static boolean method_81(int var0) {
      switch (var0) {
         case 8:
            if (class_37.method_611().length == 1) {
               return false;
            }
         case 9:
         case 10:
         default:
            return true;
      }
   }

   // $VF: renamed from: a (int, int) boolean
   public static boolean method_82(int var0, int var1) {
      return var1 == 1 || var0 == 1;
   }

   // $VF: renamed from: a (int) int
   public final int method_83(int var1) {
      int var2 = 0;
      switch (var1) {
         case 0:
            if (this.field_198) {
               var2 = class_15.method_176(1);
            } else {
               var2 = class_15.method_176(1) + 1;
            }

            return var2;
         case 1:
         case 2:
         default:
            return 0;
         case 3:
            return 4;
         case 4:
            return 20;
         case 5:
            return 0;
      }
   }

   // $VF: renamed from: a (int, int) void
   public final void method_84(int var1, int var2) {
      switch (var1) {
         case 0:
            if (var2 == 0) {
               if (var2 == 0 && !this.field_198) {
                  this.field_196 = field_197;

                  {
                     class_16 var5 = class_10.method_140(131076);
                     this.field_196 = new class_2(var5, class_37.method_627(65540), null, 16711680, 0);
                  }

                  this.field_198 = true;
               }

               return;
            }

            class_15.method_177(1, var2 - 1);
         case 1:
         case 2:
         case 5:
         default:
            break;
         case 3:
            if (var2 == 0 && this.field_191) {
               this.field_189.method_172();
            }

            if (var2 == 1) {
               if (this.field_192) {
                  this.field_188.method_162();
                  return;
               }
            } else if (var2 != 2 && var2 == 3) {
               class_18.method_201();
               return;
            }
            break;
         case 4:
            if (var2 == 0) {
               this.field_163 = new class_35(131080);
               this.field_163.method_451(0, 1, true);
               return;
            }

            if (var2 == 1) {
               this.field_164 = new class_35(131611);
               this.field_164.method_451(0, 1, true);
               return;
            }

            if (var2 != 2) {
               class_15.method_177(0, var2 - 2);
               return;
            }
      }
   }

   // $VF: renamed from: b (int) void
   public final void method_85(int var1) {
      switch (var1) {
         case 0:
            this.field_196 = null;
            this.field_198 = false;
            return;
         case 2:
            if (this.field_176) {
               this.field_176 = false;
               this.field_162.method_226();
            }
         case 1:
         case 3:
         default:
            return;
         case 4:
            this.field_163.method_461();
            this.field_163 = null;
            if (this.field_164 != null) {
               this.field_164.method_461();
               this.field_164 = null;
            }
      }
   }

   // $VF: renamed from: b (int) int
   public final int method_86(int var1) {
      switch (var1) {
         case 27:
         case 28:
         case 29:
         case 32:
         case 40:
            return 100;
         case 33:
            if (field_177) {
               return this.field_162.method_189();
            }
         case 30:
         case 31:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 41:
         case 42:
         case 43:
         default:
            return 0;
         case 44:
            return field_178 ? this.field_162.method_187() : 0;
      }
   }

   // $VF: renamed from: a (boolean) void
   public final void method_87(boolean var1) {
      if (var1) {
         class_37.method_624();
         this.field_171 = -1;
      } else {
         class_0.field_10.method_4();
      }
   }

   // $VF: renamed from: b (int, int) void
   public final void method_88(int var1, int var2) {
      switch (var1) {
         case 27:
            if (var2 == 1) {
               this.field_188.method_154(0);
               this.field_188.method_162();
               return;
            }
            break;
         case 28:
         case 29:
            if (var2 == 1) {
               byte[] var8 = class_37.method_601(65549);
               ByteArrayInputStream var9 = new ByteArrayInputStream(var8);
               DataInputStream var12 = new DataInputStream(var9);

               try {
                  byte var14 = var12.readByte();
                  class_6.field_142 = new int[4][var14];

                  for (int var3 = 0; var3 < var14; var3++) {
                     for (int var4 = 0; var4 < 4; var4++) {
                        class_6.field_142[var4][var3] = var12.readInt();
                     }
                  }

                  var12.close();
                  var9.close();
               } catch (IOException var7) {
               }

               class_37.method_637(34, 134, null, 0);
               String var10;
               String[] var10000;
               if ((var10 = class_37.method_622(5)) == null) {
                  var10000 = new String[]{"none"};
               } else {
                  var1 = 0;
                  var2 = 0;

                  while (var2 < var10.length()) {
                     var1++;
                     int var20;
                     if ((var20 = var10.indexOf("!.!", var2)) == -1) {
                        break;
                     }

                     var2 = var20 + "!.!".length();
                  }

                  String[] var21 = new String[var1];
                  var2 = 0;
                  String var22 = class_37.method_618(135);

                  for (int var5 = 0; var5 < var1; var5++) {
                     int var6;
                     if ((var6 = var10.indexOf("!.!", var2)) == -1) {
                        var6 = var10.length();
                     }

                     if (var2 < var6) {
                        String var17 = var10.substring(var2, var6);
                        if ("none".equals(var17)) {
                           var21[var5] = null;
                        } else if (!"nolink".equals(var17)) {
                           if (var17.indexOf("aid=") == -1) {
                              var17 = var17 + "&aid=4";
                           }

                           if (var17.indexOf("clk=") == -1) {
                              var17 = var17 + "&clk=0";
                           }

                           if (var17.indexOf("car=") == -1) {
                              var17 = var17 + "&car=" + class_37.method_622(2);
                           }

                           if (var17.indexOf("lng") == -1) {
                              var17 = var17 + "&lng=" + var22;
                           }

                           var21[var5] = var17;
                        } else {
                           var21[var5] = "nolink";
                        }
                     } else {
                        var21[var5] = "nolink";
                     }

                     String var18;
                     if ((var18 = class_37.method_626("DCHOC-GMG-" + var5)) != null && !var18.equals("")) {
                        String var19;
                        if ((var19 = var18.trim()).equals("none") || var19.equals(class_37.method_622(25))) {
                           var19 = null;
                        }

                        var21[var5] = var19;
                     }

                     var2 = var6 + "!.!".length();
                  }

                  var10000 = var21;
               }

               String[] var11 = var10000;
               class_6.method_57(class_6.field_142[1], class_6.field_142[3], class_6.field_142[0], class_6.field_142[2], var11, 34, 5);
               return;
            }

            if (var2 == 2) {
               this.method_92();
               return;
            }
         case 30:
         case 31:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 41:
         case 42:
         case 43:
         default:
            break;
         case 32:
            if (var2 == 1) {
               this.field_189.method_170(4);
               this.field_189.method_172();
               return;
            }
            break;
         case 33:
            this.field_162.method_190(var2);
            break;
         case 40:
         case 44:
            this.field_162.method_188(var2);
            return;
      }
   }

   // $VF: renamed from: c (int) void
   public final void method_89(int var1) {
      switch (var1) {
         case 33:
            if (field_177 && class_18.method_216() == 0) {
               this.field_162.method_193();
            }
            break;
         case 44:
            if (field_178) {
               this.field_162.method_225();
               return;
            }
      }
   }

   // $VF: renamed from: b (boolean) void
   private static void method_90(boolean var0) {
      int var1 = class_37.method_640();
      if (var0) {
         if (var1 == 0) {
            var1 = 3;
         }
      } else {
         var1 = 0;
      }

      class_37.method_612(var1);
   }

   // $VF: renamed from: d (int) void
   private void method_91(int var1) {
      if (!this.field_172 || var1 != 29 && this.field_169 != 29) {
         int var2 = -1;
         switch (var1) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 27:
            case 34:
            case 37:
               var2 = 65543;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 35:
            case 36:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            default:
               break;
            case 33:
               var2 = 65545;
               break;
            case 44:
               var2 = 65546;
         }

         if (var2 == -1) {
            class_37.method_624();
         } else if (var2 != this.field_171 || field_201) {
            field_201 = false;
            class_37.method_630(var2, -1);
         }

         this.field_171 = var2;
      }
   }

   // $VF: renamed from: d () void
   private void method_92() {
      class_24 var1;
      (var1 = class_24.method_281()).method_289(this.field_174);
      var1.method_289(class_37.method_640());
      var1.method_288(this.field_173);
      class_37.method_628("settings", var1, 1);
   }

   // $VF: renamed from: e () void
   private void method_93() {
      this.field_175 = true;
      class_3.method_25().method_26();
      this.field_188.method_161();
      class_27 var10000 = new class_27();
      Object var10001 = null;
      class_27 var1 = var10000;
      class_37.method_639("GHST", null);
      var1.field_676 = null;
      var1.field_678 = 0;
      var1.field_680 = 0;
      this.field_162.method_233();
      class_37.method_628("gamedata", null, 1);
   }

   // $VF: renamed from: f () void
   private void method_94() {
      class_24 var1;
      if ((var1 = class_37.method_642("gamedata")) != null) {
         {
            this.field_175 = var1.method_283();
            var1 = class_3.method_25().method_28(var1);
            this.field_162.method_232(var1);
            return;
         }
      }

      this.method_93();
   }

   // $VF: renamed from: c () void
   public final void method_95() {
      this.field_193 = true;
   }

   // $VF: renamed from: a (e) boolean
   private static boolean method_96(class_22 var0) {
      return var0.field_449 == 4 || var0.field_449 == 5;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_97(int var1, int var2) {
      switch (var1) {
         case 0:
            if (var2 == 7) {
               return false;
            }

            if (var2 == 1) {
               if (this.field_186 && !this.field_173) {
                  return true;
               }

               return false;
            }

            if (var2 == 6) {
               if (this.field_186 && this.field_173) {
                  return true;
               }

               return false;
            }

            if (var2 == 3) {
               if (class_12.method_163() != null) {
                  return true;
               }

               return false;
            }

            if (var2 == 0) {
               if (this.field_189.method_173() != null) {
                  return true;
               }

               return false;
            }

            if (var2 == 10) {
               return false;
            }

            if (var2 == 4) {
               return false;
            }
            break;
         case 1:
            if (var2 == 0) {
               return true;
            }
         case 14:
            if (var2 == 0) {
               return true;
            }
         case 2:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         default:
            break;
         case 3:
            if (var2 == 0) {
               return false;
            }

            if (var2 == 1) {
               return true;
            }

            if (var2 == 2) {
               return false;
            }

            if (var2 == 4) {
               if (class_37.method_611().length > 1) {
                  return true;
               }

               return false;
            }

            if (var2 == 3) {
               return false;
            }
            break;
         case 9:
            if (var2 == 3) {
               return false;
            }

            if (var2 == 4) {
               return true;
            }

            if (var2 == 5) {
               return false;
            }

            if (var2 == 6) {
               return false;
            }

            if (var2 == 1) {
               if (class_18.method_216() != 1 && class_18.method_216() != 2) {
                  return false;
               }

               return true;
            }

            if (var2 == 2) {
               if (class_18.method_216() == 1) {
                  return true;
               }

               return false;
            }
      }

      return true;
   }

   // $VF: renamed from: a (int, e, int, int, int) void
   public final void method_98(int var1, class_22 var2, int var3, int var4, int var5) {
      if (var1 != 7 && var1 != 8) {
         var2.method_240(var3, var4, var5);
      } else {
         String[][] var6 = class_37.method_611();
         var2.method_240(var3, var6.length, var5);
         var1 = var1 == 7 ? 28 : 24;

         for (int var8 = 0; var8 < var6.length; var8++) {
            String var9 = var6[var8][0];
            var2.method_244(var8, 0, var9, null, var1);
         }
      }
   }

   // $VF: renamed from: a (e, java.lang.String, aa, int) void
   public static void method_99(class_22 var0, String var1, class_35 var2, int var3) {
      var0.method_243(var2 == null ? var1 : null, var2, var3);
   }

   // $VF: renamed from: a (e, java.lang.String, javax.microedition.lcdui.Image, int) void
   public static void method_100(class_22 var0, String var1, Image var2, int var3) {
      var0.method_242(var2 == null ? var1 : null, var2, var3);
   }

   // $VF: renamed from: a (e, int, int) void
   public final void method_101(class_22 var1, int var2, int var3) {
      var1.field_477[var3] = var2;
   }

   // $VF: renamed from: a (int, e, int, int, java.lang.String, aa, javax.microedition.lcdui.Image[], int) void
   public final void method_102(int var1, class_22 var2, int var3, int var4, String var5, class_35 var6, Image[] var7, int var8) {
      if (this.method_97(var1, var3)) {
         if (var6 != null) {
            var2.method_245(var3, var4, var5, var6, var8);
         } else {
            var2.method_244(var3, var4, var5, var7, var8);
         }

         if (var1 == 0) {
            boolean var9 = false;
            if (var3 == 1) {
               var9 = true;
            }

            if (var9) {
               int[] var10 = new int[]{300, 300, 300, 300, 1000, 300};
               if (var2.field_523 == null) {
                  var2.field_523 = new int[var2.field_473][];
               }

               var2.field_523[var3] = var10;
               class_2 var11 = this.field_196;
               if (var2.field_448 == null) {
                  var2.field_448 = new class_2[var2.field_473];
               }

               var2.field_448[var3] = var11;
            }
         }
      }
   }

   // $VF: renamed from: a (int, e, int, java.lang.String, aa, javax.microedition.lcdui.Image[], java.lang.String[], aa, javax.microedition.lcdui.Image[], int) void
   public final void method_103(
      int var1, class_22 var2, int var3, String var4, class_35 var5, Image[] var6, String[] var7, class_35 var8, Image[] var9, int var10
   ) {
      if (this.method_97(var1, var3)) {
         if (var5 != null || var8 != null) {
            var2.method_246(var3, var4, null, var7, null, var10);
            var2.field_517[var3] = Math.max(var2.field_517[var3], var8 != null ? var8.method_453() : 0);
            var2.field_502[var3] = var5;
            var2.field_520[var3] = var8;
            return;
         }

         var2.method_246(var3, var4, var6, var7, var9, var10);
      }
   }

   // $VF: renamed from: a (int, e, int, java.lang.String, aa, javax.microedition.lcdui.Image[], int, int, int) void
   public final void method_104(int var1, class_22 var2, int var3, String var4, class_35 var5, Image[] var6, int var7, int var8, int var9) {
      if (this.method_97(var1, var3)) {
         if (var5 != null) {
            var2.method_247(var3, var4, null, var7, var8, var9);
            var2.field_502[var3] = var5;
            return;
         }

         var2.method_247(var3, var4, var6, var7, var8, var9);
      }
   }

   // $VF: renamed from: a (e, int) void
   public static void method_105(class_22 var0, int var1) {
      var0.method_241(var1);
   }

   // $VF: renamed from: a (e) void
   public final void method_106(class_22 var1) {
      int var5 = class_37.method_608();
      int var2 = class_37.method_621();
      int var3 = 0;
      int var4 = 0;
      if (method_96(var1)) {
         var3 = class_37.method_608();
         var4 = class_37.method_621() - class_37.method_617();
         var5 = var1.method_250(var3);
         var2 = var1.method_251(var5, var4);
         var3 = var3 - var5 >> 1;
         var4 = var4 - var2 >> 1;
      }

      var1.method_253(var3, var4, var5, var2);
   }

   // $VF: renamed from: c (int) boolean
   public static boolean method_107(int var0) {
      switch (var0) {
         case 6:
         case 7:
         case 25:
         case 26:
            return false;
         default:
            return true;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
   public final void method_108(Graphics var1, int var2) {
      int var3 = class_37.method_608();
      int var4 = class_37.method_621();
      method_77(var1);
      this.field_165.method_454(0);
      this.field_165.method_449(var3 >> 1, var4);
      this.field_165.method_454(1);
      var1.setClip((var3 >> 1) - (this.field_165.method_459() >> 1), 0, this.field_165.method_459() * var2 / 100, var4);
      this.field_165.method_449(var3 >> 1, var4);
   }

   // $VF: renamed from: b (int, int, int) void
   private static void method_109(int var0, int var1, int var2) {
      int var3 = class_37.method_608();
      int var4 = class_37.method_621();
      class_25 var5;
      (var5 = class_37.method_648()).method_331(0, 0, var3, var4);
      var1 = var1 * 255 / 400 << 24;
      var5.method_310(var1 | var0 & 16777215);
      var1 = (var1 = var3 >> 2) + var3 % var1;
      var2 = (var2 = var4 >> 2) + var4 % var2;

      for (int var6 = 0; var6 < var4; var6 += var2) {
         for (int var7 = 0; var7 < var3; var7 += var1) {
            var5.method_308(var7, var6, var1, var2);
         }
      }

      var5.method_310(0xFF000000 | var0 & 16777215);
   }

   // $VF: renamed from: a (int, int, int, int, javax.microedition.lcdui.Graphics) void
   public final void method_110(int var1, int var2, int var3, int var4, Graphics var5) {
      boolean var6 = (var1 & 1) != 0;
      boolean var7 = (var1 & 2) != 0;
      int var8 = 16777215;
      if (var7) {
         if (var2 == -1) {
            var8 = 16777215;
         } else {
            var8 = 15199988;
         }
      }

      if (var3 == 41) {
         var8 = 0;
      }

      if (var6) {
         method_109(var8, 400 - var4, 400);
      } else {
         method_109(var8, var4, 400);
      }
   }

   // $VF: renamed from: a (int, int, int) void
   public final void method_111(int var1, int var2, int var3) {
      if ((var1 & 1) != 0) {
         method_109(15199988, 400 - var3, 400);
      } else if (var2 == -1) {
         method_109(16777215, var3, 400);
      } else {
         method_109(15199988, var3, 400);
      }
   }

   // $VF: renamed from: c (int) int
   public static int method_112(int var0) {
      int var1 = var0;

      int var2;
      for (var2 = 0; var1 > 0; var2++) {
         var1 /= 10;
      }

      var1 = var2;
      var0 = var0;

      for (int var3 = 0; var3 < field_202.length; var3++) {
         field_202[var3] = 0;
      }

      for (int var9 = 1; var0 > 0; var9++) {
         int var4 = var0 % 10;
         field_202[var1 - var9] = var4;
         var0 /= 10;
      }

      for (int var6 = var2 - 1; var6 > var2 - 4; var6--) {
         if (field_202[var6] >= 5) {
            field_202[var6] = 0;
            field_202[var6 - 1]++;
            if (field_202[var6 - 1] > 9 && var6 - 1 > 0) {
               field_202[var6 - 1] = 0;
               if (var6 > 1) {
                  field_202[var6 - 2]++;
               }
            }
         }
      }

      var0 = 0;
      if (var2 - 4 > 1) {
         var0 = 0 + 100 * field_202[var2 - 4 - 2];
      }

      if (var2 - 3 > 1) {
         var0 += 10 * field_202[var2 - 3 - 2];
      }

      if (var2 - 2 > 1) {
         var0 += field_202[var2 - 2 - 2];
      }

      return var0;
   }
}
