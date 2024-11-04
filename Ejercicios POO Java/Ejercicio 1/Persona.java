public class Persona {
    String nombre;
    String apellidos;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento;
    String genero;
    Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento , String paisNacimiento , String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }
    void imprimir() {
        System.out.println("Nombre =  "+ nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento=" + añoNacimiento);
        System.out.println("Pais nacimiento = " + paisNacimiento);
        System.out.println("Genero = " + genero);
        System.out.println();
    }

}