/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package ejercicio03guia8rel.entidades;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Carta {

    //Atributos
    private int numero;
    private String palo;

    //Constantes
    public static final String[] PALOS = {"♠", "♣", "♥", "♦"};
    public static final int LIMITE_CARTA_PALO = 12;

    //Constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

//    @Override
//    public String toString() {
//        return "Número:" + numero + ", Palo:" + palo;
//    }
    
    @Override
    public String toString() {
        
        return  "*******\n"+
        "*  "+numero+palo+"*\n"+
        "*     *\n"+
        "*     *\n"+
        "*"+palo+numero+"  *\n"+
        "*******" ;                
    }
}
