package Model.Lego.Dc;

import Model.Head;
import Model.Body;
import Model.Legs;
import Model.familyFactory;

public class DcLegoFactory implements familyFactory{

    @Override
    public Head makeHead() {
        return new DcHead();
    }

    @Override
    public Body makeBody() {
        return new DcBody();    
    }

    @Override
    public Legs makeLegs() {
        return new DcLegs();    
    }

}
