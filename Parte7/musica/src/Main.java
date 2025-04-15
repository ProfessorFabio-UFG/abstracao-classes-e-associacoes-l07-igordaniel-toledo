public class Main {
    public static void main(String[] args) {
        Compositor comp1 = new Compositor("Anitta", "Brasileira");
        Compositor comp2 = new Compositor("Liniker", "Brasielira");

        Musica m1 = new Musica("Movimento da Sanfoninha", 1962, "Funk", comp1);
        Musica m2 = new Musica("Mayonga", 1824, "Pagode", comp2);

        System.out.println(m1);
        System.out.println();
        System.out.println(m2);
    }
}