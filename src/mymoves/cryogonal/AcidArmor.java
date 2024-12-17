package mymoves.cryogonal;

import ru.ifmo.se.pokemon.*;

public final class AcidArmor extends StatusMove {
    public AcidArmor(){
        super(Type.POISON, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(-1).stat(Stat.DEFENSE, 2);
        p.addEffect(e);
        System.out.println(p.toString() + " defense +2");
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
