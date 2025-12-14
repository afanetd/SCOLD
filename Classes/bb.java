import com.google.gson.annotations.SerializedName;
import ru.smartycraft.Launcher;

public class bb implements az {
   @SerializedName("status")
   public bf a;
   @SerializedName("playername")
   public String a;
   @SerializedName("uid")
   public String b;
   @SerializedName("money")
   public int a;
   @SerializedName("clan")
   public String c;
   @SerializedName("cape")
   public String d;
   @SerializedName("skintime")
   public int b;
   @SerializedName("capetime")
   public int c;
   @SerializedName("client")
   public bc a;
   @SerializedName("uuid")
   public String e;
   @SerializedName("session")
   public String f;
   @SerializedName("testModeKey")
   public String g;
   public transient ru.smartycraft.h a;

   public bb(String var1) {
      this.a = var1;
      if (Launcher.a.b()) {
         this.e = bx.a(var1);
         this.a = bf.OK;
      }
   }

   public void a() {
      this.a = new ru.smartycraft.h(this);
   }
}
