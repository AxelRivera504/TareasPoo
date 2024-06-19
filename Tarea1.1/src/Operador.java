public class Operador {

    public String nombre;
    public String pais;

    Operador(String nombre, String pais) throws Exception {
        if (nombre.isBlank() || pais.isBlank())
            throw new Exception("El nombre y el país son requeridos para inicializar el operador");

        this.nombre = nombre;
        this.pais = pais;
    }
}
