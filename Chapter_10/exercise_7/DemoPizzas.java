public class DemoPizzas
{
    public static void main(String[] args)
    {
	Pizza p = new Pizza();
	Pizza paraLlevar = new DeliveryPizza("Av. Miguel Hidalgo #1521");
	Pizza pSpecial = new Pizza(Pizza.pepperoni_special, 14.99);
	System.out.println(p);
	System.out.println(pSpecial);
	System.out.println("Para llevar\n" + paraLlevar);
	//paraLlevar.setPrice(20);
//	System.out.println(paraLlevar);
	//showIngredients();
	paraLlevar.addIngredient(Pizza.Ingredients.CHAMPIGNON);
	paraLlevar.addIngredient(Pizza.Ingredients.ONION);
	paraLlevar.addIngredient(Pizza.Ingredients.BACON);
	System.out.println(paraLlevar);
    }
    public static void showIngredients()
    {
	char opt = 'a';
	for(Pizza.Ingredients x : Pizza.Ingredients.values())
	{
	    System.out.print(opt + ") ");
	    System.out.println(x);
	    opt ++;
	}
    }
    
}
