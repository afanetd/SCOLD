import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

public class bi extends Task<a> {
   private final File a;
   private File b;
   private boolean a = false;
   private final Set<a> a = new HashSet();

   public bi(File var1) {
      this.a = var1;
      this.a.add(new b(this.a));
      this.a.add(new d(this.a));
      this.a.add(new i(this.a));
      this.a.add(new e(this.a));
      this.a.add(new c(this.a));
   }

   protected a a() {
      for (int var1 = 0; var1 < 5; var1++) {
         if (this.a()) {
            a var2 = this.b();
            var2.a(this.b);
            return var2;
         }

         Thread.sleep(1000L);
      }

      return new h(this.a);
   }

   private boolean a() {
      File var1 = new File(this.a, "crash-reports");
      long var2 = 0L;
      if (var1.exists() && var1.isDirectory()) {
         for (File var7 : var1.listFiles()) {
            if (var7.isFile() && var7.lastModified() > var2) {
               var2 = var7.lastModified();
               this.b = var7;
               this.a = true;
            }
         }
      }

      FilenameFilter var9 = (var0, var1x) -> var1x.startsWith("hs_err_pid");

      for (File var8 : this.a.listFiles(var9)) {
         if (var8.isFile() && var8.lastModified() > var2) {
            var2 = var8.lastModified();
            this.b = var8;
         }
      }

      if (this.b != null && var2 + 60000L > System.currentTimeMillis()) {
         return true;
      } else {
         this.b = null;
         return false;
      }
   }

   private a b() {
      a var1 = null;
      if (this.b.exists() && this.b.isFile() && this.b.canRead()) {
         try {
            FileReader var2 = new FileReader(this.b);
            BufferedReader var3 = new BufferedReader(var2);

            for (String var4 = var3.readLine(); var4 != null; var4 = var3.readLine()) {
               for (a var6 : this.a) {
                  if (var6.a() == this.a) {
                     if (var1 == null) {
                        if (var6.a(var4)) {
                           if (!var6.b()) {
                              return var6;
                           }

                           var1 = var6;
                        }
                     } else if (var1.b(var4)) {
                        return var1;
                     }
                  }
               }
            }
         } catch (FileNotFoundException var7) {
            Launcher.a.log(Level.SEVERE, "FileNotFoundException {0}", var7.getMessage());
         } catch (IOException var8) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var8.getMessage());
         }
      }

      return (a)(var1 != null ? var1 : new h(this.a));
   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.setName("Fail Thread");
      var1.setDaemon(true);
      var1.start();
   }
}
