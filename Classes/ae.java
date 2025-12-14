import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.DirectoryChooser;
import javafx.util.Duration;
import ru.smartycraft.Launcher;

public class ae implements Initializable {
   private final Duration a = Duration.millis(150.0);
   @FXML
   private AnchorPane root;
   @FXML
   private AnchorPane background;
   @FXML
   private Button back;
   @FXML
   private Label settingsTitle;
   @FXML
   private Label fullScreenTitle;
   @FXML
   private Label fullScreenDesc;
   @FXML
   private CheckBox fullScreenCheck;
   @FXML
   private Label offlineTitle;
   @FXML
   private Label offlineDesc;
   @FXML
   private CheckBox offlineCheck;
   @FXML
   private Label autoConnectTitle;
   @FXML
   private Label autoConnectDesc;
   @FXML
   private CheckBox autoConnectCheck;
   @FXML
   private Label oneClickTitle;
   @FXML
   private Label oneClickDesc;
   @FXML
   private CheckBox oneClickCheck;
   @FXML
   private Label folderTitle;
   @FXML
   private Label folderDesc;
   @FXML
   private Hyperlink folderPath;
   @FXML
   private Button folderReset;
   @FXML
   private Button folderChoose;
   @FXML
   private Label memoryTitle;
   @FXML
   private Slider memorySlider;
   @FXML
   private Label memoryAutoTitle;
   @FXML
   private CheckBox memoryAutoCheck;
   @FXML
   private FlowPane modalMove;
   @FXML
   private Label modalMoveTitle;
   @FXML
   private Button modalMoveCancel;
   @FXML
   private Button modalMoveConfirm;
   @FXML
   private FlowPane modalMoving;
   @FXML
   private Label modalMovingTitle;
   @FXML
   private Label modalMovingProgress;
   @FXML
   private ProgressBar modalMovingProgressBar;
   @FXML
   private FlowPane modalMessage;
   @FXML
   private Label modalMessageTitle;
   @FXML
   private Button modalMessageButton;
   @FXML
   private Label testModeTitle;
   @FXML
   private Label testModeDesc;
   @FXML
   private CheckBox testModeCheck;
   private final List<String> a = new ArrayList();
   private final List<Integer> b = new ArrayList();
   private File a = null;
   private File b = null;

