package computer;

public abstract class Computer implements main.SaleItem {
	protected String modelName;
	protected component.Component cpu;
	protected component.Component display;
	
	public double price()
	{
		return cpu.price()+display.price();
	}
	
	public abstract boolean isWearable();
	
	public abstract boolean isPortable();
	
	public String getModelName()
	{
		return modelName;
	}
	public component.Component getCpu()
	{
		return cpu;
	}
	public component.Component getDisplay()
	{
		return display;
	}
}
