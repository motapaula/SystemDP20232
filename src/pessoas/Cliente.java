package pessoas;

public class Cliente extends Pessoa {
    private String codigo;
    private String profissao;

    public Cliente(String nome, String dataNascimento, String endereco, String cargo, String codigo, String profissao) {
        super(nome, dataNascimento);
        this.setEndereco(endereco);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public Cliente() {

    }

    public Cliente(String codigo, String profissao) {
        this.codigo = codigo;
        this.profissao = profissao;
    }

    private String setCodigo() {
        return codigo;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao() {
        this.profissao = profissao;
    }
}
