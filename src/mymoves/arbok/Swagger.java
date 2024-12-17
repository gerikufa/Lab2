package mymoves.arbok;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {

    public Swagger(double acc) {
        super(Type.NORMAL, 0, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(-1).stat(Stat.ATTACK, 2);
        p.addEffect(e);
        System.out.println(p.toString() + " attack +2");
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        System.out.println(p.toString() + " confused");
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}