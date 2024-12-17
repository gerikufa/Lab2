package mymoves.arbok;

import ru.ifmo.se.pokemon.*;

public final class FireFang extends PhysicalMove {
    public FireFang(double pow, double arc){
        super(Type.FIRE, pow, arc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (1 / 10.0 > Math.random()){
            Effect.burn(p);
        }
        if (1 / 10.0 > Math.random()){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
