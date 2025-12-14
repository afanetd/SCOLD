import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import ru.smartycraft.Launcher;

public class ce {
   private static int a = 0;
   public static boolean a = true;

   public static int a() {
      return (int)(System.currentTimeMillis() / 1000L) - a;
   }

   public static void a(int var0) {
      int var1 = (int)(System.currentTimeMillis() / 1000L);
      a = var1 - var0;
   }

   public static String a(int var0, String[] var1) {
      if (var0 < 0) {
         var0 = -var0;
      }

      int[] var2 = new int[]{2, 0, 1, 1, 1, 2};
      return var1[var0 % 100 > 4 && var0 % 100 < 20 ? 2 : var2[var0 % 10 < 5 ? var0 % 10 : 5]];
   }

   public static String a(String var0, int var1) {
      return var0.substring(var0.length() - var1, var0.length());
   }

   public static String a(int var0) {
      Instant var1 = Instant.ofEpochSecond(var0);
      StringBuilder var2 = new StringBuilder();
      GregorianCalendar var3 = new GregorianCalendar();
      GregorianCalendar var4 = new GregorianCalendar();
      Date var5 = Date.from(var1);
      var4.setTime(var5);
      if (var4.get(6) == var3.get(6)) {
         var2.append(Launcher.a("utils.today"));
      } else if (var4.get(6) + 1 == var3.get(6)) {
         var2.append(Launcher.a("utils.yesterday"));
      } else if (var4.get(6) - 1 == var3.get(6)) {
         var2.append(Launcher.a("utils.tomorrow"));
      } else {
         var2.append(var4.get(5)).append(" ");
         var2.append(Launcher.a("utils.months").split(",")[var4.get(2)]);
      }

      SimpleDateFormat var6 = new SimpleDateFormat("HH:mm");
      var2.append(" ").append(var6.format(var4.getTime()));
      return var2.toString();
   }

   public static void a(String var0) {
      if (Desktop.isDesktopSupported()) {
         try {
            Desktop.getDesktop().browse(new URI(var0));
         } catch (IOException var2) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var2.getMessage());
         } catch (URISyntaxException var3) {
            Launcher.a.log(Level.SEVERE, "URISyntaxException {0}", var3.getMessage());
         }
      }
   }

   public static void a(File var0) {
      if (Desktop.isDesktopSupported() && var0.isDirectory()) {
         try {
            Desktop.getDesktop().open(var0);
         } catch (IOException var2) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var2.getMessage());
         }
      }
   }

   public static String a() {
      return Launcher.a("main.title")
         + " v"
         + "3.6.2"
         + (Launcher.a.b() ? " " + Launcher.a("main.offlinemode") : (Launcher.a.c() ? " " + Launcher.a("main.testmode") : ""))
         + (a ? "" : " " + Launcher.a("main.nossl"))
         + (Launcher.a.e() ? " " + Launcher.a("main.proxy") : "");
   }

   public static String a(String var0) {
      StringBuilder var1 = new StringBuilder();
      if (Launcher.a.c()) {
         var1.append(a ? "https://" : "http://");
      } else {
         var1.append(a ? "https://" : "http://");
      }

      var1.append(Launcher.a.c() ? "test.smartycraft.ru" : "www.smartycraft.ru");
      var1.append("/").append(var0);
      return var1.toString();
   }
}
