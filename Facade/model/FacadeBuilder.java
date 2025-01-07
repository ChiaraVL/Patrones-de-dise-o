package model;

import model.mysql.MySQL;
import model.oracle.Oracle;
import model.sql.SQL;

public class FacadeBuilder implements Builder{

    DatabaseFacade facade;

    @Override
    public void facade(int op) {
        if(op == 1){
            this.facade = new MySQL();
        } else if(op == 2){
            this.facade = new SQL();
        } else if(op == 3){
            this.facade = new Oracle();
        }
    }

    @Override
    public String getCreate(Object ent) {
        return facade.create(ent);
    }

    @Override
    public String getRead(Object ent) {
        return facade.read(ent);
    }

    @Override
    public String getUpdate(Object ent) {
        return facade.update(ent);
    }

    @Override
    public String getDelete(Object ent) {
        return facade.delete(ent);
    }

    @Override
    public String getSearch(Object ent) {
        return facade.search(ent);
    }
    
}