   public void initialize(URL var1, ResourceBundle var2) {
      ru.smartycraft.b var3 = Launcher.a.a();
      this.a.add("1Gb");
      this.b.add(1024);
      this.a.add("");
      this.b.add(1280);
      this.a.add("1,5Gb");
      this.b.add(1536);
      this.a.add("");
      this.b.add(1792);
      this.a.add("2Gb");
      this.b.add(2048);
      this.a.add("");
      this.b.add(2304);
      this.a.add("2,5Gb");
      this.b.add(2560);
      this.a.add("");
      this.b.add(2816);
      this.a.add("3Gb");
      this.b.add(3072);
      this.a.add("");
      this.b.add(3328);
      this.a.add("3,5Gb");
      this.b.add(3584);
      this.a.add("");
      this.b.add(3840);
      this.a.add("4Gb");
      this.b.add(4096);
      this.a.add("");
      this.b.add(5120);
      this.a.add("6Gb");
      this.b.add(6144);
      this.a.add("");
      this.b.add(7168);
      this.a.add("8Gb");
      this.b.add(8192);
      this.settingsTitle.setText(Launcher.a("settings.title"));
      this.fullScreenTitle.setText(Launcher.a("settings.fullScreenTitle"));
      this.fullScreenDesc.setText(Launcher.a("settings.fullScreenDesc"));
      this.fullScreenCheck.setSelected(var3.b);
      this.testModeTitle.setText(Launcher.a("settings.testModeTitle"));
      this.testModeDesc.setText(Launcher.a("settings.testModeDesc"));
      if (!Launcher.a.d() && !Launcher.a.c()) {
         this.testModeTitle.setVisible(false);
         this.testModeDesc.setVisible(false);
         this.testModeCheck.setVisible(false);
         this.testModeCheck.setSelected(false);
         this.testModeCheck.setDisable(true);
      } else {
         this.testModeCheck.setSelected(Launcher.a.c());
      }

      this.offlineTitle.setText(Launcher.a("settings.offlineTitle"));
      this.offlineDesc.setText(Launcher.a("settings.offlineDesc"));
      this.offlineCheck.setSelected(var3.c || var3.d);
      if (var3.c) {
         this.offlineCheck.setDisable(true);
      }

      if (var3.c || var3.d) {
         this.testModeCheck.setSelected(false);
         this.testModeCheck.setDisable(true);
      }

      this.autoConnectTitle.setText(Launcher.a("settings.autoConnectTitle"));
      this.autoConnectDesc.setText(Launcher.a("settings.autoConnectDesc"));
      this.autoConnectCheck.setSelected(var3.f);
      this.oneClickTitle.setText(Launcher.a("settings.oneClickTitle"));
      this.oneClickDesc.setText(Launcher.a("settings.oneClickDesc"));
      this.oneClickCheck.setSelected(var3.g);
      this.folderTitle.setText(Launcher.a("settings.folderTitle"));
      this.folderDesc.setText(Launcher.a("settings.folderDesc"));
      this.folderChoose.setText(Launcher.a("settings.folderChoose"));
      this.folderPath.setText(Launcher.a.a().c);
      this.folderReset.setTooltip(new Tooltip(Launcher.a("settings.folderResetTooltip")));
      if (ru.smartycraft.b.b().getAbsolutePath().toLowerCase().equals(Launcher.a.a().c.toLowerCase())) {
         this.folderReset.setVisible(false);
      }

      this.memoryTitle.setText(Launcher.a("settings.memoryTitle"));
      if (cb.b() == 64) {
         this.memoryAutoTitle.setText(Launcher.a("settings.memoryAutoTitle"));
      } else {
         this.memoryAutoTitle.setText(Launcher.a("settings.memoryAutoTitle32"));
         this.memorySlider.setDisable(true);
      }

      this.memorySlider.setMax(this.a.size() - 1);
      int var4 = 0;
      double var5 = AnchorPane.getLeftAnchor(this.memorySlider);
      double var7 = AnchorPane.getRightAnchor(this.memorySlider);
      double var9 = (this.root.getPrefWidth() - AnchorPane.getLeftAnchor(this.background) - var5 - var7 - 15.0) / (this.a.size() - 1);

      for (int var11 = 0; var11 < this.a.size(); var11++) {
         Label var12 = new Label();
         var12.setText((String)this.a.get(var11));
         var12.getStyleClass().add("settings__menu_desc");
         var12.setAlignment(Pos.CENTER);
         var12.setPrefWidth(50.0);
         this.background.getChildren().add(var12);
         AnchorPane.setLeftAnchor(var12, var5 + var9 * var11 - 20.0);
         AnchorPane.setTopAnchor(var12, AnchorPane.getTopAnchor(this.memorySlider) + 20.0);
         int var13;
         if (var3.h) {
            var13 = cb.c();
         } else {
            var13 = var3.a;
         }

         if (var13 > cb.a(var3.h)) {
            var13 = cb.a(var3.h);
         }

         if ((Integer)this.b.get(var11) <= var13) {
            var4 = var11;
         }
      }

      this.memorySlider.setValue(var4);
      this.memoryAutoCheck.setSelected(var3.h);
      if (var3.h) {
         this.memorySlider.setDisable(true);
      }

      this.modalMove.setVisible(false);
      this.modalMoveTitle.setText(Launcher.a("settings.modalMoveTitle"));
      this.modalMoveCancel.setText(Launcher.a("settings.modalMoveCancel"));
      this.modalMoveConfirm.setText(Launcher.a("settings.modalMoveConfirm"));
      this.modalMoving.setVisible(false);
      this.modalMovingTitle.setText(Launcher.a("settings.modalMovingTitle"));
      this.modalMessage.setVisible(false);
      FadeTransition var14 = new FadeTransition(this.a, this.root);
      var14.setFromValue(0.0);
      var14.setToValue(1.0);
      TranslateTransition var15 = new TranslateTransition(this.a, this.root);
      var15.setFromX(500.0);
      var15.setToX(0.0);
      ParallelTransition var16 = new ParallelTransition();
      var16.getChildren().addAll(new Animation[]{var14, var15});
      var16.setCycleCount(1);
      var16.play();
   }

