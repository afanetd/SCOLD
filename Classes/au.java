public enum au {
   a,
   b,
   c;

   public static au[] a() {
      return (au[])a.clone();
   }
}
