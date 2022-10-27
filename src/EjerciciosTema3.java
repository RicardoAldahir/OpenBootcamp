public class EjerciciosTema3 {
    public static void main(String[] args) {
        int resultado = suma(5, 10, 3);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.addPuertas();
        miCoche.addPuertas();
        System.out.println(miCoche.numPuertas);
    }

    public static int suma(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        return resultado;
    }
}

class Coche {
    int numPuertas = 0;

    public void addPuertas(){
        this.numPuertas++;
    }

}