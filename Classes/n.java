import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import ru.smartycraft.Launcher;

public class n implements ad, Initializable {
   @FXML
   private Button enter;
   @FXML
   private Button settings;
   @FXML
   private TextField login;
   @FXML
   private PasswordField password;
   @FXML
   private ComboBox servers;
   @FXML
   private Label status;
   @FXML
   private Label description;
   @FXML
   private Hyperlink passwordRestore;
   @FXML
   private ImageView logotype;
   private ba a;

   public void initialize(URL var1, ResourceBundle var2) {
      if (!Launcher.a.a().g && !Launcher.a.b()) {
         this.enter.setText(Launcher.a("login.enter"));
      } else {
         this.enter.setText(Launcher.a("login.runGame"));
      }

      this.login.setPromptText(Launcher.a("login.login"));
      this.password.setPromptText(Launcher.a("login.password"));
      this.description.setText(Launcher.a("login.description"));
      this.passwordRestore.setText(Launcher.a("login.passwordRestore"));
      this.logotype.setImage(Launcher.a.a().a(ru.smartycraft.k.c));
   }

   public void a(ba var1) {
      ru.smartycraft.b var2 = Launcher.a.a();
      this.a = var1;
      if (Launcher.a.b()) {
         if (!Launcher.a.a().b.isEmpty()) {
            this.servers.setItems(FXCollections.observableArrayList(Launcher.a.a().b.values()));
         } else {
            this.servers.setPlaceholder(new Label(Launcher.a("login.noservers")));
         }
      } else {
         ArrayList var3 = new ArrayList();
         this.a.a.forEach(var1x -> {
            if (Launcher.a.a().b.containsKey(var1x.a()) && ((ru.smartycraft.i)Launcher.a.a().b.get(var1x.a())).equals(var1x)) {
               ru.smartycraft.i var2x = (ru.smartycraft.i)Launcher.a.a().b.get(var1x.a());
               if (var2x.a() != null && !var2x.a().isEmpty()) {
                  Map var3x = var1x.a();
                  var3x.forEach((var1xx, var2xx) -> {
                     if (var2x.a().containsKey(var1xx)) {
                        var2xx.a(((ru.smartycraft.j)var2x.a().get(var1xx)).a());
                     }
                  });
                  var2x.a(var3x);
               } else {
                  var2x.a(var1x.a());
               }

               var3.add(var2x);
            } else {
               var3.add(var1x);
            }
         });
         this.servers.setItems(FXCollections.observableArrayList(var3));
      }

      int var7 = 0;
      if (var2.a != null) {
         this.login.setText(var2.a);
      }

      if (var2.b != null) {
         this.password.setText(bx.c(var2.b));
      }

      if (!Launcher.a.b()) {
         if (var2.e != null) {
            for (int var4 = 0; var4 < this.a.a.size(); var4++) {
               if (((ru.smartycraft.i)this.a.a.get(var4)).b().equals(var2.e)) {
                  var7 = var4;
               }
            }
         }

         this.servers.getSelectionModel().select(var7);
         br var8 = new br((ru.smartycraft.i)this.a.a.get(var7));
         this.status.textProperty().bind(var8.messageProperty());
         var8.a();
      } else if (var2.e != null) {
         int var9 = 0;

         for (ru.smartycraft.i var6 : var2.b.values()) {
            if (var6.b().equals(var2.e)) {
               this.servers.getSelectionModel().select(var9);
            }

            var9++;
         }
      }
   }

   @FXML
   private void serverSelect() {
      if (!Launcher.a.b()) {
         br var1 = new br((ru.smartycraft.i)this.servers.getSelectionModel().getSelectedItem());
         this.status.textProperty().bind(var1.messageProperty());
         var1.a();
      }
   }

   @FXML
   private void clickLogo(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         String var2 = ce.a(new String());
         ce.a(var2);
      }
   }

   @FXML
   private void clickPasswordRestore(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         String var2 = ce.a("password");
         ce.a(var2);
      }
   }

   @FXML
   private void clickSettings(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         Launcher.a.d();
      }
   }

   @FXML
   private void clickLogin(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         this.b();
      }
   }

   public void a(KeyEvent var1) {
      if (var1.getCode() == KeyCode.ENTER) {
         this.b();
      }
   }

   private void b() {
      this.status.textProperty().unbind();
      this.status.setText(new String());
      if (this.login.getText().length() == 0) {
         this.status.setText(Launcher.a("status.enterLogin"));
         this.login.requestFocus();
      } else if (this.password.getText().length() == 0) {
         this.status.setText(Launcher.a("status.enterPassword"));
         this.password.requestFocus();
      } else {
         this.login.setDisable(true);
         this.password.setDisable(true);
         this.servers.setDisable(true);
         this.enter.setDisable(true);
         this.settings.setDisable(true);
         ru.smartycraft.i var1 = (ru.smartycraft.i)this.servers.getSelectionModel().getSelectedItem();
         Launcher.a.a(var1);
         bl var2 = new bl(this, this.login.getText(), this.password.getText(), var1);
         var2.a();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(az var1) {
      if (var1 == null) {
         this.status.setText(Launcher.a("status.noAuth"));
         this.login.setDisable(false);
         this.password.setDisable(false);
         this.servers.setDisable(false);
         this.enter.setDisable(false);
         this.settings.setDisable(false);
      } else if (var1 instanceof bb) {
         bb var2 = (bb)var1;
         if (Launcher.a.b()) {
            ru.smartycraft.b var3 = Launcher.a.a();
            var3.a = var2.a;
            var3.b = bx.b(this.password.getText());
            Object var4 = this.servers.getSelectionModel().getSelectedItem();
            if (!(var4 instanceof ru.smartycraft.i)) {
               this.status.setText(Launcher.a("status.selectServer"));
            } else {
               var3.e = ((ru.smartycraft.i)var4).b();
               var3.a();
               Launcher.a.a(var2);
            }
         } else {
            switch (o.a[var2.a.ordinal()]) {
               case 1:
                  this.status.setText(Launcher.a("status.badLogin"));
                  this.login.requestFocus();
                  break;
               case 2:
                  this.status.setText(Launcher.a("status.badPassword"));
                  this.password.requestFocus();
                  break;
               case 3:
                  this.status.setText(Launcher.a("status.inactive"));
                  break;
               case 4:
                  this.status.setText(Launcher.a("status.virtual"));
                  break;
               case 5:
                  this.status.setText(Launcher.a("status.noServer"));
                  break;
               case 6:
               case 7:
                  ru.smartycraft.b var5 = Launcher.a.a();
                  var5.a = var2.a;
                  var5.b = bx.b(this.password.getText());
                  var5.e = ((ru.smartycraft.i)this.servers.getSelectionModel().getSelectedItem()).b();
                  var5.a();
                  Launcher.a.a(var2);
                  break;
               default:
                  this.status.setText(Launcher.a("status.internalError"));
            }
         }

         this.login.setDisable(false);
         this.password.setDisable(false);
         this.servers.setDisable(false);
         this.enter.setDisable(false);
         this.settings.setDisable(false);
      }
   }

   public void a() {
      if (Launcher.a.a().g) {
         this.enter.setText(Launcher.a("login.runGame"));
      } else {
         this.enter.setText(Launcher.a("login.enter"));
      }
   }
}
