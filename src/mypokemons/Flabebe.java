package mypokemons;

import mymoves.florges.*;
import ru.ifmo.se.pokemon.*;

public class Flabebe extends Pokemon{
    public Flabebe(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(44, 38, 39, 61, 79, 42);

        MagicalLeaf magicalLeaf = new MagicalLeaf(60, 100);
        Facade facade = new Facade(70, 100);

        super.setMove(magicalLeaf, facade);
    }
}
