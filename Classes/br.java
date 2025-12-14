import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javafx.concurrent.Task;
import ru.smartycraft.Launcher;

public class br extends Task<Void> {
   private final ru.smartycraft.i a;

   public br(ru.smartycraft.i var1) {
      this.a = var1;
   }

   protected Void a() {
      try {
         am var1 = new am(this.a.c(), this.a.a());
         ao var2 = var1.a();
         int var3 = var2.a();
         this.updateMessage(Launcher.a("login.serverOnline") + " " + var3 + " " + ce.a(var3, Launcher.a("utils.players").split(",")));
      } catch (UnknownHostException | SocketTimeoutException var4) {
         this.updateMessage(Launcher.a("login.serverOffline"));
      } catch (IOException var5) {
      }

      return null;
   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.setName("ServerCheck Thread");
      var1.setDaemon(true);
      var1.start();
   }
}
