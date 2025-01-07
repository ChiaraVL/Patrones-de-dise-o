package model.mysql;

import model.DatabaseFacade;
import model.classes.*;

public class MySQL implements DatabaseFacade{

    @Override
    public String create(Object ent) {
        if (ent instanceof Client) {
            return Create.client((Client)ent);
        } else if (ent instanceof Product) {
            return Create.product((Product) ent);
        } else if (ent instanceof Employee){
            return Create.employee((Employee) ent);
        }else if (ent instanceof Order){
            return Create.order((Order) ent);
        } else if (ent instanceof Supplier){
            return Create.supplier((Supplier) ent);
        }
        return "Tipo de entidad no compatible para CREATE";
    }

    @Override
    public String read(Object ent) {
         if (ent instanceof Client) {
            return Read.client((Client) ent);
        } else if (ent instanceof Product) {
            return Read.product((Product) ent);
        } else if (ent instanceof Employee){
            return Read.employee((Employee) ent);
        }else if (ent instanceof Order){
            return Read.order((Order) ent);
        } else if (ent instanceof Supplier){
            return Read.supplier((Supplier) ent);
        }
        return "Tipo de entidad no compatible para READ";
    }

    @Override
    public String update(Object ent) {
         if (ent instanceof Client) {
            return Update.client((Client) ent);
        } else if (ent instanceof Product) {
            return Update.product((Product) ent);
        } else if (ent instanceof Employee){
            return Update.employee((Employee) ent);
        }else if (ent instanceof Order){
            return Update.order((Order) ent);
        } else if (ent instanceof Supplier){
            return Update.supplier((Supplier) ent);
        }
        return "Tipo de entidad no compatible para UPDATE";
    }

    @Override
    public String delete(Object ent) {
        if (ent instanceof Client) {
            return Delete.client((Client) ent);
        } else if (ent instanceof Product) {
            return Delete.product((Product) ent);
        } else if (ent instanceof Employee){
            return Delete.employee((Employee) ent);
        }else if (ent instanceof Order){
            return Delete.order((Order) ent);
        } else if (ent instanceof Supplier){
            return Delete.supplier((Supplier) ent);
        }
        return "Tipo de entidad no compatible para DELETE";
    }

    @Override
    public String search(Object ent) {
        if (ent instanceof Client) {
            return Search.client(ent);
        } else if (ent instanceof Product) {
            return Search.product(ent);
        } else if (ent instanceof Employee){
            return Search.employee(ent);
        }else if (ent instanceof Order){
            return Search.order(ent);
        } else if (ent instanceof Supplier){
            return Search.supplier(ent);
        }
        return "Tipo de entidad no compatible para SEARCH";
    }
    
}
