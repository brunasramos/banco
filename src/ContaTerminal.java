 public class BancoTerminal {

    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 18;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + saldo);

        // Realizar a mesma operação com novos valores
        saldo = 15;
        valorSolicitado = 22;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + saldo);
    }
}
