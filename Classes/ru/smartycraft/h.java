package ru.smartycraft;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;

public final class h {
   private final int a = 22;
   private final String a;
   private final String b;
   private final String c;
   private final String d;
   private final String e;
   private final String f;
   private final int b;
   private BufferedImage a;
   private int c = 1;
   private final int d;
   private BufferedImage b;
   private int e = 1;
   private final int f;

   public h(bb var1) {
      this.a = var1.a;
      this.b = var1.c;
      this.c = var1.d;
      this.d = var1.b;
      this.e = var1.e;
      this.f = var1.f;
      this.b = var1.a;
      this.d = var1.b;
      this.f = var1.c;
      if (!Launcher.a.b()) {
         this.a(true);
      }
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.e;
   }

   public String c() {
      String var1 = bx.a(this.d + "sdgsdfhgosd8dfrg");
      if (var1 != null) {
         String var2 = bx.a(this.f, var1.substring(0, 16));
         var2 = bx.a(var2);
         return bx.a(var2 + ce.a(var2, 3));
      } else {
         return new String();
      }
   }

   public String d() {
      return this.d;
   }

   public int a() {
      return this.b;
   }

   public void a(boolean var1) {
      boolean var2 = false;
      File var3 = new File(ru.smartycraft.b.a(), "player_" + this.a + ".png");
      if (var3.exists() && Launcher.a.a().a.containsKey(this.a) && (Integer)Launcher.a.a().a.get(this.a) >= this.d && var1) {
         try {
            this.a = ImageIO.read(var3);
            var2 = true;
            Launcher.a.log(Level.INFO, "Local skin image {0} loaded.", var3);
         } catch (IOException var37) {
            Launcher.a.log(Level.SEVERE, "Error reading skin cache {0}", var3);
         }
      }

      if (!var2) {
         String var4 = ce.a("skins/" + this.a + ".png");

         try {
            URL var5 = new URL(var4);
            URLConnection var6 = var5.openConnection(Launcher.a.a());
            this.a = ImageIO.read(var6.getInputStream());

            try {
               ImageIO.write(this.a, "PNG", var3);
               if (Launcher.a.a().a.containsKey(this.a)) {
                  Launcher.a.a().a.remove(this.a);
               }

               Launcher.a.a().a.put(this.a, ce.a());
               Launcher.a.a().a();
            } catch (IOException var34) {
               Launcher.a.log(Level.SEVERE, "Error saving skin cache {0}", var3);
            } finally {
               Launcher.a.log(Level.INFO, "Removed skin image {0} loaded.", var4);
            }
         } catch (IOException var36) {
            try {
               this.a = ImageIO.read(Launcher.class.getResourceAsStream("/images/skin.png"));
            } catch (IOException var33) {
               Launcher.a.log(Level.SEVERE, "Error loading image {0}", var4);
            }
         }
      }

      this.c = this.a.getWidth() >> 6;
      if (this.b != null) {
         boolean var38 = false;
         File var39 = new File(ru.smartycraft.b.a(), "clan_" + this.b + ".png");
         if (var39.exists() && Launcher.a.a().b.containsKey(this.b) && (Integer)Launcher.a.a().b.get(this.b) >= this.f && var1) {
            try {
               this.b = ImageIO.read(var39);
               this.e = this.b.getWidth() >> 6;
               if (this.e < 1) {
                  this.e = 1;
               }

               var38 = true;
               Launcher.a.log(Level.INFO, "Local cape image {0} loaded.", var39);
            } catch (IOException var32) {
               Launcher.a.log(Level.SEVERE, "Error reading cape cache {0}", var39);
            }
         }

         if (!var38 && this.c != null) {
            String var40 = ce.a("cloaks/" + this.c + ".png");

            try {
               URL var7 = new URL(var40);
               URLConnection var8 = var7.openConnection(Launcher.a.a());
               this.b = ImageIO.read(var8.getInputStream());
               this.e = this.b.getWidth() >> 6;
               if (this.e < 1) {
                  this.e = 1;
               }

               try {
                  ImageIO.write(this.b, "PNG", var39);
                  if (Launcher.a.a().b.containsKey(this.b)) {
                     Launcher.a.a().b.remove(this.b);
                  }

                  Launcher.a.a().b.put(this.b, ce.a());
                  Launcher.a.a().a();
               } catch (IOException var29) {
                  Launcher.a.log(Level.SEVERE, "Error saving cape cache {0}", var3);
               } finally {
                  Launcher.a.log(Level.INFO, "Removed cape image {0} loaded.", var7);
               }
            } catch (IOException var31) {
               Launcher.a.log(Level.INFO, "Cape image {0} not found.", var40);
            }
         }
      }
   }

