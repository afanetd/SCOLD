import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import ru.smartycraft.Launcher;

public class aa implements Initializable {
   @FXML
   private Label title;
   @FXML
   private ImageView icon;
   @FXML
   private Label description;
   @FXML
   private Label master;
   @FXML
   private Label progress;
   @FXML
   private ProgressBar progressBar;

   public void initialize(URL var1, ResourceBundle var2) {
      this.icon.setImage(Launcher.a.a().a(ru.smartycraft.k.e));
      this.icon.setVisible(false);
      this.progressBar.setVisible(false);
   }

   public void a(ru.smartycraft.a var1) {
      bw var2 = new bw(var1);
      var2.a();
      var2.valueProperty().addListener((var2x, var3, var4) -> {
         switch (ab.a[var4.ordinal()]) {
            case 1:
               this.title.setText(new String());
               this.icon.setVisible(false);
               this.description.setText(new String());
               this.master.setText(Launcher.a("prepare.checkingFiles"));
               this.progress.setText(new String());
               this.progressBar.setVisible(false);
               break;
            case 2:
               this.title.setText(Launcher.a("prepare.updateClient"));
               this.icon.setVisible(true);
               this.description.setText(Launcher.a("prepare.updateClient.downloading"));
               this.master.setText(new String());
               this.master.textProperty().bind(var2.titleProperty());
               this.progress.setText(new String());
               this.progress.textProperty().bind(var2.messageProperty());
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }

               this.progressBar.setVisible(true);
               this.progressBar.progressProperty().bind(var2.progressProperty());
               break;
            case 3:
               this.title.setText(Launcher.a("prepare.updateClient"));
               this.icon.setVisible(true);
               this.description.setText(Launcher.a("prepare.updateClient.zipsize"));
               if (this.master.textProperty().isBound()) {
                  this.master.textProperty().unbind();
               }

               this.master.setText(new String());
               if (this.progress.textProperty().isBound()) {
                  this.progress.textProperty().unbind();
               }

               this.progress.setText(new String());
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }

               this.progressBar.setVisible(true);
               this.progressBar.progressProperty().bind(var2.progressProperty());
               break;
            case 4:
               this.title.setText(Launcher.a("prepare.updateClient"));
               this.icon.setVisible(true);
               this.description.setText(Launcher.a("prepare.updateClient.unzipping"));
               if (this.master.textProperty().isBound()) {
                  this.master.textProperty().unbind();
               }

               this.master.setText(new String());
               this.master.textProperty().bind(var2.titleProperty());
               if (this.progress.textProperty().isBound()) {
                  this.progress.textProperty().unbind();
               }

               this.progress.setText(new String());
               this.progress.textProperty().bind(var2.messageProperty());
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }

               this.progressBar.setVisible(true);
               this.progressBar.progressProperty().bind(var2.progressProperty());
               break;
            case 5:
               this.title.setText(new String());
               this.icon.setVisible(false);
               this.description.setText(new String());
               if (this.master.textProperty().isBound()) {
                  this.master.textProperty().unbind();
               }

               this.master.setText(Launcher.a("prepare.completing"));
               if (this.progress.textProperty().isBound()) {
                  this.progress.textProperty().unbind();
               }

               this.progress.setText(new String());
               this.progressBar.setVisible(false);
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }

               Launcher.a.a(var2);
               break;
            case 6:
               this.title.setText(new String());
               this.icon.setVisible(false);
               this.description.setText(new String());
               if (this.master.textProperty().isBound()) {
                  this.master.textProperty().unbind();
               }

               this.master.setText(Launcher.a("prepare.starting"));
               if (this.progress.textProperty().isBound()) {
                  this.progress.textProperty().unbind();
               }

               this.progress.setText(new String());
               this.progressBar.setVisible(false);
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }
               break;
            case 7:
               this.title.setText(new String());
               this.icon.setVisible(false);
               this.description.setText(new String());
               if (this.master.textProperty().isBound()) {
                  this.master.textProperty().unbind();
               }

               this.master.setText(Launcher.a("prepare.starting"));
               if (this.progress.textProperty().isBound()) {
                  this.progress.textProperty().unbind();
               }

               this.progress.setText(new String());
               this.progressBar.setVisible(false);
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }

               Launcher.a.n();
               break;
            case 8:
               this.title.setText(new String());
               this.icon.setVisible(false);
               this.description.setText(new String());
               if (this.master.textProperty().isBound()) {
                  this.master.textProperty().unbind();
               }

               this.master.setText(Launcher.a("prepare.stop"));
               if (this.progress.textProperty().isBound()) {
                  this.progress.textProperty().unbind();
               }

               this.progress.setText(new String());
               this.progressBar.setVisible(false);
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }

               Launcher.a.o();
               break;
            case 9:
               this.title.setText(new String());
               this.icon.setVisible(false);
               this.description.setText(new String());
               if (this.master.textProperty().isBound()) {
                  this.master.textProperty().unbind();
               }

               this.master.setText(Launcher.a("prepare.error"));
               if (this.progress.textProperty().isBound()) {
                  this.progress.textProperty().unbind();
               }

               this.progress.textProperty().bind(var2.messageProperty());
               this.progressBar.setVisible(false);
               if (this.progressBar.progressProperty().isBound()) {
                  this.progressBar.progressProperty().unbind();
               }
         }
      });
   }
}
