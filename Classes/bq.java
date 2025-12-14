import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

public class bq extends Task<bg> {
   private final String a;
   private final String b;
   private final long a;

   public bq(String var1, String var2, long var3) {
      this.a = var1;
      this.a = var3;
      this.b = var2;
   }

   protected bg a() {
      av var1 = new av(Launcher.a.a(), this.a, this.b, this.a);
      return (bg)var1.a("launcher2/index.php", bg.class);
   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.setName("SendReport Thread");
      var1.setDaemon(true);
      var1.start();
   }
}
