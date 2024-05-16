import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        DecimalFormat format = new DecimalFormat("#.000");

        do {
            System.out.println("**************** MENU **********************");
            System.out.println("1. Dolar =>> Peso Colombiano");
            System.out.println("2. Peso Colombiano =>> Dolar");
            System.out.println("3. Real Brasileño =>> Dolar");
            System.out.println("4. Dolar =>> Dolar Australiano");
            System.out.println("5. Dolar =>> dirham de los emiratos");
            System.out.println("6. Dolar =>> Dolar Canadiense");
            System.out.println("9. salir");
            System.out.println("******************************************\n");

            System.out.println("Digite su opcion");
            opcion = teclado.nextInt();

            ConvertirMoneda convertidor = new ConvertirMoneda();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de dólares a convertir a pesos colombianos:");
                    double cantidadDolares1 = teclado.nextDouble();
                    Moneda resultado1 = convertidor.moneda("USD", "COP",cantidadDolares1);
                    System.out.println("Resultado: " + cantidadDolares1 + " dólares son "
                            + format.format(resultado1.conversion_rate() * cantidadDolares1) + " pesos colombianos \n");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de pesos a convertir a dolares estadounidenses");
                    double cantidadPesos = teclado.nextDouble();
                    Moneda resultado2 = convertidor.moneda("COP","USD", cantidadPesos);
                    System.out.println("Resultado: " + cantidadPesos + " pesos son "
                            + format.format(resultado2.conversion_rate()*cantidadPesos) + " dolares estadounidenses \n");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de reales brasileños a convertir a dolares estadounidenses");
                    double cantidadReal = teclado.nextDouble();
                    Moneda resultado3 = convertidor.moneda("BRL","USD", cantidadReal);
                    System.out.println("Resultado: " + cantidadReal + " reales brasileños son "
                            + format.format(resultado3.conversion_rate()*cantidadReal) + " dolares estadounidenses \n");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de dolares a convertir a dolares australiano");
                    double cantidadDolares2 = teclado.nextDouble();
                    Moneda resultado4 = convertidor.moneda("USD","AUD", cantidadDolares2);
                    System.out.println("Resultado: " + cantidadDolares2 + " dolares estadounidenses son "
                            + format.format(resultado4.conversion_rate()*cantidadDolares2) + " dolares australianos \n");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de dolares a convertir a dirham de los emiratos");
                    double cantidadDolares3 = teclado.nextDouble();
                    Moneda resultado5 = convertidor.moneda("USD","AED", cantidadDolares3);
                    System.out.println("Resultado: " + cantidadDolares3 + " dolares estadounidenses son "
                            + format.format(resultado5.conversion_rate()*cantidadDolares3) + " dirham de los emiratos \n");
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de dolares a convertir a dolares canadienses");
                    double cantidadDolares4 = teclado.nextDouble();
                    Moneda resultado6 = convertidor.moneda("USD","CAD", cantidadDolares4);
                    System.out.println("Resultado: " + cantidadDolares4 + " dolares estadounidenses son "
                            + format.format(resultado6.conversion_rate()*cantidadDolares4) + " dolares canadienses \n");
                    break;
            }

        }while (opcion != 9);
        System.out.println("Saliendo ....");


    }
}

