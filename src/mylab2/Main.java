package mylab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Cryogonal cryogonal = new Cryogonal("ICE", 5);
        Ekans ekans = new Ekans("SNAKE", 5);
        Arbok arbok = new Arbok("FIRE", 5);
        Flabebe flabebe = new Flabebe("FLOWER", 5);
        Floette floette = new Floette("FLOWEY", 5);
        Florges florges = new Florges("FLOWEY THE FLOWER", 5);

        b.addAlly(ekans);
        b.addAlly(florges);
        b.addAlly(cryogonal);



        b.addFoe(flabebe);
        b.addFoe(floette);
        b.addFoe(arbok);

        b.go();
    }
}