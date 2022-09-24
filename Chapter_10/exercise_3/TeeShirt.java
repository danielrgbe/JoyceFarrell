public class TeeShirt
{
	private String orderNumber;
	private Size size;
	private Color color;
	private double price;
	
	public TeeShirt(String orderNumber, Size size, Color color)
	{
		this.orderNumber = orderNumber;
		this.size = size;
		this.color = color;	
	}	
	
	public TeeShirt()
	{
		this("000", Size.M, Color.WHITE);
	}
	
	public String getOrderNumber()
	{
		return orderNumber;
	}

	public Size getSize()
	{
		return size;
	}
	public Color getColor()
	{
		return color;
	}
//	public double getPrice()
//	{
//		return price;
//	} 
	
	public void setSize(Size tam)
	{
		this.size = tam;
	}

	public double getPrice()
	{
		setPrice(calculatePrice(getSize()));
		return price;
	}
	public double calculatePrice(Size tam)
	{
		if(tam == Size.XXL || tam == Size.XXL)
			return 22.99;
		else
			return 19.99;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setColor(Color color)
	{
		this.color = color;
	}
	@Override
	public String toString()
	{
		StringBuilder tsSB = new StringBuilder();

		tsSB.append("Product: T-shirt\n");
		tsSB.append("Order number: ");
		tsSB.append(getOrderNumber());
		tsSB.append("\n");
		tsSB.append("Size: ");
		tsSB.append(getSize().toString());
		tsSB.append("\n");
		tsSB.append("Color: ");
		tsSB.append(getColor().toString());
		tsSB.append("\n");
		tsSB.append("Price: ");
		tsSB.append(getPrice());
		tsSB.append("$\n");

		return tsSB.toString();


	}
}
