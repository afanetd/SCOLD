import java.lang.reflect.Method;
import java.util.prefs.Preferences;

public class cd {
   private final int a = 983103;
   private final int b = 131097;
   private final Preferences a = Preferences.userRoot();
   private final Preferences b = Preferences.systemRoot();
   private final Class<? extends Preferences> a = this.a.getClass();
   private final Method a;
   private final Method b;
   private final Method c;
   private final Method d;
   private final Method e;
   private final Method f;
   private final Method g;
   private final Method h;
   private final Method i;
   private final Method j;

   public cd() {
      try {
         if (cb.a() == cc.a) {
            this.a = this.a.getDeclaredMethod("WindowsRegOpenKey", int.class, byte[].class, int.class);
            this.a.setAccessible(true);
            this.b = this.a.getDeclaredMethod("WindowsRegCloseKey", int.class);
            this.b.setAccessible(true);
            this.c = this.a.getDeclaredMethod("WindowsRegQueryValueEx", int.class, byte[].class);
            this.c.setAccessible(true);
            this.d = this.a.getDeclaredMethod("WindowsRegEnumValue", int.class, int.class, int.class);
            this.d.setAccessible(true);
            this.e = this.a.getDeclaredMethod("WindowsRegQueryInfoKey1", int.class);
            this.e.setAccessible(true);
            this.f = this.a.getDeclaredMethod("WindowsRegEnumKeyEx", int.class, int.class, int.class);
            this.f.setAccessible(true);
            this.g = this.a.getDeclaredMethod("WindowsRegCreateKeyEx", int.class, byte[].class);
            this.g.setAccessible(true);
            this.h = this.a.getDeclaredMethod("WindowsRegSetValueEx", int.class, byte[].class, byte[].class);
            this.h.setAccessible(true);
            this.j = this.a.getDeclaredMethod("WindowsRegDeleteValue", int.class, byte[].class);
            this.j.setAccessible(true);
            this.i = this.a.getDeclaredMethod("WindowsRegDeleteKey", int.class, byte[].class);
            this.i.setAccessible(true);
         } else {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
         }
      } catch (SecurityException | NoSuchMethodException var2) {
         throw new RuntimeException(var2);
      }
   }

   public String a(int var1, String var2, String var3) {
      if (var1 == -2147483646) {
         return this.a(this.b, var1, var2, var3);
      } else if (var1 == -2147483647) {
         return this.a(this.a, var1, var2, var3);
      } else {
         throw new IllegalArgumentException("hkey=" + var1);
      }
   }

   public void a(int var1, String var2) {
      int[] var3;
      if (var1 == -2147483646) {
         var3 = this.a(this.b, var1, var2);
         this.b.invoke(this.b, var3[0]);
      } else {
         if (var1 != -2147483647) {
            throw new IllegalArgumentException("hkey=" + var1);
         }

         var3 = this.a(this.a, var1, var2);
         this.b.invoke(this.a, var3[0]);
      }

      if (var3[1] != 0) {
         throw new IllegalArgumentException("rc=" + var3[1] + "  key=" + var2);
      }
   }

   public void a(int var1, String var2, String var3, String var4) {
      if (var1 == -2147483646) {
         this.a(this.b, var1, var2, var3, var4);
      } else {
         if (var1 != -2147483647) {
            throw new IllegalArgumentException("hkey=" + var1);
         }

         this.a(this.a, var1, var2, var3, var4);
      }
   }

   private String a(Preferences var1, int var2, String var3, String var4) {
      int[] var5 = (int[])this.a.invoke(var1, var2, this.a(var3), 131097);
      if (var5[1] != 0) {
         return null;
      } else {
         byte[] var6 = (byte[])this.c.invoke(var1, var5[0], this.a(var4));
         this.b.invoke(var1, var5[0]);
         return var6 != null ? new String(var6).trim() : null;
      }
   }

   private int[] a(Preferences var1, int var2, String var3) {
      return (int[])this.g.invoke(var1, var2, this.a(var3));
   }

   private void a(Preferences var1, int var2, String var3, String var4, String var5) {
      int[] var6 = (int[])this.a.invoke(var1, var2, this.a(var3), 983103);
      this.h.invoke(var1, var6[0], this.a(var4), this.a(var5));
      this.b.invoke(var1, var6[0]);
   }

   private byte[] a(String var1) {
      byte[] var2 = new byte[var1.length() + 1];

      for (int var3 = 0; var3 < var1.length(); var3++) {
         var2[var3] = (byte)var1.charAt(var3);
      }

      var2[var1.length()] = 0;
      return var2;
   }
}
