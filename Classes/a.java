import java.io.File;
import java.util.Set;
import javafx.scene.control.Button;

public abstract class a {
   private File b = null;
   protected final File a;

   public a(File var1) {
      this.a = var1;
   }

   public abstract boolean a(String var1);

   public boolean a() {
      return false;
   }

   public void a(File var1) {
      this.b = var1;
   }

   public File a() {
      return this.b;
   }

   public abstract String a();

   public abstract Set<Button> a();

   public boolean b() {
      return false;
   }

   public boolean b(String var1) {
      return true;
   }
}
