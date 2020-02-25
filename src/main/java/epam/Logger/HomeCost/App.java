package epam.Logger.HomeCost;


import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger Logger = LogManager.getLogger(App.class);
	static {
		int type;
		double area;
		Logger.info("Enter value For Construction type : \n");
		Logger.info("Press 1 - Standard Type\n");
		Logger.info("Press 2 - Above Standard Type\n");
		Logger.info("Press 3 - High Standard Type\n");
		Logger.info("Press 4 - High Standard Type + Automation \n");
		
		Scanner scan=new Scanner(System.in);
		type=scan.nextInt();
        Logger.info("Enter House Area \n");
		area=scan.nextDouble();
		scan.close();
		
		Construction c=new Construction();
		c.setConstructionData(type, area);
		c.calculateTotalCost();
		c.displayResult();
	}
  public static void main(String[] args) {
	
  }
}