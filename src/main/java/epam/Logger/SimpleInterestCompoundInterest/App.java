package epam.Logger.SimpleInterestCompoundInterest;

/**
 * Hello world!
 *
 */
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
   private static final Logger Logger = LogManager.getLogger(App.class);
   static {
	    SimpleInterest si=new SimpleInterest();
	    CompoundInterest ci=new CompoundInterest();
	    Scanner sc=new Scanner(System.in);
	    Logger.info("For CI and SI \nEnter Principle then rate and then time (in years) ");
	    double p,r,t;
	    p=sc.nextDouble();
	    r=sc.nextDouble();
	    t=sc.nextDouble();
	    sc.close();
	    si.setData(p, r, t);
		si.calculateSI();
		ci.setData(p, r, t);
		ci.calculateCI();
	    Logger.info("\nThe Result Is :\n");
		si.displayResult();
		ci.displayResult();
   }
   public static void main( String[] args )
    {
        //Declared not used main...
        
    }
}