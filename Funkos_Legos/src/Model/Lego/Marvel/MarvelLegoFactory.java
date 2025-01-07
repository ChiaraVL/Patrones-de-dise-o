package Model.Lego.Marvel;

import Model.Head;
import Model.Body;
import Model.Legs;
import Model.familyFactory;

public class MarvelLegoFactory implements familyFactory{

    @Override
    public Head makeHead() {
        return new MarvelHead();
    }

    @Override
    public Body makeBody() {
        return new MarvelBody();
    }

    @Override
    public Legs makeLegs() {
        return new MarvelLegs();
    }

}
