public class Fabricante {

    public String nombre;
    public String pais;

    Fabricante(String nombre, String pais) throws Exception {
        if(nombre.isBlank() || pais.isBlank())
            throw new Exception("El nombre y el pais son requeridos");

        this.nombre = nombre;
        this.pais = pais;
    }
}
