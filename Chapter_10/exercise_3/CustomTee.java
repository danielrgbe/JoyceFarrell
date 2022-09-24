public class CustomTee extends TeeShirt
{
	String slogan;
	public CustomTee()
	{
		super();
		slogan = "Not today";
	}
	
	public String getSlogan()
	{
		return slogan;
	}
	public void setSlogan(String slogan)
	{
		this.slogan = slogan;
	}

	@Override
	public String toString()
	{
		StringBuilder customSB = new StringBuilder();

		customSB.append(super.toString());
		customSB.append("Slogan: ");
		customSB.append(getSlogan());
		
		return customSB.toString();
	}
}
