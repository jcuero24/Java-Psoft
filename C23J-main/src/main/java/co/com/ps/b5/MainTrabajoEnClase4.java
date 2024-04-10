package co.com.ps.b5;

public class MainTrabajoEnClase4 {
    public static void main(String[] args) {
        TipoDeProducto producto1 = new TipoDeProducto("Manzanas", TrabajoEnClase4.ALIMENTO);
        TipoDeProducto producto2 = new TipoDeProducto("Televisor", TrabajoEnClase4.ELECTRONICO);
        TipoDeProducto producto3 = new TipoDeProducto("Camiseta", TrabajoEnClase4.ROPA);
        TipoDeProducto producto4 = new TipoDeProducto("Mueble", TrabajoEnClase4.HOGAR);

        System.out.println("Producto 1: " + producto1.nombre + ", Tipo: " + producto1.tipo);
        System.out.println("Producto 2: " + producto2.nombre + ", Tipo: " + producto2.tipo);
        System.out.println("Producto 3: " + producto3.nombre + ", Tipo: " + producto3.tipo);
        System.out.println("Producto 4: " + producto4.nombre + ", Tipo: " + producto4.tipo);
    }
}


