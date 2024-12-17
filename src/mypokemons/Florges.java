package mypokemons;

import mymoves.florges.*;
import ru.ifmo.se.pokemon.*;

public final class Florges extends Floette{
    public Florges(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(78, 65, 68, 112, 154, 75);

        MagicalLeaf magicalLeaf = new MagicalLeaf(60, 100);
        Facade facade = new Facade(70, 100);
        RazorLeaf razorLeaf = new RazorLeaf(55, 95);
        DoubleTeam doubleTeam = new DoubleTeam();

        super.setMove(magicalLeaf, facade, razorLeaf, doubleTeam);
    }
}
