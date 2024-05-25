// Adaptador para PayPal para implementa la interfaz ProveedorPago
class AdaptadorAlipay implements ProveedorPago {
    private Alipay alipay;

    AdaptadorAlipay(Alipay alipay) {
        this.alipay = alipay;
    }

    @Override
    public void procesarPago(double monto) {
        String usuario = "usuarioAlipay";
        String contraseña = "contraseñaAlipay";
        String nombreEmpresa = "EmpresaAlipay";
        alipay.realizarPago(usuario, contraseña, nombreEmpresa );
    }
}
