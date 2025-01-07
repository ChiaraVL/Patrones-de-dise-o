package model.sql;

import model.classes.*;

public class Search {

    public static String supplier(Object ent) {
        // Supongamos que deseas buscar proveedores por su nombre
        String nombreProveedor = ((Supplier)ent).getName(); // Suponemos que hay un método para obtener el nombre del proveedor
        return "SELECT * FROM SUPPLIER WHERE nombre = '" + nombreProveedor + "';";
    }

    public static String order(Object ent) {
        // Supongamos que deseas buscar pedidos por el ID del cliente
        String idCliente = ((Order)ent).getClient(); // Suponemos que hay un método para obtener el ID del cliente
        return "SELECT * FROM ORDERS WHERE client_id = " + idCliente + ";";
    }

    public static String employee(Object ent) {
        // Supongamos que deseas buscar empleados por su apellido
        String apellidoEmpleado = ((Employee)ent).getLastName(); // Suponemos que hay un método para obtener el apellido del empleado
        return "SELECT * FROM EMPLOYEE WHERE lastname = '" + apellidoEmpleado + "';";
    }

    public static String product(Object ent) {
        // Supongamos que deseas buscar productos por su nombre
        String nombreProducto = ((Product)ent).getName(); // Suponemos que hay un método para obtener el nombre del producto
        return "SELECT * FROM PRODUCT WHERE name = '" + nombreProducto + "';";
    }

    public static String client(Object ent) {
        // Supongamos que deseas buscar clientes por su email
        String emailCliente = ((Client)ent).getEmail(); // Suponemos que hay un método para obtener el email del cliente
        return "SELECT * FROM CLIENT WHERE email = '" + emailCliente + "';";
    }
}
