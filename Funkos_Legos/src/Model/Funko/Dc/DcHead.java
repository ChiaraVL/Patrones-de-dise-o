package Model.Funko.Dc;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import Model.Head;
import Model.Parte;

public class DcHead implements Head{
    
    private ArrayList<ImageIcon> DC;
    private int imagenActualIndex = 0;

    public DcHead(){
        DC = new ArrayList<>();
        DC.add(new ImageIcon("Imagenes/Funkos/Dc/Cabeza/1.jpg"));
        DC.add(new ImageIcon("Imagenes/Funkos/Dc/Cabeza/2.jpg"));
        DC.add(new ImageIcon("Imagenes/Funkos/Dc/Cabeza/3.jpg"));
        DC.add(new ImageIcon("Imagenes/Funkos/Dc/Cabeza/4.jpg"));
        DC.add(new ImageIcon("Imagenes/Funkos/Dc/Cabeza/5.jpg"));
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
