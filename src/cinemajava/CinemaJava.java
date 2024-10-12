package cinemajava;

import cine.Asientos;
import cine.Pelicula;

public class CinemaJava {

    public static void main(String[] args) {

        Pelicula pelicula_1 = new Pelicula();
        System.out.println("Hola bienvenido a CinePaz");
        System.out.println("\n_____________________________________________\n");
        pelicula_1.setPelicula(" Transformers: el último caballero. ");
        pelicula_1.setHora(2);
        pelicula_1.setMinutos(34);
        pelicula_1.setEdadmin(12);
        pelicula_1.setPrecio(12000);
        pelicula_1.setDirector("Michael Bay");

        System.out.println("Nombre de la pelicula = " + 
                pelicula_1.getPelicula());
        System.out.println("Duración = " + pelicula_1.getHora() + "h "
                + pelicula_1.getMinutos() + "min ");
        System.out.println("Edad mínima = " + pelicula_1.getEdadmin()
                + " Años");
        System.out.println("Valor de la entrada = " + 
                pelicula_1.getPrecio() + " Cop");
        System.out.println("Director = " + pelicula_1.getDirector());
        System.out.println("\n_____________________________________________\n");

        Asientos asientos = new Asientos();
        asientos.menu();

    }
}
