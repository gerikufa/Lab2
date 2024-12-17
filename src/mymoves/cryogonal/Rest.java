package mymoves.cryogonal;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = (new Effect()).condition(Status.SLEEP).attack(0.0).turns(2);
        p.setCondition(e);
        int HP = (int)(p.getStat(Stat.HP) - p.getHP());
        p.setMod(Stat.HP, -HP);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
