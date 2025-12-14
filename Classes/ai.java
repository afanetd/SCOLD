import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import ru.smartycraft.Launcher;

public class ai {
   private final ru.smartycraft.a a;
   private final ru.smartycraft.h a;
   private final bw a;
   private final List<String> a = new ArrayList();
   private final StringBuilder a = new StringBuilder();
   private final String a = cb.a() == cc.a ? ";" : ":";
   private final List<String> b = new ArrayList();

   public ai(ru.smartycraft.a var1, bw var2, ru.smartycraft.h var3) {
      this.a = var1;
      this.a = var3;
      this.a = var2;
      if (var1.a().d().equals("1.21.1")) {
         this.b.add(File.separator + "net" + File.separator + "minecraft" + File.separator + "client" + File.separator + "1.21.1-20240808.144430");
         this.b.add(File.separator + "net" + File.separator + "neoforged" + File.separator + "neoforge");
         this.b.add(File.separator + "net" + File.separator + "neoforged" + File.separator + "srgutils");
      }

      this.a();
   }

   private void a() {
      ru.smartycraft.b var1 = Launcher.a.a();
      this.b();
      int var2 = var1.h ? cb.c() : var1.a;
      if (var2 < 512) {
         var2 = 512;
      }

      if (var2 > cb.a(var1.h)) {
         var2 = cb.a(var1.h);
      }

      int var3 = 854;
      int var4 = 480;
      GraphicsDevice var5 = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      int var6 = var5.getDisplayMode().getHeight();
      if (var6 > 1080) {
         var4 = (int)(0.45 * var6);
         var3 = (int)(var4 * 1.78);
      }

      try {
         String var7 = this.a.a().d();
         switch (var7) {
            case "1.12.2":
               if (this.a.a().a()) {
                  this.a(new File(this.a.g, "bin" + File.separator + "javaw.exe").getAbsolutePath());
               } else {
                  this.a(cb.g());
               }

               if (cb.a() == cc.b) {
                  this.a("-Xdock:icon=\"" + this.a.b.getAbsolutePath() + "/objects/99/991b421dfd401f115241601b2b373140a8d78572\"");
                  this.a("-Xdock:name=SMARTYcraft");
                  this.a("-Djava.library.path=" + this.a.c.getAbsolutePath());
                  this.a("-cp");
                  this.a(
                     this.a.d.getAbsolutePath()
                        + "/forge-1.12.2-14.23.5.2922-universal.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/asm-debug-all-5.2.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/launchwrapper-1.12.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/jline-3.5.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/akka-actor_2.11-2.3.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/config-1.2.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-actors-migration_2.11-1.1.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-compiler-2.11.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-continuations-library_2.11-1.0.2_mc.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-continuations-plugin_2.11.1-1.0.2_mc.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-library-2.11.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-parser-combinators_2.11-1.0.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-reflect-2.11.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-swing_2.11-1.0.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/scala-xml_2.11-1.0.2.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/lzma-0.0.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/vecmath-1.5.2.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/trove4j-3.0.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/maven-artifact-3.5.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/jopt-simple-5.0.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/log4j-api-2.15.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/log4j-core-2.15.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/patchy-1.3.9.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/oshi-core-1.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/jna-4.4.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/platform-3.4.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/icu4j-core-mojang-51.2.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/jopt-simple-5.0.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/codecjorbis-20101023.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/codecwav-20101023.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/libraryjavasound-20101123.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/librarylwjglopenal-20100824.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/soundsystem-20120107.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/netty-all-4.1.9.Final.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/guava-21.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/commons-lang3-3.5.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/commons-io-2.5.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/commons-codec-1.10.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/jinput-2.0.5.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/jutils-1.0.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/gson-2.8.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/authlib-1.5.25.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/realms-1.10.22.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/commons-compress-1.8.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/httpclient-4.3.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/commons-logging-1.1.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/httpcore-4.3.2.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/fastutil-7.1.0.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/log4j-api-2.8.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/log4j-core-2.8.1.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/lwjgl-2.9.2-nightly-20140822.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/lwjgl_util-2.9.2-nightly-20140822.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/text2speech-1.10.3.jar:"
                        + this.a.d.getAbsolutePath()
                        + "/java-objc-bridge-1.0.0.jar:"
                        + this.a.f.getAbsolutePath()
                        + "/smartycraft-1.12.2.jar"
                  );
                  this.a("-Xmx3000M");
                  this.a("-XX:+UnlockExperimentalVMOptions");
                  this.a("-XX:+UseG1GC");
                  this.a("-XX:G1NewSizePercent=20");
                  this.a("-XX:G1ReservePercent=20");
                  this.a("-XX:MaxGCPauseMillis=50");
                  this.a("-XX:G1HeapRegionSize=32M");
                  this.a("-Dfml.ignoreInvalidMinecraftCertificates=true");
                  this.a("-Dfml.ignorePatchDiscrepancies=true");
                  this.a("-Djava.net.preferIPv4Stack=true");
                  this.a("-Dminecraft.applet.TargetDirectory=" + this.a.a.getAbsolutePath());
                  this.a("net.minecraft.launchwrapper.Launch");
                  this.a("--username", this.a.a());
                  this.a("--version", "Forge " + this.a.a().d());
                  this.a("--gameDir", this.a.e.getAbsolutePath());
                  this.a("--assetsDir", this.a.b.getAbsolutePath());
                  this.a("--assetIndex", this.a.a().d());
                  if (Launcher.a.b()) {
                     this.a("--accessToken", "undefined");
                  } else {
                     this.a("--accessToken", this.a.c());
                  }

                  this.a("--userType mojang");
                  this.a("--tweakClass", "net.minecraftforge.fml.common.launcher.FMLTweaker");
                  this.a("--versionType Forge");
                  this.a("--width", String.valueOf(var3));
                  this.a("--height", String.valueOf(var4));
                  if (Launcher.a.a().f && !Launcher.a.b()) {
                     this.a("--server", this.a.a().c());
                     this.a("--port", String.valueOf(this.a.a().a()));
                  }

                  if (Launcher.a.e()) {
                     this.a("--proxyHost", "proxy.smartycraft.ru");
                     this.a("--proxyPort", String.valueOf(1080));
                     this.a("--proxyUser", "proxyuser");
                     this.a("--proxyPass", "cHJveHl1c2VycHJveHl1c2Vy");
                  }
               } else {
                  if (var1.i) {
                     this.a("-XX:+UseG1GC");
                     this.a("-XX:+TieredCompilation");
                     this.a("-XX:+UseFastEmptyMethods");
                     this.a("-XX:+AggressiveOpts");
                  } else {
                     this.a("-XX:+UseConcMarkSweepGC");
                     this.a("-XX:+CMSIncrementalMode");
                  }

                  this.a("-Xms512M");
                  this.a("-Xmx" + var2 + "M");
                  this.a("-XX:-DisableAttachMechanism");
                  this.a("-XX:-UseFastAccessorMethods");
                  this.a("-XX:-UseAdaptiveSizePolicy");
                  this.a("-XX:HeapDumpPath=ThisTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
                  this.a("-Xmn128M");
                  if (cb.a() == cc.b) {
                     this.a("-Xdock:icon=" + new File(this.a.b, "icons/minecraft.icns").getAbsolutePath());
                     this.a("-Xdock:name=SMARTYcraft");
                     this.a("-Dminecraft.applet.TargetDirectory=" + this.a.a.getAbsolutePath());
                  }

                  this.a("-Dfml.ignoreInvalidMinecraftCertificates=true");
                  this.a("-Dfml.ignorePatchDiscrepancies=true");
                  if (cb.a() != cc.b) {
                     this.a("-Dorg.lwjgl.opengl.Display.allowSoftwareOpenGL=true");
                  }

                  this.a("-Djava.library.path=" + this.a.c.getAbsolutePath());
                  this.a("-cp", this.a.toString());
                  this.a("net.minecraft.launchwrapper.Launch");
                  this.a("--tweakClass", "net.minecraftforge.fml.common.launcher.FMLTweaker");
                  this.a("--username", this.a.a());
                  this.a("--version", "Forge " + this.a.a().d());
                  this.a("--gameDir", this.a.e.getAbsolutePath());
                  this.a("--assetsDir", this.a.b.getAbsolutePath());
                  this.a("--uuid", this.a.b());
                  if (Launcher.a.b()) {
                     this.a("--accessToken", "undefined");
                  } else {
                     this.a("--accessToken", this.a.c());
                  }

                  this.a("--userProperties", "{}");
                  this.a("--assetIndex", this.a.a().d());
                  if (Launcher.a.a().b) {
                     this.a("--fullscreen", "true");
                  }

                  this.a("--width", String.valueOf(var3));
                  this.a("--height", String.valueOf(var4));
                  if (Launcher.a.a().f && !Launcher.a.b()) {
                     this.a("--server", this.a.a().c());
                     this.a("--port", String.valueOf(this.a.a().a()));
                  }

                  if (Launcher.a.e()) {
                     this.a("--proxyHost", "proxy.smartycraft.ru");
                     this.a("--proxyPort", String.valueOf(1080));
                     this.a("--proxyUser", "proxyuser");
                     this.a("--proxyPass", "cHJveHl1c2VycHJveHl1c2Vy");
                  }
               }
               break;
            case "1.16.5":
               if (this.a.a().a()) {
                  this.a(new File(this.a.g, "bin" + File.separator + "javaw.exe").getAbsolutePath());
               } else {
                  this.a(cb.g());
               }

               this.a("-Dos.name=Windows 10");
               this.a("-Dos.version=10.0");
               this.a("-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
               this.a("-Xss1M");
               this.a("-Djava.library.path=" + this.a.c.getAbsolutePath());
               this.a("-Dminecraft.launcher.brand=smartycraft");
               this.a("-Dminecraft.launcher.version=3.6.2");
               this.a("-cp", this.a.toString());
               this.a("-XX:+IgnoreUnrecognizedVMOptions");
               this.a("--add-exports=java.base/sun.security.util=ALL-UNNAMED");
               this.a("--add-exports=jdk.naming.dns/com.sun.jndi.dns=java.naming");
               this.a("--add-opens=java.base/java.util.jar=ALL-UNNAMED");
               this.a("-Xmx" + var2 + "M");
               this.a("-XX:+UnlockExperimentalVMOptions");
               this.a("-XX:+UseG1GC");
               this.a("-XX:G1NewSizePercent=20");
               this.a("-XX:G1ReservePercent=20");
               this.a("-XX:MaxGCPauseMillis=50");
               this.a("-XX:G1HeapRegionSize=32M");
               this.a("-Dfml.ignoreInvalidMinecraftCertificates=true");
               this.a("-Dfml.ignorePatchDiscrepancies=true");
               this.a("-Djava.net.preferIPv4Stack=true");
               this.a("-Dminecraft.applet.TargetDirectory=" + this.a.a.getAbsolutePath());
               this.a("-Dminecraft.api.env=smartycraft");
               this.a("-Dminecraft.api.auth.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.account.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.session.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.services.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dlog4j.configurationFile=" + new File(this.a.b, "log_configs" + File.separator + "client-1.12.xml"));
               this.a("cpw.mods.modlauncher.Launcher");
               this.a("--username", this.a.a());
               this.a("--version", "Forge " + this.a.a().d());
               this.a("--gameDir", this.a.e.getAbsolutePath());
               this.a("--assetsDir", this.a.b.getAbsolutePath());
               this.a("--uuid", this.a.b());
               if (Launcher.a.b()) {
                  this.a("--accessToken", "undefined");
               } else {
                  this.a("--accessToken", this.a.c());
               }

               this.a("--userProperties", "{}");
               this.a("--assetIndex", this.a.a().d());
               if (Launcher.a.a().b) {
                  this.a("--fullscreen", "true");
               }

               this.a("--width", String.valueOf(var3));
               this.a("--height", String.valueOf(var4));
               if (Launcher.a.a().f && !Launcher.a.b()) {
                  this.a("--server", this.a.a().c());
                  this.a("--port", String.valueOf(this.a.a().a()));
               }

               if (Launcher.a.e()) {
                  this.a("--proxyHost", "proxy.smartycraft.ru");
                  this.a("--proxyPort", String.valueOf(1080));
                  this.a("--proxyUser", "proxyuser");
                  this.a("--proxyPass", "cHJveHl1c2VycHJveHl1c2Vy");
               }

               this.a("--launchTarget", "fmlclient");
               this.a("--fml.forgeVersion", "36.2.120");
               this.a("--fml.mcVersion", "1.16.5");
               this.a("--fml.forgeGroup", "net.minecraftforge");
               this.a("--fml.mcpVersion", "20210115.111550");
               break;
            case "1.18.2":
               if (this.a.a().a()) {
                  this.a(new File(this.a.g, "bin" + File.separator + "javaw.exe").getAbsolutePath());
               } else {
                  this.a(cb.g());
               }

               this.a("-Dos.name=Windows 10");
               this.a("-Dos.version=10.0");
               this.a("-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
               this.a("-Xss1M");
               this.a("-Djava.library.path=" + this.a.c.getAbsolutePath());
               this.a("-Dminecraft.api.env=SMARTYcraft");
               this.a("-Dminecraft.api.auth.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.account.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.session.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.services.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.launcher.brand=SMARTYcraft");
               this.a("-Dminecraft.launcher.version=3.6.2");
               this.a("-cp", this.a.toString());
               this.a("-Djava.net.preferIPv6Addresses=system");
               this.a(
                  "-DignoreList=client-1.18.2-,text2speech-1.12.4-natives-windows,bootstraplauncher,securejarhandler,asm-commons,asm-util,asm-analysis,asm-tree,asm,client-extra,fmlcore,javafmllanguage,lowcodelanguage,mclanguage,forge-,smartycraft-1.18.2.jar"
               );
               this.a("-DmergeModules=jna-5.10.0.jar,jna-platform-5.10.0.jar,java-objc-bridge-1.0.0.jar");
               this.a("-DlibraryDirectory=" + this.a.d);
               String var9 = new File(this.a.d, "/cpw/mods/bootstraplauncher/1.0.0/bootstraplauncher-1.0.0.jar").getAbsolutePath()
                  + this.a
                  + new File(this.a.d, "/cpw/mods/securejarhandler/1.0.3/securejarhandler-1.0.3.jar").getAbsolutePath()
                  + this.a
                  + new File(this.a.d, "/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.jar").getAbsolutePath()
                  + this.a
                  + new File(this.a.d, "/org/ow2/asm/asm-util/9.2/asm-util-9.2.jar").getAbsolutePath()
                  + this.a
                  + new File(this.a.d, "/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.jar").getAbsolutePath()
                  + this.a
                  + new File(this.a.d, "/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.jar").getAbsolutePath()
                  + this.a
                  + new File(this.a.d, "/org/ow2/asm/asm/9.2/asm-9.2.jar").getAbsolutePath();
               this.a("-p", var9);
               this.a("--add-modules", "ALL-MODULE-PATH");
               this.a("--add-opens", "java.base/java.util.jar=cpw.mods.securejarhandler");
               this.a("--add-exports", "java.base/sun.security.util=cpw.mods.securejarhandler");
               this.a("--add-exports", "jdk.naming.dns/com.sun.jndi.dns=java.naming");
               this.a("-Xmx" + var2 + "M");
               this.a("-XX:+UnlockExperimentalVMOptions");
               this.a("-XX:+UseG1GC");
               this.a("-XX:G1NewSizePercent=20");
               this.a("-XX:G1ReservePercent=20");
               this.a("-XX:MaxGCPauseMillis=50");
               this.a("-XX:G1HeapRegionSize=32M");
               this.a("-Dfml.ignoreInvalidMinecraftCertificates=true");
               this.a("-Dfml.ignorePatchDiscrepancies=true");
               this.a("-Djava.net.preferIPv4Stack=true");
               this.a("-Dminecraft.applet.TargetDirectory=" + this.a.a.getAbsolutePath());
               this.a("-Dlog4j.configurationFile=" + new File(this.a.b, "log_configs" + File.separator + "client-1.12.xml"));
               this.a("cpw.mods.bootstraplauncher.BootstrapLauncher");
               this.a("--username", this.a.a());
               this.a("--version", "Forge " + this.a.a().d());
               this.a("--gameDir", this.a.e.getAbsolutePath());
               this.a("--assetsDir", this.a.b.getAbsolutePath());
               this.a("--assetIndex", this.a.a().d());
               this.a("--uuid", this.a.b());
               if (Launcher.a.b()) {
                  this.a("--accessToken", "undefined");
               } else {
                  this.a("--accessToken", this.a.c());
               }

               this.a("--userType", "mojang");
               this.a("--versionType", "modified");
               if (Launcher.a.a().b) {
                  this.a("--fullscreen", "true");
               }

               this.a("--width", String.valueOf(var3));
               this.a("--height", String.valueOf(var4));
               if (Launcher.a.a().f && !Launcher.a.b()) {
                  this.a("--server", this.a.a().c());
                  this.a("--port", String.valueOf(this.a.a().a()));
               }

               this.a("--launchTarget", "forgeclient");
               this.a("--fml.forgeVersion", "40.1.102");
               this.a("--fml.mcVersion", "1.18.2");
               this.a("--fml.forgeGroup", "net.minecraftforge");
               this.a("--fml.mcpVersion", "20220404.173914");
               break;
            case "1.21.1":
               if (this.a.a().a()) {
                  this.a(new File(this.a.g, "bin" + File.separator + "javaw.exe").getAbsolutePath());
               } else {
                  this.a(cb.g());
               }

               this.a("-Dos.name=Windows 10");
               this.a("-Dos.version=10.0");
               this.a("-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
               this.a("-Xss1M");
               this.a("-Djava.library.path=" + this.a.c.getAbsolutePath());
               this.a("-Djna.tmpdir=" + this.a.c.getAbsolutePath());
               this.a("-Dorg.lwjgl.system.SharedLibraryExtractPath=" + this.a.c.getAbsolutePath());
               this.a("-Dio.netty.native.workdir=" + this.a.c.getAbsolutePath());
               this.a("-Dminecraft.launcher.brand=smartycraft");
               this.a("-Dminecraft.launcher.version=3.6.2");
               this.a("-cp", this.a.toString());
               this.a("-Djava.net.preferIPv6Addresses=system");
               this.a(
                  "-DignoreList=securejarhandler-3.0.8.jar,asm-9.7.jar,asm-commons-9.7.jar,asm-tree-9.7.jar,asm-util-9.7.jar,asm-analysis-9.7.jar,bootstraplauncher-2.0.2.jar,JarJarFileSystems-0.4.1.jar,client-extra,neoforge-,neoforge-21.1.504.jar"
               );
               this.a("-DmergeModules=jna-5.10.0.jar,jna-platform-5.10.0.jar");
               this.a("-Dfml.pluginLayerLibraries=");
               this.a("-Dfml.gameLayerLibraries=");
               this.a("-DlibraryDirectory=" + this.a.d.getAbsolutePath());
               this.a("-p");
               this.a(
                  this.a.d.getAbsolutePath()
                     + "/cpw/mods/securejarhandler/3.0.8/securejarhandler-3.0.8.jar;"
                     + this.a.d.getAbsolutePath()
                     + "/org/ow2/asm/asm/9.7/asm-9.7.jar;"
                     + this.a.d.getAbsolutePath()
                     + "/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.jar;"
                     + this.a.d.getAbsolutePath()
                     + "/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.jar;"
                     + this.a.d.getAbsolutePath()
                     + "/org/ow2/asm/asm-util/9.7/asm-util-9.7.jar;"
                     + this.a.d.getAbsolutePath()
                     + "/org/ow2/asm/asm-analysis/9.7/asm-analysis-9.7.jar;"
                     + this.a.d.getAbsolutePath()
                     + "/cpw/mods/bootstraplauncher/2.0.2/bootstraplauncher-2.0.2.jar;"
                     + this.a.d.getAbsolutePath()
                     + "/net/neoforged/JarJarFileSystems/0.4.1/JarJarFileSystems-0.4.1.jar"
               );
               this.a("--add-modules", "ALL-MODULE-PATH");
               this.a("--add-opens", "java.base/java.util.jar=cpw.mods.securejarhandler");
               this.a("--add-opens", "java.base/java.lang.invoke=cpw.mods.securejarhandler");
               this.a("--add-exports", "java.base/sun.security.util=cpw.mods.securejarhandler");
               this.a("--add-exports", "jdk.naming.dns/com.sun.jndi.dns=java.naming");
               this.a("-Xmx" + var2 + "M");
               this.a("-XX:+UnlockExperimentalVMOptions");
               this.a("-XX:+UseG1GC");
               this.a("-XX:G1NewSizePercent=20");
               this.a("-XX:G1ReservePercent=20");
               this.a("-XX:MaxGCPauseMillis=50");
               this.a("-XX:G1HeapRegionSize=32M");
               this.a("-Dfml.ignoreInvalidMinecraftCertificates=true");
               this.a("-Dfml.ignorePatchDiscrepancies=true");
               this.a("-Djava.net.preferIPv4Stack=true");
               this.a("-Dminecraft.applet.TargetDirectory=" + this.a.a.getAbsolutePath());
               this.a("-Dlog4j.configurationFile=" + new File(this.a.b, "log_configs" + File.separator + "client-1.12.xml"));
               this.a("-Dminecraft.api.env=smartycraft");
               this.a("-Dminecraft.api.auth.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.account.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.session.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("-Dminecraft.api.services.host=http://" + (var1.a ? "test.smartycraft.ru" : "www.smartycraft.ru"));
               this.a("cpw.mods.bootstraplauncher.BootstrapLauncher");
               this.a("--username", this.a.a());
               this.a("--version", "Forge " + this.a.a().d());
               this.a("--gameDir", this.a.e.getAbsolutePath());
               this.a("--assetsDir", this.a.b.getAbsolutePath());
               this.a("--uuid", this.a.b());
               if (Launcher.a.b()) {
                  this.a("--accessToken", "undefined");
               } else {
                  this.a("--accessToken", this.a.c());
               }

               this.a("--userProperties", "{}");
               this.a("--assetIndex", this.a.a().d());
               if (Launcher.a.a().b) {
                  this.a("--fullscreen", "true");
               }

               this.a("--width", String.valueOf(var3));
               this.a("--height", String.valueOf(var4));
               if (Launcher.a.a().f && !Launcher.a.b()) {
                  this.a("--quickPlayMultiplayer", this.a.a().c() + ":" + this.a.a().a());
               }

               if (Launcher.a.e()) {
                  this.a("--proxyHost", "proxy.smartycraft.ru");
                  this.a("--proxyPort", String.valueOf(1080));
                  this.a("--proxyUser", "proxyuser");
                  this.a("--proxyPass", "cHJveHl1c2VycHJveHl1c2Vy");
               }

               this.a("--fml.neoForgeVersion", "21.1.504");
               this.a("--fml.fmlVersion", "4.0.34");
               this.a("--fml.mcVersion", "1.21.1");
               this.a("--fml.neoFormVersion", "20240808.144430");
               this.a("--launchTarget", "forgeclient");
               break;
            case "1.7.10":
               if (this.a.a().a()) {
                  this.a(new File(this.a.g, "bin" + File.separator + "javaw.exe").getAbsolutePath());
               } else {
                  this.a(cb.g());
               }

               if (var1.i) {
                  this.a("-XX:+UseG1GC");
                  this.a("-XX:+TieredCompilation");
                  this.a("-XX:+UseFastEmptyMethods");
                  this.a("-XX:+AggressiveOpts");
               } else {
                  this.a("-XX:+UseConcMarkSweepGC");
                  this.a("-XX:+CMSIncrementalMode");
               }

               this.a("-Xms512M");
               this.a("-Xmx" + var2 + "M");
               this.a("-XX:-DisableAttachMechanism");
               this.a("-XX:-UseFastAccessorMethods");
               this.a("-XX:-UseAdaptiveSizePolicy");
               this.a("-XX:HeapDumpPath=ThisTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
               this.a("-Xmn128M");
               if (cb.a() == cc.b) {
                  this.a("-Xdock:icon=" + new File(this.a.b, "icons/minecraft.icns").getAbsolutePath());
                  this.a("-Xdock:name=SMARTYcraft");
               }

               this.a("-Dfml.ignoreInvalidMinecraftCertificates=true");
               this.a("-Dfml.ignorePatchDiscrepancies=true");
               this.a("-Dorg.lwjgl.opengl.Display.allowSoftwareOpenGL=true");
               this.a("-Djava.library.path=" + this.a.c.getAbsolutePath());
               this.a("-cp", this.a.toString());
               this.a("net.minecraft.launchwrapper.Launch");
               this.a("--tweakClass", "cpw.mods.fml.common.launcher.FMLTweaker");
               this.a("--username", this.a.a());
               this.a("--version", "Forge " + this.a.a().d());
               this.a("--gameDir", this.a.e.getAbsolutePath());
               this.a("--assetsDir", this.a.b.getAbsolutePath());
               this.a("--uuid", this.a.b());
               if (Launcher.a.b()) {
                  this.a("--accessToken", "undefined");
               } else {
                  this.a("--accessToken", this.a.c());
               }

               this.a("--userProperties", "{}");
               this.a("--assetIndex", this.a.a().d());
               if (Launcher.a.a().b) {
                  this.a("--fullscreen", "true");
               }

               this.a("--width", String.valueOf(var3));
               this.a("--height", String.valueOf(var4));
               if (Launcher.a.a().f && !Launcher.a.b()) {
                  this.a("--server", this.a.a().c());
                  this.a("--port", String.valueOf(this.a.a().a()));
               }
         }

         Launcher.a.log(Level.INFO, this.a.toString());
      } catch (NullPointerException var12) {
         Launcher.a.log(Level.SEVERE, "NullPointerException {0}", var12.getMessage());
         this.a.a(ac.h);
         this.a.b(var12.getMessage());
         return;
      }

      this.a.c();

      try {
         ProcessBuilder var13 = new ProcessBuilder(this.a);
         var13.directory(this.a.e);
         var13.redirectErrorStream(true);
         Map var14 = var13.environment();
         var14.put("_JAVA_OPTS", "");
         var14.put("_JAVA_OPTIONS", "");
         var14.put("JAVA_OPTS", "");
         var14.put("JAVA_OPTIONS", "");
         Process var15 = var13.start();
         Launcher.a.log(Level.INFO, "Minecraft process started");
         if (this.a.a().d().equals("1.21.1")) {
            this.a.a(ac.g);
         } else {
            this.a.a(ac.f);
         }

         aj var10 = new aj(this.a, var15, this.a);
         var10.a(this);
      } catch (IOException var11) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var11.getMessage());
      }
   }

   public void a(aj var1) {
      int var2 = var1.a();
      Launcher.a.a(var2);
      this.a.a(ac.i);
      Launcher.a.log(Level.INFO, "Minecraft process ended with exit code {0}", var2);
   }

   private void a(String var1) {
      if (var1 != null) {
         this.a.add(var1);
      }
   }

   private void a(String var1, String var2) {
      if (var2 != null) {
         this.a.add(var1);
         this.a.add(var2);
      } else {
         throw new NullPointerException(Launcher.a("prepare.error.parameterisnull", var1));
      }
   }

   private void b() {
      if (!Launcher.a.b()) {
         this.a.b();
         bc var1 = this.a.a();
         if (var1.a != null && var1.a.containsKey(this.a.d.getName())) {
            this.a(this.a.d, (bc)var1.a.get(this.a.d.getName()));
            this.a.append(this.a.f.getAbsolutePath());
         }
      } else {
         this.a(this.a.d);
         this.a.append(this.a.f.getAbsolutePath());
      }
   }

   private void a(File var1, bc var2) {
      AtomicBoolean var3 = new AtomicBoolean(false);
      this.b.forEach(var2x -> {
         if (var1.getAbsolutePath().endsWith(var2x)) {
            var3.set(true);
         }
      });
      if (!var3.get()) {
         if (var2.b != null) {
            var2.b.keySet().forEach(var2x -> this.a.append(var1.getAbsolutePath()).append(File.separator).append(var2x).append(this.a));
         }

         if (var2.a != null) {
            var2.a.keySet().forEach(var3x -> this.a(new File(var1, var3x), (bc)var2.a.get(var3x)));
         }
      }
   }

   private void a(File var1) {
      cc var2 = cb.a();

      for (File var6 : var1.listFiles()) {
         if (var6.isFile()) {
            String var7 = var6.getName();
            this.a.append(var6.getAbsolutePath()).append(this.a);
         } else {
            this.a(var6);
         }
      }
   }
}
