//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            //Inicializar el operador para que funcione el inicializar el chip
            // <editor-fold desc="Inicializacion clases">
            Operador op = new Operador("AT&T","Estados Unidos");
            Chip ch = new Chip(31650161);
            Operador op2 = new Operador("Verizon","China");
            Chip ch2 = new Chip(1233453);
            Fabricante fb = new Fabricante("Samsung","China");
            Smartphone sm = new Smartphone();
            // </editor-fold>
            // <editor-fold desc="Setear valores">
            ch.setOperador(op);
            sm.setMarca(fb);
            sm.setChip1(ch);
            ch2.setOperador(op2);
            sm.setChip2(ch2);
            sm.setModelo("A34");
            sm.setAlmacenamiento(2000);
            sm.setRam(16);
            sm.setTamanioBateria(25);
            // </editor-fold>
            // <editor-fold desc="Gets valores">
            sm.getFabricantes();
            sm.getAlmacenamiento();
            sm.getModelo();
            sm.getTamanioBateria();
            sm.getRam();
            // </editor-fold>
            System.out.println("\n\n\n");
            //Mostrar Información del smartphone
            sm.mostrarInformación();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}