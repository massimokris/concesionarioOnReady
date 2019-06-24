package Concesionario;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void clearScreen() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String args[]) {

        clearScreen();
        Concesionario concesionario = new Concesionario();

        List<Vehiculo> vehiculos = Arrays.asList(
                new Auto("Peugeot", "206", 200000.00 , 4),
                new Moto("Honda", "Titan", 60000.00, "125c"),
                new Auto("Peugeot", "208", 250000.00 , 5),
                new Moto("Yamaha", "YBR", 80500.50, "160c"));


        concesionario.agregarVehiculos(vehiculos);

        concesionario.mostrarVehiculos();

        System.out.println("----------------------");

        concesionario.precioMayor();
        concesionario.precioBajo();
        concesionario.vahiculoConY("Y");

        System.out.println("----------------------");

        concesionario.ordenarVehiculos();
    }
}