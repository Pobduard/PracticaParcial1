package Aerolinea;
public class Pasajero extends Personas{
    private String numAsiento;
    private int valorPasaje;

    public Pasajero(){
    }
    public Pasajero(String nombre, int edad, int vuelo, String categoria, String numAsiento) {
        super(nombre, edad, vuelo, categoria);
        this.numAsiento = numAsiento;
        this.valorPasaje = valorPasaje;
    }

    //Getters
    public String getNumAsiento() {
        return numAsiento;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }


    @Override
    public Void mostrar(){
         System.out.println("Nombre:" + getNombre() + "Edad:" + getEdad()+ "Categoria" + getCategoria()+
                "\nAsiento:" + getNumAsiento() + "Valor:" + getValorPasaje());
    }


    /*void Pasajero(String nombre, int edad, int vuelo, String categoria){};

    void Pasajero(String nombre, int edad, int vuelo, String categoria, String Num_Asiento, int Valor_Pasaje){
        this.numAsiento = datos_persona[5];
        this.valorPasaje = datos_persona[6];
    };





*//* Para los pasajeros: si el valor del pasaje es menor a 450 Bs su categoría es
“Económica” y si es superior es “1era Clase”. Si es igual a 450Bs su categoría es
“Turista”
o Para las azafatas: si su edad <22 y habla máximo 2 idiomas es “Aprendiz”, si su edad es >=22 y habla máximo 2 idiomas es “Auxiliar”, si habla más de 2 idiomas es “Titular”
o Para el piloto: si tiene más de 1500 *//*

    @Override
    public void calcularCategoria(){
    // Pasajeros
        if (datos_persona[4] == 1){
            if(Pasajero.getvalorpasaje() < 450){ categoria = "Economica";};
            else if(Pasajero.getvalorpasaje() > 450){ categoria = "1ra Clase";};
            else if(Pasajero.getvalorpasaje() = 450){ categoria = "Turista";};
        }
*//*     // Azafatas
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
    }*/
}