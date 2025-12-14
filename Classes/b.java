import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import ru.smartycraft.Launcher;

public class b extends a {
   public b(File var1) {
      super(var1);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public boolean a(String var1) {
      return var1.equals("java.lang.IllegalStateException: Already tesselating!");
   }

   @Override
   public String a() {
      return Launcher.a("fail.alreadyTesselated.reason");
   }

   @Override
   public Set<Button> a() {
      Button var1 = new Button();
      var1.setText(Launcher.a("fail.alreadyTesselated.button.fix"));
      var1.setOnMouseClicked(var1x -> {
         if (var1x.getButton() == MouseButton.PRIMARY) {
            File var2x = new File(this.a, "optionsof.txt");
            by.a(var2x, "ofChunkLoading:", "ofChunkLoading:0");
            Launcher.a.m();
         }
      });
      LinkedHashSet var2 = new LinkedHashSet();
      var2.add(var1);
      return var2;
   }
}
