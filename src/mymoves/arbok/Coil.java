package mymoves.arbok;

import ru.ifmo.se.pokemon.*;

public final class Coil extends StatusMove {
    public Coil(){
        super(Type.POISON, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(-1).stat(Stat.DEFENSE, 1));
        p.addEffect(new Effect().turns(-1).stat(Stat.ATTACK, 1));
        p.addEffect(new Effect().turns(-1).stat(Stat.ACCURACY, 1));
        System.out.println(p.toString() + " defense +1, attack +1, accuracy +1");
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
