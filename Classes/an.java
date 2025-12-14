import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class an {
   private ByteArrayOutputStream a;
   private DataOutputStream a;
   static byte[] a = new byte[]{-2, -3};
   byte a;
   int a;
   byte[] b;

   public an() {
      short var1 = 1460;
      this.a = new ByteArrayOutputStream(var1);
      this.a = new DataOutputStream(this.a);
   }

   byte[] a() {
      this.a.reset();

      try {
         this.a.write(a);
         this.a.write(this.a);
         this.a.writeInt(this.a);
         this.a.write(this.b());
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      return this.a.toByteArray();
   }

   private byte[] b() {
      return this.a == 9 ? new byte[0] : this.b;
   }

   protected void a(int var1) {
      this.b = al.a(var1);
   }
}
