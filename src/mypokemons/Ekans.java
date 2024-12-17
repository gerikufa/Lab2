package mypokemons;

import mymoves.arbok.*;
import ru.ifmo.se.pokemon.*;

public class Ekans extends Pokemon {
    public Ekans(String name, int level){
        super(name, level);

        setType(Type.POISON);
        setStats(35, 60, 44, 40, 54, 55);

        Haze haze = new Haze();
        Swagger swagger = new Swagger(85);
        Coil coil = new Coil();

        super.setMove(haze, swagger, coil);
    }
}
