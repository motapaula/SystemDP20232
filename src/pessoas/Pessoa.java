package pessoas;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String endereco; //Composição - Pessoa tem um endereço
    private String telsContato; //Composição - Pessoa tem um telefone

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //Método para realizar o cadastro inicial
    public void cadastrar() {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;

    }

    public int obterIdade() {
        int idade = 0;
        //calculo de idade: ano atual - data de nascimento
        return idade;
    }

    //Criação do método construtor principal
    public Pessoa () {
        this("", "");
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }
}
