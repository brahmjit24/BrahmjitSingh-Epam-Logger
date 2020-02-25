package epam.Logger.SimpleInterestCompoundInterest;

public class CompoundInterest extends Interest{
	private double CI;
	public CompoundInterest() {
		super();
		CI=0.0;
	}
	@Override
	public void setData(double principle,double rate,double timePeriod)
	{
		this.principle=principle;
		this.timePeriod=timePeriod;
		CompoundInterest.setRate(rate);
	}
	public void calculateCI()
	{
		double amount=principle*Math.pow((1+rate/100),timePeriod);
		CI=amount-principle;
	}
	@Override
	public void displayResult() {
		Logger.info("Compound Interest : "+CI+" \n.");
	}
}
