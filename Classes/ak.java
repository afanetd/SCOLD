import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import ru.smartycraft.Launcher;

public class ak extends Thread {
   private final aj a;

   public ak(aj var1) {
      super("Monitor");
      this.a = var1;
   }

   public void run() {
      InputStreamReader var1 = new InputStreamReader(this.a.a().getInputStream());
      BufferedReader var2 = new BufferedReader(var1);

      while (this.a.a()) {
         try {
            String var3;
            try {
               while ((var3 = var2.readLine()) != null) {
                  if (!Launcher.a.a() && (var3.contains("LWJGL Version:") || var3.contains("LWJGL version"))) {
                     this.a.a.a(ac.g);
                  }

                  System.out.println("Client> " + var3);
                  this.a.a().a(var3);
               }
            } catch (IOException var13) {
            }
         } finally {
            try {
               var2.close();
            } catch (IOException var12) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var12.getMessage());
            }
         }
      }

      ai var4 = this.a.a();
      if (var4 != null) {
         var4.a(this.a);
      }
   }
}
