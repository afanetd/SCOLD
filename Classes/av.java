import com.google.gson.annotations.SerializedName;

public class av extends ap {
   @SerializedName("login")
   public String b;
   @SerializedName("url")
   public String c;
   @SerializedName("filename")
   public String d;
   @SerializedName("date")
   public long a;
   private transient ru.smartycraft.h a;

   public av(ru.smartycraft.h var1, String var2, String var3, long var4) {
      this.a = "report";
      this.a = au.b;
      this.b = var1.a();
      this.a = var4;
      this.d = var3;
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
      var1.append(this.c).append("|");
      var1.append(this.d).append("|");
      var1.append(this.a);
      return bx.a(var1.toString());
   }
}
