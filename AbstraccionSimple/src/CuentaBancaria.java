abstract class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depositados: $" + cantidad + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("Cantidad de depósito inválida");
        }
    }

    // Método abstracto
    public abstract void retirar(double cantidad);

      // Método abstracto
      public abstract void aplicarInteres(double cantidad);
}
