public class Final extends Examen {
    private float notaOral;
    private String temaOral;

    public Final(Alumno alumno, String titulo, String enunciado, float nota, float notaOral, String temaOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    @Override
    public boolean estaAprobado() {
        return this.nota >= 4 && this.notaOral >= 4;
    }

    public int compararCon(Final otroFinal) {
        float promedioEsteFinal = (this.nota + this.notaOral) / 2;
        float promedioOtroFinal = (otroFinal.nota + otroFinal.notaOral) / 2;

        return Float.compare(promedioEsteFinal, promedioOtroFinal);
    }
}
