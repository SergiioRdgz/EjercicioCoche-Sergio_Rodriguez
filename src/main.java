import java.util.Scanner;
public class main {
    static Scanner sc = new Scanner(System.in);
    static Coche coche1 = new Coche("Mercedes", "GLC", 3000);
    static Coche cocheNuevo;

    public static void menu(){
        System.out.println("Introduce la marca: ");
        String marca = sc.next();
        System.out.println("Introduce el modelo: ");
        String modelo = sc.next();
        System.out.println("Introduce el kilomtraje: ");
        int kilomtetraje = sc.nextInt();

        cocheNuevo = new Coche(marca,modelo,kilomtetraje);

        System.out.println("Elige la opcion que desea: " +
                "\n 1 -- Obtener distancia en km" +
                "\n 2 -- Obtener distancia en millas" +
                "\n 3 -- Obtener marca del coche" +
                "\n 4 -- Obtener modelo del coche" +
                "\n 5 -- Aumentar la distancia recorrida" +
                "\n 6 -- Salir"
        );
        int opcion;
        do {
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(cocheNuevo.obtenerKilometraje());
                    break;
                case 2:
                    System.out.println(kilomtetraje * 0.621371);
                    break;
                case 3:
                    System.out.println(cocheNuevo.obtenerMarcaCoche());
                    break;
                case 4:
                    System.out.println(cocheNuevo.obtenerModeloCoche());
                case 5:
                    aumentarDistanciaRecorrida();
            }
        }while (opcion!=6);
    }

    public static void aumentarDistanciaRecorrida(){
        int numero = sc.nextInt();
        int kilometrajeNuevo = cocheNuevo.obtenerKilometraje()+ numero;
        System.out.println(kilometrajeNuevo);
    }

    public static void main(String[] args) {
        menu();
    }



    }


