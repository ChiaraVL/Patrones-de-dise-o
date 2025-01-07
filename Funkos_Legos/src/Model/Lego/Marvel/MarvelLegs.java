package Model.Lego.Marvel;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import Model.Legs;
import Model.Parte;

public class MarvelLegs implements Legs {

    private ArrayList<ImageIcon> Marvel;
    private int imagenActualIndex = 0;

    public MarvelLegs(){
        Marvel = new ArrayList<>();
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Piernas/1.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Piernas/2.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Piernas/3.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Piernas/4.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Piernas/5.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Piernas/6.jpg"));
    }

    @Override
    public ImageIcon getImage() {
        return Marvel.get(imagenActualIndex);    
    }

    @Override
    public void changeImage() {
        imagenActualIndex = (imagenActualIndex + 1) % Marvel.size();
    }

    @Override
    public Parte clonar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clonar'");
    }

}
