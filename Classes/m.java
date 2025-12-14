import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import ru.smartycraft.Launcher;

public class m implements ad, Initializable {
   @FXML
   private AnchorPane background;
   @FXML
   private Label label;

   public void initialize(URL var1, ResourceBundle var2) {
      Image var3 = Launcher.a.a().a(ru.smartycraft.k.b);
      BackgroundImage var4 = new BackgroundImage(
         var3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT
      );
      this.background.setBackground(new Background(new BackgroundImage[]{var4}));
      bj var5 = new bj();
      this.label.textProperty().bind(var5.titleProperty());
      var5.a();
      var5.setOnSucceeded(var1x -> this.a((az)var1x.getSource().getValue()));
   }

   @Override
   public void a(az var1) {
      if (var1 instanceof ba) {
         ba var2 = (ba)var1;
         if (var2.a.equals(bf.OK) || var2.a.equals(bf.PROXY)) {
            ce.a(var2.a);
            Launcher.a.a(var2);
         } else if (var2.a.equals(bf.UPDATE)) {
            this.a(Launcher.a("loader.getUpdate"));
            Launcher.a.p();
         } else {
            this.a(Launcher.a("status.internalError"));
         }
      } else if (Launcher.a.b()) {
         Launcher.a.a((ba)var1);
      }
   }

   public void a(String var1) {
      this.label.textProperty().unbind();
      this.label.setText(var1);
   }
}
