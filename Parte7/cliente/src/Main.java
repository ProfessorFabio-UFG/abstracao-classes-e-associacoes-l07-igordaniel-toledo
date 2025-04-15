import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua A", 101, "Apto 202", 12345-678, "Centro", "Rio de Janeiro", "RJ");
        Endereco end2 = new Endereco("Av. Central", 300, "Casa", 98765-432, "Jardins", "São Paulo", "SP");

        Cliente c1 = new Cliente("Mariana Costa", "123.456.789-00", end1);
        Cliente c2 = new Cliente("João Pereira", "987.654.321-00", end2);

        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
    }
}
