public class Main {
    public static void main(String[] args) {
        // Crear un alumno
        Alumno alumno1 = new Alumno("Juan", "Pérez", "123456");

        // Crear un parcial y evaluar si el alumno puede recuperarlo
        Parcial parcial1 = new Parcial(alumno1, "Matemáticas I", "Resolver integrales", 3, 2, 2);
        System.out.println("El parcial de " + parcial1.titulo + " ¿está aprobado? " + parcial1.estaAprobado());
        System.out.println("¿Puede recuperarse el parcial? " + parcial1.puedeRecuperarse());

        // Crear un examen final y evaluar si está aprobado
        Final final1 = new Final(alumno1, "Historia del Arte", "Movimientos artísticos del siglo XX", 4, 5, "Impresionismo");
        System.out.println("El final de " + final1.titulo + " ¿está aprobado? " + final1.estaAprobado());

        // Crear otro examen final para comparar
        Final final2 = new Final(alumno1, "Literatura", "Análisis literario de 'El Quijote'", 5, 6, "Narrativa");
        System.out.println("Comparando los finales de " + final1.titulo + " y " + final2.titulo + ": " + final1.compararCon(final2));

        // Interpretar el resultado de la comparación
        int comparacion = final1.compararCon(final2);
        if(comparacion > 0) {
            System.out.println("El final de " + final1.titulo + " tiene un promedio mayor.");
        } else if(comparacion < 0) {
            System.out.println("El final de " + final2.titulo + " tiene un promedio mayor.");
        } else {
            System.out.println("Ambos finales tienen el mismo promedio.");
        }
    }
}
