package mymoves.florges;

import ru.ifmo.se.pokemon.*;

public final class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(-1).stat(Stat.EVASION, 1);
        p.addEffect(e);
        System.out.println(p.toString() + " evasion +1");
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
