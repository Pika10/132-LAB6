package computer;

public class Laptop extends Computer{
	private int cameraCost;
	public Laptop(component.CPU cpu,component.Display display, String modelName, int cameraCost)
	{
		this.cpu=cpu;
		this.display=display;
		this.modelName=modelName;
		this.cameraCost=cameraCost;
	}
	public boolean isWearable()
	{
		return false;
	}
	public boolean isPortable()
	{
		return true;
	}
	public int getCameraCost()
	{
		return cameraCost;
	}
	public double price()
	{
		return (cpu.price()+display.price()+cameraCost);
	}
	
	public String toString()
	{
		return "Laptop:\n- cameraCost=" + getCameraCost() + "\n- modelName=" + getModelName() + "\n- cpu=" + getCpu() + "\n- display=" + getDisplay() + "\n- price=" + String.format("%.2f", price());
	}
	
	
}
