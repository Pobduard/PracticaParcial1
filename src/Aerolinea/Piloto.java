package  Aerolinea;
public class Piloto extends Personas{
    private int horas;

    public Piloto(){};

    public Piloto(int horas) {
        this.horas = horas;
    }

    public Piloto(String nombre, int edad, int vuelo, String categoria, int horas) {
        super(nombre, edad, vuelo, categoria);
        this.horas = horas;
        this.calcularCategoria();
    }

    public int getHoras(){
        return horas;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + this.getNombre() + "\tEdad: " + this.getEdad() + "\tCategoria: " + this.getCategoria()+
        "\nHoras de Vuelo: " + this.horas+ "\n");
    }

    @Override
    public void calcularCategoria(){
    // Pilotos
            if(this.horas < 1500){this.categoria = "Capitán";}
            else if(this.horas >= 1500){this.categoria = "1er Piloto";}
    }
}