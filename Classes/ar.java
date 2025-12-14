import com.google.gson.annotations.SerializedName;
import ru.smartycraft.Launcher;

public class ar extends ap {
   @SerializedName("session")
   public String b;
   @SerializedName("login")
   public String c;
   @SerializedName("password")
   public String d;
   @SerializedName("server")
   public String e;
   @SerializedName("mac")
   public String f;
   @SerializedName("osName")
   public String g;
   @SerializedName("osBitness")
   public int a;
   @SerializedName("javaVersion")
   public String h;
   @SerializedName("javaBitness")
   public int b;
   @SerializedName("javaHome")
   public String i;
   @SerializedName("classPath")
   public String j;
   @SerializedName("rtCheckSum")
   public String k;

   public ar(String var1, String var2, ru.smartycraft.i var3) {
      this.a = "login";
      this.a = au.b;
      this.b = Launcher.a.a().a();
      this.c = var1;
      this.d = bx.a(var2);
      this.e = var3.b();
      String var4 = cb.e();
      this.f = var4 != null ? var4 : "virtual";
      this.g = cb.a();
      this.a = cb.a();
      this.h = cb.b();
      this.b = cb.b();
      this.i = cb.c();
      this.j = cb.d();
      this.k = cb.f();
   }
}
