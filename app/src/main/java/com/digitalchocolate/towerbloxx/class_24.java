package com.digitalchocolate.towerbloxx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

// $VF: renamed from: c
public final class class_24 {
   // $VF: renamed from: a boolean
   private boolean field_532;
   // $VF: renamed from: a int
   private int field_533;
   // $VF: renamed from: b int
   private int field_534;
   // $VF: renamed from: a java.io.DataInputStream
   DataInputStream field_535;
   // $VF: renamed from: a java.io.DataOutputStream
   private DataOutputStream field_536;
   // $VF: renamed from: a byte[]
   private byte[] field_537;
   // $VF: renamed from: a java.io.ByteArrayOutputStream
   private ByteArrayOutputStream field_538;

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> RuntimeException sneakyThrow(Throwable t) throws T {
      throw (T) t;
   }

   private class_24() {
   }

   // $VF: renamed from: a (byte[], int, int) c
   public static class_24 method_280(byte[] var0, int var1, int var2) {
      class_24 var3 = new class_24();
      ByteArrayInputStream var4 = new ByteArrayInputStream(var0, var1, var2);
      var3.field_535 = new DataInputStream(var4);
      var3.field_537 = var0;
      var3.field_533 = var2;
      var3.field_534 = var1;
      var3.field_532 = true;
      return var3;
   }

   // $VF: renamed from: a () c
   public static class_24 method_281() {
      class_24 var0;
      (var0 = new class_24()).field_538 = new ByteArrayOutputStream();
      var0.field_536 = new DataOutputStream(var0.field_538);
      var0.field_532 = false;
      return var0;
   }

   // $VF: renamed from: a () int
   public final int method_282() {
      return this.field_532 ? this.field_533 : this.field_538.size();
   }

   // $VF: renamed from: a () boolean
   public final boolean method_283() {
      try {
         return this.field_535.readBoolean();
      } catch (EOFException var1) {
         throw class_24.<RuntimeException>sneakyThrow(var1);
      } catch (IOException var2) {
         return false;
      }
   }

   // $VF: renamed from: a () byte
   public final byte method_284() {
      try {
         return this.field_535.readByte();
      } catch (EOFException var1) {
         throw class_24.<RuntimeException>sneakyThrow(var1);
      } catch (IOException var2) {
         return 0;
      }
   }

   // $VF: renamed from: b () int
   public final int method_285() {
      try {
         return this.field_535.readUnsignedByte();
      } catch (EOFException var1) {
         throw class_24.<RuntimeException>sneakyThrow(var1);
      } catch (IOException var2) {
         return 0;
      }
   }

   // $VF: renamed from: a () short
   public final short method_286() {
      try {
         return this.field_535.readShort();
      } catch (EOFException var1) {
         throw class_24.<RuntimeException>sneakyThrow(var1);
      } catch (IOException var2) {
         return 0;
      }
   }

   // $VF: renamed from: c () int
   public final int method_287() {
      try {
         return this.field_535.readInt();
      } catch (EOFException var1) {
         throw class_24.<RuntimeException>sneakyThrow(var1);
      } catch (IOException var2) {
         return 0;
      }
   }

   // $VF: renamed from: a (boolean) void
   public final void method_288(boolean var1) {
      if (!this.field_532) {
         try {
            this.field_536.writeBoolean(var1);
            return;
         } catch (IOException var2) {
         }
      }
   }

   // $VF: renamed from: a (int) void
   public final void method_289(int var1) {
      if (!this.field_532) {
         try {
            this.field_536.writeByte(var1);
            return;
         } catch (IOException var2) {
         }
      }
   }

   // $VF: renamed from: b (int) void
   public final void method_290(int var1) {
      if (!this.field_532) {
         try {
            this.field_536.writeInt(var1);
            return;
         } catch (IOException var2) {
         }
      }
   }

   // $VF: renamed from: a () byte[]
   public final byte[] method_291() {
      if (this.field_532) {
         if (this.field_534 == 0 && this.field_533 == this.field_537.length) {
            return this.field_537;
         } else {
            byte[] var1 = new byte[this.field_533];
            System.arraycopy(this.field_537, this.field_534, var1, 0, this.field_533);
            return var1;
         }
      } else {
         return this.field_538.toByteArray();
      }
   }
}
