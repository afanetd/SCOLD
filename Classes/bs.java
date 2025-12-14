import java.io.File;

public class bs {
   private final ru.smartycraft.h a;
   private final File a;
   private final ad a;

   public bs(ad var1, ru.smartycraft.h var2, File var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public void a() {
      bt var2 = new bt(this, this);
      var2.setOnSucceeded(var2x -> this.a.a((az)var2.getValue()));
      Thread var3 = new Thread(var2);
      var3.setName("SkinUpload Thread");
      var3.setDaemon(true);
      var3.start();
   }
}
