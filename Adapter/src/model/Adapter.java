package model;

import java.util.List;

public interface Adapter {
    public List<String> importar(String ruta);
    public void exportar(List<String> lines);
}
