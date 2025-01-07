package model.oracle;
import model.classes.*;

public class Delete {

    public static String client(Client ent) {
        return "DELETE FROM CLIENT WHERE id = '" + ent.getId() + "';";
    }

    public static String product(Product ent) {
        return "DELETE FROM PRODUCT WHERE id = '" + ent.getId() + "';";
    }

    public static String employee(Employee ent) {
        return "DELETE FROM EMPLOYEE WHERE id = '" + ent.getId() + "';";
    }

    public static String order(Order ent) {
        return "DELETE FROM ORDERS WHERE id = '" + ent.getId() + "';";
    }

    public static String supplier(Supplier ent) {
        return "DELETE FROM SUPPLIER WHERE id = '" + ent.getId() + "';";
    }
}

