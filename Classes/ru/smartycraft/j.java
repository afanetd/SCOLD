package ru.smartycraft;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

public class j {
   @SerializedName("name")
   private String a;
   @SerializedName("selected")
   private boolean a;
   @SerializedName("jars")
   private List<String> a;
   @SerializedName("excludings")
   private List<String> b;

   public void a(boolean var1) {
      this.a = var1;
   }

   public boolean a() {
      return this.a;
   }

   public List<String> a() {
      return this.a;
   }

   public List<String> b() {
      return this.b;
   }

   public String a() {
      return this.a;
   }

   public int hashCode() {
      int var1 = 7;
      var1 = 19 * var1 + Objects.hashCode(this.a);
      var1 = 19 * var1 + Objects.hashCode(this.a);
      return 19 * var1 + Objects.hashCode(this.b);
   }

   public boolean equals(Object var1) {
      return var1 instanceof ru.smartycraft.j && this.hashCode() == var1.hashCode();
   }
}
