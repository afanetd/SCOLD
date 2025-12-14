import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

public class bn extends Task<bo> {
   private File a;
   private File b;
   private int a = 0;
   private int b = 0;
   private long a = 0L;
   private Set<String> a = new HashSet();

   public bn(File var1, File var2) {
      this.b = var1;
      this.a = var2;
   }

   protected bo a() {
      this.updateProgress(0L, 0L);
      this.updateMessage(Launcher.a("settings.modalMovingProgress.Analysis"));
      if (!this.a.canWrite()) {
         return bo.c;
      } else {
         this.c();
         if (this.a > this.a.getFreeSpace()) {
            return bo.b;
         } else {
            for (String var2 : this.a) {
               if ((this.b.getAbsolutePath() + File.separator + var2).startsWith(this.a.getAbsolutePath())) {
                  return bo.d;
               }
            }

            this.b();
            return bo.a;
         }
      }
   }

   private void b() {
      for (File var4 : this.b.listFiles()) {
         if (var4.isDirectory() && this.a.contains(var4.getName())) {
            this.a(var4, File.separator + var4.getName());
            if (var4.listFiles().length == 0) {
               var4.delete();
            }
         }
      }
   }

   private void a(File var1, String var2) {
      for (File var6 : var1.listFiles()) {
         if (var6.isDirectory()) {
            this.a(var6, var2 + File.separator + var6.getName());
            if (var6.listFiles().length == 0) {
               var6.delete();
            }
         } else {
            File var7 = new File(this.a, var2 + File.separator + var6.getName());
            var7.getParentFile().mkdirs();

            try {
               FileInputStream var8 = new FileInputStream(var6);
               FileOutputStream var9 = new FileOutputStream(var7);
               byte[] var10 = new byte[1024];

               int var11;
               while ((var11 = var8.read(var10)) > 0) {
                  var9.write(var10, 0, var11);
               }

               var8.close();
               var9.close();
               var6.delete();
            } catch (IOException var12) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var12.getMessage());
            }

            this.b++;
            this.updateMessage(Launcher.a("settings.modalMovingProgress.Moving") + " (" + this.b + "/" + this.a + ")");
            this.updateProgress(this.b, this.a);
            this.a = this.a + var6.length();
         }
      }
   }

   private void c() {
      this.a.add("bin");
      ru.smartycraft.b var1 = Launcher.a.a();
      var1.b.forEach((var1x, var2) -> {
         this.a.add(var1x);
         this.a.add(var2.d().equals("1.7.10") ? "assets" : "assets-" + var2.d());
         this.a.add(var2.d().equals("1.7.10") ? "libraries" : "libraries-" + var2.d());
      });

      for (File var5 : this.b.listFiles()) {
         if (var5.isDirectory() && this.a.contains(var5.getName())) {
            this.a(var5);
         }
      }
   }

   private void a(File var1) {
      for (File var5 : var1.listFiles()) {
         if (var5.isDirectory()) {
            this.a(var5);
         } else {
            this.a++;
         }
      }

      this.updateMessage(Launcher.a("settings.modalMovingProgress.Analysis") + " (0/" + this.a + ")");
   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.setName("Mover Thread");
      var1.setDaemon(true);
      var1.start();
   }
}
