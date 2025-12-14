import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

class bm extends Task {
   bm(bl var1, bl var2) {
      this.b = var1;
      this.a = var2;
   }

   protected az a() {
      bb var1;
      if (Launcher.a.b()) {
         var1 = new bb(bl.a(this.a));
      } else {
         ar var2 = new ar(bl.a(this.a), bl.b(this.a), bl.a(this.a));
         var1 = (bb)var2.a("launcher2/index.php", bb.class);
         if (var2.a().equals(be.c)) {
            return null;
         }
      }

      if (var1.a == bf.OK || var1.a == bf.TWOAUTH) {
         var1.a();
      }

      return var1;
   }
}
