package Model;

import Model.Funko.FunkoBuilder;
import Model.Lego.LegoBuilder;

public class Director {

    private Builder builder;
	private static Director director = null;
	
	public static Director getInstance() {
		if (director == null) {
			director = new Director();
		}
		return director;
	}
    
	
	public void type(String toy) {
		if (toy.equals("Funko")) {
			this.builder = new FunkoBuilder();

		}
		else if(toy.equals("Lego")) {
			this.builder = new LegoBuilder();
		}
	}

    public void make(String fam){
        this.builder.family(fam);
        this.builder.getCabeza();
        this.builder.getCuerpo();
        this.builder.getPiernas();
    }

    public Builder getBuilder() {
		return builder;
	}
}
