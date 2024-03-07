public class Parcial extends Examen {
    private int numeroDeUnidad;
    private int numeroDeReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, float nota, int numeroDeUnidad, int numeroDeReintentos) {
        super(alumno, titulo, enunciado, nota);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeReintentos = numeroDeReintentos;
    }

    @Override
    public boolean estaAprobado() {
        return this.nota >= 4;
    }

    public boolean puedeRecuperarse() {
        if (numeroDeUnidad <= 3) {
            return numeroDeReintentos < 3;
        } else {
            return numeroDeReintentos < 2;
        }
    }
}

