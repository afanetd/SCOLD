package ru.smartycraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class b {
   @SerializedName("playername")
   public String a;
   @SerializedName("password")
   public String b;
   @SerializedName("clientDir")
   public String c;
   @SerializedName("lastSkinDir")
   public String d;
   @SerializedName("lastServer")
   public String e;
   @SerializedName("testModeKey")
   public String f;
   @SerializedName("testMode")
   public boolean a = false;
   @SerializedName("checkSums")
   public Map<String, String> a = new HashMap();
   @SerializedName("clients")
   public Map<String, ru.smartycraft.i> b = new HashMap();
   @SerializedName("userFullscreen")
   public boolean b = false;
   public transient boolean c = false;
   @SerializedName("userOffline")
   public boolean d = false;
   public transient boolean e = false;
   @SerializedName("userAutoConnect")
   public boolean f = true;
   @SerializedName("userOneClick")
   public boolean g = false;
   @SerializedName("userMemoryAuto")
   public boolean h = true;
   @SerializedName("userMemoryValue")
   public int a = 1024;
   @SerializedName("useG1GC")
   public boolean i = false;
   @SerializedName("skins")
   public HashMap<String, Integer> a = new HashMap();
   @SerializedName("capes")
   public HashMap<String, Integer> b = new HashMap();

   public b() {
      this.c = b().getAbsolutePath();
   }

   public static ru.smartycraft.b a() {
      Launcher.a.log(Level.FINE, "Reading Config File...");
      File var0 = a();
      if (!var0.exists()) {
         Launcher.a.log(Level.FINE, "Config dir not found. Creating directory {0}", var0.getAbsolutePath());
         var0.mkdir();
      }

      File var1 = new File(var0 + File.separator + ".config");
      if (var1.exists()) {
         try {
            label128: {
               FileReader var2 = new FileReader(var1);
               Throwable var3 = null;

               ru.smartycraft.b var8;
               try {
                  String var4 = new String();

                  int var5;
                  while ((var5 = var2.read()) != -1) {
                     var4 = var4 + (char)var5;
                  }

                  Gson var6 = new Gson();
                  ru.smartycraft.b var7 = var6.fromJson(var4, ru.smartycraft.b.class);
                  if (var7 == null) {
                     break label128;
                  }

                  var8 = var7;
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

               return var8;
            }
         } catch (IOException var22) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var22.getMessage());
         } catch (JsonSyntaxException var23) {
            Launcher.a.log(Level.SEVERE, "JsonSyntaxException {0}", var23.getMessage());
         }

         var1.renameTo(new File(var1.getParentFile(), ".config_backup"));
      } else {
         Launcher.a.log(Level.FINE, "Config file not found");
      }

      return new ru.smartycraft.b();
   }

   public void a() {
      File var1 = a();
      if (!var1.exists()) {
         Launcher.a.log(Level.FINE, "Config dir not found. Creating directory {0}", var1.getAbsolutePath());
         var1.mkdir();
      }

      File var2 = new File(var1 + File.separator + ".config");

      try {
         FileWriter var3 = new FileWriter(var2, false);
         Throwable var4 = null;

         try {
            Gson var5 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            String var6 = var5.toJson(this);
            var3.write(var6);
            var3.flush();
         } catch (Throwable var15) {
            var4 = var15;
            throw var15;
         } finally {
            if (var3 != null) {
               if (var4 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var14) {
                     var4.addSuppressed(var14);
                  }
               } else {
                  var3.close();
               }
            }
         }
      } catch (IOException var17) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var17.getMessage());
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File a() {
      String var0 = System.getProperty("user.home", ".");
      if (null == cb.a()) {
         return new File(var0, ".smrt");
      } else {
         switch (ru.smartycraft.c.a[cb.a().ordinal()]) {
            case 1:
            case 2:
               return new File(var0, ".smrt");
            case 3:
               String var1 = System.getenv("AppData");
               if (var1 != null) {
                  return new File(var1, ".smrt");
               }

               return new File(var0, ".smrt");
            case 4:
               return new File(var0, "Library/Application Support/.smrt");
            default:
               return new File(var0, ".smrt");
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File b() {
      String var0 = System.getProperty("user.home", ".");
      if (null == cb.a()) {
         return new File(var0, ".smarty");
      } else {
         switch (ru.smartycraft.c.a[cb.a().ordinal()]) {
            case 1:
            case 2:
               return new File(var0, ".smarty");
            case 3:
               String var1 = System.getenv("AppData");
               if (var1 != null) {
                  return new File(var1, ".smarty");
               }

               return new File(var0, ".smarty");
            case 4:
               return new File(var0, "Library/Application Support/.smarty");
            default:
               return new File(var0, ".smarty");
         }
      }
   }
}
