package com.digitalchocolate.towerbloxx;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: b
public final class class_25 {
   // $VF: renamed from: a int[][]
   private static int[][] field_539 = new int[4][];
   // $VF: renamed from: a int
   private int field_540;
   // $VF: renamed from: b int
   private int field_541;
   // $VF: renamed from: a int[]
   private int[] field_542 = new int[13];
   // $VF: renamed from: a java.util.Vector
   private Vector field_543;
   // $VF: renamed from: b java.util.Vector
   private Vector field_544;
   // $VF: renamed from: c java.util.Vector
   private Vector field_545;
   // $VF: renamed from: d java.util.Vector
   private Vector field_546;
   // $VF: renamed from: c int
   private int field_547;
   // $VF: renamed from: d int
   private int field_548;
   // $VF: renamed from: e int
   private int field_549;
   // $VF: renamed from: f int
   private int field_550;
   // $VF: renamed from: b int[]
   private int[] field_551;
   // $VF: renamed from: c int[]
   private int[] field_552;
   // $VF: renamed from: a k
   private class_16 field_553;
   // $VF: renamed from: d int[]
   private static int[] field_554;
   // $VF: renamed from: a javax.microedition.lcdui.Graphics
   private static Graphics field_555;
   // $VF: renamed from: a javax.microedition.lcdui.Image
   private static Image field_556;
   // $VF: renamed from: b javax.microedition.lcdui.Graphics
   private Graphics field_557;
   // $VF: renamed from: e int[]
   private static int[] field_558;
   // $VF: renamed from: f int[]
   private static int[] field_559;
   // $VF: renamed from: g int[]
   private static int[] field_560;
   // $VF: renamed from: h int[]
   private static int[] field_561;
   // $VF: renamed from: i int[]
   private static int[] field_562;
   // $VF: renamed from: j int[]
   private static int[] field_563;
   // $VF: renamed from: k int[]
   private static int[] field_564;
   // $VF: renamed from: l int[]
   private static int[] field_565;
   // $VF: renamed from: m int[]
   private int[] field_566;
   // $VF: renamed from: n int[]
   private int[] field_567;

   public class_25() {
      this.method_306();
   }

   // $VF: renamed from: a (int, int, boolean, int[][]) void
   private static void method_292(int var0, int var1, boolean var2, int[][] var3) {
      if (var3[var0] == null || var1 > var3[var0].length) {
         if (var2) {
            var1 = var1 * 120 / 100;
         }

         var3[var0] = new int[var1];
      }
   }

   // $VF: renamed from: a (int) void
   public final void method_293(int var1) {
      this.field_542[2] = var1;
   }

   // $VF: renamed from: a (int[][]) int[]
   private int[] method_294(int[][] var1) {
      return this.field_542[0] != -8355712 ? var1[1] : var1[0];
   }

   // $VF: renamed from: a (int, int, int) void
   private void method_295(int var1, int var2, int var3) {
      int var4 = class_30.method_387(var1);
      var1 = class_30.method_388(var1);
      int var5 = this.field_540;
      int var6 = this.field_541;
      int var7;
      var2 = (var7 = -var5 * var2 >> 10) + ((var5 << 1) * var2 >> 10);
      var3 = (var5 = -var6 * var3 >> 10) + ((var6 << 1) * var3 >> 10);
      this.field_551[0] = var7 * var1 - var5 * var4;
      this.field_552[0] = var5 * var1 + var7 * var4;
      this.field_551[1] = var2 * var1 - var5 * var4;
      this.field_552[1] = var5 * var1 + var2 * var4;
      this.field_551[2] = var2 * var1 - var3 * var4;
      this.field_552[2] = var3 * var1 + var2 * var4;
      this.field_551[3] = var7 * var1 - var3 * var4;
      this.field_552[3] = var3 * var1 + var7 * var4;
      var1 = Integer.MAX_VALUE;
      var2 = Integer.MIN_VALUE;
      var3 = Integer.MAX_VALUE;
      var4 = Integer.MIN_VALUE;
      var5 = 4;

      while (--var5 >= 0) {
         if (this.field_551[var5] > var2) {
            var2 = this.field_551[var5];
         }

         if (this.field_551[var5] < var1) {
            var1 = this.field_551[var5];
         }

         if (this.field_552[var5] > var4) {
            var4 = this.field_552[var5];
         }

         if (this.field_552[var5] < var3) {
            var3 = this.field_552[var5];
         }
      }

      var1 >>= 16;
      var3 >>= 16;
      var2 >>= 16;
      var4 >>= 16;
      var2++;
      var4++;
      this.field_547 = var2 - var1;
      if (this.field_547 == 0) {
         this.field_547 = 1;
      }

      this.field_548 = var4 - var3;
      if (this.field_548 == 0) {
         this.field_548 = 1;
      }

      this.field_549 = var1;
      this.field_550 = var3;
   }

   // $VF: renamed from: a () int
   public final int method_296() {
      return this.field_542[10];
   }

   // $VF: renamed from: b () int
   public final int method_297() {
      return this.field_542[11];
   }

