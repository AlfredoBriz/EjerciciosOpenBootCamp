package EjercicioTema9;

public class Cliente  extends Persona {

    String Credito;

//----------------------------------------------------------------------------

    public String getCredito() {
        return Credito;
    }

    public void setCredito(String credito) {
        Credito = credito;
    }


//----------------------------------------------------------------------------


    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Alfredo");
        cliente.setEdad(30);
        cliente.setTelefono("2604307902");
        cliente.setCredito("Hipotecario");


        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
    }

}
