package aulas;

public class ProvaOral extends MomentoAvaliacao{
    
    private int fluencia,
                dominioMateria;

    public ProvaOral(int fluencia, int dominioMateria, Aluno aluno, int nota, int dificuldade, String data) {
        super(aluno, nota, dificuldade, data);
        this.fluencia = fluencia;
        this.dominioMateria = dominioMateria;
    }

    public int getFluencia() {
        return fluencia;
    }

    public void setFluencia(int novaFluencia) {
        this.fluencia = novaFluencia;
    }
    
}
