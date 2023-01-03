import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);
    static List listaVehiculos = new ArrayList();
    public static void main(String[] args) {
        int menuPrincipal=1;
        while (menuPrincipal!=0) {
            menuPrincipal=MenuPrincipal();
            switch(menuPrincipal){
                case 1:
                    setVehiculos();
                break;
                case 2:
                    setbusNormal();
                    break;
                case 3:
                    setbusTurismo();
                    break;
                case 4:
                    imprimirLista((ArrayList) listaVehiculos);
                    break;
            }
        }
    }
    private static void imprimirLista(ArrayList lista){
        for (int i=0; i<lista.size(); i++){
            Vehiculo v=(Vehiculo)lista.get(i);
            v.imprimirAtributos();
            System.out.println("\n");
        }
    }
    private static int MenuPrincipal(){
        int op;
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Ingrese un vehiculo");
        System.out.println("2. Ingrese un Autobus");
        System.out.println("3. Ingrese un Autobus de turismo");
        System.out.println("4. Mostrar datos ingresados");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        return op;
    }
    private static void setVehiculos(){
        String marca, modelo,vacio;
        double precio;
        vacio=sc.nextLine();
        System.out.println("Ingrese los datos:");
        System.out.print("Marca del vehiculo:");
        marca=sc.nextLine();
        System.out.print("Modelo del vehiculo:");
        modelo=sc.nextLine();
        System.out.print("Precio de alquiler:");
        precio=sc.nextDouble();
        listaVehiculos.add(new Vehiculo(marca, modelo, precio));
    }
    private static void setbusNormal(){
        String marca, modelo, vacio;
        double precio;
        int plazas;
        vacio=sc.nextLine();
        System.out.println("Ingrese los datos:");
        System.out.print("Marca del autobus:");
        marca=sc.nextLine();
        System.out.print("Modelo del autobus:");
        modelo=sc.nextLine();
        System.out.print("Precio de autobus:");
        precio=sc.nextDouble();
        System.out.print("Numero de plazas del autobus:");
        plazas=sc.nextInt();
        listaVehiculos.add(new Autobus(marca, modelo, precio,plazas));
    }
    private static void setbusTurismo(){
        String marca, modelo, vacio;
        double precio;
        int plazas;
        vacio=sc.nextLine();
        System.out.println("Ingrese los datos:");
        System.out.print("Marca del autobus de turismo:");
        marca=sc.nextLine();
        System.out.print("Modelo del autobus de turismo:");
        modelo=sc.nextLine();
        System.out.print("Precio del autobus de turismo:");
        precio=sc.nextDouble();
        System.out.print("Numero de plazas del autobus de turismo:");
        plazas=sc.nextInt();
        listaVehiculos.add(new Turismo(marca, modelo, precio, plazas));
    }

}