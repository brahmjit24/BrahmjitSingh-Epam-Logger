package epam.Logger.SimpleInterestCompoundInterest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Interest{
	double principle;
	static double rate;
	double timePeriod;
	public static final Logger Logger = LogManager.getLogger(App.class);
	public Interest()
	{}
	static void setRate(double rate)
	{
		Interest.rate=rate;
	}
	void setData(double principle,double rate,double timePeriod){}
	void displayResult(){}
}