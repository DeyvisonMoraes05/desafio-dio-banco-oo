public class Main {
    public static void main(String[] args) {
        Cliente Deyvison = new Cliente();
        Deyvison.setNome("Deyvison");


        IConta cc = new ContaCorrente(Deyvison);
        cc.imprimirExtrato();
        cc.depositar(100);



        IConta cp = new ContaPoupanca(Deyvison);
        cp.imprimirExtrato();
        cp.sacar(50);
    }
}
