package EjercicioTema9;

public class Trabajador extends Persona {

    double salario;

//----------------------------------------------------------------------------


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


//----------------------------------------------------------------------------

    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Alfredo");
        trabajador.setEdad(30);
        trabajador.setTelefono("2604307902");
        trabajador.setSalario(120000);


        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }





}
