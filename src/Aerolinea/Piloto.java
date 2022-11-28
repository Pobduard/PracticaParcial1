package  Aerolinea;
public class Piloto extends Personas{
    private int horas;

    void Piloto(){};

    public Piloto(int horas) {
        this.horas = horas;
    }

    public Piloto(String nombre, int edad, int vuelo, String categoria, int horas) {
        super(nombre, edad, vuelo, categoria);
        this.horas = horas;
    }

    int gethoras(){
        return horas;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre:" + Pasajero.getnombre()+ "Edad:" + Pasajero.getedad()+ "Categoria" + Pasajero.getcategoria()+
        "\nHoras de Vuelo:" + Piloto.gethoras());
    }

    @Override
    public void calcularCategoria(){
    // Pilotos
        else if(datos_persona[4]==3){
            if(datos_persona[5] < 1500){categoria = "Capitán";};
            else if(datos_persona[5] >= 1500){categoria = "1er Piloto";};
        }
    }
}