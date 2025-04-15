public class Main {
    public static void main(String[] args) {
        Departamento dcc = new Departamento("Departamento de Ciência da Computação", "DCC");
        Departamento mat = new Departamento("Departamento de Matemática", "MAT");

        Curso cienciaComp = new Curso("Ciência da Computação", "CC", dcc);
        Curso matematica = new Curso("Matemática", "MAT", mat);

        Aluno a1 = new Aluno("Igor", "001", 2025, cienciaComp);
        Aluno a2 = new Aluno("Rosiane", "003", 2025, matematica);

        System.out.println(a1);
        System.out.println();
        System.out.println(a2);
    }
}
