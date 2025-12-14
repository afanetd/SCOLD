import com.google.gson.annotations.SerializedName;

public class ax extends ap {
   @SerializedName("login")
   public String b;
   @SerializedName("server")
   public String c;
   private final transient ru.smartycraft.h a;

   public ax(ru.smartycraft.h var1, String var2) {
      this.a = "tospawn";
      this.a = au.b;
      this.b = var1.a();
      this.c = var2;
      this.a = var1;
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public String b() {
      StringBuilder var1 = new StringBuilder();
      var1.append(ce.a() / 10).append("|");
      var1.append(this.a.d()).append("|");
      var1.append(this.b).append("|");
      var1.append(this.c);
      return bx.a(var1.toString());
   }
}
