import com.google.gson.annotations.SerializedName;
import ru.smartycraft.Launcher;

public class aq extends ap {
   @SerializedName("version")
   public String b;
   @SerializedName("cheksum")
   public String c;
   @SerializedName("format")
   public String d;
   @SerializedName("testModeKey")
   public String e;
   @SerializedName("debug")
   public String f;

   public aq() {
      this.a = "loader";
      this.a = au.b;
      this.b = "3.6.2";
      this.c = cb.i();
      this.d = cb.h();
      this.e = Launcher.a.a().f;
      this.f = "false";
   }
}
