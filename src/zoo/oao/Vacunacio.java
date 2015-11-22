/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.oao;

/**
 *
 * @author Oriol Alex Oriol
 * 
 */
public class Vacunacio extends Animal {
    protected String vacuna;
    protected String data;

    public Vacunacio(int codi_animal, int codi_veterinari, String vacuna, String data) {
	this.codi_animal=codi_animal;	
        this.codi_veterinari=codi_veterinari;
        this.vacuna=vacuna;
        this.data=data;
    }

    public String getVacuna() {
        return vacuna;
    }

    public String getData() {
        return data;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Vacunació{ codi animal=" + codi_animal + ", codi_veterinari=" + codi_veterinari + ", vacuna=" + vacuna + ", data=" + data + '}';
    }  
}