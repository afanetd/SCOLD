import java.io.File;
import java.util.Collections;
import java.util.Set;
import javafx.scene.control.Button;
import ru.smartycraft.Launcher;

public class h extends a {
   public h(File var1) {
      super(var1);
   }

   @Override
   public boolean a(String var1) {
      return true;
   }

   @Override
   public String a() {
      return Launcher.a("fail.notFound.reason");
   }

   @Override
   public Set<Button> a() {
      return Collections.EMPTY_SET;
   }
}
