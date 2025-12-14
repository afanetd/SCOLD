import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
import java.util.logging.Level;
import ru.smartycraft.Launcher;

public class as {
   private final String a;
   private au a = au.b;
   private ap a = null;
   private HttpURLConnection a;
   private String b;
   private Class a;

   public as(String var1) {
      this.a = var1;
   }

   public void a(au var1) {
      this.a = var1;
   }

   public void a(ap var1) {
      this.a = var1;
   }

   public void a(Class<? extends az> var1) {
      this.a = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public az a() {
      switch (at.a[this.a.ordinal()]) {
         case 1:
            this.b();
            break;
         case 2:
            this.a();
            break;
         case 3:
            this.c();
            break;
         default:
            this.b();
      }

      Gson var1 = new Gson();

      try {
         return var1.fromJson(this.b, this.a);
      } catch (JsonSyntaxException var3) {
         Launcher.a.log(Level.SEVERE, "JsonSyntaxException {0}", var3.getMessage());
         return null;
      }
   }

   private void a() {
      try {
         StringBuilder var1 = new StringBuilder();
         boolean var2 = true;
         if (this.a != null) {
            if (!var2) {
               var1.append("&");
            }

            Gson var3 = new Gson();
            var1.append("action").append("=").append(this.a.a());
            var1.append("&").append("json").append("=").append(URLEncoder.encode(var3.toJson(this.a), "UTF-8"));
            if (this.a.a()) {
               var1.append("&").append("check").append("=").append(this.a.b());
            }
         }

         String var58 = ce.a(this.a);
         Launcher.a.log(Level.INFO, "{0} {1} {2}", new String[]{this.a.name(), var58, var1.toString()});
         URL var4 = new URL(var58);
         this.a = (HttpURLConnection)var4.openConnection(Launcher.a.a());
         this.a.setConnectTimeout(5000);
         this.a.setRequestMethod("POST");
         this.a.setDoInput(true);
         this.a.setRequestProperty("User-Agent", "SMARTYlauncher/3.6.2");
         this.a.setRequestProperty("Content-length", String.valueOf(var1.toString().length()));
         this.a.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         this.a.setRequestProperty("Content-Language", "en-US");
         this.a.setDoOutput(true);
         DataOutputStream var5 = new DataOutputStream(this.a.getOutputStream());
         Throwable var6 = null;

         try {
            var5.writeBytes(var1.toString());
         } catch (Throwable var50) {
            var6 = var50;
            throw var50;
         } finally {
            if (var5 != null) {
               if (var6 != null) {
                  try {
                     var5.close();
                  } catch (Throwable var49) {
                     var6.addSuppressed(var49);
                  }
               } else {
                  var5.close();
               }
            }
         }

         StringBuilder var59 = new StringBuilder();
         DataInputStream var60 = new DataInputStream(this.a.getInputStream());
         Throwable var7 = null;

         try {
            for (int var8 = var60.read(); var8 != -1; var8 = var60.read()) {
               var59.append((char)var8);
            }
         } catch (Throwable var51) {
            var7 = var51;
            throw var51;
         } finally {
            if (var60 != null) {
               if (var7 != null) {
                  try {
                     var60.close();
                  } catch (Throwable var48) {
                     var7.addSuppressed(var48);
                  }
               } else {
                  var60.close();
               }
            }
         }

         Launcher.a
            .log(
               Level.INFO,
               "{0}\nResponse Code:{1}, Response Message:{2}",
               new Object[]{var59.toString(), this.a.getResponseCode(), this.a.getResponseMessage()}
            );
         this.b = var59.toString();
      } catch (MalformedURLException var54) {
         Launcher.a.log(Level.SEVERE, "MalformedURLException {0}", var54.getMessage());
      } catch (ProtocolException var55) {
         Launcher.a.log(Level.SEVERE, "ProtocolException {0}", var55.getMessage());
      } catch (IOException var56) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var56.getMessage());
         if (ce.a) {
            Launcher.a.log(Level.SEVERE, "Connection failed. Try disable SSL.");
            ce.a = false;
            this.a();
         } else if (!Launcher.a.e()) {
            Launcher.a.log(Level.SEVERE, "Connection failed. Try connection with proxy.");
            ce.a = true;
            Launcher.a.q();
            this.a();
         }
      } finally {
         this.a.disconnect();
      }
   }

   private void b() {
      try {
         StringBuilder var1 = new StringBuilder();
         boolean var2 = true;
         if (this.a != null) {
            if (!var2) {
               var1.append("&");
            }

            Gson var3 = new Gson();
            var1.append("action").append("=").append(this.a.a());
            var1.append("&").append("json").append("=").append(URLEncoder.encode(var3.toJson(this.a), "UTF-8"));
            if (this.a.a()) {
               var1.append("&").append("check").append("=").append(this.a.b());
            }
         }

         String var35 = ce.a(this.a + "?" + var1.toString());
         Launcher.a.log(Level.INFO, "{0} {1}", new String[]{this.a.name(), var35});
         URL var4 = new URL(var35);
         this.a = (HttpURLConnection)var4.openConnection(Launcher.a.a());
         this.a.setConnectTimeout(5000);
         this.a.setRequestMethod("GET");
         this.a.setDoInput(true);
         this.a.setRequestProperty("User-Agent", "SMARTYlauncher/3.6.2");
         StringBuilder var5 = new StringBuilder();
         DataInputStream var6 = new DataInputStream(this.a.getInputStream());
         Throwable var7 = null;

         try {
            for (int var8 = var6.read(); var8 != -1; var8 = var6.read()) {
               var5.append((char)var8);
            }
         } catch (Throwable var29) {
            var7 = var29;
            throw var29;
         } finally {
            if (var6 != null) {
               if (var7 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var28) {
                     var7.addSuppressed(var28);
                  }
               } else {
                  var6.close();
               }
            }
         }

         Launcher.a
            .log(
               Level.INFO, "{0}\nResponse Code:{1}, Response Message:{2}", new Object[]{var5.toString(), this.a.getResponseCode(), this.a.getResponseMessage()}
            );
         this.b = var5.toString();
      } catch (MalformedURLException var31) {
         Launcher.a.log(Level.SEVERE, "MalformedURLException {0}", var31.getMessage());
      } catch (ProtocolException var32) {
         Launcher.a.log(Level.SEVERE, "ProtocolException {0}", var32.getMessage());
      } catch (IOException var33) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var33.getMessage());
      } finally {
         this.a.disconnect();
      }
   }

   private void c() {
      try {
         String var1 = ce.a(this.a);
         Launcher.a.log(Level.INFO, "{0} {1}", new String[]{this.a.name(), var1});
         URL var2 = new URL(var1);
         this.a = (HttpURLConnection)var2.openConnection(Launcher.a.a());
         this.a.setConnectTimeout(5000);
         this.a.setRequestMethod("POST");
         this.a.setDoInput(true);
         this.a.setRequestProperty("User-Agent", "SMARTYlauncher/3.6.2");
         this.a.setDoOutput(true);
         String var3 = "----------------------" + a(1000000L, 9999999L) + a(1000000L, 9999999L) + a(1000000L, 9999999L);
         this.a.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + var3);
         OutputStream var4 = this.a.getOutputStream();

         try {
            var4.write("--".getBytes());
            var4.write(var3.getBytes());
            var4.write("\r\n".getBytes());
            var4.write("Content-Disposition: form-data; name=\"".getBytes());
            var4.write("action".getBytes());
            var4.write(34);
            var4.write("\r\n".getBytes());
            var4.write("\r\n".getBytes());
            var4.write(this.a.a().getBytes());
            var4.write("\r\n".getBytes());
            Gson var5 = new Gson();
            String var6 = var5.toJson(this.a);
            var4.write("--".getBytes());
            var4.write(var3.getBytes());
            var4.write("\r\n".getBytes());
            var4.write("Content-Disposition: form-data; name=\"".getBytes());
            var4.write("json".getBytes());
            var4.write(34);
            var4.write("\r\n".getBytes());
            var4.write("\r\n".getBytes());
            var4.write(var6.getBytes());
            var4.write("\r\n".getBytes());
            if (this.a.a()) {
               var4.write("--".getBytes());
               var4.write(var3.getBytes());
               var4.write("\r\n".getBytes());
               var4.write("Content-Disposition: form-data; name=\"".getBytes());
               var4.write("check".getBytes());
               var4.write(34);
               var4.write("\r\n".getBytes());
               var4.write("\r\n".getBytes());
               var4.write(this.a.b().getBytes());
               var4.write("\r\n".getBytes());
            }
         } catch (IOException var31) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var31.getMessage());
         }

         if (!this.a.a().isEmpty()) {
            this.a.a().forEach((var2x, var3x) -> {
               String var4x = var3x.getPath();

               try {
                  FileInputStream var5x = new FileInputStream(var3x);
                  Throwable var6x = null;

                  try {
                     var4.write("--".getBytes());
                     var4.write(var3.getBytes());
                     var4.write("\r\n".getBytes());
                     var4.write("Content-Disposition: form-data; name=\"".getBytes());
                     var4.write(var2x.getBytes());
                     var4.write(34);
                     var4.write("; filename=\"".getBytes());
                     var4.write(var4x.getBytes());
                     var4.write(34);
                     var4.write("\r\n".getBytes());
                     var4.write("Content-Type: ".getBytes());
                     String var7x = URLConnection.guessContentTypeFromName(var4x);
                     if (var7x == null) {
                        var7x = "application/octet-stream";
                     }

                     var4.write(var7x.getBytes());
                     var4.write("\r\n".getBytes());
                     var4.write("\r\n".getBytes());
                     byte[] var8x = new byte[65536];
                     int var9;
                     synchronized (var5x) {
                        while ((var9 = var5x.read(var8x, 0, var8x.length)) >= 0) {
                           var4.write(var8x, 0, var9);
                        }
                     }

                     var4.flush();
                     var4.write("\r\n".getBytes());
                  } catch (Throwable var22) {
                     var6x = var22;
                     throw var22;
                  } finally {
                     if (var5x != null) {
                        if (var6x != null) {
                           try {
                              var5x.close();
                           } catch (Throwable var20) {
                              var6x.addSuppressed(var20);
                           }
                        } else {
                           var5x.close();
                        }
                     }
                  }
               } catch (IOException var24) {
                  Launcher.a.log(Level.SEVERE, "IOException {0}", var24.getMessage());
               }
            });
            var4.write("--".getBytes());
            var4.write(var3.getBytes());
            var4.write("--".getBytes());
            var4.close();
         }

         StringBuilder var38 = new StringBuilder();
         DataInputStream var39 = new DataInputStream(this.a.getInputStream());
         Throwable var7 = null;

         try {
            for (int var8 = var39.read(); var8 != -1; var8 = var39.read()) {
               var38.append((char)var8);
            }
         } catch (Throwable var32) {
            var7 = var32;
            throw var32;
         } finally {
            if (var39 != null) {
               if (var7 != null) {
                  try {
                     var39.close();
                  } catch (Throwable var30) {
                     var7.addSuppressed(var30);
                  }
               } else {
                  var39.close();
               }
            }
         }

         Launcher.a
            .log(
               Level.INFO,
               "{0}\nResponse Code:{1}, Response Message:{2}",
               new Object[]{var38.toString(), this.a.getResponseCode(), this.a.getResponseMessage()}
            );
         this.b = var38.toString();
      } catch (MalformedURLException var34) {
         Launcher.a.log(Level.SEVERE, "MalformedURLException {0}", var34.getMessage());
      } catch (ProtocolException var35) {
         Launcher.a.log(Level.SEVERE, "ProtocolException {0}", var35.getMessage());
      } catch (IOException var36) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var36.getMessage());
      } finally {
         this.a.disconnect();
      }
   }

   private static long a(long var0, long var2) {
      Random var4 = new Random();
      return var0 + Math.abs(var4.nextLong()) % (var2 - (var0 - 1L));
   }
}
