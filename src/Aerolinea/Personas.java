package Aerolinea;

/*Un atributo privado id de tipo int, que almacena el N° de identificación de la persona
        • Un atributo privado nombre de tipo String, que almacena el nombre de la persona
        • Un atributo privado edad de tipo int, que guarda la edad de la persona
        • Un atributo privado vuelo de tipo int, que guarda el número del vuelo
        • Un atributo protegido categoría de tipo String, que almacena la categoría de la persona
        • Un constructor paramétrico que recibe los datos para inicializar todos sus atributos
        • Un constructor por defecto
        • Un método llamado mostrar que no recibe ni retorna ningún valor
        • Un método llamado calcularCategoría que no recibe ni retorna valores. Este método será
        implementado en las clases derivadas de la siguiente manera:
        o Para los pasajeros: si el valor del pasaje es menor a 450 Bs su categoría es
        “Económica” y si es superior es “1era Clase”. Si es igual a 450Bs su categoría es
        “Turista”
        o Para las azafatas: si su edad <22 y habla máximo 2 idiomas es “Aprendiz”, si su
        edad es >=22 y habla máximo 2 idiomas es “Auxiliar”, si habla más de 2 idiomas es
        “Titular”
        o Para el piloto: si tiene más de 1500 horas de vuelo es “Capitán”, si tiene 1500 horas
        de vuelo o menos es “1er Piloto”
        • Los métodos getter para sus atributos.
        • No contiene métodos setter.
*/

public class Personas {
    private int id;
    private String nombre;
    private int edad;
    private int vuelo;
    protected String categoria;

    public Personas() {
    }

    public Personas(String nombre, int edad, int vuelo, String categoria) {
        this.nombre = nombre;
        this.edad = edad;
        this.vuelo = vuelo;
        this.categoria = categoria;
    }

    //Metodo mostrar
    public void mostrar(){
    }

    //Metodo calcular categoria
    public void calcularCategoria(){
    }

    //getters

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getVuelo() {
        return this.vuelo;
    }

    public String getCategoria() {
        return this.categoria;
    }
}
