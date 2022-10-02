import java.text.Format;

public class Main {
    public static void main(String[] args) {
                    //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
            int numeroIf = 0;
                if (numeroIf < 0) {
                    System.out.println("Negativo");
                }
                else if (numeroIf > 0) {
                    System.out.println("positivo");
                }
                else {
                    System.out.println("0");
                }

                     //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3...
                int numeroWhile = 0;

                    while (numeroWhile < 3) {
                        System.out.println(numeroWhile);
                        numeroWhile = numeroWhile + 1;
                    }

                    //bucle Do While
                     do {
                         System.out.println(numeroWhile);
                         numeroWhile = numeroWhile + 1;
                    } while (numeroWhile < 3);

                    // bucle For
             for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
                 System.out.println(numeroFor);
             }

                    // Switch Case

            String estacion = "otoño";

             switch (estacion) {
                 case "verano":
                     System.out.println("Es Verano");
                     break;
                 case "primavera":
                     System.out.println("Es Primavera");
                     break;
                 case "otoño":
                     System.out.println("Es Otoño");
                     break;
                 case "invierno":
                     System.out.println("Es Invierno");
                     break;
                 default:
                     System.out.println("no es una estacion");

             }

    }
}