   public Image a() {
      int var1 = this.c;
      BufferedImage var2 = this.a.getSubimage(8 * var1, 8 * var1, 8 * var1, 8 * var1);
      BufferedImage var3 = this.a.getSubimage(20 * var1, 20 * var1, 8 * var1, 12 * var1);
      BufferedImage var4 = this.a.getSubimage(40 * var1, 8 * var1, 8 * var1, 8 * var1);
      byte var9 = 22;
      BufferedImage var10 = new BufferedImage(4 * var9, 8 * var9, 2);
      var2.getGraphics().drawImage(var4, 0, 0, var2.getWidth(), var2.getHeight(), null);
      BufferedImage var5;
      BufferedImage var6;
      BufferedImage var7;
      BufferedImage var8;
      if (!this.a()) {
         var6 = this.a.getSubimage(44 * var1, 20 * var1, 4 * var1, 12 * var1);
         var5 = a(var6);
         var8 = this.a.getSubimage(4 * var1, 20 * var1, 4 * var1, 12 * var1);
         var7 = a(var8);
      } else {
         BufferedImage var11 = this.a.getSubimage(20 * var1, 36 * var1, 8 * var1, 12 * var1);
         var3.getGraphics().drawImage(var11, 0, 0, var3.getWidth(), var3.getHeight(), null);
         BufferedImage var12 = this.a.getSubimage(36 * var1, 52 * var1, 3 * var1, 12 * var1);
         BufferedImage var14 = this.a.getSubimage(52 * var1, 52 * var1, 3 * var1, 12 * var1);
         var12.getGraphics().drawImage(var14, 0, 0, var12.getWidth(), var12.getHeight(), null);
         var5 = new BufferedImage(1 * var9, 3 * var9, 2);
         var5.getGraphics().drawImage(var12, 0, 0, (int)Math.round(0.75 * var9), 3 * var9, null);
         BufferedImage var13 = this.a.getSubimage(44 * var1, 20 * var1, 3 * var1, 12 * var1);
         BufferedImage var15 = this.a.getSubimage(44 * var1, 36 * var1, 3 * var1, 12 * var1);
         var13.getGraphics().drawImage(var15, 0, 0, var13.getWidth(), var12.getHeight(), null);
         var6 = new BufferedImage(1 * var9, 3 * var9, 2);
         var6.getGraphics().drawImage(var13, (int)Math.round(0.25 * var9), 0, (int)Math.round(0.75 * var9), 3 * var9, null);
         var7 = this.a.getSubimage(20 * var1, 52 * var1, 4 * var1, 12 * var1);
         BufferedImage var16 = this.a.getSubimage(4 * var1, 52 * var1, 4 * var1, 12 * var1);
         var7.getGraphics().drawImage(var16, 0, 0, var7.getWidth(), var7.getHeight(), null);
         var8 = this.a.getSubimage(4 * var1, 20 * var1, 4 * var1, 12 * var1);
         BufferedImage var17 = this.a.getSubimage(4 * var1, 36 * var1, 4 * var1, 12 * var1);
         var8.getGraphics().drawImage(var17, 0, 0, var8.getWidth(), var8.getHeight(), null);
      }

      var10.getGraphics().drawImage(var2, 1 * var9, 0 * var9, 2 * var9, 2 * var9, null);
      var10.getGraphics().drawImage(var3, 1 * var9, 2 * var9, 2 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var6, 0 * var9, 2 * var9, 1 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var5, 3 * var9, 2 * var9, 1 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var8, 1 * var9, 5 * var9, 1 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var7, 2 * var9, 5 * var9, 1 * var9, 3 * var9, null);
      return SwingFXUtils.toFXImage(var10, null);
   }

