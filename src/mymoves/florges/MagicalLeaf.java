package mymoves.florges;

import ru.ifmo.se.pokemon.*;

public final class MagicalLeaf extends SpecialMove{
    public MagicalLeaf(double pow, double arc){
        super(Type.GRASS, pow, arc);
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
