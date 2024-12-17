package mymoves.cryogonal;

import ru.ifmo.se.pokemon.*;

public final class AuroraBeam extends SpecialMove {
    public AuroraBeam(double pow, double arc){
        super(Type.ICE, pow, arc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (1 / 10.0 > Math.random()){
            Effect e = new Effect().turns(-1).stat(Stat.ATTACK, -1);
            p.addEffect(e);
            System.out.println(p.toString() + " looses 1 attack");
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
