public enum cc {
   a,
   b,
   c,
   d,
   e;

   public static cc[] a() {
      return (cc[])a.clone();
   }
}
