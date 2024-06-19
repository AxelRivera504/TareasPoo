import org.w3c.dom.ls.LSOutput;

public class Smartphone {

    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private int tamanioBateria;
    private Chip chip1;
    private Chip chip2;

    // <editor-fold desc="Metodos getters">
    public void getFabricantes(){
        System.out.println("Fabricante:\nNombre Marca:"+marca.nombre+"\nPais Marca:"+marca.pais);
    }

    public void getModelo(){
        System.out.println("Modelo:"+(this.modelo.isBlank() ? "ND" : this.modelo));
    }

    public void getAlmacenamiento(){
        System.out.println("Almacenamiento:"+ (this.almacenamiento == 0 ? 0 : this.almacenamiento));
    }

    public void getRam(){
        System.out.println("Ram:"+(this.ram == 0 ? 0 : this.ram));
    }

    public void getTamanioBateria(){
        System.out.println("Tamaño de la bateria:"+(this.tamanioBateria == 0 ? "ND" : this.tamanioBateria));
    }
    // </editor-fold>

    // <editor-fold desc="Metodos Setters">
    public void setModelo(String modelo) throws Exception {
        if(modelo.isBlank())
            throw new Exception("Modelo invalido");
        else
            this.modelo = modelo;
    }

    public void setAlmacenamiento(int almacenamiento) throws Exception {
        if(almacenamiento <= 0)
            throw new Exception("Cantidad de almacenamiento invalido");
        else
            this.almacenamiento = almacenamiento;
    }

    public void setRam(int ram) throws Exception {
        if(ram <= 0)
            throw new Exception("Cantidad de Ram invalida");
        else
            this.ram = ram;
    }

    public void setTamanioBateria(int tamanioBateria) throws Exception {
        if(tamanioBateria <= 0)
            throw new Exception("Tamaño de la bateria invalido");
        else
            this.tamanioBateria = tamanioBateria;
    }

    public void setMarca(Fabricante marca) throws Exception {
        if(marca == null)
            throw new Exception("Marca invalida");
        else
            this.marca = marca;
    }

    public void setChip1(Chip chip) throws Exception {
        if(chip == null)
            throw new Exception("Chip1 invalido");
        else
            this.chip1 = chip;
    }

    public void setChip2(Chip chip) throws Exception {
        if(chip == null)
            throw new Exception("Chip2 invalido");
        else
            this.chip2 = chip;
    }
    // </editor-fold>

    public void mostrarInformación(){
        System.out.println("Información sobre el smarthphone: "+marca.nombre+ "           Pais:"+marca.pais);
        System.out.println("-------------------------------------\n");
        this.getModelo();
        this.getAlmacenamiento();
        this.getTamanioBateria();
        this.getRam();
        System.out.println("Chip1:"+(chip1.numero != 0 ? chip1.numero : "ND"));
        chip1.getOperador();
        System.out.println("Chip2:"+(chip2.numero != 0 ? chip2.numero : "ND"));
        chip2.getOperador();
    }
}