   public Image b() {
      int var1 = this.c;
      BufferedImage var2 = this.a.getSubimage(24 * var1, 8 * var1, 8 * var1, 8 * var1);
      BufferedImage var3 = this.a.getSubimage(32 * var1, 20 * var1, 8 * var1, 12 * var1);
      BufferedImage var4 = this.a.getSubimage(56 * var1, 8 * var1, 8 * var1, 8 * var1);
      byte var9 = 22;
      BufferedImage var10 = new BufferedImage(4 * var9, 8 * var9, 2);
      var2.getGraphics().drawImage(var4, 0, 0, var2.getWidth(), var2.getHeight(), null);
      BufferedImage var5;
      BufferedImage var6;
      BufferedImage var7;
      BufferedImage var8;
      if (!this.a()) {
         var6 = this.a.getSubimage(52 * var1, 20 * var1, 4 * var1, 12 * var1);
         var5 = a(var6);
         var8 = this.a.getSubimage(12 * var1, 20 * var1, 4 * var1, 12 * var1);
         var7 = a(var8);
      } else {
         BufferedImage var11 = this.a.getSubimage(32 * var1, 36 * var1, 8 * var1, 12 * var1);
         var3.getGraphics().drawImage(var11, 0, 0, var3.getWidth(), var3.getHeight(), null);
         BufferedImage var12 = this.a.getSubimage(43 * var1, 52 * var1, 3 * var1, 12 * var1);
         BufferedImage var14 = this.a.getSubimage(59 * var1, 52 * var1, 3 * var1, 12 * var1);
         var12.getGraphics().drawImage(var14, 0, 0, var12.getWidth(), var12.getHeight(), null);
         var5 = new BufferedImage(1 * var9, 3 * var9, 2);
         var5.getGraphics().drawImage(var12, (int)Math.round(0.25 * var9), 0, (int)Math.round(0.75 * var9), 3 * var9, null);
         BufferedImage var13 = this.a.getSubimage(51 * var1, 20 * var1, 3 * var1, 12 * var1);
         BufferedImage var15 = this.a.getSubimage(51 * var1, 36 * var1, 3 * var1, 12 * var1);
         var13.getGraphics().drawImage(var15, 0, 0, var13.getWidth(), var12.getHeight(), null);
         var6 = new BufferedImage(1 * var9, 3 * var9, 2);
         var6.getGraphics().drawImage(var13, 0, 0, (int)Math.round(0.75 * var9), 3 * var9, null);
         var7 = this.a.getSubimage(28 * var1, 52 * var1, 4 * var1, 12 * var1);
         BufferedImage var16 = this.a.getSubimage(12 * var1, 52 * var1, 4 * var1, 12 * var1);
         var7.getGraphics().drawImage(var16, 0, 0, var7.getWidth(), var7.getHeight(), null);
         var8 = this.a.getSubimage(12 * var1, 20 * var1, 4 * var1, 12 * var1);
         BufferedImage var17 = this.a.getSubimage(12 * var1, 36 * var1, 4 * var1, 12 * var1);
         var8.getGraphics().drawImage(var17, 0, 0, var8.getWidth(), var8.getHeight(), null);
      }

      var10.getGraphics().drawImage(var2, 1 * var9, 0 * var9, 2 * var9, 2 * var9, null);
      var10.getGraphics().drawImage(var3, 1 * var9, 2 * var9, 2 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var5, 0 * var9, 2 * var9, 1 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var6, 3 * var9, 2 * var9, 1 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var7, 1 * var9, 5 * var9, 1 * var9, 3 * var9, null);
      var10.getGraphics().drawImage(var8, 2 * var9, 5 * var9, 1 * var9, 3 * var9, null);
      if (this.b()) {
         int var18 = this.e;
         BufferedImage var19 = this.b.getSubimage(1 * var18, 1 * var18, 10 * var18, 16 * var18);
         var10.getGraphics().drawImage(var19, (int)Math.round(0.75 * var9), 2 * var9, (int)Math.round(2.5 * var9), 4 * var9, null);
      }

      return SwingFXUtils.toFXImage(var10, null);
   }

   public boolean a() {
      return this.a.getWidth() == this.a.getHeight();
   }

   public boolean b() {
      return this.b != null;
   }

   private static BufferedImage a(BufferedImage var0) {
      AffineTransform var1 = AffineTransform.getScaleInstance(-1.0, 1.0);
      var1.translate(-var0.getWidth(), 0.0);
      AffineTransformOp var2 = new AffineTransformOp(var1, 1);
      return var2.filter(var0, null);
   }
}
