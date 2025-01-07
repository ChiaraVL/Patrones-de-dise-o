package Model.Lego;

import Model.Builder;
import Model.Head;
import Model.Body;
import Model.Legs;
import Model.familyFactory;
import Model.Lego.Dc.DcLegoFactory;
import Model.Lego.Marvel.MarvelLegoFactory;


public class LegoBuilder implements Builder {

    private familyFactory Factory;

    @Override
    public void family(String op) {
        if(op.equals("Marvel")){
            this.Factory = new MarvelLegoFactory();
        } else if(op.equals("Dc")){
            this.Factory = new DcLegoFactory();
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
