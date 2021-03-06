package DesafioBanco;

public class Main {

    public static void main(String[] args) {
        Cliente danilo = new Cliente("47098382833", "Danilo");
        Cliente gabriel = new Cliente("1234567890", "Gabriel");

        Banco bradesco = new Banco("Bradesco");

        Conta cc = new ContaCorrente(danilo);
        Conta cp = new ContaPoupanca(gabriel);

        bradesco.adicionarConta(cc);
        bradesco.adicionarConta(cp);

        cc.depositar(500);
        cc.transferir(100, cp);
        cp.transferirPix(50, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println(bradesco.listarClientes());
    }

}
