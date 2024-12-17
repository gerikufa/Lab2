package mypokemons;

import mymoves.cryogonal.*;
import ru.ifmo.se.pokemon.*;

public final class Cryogonal extends Pokemon {
    public Cryogonal(String name, int level){
        super(name, level);

        setType(Type.ICE);
        setStats(80, 50, 50, 95, 135, 105);

        Rest rest = new Rest();
        AuroraBeam auroraBeam = new AuroraBeam(65, 100);
        AcidArmor acidArmor = new AcidArmor();
        Slash slash = new Slash(70, 100);

        super.setMove(rest, auroraBeam, acidArmor, slash);
    }
}
