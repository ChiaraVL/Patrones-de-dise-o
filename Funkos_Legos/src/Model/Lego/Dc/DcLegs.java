package Model.Lego.Dc;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import Model.Legs;
import Model.Parte;

public class DcLegs implements Legs {

    private ArrayList<ImageIcon> DC;
    private int imagenActualIndex = 0;

    public DcLegs(){
        DC = new ArrayList<>();
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Piernas/1.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Piernas/2.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Piernas/3.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Piernas/4.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Piernas/5.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Piernas/6.jpg"));
    }

    @Override
    public ImageIcon getImage() {
        return DC.get(imagenActualIndex);
    }

    @Override
    public void changeImage() {
        imagenActualIndex = (imagenActualIndex + 1) % DC.size();
    }

    @Override
    public Parte clonar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clonar'");
    }

}
