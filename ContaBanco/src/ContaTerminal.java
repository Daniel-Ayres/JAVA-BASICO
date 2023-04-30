import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância da classe Scanner para ler dados do terminal

        System.out.print("Por favor, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();
        // Lê o número da agência do usuário

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        // Lê o nome do cliente do usuário

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        // Lê o saldo da conta do usuário

        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();
        // Lê a agência da conta do usuário

        ContaBanco conta = new ContaBanco(numeroAgencia, agencia, nomeCliente, saldo);
        // Cria uma nova conta bancária com os dados fornecidos pelo usuário

        System.out.println(conta);
        // Imprime as informações da conta bancária
    }
}

class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    // Define os atributos da conta bancária

    public ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        // Define o construtor da conta bancária com os atributos fornecidos
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // Define os métodos getters e setters dos atributos da conta bancária

    @Override
    public String toString() {
        // Define o método toString() que imprime as informações da conta bancária
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    }
}
