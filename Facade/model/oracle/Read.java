package model.oracle;
import model.classes.*;

public class Read {

    public static String client(Client ent) {
        return "SELECT * FROM CLIENT WHERE id = '" + ent.getId() + "';";
    }

    public static String product(Product ent) {
        return "SELECT * FROM PRODUCT WHERE id = '" + ent.getId() + "';";
    }

    public static String employee(Employee ent) {
        return "SELECT * FROM EMPLOYEE WHERE id = '" + ent.getId() + "';";
    }

    public static String order(Order ent) {
        return "SELECT * FROM ORDERS WHERE id = '" + ent.getId() + "';";
    }

    public static String supplier(Supplier ent) {
        return "SELECT * FROM SUPPLIER WHERE id = '" + ent.getId() + "';";
    }
}
