# AppBanco.Java

**AppBanco.Java** é uma aplicação simples em Java que simula o cadastro de clientes em um banco. O sistema coleta dados pessoais de dois clientes e os exibe ao final da execução. O projeto utiliza conceitos básicos de orientação a objetos e entrada/saída de dados no console.

## Funcionalidades

- **Cadastro de Cliente**: O sistema solicita ao usuário o preenchimento de dados de dois clientes, como nome, CPF, email, idade e salário.
- **Exibição dos Dados**: Após a coleta das informações, o programa imprime os dados dos dois clientes no console.
- **Estrutura Simples e Clara**: O código é modular, com a definição de uma classe `Cliente` e uma classe principal `AppBanco` para gerenciar a execução.

## Como Usar

### Clonando o Repositório

Clone este repositório para sua máquina local usando o comando:

```bash
git clone https://github.com/Nic0llas/AppBanco.Java.git
```

### Instruções de Execução

1. **Abra o repositório clonado** em sua IDE favorita (Eclipse, IntelliJ, NetBeans, etc.).
2. **Compile e execute** a classe `AppBanco.java`.
3. O programa pedirá para inserir as informações de dois clientes:
    - Nome
    - CPF
    - Email
    - Idade
    - Salário
4. Após inserir as informações, o programa exibirá os dados de ambos os clientes no console.

### Exemplo de Saída:

```bash
Digite seu nome: João Silva
Digite seu CPF: 12345678900
Digite seu email: joao@exemplo.com
Digite sua idade: 30
Digite seu salario: 5000.00
-----
Digite seu nome: Maria Oliveira
Digite seu CPF: 98765432100
Digite seu email: maria@exemplo.com
Digite sua idade: 28
Digite seu salario: 6000.00
-----
Nome: João Silva
CPF: 12345678900
Email: joao@exemplo.com
Idade: 30
Salario: 5000.0
-----
Nome: Maria Oliveira
CPF: 98765432100
Email: maria@exemplo.com
Idade: 28
Salario: 6000.0
```

## Estrutura do Código

O projeto é composto por duas classes principais:

1. **Classe `Cliente`**: Define os dados de um cliente (nome, CPF, email, idade, salário) e um método `MostraDados()` que exibe esses dados no console.
   
   ```java
   public class Cliente {
       String nome;
       String cpf;
       String email;
       int idade;
       double salario;

       void MostraDados(){
           System.out.println("Nome: " + nome);
           System.out.println("CPF: " + cpf);
           System.out.println("Email: " + email);
           System.out.println("Idade: " + idade);
           System.out.println("Salario: " + salario);
       }
   }
   ```

2. **Classe `AppBanco`**: Responsável por coletar as informações do cliente e exibir os dados no console.

   ```java
   public class AppBanco {
       public static void main(String[] args){
           Cliente cliente1 = new Cliente();
           Cliente cliente2 = new Cliente();
           Scanner dados = new Scanner(System.in);

           // Coleta de dados do cliente 1
           System.out.println("Digite seu nome: ");
           cliente1.nome = dados.next();
           // (continua para os outros dados)

           // Coleta de dados do cliente 2
           System.out.println("Digite seu nome: ");
           cliente2.nome = dados.next();
           // (continua para os outros dados)

           // Exibição dos dados
           cliente1.MostraDados();
           cliente2.MostraDados();
       }
   }
   ```

## Tecnologias Utilizadas

- **Java**: A aplicação foi desenvolvida utilizando a linguagem de programação Java.
- **Scanner (Classe de Entrada)**: Para ler os dados inseridos pelo usuário no console.

## Como Contribuir

Se você deseja contribuir para este projeto, sinta-se à vontade para realizar um fork e enviar um pull request. Certifique-se de que seu código esteja bem documentado e testado antes de enviar.

1. Faça um fork deste repositório.
2. Crie uma nova branch (`git checkout -b minha-nova-funcionalidade`).
3. Faça as alterações necessárias e adicione os arquivos modificados (`git add .`).
4. Faça o commit das suas alterações (`git commit -m 'Adicionando nova funcionalidade'`).
5. Envie para o repositório remoto (`git push origin minha-nova-funcionalidade`).
6. Crie um pull request para a branch `main`.

Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
