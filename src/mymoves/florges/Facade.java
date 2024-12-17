package mymoves.florges;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove{
    public Facade(double pow, double arc){
        super(Type.NORMAL, pow, arc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        if (def.getCondition().equals(Status.POISON) || def.getCondition().equals(Status.BURN) || def.getCondition().equals(Status.PARALYZE)){
            super.applyOppDamage(def, damage);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
