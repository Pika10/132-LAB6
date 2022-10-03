package computer;

public class SmartWatch extends Computer{
	private int buckleCost;
	public SmartWatch(component.CPU cpu, component.Display display, String modelName, int buckleCost)
	{
		this.cpu=cpu;
		this.display=display;
		this.modelName=modelName;
		this.buckleCost=buckleCost;
	}
	
	public boolean isWearable()
	{
		return true;
	}
	public boolean isPortable()
	{
		return true;
	}
	public int getBuckleCost()
	{
		return buckleCost;
	}
	public double price()
	{
		return (cpu.price()+display.price()+buckleCost);
	}
	public String toString()
	{
		return "SmartWatch:\n- buckleCost=" + getBuckleCost() + "\n- modelName=" + getModelName() + "\n- cpu=" + getCpu() + "\n- display=" + getDisplay() + "\n- price=" + String.format("%.2f", price());
	}
}
