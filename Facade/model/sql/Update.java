package model.sql;

import model.classes.*;

public class Update {

    public static String client(Client ent) {
        return "UPDATE CLIENT SET name = '" + ent.getName() + "', lastname = '" + ent.getLastName() + "', email = '" + ent.getEmail() + "', phone = '" + ent.getPhone() + "' WHERE id = " + ent.getId() + ";";
    }

    public static String product(Product ent) {
        return "UPDATE PRODUCT SET name = '" + ent.getName() + "', price = " + ent.getPrice() + ", description = '" + ent.getDesc() + "' WHERE id = " + ent.getId() + ";";
    }

    public static String employee(Employee ent) {
        return "UPDATE EMPLOYEE SET name = '" + ent.getName() + "', lastname = '" + ent.getLastName() + "', title = '" + ent.getPosition() + "', salary = " + ent.getSalary() + " WHERE id = " + ent.getId() + ";";
    }

    public static String order(Order ent) {
        return "UPDATE ORDERS SET client_id = " + ent.getClient() + ", order_date = '" + ent.getOrderDate() + "', status = '" + ent.getEstatus() + "', total = " + ent.getTotal() + " WHERE id = " + ent.getId() + ";";
    }

    public static String supplier(Supplier ent) {
        return "UPDATE SUPPLIER SET name = '" + ent.getName() + "', address = '" + ent.getAddress() + "', phone = '" + ent.getPhone() + "', email = '" + ent.getEmail() + "' WHERE id = " + ent.getId() + ";";
    }
}
