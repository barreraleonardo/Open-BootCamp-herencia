public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.credito = 150000.00;
        cliente.edad = 35;
        cliente.nombre = "Luis";
        cliente.telefono = 4378080;

        System.out.println(
                "******* Cliente *******\n" +
                "Nombre: " + cliente.nombre + "\n" +
                "Edad: " + cliente.edad + "\n" +
                "Credito: " + cliente.credito + "\n" +
                "Telefono " + cliente.telefono

        );

        Trabajador trabajdor = new Trabajador();
        trabajdor.nombre = "Juan";
        trabajdor.edad = 27;
        trabajdor.salario = 300000.00;
        trabajdor.telefono = 4446390;

        System.out.println(
                "******* Trabajador *******\n" +
                "Nombre: " + trabajdor.nombre + "\n" +
                        "Edad: " + trabajdor.edad + "\n" +
                        "Salario: " + trabajdor.salario + "\n" +
                        "Telefono " + trabajdor.telefono

        );

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}