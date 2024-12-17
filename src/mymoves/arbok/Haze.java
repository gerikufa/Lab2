package mymoves.arbok;

import ru.ifmo.se.pokemon.*;

public final class Haze extends StatusMove {
    String pokemon;
    public Haze(){
        super(Type.ICE, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 0);
        p.setMod(Stat.ATTACK, 0);
        p.setMod(Stat.SPEED, 0);
        p.setMod(Stat.DEFENSE, 0);
        p.setMod(Stat.EVASION, 0);
        p.setMod(Stat.SPECIAL_DEFENSE, 0);
        p.setMod(Stat.SPECIAL_ATTACK, 0);
        System.out.println(p.toString() + " все изменения характеристик сброшены.");
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
