import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;


        //Inicio del "menú" de nuestro programa.
        //Con este do-while nos aseguramos que el programa no salga solo al seleccionar una opción,
        // sino que seguirá ejecutandose hasta que pulsemos el botón 0
        do {
            System.out.println("------Bienvenido al conversor de unidades------");
            System.out.println("1 = Kilometros a Millas");
            System.out.println("2 = Millas a Kilometros");
            System.out.println("3 = Celsius a Fahrenheit");
            System.out.println("4 = Fahrenheit a Celsius");
            System.out.println("0 = Salir");
            System.out.println("Elija una opción: ");


            //Segun la opción elegida, se realizará uno de los siguientes casos.
            //En lugar de crear el codigo en cada caso, hemos creado métodos auxiliares.
            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        convertirKmAMillas(teclado);
                        break;
                    case 2:
                        convertirMillasAKm(teclado);
                        break;
                    case 3:
                        convertirCelsiusAFahrenheit(teclado);
                        break;
                    case 4:
                        convertirFahrenheitACelsius(teclado);
                        break;
                    case 0:
                        System.out.println("Saliendo... ");
                        break;
                    default:
                        System.out.println("Opción inválida. Seleccione una de las opciones anteriores");
                }
            } else {
                System.out.println("Entrada inválida. Debes introducir un número.");
                teclado.next();
                opcion = -1;

            }
        } while (opcion != 0);
        //Siempre tenemos que cerrar las entradas para que no haya problemas con entradas de datos.
        teclado.close();
    }

    //Métodos auxiliares
    public static void convertirKmAMillas(Scanner teclado) {
        while (true) {
            System.out.println("Introduce la cantidad de kilómetros (km) a convertir: ");
            if (teclado.hasNextDouble()) {
                double km = teclado.nextDouble();
                double millas = km * 0.621371;
                System.out.println(km + " kilómetros son " + millas + " millas");
                break;
            } else {
                System.out.println("Introduce valores correctos.");
                teclado.next();
            }
        }
    }

    public static void convertirMillasAKm(Scanner teclado) {
        while (true) {
            System.out.println("Introduce la cantidad de millas a convertir: ");
            if (teclado.hasNextDouble()) {
                double millas = teclado.nextDouble();
                double km = millas / 0.621371;
                System.out.println(millas + " millas son " + km + " kilómetros");
                break;
            }
        }
    }

    public static void convertirCelsiusAFahrenheit(Scanner teclado) {
        while (true) {
            System.out.println("Introduce la cantidad de grados celsius (°C) que quieres convertir a grados fahrenheit (°F): ");
            if (teclado.hasNextDouble()) {
                double celsius = teclado.nextDouble();
                double fh = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " grados celsius (°C) son: " + fh + " grados fahrenheit (°F)");
                break;
            }
        }
    }
    public static void convertirFahrenheitACelsius(Scanner teclado) {
        while (true) {
            System.out.println("Introduce la cantidad de grados fahrenheit (°F) que quieres convertir a grados celsius (°C)");
            if (teclado.hasNextDouble()) {
                double fh = teclado.nextDouble();
                double celsius = (fh - 32) * 5 / 9;
                System.out.println(fh + " grados fahrenheit (ºF) son: " + celsius + " grados celsius (ºC)");
                break;
            }
        }
    }
}