public class bu {
   private final String a;
   private final ru.smartycraft.h a;
   private final ad a;

   public bu(ad var1, ru.smartycraft.h var2, String var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public void a() {
      bv var2 = new bv(this, this);
      var2.setOnSucceeded(var2x -> this.a.a((az)var2.getValue()));
      Thread var3 = new Thread(var2);
      var3.setName("Loader Thread");
      var3.setDaemon(true);
      var3.start();
   }
}
