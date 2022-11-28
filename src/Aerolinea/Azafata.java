package Aerolinea;

public class Azafata extends Personas{
    private double altura;
    private int idiomas;

    public Azafata(){};

    public Azafata(String nombre, int edad, int vuelo, String categoria, double altura, int idiomas){
        super(nombre, edad, vuelo, categoria);
        this.altura = altura;
        this.idiomas = idiomas;
    }

    double getAltura(){
        return this.altura;
    }

    int getIdiomas(){
        return this.idiomas;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre:" + this.getNombre()+ "Edad:" + this.getEdad()+ "Categoria" + this.getCategoria()+
        "\nEstatura:" + this.getAltura()+ "Idiomas:" + this.getIdiomas());
    }

    @Override
    public void calcularCategoria(){
    // Azafatas
            if((this.getEdad() < 22) && (this.idiomas) < 2){this.categoria ="Aprendiz";}
            else if((this.getEdad() >= 22) && (this.idiomas < 2)){this.categoria ="Auxiliar";}
            else if((this.getEdad() >= 22) && (this.idiomas > 2)){this.categoria ="Titular";}
    }
}