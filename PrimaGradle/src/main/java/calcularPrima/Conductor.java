/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularPrima;
/**
 *
 * @author vlaurido
 */

public class Conductor {
    public static final int MAXIMOPUNTOS = 30;
    public static final int TARIFABASICA = 500;
    private int edad;
    private int puntosLic;
    
	public Conductor(int edad, int puntosLic) {
	    this.edad = edad;
	    this.puntosLic = puntosLic;
	}

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the puntosLic
     */
    public int getPuntosLic() {
        return puntosLic;
    }

    /**
     * @param puntosLic the puntosLic to set
     */
    public void setPuntosLic(int puntosLic) {
        this.puntosLic = puntosLic;
    }
    
    public boolean puedeAsegurarse() {
        return (this.edad >= 18 && this.edad <= 90);
    }
    
    public boolean puedeConducir() {
        return (this.puntosLic > 0 && !(this.puntosLic > 30));
    }
    
    public boolean verificarPuntos() {
        return (this.edad < 25 && this.puntosLic >= MAXIMOPUNTOS -1)||
                (this.edad >= 25 && this.edad < 35 && this.puntosLic >= MAXIMOPUNTOS - 3) ||
                (this.edad >= 35 && this.edad < 45 && this.puntosLic >= MAXIMOPUNTOS - 5) ||
                (this.edad >= 45 && this.edad < 65 && this.puntosLic >= MAXIMOPUNTOS - 7) ||
                (this.edad >= 65 && this.puntosLic >= MAXIMOPUNTOS -5);
    }
    
    public double calcularPrima() {
        if (this.verificarPuntos()) {
            if (this.edad < 25) return TARIFABASICA * 2.8 - 50;
            else if (this.edad >= 25 && this.edad < 35) return TARIFABASICA * 1.8 - 50;
            else if (this.edad >= 35 && this.edad < 45) return TARIFABASICA * 1 - 100;
            else if (this.edad >= 45 && this.edad < 65) return TARIFABASICA * 0.8 - 150;
            else return TARIFABASICA * 1.5 - 200;
        }
        else {
            if (this.edad < 25) return TARIFABASICA * 2.8;
            else if (this.edad >= 25 && this.edad < 35) return TARIFABASICA * 1.8;
            else if (this.edad >= 35 && this.edad < 45) return TARIFABASICA * 1;
            else if (this.edad >= 45 && this.edad < 65) return TARIFABASICA * 0.8;
            else return TARIFABASICA * 1.5;
        }
    }
}
