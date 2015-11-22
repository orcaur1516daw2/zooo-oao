/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.oao;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Oriol Alex Oriol
 */
public class Vacunacio {
    protected String[] vacuna;
    protected Date[] data;

    public Vacunacio() {
		
    }
    
    public void setVacuna(String aFecha, String aVacuna) {
        GregorianCalendar gc = new GregorianCalendar();
        int a = 1;
        this.vacuna[a] = aVacuna;
        this.data[a] = gc.getTime();
    }
   
    public String getVacuna() {
        int a = 1;
        return this.vacuna[a];
    }

    @Override
    public String toString() {
        return "Vacunacio{" + "vacuna=" + vacuna + ", data=" + data + '}';
    }
    
    
     
}