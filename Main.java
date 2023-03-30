import clases.Lola;
import clases.Pepe;

public class Main {
    public static void main(String[] args) {

        Pepe pepe = new Pepe();
        Lola lola = new Lola();

        //Pepe
        pepe.edad(7);
        pepe.nombre("Pepe");
        pepe.hacerSonido("Ladrar");
        System.out.println("Hola me llamo " + pepe.nombre + " , tengo " + pepe.edad + " anios." + " Soy un animal domestico y puedo " + pepe.sonido);
        pepe.pasear();

        System.out.println("\n");

        //Lola
        lola.nombre("Lola");
        lola.edad(5);
        lola.hacerSonido("Rugir");
        System.out.println("Hola me llamo " + lola.nombre + " , tengo " + lola.edad + " anios." + " Soy un animal salvaje y puedo " + lola.sonido);
        lola.cazar();
        lola.defender();
    }
}
