enum TipoPlaneta {
    GASEOSO, TERRESTRE, ENANO
}
public class Planeta {
        // Atributos
       String nombre = null;
         int cantidadDeSatelites = 0;
         double masa = 0.0; // en kilogramos
         double volumen = 0.0; // en kilómetros cúbicos
         int diametro = 0; // en kilómetros
         int distanciaMediaAlSol = 0; // en millones de kilómetros
         TipoPlaneta tipo;
         boolean observableASimpleVista = false;
         double periodoOrbital =  0.0; // en años
         double periodoRotacion = 0.0; // en días

        // Constructor
        public Planeta(String nombre, int cantidadDeSatelites, double masa, double volumen, int diametro,
                       int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableASimpleVista,
                       double periodoOrbital, double periodoRotacion) {
            this.nombre = nombre;
            this.cantidadDeSatelites = cantidadDeSatelites;
            this.masa = masa;
            this.volumen = volumen;
            this.diametro = diametro;
            this.distanciaMediaAlSol = distanciaMediaAlSol;
            this.tipo = tipo;
            this.observableASimpleVista = observableASimpleVista;
            this.periodoOrbital = periodoOrbital;
            this.periodoRotacion = periodoRotacion;
        }

        // Método para imprimir los atributos
        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad de Satélites: " + cantidadDeSatelites);
            System.out.println("Masa: " + masa + " kg");
            System.out.println("Volumen: " + volumen + " km³");
            System.out.println("Diámetro: " + diametro + " km");
            System.out.println("Distancia Media al Sol: " + distanciaMediaAlSol + " millones de km");
            System.out.println("Tipo de Planeta: " + tipo);
            System.out.println("Observable a Simple Vista: " + observableASimpleVista);
            System.out.println("Período Orbital: " + periodoOrbital + " años");
            System.out.println("Período de Rotación: " + periodoRotacion + " días");
        }

        // Método para calcular la densidad
        public double calcularDensidad() {
            return volumen != 0 ? masa / volumen : 0;
        }

        // Método para determinar si es un planeta exterior
        public boolean esPlanetaExterior() {
            double distanciaAU = distanciaMediaAlSol * 1_000_000 / 149_597_870.0;
            return distanciaAU > 3.4;
        }

        // Métodos get y set (ejemplo para el atributo "nombre")
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
}
