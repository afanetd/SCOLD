package ru.smartycraft;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import javafx.scene.image.Image;

public class k {
   public static final ru.smartycraft.l a = new ru.smartycraft.l("favicon.png");
   public static final ru.smartycraft.l b = new ru.smartycraft.l("loader.png");
   public static final ru.smartycraft.l c = new ru.smartycraft.l("logo.png", true);
   public static final ru.smartycraft.l d = new ru.smartycraft.l("background.jpg", true);
   public static final ru.smartycraft.l e = new ru.smartycraft.l("update.png");
   private final Map<ru.smartycraft.l, Image> a = new HashMap();

   public k() {
      this.a.put(b, new Image("/images/" + ru.smartycraft.l.a(b)));
      this.a.put(c, new Image("/images/" + ru.smartycraft.l.a(c)));
      this.a.put(d, new Image("/images/" + ru.smartycraft.l.a(d)));
      this.a.put(e, new Image("/images/" + ru.smartycraft.l.a(e)));
      this.a.put(a, new Image("/images/" + ru.smartycraft.l.a(a)));
   }

   public void a() {
      for (Entry var2 : this.a.entrySet()) {
         if (((ru.smartycraft.l)var2.getKey()).a()) {
            String var3 = ce.a("images/launcher/" + ru.smartycraft.l.a((ru.smartycraft.l)var2.getKey()));

            try {
               URL var4 = new URL(var3);
               URLConnection var5 = var4.openConnection(Launcher.a.a());
               Image var6 = new Image(var5.getInputStream());
               if (var6.exceptionProperty().getValue() == null) {
                  this.a.put(var2.getKey(), var6);
               }
            } catch (IOException var7) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var7.getMessage());
            }
         }
      }
   }

   public Image a(ru.smartycraft.l var1) {
      return (Image)this.a.get(var1);
   }
}
