package data;
public class Datos{
    // Nombre de Arerolinea; Numero de Vuelo; Cuidad de destino
    public String [] datos_vuelos = {"Conviasa;763;SC", "Conviasa;125;Porlamar", "Aeropostale;815;Porlamar", "Conviasa;805;VAL","Aserca;725;MBO"};

    public String[] datos_persona = {"1;Jose Gonzalez;23;763;1;23A;550","2;María Ramírez;19;125;2;1.65;3","3;José Montoya;29;725;3;1350",
    "4;Gerardo Jaimes;25;805;3;2345","5;Ana Pérez;36;815;2;1.72;4", "6;Emiro Martinez;33;815;1;5A;700","7;Anabella Martinez;18;763;1;14C;320", 
    "8;Mercedes Delgado;58;763;1;18D;440","9;Diego Herrera;25;125;3;2445", "10;Cluadia Fernandez;47;763;1;6E;350"};


// Split para hacerlo un array 2D, y tener cada posicion en donde deberia [0] pa diferenciar de datos_vuelos
// [0][2] para datos de cada Vuelo

/*     for(String elemento_vuelo : datos_vuelos){
        elemento_vuelo.split(";");
    } */
    
/*
[0]al id , [1]nombre, [2]edad, [3] número del vuelo, [4] código que indica el tipo de persona (1 para Pasajero, 2 para Azafata y 3 para Piloto),
[5] Si [4]==1 (pasajero) corresponde al asiento, y [6] seria el valor del pasaje
[5] Si [4]==2 (azafata) corresponde a estatura, y [6] seria la cant de idiomas
[5] Si [4]==3 (piloto) corresponde a horasde vuelo 
*/

    // for(String elemento_persona : datos_persona){
    //     elemento_persona.split(";");
    // }

    /* public static void main(String args[]) {
      String[] datos_persona = {"1;Jose Gonzalez;23;763;1;23A;550","2;María Ramírez;19;125;2;1.65;3","3;José Montoya;29;725;3;1350",
    "4;Gerardo Jaimes;25;805;3;2345","5;Ana Pérez;36;815;2;1.72;4", "6;Emiro Martinez;33;815;1;5A;700","7;Anabella Martinez;18;763;1;14C;320", 
    "8;Mercedes Delgado;58;763;1;18D;440","9;Diego Herrera;25;125;3;2445", "10;Cluadia Fernandez;47;763;1;6E;350"};

    String[][] datos_prss = new String[10][6];
    int i = 0;
        for(String a : datos_persona){
              datos_prss[i] = a.split(";");
              i++;
    }
    for(i = 0; i < datos_persona.length; i++){
        for(int j = 0; j < 6; j++){
            System.out.println(datos_prss[i][j]);
        }
    }
} */
}