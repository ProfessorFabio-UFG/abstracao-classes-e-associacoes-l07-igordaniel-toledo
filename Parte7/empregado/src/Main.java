public class Main {
    public static void main(String[] args) {
        Endereco enderecoEmpresa = new Endereco("Av. Tocantis", 1000, "Goiás", "GO");
        Empresa empresa = new Empresa("LEVEL 5", "12.345.678/0001-99", enderecoEmpresa);

        Endereco enderecoEmpregado = new Endereco("Rua dos Amargurados", 123, "Goiás", "GO");
        Empregado emp1 = new Empregado("Carlos Silva", "EMP001", empresa, enderecoEmpregado);

        System.out.println(emp1);
    }
}
