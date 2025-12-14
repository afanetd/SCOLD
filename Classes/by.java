import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import ru.smartycraft.Launcher;

public class by {
   public static boolean a(File var0) {
      if (!var0.exists()) {
         return true;
      } else if (!var0.isDirectory()) {
         return var0.delete();
      } else {
         for (File var4 : var0.listFiles()) {
            a(var4);
         }

         return var0.delete();
      }
   }

   public static void a(File var0, String var1, String var2) {
      FileReader var3 = null;
      BufferedReader var4 = null;
      BufferedWriter var5 = null;
      StringBuilder var6 = new StringBuilder();
      boolean var7 = false;
      if (var0.exists()) {
         try {
            var3 = new FileReader(var0);
            var4 = new BufferedReader(var3);

            while (var4.ready()) {
               String var8 = var4.readLine();
               if (var8.contains(var1)) {
                  var8 = var2;
                  var7 = true;
               }

               var6.append(var8).append(System.getProperty("line.separator"));
            }
         } catch (IOException var35) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var35.getMessage());
         } finally {
            try {
               if (var4 != null) {
                  var4.close();
               }

               if (var3 != null) {
                  var3.close();
               }
            } catch (IOException var32) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var32.getMessage());
            }
         }

         if (var7) {
            try {
               var5 = new BufferedWriter(new FileWriter(var0));
               var5.write(var6.toString());
            } catch (IOException var33) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var33.getMessage());
            } finally {
               try {
                  if (var5 != null) {
                     var5.flush();
                     var5.close();
                  }
               } catch (IOException var31) {
                  Launcher.a.log(Level.SEVERE, "IOException {0}", var31.getMessage());
               }
            }
         }
      }
   }
}
