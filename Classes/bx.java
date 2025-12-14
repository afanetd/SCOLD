import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import ru.smartycraft.Launcher;

public class bx {
   public static String a(String var0) {
      try {
         byte[] var1 = MessageDigest.getInstance("MD5").digest(var0.getBytes("UTF-8"));
         BigInteger var2 = new BigInteger(1, var1);
         String var3 = var2.toString(16);

         while (var3.length() < 32) {
            var3 = "0" + var3;
         }

         return var3;
      } catch (NoSuchAlgorithmException var4) {
         Launcher.a.log(Level.SEVERE, "NoSuchAlgorithmException {0}", var4.getMessage());
      } catch (UnsupportedEncodingException var5) {
         Launcher.a.log(Level.SEVERE, "UnsupportedEncodingException {0}", var5.getMessage());
      }

      return null;
   }

   public static String a(File var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("MD5");
         FileInputStream var2 = new FileInputStream(var0);
         Throwable var3 = null;

         String var9;
         try {
            byte[] var4 = new byte[819200];

            int var5;
            while ((var5 = var2.read(var4)) > 0) {
               var1.update(var4, 0, var5);
            }

            byte[] var6 = var1.digest();
            var2.close();
            BigInteger var7 = new BigInteger(1, var6);
            String var8 = var7.toString(16);

            while (var8.length() < 32) {
               var8 = "0" + var8;
            }

            var9 = var8;
         } catch (Throwable var20) {
            var3 = var20;
            throw var20;
         } finally {
            if (var2 != null) {
               if (var3 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var19) {
                     var3.addSuppressed(var19);
                  }
               } else {
                  var2.close();
               }
            }
         }

         return var9;
      } catch (NoSuchAlgorithmException var22) {
         Launcher.a.log(Level.SEVERE, "NoSuchAlgorithmException {0}", var22.getMessage());
      } catch (IOException var23) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var23.getMessage());
      }

      return null;
   }

   public static String b(String var0) {
      return new String(Base64.getEncoder().encode(var0.getBytes()));
   }

   public static String c(String var0) {
      return new String(Base64.getUrlDecoder().decode(var0));
   }

   public static String a(String var0, String var1) {
      byte[] var2 = null;

      try {
         SecretKeySpec var3 = new SecretKeySpec(var1.getBytes(), "AES");
         Cipher var4 = Cipher.getInstance("AES/ECB/PKCS5Padding");
         var4.init(2, var3);
         var2 = var4.doFinal(Base64.getDecoder().decode(var0));
      } catch (NoSuchAlgorithmException var5) {
         Launcher.a.log(Level.SEVERE, "NoSuchAlgorithmException {0}", var5.getMessage());
      } catch (NoSuchPaddingException var6) {
         Launcher.a.log(Level.SEVERE, "NoSuchPaddingException {0}", var6.getMessage());
      } catch (InvalidKeyException var7) {
         Launcher.a.log(Level.SEVERE, "InvalidKeyException {0}", var7.getMessage());
      } catch (IllegalBlockSizeException var8) {
         Launcher.a.log(Level.SEVERE, "IllegalBlockSizeException {0}", var8.getMessage());
      } catch (BadPaddingException var9) {
         Launcher.a.log(Level.SEVERE, "BadPaddingException {0}", var9.getMessage());
      }

      return new String(var2);
   }
}
