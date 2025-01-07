package launcher;
import java.util.Scanner;
import model.classes.*;

public class ClassCreation {

    public static Client solicitarDatosCliente(Scanner scanner) {
        Client cliente =  new Client();

        System.out.println("Ingrese los datos del cliente:");
        System.out.print("ID: ");
        cliente.setId(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        cliente.setName(scanner.nextLine());
        System.out.print("Apellido: ");
        cliente.setLastName(scanner.nextLine());
        System.out.print("Email: ");
        cliente.setEmail(scanner.nextLine());
        System.out.print("Teléfono: ");
        cliente.setPhone(scanner.nextLine());
        System.out.println("Objeto Cliente creado.");
        return cliente;
    }

    public static Product solicitarDatosProducto(Scanner scanner) {
        Product producto = new Product();

        System.out.println("Ingrese los datos del producto:");
        System.out.print("ID: ");
        producto.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nombre: ");
        producto.setName(scanner.nextLine());
        System.out.print("Precio: ");
        producto.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Descripción: ");
        producto.setDesc(scanner.nextLine());
        System.out.println("Objeto Producto creado.");
        return producto;
    }

    public static Employee solicitarDatosEmpleado(Scanner scanner) {
        Employee empleado = new Employee();

        System.out.println("Ingrese los datos del empleado:");
        System.out.print("ID: ");
        empleado.setId(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        empleado.setName(scanner.nextLine());
        System.out.print("Apellido: ");
        empleado.setLastName(scanner.nextLine());
        System.out.print("Cargo: ");
        empleado.setPosition(scanner.nextLine());
        System.out.print("Salario: ");
        empleado.setSalary(scanner.nextDouble());
        System.out.println("Objeto Empleado creado.");
        return empleado;
    }

    public static Order solicitarDatosPedido(Scanner scanner) {
        Order pedido = new Order();

        System.out.println("Ingrese los datos del pedido:");
        System.out.print("ID: ");
        pedido.setId(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Cliente: ");
        pedido.setClient(scanner.nextLine());
        System.out.print("Fecha de Pedido (YYYY-MM-DD): ");
        pedido.setOrderDate(scanner.nextLine());
        System.out.print("Estatus: ");
        pedido.setEstatus(scanner.nextLine());
        System.out.print("Total: ");
        pedido.setTotal(scanner.nextDouble());
        System.out.println("Objeto Pedido creado.");
        return pedido;
    }

    public static Supplier solicitarDatosProveedor(Scanner scanner) {
        Supplier proveedor = new Supplier();

        System.out.println("Ingrese los datos del proveedor:");
        System.out.print("ID: ");
        proveedor.setId(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        proveedor.setName(scanner.nextLine());
        System.out.print("Dirección: ");
        proveedor.setAddress(scanner.nextLine());
        System.out.print("Teléfono: ");
        proveedor.setPhone(scanner.nextLine());
        System.out.print("Email: ");
        proveedor.setEmail(scanner.nextLine());
        System.out.println("Objeto Proveedor creado.");
        return proveedor;
    }
}
