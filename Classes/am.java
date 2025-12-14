import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class am {
   String a = "localhost";
   int a = 25565;
   int b = 25566;
   private DatagramSocket a = null;
   private int c;

   public am(String var1, int var2) {
      this.a = var1;
      this.a = var2;
   }

   private void a() {
      an var1 = new an();
      var1.a = 9;
      var1.a = this.a();
      int var2 = 11 - var1.a().length;
      byte[] var3 = al.a(var1.a(), var2);
      byte[] var4 = this.a(var3);
      this.c = Integer.parseInt(new String(var4).trim());
   }

   public ao a() {
      this.a();
      an var1 = new an();
      var1.a = 0;
      var1.a = this.a();
      var1.a(this.c);
      byte[] var2 = var1.a();
      byte[] var3 = this.a(var2);
      return new ao(var3, false);
   }

   private byte[] a(byte[] var1) {
      while (this.a == null) {
         try {
            this.a = new DatagramSocket(this.b);
         } catch (BindException var6) {
            this.b++;
         }
      }

      InetAddress var2 = InetAddress.getByName(this.a);
      DatagramPacket var3 = new DatagramPacket(var1, var1.length, var2, this.a);
      this.a.send(var3);
      byte[] var4 = new byte[1024];
      DatagramPacket var5 = new DatagramPacket(var4, var4.length);
      this.a.setSoTimeout(500);
      this.a.receive(var5);
      return var5.getData();
   }

   private int a() {
      return 1;
   }

   public void finalize() {
      this.a.close();
   }
}
