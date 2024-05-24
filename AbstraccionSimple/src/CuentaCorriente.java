public class CuentaCorriente extends CuentaBancaria{
    
    private double tasaInteres;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
    }


    @Override
    public void retirar(double cantidad) {
        // double saldo = getSaldo();
        // if (cantidad > 0 && cantidad <= saldo) {
        //     saldo -= cantidad;
        //     System.out.println("Retirados: $" + cantidad + ". Saldo actual: $" + saldo);
        // } else {
        //     System.out.println("Cantidad de retiro inválida o saldo insuficiente");
        // }
    }



}
