package Exercicio1;

public class Teste {
    public static void main(String[] args) {
        System.out.println("---------- ContaBancaria ----------");

        Exercicio1.ContaBancaria contaSimples = new Exercicio1.ContaBancaria();
        contaSimples.setNomeCliente("Yago Alexandre dos Santos");
        contaSimples.setNumConta("12345");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("---------- ContaPoupança ----------");

        Exercicio1.ContaPoupanca contaPoupacanca = new Exercicio1.ContaPoupanca();
        contaPoupacanca.setNomeCliente("Nickolas Daniel dos Santos");
        contaPoupacanca.setNumConta("56789");
        contaPoupacanca.setDiaRendimento(3);

        contaPoupacanca.depositar(100);

        realizarSaque(contaPoupacanca, 50);

        realizarSaque(contaPoupacanca, 70);

        if (contaPoupacanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.println(contaPoupacanca);

        System.out.println("---------- ContaEspecial ----------");

        Exercicio1.ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Hellen Thaise dos Santos");
        contaEspecial.setNumConta("111234");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }

}