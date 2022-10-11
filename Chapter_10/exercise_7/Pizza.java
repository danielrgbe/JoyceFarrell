public class Pizza
{
   public static enum Ingredients{TOMATO_SAUCE, PEPPERONI, BACON,ONION, PARMESANO_CHESSE, CHAMPIGNON};
   public static Ingredients[] pepperoni = {Ingredients.TOMATO_SAUCE, Ingredients.PARMESANO_CHESSE, Ingredients.PEPPERONI}; 
   public static Ingredients[] pepperoni_special = {Ingredients.TOMATO_SAUCE, Ingredients.PARMESANO_CHESSE, Ingredients.PEPPERONI, Ingredients.CHAMPIGNON}; 

   private double price;
   private Ingredients[] description;

   public Pizza(Ingredients[] description, double price)
   {
       this.price = price;
       this.description = description;
   }

   public Pizza()
   {
       this(pepperoni, 9.99);
   }

   public void setPrice(double price)
   {
       this.price = price;
   }

   public double getPrice()
   {
       return price;
   }

   public void addIngredient(Ingredients nuevoIngrediente)
   {
       int index = 0;
       int size = description.length;
       Ingredients[] temp = new Ingredients[size +1];
       for(Ingredients x : description)
       {
	   temp[index] = x;
	   index ++;
       }

       temp[size] = nuevoIngrediente;

       description = temp;
       setPrice(getPrice() + 2);
   }


   
   @Override
   public String toString()
   {
       StringBuilder descripSB = new StringBuilder();
       descripSB.append("Description\n");
       descripSB.append("Ingredients:\n");
       for(Ingredients x : description) 
       {
	   descripSB.append(x.toString());
	   descripSB.append("\n");
       }
       descripSB.append("Price: $");
       descripSB.append(price);
       descripSB.append("\n");

       return descripSB.toString();
   }

}
