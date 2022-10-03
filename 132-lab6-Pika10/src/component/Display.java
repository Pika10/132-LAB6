package component;

public class Display extends Component{
	private int width;
	private int height;
	private String resolution;
	private final double productionCostPerPixel=0.0001;
	public Display(int width,int height)
	{
		this.width=width;
		this.height=height;
		this.resolution=width+"x"+height;
		
	}
	
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public String getResolution()
	{
		return resolution;
	}
	double productionCost()
	{
		return productionCostPerPixel*width*height;
	}
	double profitRate()
	{
		return 0.25;
	}
	
	public String toString() {
		return "width=" + getWidth()+ ", height=" + getHeight() + ", resolution=" + getResolution()
				+ ", productionCostPerPixel=" + productionCostPerPixel + ", productionCost=" + String.format("%.2f", productionCost()) + ", price=" + String.format("%.2f", price());
}
}
