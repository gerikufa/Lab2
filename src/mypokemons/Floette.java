package mypokemons;

import mymoves.florges.*;
import ru.ifmo.se.pokemon.*;

public class Floette extends Flabebe{
    public Floette(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(54, 45, 47, 75, 98, 52);

        MagicalLeaf magicalLeaf = new MagicalLeaf(60, 100);
        Facade facade = new Facade(70, 100);
        RazorLeaf razorLeaf = new RazorLeaf(55, 95);

        super.setMove(magicalLeaf, facade, razorLeaf);
    }
}
