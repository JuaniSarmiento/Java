package Ejercicio1;

public class SistemaReservas {
    public static void main(String[] args) {
        // Crear instancia de Reservas con capacidad para 5 vuelos
        Reservas reservas = new Reservas(5);

        // Crear vuelos
        Vuelo vuelo1 = new VueloRegular("VR123", "Nueva York", "Los Ángeles", "2023-12-01", 150, 200);
        Vuelo vuelo2 = new VueloCharter("VC456", "Miami", "Orlando", "2023-12-02", 5000);

        // Agregar vuelos a reservas
        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

        // Mostrar información antes de aplicar promociones
        System.out.println("Información de vuelos antes de promociones:");
        reservas.mostrarInformacionVuelos();

        // Aplicar promoción del 10% de descuento
        reservas.aplicarPromociones(10);

        // Mostrar información después de aplicar promociones
        System.out.println("\nInformación de vuelos después de aplicar promociones:");
        reservas.mostrarInformacionVuelos();

        // Calcular el precio total de las reservas
        System.out.println("\nPrecio total de las reservas: $" + reservas.calcularPrecioTotal());
    }
}
