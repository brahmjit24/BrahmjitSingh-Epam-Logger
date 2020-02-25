package epam.Logger.HomeCost;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Construction{
	private int constructionType;
	private double houseArea;
	private int constructionTypeCost;
	private double totalConstructionCost;
	private static final Logger Logger = LogManager.getLogger(App.class);
	static int getCostPerSqFeet(int type)
	{
		int cost=0;
		switch(type)
		{
		case 1:cost=1200;
			break;
		case 2:cost=1500;
			break;
		case 3:cost=1800;
			break;
		case 4:cost=2500;
			break;
		default:cost=0;
			break;
		}
		return cost;
	}
	public void setConstructionData(int type,double area)
	{
		this.constructionType=type;
		this.houseArea=area;
	}
	
	public void calculateTotalCost() {
		this.constructionTypeCost=Construction.getCostPerSqFeet(constructionType);
		this.totalConstructionCost=this.constructionTypeCost*houseArea;
	}
	public void displayResult()
	{
		Logger.info("Total Cost For Construction : "+this.totalConstructionCost);
	}
}
