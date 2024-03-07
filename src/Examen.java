public abstract class Examen {
    protected Alumno alumno;
    protected String titulo;
    protected String enunciado;
    protected float nota;

    public Examen(Alumno alumno, String titulo, String enunciado, float nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public abstract boolean estaAprobado();
}
