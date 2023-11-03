package pessoas;

import composicao.Endereco;

public class Funcionario  extends Pessoa {
    private int matricula;
    private String cargo;
    private double salario;
    private String dataAdmissao;

    //Criação de método construtor

    public Funcionario(String nome, String dataNascimento, String endereco, String cargo, int matricula, double salario, String dataAdmissao) {
        super(nome, dataNascimento);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(int matricula, double salario, String dataAdmissao) {
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(int matricula, double salario) {
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario(){

    }



    //Criação do método para cadastrar funcionário
    public void cadastrarFuncionario(int matricula, String cargo, double salario, String dataAdmissao) {
        super.cadastrar();
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;



    };

//Método específico da classe Funcionário
    public double reajustarSalario(double percentual) {
        double reajuste = (percentual/100); //criação da variável reajuste
        this.salario = this.salario * (reajuste + 1);


        return salario;
    }
    //Método específico da classe Funcionário
    public void promover(String novoCargo) {
        this.cargo = novoCargo;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
