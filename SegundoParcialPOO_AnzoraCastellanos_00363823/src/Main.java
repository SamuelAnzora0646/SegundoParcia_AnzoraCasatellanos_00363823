public class Main {
    public static void main(String[] args) {
        Eshop eshop = new Eshop();

        // Configurar proveedor de pago usando el adaptador de PayPal y alipay
        var paypal = new PayPal();
        var alipay = new Alipay();
        double montoPago = 100.0;

        AdaptadorAlipay adaptadorAlipay = new AdaptadorAlipay(alipay);
        AdaptadorPayPal adaptadorPayPal = new AdaptadorPayPal(paypal);

        //Pago con alipay
        eshop.setProveedorPago(adaptadorPayPal);
        eshop.procesarPago(montoPago);

        //Pago con Alipay
        eshop.setProveedorPago(adaptadorAlipay);
        eshop.procesarPago(montoPago);


    }
}
