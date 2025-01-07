package marvel;

import model.CasaCinematografica;
import model.Heroe;
import model.Villano;

public class Marvel implements CasaCinematografica{

	@Override
	public Heroe getHeroe() {
		return new Ironman();
	}

	@Override
	public Villano getVillano() {
		// TODO Auto-generated method stub
		return new Loki();
	}

}
