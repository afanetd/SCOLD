// $VF: synthetic class
class f {
   static {
      try {
         a[g.a.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[g.c.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[g.b.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
