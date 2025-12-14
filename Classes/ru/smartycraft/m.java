package ru.smartycraft;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class m {
   private final bw a;
   private final ru.smartycraft.a a;
   private final String a = ce.a("launcher/clients");
   private final List<File> a = new ArrayList();
   private final List<String> b;
   private long a = 0L;
   private long b = 0L;
   private int a;
   private String b;
   private int b = 0;
   private int c = 0;
   private String c;
   private int d = 0;

   public m(bw var1, ru.smartycraft.a var2) {
      this.a = var1;
      this.a = var2;
      this.a = this.a.a();
      this.b = this.a.a;
   }

   public void a() {
      if (!this.b.isEmpty()) {
         this.a = System.currentTimeMillis();
         this.b = this.a(this.a);
         this.b.forEach(var1 -> this.a(var1));
         if (!this.a.isEmpty()) {
            this.d();
            this.a = System.currentTimeMillis();
            this.c();
         }

         this.b();
      }
   }

   private void a(String var1) {
      File var2 = new File(this.a.a.getAbsolutePath() + var1.replace('/', File.separatorChar));
      if (!var2.exists()) {
         var2.getParentFile().mkdirs();
      }

      this.a.a(var2.getName());
      BufferedInputStream var3 = null;
      BufferedOutputStream var4 = null;

      try {
         URL var5 = new URL(this.a + var1.replace(" ", "%20"));
         URLConnection var6 = var5.openConnection(Launcher.a.a());
         var3 = new BufferedInputStream(var6.getInputStream());
         var4 = new BufferedOutputStream(new FileOutputStream(var2));
         byte[] var7 = new byte[512];

         while (true) {
            int var8 = var3.read(var7);
            if (var8 < 0) {
               if (var2.getName().endsWith(".zip")) {
                  this.a.add(var2);
               }
               break;
            }

            this.b += var8;
            var4.write(var7, 0, var8);
            this.a.a(this.b, this.a);
            long var9 = System.currentTimeMillis();
            if (var9 != this.a) {
               long var11 = this.b / (var9 - this.a) * 1000L;
               long var13 = var11 > 0L ? (this.a - this.b) / var11 : 0L;
               String var15 = Launcher.a("prepare.updateClient.downloading.message", this.a(this.b), this.b, this.a(var11) + "/s", this.b(var13));
               this.b = var9;
               this.a.b(var15);
            }
         }
      } catch (IOException var24) {
         Launcher.a.log(Level.SEVERE, "IOException {0}", var24.getMessage());
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }

            if (var3 != null) {
               var3.close();
            }
         } catch (IOException var23) {
         }
      }
   }

   private void c() {
      this.a.a(ac.d);
      if (!this.a.isEmpty()) {
         for (File var2 : this.a) {
            this.a.a(var2.getName());
            Launcher.a.log(Level.FINE, "Unzipping {0}", var2.getPath());
            ZipInputStream var3 = null;

            try {
               var3 = new ZipInputStream(new FileInputStream(var2));

               ZipEntry var4;
               while ((var4 = var3.getNextEntry()) != null) {
                  File var5;
                  if (var2.getName().equals("extra.zip")) {
                     var5 = new File(var2.getParentFile(), var4.getName());
                  } else {
                     var5 = new File(var2.getParentFile(), var2.getName().substring(0, var2.getName().length() - 4) + File.separator + var4.getName());
                  }

                  if (var4.isDirectory()) {
                     var5.mkdirs();
                  } else {
                     if (!var5.getParentFile().exists()) {
                        var5.getParentFile().mkdirs();
                     }

                     FileOutputStream var6 = new FileOutputStream(var5);
                     Throwable var7 = null;

                     try {
                        byte[] var8 = new byte[1024];

                        while (true) {
                           int var9 = var3.read(var8);
                           if (var9 < 0) {
                              var6.flush();
                              var3.closeEntry();
                              var6.close();
                              break;
                           }

                           var6.write(var8, 0, var9);
                           this.d += var9;
                           this.a.a(this.d, this.c);
                           long var10 = System.currentTimeMillis();
                           if (var10 != this.a) {
                              long var12 = this.d / (var10 - this.a) * 1000L;
                              long var14 = var12 == 0L ? 0L : (this.c - this.d) / var12;
                              String var16 = Launcher.a("prepare.updateClient.upzipping.message", this.a(this.d), this.c, this.b(var14));
                              this.b = var10;
                              this.a.b(var16);
                           }
                        }
                     } catch (Throwable var42) {
                        var7 = var42;
                        throw var42;
                     } finally {
                        if (var6 != null) {
                           if (var7 != null) {
                              try {
                                 var6.close();
                              } catch (Throwable var41) {
                                 var7.addSuppressed(var41);
                              }
                           } else {
                              var6.close();
                           }
                        }
                     }
                  }
               }
            } catch (FileNotFoundException var44) {
               Launcher.a.log(Level.SEVERE, "FileNotFoundException {0}", var44.getMessage());
               this.a.a(ac.h);
               this.a.b(Launcher.a("prepare.error.unzipping", var2.getName()));
            } catch (IOException var45) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var45.getMessage());
            } finally {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (IOException var40) {
                     Launcher.a.log(Level.SEVERE, "IOException {0}", var40.getMessage());
                  }
               }
            }
         }
      }
   }

   private void d() {
      if (!this.a.isEmpty()) {
         this.a.a(ac.c);
         this.a.a(0L, 0L);
         this.a.forEach(var1 -> {
            ZipInputStream var2 = null;

            try {
               var2 = new ZipInputStream(new FileInputStream(var1));

               ZipEntry var3;
               while ((var3 = var2.getNextEntry()) != null) {
                  this.c = (int)(this.c + var3.getSize());
               }
            } catch (FileNotFoundException var14) {
               Launcher.a.log(Level.SEVERE, "FileNotFoundException {0}", var14.getMessage());
            } catch (IOException var15) {
               Launcher.a.log(Level.SEVERE, "IOException {0}", var15.getMessage());
            } finally {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (IOException var13) {
                     Launcher.a.log(Level.SEVERE, "IOException {0}", var13.getMessage());
                  }
               }
            }
         });
         this.c = this.a(this.c);
      }
   }

   public void b() {
      ru.smartycraft.b var1 = Launcher.a.a();
      ru.smartycraft.i var2 = this.a.a();
      this.a.stream().map(var2x -> {
         String var3 = bx.a(var2x);
         if (var2x.getName().equalsIgnoreCase("extra.zip")) {
            var2.a(var3);
         } else {
            var1.a.put(var2x.getName().substring(0, var2x.getName().length() - 4), var3);
         }

         return var2x;
      }).forEachOrdered(var0 -> var0.delete());
      if (this.a.a().e() == null && var1.b.containsKey(var2.a()) && ((ru.smartycraft.i)var1.b.get(var2.a())).e() != null) {
         this.a.a().a(((ru.smartycraft.i)var1.b.get(var2.a())).e());
      }

      var1.b.put(var2.a(), var2);
      var1.a();
   }

   private String a(long var1) {
      if (var1 > 768000L) {
         float var4 = (float)var1 / 1048576.0F;
         return var4 < 10.0F ? String.format("%.1f Mb", var4) : Math.round(var4) + " Mb";
      } else if (var1 > 750L) {
         float var3 = (float)var1 / 1024.0F;
         return var3 < 10.0F ? String.format("%.1f Kb", var3) : Math.round(var3) + " Kb";
      } else {
         return var1 + " b";
      }
   }

   private String b(long var1) {
      if (var1 >= 60L) {
         int var3 = Math.round((float)var1 / 60.0F);
         return var3 + " " + ce.a(var3, Launcher.a("utils.minutes").split(","));
      } else {
         return var1 + " " + ce.a((int)var1, Launcher.a("utils.seconds").split(","));
      }
   }
}
