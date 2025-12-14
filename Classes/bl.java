public class bl {
   private final String a;
   private final String b;
   private final ru.smartycraft.i a;
   private final ad a;

   public bl(ad var1, String var2, String var3, ru.smartycraft.i var4) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.a = var4;
   }

   public void a() {
      bm var2 = new bm(this, this);
      var2.setOnSucceeded(var2x -> this.a.a((az)var2.getValue()));
      Thread var3 = new Thread(var2);
      var3.setName("Login Thread");
      var3.setDaemon(true);
      var3.start();
   }
}
