package mypokemons;

import mymoves.arbok.*;
import ru.ifmo.se.pokemon.*;

public final class Arbok extends Ekans{
    public Arbok(String name, int level){
        super(name, level);

        setType(Type.POISON);
        setStats(60, 95, 69, 65, 79, 80);

        Haze haze = new Haze();
        Swagger swagger = new Swagger(85);
        Coil coil = new Coil();
        FireFang fireFang = new FireFang(65, 95);

        super.setMove(haze, swagger, coil, fireFang);
    }
}
