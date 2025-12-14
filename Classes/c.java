import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import ru.smartycraft.Launcher;

public class c extends a {
   public c(File var1) {
      super(var1);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public boolean a(String var1) {
      return var1.contains(
         "java.lang.IllegalArgumentException: Cannot get property PropertyEnum{name=variant, clazz=class vazkii.botania.api.state.enums.PoolVariant, values=[DEFAULT, CREATIVE, DILUTED, FABULOUS]}"
      );
   }

   @Override
   public String a() {
      return Launcher.a("fail.botaniaVoxelMap.reason");
   }

   @Override
   public Set<Button> a() {
      LinkedHashSet var1 = new LinkedHashSet();
      Button var2 = new Button();
      var2.setText(Launcher.a("fail.splachScreen.button.setXaerosMap"));
      var2.setOnMouseClicked(
         var0 -> {
            if (var0.getButton() == MouseButton.PRIMARY) {
               if (Launcher.a.a().a().containsKey("VoxelMap")
                  && Launcher.a.a().a().containsKey("XaerosMinimap")
                  && ((ru.smartycraft.j)Launcher.a.a().a().get("VoxelMap")).a()) {
                  ((ru.smartycraft.j)Launcher.a.a().a().get("VoxelMap")).a(false);
                  ((ru.smartycraft.j)Launcher.a.a().a().get("XaerosMinimap")).a(true);
                  Launcher.a.a().a();
               }

               Launcher.a.l();
               Launcher.a.m();
            }
         }
      );
      var1.add(var2);
      Button var3 = new Button();
      var3.setText(Launcher.a("fail.splachScreen.button.setVoxelMap"));
      var3.setOnMouseClicked(var1x -> {
         if (var1x.getButton() == MouseButton.PRIMARY) {
            File var2x = new File(this.a, "config" + File.separator + "voxelmap.properties");
            by.a(var2x, "Block Transparency:", "Block Transparency:false");
            File var3x = new File(this.a, "config" + File.separator + "forge.cfg");
            by.a(var3x, "B:removeErroringTileEntities", "    B:removeErroringTileEntities=true");
            Launcher.a.m();
         }
      });
      var1.add(var3);
      return var1;
   }
}
