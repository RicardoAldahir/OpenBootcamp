import javax.swing.JOptionPane;
import java.util.Locale;

public class EjerciciosTema4 {
    public static void main(String[] args) {

        numeroIf();

        numeroWhile();

        numeroDoWhile();

        numeroFor();

        String estacion = JOptionPane.showInputDialog("Ingresa la estación del año");
        estacion(estacion.toLowerCase(Locale.ROOT));

    }

    public static void numeroIf(){
        int numeroIf=25;

        if (numeroIf < 0){
            System.out.println("Número negativo");
        } else if (numeroIf > 0){
            System.out.println("Número positivo");
        }
        else {
            System.out.println("El número es cero");
        }
    }

    public static void numeroWhile(){
        int numeroWhile=0;

        while(numeroWhile < 3){
            System.out.println("El número es: "+numeroWhile);
            numeroWhile++;
        }
    }

    public static void numeroDoWhile(){
        int numeroDoWhile=2;
        do{
            System.out.println("El número es: "+numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile < 3);
    }

    public static void numeroFor(){
        int numeroFor=0;
        for(int i=0;numeroFor <= 3;i++){
            System.out.println("El número es: "+numeroFor);
            numeroFor++;
        }
    }

    public static void estacion(String estacion){

        switch (estacion){
            case "invierno":
                System.out.println("Estas en invierno");
                break;
            case "verano":
                System.out.println("Estas en verano");
                break;
            case "otoño":
                System.out.println("Estas en otoño");
                break;
            case "primavera":
                System.out.println("Estas en primavera");
                break;
            default:
                System.out.println("Esa palabra no es una estación del año");
                break;
        }
    }
}