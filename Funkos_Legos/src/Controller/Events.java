package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Logic;
import View.Window;

public class Events implements ActionListener {

	
	private Logic l;
	private Window v;
	
	public Events(Logic l) {
		this.l=l;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

        if (e.getSource() == v.button1) {
			v.button1.setVisible(false);
			v.botoneOpt();
		}
		if(e.getSource() == v.buttonO || e.getSource() == v.buttonO2) {
			l.call().type(e.getActionCommand());
			v.buttonO.setVisible(false);
			v.buttonO2.setVisible(false);
			v.botoneGen();
		}
		if(e.getSource() == v.buttonF || e.getSource() == v.buttonM) {
			l.call().make(e.getActionCommand());
			v.crearCanva(l.call().getBuilder().getCabeza(), l.call().getBuilder().getCuerpo(), l.call().getBuilder().getPiernas());
			v.buttonF.setVisible(false);
			v.buttonM.setVisible(false);
			v.botoneMod();
			v.buttonGG.setVisible(true);
		}


        if(e.getSource() == v.buttonH){
            l.call().getBuilder().getCabeza().changeImage();
            v.crearCanva(l.call().getBuilder().getCabeza(), l.call().getBuilder().getCuerpo(), l.call().getBuilder().getPiernas());
        }

        if(e.getSource() == v.buttonB){
            l.call().getBuilder().getCuerpo().changeImage();
            v.crearCanva(l.call().getBuilder().getCabeza(), l.call().getBuilder().getCuerpo(), l.call().getBuilder().getPiernas());
        }

        if(e.getSource() == v.buttonL){
            l.call().getBuilder().getPiernas().changeImage();
            v.crearCanva(l.call().getBuilder().getCabeza(), l.call().getBuilder().getCuerpo(), l.call().getBuilder().getPiernas());
        }
                
		
		if(e.getSource() == v.buttonGG) {	
			v.guardar();		
		}

	}

	public Logic getL() {
		return l;
	}


	public void setL(Logic l) {
		this.l = l;
	}


	public Window getV() {
		return v;
	}


	public void setV(Window v) {
		this.v = v;
	}
	
	
	
}
