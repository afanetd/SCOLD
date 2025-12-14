import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Level;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import ru.smartycraft.Launcher;

public class d extends a {
   public d(File var1) {
      super(var1);
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public boolean a(String var1) {
      return var1.contains("# C  [ig7icd64.dll");
   }

   @Override
   public String a() {
      return Launcher.a("fail.intelDriver.reason");
   }

   @Override
   public Set<Button> a() {
      LinkedHashSet var1 = new LinkedHashSet();
      Button var2 = new Button();
      var2.setText(Launcher.a("fail.intelDriver.button.disable"));
      var2.setOnMouseClicked(var1x -> {
         if (var1x.getButton() == MouseButton.PRIMARY) {
            FileReader var2x = null;
            BufferedReader var3x = null;
            BufferedWriter var4 = null;
            StringBuilder var5 = new StringBuilder();
            boolean var6 = false;
            File var7 = new File(this.a, "options.txt");
            if (var7.exists()) {
               try {
                  var2x = new FileReader(var7);
                  var3x = new BufferedReader(var2x);

                  while (var3x.ready()) {
                     String var8 = var3x.readLine();
                     if (var8.contains("resourcePacks:")) {
                        var8 = "resourcePacks:[]";
                        var6 = true;
                     }

                     var5.append(var8).append(System.getProperty("line.separator"));
                  }
               } catch (IOException var35) {
                  Launcher.a.log(Level.SEVERE, "IOException {0}", var35.getMessage());
               } finally {
                  try {
                     if (var3x != null) {
                        var3x.close();
                     }

                     if (var2x != null) {
                        var2x.close();
                     }
                  } catch (IOException var32) {
                     Launcher.a.log(Level.SEVERE, "IOException {0}", var32.getMessage());
                  }
               }

               if (var6) {
                  try {
                     var4 = new BufferedWriter(new FileWriter(var7));
                     var4.write(var5.toString());
                  } catch (IOException var33) {
                     Launcher.a.log(Level.SEVERE, "IOException {0}", var33.getMessage());
                  } finally {
                     try {
                        if (var4 != null) {
                           var4.flush();
                           var4.close();
                        }
                     } catch (IOException var31) {
                        Launcher.a.log(Level.SEVERE, "IOException {0}", var31.getMessage());
                     }
                  }
               }
            }

            Launcher.a.m();
         }
      });
      var1.add(var2);
      if (cb.a() == cc.a) {
         Button var3 = new Button();
         var3.setText(Launcher.a("fail.intelDriver.button.download"));
         var3.setOnMouseClicked(var0 -> {
            if (var0.getButton() == MouseButton.PRIMARY) {
               ce.a("https://www.intel.ru/content/www/ru/ru/support/articles/000005629/graphics.html");
            }
         });
         var1.add(var3);
      }

      return var1;
   }
}
