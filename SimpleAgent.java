import javax.management.*;
import java.lang.management.*;
 
public class SimpleAgent {
   private MBeanServer mbs = null;
 
   public SimpleAgent() {
 
      // Get the platform MBeanServer
       mbs = ManagementFactory.getPlatformMBeanServer();
 
      // Unique identification of MBeans
      Hello helloBean = new Hello();
      ObjectName helloName = null;
 
      try {
         // Uniquely identify the MBeans and register them with the platform MBeanServer 
         helloName = new ObjectName("FOO:name=HelloBean");
         mbs.registerMBean(helloBean, helloName);
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
 
   public static void main(String argv[]) {
      System.setSecurityManager(new SecurityManager());
      SimpleAgent agent = new SimpleAgent();
      System.out.println("SimpleAgent is running...");
      try { while(true) {
	Thread.sleep(500);
      }} catch(java.lang.InterruptedException e){
        System.out.println("SimpleAgent is exiting..");
      }
   }
}