   @FXML
   private void clickBack(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         this.a();
      }
   }

   @FXML
   private void clickChoose(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         ru.smartycraft.b var2 = Launcher.a.a();
         DirectoryChooser var3 = new DirectoryChooser();
         File var4 = new File(var2.c);
         if (!var4.exists()) {
            var4 = ru.smartycraft.b.b();
         }

         var3.setInitialDirectory(var4);
         File var5 = var3.showDialog(Launcher.a.a());
         if (var5 != null) {
            this.a(var5);
         }
      }
   }

   @FXML
   private void clickClientFolderReset(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         ru.smartycraft.b var2 = Launcher.a.a();
         new File(var2.c);
         this.a(ru.smartycraft.b.b());
      }
   }

   @FXML
   private void clickFolderOpen(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         ru.smartycraft.b var2 = Launcher.a.a();
         File var3 = new File(var2.c);
         if (!var3.exists()) {
            this.clickClientFolderReset(var1);
         } else if (Desktop.isDesktopSupported()) {
            Desktop var4 = Desktop.getDesktop();

            try {
               var4.open(var3);
            } catch (IOException var6) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var6.getMessage());
            }
         }
      }
   }

   @FXML
   private void clickSettingsFullscreen() {
      Launcher.a.a().b = this.fullScreenCheck.isSelected();
   }

   @FXML
   private void clickSettingsOffline() {
      Launcher.a.a().d = this.offlineCheck.isSelected();
      if (Launcher.a.d()) {
         if (this.offlineCheck.isSelected()) {
            this.testModeCheck.setSelected(false);
            this.testModeCheck.setDisable(true);
            Launcher.a.a(false);
         } else {
            this.testModeCheck.setDisable(false);
         }
      }
   }

   @FXML
   private void clickSettingsAutoConnect() {
      Launcher.a.a().f = this.autoConnectCheck.isSelected();
   }

   @FXML
   private void clickSettingsOneClick() {
      Launcher.a.a().g = this.oneClickCheck.isSelected();
   }

   @FXML
   private void clickSettingsTestMode() {
      Launcher.a.a(this.testModeCheck.isSelected());
   }

   @FXML
   private void clickSettingsMemoryAuto() {
      Launcher.a.a().h = this.memoryAutoCheck.isSelected();
      if (cb.b() == 64) {
         this.memorySlider.setDisable(this.memoryAutoCheck.isSelected());
         int var1 = 0;
         int var2;
         if (this.memoryAutoCheck.isSelected()) {
            var2 = cb.c();
         } else {
            var2 = Launcher.a.a().a;
         }

         if (var2 > cb.a(true)) {
            var2 = cb.a(true);
         }

         for (int var3 = 0; var3 < this.b.size(); var3++) {
            if ((Integer)this.b.get(var3) <= var2) {
               var1 = var3;
            }
         }

         this.memorySlider.setValue(var1);
      } else {
         this.memorySlider.setValue(0.0);
      }
   }

   @FXML
   private void slideMemory(MouseEvent var1) {
      ru.smartycraft.b var2 = Launcher.a.a();
      var2.a = (Integer)this.b.get((int)this.memorySlider.getValue());
   }

   private void a(File var1) {
      ru.smartycraft.b var2 = Launcher.a.a();
      if (!new File(var2.c).equals(var1)) {
         this.a = var1;
         this.b = new File(var2.c);
         this.modalMove.setVisible(true);
         this.folderReset.setVisible(!ru.smartycraft.b.b().equals(var1));
         this.folderPath.setText(var1.getAbsolutePath());
         var2.c = var1.getAbsolutePath();
         var2.a();
      }
   }

   @FXML
   private void modalMoveCancel(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         this.modalMove.setVisible(false);
         this.a = null;
         this.b = null;
      }
   }

   @FXML
   private void modalMoveConfirm(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         this.modalMove.setVisible(false);
         this.modalMoving.setVisible(true);
         bn var2 = new bn(this.b, this.a);
         this.modalMovingProgress.textProperty().bind(var2.messageProperty());
         this.modalMovingProgressBar.progressProperty().bind(var2.progressProperty());
         var2.a();
         var2.setOnSucceeded(var2x -> {
            this.modalMoving.setVisible(false);
            switch (af.a[((bo)var2.getValue()).ordinal()]) {
               case 1:
               default:
                  break;
               case 2:
                  this.modalMessageButton.setText(Launcher.a("settings.modalMessageButton.OK"));
                  this.modalMessageTitle.setText(Launcher.a("settings.modalMessageTitle.noSpace"));
                  this.modalMessage.setVisible(true);
                  break;
               case 3:
                  this.modalMessageButton.setText(Launcher.a("settings.modalMessageButton.OK"));
                  this.modalMessageTitle.setText(Launcher.a("settings.modalMessageTitle.noPermissions"));
                  this.modalMessage.setVisible(true);
                  break;
               case 4:
                  this.modalMessageButton.setText(Launcher.a("settings.modalMessageButton.OK"));
                  this.modalMessageTitle.setText(Launcher.a("settings.modalMessageTitle.isChildren"));
                  this.modalMessage.setVisible(true);
            }
         });
      }
   }

   @FXML
   private void modalMessageButton(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         this.modalMessage.setVisible(false);
      }
   }

   private void a() {
      Launcher.a.a().a();
      FadeTransition var1 = new FadeTransition(this.a, this.root);
      var1.setFromValue(1.0);
      var1.setToValue(0.0);
      TranslateTransition var2 = new TranslateTransition(this.a, this.root);
      var2.setFromX(0.0);
      var2.setToX(500.0);
      ParallelTransition var3 = new ParallelTransition();
      var3.getChildren().addAll(new Animation[]{var1, var2});
      var3.setCycleCount(1);
      var3.play();
      var3.setOnFinished(var0 -> Launcher.a.e());
   }

   public void a(KeyEvent var1) {
      if (var1.getCode() == KeyCode.ESCAPE) {
         this.a();
      }
   }
}
