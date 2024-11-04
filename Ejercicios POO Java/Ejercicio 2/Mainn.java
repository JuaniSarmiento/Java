public class Mainn {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 149, TipoPlaneta.TERRESTRE, true, 1, 0.997);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        tierra.imprimir();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad() + " kg/km³");
        System.out.println("¿Es la Tierra un planeta exterior? " + tierra.esPlanetaExterior());

        System.out.println();

        jupiter.imprimir();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/km³");
        System.out.println("¿Es Júpiter un planeta exterior? " + jupiter.esPlanetaExterior());
    }

}
