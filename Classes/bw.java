import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

public class bw extends Task<ac> {
   private ru.smartycraft.a a;
   private ac a;

   public bw(ru.smartycraft.a var1) {
      this.a = var1;
      this.a = ac.a;
   }

   protected ac a() {
      this.updateValue(ac.a);
      this.updateMessage(Launcher.a("progress.master.checkClient"));
      if (!Launcher.a.b()) {
         this.a.a();
         if (!this.a.b()) {
            this.updateMessage(Launcher.a("prepare.error.deleting"));
            return ac.h;
         }

         int var1 = this.a.a();
         if (var1 > 0) {
            this.updateValue(ac.b);
            this.updateTitle(Launcher.a("progress.master.updateClient"));
            this.updateMessage(Launcher.a("progress.master.checkClient"));
            ru.smartycraft.m var2 = new ru.smartycraft.m(this, this.a);
            var2.a();
         }
      } else if (!this.a.a()) {
         this.updateMessage(Launcher.a("prepare.error.clienCorrupted"));
         return ac.h;
      }

      return ac.e;
   }

   public void a(long var1, long var3) {
      this.updateProgress(var1, var3);
   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.setName("Updater Thread");
      var1.setDaemon(true);
      var1.start();
   }

   public void a(ac var1) {
      this.a = var1;
      this.updateValue(this.a);
   }

   public void a(String var1) {
      this.updateTitle(var1);
   }

   public void b(String var1) {
      this.updateMessage(var1);
   }
}
