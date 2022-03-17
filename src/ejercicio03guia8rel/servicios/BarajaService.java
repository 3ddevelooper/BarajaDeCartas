/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package ejercicio03guia8rel.servicios;

import ejercicio03guia8rel.entidades.Baraja;
import ejercicio03guia8rel.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class BarajaService {
    
    
     Baraja baraja = crearBaraja();
     List<Carta> cartasRemovidas= new ArrayList<>();
     private final int NUM_CARTAS_TOTAL = 40;
     
     
    //Crea la baraja ordenada
    private Baraja crearBaraja() {
 
        String[] palos = Carta.PALOS;
        List<Carta> cartas = new ArrayList<>();
 
         //Recorro los palos
         for (String palo : palos) {
             //Recorro los numeros
             for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++) {
                 //Las posiciones del 8 y del 9 son el 7 y el 8 (emepzamos en 8)
                 if (!(j == 7 || j == 8)) {
                     if (j >= 9) {
                         //Solo para la sota, caballo y rey
                         cartas.add(new Carta(j+1, palo));
                     } else {
                         //Para los casos de 1 a 7
                         cartas.add(new Carta(j+1, palo));
                     }
                 }
             }
         }
      
       return new Baraja(cartas,0);
    }
    
    //Muestra las cartas en la baraja
    private String mostrarBaraja(){
        return baraja.getCartas().stream().map((carta) -> carta.toString()+"\n").reduce("", String::concat);
    }
    
    
    //Baraja las cartas para ubicarlas de forma aleatoria
    public void barajar() {
     Collections.shuffle(baraja.getCartas());
    }
    
    //Saca la siguente carta del mazo
    public String siguienteCarta() {
        String retorno = baraja.getCartas().get(baraja.getPosSiguienteCarta()).toString()+"\n";
        cartasRemovidas.add(baraja.getCartas().remove(baraja.getPosSiguienteCarta()));
        return retorno;
    }
    
    //Saca la cantidad de cartas que el usuario quiera del mazo
    private String sacarNCartas(int numCartas) {
        String retorno = "";
        if (numCartas > baraja.getCartas().size()) {
            retorno = "No se puede dar mas cartas de las que hay";
        } else if (baraja.getCartas().size() < numCartas) {
            retorno= "No hay suficientes cartas que mostrar";
        } else {
            //recorro el mazo sacando carta a carta utilizando el metodo anterior y la cantidad de iteraciones es la que ingreso el usuario
            for (int i = 0; i < numCartas; i++) {
                 retorno+=siguienteCarta(); //uso el metodo anterior
            }
        }
        return "Las cartas sacadas son: \n"+retorno;
     }
    
    private int cartasDisponibles(){
      return baraja.getCartas().size();
    }
    
    private String cartasMonton() {
 
        if (baraja.getCartas().size() == NUM_CARTAS_TOTAL) {
            return "No se ha sacado ninguna carta";
        } else {
            return "Las cartas del monton son: \n"+cartasRemovidas.stream().map((carta) -> carta.toString()+"\n").reduce("", String::concat);
        }
 
    }
    
    public void Jugar(){
        Scanner read = new Scanner(System.in);
        System.out.println("\t--------BIENVENIDO AL JUEGO DE LA BARAJA--------");
         int option;
        do {
            System.out.println("OPCIONES:\n1: Mostrar Baraja.\n2: Barajar\n3: Sacar Siguiente Carta."
                    + "\n4: Sacar Varias Cartas.\n5: Mostrar Cantidad de Cartas Disponibles.\n6: Mostrar Monton de Cartas Sacadas.\n7: Salir");
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println(mostrarBaraja()+"\n");
                    break;
                case 2:
                    barajar();
                    break;
                case 3:
                    System.out.println("La carta sacada es : \n"+siguienteCarta()+"\n");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cartas a sacar");
                    int num = read.nextInt();
                    System.out.println(sacarNCartas(num)+"\n");
                    break;
                case 5:
                    System.out.println("Las cantidad de cartas disponibles es: "+cartasDisponibles()+"\n");
                    break;
                case 6:
                     System.out.println(cartasMonton());
                case 7:
                    break;
                default:
                    System.out.println("Opción Incorrecta, intente de nuevo");
            }
        } while (option != 7);
    
    }

}
