package ru.smartycraft;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

class e extends Authenticator {
   e(Launcher var1, String var2, String var3) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
   }

   public PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.a, this.b.toCharArray());
   }
}
