import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import ru.smartycraft.Launcher;

public class i extends a {
   public i(File var1) {
      super(var1);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public boolean a(String var1) {
      return var1.contains("java.lang.IllegalStateException: Splash thread");
   }

   @Override
   public String a() {
      return Launcher.a("fail.splachScreen.reason");
   }

   @Override
   public Set<Button> a() {
      LinkedHashSet var1 = new LinkedHashSet();
      Button var2 = new Button();
      var2.setText(Launcher.a("fail.splachScreen.button.remove"));
      var2.setOnMouseClicked(var1x -> {
         if (var1x.getButton() == MouseButton.PRIMARY) {
            File var2x = new File(this.a, "config" + File.separator + "splash.properties");
            if (var2x.exists()) {
               var2x.delete();
            }

            Launcher.a.m();
         }
      });
      var1.add(var2);
      return var1;
   }
}
