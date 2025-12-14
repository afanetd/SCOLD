import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import ru.smartycraft.Launcher;

public class ag implements ad, Initializable {
   @FXML
   private ImageView logotype;
   @FXML
   private Label greeting;
   @FXML
   private Button enter;
   @FXML
   private TextField authCode;
   @FXML
   private Label status;

   public void initialize(URL var1, ResourceBundle var2) {
      this.greeting.setText(Launcher.a("twoauth.greeting"));
      this.enter.setText(Launcher.a("twoauth.enter"));
      this.logotype.setImage(Launcher.a.a().a(ru.smartycraft.k.c));
   }

   @FXML
   private void clickEnter(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY && Launcher.a.a() != null) {
         this.status.setText(new String());
         if (this.authCode.getText().length() == 0) {
            this.status.setText(Launcher.a("status.enterCode"));
            this.authCode.requestFocus();
         } else {
            this.authCode.setDisable(true);
            bu var2 = new bu(this, Launcher.a.a(), this.authCode.getText());
            var2.a();
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(az var1) {
      if (var1 instanceof bh) {
         bh var2 = (bh)var1;
         switch (ah.a[var2.a.ordinal()]) {
            case 1:
               this.status.setText(Launcher.a("status.badLogin"));
               break;
            case 2:
               this.status.setText(Launcher.a("status.badTwoAuth"));
               this.authCode.requestFocus();
               break;
            case 3:
               this.a();
               break;
            default:
               this.status.setText(Launcher.a("status.internalError"));
         }

         this.authCode.setDisable(false);
      }
   }

   @FXML
   private void clickLogo(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         String var2 = ce.a(new String());
         ce.a(var2);
      }
   }

   private void a() {
      if (Launcher.a.a().g) {
         Launcher.a.m();
      } else {
         Launcher.a.h();
      }
   }

   public void a(KeyEvent var1) {
      if (var1.getCode() == KeyCode.ENTER && Launcher.a.a() != null) {
         this.status.setText(new String());
         if (this.authCode.getText().length() == 0) {
            this.status.setText(Launcher.a("status.enterCode"));
            this.authCode.requestFocus();
         } else {
            this.authCode.setDisable(true);
            bu var2 = new bu(this, Launcher.a.a(), this.authCode.getText());
            var2.a();
         }
      }
   }
}
