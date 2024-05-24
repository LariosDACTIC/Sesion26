public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
        CuentaBancaria c;

        c = new CuentaCorriente("00012124", 500.00, 10.00);

        c = new CuentaAhorro("12345678", 1000.0, 5.0);

        // CuentaAhorro cuenta = new CuentaAhorro("12345678", 1000.0, 5.0);

        
        System.out.println("Número de cuenta: " + c.getNumeroCuenta());
        System.out.println("Saldo inicial: $" + c.getSaldo());
        
        c.depositar(500.0);
        c.retirar(200.0);

        c.aplicarInteres(10);;//

        System.out.println("Número de cuenta: " + c.getNumeroCuenta());
        System.out.println("Saldo inicial: $" + c.getSaldo());


    }
}
