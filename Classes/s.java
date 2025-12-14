import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;
import ru.smartycraft.Launcher;

public class s implements Initializable {
   private final Duration a = Duration.millis(150.0);
   @FXML
   private AnchorPane root;
   @FXML
   private AnchorPane background;
   @FXML
   private Button back;
   @FXML
   private Label modsTitle;
   @FXML
   private ScrollPane scroll;
   @FXML
   private GridPane grid;
   private Map<String, CheckBox> a = new HashMap();

   public void initialize(URL var1, ResourceBundle var2) {
      this.modsTitle.setText(Launcher.a("mods.title"));
      if (Launcher.a.a() != null) {
         AtomicInteger var3 = new AtomicInteger(0);
         Launcher.a.a().a().forEach((var2x, var3x) -> {
            Label var4x = new Label(var3x.a());
            var4x.getStyleClass().add("mods__mod-title");
            StringBuilder var5x = new StringBuilder(Launcher.a("mods.mod." + var2x));
            if (!var3x.b().isEmpty()) {
               var5x.append(Launcher.a("mods.mod.uncompatibility"));
               AtomicBoolean var6x = new AtomicBoolean(true);
               var3x.b().forEach(var2xx -> {
                  if (Launcher.a.a().a().containsKey(var2xx)) {
                     if (!var6x.get()) {
                        var5x.append(",");
                     }

                     var5x.append(" ").append(((ru.smartycraft.j)Launcher.a.a().a().get(var2xx)).a());
                     var6x.set(false);
                  }
               });
               var5x.append(".");
            }

            Label var8 = new Label(var5x.toString());
            var8.getStyleClass().add("mods__mod-desc");
            var8.setWrapText(true);
            CheckBox var7 = new CheckBox();
            var7.setSelected(var3x.a());
            var7.setId(var2x);
            var7.setPrefSize(47.0, 20.0);
            var7.setOnMouseClicked(var2xx -> {
               if (var2xx.getSource() instanceof CheckBox && Launcher.a.a() != null) {
                  CheckBox var3xx = (CheckBox)var2xx.getSource();
                  if (Launcher.a.a().a().containsKey(var3xx.getId())) {
                     ((ru.smartycraft.j)Launcher.a.a().a().get(var3xx.getId())).a(var3xx.isSelected());
                     if (!var3x.b().isEmpty()) {
                        var3x.b().forEach(var1xxx -> {
                           if (Launcher.a.a().a().containsKey(var1xxx)) {
                              ((ru.smartycraft.j)Launcher.a.a().a().get(var1xxx)).a(false);
                           }

                           if (this.a.containsKey(var1xxx)) {
                              ((CheckBox)this.a.get(var1xxx)).setSelected(false);
                           }
                        });
                     }

                     Launcher.a.a().a();
                  }
               }
            });
            this.a.put(var2x, var7);
            this.grid.addRow(var3.getAndAdd(1), new Node[]{var4x, var7, var8});
         });
         this.grid.setVgap(10.0);
      }

      FadeTransition var6 = new FadeTransition(this.a, this.root);
      var6.setFromValue(0.0);
      var6.setToValue(1.0);
      TranslateTransition var4 = new TranslateTransition(this.a, this.root);
      var4.setFromX(500.0);
      var4.setToX(0.0);
      ParallelTransition var5 = new ParallelTransition();
      var5.getChildren().addAll(new Animation[]{var6, var4});
      var5.setCycleCount(1);
      var5.play();
   }

   @FXML
   private void clickBack(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         this.a();
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
      var3.setOnFinished(var0 -> Launcher.a.f());
   }

   public void a(KeyEvent var1) {
      if (var1.getCode() == KeyCode.ESCAPE) {
         this.a();
      }
   }
}
