import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import ru.smartycraft.Launcher;

public class t implements Initializable {
   @FXML
   public ImageView image1;
   @FXML
   public ImageView image2;
   @FXML
   public ImageView image3;
   @FXML
   public Hyperlink title1;
   @FXML
   public Hyperlink title2;
   @FXML
   public Hyperlink title3;
   @FXML
   public Label desc1;
   @FXML
   public Label desc2;
   @FXML
   public Label desc3;
   @FXML
   public Label descVotes;
   @FXML
   public ImageView banner1;
   @FXML
   public ImageView banner2;
   @FXML
   public ImageView banner3;

   public void initialize(URL var1, ResourceBundle var2) {
      this.descVotes.setText(Launcher.a("news.descVotes"));
   }

   public void a(List<ru.smartycraft.g> var1) {
      if (var1.size() == 3) {
         this.title1.setText(((ru.smartycraft.g)var1.get(0)).a());
         this.title2.setText(((ru.smartycraft.g)var1.get(1)).a());
         this.title3.setText(((ru.smartycraft.g)var1.get(2)).a());
         this.desc1
            .setText(
               ce.a(((ru.smartycraft.g)var1.get(0)).b())
                  + ", "
                  + ((ru.smartycraft.g)var1.get(0)).c()
                  + " "
                  + ce.a(((ru.smartycraft.g)var1.get(0)).c(), Launcher.a("utils.views").split(","))
            );
         this.desc2
            .setText(
               ce.a(((ru.smartycraft.g)var1.get(1)).b())
                  + ", "
                  + ((ru.smartycraft.g)var1.get(1)).c()
                  + " "
                  + ce.a(((ru.smartycraft.g)var1.get(1)).c(), Launcher.a("utils.views").split(","))
            );
         this.desc3
            .setText(
               ce.a(((ru.smartycraft.g)var1.get(2)).b())
                  + ", "
                  + ((ru.smartycraft.g)var1.get(2)).c()
                  + " "
                  + ce.a(((ru.smartycraft.g)var1.get(2)).c(), Launcher.a("utils.views").split(","))
            );
         this.image1.setImage(((ru.smartycraft.g)var1.get(0)).a());
         this.image2.setImage(((ru.smartycraft.g)var1.get(1)).a());
         this.image3.setImage(((ru.smartycraft.g)var1.get(2)).a());
         this.title1.setOnAction(new u(this, var1));
         this.title2.setOnAction(new v(this, var1));
         this.title3.setOnAction(new w(this, var1));
         this.banner1.addEventHandler(MouseEvent.MOUSE_CLICKED, new x(this));
         this.banner2.addEventHandler(MouseEvent.MOUSE_CLICKED, new y(this));
         this.banner3.addEventHandler(MouseEvent.MOUSE_CLICKED, new z(this));
      }
   }
}
