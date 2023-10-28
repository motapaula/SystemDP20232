package pessoas;

import composicao.Endereco;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private String telsContato;

    private void cadastrar() {

    }

    public int obterIdade() {
        int idade = 0;
        //calculo de idade: ano atual - data de nascimento
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }
}
