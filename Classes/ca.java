import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class ca extends Formatter {
   private static final MessageFormat a = new MessageFormat("[{3,date,hh:mm:ss}][{1}][{2} {0} {5}]{4}\n");

   public String format(LogRecord var1) {
      Object[] var2 = new Object[]{
         var1.getSourceClassName(),
         var1.getLevel(),
         Thread.currentThread().getName(),
         new Date(var1.getMillis()),
         this.formatMessage(var1),
         var1.getSourceMethodName()
      };
      return a.format(var2);
   }
}
