package epam.Logger.SimpleInterestCompoundInterest;

public class SimpleInterest extends Interest{
	private double SI;
	public SimpleInterest() {
		super();
		SI=0.0;
	}
	@Override
	public void setData(double principle,double rate,double timePeriod)
	{
		this.principle=principle;
		this.timePeriod=timePeriod;
		SimpleInterest.setRate(rate);
	}
	public void calculateSI()
	{
		SI=principle*rate*timePeriod/100;
	}
	@Override
	public void displayResult() {
		Logger.info("Simple Interest : "+SI+" \n.");
	}
}
