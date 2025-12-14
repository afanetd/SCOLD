import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

public class bj extends Task<ba> {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected ba a() {
      this.updateTitle(Launcher.a("loader.readConfig"));
      Launcher.a.a();
      if (cb.a() == cc.a) {
         this.updateTitle(Launcher.a("loader.addFireWallRule"));
         cb.a();
      }

      this.updateTitle(Launcher.a("loader.loadServerList"));
      aq var1 = new aq();
      ba var2 = (ba)var1.a("launcher2/index.php", ba.class);
      if (var2.a && Launcher.a.a().a) {
         this.updateTitle(Launcher.a("loader.testModeOn"));
         Launcher.a.a(true);
         ba var3 = (ba)var1.a("launcher2/index.php", ba.class);
         if (var3 == null) {
            Launcher.a.a(false);
            Launcher.a.a().a();
         } else {
            var2 = var3;
         }
      }

      switch (bk.a[var2.a.ordinal()]) {
         case 1:
            this.updateTitle(Launcher.a("loader.loadStyle"));
            Launcher.a.a().a();
            this.updateTitle(Launcher.a("loader.loadNews"));
            var2.b.forEach(var0 -> var0.a());
            break;
         case 2:
            this.updateTitle(Launcher.a("loader.loadStyle"));
            Launcher.a.a().a();
            this.updateTitle(Launcher.a("loader.loadNews"));
            var2.b.forEach(var0 -> var0.a());
            break;
         case 3:
            this.updateTitle(Launcher.a("loader.getUpdate"));
            Thread.sleep(500L);
      }

      return var2;
   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.setName("Loader Thread");
      var1.setDaemon(true);
      var1.start();
   }
}
