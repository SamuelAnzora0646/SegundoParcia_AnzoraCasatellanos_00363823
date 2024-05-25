// Adaptador para PayPal para implementa la interfaz ProveedorPago
class AdaptadorPayPal implements ProveedorPago {
    private PayPal payPal;

    AdaptadorPayPal(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void procesarPago(double monto) {
        String usuario = "usuarioPayPal";
        String contraseña = "contraseñaPayPal";
        payPal.realizarPago(usuario, contraseña, monto);
    }
}
