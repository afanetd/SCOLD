import com.sun.management.OperatingSystemMXBean;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import ru.smartycraft.Launcher;

public class cb {
   private static final String[] a = new String[]{
      "00-50-56",
      "00-0C-29",
      "00-05-69",
      "00-03-FF",
      "00-1C-42",
      "00-0F-4B",
      "00-16-3E",
      "08-00-27",
      "00-1E-10",
      "0C-5B-8F",
      "0A-00-27",
      "58-2C-80",
      "36-4B-50"
   };

   public static cc a() {
      String var0 = System.getProperty("os.name").toLowerCase();
      if (var0.contains("win")) {
         return cc.a;
      } else if (var0.contains("linux")) {
         return cc.c;
      } else if (var0.contains("unix")) {
         return cc.c;
      } else if (var0.contains("mac")) {
         return cc.b;
      } else if (var0.contains("solaris")) {
         return cc.d;
      } else {
         return var0.contains("sunos") ? cc.d : cc.e;
      }
   }

   public static String a() {
      return System.getProperty("os.name");
   }

   public static int a() {
      String var0 = System.getenv("PROCESSOR_ARCHITECTURE");
      String var1 = System.getenv("PROCESSOR_ARCHITEW6432");
      if (var0 == null) {
         return System.getProperty("os.arch").endsWith("64") ? 64 : 32;
      } else {
         return !var0.endsWith("64") && (var1 == null || !var1.endsWith("64")) ? 32 : 64;
      }
   }

   public static int b() {
      return System.getProperty("sun.arch.data.model").contains("64") ? 64 : 32;
   }

   public static String b() {
      return System.getProperty("java.version");
   }

   public static String c() {
      return System.getProperty("java.home");
   }

   public static String d() {
      String var0 = System.getProperty("java.class.path");
      if (a() == cc.a) {
         Charset var1 = Charset.forName("WINDOWS-1251");
         ByteBuffer var2 = var1.encode(var0);
         byte[] var3 = var2.array();
         return new String(var3);
      } else {
         return var0;
      }
   }

   public static String e() {
      HashMap var0 = new HashMap();

      try {
         for (NetworkInterface var2 : Collections.list(NetworkInterface.getNetworkInterfaces())) {
            if (var2 != null && !var2.isVirtual()) {
               byte[] var3 = var2.getHardwareAddress();
               if (var3 != null) {
                  String var4 = "";

                  for (int var5 = 0; var5 < var3.length; var5++) {
                     var4 = var4 + new Formatter().format("%02X%s", var3[var5], var5 < var3.length - 1 ? "-" : "").toString();
                  }

                  List var13 = Arrays.asList(a);
                  if (!var13.contains(var4.substring(0, 8))) {
                     Enumeration var6 = var2.getInetAddresses();

                     while (var6.hasMoreElements()) {
                        String var7 = ((InetAddress)var6.nextElement()).getHostAddress();
                        var0.put(var7, var4);
                     }
                  }
               }
            }
         }
      } catch (SocketException var8) {
         Launcher.a.log(Level.SEVERE, "SocketException {0}", var8.getMessage());
      }

      if (!var0.isEmpty()) {
         String var9 = null;
         String var10 = null;
         String var11 = null;
         String var12 = null;

         for (String var15 : var0.keySet()) {
            if (var15.startsWith("192.168.")) {
               var9 = var15;
            } else if (var15.contains("eth")) {
               var10 = var15;
            } else if (var15.contains("wlan")) {
               var11 = var15;
            } else if (var15.contains("net")) {
               var12 = var15;
            }
         }

         if (var9 != null) {
            return (String)var0.get(var9);
         } else if (var10 != null) {
            return (String)var0.get(var10);
         } else if (var11 != null) {
            return (String)var0.get(var11);
         } else {
            return var12 != null ? (String)var0.get(var12) : (String)var0.values().iterator().next();
         }
      } else {
         return null;
      }
   }

   public static String f() {
      String var0 = System.getProperty("java.home") + File.separator + "lib" + File.separator + "rt.jar";
      File var1 = new File(var0);
      return var1.exists() ? bx.a(var1) : null;
   }

   public static String g() {
      File var0;
      if (h().equals("exe")) {
         String var1 = System.getProperty("java.library.path");
         var0 = new File(var1.substring(0, var1.indexOf(59)), "java.exe");
      } else {
         var0 = new File(System.getProperty("java.home") + File.separator + "bin" + File.separator + "java.exe");
      }

      return var0.exists() ? var0.getAbsolutePath() : "java";
   }

   public static int c() {
      return (int)(((OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getFreePhysicalMemorySize() / 1048576L);
   }

   public static int a(boolean var0) {
      return b() == 64 ? (var0 ? 4096 : 8192) : 1024;
   }

   public static File a() {
      try {
         return new File(Launcher.class.getProtectionDomain().getCodeSource().getLocation().toURI());
      } catch (URISyntaxException var1) {
         Launcher.a.log(Level.SEVERE, "URISyntaxException {0}", var1.getMessage());
         return null;
      }
   }

   public static String h() {
      File var0 = a();
      if (var0.getName().endsWith(".exe")) {
         return "exe";
      } else {
         return var0.getName().endsWith(".jar") ? "jar" : "error";
      }
   }

   public static String i() {
      String var0 = bx.a(a());
      return var0 == null ? new String() : var0;
   }

   public static void a() {
      try {
         String var0 = "netsh advfirewall firewall set rule name=\"Java(TM) Platform SE binary\" new profile=any enable=yes";
         Process var1 = Runtime.getRuntime().exec(var0);
         var1.waitFor();
      } catch (InterruptedException | IOException var2) {
      }
   }
}
