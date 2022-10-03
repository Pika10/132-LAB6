package component;

public class CPU extends Component{
	private double frequency;
	private double numTransistors;
	public CPU(double frequency,double numTransistors)
	{
		this.frequency=frequency;
		this.numTransistors=numTransistors;
	}
	double productionCost()
	{
		return frequency*50;
	}
	double profitRate()
	{
		if (frequency>2.4)
		{
			return 0.3;
		}
		else
		{
			return 0.2;
		}
	}
	public double getFrequency()
	{
		return frequency;
	}
	public double getNumTransistors()
	{
		return numTransistors;
	}
	
	
	
	
	public String toString() {
		return "frequency=" + getFrequency()+ ", numTransistors=" + getNumTransistors() + ", price=" + String.format("%.2f", price());
	}
}
