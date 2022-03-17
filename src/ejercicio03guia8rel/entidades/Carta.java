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
    private String letraynumero;
    private String palo;

    //Constantes
    public static final String[] PALOS = {"♠", "♣", "♥", "♦"};
    public static final String[] LETRA_NUMERO={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    //Constructor
    public Carta(String letraynumero, String palo) {
        this.letraynumero = letraynumero;
        this.palo = palo;
    }

    public String getLetraynumero() {
        return letraynumero;
    }

    public void setLetraynumero(String letraynumero) {
        this.letraynumero = letraynumero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    
    @Override
    public String toString() {
        
        return  "*******\n"+
        "*  "+letraynumero+palo+"*\n"+
        "*     *\n"+
        "*     *\n"+
        "*"+palo+letraynumero+"  *\n"+
        "*******" ;                
    }
}
