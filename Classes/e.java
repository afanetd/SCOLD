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

public class e extends a {
   private g a = g.d;

   public e(File var1) {
      super(var1);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public boolean a(String var1) {
      return var1.contains("Maybe try a lower resolution resourcepack?");
   }

   @Override
   public String a() {
      return Launcher.a("fail.noDriver.reason");
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public boolean b(String var1) {
      if (this.a == g.d) {
         if (var1.contains("GL info: ' Vendor: 'Intel'")) {
            this.a = g.a;
         } else if (var1.contains("GL info: ' Vendor: 'ATI Technologies Inc.'")) {
            this.a = g.c;
         } else if (var1.contains("GL info: ' Vendor: 'NVIDIA Corporation'")) {
            this.a = g.b;
         }
      }

      return this.a != g.d;
   }

   @Override
   public Set<Button> a() {
      LinkedHashSet var1 = new LinkedHashSet();
      Button var2 = new Button();
      var2.setText(Launcher.a("fail.noDriver.button.disable"));
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
      if (this.a != g.d) {
         Button var3 = new Button();
         var3.setText(Launcher.a("fail.noDriver.button.download." + this.a.name()));
         var3.setOnMouseClicked(var1x -> {
            if (var1x.getButton() == MouseButton.PRIMARY) {
               switch (f.a[this.a.ordinal()]) {
                  case 1:
                     ce.a("https://www.intel.ru/content/www/ru/ru/support/articles/000005629/graphics.html");
                     break;
                  case 2:
                     ce.a("https://www.amd.com/ru/support");
                     break;
                  case 3:
                     ce.a("https://www.nvidia.ru/Download/index.aspx?lang=ru");
               }
            }
         });
         var1.add(var3);
      }

      return var1;
   }
}
