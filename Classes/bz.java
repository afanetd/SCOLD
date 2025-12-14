import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class bz {
   private final Object[] a;
   private final Class a;
   private final ReadWriteLock a = new ReentrantReadWriteLock();
   private int a;
   private int b;

   public bz(Class var1, int var2) {
      this.a = var1;
      this.a = (Object[])Array.newInstance(var1, var2);
   }

   public Object a(Object var1) {
      this.a.writeLock().lock();

      try {
         this.a[this.b] = var1;
         this.b = (this.b + 1) % this.a();
         if (this.a < this.a()) {
            this.a++;
         }
      } finally {
         this.a.writeLock().unlock();
      }

      return var1;
   }

   public int a() {
      return this.a.length;
   }
}
