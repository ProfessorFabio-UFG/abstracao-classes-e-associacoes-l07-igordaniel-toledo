public class Empregado {
    private String nome;
    private String matricula;
    private Empresa empresa;
    private Endereco endereco;

    public Empregado(String nome, String matricula, Empresa empresa, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empregado: " + nome + "\nMatrícula: " + matricula + "\n" + endereco.toString() + "\n" + empresa.toString();
    }
}

