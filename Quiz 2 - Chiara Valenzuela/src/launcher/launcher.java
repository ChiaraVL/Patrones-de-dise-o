package launcher;

import java.util.Random;
import dc.*;
import marvel.*;
import model.*;

public class launcher {
	public static void main(String[] args) {
		
		CasaCinematografica f = null;
		
		Random r =  new Random();
		int i =  r.nextInt(10);
		
		if(i<5) {
			f = new Marvel();
		}else {
			f =  new DC();
		}
		
		Heroe h = f.getHeroe();
		Villano v = f.getVillano();
		
		System.out.println("~ Soy "+h.name()+". "+h.action());
		System.out.println("~ Mi nombre es "+v.name()+". "+v.action());
		
		if(r.nextInt(10)<5) {
			System.out.println("Resultado: "+h.name()+" gana.");
		}else {
			System.out.println("Resultado: "+v.name()+" gana.");
		}
	}
}
