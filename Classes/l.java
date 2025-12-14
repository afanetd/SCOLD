import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import ru.smartycraft.Launcher;

public class l implements Initializable {
   @FXML
   private Label master;
   @FXML
   private Label reportTitle;
   @FXML
   private Label reportPath;
   @FXML
   private Button reportSend;
   @FXML
   private Button reportLink;
   @FXML
   private Button reportFolder;
   @FXML
   private VBox buttons;
   @FXML
   private Label reason;
   @FXML
   private Button restart;
   private File a;
   private String a;

   public void initialize(URL var1, ResourceBundle var2) {
      this.reportTitle.setText(Launcher.a("fail.reportTitle.find"));
      this.master.setText(Launcher.a("fail.master"));
      this.restart.setText(Launcher.a("fail.restart"));
      this.reportSend.setVisible(false);
      this.reportLink.setVisible(false);
      this.reportFolder.setVisible(false);
   }

   public void a(File var1) {
      bi var2 = new bi(var1);
      var2.a();
      var2.setOnSucceeded(var1x -> this.a((a)var1x.getSource().getValue()));
   }

   private void a(a var1) {
      this.a = var1.a();
      if (this.a != null) {
         this.reportTitle.setText(Launcher.a("fail.reportTitle.finded"));
         this.reportPath.setText(this.a.getAbsolutePath());
         this.reportSend.setText(Launcher.a("fail.reportSend"));
         this.reportLink.setText(Launcher.a("fail.reportLink"));
         this.reportFolder.setText(Launcher.a("fail.reportFolder"));
         this.reportSend.setVisible(true);
         this.reportLink.setVisible(true);
         this.reportFolder.setVisible(true);
         this.reason.setText(var1.a());
         var1.a().forEach(var1x -> {
            var1x.getStyleClass().add("fail__button");
            var1x.setPrefWidth(710.0);
            var1x.setPrefHeight(35.0);
            this.buttons.getChildren().add(1, var1x);
         });
      } else {
         this.reportTitle.setText(Launcher.a("fail.reportTitle.unfinded"));
      }
   }

   @FXML
   private void sendToAdmin(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY && this.a != null) {
         this.reportSend.setDisable(true);
         if (this.a == null) {
            this.reportLink.setDisable(true);
            bp var2 = new bp(this.a);
            var2.a();
            var2.setOnSucceeded(var1x -> {
               this.a = (String)var1x.getSource().getValue();
               this.reportLink.setDisable(false);
               this.a();
            });
         } else {
            this.a();
         }
      }
   }

   @FXML
   private void getLink(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY && this.a != null) {
         if (this.a == null) {
            this.reportLink.setDisable(true);
            this.reportSend.setDisable(true);
            bp var2 = new bp(this.a);
            var2.a();
            var2.setOnSucceeded(var1x -> {
               this.a = (String)var1x.getSource().getValue();
               this.reportLink.setDisable(false);
               this.reportSend.setDisable(false);
               ce.a(this.a);
            });
         } else {
            ce.a(this.a);
         }
      }
   }

   @FXML
   private void openFolder(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY && this.a != null) {
         ce.a(this.a.getParentFile());
      }
   }

   @FXML
   private void restartGame(MouseEvent var1) {
      if (var1.getButton() == MouseButton.PRIMARY) {
         Launcher.a.m();
      }
   }

   private void a() {
      bq var1 = new bq(this.a, this.a.getName(), this.a.lastModified());
      var1.a();
      var1.setOnSucceeded(var1x -> this.reportSend.setText(Launcher.a("fail.reportSended")));
   }
}
