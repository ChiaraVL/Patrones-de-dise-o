package Model.Lego.Marvel;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import Model.Body;
import Model.Parte;

public class MarvelBody implements Body{

    private ArrayList<ImageIcon> Marvel;
    private int imagenActualIndex = 0;

    public MarvelBody(){

        Marvel = new ArrayList<>();
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Tronco/1.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Tronco/2.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Tronco/3.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Tronco/4.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Tronco/5.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Tronco/6.jpg"));
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
