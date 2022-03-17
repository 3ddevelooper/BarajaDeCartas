/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package ejercicio03guia8rel.entidades;


import java.util.List;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Baraja {
    //Atributos
    private  List<Carta> cartas;
    private  int posSiguienteCarta;

    public Baraja(List<Carta> cartas, int posSiguienteCarta) {
        this.cartas = cartas;
        this.posSiguienteCarta = posSiguienteCarta;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getPosSiguienteCarta() {
        return posSiguienteCarta;
    }

    public void setPosSiguienteCarta(int posSiguienteCarta) {
        this.posSiguienteCarta = posSiguienteCarta;
    }
 
    
}
