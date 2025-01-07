package model.oracle;
import model.classes.*;

public class Create {

    public static String client(Client ent) {
        return "INSERT INTO CLIENT (id, name, lastname, email, phone) VALUES" + "('" + ent.getId() + "','" + ent.getName() + "','" + ent.getLastName() + "','" + ent.getEmail() + "','" + ent.getPhone() + "');";
    }

    public static String product(Product ent) {
        return "INSERT INTO PRODUCT (id, name, price, description) VALUES" + "('" + ent.getId() + "','" + ent.getName() + "'," + ent.getPrice() + ",'" + ent.getDesc() + "');";
    }

    public static String employee(Employee ent) {
        return "INSERT INTO EMPLOYEE (id, name, lastname, title, salary) VALUES" + "('" + ent.getId() + "','" + ent.getName() + "','" + ent.getLastName() + "','" + ent.getPosition() + "'," + ent.getSalary() + ");";
    }

    public static String order(Order ent) {
        return "INSERT INTO ORDER (id, client, order_date, status, total) VALUES" + "('" + ent.getId() + "','" + ent.getClient() + "',TO_DATE('" + ent.getOrderDate() + "','YYYY-MM-DD'),'" + ent.getEstatus() + "'," + ent.getTotal() + ");";
    }

    public static String supplier(Supplier ent) {
        return "INSERT INTO SUPPLIER (id, name, address, phone, email) VALUES" + "('" + ent.getId() + "','" + ent.getName() + "','" + ent.getAddress() + "','" + ent.getPhone() + "','" + ent.getEmail() + "');";
    }
}
