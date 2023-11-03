package app;
import pessoas.Cliente;
import pessoas.Funcionario;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Funcionario f1 = new Funcionario();
        System.out.println(f1.setNome("José")); // Saída: "José"
        f1.setSalario(8965.41);
        System.out.println(f1.getSalario()); //Saída: 8965.41
        System.out.println(f1.getNome());
        System.out.println(f1.reajustarSalario(10.0));
        f1.promover("gerente");
        System.out.println("O funcionario foi promovido a " +f1.getCargo());

        Funcionario f2 = new Funcionario(4321, 1000);
        f2.setDataAdmissao("04-05-2022");
        f2.setTelsContato("83 989483321");
        f2.setDataNascimento("14-06-1989");
        f2.setEndereco("Parque Solon de Lucena");
        f2.setCargo("Atendente de telemarketing");

        System.out.println("A Matrícula do funcionario é: " + f2.getMatricula());
        System.out.println("O endereço do funcionário é : " + f2.getEndereco());

        Cliente c1 = new Cliente("444", "Comprador");
        c1.setDataNascimento("01-05-1965");
        c1.setEndereco("Av. Epitacio Pessoa");
        System.out.println("O código do cliente é: " + c1.getCodigo());
        System.out.println("O Endereço do cliente é" + c1.getEndereco());




    }

}
