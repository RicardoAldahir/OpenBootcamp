public class EjerciciosTema9 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Juan");
        cliente1.setEdad(26);
        cliente1.setTelefono("5589126487");
        cliente1.setCredito(2500);
        System.out.println("Datos del cliente: " +"\n"+
                "Nombre: "+cliente1.getNombre()+"\n"+
                "Edad: "+cliente1.getEdad()+"\n"+
                "Telefono: "+cliente1.getTelefono()+"\n"+
                "Credito: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();

        trabajador1.setNombre("Pablo");
        trabajador1.setEdad(32);
        trabajador1.setTelefono("5532521689");
        trabajador1.setSalario(4500);
        System.out.println("Datos del cliente: " +"\n"+
                "Nombre: "+trabajador1.getNombre()+"\n"+
                "Edad: "+trabajador1.getEdad()+"\n"+
                "Telefono: "+trabajador1.getTelefono()+"\n"+
                "Salario: "+trabajador1.getSalario());
    }
}

//La clase persona se encuentra dentro del archivo EjerciciosTema8
class Cliente extends Persona{
    private float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

