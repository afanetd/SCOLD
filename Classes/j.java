import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import ru.smartycraft.Launcher;

public class j implements ad, Initializable {
   @FXML
   private Button run;
   @FXML
   private Button menu;
   @FXML
   private Pane skinFront;
   @FXML
   private Pane skinBack;
   @FXML
   private Label status;
   @FXML
   private Label nickname;
   @FXML
   private Label moneyTitle;
   @FXML
   private Label moneyValue;
   @FXML
   private Hyperlink moneyLink;
   private File a;
   private boolean a = true;
   private ContextMenu a;

   public void initialize(URL var1, ResourceBundle var2) {
      this.run.setText(Launcher.a("cabinet.runGame"));
      this.status.setText(Launcher.a("cabinet.status.skinDesc"));
      ru.smartycraft.h var3 = Launcher.a.a();
      if (var3 != null) {
         this.nickname.setText(Launcher.a("cabinet.nickname") + ", " + var3.a());
         BackgroundImage var4 = new BackgroundImage(
            var3.a(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT
         );
         this.skinFront.setBackground(new Background(new BackgroundImage[]{var4}));
         BackgroundImage var5 = new BackgroundImage(
            var3.b(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT
         );
         this.skinBack.setBackground(new Background(new BackgroundImage[]{var5}));
         this.moneyTitle.setText(Launcher.a("cabinet.moneyTitle"));
         this.moneyValue.setText(" " + var3.a() + " " + ce.a(var3.a(), Launcher.a("utils.coins").split(",")));
         this.moneyLink.setText(Launcher.a("cabinet.moneyLink"));
         this.a = new ContextMenu();
         this.a.getStyleClass().add("cabinet__menu");
         if (Launcher.a.a() != null && !Launcher.a.a().a().isEmpty()) {
            MenuItem var6 = new MenuItem(Launcher.a("cabinet.mods"));
            var6.getStyleClass().add("cabinet__menu-item");
            var6.setOnAction(var0 -> Launcher.a.i());
            this.a.getItems().add(var6);
         }

         MenuItem var8 = new MenuItem(Launcher.a("cabinet.reload"));
         var8.getStyleClass().add("cabinet__menu-item");
         var8.setOnAction(var1x -> {
            Launcher.a.a().e = true;
            this.a();
         });
         if (Launcher.a.a() != null && Launcher.a.a().d().equals("1.12.2")) {
            MenuItem var7 = new MenuItem(Launcher.a("cabinet.spawn"));
            var7.getStyleClass().add("cabinet__menu-item");
            var7.setOnAction(var2x -> {
               ax var3x = new ax(var3, Launcher.a.a().a());
               var3x.a("launcher2/index.php", bg.class);
               this.a();
            });
            this.a.getItems().add(var7);
         }

         MenuItem var9 = new MenuItem(Launcher.a("cabinet.exit"));
         var9.getStyleClass().add("cabinet__menu-item");
         var9.setOnAction(var0 -> Launcher.a.k());
         this.a.getItems().addAll(new MenuItem[]{var8, var9});
      }

      if (Launcher.a.a().d != null) {
         this.a = new File(Launcher.a.a().d);
      }
   }

   @FXML
   private void clickMenu(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         Bounds var2 = this.menu.localToScreen(this.menu.getBoundsInLocal());
         this.a.show(Launcher.a.a(), var2.getMaxX() - 230.0, var2.getMinY() - 30 * this.a.getItems().size());
      }
   }

   @FXML
   private void clickSkin(MouseEvent var1) {
      ru.smartycraft.h var2 = Launcher.a.a();
      if (this.a && var1.getButton() == MouseButton.PRIMARY && var2 != null) {
         FileChooser var3 = new FileChooser();
         if (this.a != null && this.a.exists()) {
            var3.setInitialDirectory(this.a);
         }

         var3.setTitle(Launcher.a("cabinet.skinSelect"));
         var3.getExtensionFilters().addAll(new ExtensionFilter[]{new ExtensionFilter("PNG Files", new String[]{"*.png"})});
         File var4 = var3.showOpenDialog(Launcher.a.a());
         if (var4 != null && var4.exists() && var4.canRead()) {
            this.a = false;
            this.menu.setDisable(true);
            this.run.setDisable(true);
            this.a = var4.getParentFile();
            bs var5 = new bs(this, var2, var4);
            var5.a();
         }
      }
   }

   @FXML
   private void clickRun(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         this.a();
      }
   }

   public void a(KeyEvent var1) {
      if (var1.getCode() == KeyCode.ENTER) {
         this.a();
      } else if (var1.getCode() == KeyCode.ESCAPE) {
         Launcher.a.k();
      }
   }

   private void a() {
      this.a = false;
      this.menu.setDisable(true);
      this.run.setDisable(true);
      Launcher.a.m();
   }

   @FXML
   private void clickMoney(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         String var2 = ce.a("pay");
         ce.a(var2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(az var1) {
      ru.smartycraft.h var2 = Launcher.a.a();
      if (var1 instanceof bg && var2 != null) {
         bg var3 = (bg)var1;
         switch (k.a[var3.a.ordinal()]) {
            case 1:
               this.status.setText(new String());
               Launcher.a.a().d = this.a.getAbsolutePath();
               var2.a(false);
               BackgroundImage var4 = new BackgroundImage(
                  var2.a(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT
               );
               this.skinFront.setBackground(new Background(new BackgroundImage[]{var4}));
               BackgroundImage var5 = new BackgroundImage(
                  var2.b(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT
               );
               this.skinBack.setBackground(new Background(new BackgroundImage[]{var5}));
               break;
            case 2:
               this.status.setText(Launcher.a("cabinet.skinUpload.error"));
               break;
            case 3:
               this.status.setText(Launcher.a("cabinet.skinUpload.badLogin"));
               break;
            case 4:
               this.status.setText(Launcher.a("cabinet.skinUpload.size"));
               break;
            case 5:
               this.status.setText(Launcher.a("cabinet.skinUpload.hd"));
               break;
            case 6:
               this.status.setText(Launcher.a("cabinet.skinUpload.internal"));
         }

         this.a = true;
         this.menu.setDisable(false);
         this.run.setDisable(false);
      }
   }
}
