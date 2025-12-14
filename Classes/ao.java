import java.util.ArrayList;

public class ao {
   static byte a = 0;
   static byte b = 20;
   private boolean a;
   private String a;
   private String b;
   private String c;
   private int a;
   private int b;
   private short a;
   private String d;
   private String e;
   private String f;
   private String g;
   private ArrayList<String> a;

   public ao(byte[] var1, boolean var2) {
      this.a = var2;
      var1 = al.a(var1);
      byte[][] var3 = al.a(var1);
      if (!var2) {
         this.a = new String(al.a(var3[0], 1, var3[0].length - 1));
         this.b = new String(var3[1]);
         this.c = new String(var3[2]);
         this.a = Integer.parseInt(new String(var3[3]));
         this.b = Integer.parseInt(new String(var3[4]));
         this.a = al.a(var3[5]);
         this.d = new String(al.a(var3[5], 2, var3[5].length - 1));
      } else {
         this.a = new String(var3[3]);
         this.b = new String(var3[5]);
         this.c = new String(var3[13]);
         this.a = Integer.parseInt(new String(var3[15]));
         this.b = Integer.parseInt(new String(var3[17]));
         this.a = Short.parseShort(new String(var3[19]));
         this.d = new String(var3[21]);
         this.e = new String(var3[7]);
         this.f = new String(var3[9]);
         this.g = new String(var3[11]);
         this.a = new ArrayList();

         for (int var4 = 25; var4 < var3.length; var4++) {
            this.a.add(new String(var3[var4]));
         }
      }
   }

   public String toString() {
      String var1 = ", ";
      StringBuilder var2 = new StringBuilder();
      var2.append(this.a);
      var2.append(var1);
      var2.append(this.b);
      var2.append(var1);
      var2.append(this.c);
      var2.append(var1);
      var2.append(this.a);
      var2.append(var1);
      var2.append(this.b);
      var2.append(var1);
      var2.append(this.a);
      var2.append(var1);
      var2.append(this.d);
      if (this.a) {
         var2.append(var1);
         var2.append(this.e);
         var2.append(var1);
         var2.append(this.f);
         if (this.g.length() > 0) {
            var2.append(var1);
            var2.append(this.g);
         }

         var2.append(var1);
         var2.append("Players: ");
         var2.append('[');

         for (String var4 : this.a) {
            var2.append(var4);
            if (this.a.indexOf(var4) != this.a.size() - 1) {
               var2.append(',');
            }
         }

         var2.append(']');
      }

      return var2.toString();
   }

   public int a() {
      return this.a;
   }
}
