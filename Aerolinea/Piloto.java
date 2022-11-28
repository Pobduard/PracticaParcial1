public class Piloto extends Personas{
    private int horas;

    void Piloto(){};

    void Piloto(String nombre, int edad, int vuelo, String categoria, int horas){
        this.horas = datos_personas[5];
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