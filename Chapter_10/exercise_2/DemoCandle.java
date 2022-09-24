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
public class DemoCandle
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Candle vela1 = new Candle();
        ScentedCandle vela2 = new ScentedCandle();
        
        
        System.out.println(vela1);
        vela1.setHeight(1.5);
        System.out.println(vela1);
        
        System.out.println(vela2);
        vela2.setHeight(9);
        vela2.setEsencia(Scent.AQUA_DI_GIO);
        System.out.println(vela2);
    }
    
}
