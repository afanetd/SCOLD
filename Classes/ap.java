import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class ap {
   protected transient String a;
   protected transient au a;
   private final transient Map<String, File> a = new HashMap();
   private transient be a;

   public ap() {
      this.a = be.a;
   }

   public String a() {
      return this.a;
   }

   public boolean a() {
      return false;
   }

   public String b() {
      return new String();
   }

   public Map<String, File> a() {
      return this.a;
   }

   public void a(String var1, File var2) {
      if (var2.exists() && var2.canRead()) {
         this.a.put(var1, var2);
         this.a = au.c;
      }
   }

   public az a(String var1, Class<? extends az> var2) {
      as var3 = new as(var1);
      var3.a(this);
      var3.a(this.a);
      var3.a(var2);
      az var4 = var3.a();
      if (var4 == null) {
         this.a = be.c;
      } else {
         this.a = be.b;
      }

      return var4;
   }

   public be a() {
      return this.a;
   }
}
