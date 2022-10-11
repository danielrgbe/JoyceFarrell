public class DeliveryPizza extends Pizza
{
    private double fee;
    private String address;

    public DeliveryPizza(String address)
    {
	this.address = address;
	setFee();
    }

    public void setFee()
    {
	fee = getPrice() < 15 ? 5 : 3;
    }

    public double getFee()
    {
	setFee();
	return fee;
    }

    public String getAddress()
    {
	return address;
    }

    @Override
    public String toString()
    {
	StringBuilder deliverSB = new StringBuilder();

	deliverSB.append(super.toString());
	deliverSB.append("Deliver fee: $");
	deliverSB.append(getFee());
	deliverSB.append("\n");
	deliverSB.append("Address: ");
	deliverSB.append(getAddress());
	deliverSB.append("\n");
	return deliverSB.toString();

    }


}
