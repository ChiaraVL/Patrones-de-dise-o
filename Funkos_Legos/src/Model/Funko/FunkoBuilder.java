package Model.Funko;

import Model.Builder;
import Model.Head;
import Model.Body;
import Model.Legs;
import Model.familyFactory;
import Model.Funko.Dc.DcFunkoFactory;
import Model.Funko.Marvel.MarvelFunkoFactory;

public class FunkoBuilder implements Builder{

    private familyFactory Factory;

    @Override
    public void family(String op) {
        if(op.equals("Marvel")){
            this.Factory = new MarvelFunkoFactory();
        } else if(op.equals("Dc")){
            this.Factory = new DcFunkoFactory();
        }
    }

    @Override
    public Head getCabeza() {
        return Factory.makeHead();
    }

    @Override
    public Body getCuerpo() {
        return Factory.makeBody();
    }

    @Override
    public Legs getPiernas() {
        return Factory.makeLegs();
    }
    
}
