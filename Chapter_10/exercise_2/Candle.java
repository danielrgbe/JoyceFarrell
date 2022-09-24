/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo10.ejercicio2;

/**
 *
 * @author daniel
 */
public  class Candle
{
    private Color color;
    private double height;//Height in inches
    private double price;
    final static int RATE  = 2;

    public Candle()
    {
        this(Color.WHITE, 3.5);
    }

    public Candle(Color color, double height)
    {
        this.color = color;
        this.height = height;
    }
    

    public Color getColor()
    {
        return color;
    }

    public double getHeight()
    {
        return height;
    }

    public double getPrice()
    {
        setPrice();
        return price;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setHeight(double height)
    {
        //As the price depends of the height lineraly every time we set a height for a candle its price going to 
        //change deu this every time set a height invoke the setPrice() method
        //final int RATE = 2;
        this.height = height;
        //setPrice(RATE);
    }
    
    public double calculatePrice()
    {
        return RATE * getHeight();
    }    
    
    public  void setPrice()
    {
        //This method calculates the price of a candle in function of his height linearly $2 per inch 
         this.price = calculatePrice();
    }
    
    public String toString()
    {
        StringBuilder candleSB = new StringBuilder();
        
        candleSB.append("Color: ");
        candleSB.append(getColor().toString());
        candleSB.append("\n");
        
        candleSB.append("Height: ");
        candleSB.append(getHeight());
        candleSB.append("\n");
        
        candleSB.append("Price: ");
        candleSB.append(getPrice());
        candleSB.append("\n");
        
        return candleSB.toString();
    }
    
    
    
}
