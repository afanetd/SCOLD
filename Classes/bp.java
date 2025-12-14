import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

public class bp extends Task<String> {
   private final File a;

   public bp(File var1) {
      this.a = var1;
   }

   protected String a() {
      StringBuilder var1 = new StringBuilder();
      var1.append("api_option=paste");
      var1.append("&").append("api_paste_private=").append("1");
      var1.append("&").append("api_paste_name=").append(this.a.getName());
      var1.append("&").append("api_paste_expire_date=").append("1W");
      var1.append("&").append("api_dev_key=").append("bhY5gAjqp5Jh6jK6VoNxFxTb8jhadP1U");
      var1.append("&").append("api_paste_code=");

      try {
         FileReader var2 = new FileReader(this.a);
         BufferedReader var3 = new BufferedReader(var2);

         for (String var4 = var3.readLine(); var4 != null; var4 = var3.readLine()) {
            var1.append(var4).append("\n");
         }
      } catch (FileNotFoundException var36) {
         Launcher.a.log(Level.SEVERE, "FileNotFoundException {0}", var36.getMessage());
      } catch (IOException var37) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var37.getMessage());
      }

      URL var38 = new URL("https://pastebin.com/api/api_post.php");
      HttpURLConnection var39 = (HttpURLConnection)var38.openConnection();
      var39.setRequestMethod("POST");
      var39.setDoInput(true);
      var39.setRequestProperty("User-Agent", "SMARTYlauncher/3.6.2");
      var39.setRequestProperty("Content-length", String.valueOf(var1.toString().length()));
      var39.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      var39.setRequestProperty("Content-Language", "en-US");
      var39.setDoOutput(true);
      DataOutputStream var40 = new DataOutputStream(var39.getOutputStream());
      Throwable var5 = null;

      try {
         var40.writeBytes(var1.toString());
      } catch (Throwable var32) {
         var5 = var32;
         throw var32;
      } finally {
         if (var40 != null) {
            if (var5 != null) {
               try {
                  var40.close();
               } catch (Throwable var31) {
                  var5.addSuppressed(var31);
               }
            } else {
               var40.close();
            }
         }
      }

      StringBuilder var41 = new StringBuilder();
      DataInputStream var42 = new DataInputStream(var39.getInputStream());
      Throwable var6 = null;

      try {
         for (int var7 = var42.read(); var7 != -1; var7 = var42.read()) {
            var41.append((char)var7);
         }
      } catch (Throwable var34) {
         var6 = var34;
         throw var34;
      } finally {
         if (var42 != null) {
            if (var6 != null) {
               try {
                  var42.close();
               } catch (Throwable var30) {
                  var6.addSuppressed(var30);
               }
            } else {
               var42.close();
            }
         }
      }

      Launcher.a
         .log(Level.INFO, "{0}\nResponse Code:{1}, Response Message:{2}", new Object[]{var41.toString(), var39.getResponseCode(), var39.getResponseMessage()});
      return var41.toString();
   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.setName("Pastebin Thread");
      var1.setDaemon(true);
      var1.start();
   }
}
