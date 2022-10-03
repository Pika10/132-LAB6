package computer;

public class Desktop extends Computer {
	
	public Desktop(component.CPU cpu, component.Display display, String modelName)
	{
		this.modelName= modelName;
		this.cpu = cpu;
		this.display=display;
	}
	
	public double price() 
	{
		return cpu.price()+display.price();
	}
	public boolean isWearable()
	{
		return false;
	}
	public boolean isPortable()
	{
		return false;
	}
	public String toString() {
		return "Desktop:\n- modelName=" + getModelName() + "\n- Cpu=" + getCpu() + "\n- Display="
				+ getDisplay() + "\n- price=" + String.format("%.2f", price());
}
}

