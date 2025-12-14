package ru.smartycraft;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class a {
   private final bc a;
   private final ru.smartycraft.i a;
   public final File a;
   public final File b;
   public final File c;
   public final File d;
   public final File e;
   private final File h;
   public final File f;
   private final File i;
   public final File g;
   private final List<String> b = new ArrayList();
   private final List<File> c = new ArrayList();
   public final List<String> a = new ArrayList();
   private int a = 0;

   public a(bc var1, ru.smartycraft.i var2) {
      this.a = var1;
      this.a = var2;
      this.a = new File(Launcher.a.a().c);
      if (!this.a.exists()) {
         this.a.mkdirs();
      }

      this.b = new File(this.a, var2.d().equals("1.7.10") ? "assets" : "assets-" + var2.d());
      this.c = new File(this.a, "bin" + File.separator + (var2.d().equals("1.7.10") ? "natives" : "natives-" + var2.d()));
      this.d = new File(this.a, var2.d().equals("1.7.10") ? "libraries" : "libraries-" + var2.d());
      this.e = new File(this.a, var2.a());
      if (!this.e.exists()) {
         this.e.mkdirs();
      }

      this.h = new File(this.e, "mods");
      this.f = new File(this.a, "bin" + File.separator + (var2.d().equals("1.7.10") ? "smartycraft.jar" : "smartycraft-" + var2.d() + ".jar"));
      this.i = new File(this.h, var2.d());
      if (var2.a()) {
         this.g = new File(this.a, "runtime-" + var2.d());
         if (!this.g.exists()) {
            this.g.mkdirs();
         }
      } else {
         this.g = null;
      }
   }

   public boolean a() {
      return this.b.exists() && this.c.exists() && this.d.exists() && this.e.exists() && this.f.exists() && (this.g == null || this.g.exists());
   }

   public void a() {
      this.c.clear();
      this.a.clear();
      this.a = 0;
      this.a.a().forEach((var1, var2) -> {
         if (var2.a()) {
            var2.b().forEach(var1x -> {
               if (this.a.a().containsKey(var1x)) {
                  this.b.addAll(((ru.smartycraft.j)this.a.a().get(var1x)).a());
               }
            });
         } else {
            this.b.addAll(var2.a());
         }
      });
      if (Launcher.a.a().e) {
         this.d();
      }

      this.a(this.a, this.a, false);
      this.a(this.a, this.a, new String());
   }

   private void d() {
      this.a(this.b);
      this.a(this.c);
      this.a(this.d);
      this.a(this.e);
      this.a(this.f);
      if (this.a.a()) {
         this.a(this.g);
      }

      Launcher.a.a().e = false;
   }

   private void a(File var1) {
      if (var1.exists()) {
         if (var1.isDirectory()) {
            for (File var5 : var1.listFiles()) {
               if (var5.isDirectory()) {
                  this.a(var5);
               } else {
                  var5.delete();
               }
            }
         }

         var1.delete();
      }
   }

   private void a(File var1, bc var2, boolean var3) {
      if (!var3 && (var1.equals(this.d) || var1.equals(this.h))) {
         var3 = true;
      }

      for (File var7 : var1.listFiles()) {
         if (var7.isDirectory()) {
            if (var2.a != null && var2.a.containsKey(var7.getName())) {
               this.a(var7, (bc)var2.a.get(var7.getName()), var3);
            } else if (var3) {
               this.c.add(var7);
            }
         } else if (var3) {
            if (var2.b == null || !var2.b.containsKey(var7.getName())) {
               this.c.add(var7);
               Launcher.a.log(Level.INFO, "File {0} added to remove (not exist)", var7.getAbsolutePath());
            } else if (var1.equals(this.i) && this.b.contains(var7.getName())) {
               this.c.add(var7);
               Launcher.a.log(Level.INFO, "File {0} added to remove (not selected optional mod)", var7.getAbsolutePath());
            } else if (!((bd)var2.b.get(var7.getName())).a.equals(bx.a(var7))) {
               this.c.add(var7);
               Launcher.a.log(Level.INFO, "File {0} added to remove (md5)", var7.getAbsolutePath());
            }
         }
      }
   }

   private void a(File var1, bc var2, String var3) {
      if (var2.a != null && !var2.a.isEmpty()) {
         var2.a.entrySet().forEach(var3x -> {
            String var4x = (String)var3x.getKey();
            bc var5 = (bc)var3x.getValue();
            this.a(new File(var1, var4x), var5, var3 + "/" + var4x);
         });
      }

      if (var2.b != null && !var2.b.isEmpty()) {
         ru.smartycraft.b var4 = Launcher.a.a();
         var2.b
            .entrySet()
            .forEach(
               var4x -> {
                  String var5 = (String)var4x.getKey();
                  bd var6 = (bd)var4x.getValue();
                  File var7 = new File(var1, var5);
                  if (var7.getName().endsWith(".zip")) {
                     if (var7.getName().equalsIgnoreCase("extra.zip")) {
                        if (!this.e.exists()
                           || this.e.listFiles().length == 0
                           || !var4.b.containsKey(this.a.a())
                           || ((ru.smartycraft.i)var4.b.get(this.a.a())).e() == null
                           || !var6.a.equals(((ru.smartycraft.i)var4.b.get(this.a.a())).e())) {
                           this.a.add(var3 + "/" + var5);
                           this.a = this.a + var6.a;
                           Launcher.a.log(Level.INFO, "File {0} added to download (not exist)", var3 + "/" + var5);
                        }
                     } else if (var7.getName().equalsIgnoreCase(this.b.getName() + ".zip")) {
                        if (!this.b.exists()
                           || this.b.listFiles().length == 0
                           || !var4.a.containsKey(this.b.getName())
                           || !((String)var4.a.get(this.b.getName())).equals(var6.a)) {
                           this.a.add(var3 + "/" + var5);
                           this.a = this.a + var6.a;
                           Launcher.a.log(Level.INFO, "File {0} added to download (not exist)", var3 + "/" + var5);
                        }
                     } else if (var7.getName().equalsIgnoreCase(this.c.getName() + ".zip")
                        && (
                           !this.c.exists()
                              || this.c.listFiles().length == 0
                              || !var4.a.containsKey(this.c.getName())
                              || !((String)var4.a.get(this.c.getName())).equals(var6.a)
                        )) {
                        this.a.add(var3 + "/" + var5);
                        this.a = this.a + var6.a;
                        Launcher.a.log(Level.INFO, "File {0} added to download (not exist)", var3 + "/" + var5);
                     }
                  } else if (!var7.exists()) {
                     boolean var8 = true;
                     if (var1.equals(this.i) && this.b.contains(var5)) {
                        var8 = false;
                     }

                     if (var8) {
                        this.a.add(var3 + "/" + var5);
                        this.a = this.a + var6.a;
                        Launcher.a.log(Level.INFO, "File {0} added to download (not exist)", var3 + "/" + var5);
                     }
                  } else if (!var6.a.equals("any") && !var6.a.equals(bx.a(var7))) {
                     boolean var9 = true;
                     if (var1.equals(this.i) && this.b.contains(var5)) {
                        var9 = false;
                     }

                     if (var9) {
                        this.a.add(var3 + "/" + var5);
                        this.a = this.a + var6.a;
                        Launcher.a.log(Level.INFO, "File {0} added to download (md5)", var3 + "/" + var5);
                     }
                  }
               }
            );
      }
   }

   public boolean b() {
      boolean var1 = true;
      if (!this.c.isEmpty()) {
         for (File var3 : this.c) {
            if (var3.isDirectory()) {
            }

            if (by.a(var3)) {
               if (var3.getParentFile().isDirectory() && var3.getParentFile().listFiles().length == 0) {
                  var3.getParentFile().delete();
               }
            } else {
               var1 = false;
            }
         }
      }

      this.c.clear();
      return var1;
   }

   public int a() {
      return this.a;
   }

   public bc a() {
      return this.a;
   }

   public ru.smartycraft.i a() {
      return this.a;
   }

   public void b() {
      this.a(new File(this.b + File.separator + "skins"));
   }

   public void c() {
      FileReader var1 = null;
      BufferedReader var2 = null;
      BufferedWriter var3 = null;
      StringBuilder var4 = new StringBuilder();
      boolean var5 = false;
      File var6 = new File(this.e, "options.txt");
      if (var6.exists()) {
         try {
            var1 = new FileReader(var6);
            var2 = new BufferedReader(var1);

            while (var2.ready()) {
               String var7 = var2.readLine();
               if (var7.contains("gamma:")) {
                  String[] var8 = var7.split(":");
                  if (Float.parseFloat(var8[1]) > 1.0) {
                     var7 = "gamma:1.0";
                     var5 = true;
                  }
               }

               var4.append(var7).append(System.getProperty("line.separator"));
            }
         } catch (IOException var35) {
            Launcher.a.log(Level.SEVERE, "IOException {0}", var35.getMessage());
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }

               if (var1 != null) {
                  var1.close();
               }
            } catch (IOException var32) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var32.getMessage());
            }
         }

         if (var5) {
            try {
               var3 = new BufferedWriter(new FileWriter(var6));
               var3.write(var4.toString());
            } catch (IOException var33) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var33.getMessage());
            } finally {
               try {
                  if (var3 != null) {
                     var3.flush();
                     var3.close();
                  }
               } catch (IOException var31) {
                  Launcher.a.log(Level.SEVERE, "IOException {0}", var31.getMessage());
               }
            }
         }
      }
   }
}
