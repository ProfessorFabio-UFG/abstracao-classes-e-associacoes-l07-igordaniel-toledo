public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa(String razaoSocial, String cnpj, Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empresa: " + razaoSocial + "\nCNPJ: " + cnpj + "\n" + endereco.toString();
    }
}

