import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class al {
   public static byte[] a(byte[] var0, int var1, int var2) {
      if (var2 - var1 > var0.length) {
         return var0;
      } else {
         byte[] var3 = new byte[var2 - var1 + 1];

         for (int var4 = var1; var4 <= var2; var4++) {
            var3[var4 - var1] = var0[var4];
         }

         return var3;
      }
   }

   public static byte[] a(byte[] var0) {
      if (var0[0] != 0 && var0[var0.length] != 0) {
         return var0;
      } else {
         int var1 = 0;
         int var2 = var0.length;

         for (int var3 = 0; var3 < var0.length; var3++) {
            if (var0[var3] != 0) {
               var1 = var3;
               break;
            }
         }

         for (int var4 = var0.length - 1; var4 >= 0; var4--) {
            if (var0[var4] != 0) {
               var2 = var4;
               break;
            }
         }

         return a(var0, var1, var2);
      }
   }

   public static byte[][] a(byte[] var0) {
      ArrayList var3 = new ArrayList();
      byte[][] var4 = new byte[var0.length][var0.length];
      boolean var5 = false;
      int var6 = 0;

      for (int var7 = 0; var7 < var0.length; var7++) {
         if (var0[var7] == 0) {
            byte[] var8 = a(var0, var6, var7 - 1);
            var3.add(var8);
            var6 = var7 + 1;
         }
      }

      if (var6 != 0) {
         byte[] var10 = a(var0, var6, var0.length - 1);
         var3.add(var10);
      }

      var4 = new byte[var3.size()][var0.length];

      for (int var11 = 0; var11 < var3.size(); var11++) {
         var4[var11] = (byte[])var3.get(var11);
      }

      return var4;
   }

   public static byte[] a(byte[] var0, int var1) {
      byte[] var2 = new byte[var0.length + var1];

      for (int var3 = 0; var3 < var0.length; var3++) {
         var2[var3] = var0[var3];
      }

      for (int var4 = var0.length; var4 < var2.length; var4++) {
         var2[var4] = 0;
      }

      return var2;
   }

   public static short a(byte[] var0) {
      ByteBuffer var1 = ByteBuffer.wrap(var0, 0, 2);
      var1.order(ByteOrder.LITTLE_ENDIAN);
      return var1.getShort();
   }

   public static byte[] a(int var0) {
      return new byte[]{(byte)(var0 >>> 24 & 0xFF), (byte)(var0 >>> 16 & 0xFF), (byte)(var0 >>> 8 & 0xFF), (byte)(var0 >>> 0 & 0xFF)};
   }
}
