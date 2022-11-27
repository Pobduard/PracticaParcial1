import java.util.Scanner;
import java.util.Random;

class Producto{
    private String descripcionProducto;
    private float precioVentaUnidad;
    private float costoProdUnidad;
    private int cantidadProd;

    public Producto(){
        System.out.println("No se le dieron atributos en absoluto al objeto");
    }

    public Producto(String Descp, float PriceUnitSold, float CostProdUnit, int AmountProd){
        this.descripcionProducto = Descp;
        this.precioVentaUnidad = PriceUnitSold;
        this.costoProdUnidad = CostProdUnit;
        this.cantidadProd = AmountProd;
        System.out.print("All Filled boyyyy \n");
    }

    public void setDescripcionProducto(String Descp){
        this.descripcionProducto = Descp;
    };
    public void setPrecioVentaUnidad(float PriceUnitSold){
        this.precioVentaUnidad = PriceUnitSold;
    };
    public void setCostoProdUnidad(float CostProdUnit){
        this.costoProdUnidad = CostProdUnit;
    };
    public void setCantidadProd(int AmountProd){
        this.cantidadProd = AmountProd;
    };

    public String   getDescripcionProducto(){
        return this.descripcionProducto;
    };
    public float    getPrecioVentaUnidad(){
        return this.precioVentaUnidad;
    };
    public float    getCostoProdUnidad(){
        return this.costoProdUnidad;
    };
    public int       getCantidadProd(){
        return this.cantidadProd;
    };

    public void   showDescripcionProducto(){
        System.out.println(this.descripcionProducto);
    };
    public void    showPrecioVentaUnidad(){
        System.out.println(this.precioVentaUnidad);
    };
    public void    showCostoProdUnidad(){
        System.out.println(this.costoProdUnidad);
    };
    public void       showCantidadProd(){
        System.out.println(this.costoProdUnidad);
}
}



public class Principal2 {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);   
    Random random = new Random();
    
    int prods = 0;
    do{
    System.out.println("Cuantos Productos Desea Registrar?");
    prods = scan.nextInt(); scan.nextLine();
    if(prods == 0){
        System.out.println("Porfavor Introduzca un numero diferente de 0");
    }
    } while(prods == 0);

    Producto vector[] = new Producto[prods];
    for (int i = 0; i< vector.length; i++){
        vector[i] = new Producto();
    }


    for(int i = 0; i < prods; i++){
        Thread.sleep(1000);
        System.out.println("Porfavor Introduzca una Descripcion para el Producto#" + (i+1));
        String Descripcion = "Objeto N°" + i; 
        System.out.println("Porfavor Introduzca un Precio de Venta x Unidad para el Producto#" + (i+1));
        float PriceUnitSold = (float)(random.nextInt(100) + random.nextDouble());/* scan.nextFloat(); scan.nextLine(); */
        System.out.println("Porfavor Introduzca un Precio de Produccion x Unidad para el Producto#" + (i+1));
        float CostProdUnit = (float)(random.nextInt(100) + random.nextDouble());/* scan.nextFloat(); scan.nextLine(); */
        System.out.println("Porfavor Introduzca un Cantidad de Produccion para el Producto#" + (i+1));
        int AmountProd = random.nextInt(100);/* scan.nextInt(); scan.nextLine(); */

        vector[i].setDescripcionProducto(Descripcion);
        vector[i].setPrecioVentaUnidad(PriceUnitSold);
        vector[i].setCostoProdUnidad(CostProdUnit);
        vector[i].setCantidadProd(AmountProd);
    }

    float Cant_Promedio = 0;
    float Costo_Dinero_Produccion = 0;
    float Dinero_potencial_Almacen = 0;

    for(Producto cant : vector){
        Cant_Promedio = Cant_Promedio + (float)cant.getCantidadProd();
        Dinero_potencial_Almacen = Dinero_potencial_Almacen + (float)cant.getPrecioVentaUnidad();
        Costo_Dinero_Produccion = Costo_Dinero_Produccion + (float)cant.getCostoProdUnidad();
    }
    Cant_Promedio = Cant_Promedio / (float)vector.length;
    float Ganancias_Reales = Dinero_potencial_Almacen - Costo_Dinero_Produccion;

    System.out.println("+\n+\n+\nLas Cantidad de Produccion Promedio Resulto en: " + Cant_Promedio);
    System.out.println("Las Ganancias Reales Fueron: " + Ganancias_Reales);
    System.out.println("Productos con produccion menor al promedio: ");
    for (Producto producto : vector) {
        if(Cant_Promedio > producto.getCantidadProd()){
            System.out.println(producto.getDescripcionProducto());
        }
    }


    System.out.println("+\n+\n+\nVamos a verificar la Cantidad Producica de un producto en especifico.\n.\n.\n[Los Productos Son:]\n.\n.\n");
    boolean verificar = true;
    for (int i = 0; i < vector.length; i++) {
        System.out.println("Producto #" + (i+1) + " Es: " + vector[i].getDescripcionProducto());
    }
    do{
        System.out.print("Introduzca el numero correspondiente al Producto que desea ver: ");
        int eleccion = scan.nextInt() - 1;scan.nextLine();
        System.out.print("La Produccion del Producto \" " + vector[eleccion].getDescripcionProducto() + 
        " \" Fue de: " + vector[eleccion].getCantidadProd());

        System.out.println("Desea chequear otro Producto? Si(1)/No(0)");
        eleccion = scan.nextInt();scan.nextLine();
        if (eleccion == 0){verificar = false;}
    }while(verificar);

    scan.close();
    }
}