   // $VF: renamed from: a (k, int, int, int, int) void
   public final void method_298(class_16 var1, int var2, int var3, int var4, int var5) {
      Object var29 = null;
      Object var16 = null;
      if (this.field_542[0] == -8355712
         && this.field_542[3] == 1024
         && this.field_542[4] == 1024
         && this.field_542[2] == 0
         && this.field_542[9] == 0
         && this.field_542[10] <= 1
         && this.field_542[11] <= 1) {
         Image var107 = var1.field_296;
         int var81 = var2 + this.field_542[7];
         int var95 = var3 + this.field_542[8];
         boolean var113 = var1.method_180();
         if (var4 != 0) {
            byte var120 = 0;
            if ((var4 & 1) != 0) {
               var120 = 2;
            }

            if ((var4 & 2) != 0) {
               var120 |= 1;
            }

            if ((var4 & 4) != 0) {
               var120 |= 5;
            } else if ((var4 & 8) != 0) {
               var120 = 3;
            } else if ((var4 & 16) != 0) {
               var120 |= 6;
            }

            if (!var113) {
               this.field_557.drawRegion(var107, 0, 0, var1.method_183(), var1.method_181(), var120, var81, var95, 20);
            } else {
               this.field_557.drawRegion(var107, 0, 0, var1.field_302, var1.field_303, var120, var81, var95, 20);
            }
         } else {
            int var119 = 0;
            int var125 = 0;
            int var129 = 0;
            int var142 = 0;
            if (var113) {
               var119 = this.field_557.getClipX();
               var125 = this.field_557.getClipY();
               var129 = this.field_557.getClipWidth();
               var142 = this.field_557.getClipHeight();
               int var176;
               int var192;
               if ((var4 & 4) == 0 && (var4 & 16) == 0) {
                  var176 = var1.field_302;
                  var192 = var1.field_303;
               } else {
                  var176 = var1.field_303;
                  var192 = var1.field_302;
               }

               if (var81 + var176 <= var119 || var95 + var192 <= var125 || var81 >= var119 + var129 || var95 >= var125 + var142) {
                  return;
               }

               this.field_557.clipRect(var81, var95, var176, var192);
            }

            if (var4 == 0) {
               if (var113) {
                  var29 = null;
                  var81 = var81;
                  var95 = var95;
               }

               this.field_557.drawImage(var107, var81, var95, 20);
            }

            if (var113) {
               this.field_557.setClip(var119, var125, var129, var142);
            }
         }
      } else {
         int var38 = 1;
         int[] var6 = var1.field_298;
         if (var1.field_298 != null) {
            boolean var7 = false;
            int var8 = 13;

            while (--var8 >= 0) {
               if (var8 != 12 && var6[var8] != this.field_542[var8]) {
                  var7 = true;
                  break;
               }
            }

            if (!var7) {
               var38 = 0;
            }
         }

         int[][] var45 = var1.field_299;
         if (var1.field_299 == null) {
            var45 = new int[5][];
            var1.field_299 = var45;
         }

         this.field_540 = var1.method_183();
         this.field_541 = var1.method_181();
         if (var6 == null || var6[5] != 0 || var4 != var6[6]) {
            int var18 = this.field_540 * this.field_541;
            int[][] var19 = var1.field_299;
            method_292(0, var18, false, var19);
            var1.method_182(var19[0], 0, this.field_540, 0, 0, this.field_540, this.field_541);
            if (var1.field_296.isMutable()) {
               int[] var10001 = var19[0];
               int var23 = this.field_541;
               int var22 = this.field_540;
               int[] var21 = var10001;
               Object var20 = null;
               int var24 = this.method_315();
               int var25 = var22 * var23;

               while (--var25 >= 0) {
                  if (var21[var25] == var24) {
                     var21[var25] = 0;
                  }
               }
            }

            int[] var10000 = var19[0];
            int var121 = this.field_541;
            int var114 = this.field_540;
            int[] var108 = var10000;
            Object var100 = null;
            if (var4 != 0) {
               if ((var4 & 3) == 3) {
                  int var130 = 0;
                  int var26;
                  int var27 = (var26 = var114 * var121) >> 1;
                  int var28 = var26 - 1;

                  while (var28 >= var27) {
                     int var177 = var108[var28];
                     var108[var28--] = var108[var130];
                     var108[var130++] = var177;
                  }
               } else if ((var4 & 1) != 0) {
                  int var131 = var114 >> 1;
                  int var143 = 0;

                  for (int var156 = var121; --var156 >= 0; var143 += var114 - var131) {
                     int var166 = var143 + var114 - 1;
                     int var178 = var143 + var131;

                     while (var143 < var178) {
                        int var11 = var108[var143];
                        var108[var143++] = var108[var166];
                        var108[var166--] = var11;
                     }
                  }
               } else if ((var4 & 2) != 0) {
                  int var132 = (var121 - 1) * var114;
                  int var144 = (var121 >> 1) * var114;
                  int var157 = var114;

                  while (--var157 >= 0) {
                     int var167 = var157;
                     int var179 = var132 + var157;

                     for (int var49 = var157 + var144; var167 < var49; var179 -= var114) {
                        int var13 = var108[var167];
                        var108[var167] = var108[var179];
                        var108[var179] = var13;
                        var167 += var114;
                     }
                  }
               }

               if ((var4 & 8) != 0) {
                  int var134 = 0;
                  int var147;
                  int var160 = (var147 = var114 * var121) >> 1;
                  int var170 = var147 - 1;

                  while (var170 >= var160) {
                     int var182 = var108[var170];
                     var108[var170--] = var108[var134];
                     var108[var134++] = var182;
                  }
               } else if ((var4 & 4) != 0 || (var4 & 16) != 0) {
                  method_292(0, var114 * var121, true, field_539);
                  int[] var133 = field_539[0];
                  int var145 = var114 * var121;

                  while (--var145 >= 0) {
                     var133[var145] = var108[var145];
                  }

                  var145 = 0;
                  if ((var4 & 4) != 0) {
                     for (int var159 = 0; var159 < var114; var159++) {
                        int var169 = (var121 - 1) * var114 + var159;

                        for (int var181 = var121; --var181 >= 0; var169 -= var114) {
                           var108[var145++] = var133[var169];
                        }
                     }
                  } else {
                     int var158 = var114;

                     while (--var158 >= 0) {
                        int var168 = var158;

                        for (int var180 = var121; --var180 >= 0; var168 += var114) {
                           var108[var145++] = var133[var168];
                        }
                     }
                  }
               }
            }

            var38 = 1;
         }

         if ((var4 & 4) != 0 || (var4 & 16) != 0) {
            int var46 = this.field_540;
            this.field_540 = this.field_541;
            this.field_541 = var46;
         }

         int var47 = this.field_540;
         var29 = null;
         int var9 = this.field_542[3];
         int var10 = this.field_542[4];
         int var50;
         if ((var50 = var47 * var9 >> 10) >= 1) {
            int var12 = this.field_541;
            int var63;
            if ((var63 = this.field_541 * var10 >> 10) >= 1) {
               int var14 = this.field_542[2];
               int var15 = this.field_542[0];
               int[] var68 = null;
               if (var38 != 0 || var6 == null || var15 != var6[0]) {
                  if (var15 != -8355712) {
                     int[][] var82 = var1.field_299;
                     int[] var96 = var1.field_299[0];
                     method_292(1, this.field_540 * this.field_541, false, var82);
                     int[] var101 = var82[1];
                     int var109 = var15 & 0xFF000000;
                     int var115;
                     if ((var115 = (var15 & 0xFF0000) - 8388608 << 1) == 16646144) {
                        var115 = 16711680;
                     }

                     int var122;
                     if ((var122 = (var15 & 0xFF00) - 32768 << 1) == 65024) {
                        var122 = 65280;
                     }

                     int var126;
                     if ((var126 = (var15 & 0xFF) - 128 << 1) == 254) {
                        var126 = 255;
                     }

                     if (var1.field_296.isMutable()) {
                        if (var115 == 0 && var122 == 0 && var126 == 0) {
                           int var139 = this.field_540 * this.field_541;

                           while (--var139 >= 0) {
                              int var152;
                              if (((var152 = var96[var139]) & 0xFF000000) == 0) {
                                 var101[var139] = 0;
                              } else {
                                 var101[var139] = var109 | var152 & 16777215;
                              }
                           }
                        } else {
                           int var138 = this.field_540 * this.field_541;

                           while (--var138 >= 0) {
                              int var151;
                              if (((var151 = var96[var138]) & 0xFF000000) == 0) {
                                 var101[var138] = 0;
                              } else {
                                 int var163;
                                 if ((var163 = (var151 & 0xFF0000) + var115) > 16711680) {
                                    var163 = 16711680;
                                 } else if (var163 < 0) {
                                    var163 = 0;
                                 }

                                 int var173;
                                 if ((var173 = (var151 & 0xFF00) + var122) > 65280) {
                                    var173 = 65280;
                                 } else if (var173 < 0) {
                                    var173 = 0;
                                 }

                                 int var186;
                                 if ((var186 = (var151 & 0xFF) + var126) > 255) {
                                    var186 = 255;
                                 } else if (var186 < 0) {
                                    var186 = 0;
                                 }

                                 var101[var138] = var109 | var163 | var173 | var186;
                              }
                           }
                        }
                     } else if (var109 == 255) {
                        int var137 = this.field_540 * this.field_541;

                        while (--var137 >= 0) {
                           int var150;
                           int var162;
                           if ((var162 = ((var150 = var96[var137]) & 0xFF0000) + var115) > 16711680) {
                              var162 = 16711680;
                           } else if (var162 < 0) {
                              var162 = 0;
                           }

                           int var172;
                           if ((var172 = (var150 & 0xFF00) + var122) > 65280) {
                              var172 = 65280;
                           } else if (var172 < 0) {
                              var172 = 0;
                           }

                           int var185;
                           if ((var185 = (var150 & 0xFF) + var126) > 255) {
                              var185 = 255;
                           } else if (var185 < 0) {
                              var185 = 0;
                           }

                           var101[var137] = var150 & 0xFF000000 | var162 | var172 | var185;
                        }
                     } else {
                        var109 >>>= 8;
                        if (var115 == 0 && var122 == 0 && var126 == 0) {
                           int var136 = this.field_540 * this.field_541;

                           while (--var136 >= 0) {
                              int var149 = var96[var136];
                              var101[var136] = (var149 >>> 24) * var109 & 0xFF000000 | var149 & 16777215;
                           }
                        } else {
                           int var135 = this.field_540 * this.field_541;

                           while (--var135 >= 0) {
                              int var148;
                              int var161;
                              if ((var161 = ((var148 = var96[var135]) & 0xFF0000) + var115) > 16711680) {
                                 var161 = 16711680;
                              } else if (var161 < 0) {
                                 var161 = 0;
                              }

                              int var171;
                              if ((var171 = (var148 & 0xFF00) + var122) > 65280) {
                                 var171 = 65280;
                              } else if (var171 < 0) {
                                 var171 = 0;
                              }

                              int var184;
                              if ((var184 = (var148 & 0xFF) + var126) > 255) {
                                 var184 = 255;
                              } else if (var184 < 0) {
                                 var184 = 0;
                              }

                              var101[var135] = (var148 >>> 24) * var109 & 0xFF000000 | var161 | var171 | var184;
                           }
                        }
                     }
                  }

                  var38 = 1;
               }

               label553: {
                  var68 = this.method_294(var45);
                  if (var6 != null) {
                     var29 = null;
                     if (var14 == var6[2] && var9 == var6[3] && var10 == var6[4]) {
                        break label553;
                     }
                  }

                  var38 = 1;
               }

               if (var14 != 0) {
                  if (var38 == 0) {
                     this.method_295(var14, var9, var10);
                  } else {
                     if (this.field_552 == null) {
                        this.field_551 = new int[4];
                        this.field_552 = new int[4];
                     }

                     int[] var102 = this.method_294(var45);
                     int var111 = this.field_540;
                     int var116 = this.field_541;
                     this.method_295(var14, var9, var10);
                     method_292(2, this.field_547 * this.field_548, true, var45);
                     int[] var123 = var45[2];
                     int var127 = this.field_547;
                     int var140 = class_30.method_387(-var14);
                     int var153 = class_30.method_388(-var14);
                     int var164 = (var140 << 10) / var9;
                     int var174 = (var140 << 10) / var10;
                     int var188 = (var153 << 10) / var9;
                     var50 = (var153 << 10) / var10;
                     var63 = this.field_549 * var188 - this.field_550 * var164 + (var111 << 14);
                     int var40 = this.field_550 * var50 + this.field_549 * var174 + (var116 << 14);
                     boolean var30;
                     int var31 = (var30 = this.method_322(1)) ? -32768 : 0;
                     int var32 = 0;
                     var15 = this.field_548;

                     while (--var15 >= 0) {
                        int var33 = var63;
                        int var34 = var40;
                        var63 -= var164;
                        var40 += var50;
                        int var35 = 0;
                        int var36 = 0;

                        for (int var37 = 0; var37 < 2; var37++) {
                           var47 = 0;
                           var12 = 0;
                           int var71 = var33;
                           int var17 = var188;
                           int var83 = var111;
                           if (var37 == 1) {
                              var71 = var34;
                              var17 = var174;
                              var83 = var116;
                           }

                           var83 <<= 15;
                           if (var71 < var31) {
                              var47 = var127;
                              if (var17 > 0) {
                                 var47 = -(var71 - var31) / var17;
                                 if (var71 + var47 * var17 < var31) {
                                    var47++;
                                 }
                              }
                           } else if (var71 >= var83) {
                              var47 = var127;
                              if (var17 < 0) {
                                 var47 = (var71 - var83) / -var17;
                                 if (var71 + var47 * var17 >= var83) {
                                    var47++;
                                 }
                              }
                           }

                           int var72;
                           if ((var72 = var71 + (var127 * var17 - var17)) < var31) {
                              var12 = var127;
                              if (var17 < 0) {
                                 var12 = (var72 - var31) / var17;
                                 if (var72 - var12 * var17 < var31) {
                                    var12++;
                                 }
                              }
                           } else if (var72 >= var83) {
                              var12 = var127;
                              if (var17 > 0) {
                                 var12 = (var72 - var83) / var17;
                                 if (var72 - var12 * var17 >= var83) {
                                    var12++;
                                 }
                              }
                           }

                           if (var12 > var36) {
                              var36 = var12;
                              if (var12 >= var127) {
                                 var36 = var127;
                                 break;
                              }
                           }

                           if (var47 > var35) {
                              var35 = var47;
                              if (var47 >= var127) {
                                 var35 = var127;
                                 break;
                              }
                           }
                        }

                        if (var35 + var36 >= var127) {
                           var35 = 0;
                           var36 = var127;
                        } else if (var35 != 0) {
                           var33 += var35 * var188;
                           var34 += var35 * var174;
                        }

                        int var204 = var32 + var127;
                        var35 += var32;
                        var36 = var204 - var36;

                        while (var32 < var35) {
                           var123[var32++] = 0;
                        }

                        if (!var30) {
                           while (var32 < var36) {
                              var123[var32++] = var102[(var33 >> 15) + (var34 >> 15) * var111];
                              var33 += var188;
                              var34 += var174;
                           }
                        } else {
                           while (var32 < var36) {
                              var123[var32++] = method_320(var102, var33 >> 7, var34 >> 7, var111, var116);
                              var33 += var188;
                              var34 += var174;
                           }
                        }

                        while (var32 < var204) {
                           var123[var32++] = 0;
                        }
                     }
                  }

                  int var41 = class_30.method_387(var14);
                  var14 = class_30.method_388(var14);
                  int var73 = ((-var2 << 1) - this.field_540) * var9 >> 10;
                  int var77 = ((-var3 << 1) - this.field_541) * var10 >> 10;
                  var47 = this.field_547;
                  var12 = this.field_548;
                  var2 = -(var73 * var14 - var77 * var41 + (var47 << 15) >> 16);
                  var3 = -(var77 * var14 + var73 * var41 + (var12 << 15) >> 16);
                  var68 = var45[2];
               } else if (var9 != 1024 || var10 != 1024) {
                  int var42 = var50 * var63;
                  method_292(2, var42, true, var45);
                  int[] var67 = var45[2];
                  if (var38 != 0) {
                     int var74 = (var47 << 10) / var50;
                     int var78 = (var12 << 10) / var63;
                     int var43 = 0;
                     int var85 = 0;
                     if (!this.method_322(1)) {
                        for (int var98 = var63; --var98 >= 0; var43 += var78) {
                           var12 = (var43 >> 10) * var47 << 10;
                           int var105 = var50;

                           while (--var105 >= 0) {
                              var67[var85++] = var68[var12 >> 10];
                              var12 += var74;
                              if (var105 > 8) {
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var67[var85++] = var68[var12 >> 10];
                                 var12 += var74;
                                 var105 -= 8;
                              }
                           }
                        }
                     } else {
                        for (int var97 = var63; --var97 >= 0; var43 += var78) {
                           int var103 = 0;
                           var103 = 0;
                           int var112 = var43 >> 2;

                           for (int var117 = var50; --var117 >= 0; var103 += var74) {
                              var67[var85++] = method_320(var68, var103 >> 2, var112, var47, var12);
                           }
                        }
                     }
                  }

                  var68 = var67;
                  var47 = var50;
                  var12 = var63;
                  var2 = var2 * var9 >> 10;
                  var3 = var3 * var10 >> 10;
               }

               var29 = null;
               if (this.field_542[10] > 1 || this.field_542[11] > 1) {
                  if (var38 != 0) {
                     int var10003 = this.field_542[10];
                     int var106 = this.field_542[11];
                     int var99 = var10003;
                     int var93 = var12;
                     int var79 = var47;
                     var16 = var68;
                     if (var99 < 1) {
                        var99 = 1;
                     }

                     if (var106 < 1) {
                        var106 = 1;
                     }

                     int var118 = var47 * var12;
                     method_292(3, var118, true, var45);
                     method_292(4, var118, true, var45);
                     int[] var124 = var45[3];
                     int[] var128 = var45[4];
                     int var141 = 65536 / (((var99 << 1) + 1) * ((var106 << 1) + 1));
                     int var154 = var118;

                     while (--var154 >= 0) {
                        var124[var154] = 0;
                     }

                     for (byte var155 = 0; var155 <= 24; var155 += 8) {
                        byte var198 = var155;
                        int[] var197 = var128;
                        int var196 = var79;
                        int[] var195 = (int[])var16;
                        var128[0] = ((int[])var16)[0] >>> var155 & 0xFF;
                        int var200 = 1;

                        for (int var202 = var79 + 1 - 1; var200 < var202; var200++) {
                           var197[var200] = (var195[var200] >>> var198 & 0xFF) + var197[var200 - 1];
                        }

                        int var203 = var93;

                        while (--var203 >= 1) {
                           var197[var200++] = (var195[var200] >>> var198 & 0xFF) + var197[var200 - var196];

                           for (int var205 = var200 + var196 - 1; var200 < var205; var200++) {
                              var197[var200] = (var195[var200] >>> var198 & 0xFF) + var197[var200 - 1] - var197[var200 - var196 - 1] + var197[var200 - var196];
                           }
                        }

                        int var165 = 0;

                        for (int var175 = 0; var175 < var93; var175++) {
                           int var190;
                           if ((var190 = var175 - var106) < 0) {
                              var190 = 0;
                           }

                           if ((var50 = var175 + var106) >= var93) {
                              var50 = var93 - 1;
                           }

                           int var191 = var190 * var79;
                           var50 *= var79;

                           for (int var65 = 0; var65 < var79; var65++) {
                              int var44;
                              if ((var44 = var65 - var99) < 0) {
                                 var44 = 0;
                              }

                              int var194;
                              if ((var194 = var65 + var99) >= var79) {
                                 var194 = var79 - 1;
                              }

                              var38 = var128[var194 + var50] + var128[var44 + var191] - var128[var44 + var50] - var128[var194 + var191];
                              var124[var165++] |= var38 * var141 >> 16 << var155;
                           }
                        }
                     }

                     var68 = var124;
                  } else {
                     var68 = var45[3];
                  }
               }

               this.method_299(var68, this.field_542[7] + var2, this.field_542[8] + var3, var47, var12);
               this.field_542[5] = 0;
               this.field_542[6] = var4;
               var16 = this.field_542;
               class_16 var70 = var1;
               if (var16 != null) {
                  int var80 = ((int[])var16).length;
                  if (var1.field_298 == null) {
                     var1.field_298 = new int[var80];
                  }

                  int var94 = var80;

                  while (--var94 >= 0) {
                     var70.field_298[var94] = (int)((int[])var16)[var94];
                  }
               } else {
                  var1.field_298 = null;
               }
            }
         }
      }
   }

