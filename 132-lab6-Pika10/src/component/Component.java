package component;

public abstract class Component implements main.SaleItem{
	abstract double productionCost();
	abstract double profitRate();
	public double price()
	{
		return productionCost()*(1+profitRate());
	}
	
}
