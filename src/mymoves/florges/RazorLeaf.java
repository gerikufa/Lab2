package mymoves.florges;

import ru.ifmo.se.pokemon.*;

public final class RazorLeaf extends PhysicalMove{
    public RazorLeaf(double pow, double arc){
        super(Type.GRASS, pow, arc);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if(att.getStat(Stat.SPEED) * 3.0 / 512.0 > Math.random()) {
            System.out.println("Критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}