   // $VF: renamed from: a (int[], int, int, int, int) void
   private void method_299(int[] var1, int var2, int var3, int var4, int var5) {
      if (var4 > 0 && var5 > 0) {
         Object var9 = null;
         int var6;
         int var7;
         if ((var7 = (var6 = this.field_557.getClipX()) + this.field_557.getClipWidth()) > 0) {
            int var8;
            int var29;
            if ((var29 = (var8 = this.field_557.getClipY()) + this.field_557.getClipHeight()) > 0) {
               if (var8 < 0) {
                  var8 = 0;
               }

               if (var6 < 0) {
                  var6 = 0;
               }

               if (var2 < var7 && var3 < var29 && var2 + var4 > var6 && var3 + var5 > var8) {
                  int var10 = 0;
                  int var11 = 0;
                  int var12 = var4;
                  int var13 = var5;
                  if (var2 + var4 > var7) {
                     var12 = var4 - (var2 + var4 - var7);
                  }

                  if (var2 < var6) {
                     var10 = 0 - (var2 - var6);
                     var12 += var2 - var6;
                     var2 = var6;
                  }

                  if (var3 + var5 > var29) {
                     var13 = var5 - (var3 + var5 - var29);
                  }

                  if (var3 < var8) {
                     var11 = 0 - (var3 - var8);
                     var13 += var3 - var8;
                     var3 = var8;
                  }

                  var9 = null;
                  if ((var6 = this.field_542[9]) == 0) {
                     this.field_557.drawRGB(var1, var11 * var4 + var10, var4, var2, var3, var12, var13, true);
                  } else if (this.field_553 != null) {
                     var7 = var4 * var5;
                     method_292(2, var7, true, field_539);
                     int[] var24 = field_539[2];
                     this.field_553.method_182(var24, var11 * var4 + var10, var4, var2, var3, var12, var13);
                     if (var6 == 1) {
                        var5 = var4 * var5;

                        while (--var5 >= 0) {
                           var6 = var24[var5];
                           int var31 = (var8 = var1[var5]) >>> 24;
                           int var14 = (var8 & 16711935) * var31 >> 8;
                           int var15;
                           if ((var15 = (var6 & 0xFF0000) + (var14 & 0xFF0000)) > 16711680) {
                              var15 = 16711680;
                           }

                           if ((var8 = (var6 & 0xFF00) + ((var8 & 0xFF00) * var31 >> 8 & 0xFF00)) > 65280) {
                              var8 = 65280;
                           }

                           if ((var6 = (var6 & 0xFF) + (var14 & 0xFF)) > 255) {
                              var6 = 255;
                           }

                           var24[var5] = var15 | var8 | var6;
                        }
                     } else {
                        var5 = var4 * var5;

                        while (--var5 >= 0) {
                           var6 = var24[var5];
                           int var32 = (var8 = var1[var5]) >>> 24;
                           int var33 = (var8 & 16711935) * var32 >> 8;
                           int var34;
                           if ((var34 = (var6 & 0xFF0000) - (var33 & 0xFF0000)) < 0) {
                              var34 = 0;
                           }

                           if ((var8 = (var6 & 0xFF00) - ((var8 & 0xFF00) * var32 >> 8 & 0xFF00)) < 0) {
                              var8 = 0;
                           }

                           if ((var6 = (var6 & 0xFF) - (var33 & 0xFF)) < 0) {
                              var6 = 0;
                           }

                           var24[var5] = var34 | var8 | var6;
                        }
                     }

                     this.field_557.drawRGB(var24, var11 * var4 + var10, var4, var2, var3, var12, var13, false);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: c () int
   public final int method_300() {
      return this.field_542[2];
   }

   // $VF: renamed from: d () int
   public final int method_301() {
      return this.field_542[0];
   }

   // $VF: renamed from: e () int
   public final int method_302() {
      return this.field_542[3];
   }

   // $VF: renamed from: f () int
   public final int method_303() {
      return this.field_542[4];
   }

   // $VF: renamed from: a (int, int) void
   public final void method_304(int var1, int var2) {
      this.field_542[3] = var1;
      this.field_542[4] = var2;
   }

   // $VF: renamed from: g () int
   public final int method_305() {
      return this.field_542[9];
   }

   // $VF: renamed from: a () void
   public final void method_306() {
      int var2 = -8355712;
      Object var1 = null;
      this.field_542[0] = var2;
      this.field_542[2] = 0;
      this.method_304(1024, 1024);
      boolean var3 = false;
      var1 = null;
      this.field_542[9] = 0;
      boolean var5 = false;
      this.field_542[10] = 0;
      this.field_542[11] = 0;
      this.field_542[1] = 0;
   }

   // $VF: renamed from: a (int, int, int, int) void
   public final void method_307(int var1, int var2, int var3, int var4) {
      int var5 = this.field_542[3];
      int var6 = this.field_542[4];
      var1 = (var1 * var5 >> 10) + this.field_542[7];
      var2 = (var2 * var6 >> 10) + this.field_542[8];
      var3 = var3 * var5 >> 10;
      var4 = var4 * var6 >> 10;
      this.field_557.drawRect(var1, var2, var3, var4);
   }

   // $VF: renamed from: b (int, int, int, int) void
   public final void method_308(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if ((var6 = (var5 = this.field_542[12]) >>> 24) != 0) {
         if (this.field_542[2] != 0) {
            method_292(0, 8, false, field_539);
            int[] var15;
            (var15 = field_539[0])[0] = var1;
            var15[1] = var2;
            var15[2] = var1 + var3 - 1;
            var15[3] = var2;
            var15[4] = var15[2];
            var15[5] = var2 + var4 - 1;
            var15[6] = var1;
            var15[7] = var15[5];
            this.method_333(var15, 0, 4);
         } else {
            int var7 = this.field_542[3];
            int var8 = this.field_542[4];
            var1 = (var1 * var7 >> 10) + this.field_542[7];
            var2 = (var2 * var8 >> 10) + this.field_542[8];
            var3 = var3 * var7 >> 10;
            var4 = var4 * var8 >> 10;
            if (var6 == 255) {
               this.field_557.fillRect(var1, var2, var3, var4);
            } else {
               var6 = var3 * var4;
               method_292(0, var6, true, field_539);
               int[] var14 = field_539[0];

               while (--var6 >= 0) {
                  var14[var6] = var5;
               }

               this.method_299(var14, var1, var2, var3, var4);
            }
         }
      }
   }

   // $VF: renamed from: b (int) void
   public final void method_309(int var1) {
      this.method_310(var1 | 0xFF000000);
   }

   // $VF: renamed from: c (int) void
   public final void method_310(int var1) {
      this.field_542[12] = var1;
      this.field_557.setColor(var1);
   }

   // $VF: renamed from: d (int) void
   public final void method_311(int var1) {
      this.field_542[0] = var1;
   }

   // $VF: renamed from: a (k) void
   public final void method_312(class_16 var1) {
      this.method_313(var1.field_297);
      this.field_553 = var1;
      int[] var2 = var1.field_298;
      if (var1.field_298 != null) {
         var2[5]++;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_313(Graphics var1) {
      this.field_557 = var1;
      this.field_553 = null;
   }

   // $VF: renamed from: a () javax.microedition.lcdui.Graphics
   public final Graphics method_314() {
      return this.field_557;
   }

   // $VF: renamed from: o () int
   private int method_315() {
      if (field_554 == null) {
         boolean var1 = false;
         int var2 = -65281 | 0xFF000000;
         if (field_554 == null) {
            field_554 = new int[1];
            field_555 = (field_556 = Image.createImage(1, 1)).getGraphics();
         }

         field_555.setColor(var2);
         field_555.fillRect(0, 0, 1, 1);
         field_556.getRGB(field_554, 0, 1, 0, 0, 1, 1);
      }

      return field_554[0];
   }

   // $VF: renamed from: b () void
   public final void method_316() {
      this.field_542[1] = this.field_542[1] & -3;
   }

   // $VF: renamed from: b (int, int) void
   public final void method_317(int var1, int var2) {
      this.field_542[7] = var1;
      this.field_542[8] = var2;
   }

   // $VF: renamed from: h () int
   public final int method_318() {
      return this.field_542[7];
   }

   // $VF: renamed from: i () int
   public final int method_319() {
      return this.field_542[8];
   }

   // $VF: renamed from: a (int[], int, int, int, int) int
   private static int method_320(int[] var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 >> 8;
      int var6;
      int var7 = (var6 = var2 >> 8) * var3 + var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var5 != -1 && var6 != -1) {
         var8 = var0[var7];
         if (var5 < var3 - 1) {
            var9 = var0[var7 + 1];
         } else {
            var9 = var8 & 16777215;
         }

         var10 = var9 & 16777215;
         var11 = var8 & 16777215;
         if (var6 < var4 - 1) {
            var7 += var3;
            if (var5 < var3 - 1) {
               var10 = var0[var7 + 1];
            }

            var11 = var0[var7];
         }
      } else if (var5 == -1) {
         var7++;
         if (var6 == -1) {
            var8 = var9 = var11 = (var10 = var0[var7 + var3]) & 16777215;
         } else {
            var8 = var10 = (var9 = var0[var7]) & 16777215;
            if (var6 < var4 - 1) {
               var10 = var0[var7 + var3];
            }

            var11 = var10 & 16777215;
         }
      } else {
         var7 += var3;
         var8 = var10 = (var11 = var0[var7]) & 16777215;
         if (var5 < var3 - 1) {
            var10 = var0[var7 + 1];
         }

         var9 = var10 & 16777215;
      }

      var6 = var2 & 0xFF;
      var5 = var1 & 0xFF;
      int var12;
      var1 = (var12 = var8 >>> 24) + (((var11 >>> 24) - var12) * var6 >> 8);
      int var13;
      int var14 = (var13 = var9 >>> 24) + (((var10 >>> 24) - var13) * var6 >> 8);
      var2 = var1 + ((var14 - var1) * var5 >> 8) << 24;
      int var15;
      var1 = (var15 = var8 & 16711935) + (((var11 & 16711935) - var15) * var6 >> 8) & 16711935;
      int var16;
      int var17 = (var16 = var9 & 16711935) + (((var10 & 16711935) - var16) * var6 >> 8) & 16711935;
      var2 |= var1 + ((var17 - var1) * var5 >> 8) & 16711935;
      int var18;
      var1 = (var18 = var8 & 0xFF00) + (((var11 & 0xFF00) - var18) * var6 >> 8);
      int var19;
      int var20 = (var19 = var9 & 0xFF00) + (((var10 & 0xFF00) - var19) * var6 >> 8);
      return var2 | var1 + ((var20 - var1) * var5 >> 8) & 0xFF00;
   }

   // $VF: renamed from: j () int
   public final int method_321() {
      return this.field_542[1];
   }

   // $VF: renamed from: a (int) boolean
   private boolean method_322(int var1) {
      return (this.field_542[1] & var1) == var1;
   }

   // $VF: renamed from: e (int) void
   public final void method_323(int var1) {
      this.field_542[1] = var1;
   }

   // $VF: renamed from: c () void
   public final void method_324() {
      int var1 = this.field_543.size() - 1;
      int[] var2 = (int[])this.field_543.elementAt(var1);
      this.field_543.removeElementAt(var1);
      int var3 = 13;

      while (--var3 >= 0) {
         this.field_542[var3] = var2[var3];
      }

      this.field_546.addElement(var2);
      this.method_313((Graphics)this.field_544.elementAt(var1));
      this.field_544.removeElementAt(var1);
      this.field_553 = (class_16)this.field_545.elementAt(var1);
      this.field_545.removeElementAt(var1);
      this.method_310(this.field_542[12]);
   }

   // $VF: renamed from: d () void
   public final void method_325() {
      if (this.field_543 == null) {
         this.field_543 = new Vector();
         this.field_546 = new Vector();
         this.field_544 = new Vector();
         this.field_545 = new Vector();
      }

      this.field_543.addElement(this.field_542);
      this.field_544.addElement(this.field_557);
      this.field_545.addElement(this.field_553);
      int[] var1;
      if (this.field_546.size() > 0) {
         var1 = (int[])this.field_546.elementAt(0);
         this.field_546.removeElementAt(0);
      } else {
         var1 = new int[13];
      }

      int var2 = 13;

      while (--var2 >= 0) {
         var1[var2] = this.field_542[var2];
      }

      this.field_542 = var1;
   }

   // $VF: renamed from: a (k) boolean
   public final boolean method_326(class_16 var1) {
      int[] var3;
      if ((var3 = var1.field_298) == null) {
         return false;
      } else {
         int var2 = 13;

         while (--var2 >= 0) {
            switch (var2) {
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
                  break;
               default:
                  if (this.field_542[var2] != var3[var2]) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   // $VF: renamed from: k () int
   public final int method_327() {
      return this.field_557.getClipHeight();
   }

   // $VF: renamed from: l () int
   public final int method_328() {
      return this.field_557.getClipWidth();
   }

   // $VF: renamed from: m () int
   public final int method_329() {
      return this.field_557.getClipX();
   }

   // $VF: renamed from: n () int
   public final int method_330() {
      return this.field_557.getClipY();
   }

   // $VF: renamed from: c (int, int, int, int) void
   public final void method_331(int var1, int var2, int var3, int var4) {
      this.field_557.setClip(var1, var2, var3, var4);
   }

   // $VF: renamed from: d (int, int, int, int) void
   public final void method_332(int var1, int var2, int var3, int var4) {
      Object var8 = null;
      int var5 = this.field_557.getClipX();
      int var6 = this.field_557.getClipY();
      int var7 = this.field_557.getClipWidth();
      int var11 = this.field_557.getClipHeight();
      if (var1 + var3 > var5 && var2 + var4 > var6 && var1 < var5 + var7 && var2 < var6 + var11) {
         if ((var3 = var1 + var3) > var5 + var7) {
            var3 = var5 + var7;
         }

         if (var1 < var5) {
            var1 = var5;
         }

         if ((var4 = var2 + var4) > var6 + var11) {
            var4 = var6 + var11;
         }

         if (var2 < var6) {
            var2 = var6;
         }

         this.field_557.setClip(var1, var2, var3 - var1, var4 - var2);
      } else {
         this.field_557.setClip(var5, var6, 0, 0);
      }
   }

   // $VF: renamed from: a (int[], int, int) void
   public final void method_333(int[] var1, int var2, int var3) {
      int var4 = this.field_542[3];
      int var5 = this.field_542[4];
      Object var7 = null;
      int var6 = this.field_542[7];
      int var38 = this.field_542[8];
      if (this.field_566 == null || this.field_566.length < var3) {
         this.field_566 = new int[var3];
         this.field_567 = new int[var3];
      }

      int var8;
      int var9 = class_30.method_387(var8 = this.field_542[2]);
      var8 = class_30.method_388(var8);

      for (int var10 = 0; var10 < var3; var10++) {
         int var11 = var1[var2++] * var4 >> 10;
         int var12 = var1[var2++] * var5 >> 10;
         this.field_566[var10] = (var11 * var8 - var12 * var9 >> 15) + var6;
         this.field_567[var10] = (var12 * var8 + var11 * var9 >> 15) + var38;
      }

      boolean var10000;
      label307: {
         if (this.field_542[0] == -8355712 && !this.method_322(2)) {
            var7 = null;
            if (this.field_542[9] == 0 && this.field_542[10] <= 1 && this.field_542[11] <= 1) {
               var10000 = true;
               break label307;
            }
         }

         var10000 = false;
      }

      if (var10000 && var3 == 3) {
         this.field_557.fillTriangle(this.field_566[0], this.field_567[0], this.field_566[1], this.field_567[1], this.field_566[2], this.field_567[2]);
      } else {
         boolean var49 = this.method_322(2);
         if (field_558 == null || var3 > field_558.length) {
            field_558 = new int[var3];
            field_559 = new int[var3];
            field_560 = new int[var3];
            field_561 = new int[var3];
            field_562 = new int[var3];
            field_564 = new int[var3];
         }

         if (var49 && (field_563 == null || var3 > field_563.length)) {
            field_563 = new int[var3];
         }

         int var55 = Integer.MAX_VALUE;
         int var25 = Integer.MAX_VALUE;
         var2 = Integer.MIN_VALUE;
         var4 = Integer.MIN_VALUE;
         var5 = 0;
         var6 = 0;
         int var10000i;
         if (var49) {
            var7 = null;
            var10000i = this.field_542[12] | 0xFF000000;
         } else {
            var10000i = 0;
         }

         int var41 = var10000i;
         int[] var43 = null;
         if (var49) {
            for (int var44 = 0; var44 < var3; var44++) {
               int var50;
               if ((var50 = this.field_566[var44]) > var2) {
                  var2 = var50;
               }

               if (var50 < var55) {
                  var55 = var50;
               }

               int var13;
               if ((var13 = this.field_567[var44]) > var4) {
                  var4 = var13;
               }

               if (var13 < var25) {
                  var25 = var13;
               }
            }

            var6 = var4 - var25 + 1;
            var9 = (var5 = var2 - var55 + 1) * var6;
            method_292(0, var9, true, field_539);
            var43 = field_539[0];
         }

         for (int var46 = 0; var46 < var3; var46++) {
            if (var49) {
               field_561[var46] = this.field_566[var46] - var55 << 16;
               field_559[var46] = this.field_567[var46] - var25;
            } else {
               field_561[var46] = this.field_566[var46] << 16;
               field_559[var46] = this.field_567[var46];
            }
         }

         for (int var47 = 0; var47 < var3; var47++) {
            int var51;
            if ((var51 = var47 + 1) == var3) {
               var51 = 0;
            }

            field_560[var47] = field_559[var51];
            field_562[var47] = field_561[var51];
         }

         var9 = 0;

         for (int var52 = 0; var52 < var3; var52++) {
            int var56;
            if ((var56 = field_560[var52] - field_559[var52]) != 0) {
               if (var56 < 0) {
                  var2 = field_559[var52];
                  field_559[var52] = field_560[var52];
                  field_560[var52] = var2;
                  var2 = field_561[var52];
                  field_561[var52] = field_562[var52];
                  field_562[var52] = var2;
                  var56 = -var56;
               }

               field_562[var52] = field_562[var52] - field_561[var52];
               field_562[var52] = field_562[var52] / var56;
            }

            var2 = field_559[var52];
            var4 = field_560[var52];
            boolean var14 = false;
            boolean var15 = false;
            int var16 = var9;

            while (--var16 >= 0) {
               if (field_564[var16] == var2) {
                  var14 = true;
               }

               if (field_564[var16] == var4) {
                  var15 = true;
               }
            }

            if (!var14) {
               field_564[var9++] = var2;
            }

            if (!var15) {
               field_564[var9++] = var4;
            }
         }

         for (int var53 = 0; var53 < var9; var53++) {
            for (int var57 = var53 + 1; var57 < var9; var57++) {
               if (field_564[var53] > field_564[var57]) {
                  var2 = field_564[var53];
                  field_564[var53] = field_564[var57];
                  field_564[var57] = var2;
               }
            }
         }

         int var54 = field_564[0];
         int var58 = 1;
         var2 = -1;

         do {
            var4 = 0;
            int var59 = var3;

            while (--var59 >= 0) {
               if (field_559[var59] <= var54 && field_560[var59] > var54) {
                  field_558[var4++] = var59;
               }
            }

            if (var49 && var4 != var2) {
               var59 = var4;

               while (--var59 >= 0) {
                  field_563[var59] = Integer.MAX_VALUE;
               }

               var2 = var4;
            }

            for (int var61 = 0; var61 < var4; var61++) {
               for (int var63 = var61 + 1; var63 < var4; var63++) {
                  int var65 = field_558[var61];
                  int var17 = field_561[var65];
                  int var18 = field_558[var63];
                  int var19 = field_561[var18];
                  if (var17 > var19 || var17 == var19 && field_562[var65] > field_562[var18]) {
                     field_558[var63] = var65;
                     field_558[var61] = var18;
                  }
               }
            }

            var59 = field_564[var58++];
            if (var58 == var9) {
               var59++;
            }

            while (var54 < var59) {
               int var66 = Integer.MIN_VALUE;
               if (var49) {
                  int var67;
                  int var70 = (var67 = var54 * var5) + var5;

                  while (var67 < var70) {
                     var43[var67++] = 0;
                  }
               }

               int var68 = 0;

               while (var68 < var4) {
                  int var71 = field_558[var68++];
                  int var72 = field_561[var71];
                  int var64 = field_558[var68++];
                  int var20 = field_561[var64];
                  var72 = (var72 >> 16) + ((var72 & 65535) >> 15);
                  var20 = (var20 >> 16) + ((var20 & 65535) >> 15) + 1;
                  if (var72 < var66) {
                     var72 = var66;
                  }

                  var66 = var20;
                  if (!var49) {
                     this.field_557.fillRect(var72, var54, var20 - var72, 1);
                  } else {
                     int var21 = var68 - 2;
                     int var22 = var68 - 1;
                     int var23 = var20 - var72;
                     int var24;
                     var23 = (var24 = var54 * var5 + var72) + var23;

                     while (var24 < var23) {
                        var43[var24++] = var41;
                     }

                     if (field_563[var21] != Integer.MAX_VALUE) {
                        if ((var23 = var72 - field_563[var21]) < 0) {
                           method_334(var43, (var54 - 1) * var5 + var72, -var23, var41, true);
                        } else if (var23 > 0) {
                           method_334(var43, var54 * var5 + field_563[var21], var23, var41, true);
                        }
                     }

                     if (field_563[var22] != Integer.MAX_VALUE) {
                        if ((var23 = var20 - field_563[var22]) < 0) {
                           method_334(var43, var54 * var5 + var20, -var23, var41, false);
                        } else if (var23 > 0) {
                           method_334(var43, (var54 - 1) * var5 + field_563[var22], var23, var41, false);
                        }
                     }

                     field_563[var21] = var72;
                     field_563[var22] = var20;
                  }

                  field_561[var71] = field_561[var71] + field_562[var71];
                  field_561[var64] = field_561[var64] + field_562[var64];
               }

               var54++;
            }
         } while (var58 < var9);

         if (var49) {
            this.method_299(var43, var55, var25, var5, var6);
         }
      }
   }

   // $VF: renamed from: a (int[], int, int, int, boolean) void
   private static void method_334(int[] var0, int var1, int var2, int var3, boolean var4) {
      var3 &= 16777215;
      if (var2 == 1) {
         var0[var1] |= -2147483648 | var3;
      } else {
         int var5 = 65535 / (var2 + 1);
         int var6 = 0;
         if (!var4) {
            var6 = 65535;
            var5 = -var5;
         }

         var6 += var5;

         for (int var7 = var2 + var1; var1 < var7; var6 += var5) {
            var0[var1++] |= var6 >> 8 << 24 | var3;
         }
      }
   }

   // $VF: renamed from: b (int[], int, int) void
   public final void method_335(int[] var1, int var2, int var3) {
      var2 = 0;
      int var4 = 0;

      for (int var5 = 0; var5 < 2; var5++) {
         if (var5 == 1 && (field_565 == null || field_565.length < var2 << 1)) {
            field_565 = new int[var2 << 1];
         }

         int var6 = 3;

         for (int var7 = 0; var7 < var3; var7++) {
            int var8 = var1[var6];
            int var9 = var1[var6 + 1];
            int var10 = var1[var6 + 4];
            int var11 = var1[var6 + 5];
            int var12;
            var6 = var12 = var6 + 6;
            if (var7 == var3 - 1) {
               var12 = 3;
            }

            int var13 = var1[var12 + 2];
            int var14 = var1[var12 + 3];
            int var15 = var1[var12];
            var12 = var1[var12 + 1];
            if (var8 != var10 || var9 != var11 || var13 != var15 || var14 != var12) {
               int var10000 = method_336(var8 - var10, var9 - var11);
               int var16 = 0;
               var16 = (var16 = var10000 + method_336(var10 - var13, var11 - var14) + method_336(var13 - var15, var14 - var12)) > 8 ? var16 / 8 : 1;
               if (var5 == 0) {
                  var2 += var16;
               } else {
                  int var17 = 32768 / var16;
                  int var18 = 0;

                  for (int var19 = 0; var19 < var16; var19++) {
                     field_565[var4++] = (short)method_337(var8, var10, var13, var15, var18);
                     field_565[var4++] = (short)method_337(var9, var11, var14, var12, var18);
                     var18 += var17;
                  }
               }
            } else if (var5 == 0) {
               var2++;
            } else {
               field_565[var4++] = (short)var8;
               field_565[var4++] = (short)var9;
            }
         }
      }

      this.method_333(field_565, 0, var2);
   }

   // $VF: renamed from: a (int, int) int
   private static int method_336(int var0, int var1) {
      var1 = Math.abs(var1);
      int var2;
      return (var2 = Math.abs(var0)) > var1 ? var2 + (var1 * 106 >> 8) : var1 + (var2 * 106 >> 8);
   }

   // $VF: renamed from: a (int, int, int, int, int) int
   private static int method_337(int var0, int var1, int var2, int var3, int var4) {
      int var5;
      int var6 = (32768 - var4) * (var5 = 32768 - var4) >> 15;
      int var7 = var4 * var4 >> 15;
      return (var6 * var5 >> 15) * var0 + (var4 * 3 * var6 >> 15) * var1 + (var7 * 3 * var5 >> 15) * var2 + (var7 * var4 >> 15) * var3 >> 15;
   }

   // $VF: renamed from: a (k, int, int) void
   public final void method_338(class_16 var1, int var2, int var3) {
      Graphics var5;
      int var4 = (var5 = var1.field_297).getColor();
      var5.setColor(this.method_315());
      var5.fillRect(0, 0, var2, var3);
      var5.setColor(var4);
   }
}
