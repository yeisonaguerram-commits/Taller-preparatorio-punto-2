import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjetoClases[][] IngresarAlmacen(ObjetoClases[][] almacen) {
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen.length; j++) {
                if (almacen[i][j] == null || almacen[i][j].getEstado() != 1) {

                ObjetoClases o = new ObjetoClases(null, 0, 0, 0);
                System.out.println("Ingrese el nombre del producto");
                o.setProducto(sc.next());
                System.out.println("ingrese la cantidad");
                o.setCantidad(sc.nextInt());
                o.setEstado(1);
                almacen[i][j] = o;
                return almacen;
                } //fin if
            } //fin for 2
        } //fin for 1
        System.out.println("Almacen lleno");
        return almacen;

    } // fin metodo

    public void SumarCantidades(ObjetoClases[][] almacen) {
        int sumatotal = 0;
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen.length; j++) {
                if (almacen[i][j] != null && almacen[i][j].getEstado() == 1) {
                    sumatotal += almacen[i][j].getCantidad();
                } //fin if
            } // fin for 2
        } // fin for 1
        System.out.println("La suma total es de: " + sumatotal);
    } //fin metodo
}
