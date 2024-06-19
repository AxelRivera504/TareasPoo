public class Chip {

    private Operador operador;
    public int numero;

    Chip(int numero) throws Exception {
        if(numero <= 0)
            throw new Exception("El numero tiene que ser mayor a 0");

        this.numero = numero;
    }

    public void setOperador(Operador op) throws Exception {
        if(op == null)
            throw new Exception("El operador es requerido");
        else
            operador = op;
    }

    public void getOperador() {
        System.out.println("Operador es: " + operador.nombre + "\nPais operador:"+operador.pais);
    }
}
