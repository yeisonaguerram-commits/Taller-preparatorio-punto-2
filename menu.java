import java.util.Scanner;

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el tamaño de la matriz");
    int n = sc.nextInt();


    ObjetoClases[][] almacén = new ObjetoClases[n][n];
    Metodos m = new Metodos();

    boolean continuar = true;

    while (continuar) {
        System.out.println("=============================");
        System.out.println("Bienvenido a bodega xd");
        System.out.println("========================");
        System.out.println("Seleccione que desea realizar");
        System.out.println("1) Ingresar producto");
        System.out.println("2) sumar cantidades");
        System.out.println("3) salir");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                almacén = m.IngresarAlmacen(almacén);
                break;
            case 2:
                m.SumarCantidades(almacén);
                break;
            case 3:
                System.out.println("Hasta pronto...");
                continuar = false;
                break;
            default:
                System.out.println("Opcion no disponible...");
                break;
        }
    }


    sc.close();
}