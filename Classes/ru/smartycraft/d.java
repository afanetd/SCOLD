package ru.smartycraft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.logging.Level;

public class d {
   private final String a = ".manifest2";
   private final String b = ".manifest";
   private final String c = this.b();
   private final cd a;

   public d() {
      if (cb.a() == cc.a) {
         this.a = new cd();
      } else {
         this.a = null;
      }
   }

   public String a() {
      return this.c;
   }

   private String a(File var1) {
      String var2 = new String();

      try {
         FileReader var3 = new FileReader(var1);

         int var4;
         while ((var4 = var3.read()) != -1) {
            var2 = var2 + (char)var4;
         }
      } catch (FileNotFoundException var5) {
         Launcher.a.log(Level.SEVERE, "FileNotFoundException {0}", var5.getMessage());
      } catch (IOException var6) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var6.getMessage());
      }

      return var2;
   }

   private String b() {
      File var1 = new File(this.a(), ".manifest2");
      if (var1.exists()) {
         return this.a(var1);
      } else {
         var1 = new File(this.b(), ".manifest");
         String var2;
         if (var1.exists()) {
            var2 = this.a(var1);
         } else {
            var2 = this.d();
            if (var2 == null) {
               var2 = this.c();
            }
         }

         return var2;
      }
   }

   private File a() {
      String var1 = System.getProperty("user.home", ".");
      String var2 = "Network" + File.separator + "Installer";
      if (cb.a() == cc.a) {
         File var6 = new File(var1);
         var2 = "Default"
            + File.separator
            + "AppData"
            + File.separator
            + "Roaming"
            + File.separator
            + "Microsoft"
            + File.separator
            + "Network"
            + File.separator
            + "Installer";
         File var4 = new File(var6.getParentFile(), var2);
         if (!var4.exists()) {
            var4.mkdirs();
         }

         return var4;
      } else if (cb.a() == cc.b) {
         return new File(var1, "Library/Application Support/" + var2);
      } else {
         File var3 = new File(var1, ".config" + File.separator + "gtk-1.0");
         if (!var3.exists()) {
            var3.mkdirs();
         }

         return var3;
      }
   }

   private File b() {
      String var1 = "Network" + File.separator + "Installer";
      String var2 = System.getProperty("user.home", ".");
      if (cb.a() == cc.c || cb.a() == cc.d) {
         return new File(var2, var1);
      } else if (cb.a() == cc.a) {
         String var3 = System.getenv("AppData");
         return var3 != null ? new File(var3, var1) : new File(var2, var1);
      } else {
         return cb.a() == cc.b ? new File(var2, "Library/Application Support/" + var1) : new File(var2, var1);
      }
   }

   private String c() {
      String var1 = cb.e();
      if (var1 != null) {
         String var4 = bx.a(var1);
         this.a(var4);
         return var4;
      } else {
         UUID var2 = UUID.randomUUID();
         String var3 = var2.toString().replace("-", "");
         this.a(var3);
         return var3;
      }
   }

   private void a(String var1) {
      File var2 = this.a();
      if (!var2.exists()) {
         var2.mkdirs();
      }

      if (!var2.canWrite()) {
         var2 = this.b();
         if (!var2.exists()) {
            var2.mkdirs();
         }
      }

      try {
         FileWriter var3 = new FileWriter(new File(var2, ".manifest2"), false);
         Throwable var4 = null;

         try {
            var3.write(var1);
            var3.flush();
            var3.close();
         } catch (Throwable var20) {
            var4 = var20;
            throw var20;
         } finally {
            if (var3 != null) {
               if (var4 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var19) {
                     var4.addSuppressed(var19);
                  }
               } else {
                  var3.close();
               }
            }
         }
      } catch (IOException var22) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var22.getMessage());
      }

      if (cb.a().equals(cc.a) && this.a != null) {
         try {
            this.a.a(-2147483646, "SOFTWARE\\JavaFx\\Soft\\Installer1");
            this.a.a(-2147483646, "SOFTWARE\\JavaFx\\Soft\\Installer1", "processid", var1);
         } catch (IllegalArgumentException var16) {
            Launcher.a.log(Level.SEVERE, "IllegalArgumentException {0}", var16.getMessage());
         } catch (IllegalAccessException var17) {
            Launcher.a.log(Level.SEVERE, "IllegalAccessException {0}", var17.getMessage());
         } catch (InvocationTargetException var18) {
            Launcher.a.log(Level.SEVERE, "InvocationTargetException {0}", var18.getMessage());
         }
      }
   }

   private String d() {
      if (cb.a().equals(cc.a) && this.a != null) {
         try {
            return this.a.a(-2147483646, "SOFTWARE\\JavaFx\\Soft\\Installer1", "processid");
         } catch (IllegalArgumentException var2) {
            Launcher.a.log(Level.SEVERE, "IllegalArgumentException {0}", var2.getMessage());
         } catch (IllegalAccessException var3) {
            Launcher.a.log(Level.SEVERE, "IllegalAccessException {0}", var3.getMessage());
         } catch (InvocationTargetException var4) {
            Launcher.a.log(Level.SEVERE, "InvocationTargetException {0}", var4.getMessage());
         }
      }

      return null;
   }
}
