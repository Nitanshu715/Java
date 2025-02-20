package l;  // ✅ Package declaration

public final class Logger {  // ✅ Final class cannot be extended
    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

package l;


public class ExtendedLogger {
    
}

// Source code is decompiled from a .class file using FernFlower decompiler.
package l;

public class MainLogger {
   public MainLogger() {
   }

   public static void main(String[] var0) {
      Logger var1 = new Logger();
      var1.logMessage("This is a sample log message.");
   }
}
