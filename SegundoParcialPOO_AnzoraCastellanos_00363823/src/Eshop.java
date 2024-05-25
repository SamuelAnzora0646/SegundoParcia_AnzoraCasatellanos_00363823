
// Clase principal de la plataforma Ubiverse
class Eshop {
    private ProveedorPago proveedorPago;

    void setProveedorPago(ProveedorPago proveedorPago) {
        this.proveedorPago = proveedorPago;
    }

    void procesarPago(double monto) {
        proveedorPago.procesarPago(monto);
    }
}