package ru.smartycraft;

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import javafx.scene.image.Image;

public class g {
   @SerializedName("id")
   private int a;
   @SerializedName("name")
   private String a;
   @SerializedName("image")
   private String b;
   @SerializedName("date")
   private int b;
   @SerializedName("views")
   private int c;
   private transient Image a;

   public int a() {
      return this.a;
   }

   public String a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public void a() {
      String var1 = ce.a("images/news/mini/" + this.b + ".jpg");

      try {
         URL var2 = new URL(var1);
         URLConnection var3 = var2.openConnection(Launcher.a.a());
         this.a = new Image(var3.getInputStream());
      } catch (IOException var4) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var4.getMessage());
      }
   }

   public Image a() {
      return this.a;
   }
}
