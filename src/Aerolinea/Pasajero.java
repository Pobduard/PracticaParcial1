package Aerolinea;
public class Pasajero extends Personas{
    private String numAsiento;
    private int valorPasaje;

    public Pasajero(){
    }
    public Pasajero(String nombre, int edad, int vuelo, String categoria, String num_Asiento, int valor_Pasaje) {
        super(nombre, edad, vuelo, categoria);
        this.numAsiento = num_Asiento;
        this.valorPasaje = valor_Pasaje;
    }

    //Getters
    public String getNumAsiento() {
        return this.numAsiento;
    }

    public int getValorPasaje() {
        return this.valorPasaje;
    }


    @Override
    public void mostrar(){
         System.out.println("Nombre:" + this.getNombre() + "Edad:" + this.getEdad()+ "Categoria" + this.getCategoria()+
                "\nAsiento:" + this.getNumAsiento() + "Valor:" + this.getValorPasaje());
    }

    @Override
    public void calcularCategoria(){
    // Pasajeros
            if(this.getValorPasaje() < 450){ this.categoria = "Economica";}
            else if(this.getValorPasaje() == 450){ this.categoria = "Turista";}
            else if(this.getValorPasaje() > 450){ this.categoria = "1ra Clase";};
    }
}



/* 
Para los pasajeros: si el valor del pasaje es menor a 450 Bs su categoría es
“Económica” y si es superior es “1era Clase”. Si es igual a 450Bs su categoría es
“Turista”
o Para las azafatas: si su edad <22 y habla máximo 2 idiomas es “Aprendiz”, si su edad es >=22 y habla máximo 2 idiomas es “Auxiliar”, si habla más de 2 idiomas es “Titular”
o Para el piloto: si tiene más de 1500

    @Override
    public void calcularCategoria(){
    // Pasajeros
        if (datos_persona[4] == 1){
            if(Pasajero.getvalorpasaje() < 450){ categoria = "Economica";};
            else if(Pasajero.getvalorpasaje() > 450){ categoria = "1ra Clase";};
            else if(Pasajero.getvalorpasaje() = 450){ categoria = "Turista";};
        }
    // Azafatas
        else if(datos_persona[4] ==  2){
            if((edad < 22) && (datos_persona[6]) < 2){categoria ="Aprendiz"};
            else if((edad >= 22) && (datos_persona[6]) < 2){categoria ="Auxiliar"};
            else if((edad >= 22) && (datos_persona[6]) > 2){categoria ="Titular"};
        }
    // Pilotos
        else if(datos_persona[4]==3){
            if(datos_persona[5] < 1500){categoria = "Capitán";};
            else if(datos_persona[5] >= 1500){categoria = "1er Piloto";};
        }
    }
     */