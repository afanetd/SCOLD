package ru.smartycraft;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.Objects;

public class i {
   @SerializedName("name")
   private String a;
   @SerializedName("address")
   private String b;
   @SerializedName("port")
   private int a;
   @SerializedName("version")
   private String c;
   @SerializedName("extraCheckSum")
   private String d;
   @SerializedName("optionalMods")
   private Map<String, ru.smartycraft.j> a;
   @SerializedName("runtime")
   private boolean a;

   public String a() {
      return this.a;
   }

   public String b() {
      return this.a.toLowerCase();
   }

   public String c() {
      return this.b;
   }

   public int a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      return var1 instanceof ru.smartycraft.i ? this.hashCode() == var1.hashCode() : false;
   }

   public int hashCode() {
      int var1 = 3;
      var1 = 47 * var1 + Objects.hashCode(this.a);
      var1 = 47 * var1 + Objects.hashCode(this.b);
      var1 = 47 * var1 + this.a;
      return 47 * var1 + Objects.hashCode(this.c);
   }

   public String toString() {
      return this.a + " (" + this.c + ")";
   }

   public String d() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public void a(String var1) {
      this.d = var1;
   }

   public Map<String, ru.smartycraft.j> a() {
      return this.a;
   }

   public void a(Map<String, ru.smartycraft.j> var1) {
      this.a = var1;
   }

   public boolean a() {
      return this.a;
   }
}
