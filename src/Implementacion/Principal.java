package Implementacion;

import data.Datos;

import Aerolinea.Azafata;
import Aerolinea.Pasajero;
import Aerolinea.Personas;
import Aerolinea.Piloto;
import Aerolinea.Vuelos;
public class Principal {
    Datos datos = new Datos();
    Vuelos viajes = new Vuelos();

    String[] Pasajeros;
    String[] Azafatas;
    String[] Pilotos;
    String[][] Personas= new String[datos.datos_persona.length][];
    String[][] Vuelos= new String[datos.datos_vuelos.length][];

    public void cargarDatos(){

        for(int i=0; i < datos.datos_persona.length; i++){
            Personas[i] = datos.datos_persona[i].split(";");
        }

        for(int i=0; i < datos.datos_vuelos.length; i++){
            Vuelos[i] = datos.datos_vuelos[i].split(";");
        }

    }

public static void main(String[] args){
        
    Principal main = new Principal();
    main.cargarDatos();
    int[][] categorias_personas = new int[10][3];


/*     for (int index = 0; index < main.Personas.length; index++) {
        for (int i = 0; i < main.Personas[index].length; i++) {
            System.out.println(main.Personas[index][i] + " " + main.Personas[index][i].getClass());
        }
    } */

    Personas[] humanos = new Personas[main.Personas.length];

    for (int i = 0; i < main.Personas.length; i++) {
        categorias_personas[i][0] = Integer.parseInt(main.Personas[i][0]);
        categorias_personas[i][1] = Integer.parseInt(main.Personas[i][4]);
        categorias_personas[i][2] = Integer.parseInt(main.Personas[i][3]);
        //System.out.println("Id: " + categorias_personas[i][0] + " Categoria: " + categorias_personas[i][1]);
        if(categorias_personas[i][1] == 1){Pasajero pasajeroclass = new Pasajero(main.Personas[i][1], Integer.parseInt(main.Personas[i][2]),
            Integer.parseInt(main.Personas[i][3]), main.Personas[i][4], main.Personas[i][5], Integer.parseInt(main.Personas[i][6]));
            humanos[i] = pasajeroclass;
        }
        else if(categorias_personas[i][1] == 2){Azafata azafataclass = new Azafata(main.Personas[i][1], Integer.parseInt(main.Personas[i][2]),
                Integer.parseInt(main.Personas[i][3]), main.Personas[i][4], Double.parseDouble(main.Personas[i][5]), Integer.parseInt(main.Personas[i][6]));
                humanos[i] = azafataclass;
        }
        else if(categorias_personas[i][1] == 3){Piloto pilotoclass = new Piloto(main.Personas[i][1], Integer.parseInt(main.Personas[i][2]),
                Integer.parseInt(main.Personas[i][3]), main.Personas[i][4], Integer.parseInt(main.Personas[i][5]));
                humanos[i] = pilotoclass;
        }
    }

    for (int i = 0; i < humanos.length; i++) {
        humanos[i].mostrar();
    }

    int horaspiloto = 0;
    String nombrepiloto = "";
    for (int i = 0; i < humanos.length; i++) {
        if(categorias_personas[i][1] == 3){
            if(horaspiloto <= Integer.parseInt(main.Personas[i][5])){
                horaspiloto = Integer.parseInt(main.Personas[i][5]);
                nombrepiloto = main.Personas[i][1];
            }
        }
    }

    System.out.println("El Piloto con la mayor cantidad de horas es: " + nombrepiloto + " y posee: " + horaspiloto + " Horas de vuelo");

    int[] sc = {0,0, 0};
    int[] Porlamar = {0,0, 1};
    int[] Val = {0,0, 2};
    int[] MBO = {0,0, 3};
    String vuelofrecuente = "";
    int vueloqueesfrecuente = 0;
    for (int i = 0; i < humanos.length; i++) {
        if(categorias_personas[i][1] == 1){
            if(categorias_personas[i][2] == 763){
                sc[0]++;
                sc[1] += (Integer.parseInt(main.Personas[i][6]));}
            else if((categorias_personas[i][2] == 125) || (categorias_personas[i][2] == 815)){
                Porlamar[0]++;
                Porlamar[1] += (Integer.parseInt(main.Personas[i][6]));}
            else if(categorias_personas[i][2] == 804){
                Val[0]++;
                Val[1] += (Integer.parseInt(main.Personas[i][6]));}
            else if(categorias_personas[i][2] == 725){
                MBO[0] = MBO[0] + 1;
                MBO[1] += (Integer.parseInt(main.Personas[i][6]));}
        }
    }

    if(sc[0] > Porlamar[0] && sc[0] > Val[0] && sc[0] > MBO[0]){
        vuelofrecuente = "Sc";
    } else if (Porlamar[0] > sc[0] && Porlamar[0] > Val[0] && Porlamar[0] > MBO[0]){
        vuelofrecuente = "Porlamar";
    } else if (Val[0] > Porlamar[0] && Val[0] > sc[0] &&Val[0] > MBO[0]){
        vuelofrecuente = "Val";
    } else if (MBO[0] > Porlamar[0] && MBO[0] > Val[0] && MBO[0] > sc[0]){
        vuelofrecuente = "MBO";
    }

    System.out.println("El Destino mas frecuente es: " + vuelofrecuente + " Y Su recaudo total es de: " + Integer.max(Integer.max(sc[1], Porlamar[1]), Integer.max(Val[1], MBO[1])) +"Bs");
}
}
