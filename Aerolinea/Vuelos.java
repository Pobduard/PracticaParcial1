package Aerolinea;
/*Una clase llamada Vuelos, que se encuentre en un paquete denominado Aerolinea, que contiene lo
        siguiente:
        • Un atributo privado nombre de tipo String, que almacena el nombre de la aerolínea
        • Un atributo privado vuelo de tipo int, que guarda el número del vuelo
        • Un atributo privado destino de tipo String, que almacena la ciudad destino
        • Un constructor paramétrico que recibe los datos para inicializar todos sus atributos
        • Un método llamado mostrar que no recibe y retorna una cadena que contiene los datos del
        vuelo de la siguiente forma: “Aerolínea – Número del vuelo – Destino”
        • Los métodos getter para sus atributos.
        • No contiene métodos setter*/

public class Vuelos {
    private String aerolinea;
    private int vuelo;
    private String destino;

    public Vuelos(String aerolinea, int vuelo, String destino) {
        this.aerolinea = aerolinea;
        this.vuelo = vuelo;
        this.destino = destino;
    }

    //metodo mostrar

    public String mostrar(){
        String datosDeVuelo = getaerolinea() + " - " + getVuelo() + " - " + getDestino();
        return datosDeVuelo;
    }


    //Getters
    public String getaerolinea() {
        return aerolinea;
    }

    public int getVuelo() {
        return vuelo;
    }

    public String getDestino() {
        return destino;
    }
}
