package ru.smartycraft;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;

public final class f {
   private final Properties a = new Properties();
   private String a = "ru_RU";

   public f(String var1) {
      this.a(var1);
   }

   public void a(String var1) {
      try {
         InputStream var2 = Launcher.class.getResourceAsStream("/" + var1 + ".properties");
         Throwable var36 = null;

         try {
            this.a.clear();
            this.a.load(var2);
            this.a = var1;
         } catch (Throwable var31) {
            var36 = var31;
            throw var31;
         } finally {
            if (var2 != null) {
               if (var36 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var30) {
                     var36.addSuppressed(var30);
                  }
               } else {
                  var2.close();
               }
            }
         }
      } catch (IOException var35) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var35.getMessage());

         try {
            InputStream var3 = Launcher.class.getResourceAsStream("/ru_RU.properties");
            Throwable var4 = null;

            try {
               this.a.clear();
               this.a.load(var3);
               this.a = "ru_RU";
            } catch (Throwable var29) {
               var4 = var29;
               throw var29;
            } finally {
               if (var3 != null) {
                  if (var4 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var28) {
                        var4.addSuppressed(var28);
                     }
                  } else {
                     var3.close();
                  }
               }
            }
         } catch (IOException var33) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var33.getMessage());
         }
      }
   }

   public String a(String var1, Object... var2) {
      return String.format(this.a.getProperty(var1, var1), var2);
   }
}
