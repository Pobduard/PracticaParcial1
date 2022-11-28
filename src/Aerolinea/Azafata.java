
import data.Datos;
package Aerolinea;


public class Azafata extends Personas{
    private double altura;
    private int idiomas;

    void Azafata(){};

    void Azafata(String nombre, int edad, int vuelo, String categoria, double altura, int idiomas){
        this.altura = Datos.class.datos_personas[5];
        this.idiomas = datos_personas[6];
    }

    double getaltura(){
        return altura;
    }

    int getidiomas(){
        return idiomas;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre:" + Pasajero.getnombre()+ "Edad:" + Pasajero.getedad()+ "Categoria" + Pasajero.getcategoria()+
        "\nEstatura:" + Azafata.getaltura+ "Idiomas:" + Azafata.getidiomas());
    }

    @Override
    public void calcularCategoria(){
    // Azafatas
        else if(datos_persona[4] ==  2){
            if((edad < 22) && (datos_persona[6]) < 2){categoria ="Aprendiz"};
            else if((edad >= 22) && (datos_persona[6]) < 2){categoria ="Auxiliar"};
            else if((edad >= 22) && (datos_persona[6]) > 2){categoria ="Titular"};
        }
    }
}