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
public class ScentedCandle extends Candle
{
    final static int RATE_WITH_SCENT = 3;
    private Scent esencia;

    public ScentedCandle()
    {
        super();
        esencia = Scent.LAVANDA;
    }
    
    @Override
    public double calculatePrice()
    {
        return RATE_WITH_SCENT * getHeight();
    }
    
    @Override
    public String toString()       
    {
        StringBuilder scentSB = new StringBuilder();
        scentSB.append(super.toString());
        scentSB.append("Scent: ");
        scentSB.append(getEsencia());
        scentSB.append("\n");
        return scentSB.toString();
    }

    public Scent getEsencia()
    {
        return esencia;
    }

    public void setEsencia(Scent esencia)
    {
        this.esencia = esencia;
    }
    
    
     
    
}
