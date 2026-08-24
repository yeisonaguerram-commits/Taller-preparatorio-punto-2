public class ObjetoClases {
    String Producto;
    int Cantidad;
    int CantidadTotal;
    int Estado;

    public ObjetoClases(String producto, int cantidad, int cantidadTotal, int estado) {
        Producto = producto;
        Cantidad = cantidad;
        CantidadTotal = cantidadTotal;
        Estado = estado;
    }

    public String getProducto() {
        return Producto;
    }
    public void setProducto(String producto) {
        Producto = producto;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public int getCantidadTotal() {
        return CantidadTotal;
    }
    public void setCantidadTotal(int cantidadTotal) {
        CantidadTotal = cantidadTotal;
    }
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int estado) {
        Estado = estado;
    }
}