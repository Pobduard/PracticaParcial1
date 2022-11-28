package Implementacion;

import data.Datos;
import Aerolinea.Vuelos;
public class Principal {
    Datos datos = new Datos();
    Vuelos viajes = new Vuelos();

    String[] Pasajeros;
    String[] Azafatas;
    String[] Pilotos;
    String[][] Personas;
    String[][] Vuelos;
    public void cargarDatos(){
        Personas = new String[datos.datos_persona.length][];
        Vuelos = new String[datos.datos_vuelos.length][];

        for(int i=0; i < datos.datos_persona.length; i++){
            Personas[i] = datos.datos_persona[i].split(";");
        }

        for(int i=0; i < datos.datos_vuelos.length; i++){
            Vuelos[i] = datos.datos_vuelos[i].split(";");
        }
    }
}
