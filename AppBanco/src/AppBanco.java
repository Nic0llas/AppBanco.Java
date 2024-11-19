import java.util.Scanner;

public class AppBanco {
    public static void main (String[] args){
        Cliente cliente1 =  new Cliente();
        Cliente cliente2 = new Cliente();

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        cliente1.nome = dados.next();
        System.out.println("Digite seu CPF: ");
        cliente1.cpf = dados.next();
        System.out.println("Digite seu email: ");
        cliente1.email = dados.next();
        System.out.println("Digite sua idade: ");
        cliente1.idade = dados.nextInt();
        System.out.println("Digite seu salario: ");
        cliente1.salario = dados.nextDouble();

        System.out.println("-----");

        System.out.println("Digite seu nome: ");
        cliente2.nome = dados.next();
        System.out.println("Digite seu CPF: ");
        cliente2.cpf = dados.next();
        System.out.println("Digite seu email: ");
        cliente2.email = dados.next();
        System.out.println("Digite sua idade: ");
        cliente2.idade = dados.nextInt();
        System.out.println("Digite seu salario: ");
        cliente2.salario = dados.nextDouble();

        System.out.println("-----");
        cliente1.MostraDados();
        System.out.println("-----");
        cliente2.MostraDados();
    }
}