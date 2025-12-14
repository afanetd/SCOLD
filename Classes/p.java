import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import ru.smartycraft.Launcher;

public class p implements Initializable {
   @FXML
   public AnchorPane root;
   @FXML
   public Pane background;
   @FXML
   public Label title;
   @FXML
   public Button minimize;
   @FXML
   public Button exit;
   @FXML
   public Pane newsPane;
   @FXML
   public Pane userPane;
   @FXML
   public Pane statusPane;
   @FXML
   public Pane settingsPane;
   @FXML
   public Pane progressPane;
   @FXML
   public FlowPane modalBackground;
   @FXML
   public VBox modalWindow;
   @FXML
   public Label modalTitle;
   @FXML
   public Label modalText;
   @FXML
   public Button modalOK;
   @FXML
   public Button modalCancel;
   private r a;
   private double a;
   private double b;
   private final Duration a;

   public p() {
      this.a = r.a;
      this.a = Duration.millis(150.0);
   }

   public void initialize(URL var1, ResourceBundle var2) {
      this.title.setText(ce.a());
      Image var3 = Launcher.a.a().a(ru.smartycraft.k.d);
      BackgroundImage var4 = new BackgroundImage(
         var3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT
      );
      this.background.setBackground(new Background(new BackgroundImage[]{var4}));
      this.settingsPane.setVisible(false);
      this.progressPane.setVisible(false);
      this.title.setOnMousePressed(var1x -> {
         if (var1x.getButton() == MouseButton.PRIMARY) {
            this.a = var1x.getSceneX();
            this.b = var1x.getSceneY();
         }
      });
      this.title.setOnMouseDragged(var1x -> {
         if (var1x.getButton() == MouseButton.PRIMARY) {
            Launcher.a.a().setX(var1x.getScreenX() - this.a);
            Launcher.a.a().setY(var1x.getScreenY() - this.b);
         }
      });
      this.modalBackground.setVisible(false);
   }

   @FXML
   private void clickExit(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         Runtime.getRuntime().exit(0);
      }
   }

   @FXML
   private void clickMInimize(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         Launcher.a.a().setIconified(true);
      }
   }

   public void a(r var1, int var2, String var3, String var4, String var5, String var6) {
      if (var1 == r.a) {
         this.a();
      } else {
         this.modalWindow.setPrefWidth(var2);
         this.a = var1;
         this.modalTitle.setText(var3);
         this.modalText.setText(var4);
         this.modalOK.setText(var5);
         this.modalCancel.setText(var6);
         this.modalBackground.setVisible(true);
         FadeTransition var7 = new FadeTransition(this.a, this.modalBackground);
         var7.setFromValue(0.0);
         var7.setToValue(1.0);
         ScaleTransition var8 = new ScaleTransition(this.a, this.modalWindow);
         var8.setFromX(0.0);
         var8.setToX(1.0);
         var8.setFromY(0.0);
         var8.setToY(1.0);
         ParallelTransition var9 = new ParallelTransition();
         var9.getChildren().addAll(new Animation[]{var7, var8});
         var9.setCycleCount(1);
         var9.play();
      }
   }

   private void a() {
      this.a = r.a;
      FadeTransition var1 = new FadeTransition(this.a, this.modalBackground);
      var1.setFromValue(1.0);
      var1.setToValue(0.0);
      ScaleTransition var2 = new ScaleTransition(this.a, this.modalWindow);
      var2.setFromX(1.0);
      var2.setToX(0.0);
      var2.setFromY(1.0);
      var2.setToY(0.0);
      ParallelTransition var3 = new ParallelTransition();
      var3.getChildren().addAll(new Animation[]{var1, var2});
      var3.setCycleCount(1);
      var3.play();
      var3.setOnFinished(var1x -> this.modalBackground.setVisible(false));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @FXML
   private void clickModalOk(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         switch (q.a[this.a.ordinal()]) {
            case 1:
               ce.a("https://java.com/ru/download/manual.jsp");
               this.a();
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @FXML
   private void clickModalCancel(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         switch (q.a[this.a.ordinal()]) {
            case 1:
               this.a();
         }
      }
   }

   public void a(boolean var1) {
      if (var1) {
         this.title.getStyleClass().clear();
         this.title.getStyleClass().add("main__title-dark");
         this.minimize.getStyleClass().clear();
         this.minimize.getStyleClass().add("main__button-minimize-dark");
         this.exit.getStyleClass().clear();
         this.exit.getStyleClass().add("main__button-exit-dark");
      } else {
         this.title.getStyleClass().clear();
         this.title.getStyleClass().add("main__title-light");
         this.minimize.getStyleClass().clear();
         this.minimize.getStyleClass().add("main__button-minimize-light");
         this.exit.getStyleClass().clear();
         this.exit.getStyleClass().add("main__button-exit-light");
      }
   }
}
