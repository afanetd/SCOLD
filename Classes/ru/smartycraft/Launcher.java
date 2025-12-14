package ru.smartycraft;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.Proxy.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Launcher extends Application {
   public static Launcher a;
   public static final Logger a = Logger.getLogger(Launcher.class.getName());
   private final ru.smartycraft.f a;
   private ru.smartycraft.b a;
   private final ru.smartycraft.d a;
   private Stage a;
   private Scene a;
   private m a;
   private p a;
   private ae a;
   private s a;
   private j a;
   private n a;
   private ag a;
   private AnchorPane a;
   private AnchorPane b;
   private aa a;
   private ba a;
   private ru.smartycraft.h a;
   private ru.smartycraft.i a;
   private ru.smartycraft.a a;
   private boolean a = false;
   private final ru.smartycraft.k a;
   private boolean b;
   private boolean c;
   private int a = 0;
   private boolean d = false;
   private bb a;
   private Proxy a;

   public Launcher() {
      a = this;
      ConsoleHandler var1 = new ConsoleHandler();
      var1.setFormatter(new ca());
      var1.setLevel(Level.OFF);
      LogManager.getLogManager().reset();
      a.addHandler(var1);
      this.a = new ru.smartycraft.f("ru_RU");
      this.a = new ru.smartycraft.d();
      this.a = new ru.smartycraft.k();
      Authenticator.setDefault(this.a("proxyuser", bx.c("cHJveHl1c2VycHJveHl1c2Vy")));
      this.a = Proxy.NO_PROXY;
   }

   public void start(Stage var1) {
      this.a = var1;
      this.b();
   }

   public void a() {
      try {
         this.a = ru.smartycraft.b.a();
         this.a.a();
      } catch (Exception var2) {
         a.log(Level.SEVERE, "Exception {0}", var2.getMessage());
      }
   }

   public ru.smartycraft.b a() {
      return this.a;
   }

   public ru.smartycraft.d a() {
      return this.a;
   }

   public Stage a() {
      return this.a;
   }

   public ru.smartycraft.h a() {
      return this.a;
   }

   public ru.smartycraft.k a() {
      return this.a;
   }

   public void b() {
      try {
         FXMLLoader var1 = new FXMLLoader();
         var1.setLocation(Launcher.class.getResource("/fxml/Loader.fxml"));
         Scene var2 = new Scene((Parent)var1.load());
         var2.setFill(Color.TRANSPARENT);
         this.a.setScene(var2);
         this.a.initStyle(StageStyle.TRANSPARENT);
         this.a.setResizable(false);
         this.a.getIcons().add(this.a.a(ru.smartycraft.k.a));
         this.a.show();
         this.a = (m)var1.getController();
      } catch (IOException var3) {
         a.log(Level.SEVERE, "IOException {0}", var3.getMessage());
      }
   }

   public void a(ba var1) {
      this.a = var1;

      try {
         FXMLLoader var2 = new FXMLLoader();
         var2.setLocation(Launcher.class.getResource("/fxml/Main.fxml"));
         this.a.close();
         this.a = new Stage();
         this.a.setTitle(ce.a());
         this.a = new Scene((Parent)var2.load());
         this.a.setFill(Color.TRANSPARENT);
         this.a.addEventFilter(KeyEvent.KEY_PRESSED, var1x -> {
            if (this.a.userPane.isVisible()) {
               if (this.a.userPane.getChildren().size() == 1) {
                  String var2x = ((Node)this.a.userPane.getChildren().get(0)).getId();
                  switch (var2x) {
                     case "LoginForm":
                        this.a.a(var1x);
                        break;
                     case "Cabinet":
                        this.a.a(var1x);
                        break;
                     case "TwoAuthForm":
                        this.a.a(var1x);
                  }
               }
            } else if (this.a.settingsPane.isVisible() && this.a.settingsPane.getChildren().size() == 1) {
               String var4x = ((Node)this.a.settingsPane.getChildren().get(0)).getId();
               switch (var4x) {
                  case "Settings":
                     this.a.a(var1x);
                     break;
                  case "Mods":
                     this.a.a(var1x);
               }
            }
         });
         this.a.setScene(this.a);
         this.a.initStyle(StageStyle.TRANSPARENT);
         this.a.getIcons().add(this.a.a(ru.smartycraft.k.a));
         this.a.setResizable(false);
         this.a.show();
         this.a = (p)var2.getController();
         if (cb.a() == 64 && cb.b() == 32) {
            this.a.a(r.b, 370, a("main.modal.memory.title"), a("main.modal.memory.text"), a("main.modal.memory.ok"), a("main.modal.memory.cancel"));
         }
      } catch (IOException var3) {
         a.log(Level.SEVERE, "IOException {0}", var3.getMessage());
      }

      this.c();
      t var4 = this.a();
      if (!this.b()) {
         var4.a(var1.b);
      }
   }

   public t a() {
      if (this.a != null) {
         try {
            FXMLLoader var1 = new FXMLLoader();
            var1.setLocation(Launcher.class.getResource("/fxml/News.fxml"));
            AnchorPane var2 = (AnchorPane)var1.load();
            var2.setId("News");
            this.a.newsPane.getChildren().clear();
            this.a.newsPane.getChildren().add(var2);
            return (t)var1.getController();
         } catch (IOException var4) {
            a.log(Level.SEVERE, "IOException {0}", var4.getMessage());
         }
      }

      return null;
   }

   public void c() {
      if (this.a != null) {
         try {
            FXMLLoader var1 = new FXMLLoader();
            var1.setLocation(Launcher.class.getResource("/fxml/LoginForm.fxml"));
            AnchorPane var2 = (AnchorPane)var1.load();
            var2.setId("LoginForm");
            this.a.userPane.getChildren().clear();
            this.a.userPane.getChildren().add(var2);
            this.a = (n)var1.getController();
            this.a.a(this.a);
         } catch (IOException var3) {
            a.log(Level.SEVERE, "IOException {0}", var3.getMessage());
         }
      }
   }

   public void d() {
      if (this.a != null) {
         try {
            FXMLLoader var1 = new FXMLLoader();
            var1.setLocation(Launcher.class.getResource("/fxml/Settings.fxml"));
            this.a = (AnchorPane)var1.load();
            this.a.setId("Settings");
            this.a.settingsPane.getChildren().add(this.a);
            this.a.settingsPane.setVisible(true);
            this.a.userPane.setVisible(false);
            this.b = this.b();
            this.c = this.c();
            this.a = (ae)var1.getController();
            this.a.a(true);
         } catch (IOException var2) {
            a.log(Level.SEVERE, "IOException {0}", var2.getMessage());
         }
      }
   }

   public void e() {
      if (this.a != null) {
         String var1 = ce.a();
         this.a.setTitle(var1);
         this.a.title.setText(var1);
         this.a.settingsPane.getChildren().remove(this.a);
         this.a.settingsPane.setVisible(false);
         this.a.userPane.setVisible(true);
         if (this.b() != this.b) {
            this.a.userPane.getChildren().clear();
            this.c();
         }

         if (!this.b() && this.a != null) {
            this.a.a();
         }

         this.a.a(false);
         if (this.c() != this.c) {
            this.r();
         }
      }
   }

   public void f() {
      if (this.a != null) {
         String var1 = ce.a();
         this.a.setTitle(var1);
         this.a.title.setText(var1);
         this.a.settingsPane.getChildren().remove(this.b);
         this.a.settingsPane.setVisible(false);
         this.a.userPane.setVisible(true);
         if (this.b() != this.b) {
            this.a.userPane.getChildren().clear();
            this.c();
         }

         if (!this.b() && this.a != null) {
            this.a.a();
         }

         this.a.a(false);
      }
   }

   public void g() {
      try {
         FXMLLoader var1 = new FXMLLoader();
         var1.setLocation(Launcher.class.getResource("/fxml/TwoAuthForm.fxml"));
         AnchorPane var2 = (AnchorPane)var1.load();
         var2.setId("TwoAuthForm");
         this.a.userPane.getChildren().clear();
         this.a.userPane.getChildren().add(var2);
         this.a = (ag)var1.getController();
      } catch (IOException var3) {
         a.log(Level.SEVERE, "IOException {0}", var3.getMessage());
      }
   }

   public void h() {
      try {
         FXMLLoader var1 = new FXMLLoader();
         var1.setLocation(Launcher.class.getResource("/fxml/Cabinet.fxml"));
         AnchorPane var2 = (AnchorPane)var1.load();
         var2.setId("Cabinet");
         this.a.userPane.getChildren().clear();
         this.a.userPane.getChildren().add(var2);
         this.a = (j)var1.getController();
      } catch (IOException var3) {
         a.log(Level.SEVERE, "IOException {0}", var3.getMessage());
         var3.printStackTrace();
      }
   }

   public void i() {
      if (this.a != null) {
         try {
            FXMLLoader var1 = new FXMLLoader();
            var1.setLocation(Launcher.class.getResource("/fxml/Mods.fxml"));
            this.b = (AnchorPane)var1.load();
            this.b.setId("Mods");
            this.a.settingsPane.getChildren().add(this.b);
            this.a.settingsPane.setVisible(true);
            this.a.userPane.setVisible(false);
            this.a = (s)var1.getController();
            this.a.a(true);
         } catch (IOException var2) {
            a.log(Level.SEVERE, "IOException {0}", var2.getMessage());
         }
      }
   }

   public void j() {
      try {
         FXMLLoader var1 = new FXMLLoader();
         var1.setLocation(Launcher.class.getResource("/fxml/Fail.fxml"));
         AnchorPane var2 = (AnchorPane)var1.load();
         var2.setId("Fail");
         this.a.progressPane.getChildren().clear();
         this.a.progressPane.getChildren().add(var2);
         this.a.progressPane.setVisible(true);
         this.a.userPane.setVisible(false);
         this.a.newsPane.setVisible(false);
         l var3 = (l)var1.getController();
         var3.a(this.a.e);
      } catch (IOException var4) {
         a.log(Level.SEVERE, "IOException {0}", var4.getMessage());
      }
   }

   public void a(bb var1) {
      if (var1.a != null) {
         this.a = var1.a;
         if (!this.c()) {
            this.a.f = var1.g;
         }

         this.a.a();
         this.a.a = var1.g != null;
      }

      this.a = var1;
      this.l();
      if (this.b()) {
         this.m();
      } else if (var1.a == bf.OK) {
         if (this.a.g) {
            this.m();
         } else {
            this.h();
         }
      } else if (var1.a == bf.TWOAUTH) {
         this.g();
      }
   }

   public void k() {
      this.a = null;
      this.a = null;
      this.a = null;
      this.c();
   }

   public void a(ru.smartycraft.i var1) {
      this.a = var1;
   }

   public ru.smartycraft.i a() {
      return this.a;
   }

   public void l() {
      this.a = new ru.smartycraft.a(this.a.a, this.a);
   }

   public void m() {
      if (this.a != null) {
         try {
            FXMLLoader var1 = new FXMLLoader();
            var1.setLocation(Launcher.class.getResource("/fxml/Progress.fxml"));
            AnchorPane var2 = (AnchorPane)var1.load();
            this.a = (aa)var1.getController();
            if (this.b()) {
               this.a = new ru.smartycraft.a(null, this.a);
            }

            this.a.a(this.a);
            this.a.progressPane.getChildren().clear();
            this.a.progressPane.getChildren().add(var2);
            this.a.progressPane.setVisible(true);
            this.a.userPane.setVisible(false);
            this.a.newsPane.setVisible(false);
         } catch (IOException var3) {
            a.log(Level.SEVERE, "IOException {0}", var3.getMessage());
         }
      }
   }

   public void a(bw var1) {
      new ai(this.a, var1, this.a());
   }

   public void n() {
      Platform.setImplicitExit(false);
      this.a = true;
      this.a.hide();
   }

   public void o() {
      Platform.setImplicitExit(true);
      this.a = false;
      this.a.show();
      if (this.a == 0) {
         Platform.exit();
      } else {
         this.j();
      }
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.a.c || this.a.d;
   }

   public boolean c() {
      return this.d;
   }

   public void a(boolean var1) {
      this.d = var1;
      a.a().a = var1;
   }

   public boolean d() {
      return this.a.a;
   }

   public static void main(String[] var0) {
      launch(var0);
   }

   public void a(int var1) {
      this.a = var1;
   }

   public void p() {
      String var1 = cb.h();
      if (!var1.equals("exe") && !var1.equals("jar")) {
         this.a.a(a("status.errorUpdate"));
      } else {
         String var2 = ce.a("downloads/smartycraft." + var1);
         a.log(Level.INFO, "Loading file {0}", var2);

         try {
            URL var3 = new URL(var2);
            URLConnection var4 = var3.openConnection(this.a());
            BufferedInputStream var5 = new BufferedInputStream(var4.getInputStream());
            FileOutputStream var6 = new FileOutputStream(cb.a());
            byte[] var8 = new byte[65536];
            MessageDigest var9 = MessageDigest.getInstance("MD5");

            int var7;
            while ((var7 = var5.read(var8, 0, var8.length)) != -1) {
               var6.write(var8, 0, var7);
               var9.update(var8, 0, var7);
            }

            var5.close();
         } catch (MalformedURLException var10) {
            a.log(Level.SEVERE, "MalformedURLException {0}", var10.getMessage());
            this.a.a(a("status.errorUpdate"));
         } catch (IOException var11) {
            a.log(Level.SEVERE, "IOException {0}", var11.getMessage());
            this.a.a(a("status.errorUpdate"));
         } catch (NoSuchAlgorithmException var12) {
            a.log(Level.SEVERE, "NoSuchAlgorithmException {0}", var12.getMessage());
            this.a.a(a("status.errorUpdate"));
         }

         this.r();
      }
   }

   private void r() {
      String var1 = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
      File var2 = cb.a();
      if (var2.getName().endsWith(".jar") || var2.getName().endsWith(".exe")) {
         ArrayList var3 = new ArrayList();
         var3.add(var1);
         var3.add("-jar");
         var3.add(var2.getPath());
         ProcessBuilder var4 = new ProcessBuilder(var3);

         try {
            var4.start();
            System.exit(0);
         } catch (IOException var6) {
            a.log(Level.SEVERE, "IOException {0}", var6.getMessage());
            this.a.a(a("status.needRestart"));
         }
      }
   }

   public static String a(String var0, Object... var1) {
      return a.a.a(var0, var1);
   }

   private Authenticator a(String var1, String var2) {
      return new ru.smartycraft.e(this, var1, var2);
   }

   public Proxy a() {
      return this.a;
   }

   public boolean e() {
      return this.a != Proxy.NO_PROXY;
   }

   public void q() {
      this.a = new Proxy(Type.SOCKS, new InetSocketAddress("proxy.smartycraft.ru", 1080));
   }
}
