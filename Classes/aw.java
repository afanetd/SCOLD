import com.google.gson.annotations.SerializedName;

public class aw extends ap {
   @SerializedName("login")
   public String b;
   private transient ru.smartycraft.h a;

   public aw(ru.smartycraft.h var1) {
      this.a = "skinupload";
      this.a = au.b;
      this.a = var1;
      this.b = var1.a();
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
      var1.append(this.b);
      return bx.a(var1.toString());
   }
}
