public class CriarConta {
    public static void main(String[] args) {
       Conta primeiraConta = new Conta();
       primeiraConta.saldo = 200;
       primeiraConta.titular = "Ariel Pellegrino";
       System.out.println(primeiraConta.saldo);
       System.out.println(primeiraConta.titular);

       primeiraConta.saldo += 100;
       System.out.println(primeiraConta.saldo);

       Conta segundaConta = new Conta();
    }
}
