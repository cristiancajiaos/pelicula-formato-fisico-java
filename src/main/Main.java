package main;

import formato.DVD;
import formato.Pelicula;
import formato.VHS;

public class Main {

    public static void main(String[] args) {
        Pelicula toyStory1 = new Pelicula("Toy Story 1", 1995, "EEUU");
        Pelicula toyStory2 = new Pelicula("Toy Story 2", 1999, "EEUU");
        Pelicula toyStory3 = new Pelicula("Toy Story 3", 2010, "EEUU");

        VHS vhsToyStory1 = new VHS(toyStory1, "Cinta", 1996);
        DVD dvdToyStory2 = new DVD(toyStory2, "Disco", 2000);
        DVD dvdToyStory3 = new DVD(toyStory3, "Disco", 2010);

        vhsToyStory1.getDescripcion();
        dvdToyStory2.getDescripcion();
        dvdToyStory3.getDescripcion();

    }

}
