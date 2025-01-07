package dc;

import model.CasaCinematografica;
import model.Heroe;
import model.Villano;

public class DC implements CasaCinematografica{

	@Override
	public Heroe getHeroe() {
		return new Batman();
	}

	@Override
	public Villano getVillano() {
		// TODO Auto-generated method stub
		return new Joker();
	}

}
