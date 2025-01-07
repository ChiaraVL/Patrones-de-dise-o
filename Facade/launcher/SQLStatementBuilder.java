package launcher;

import model.FacadeBuilder;

public class SQLStatementBuilder {

    public String buildSQLStatement(int lenguajeSQL, int operacion, Object o) {
        String sentencia = "";
        FacadeBuilder f = new FacadeBuilder();
        f.facade(lenguajeSQL);

        if (operacion==1) {
            sentencia = f.getCreate(o);
        } else if (operacion==2){
            sentencia = f.getRead(o);
        } else if (operacion==3){
            sentencia = f.getUpdate(o);
        } else if (operacion==4){
            sentencia = f.getDelete(o);
        } else if (operacion==5){
            sentencia = f.getSearch(o);
        }

        return sentencia;
    }

}
