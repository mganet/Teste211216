package aulas;

public class MomentoAvaliacao {
    
    private Aluno  aluno;
    private int    nota,
                   dificuldade;
    private String data;

    public MomentoAvaliacao(Aluno aluno, int nota, int dificultade, String data) {
        this.aluno = aluno;
        this.nota = nota;
        this.dificuldade = dificultade;
        this.data = data;
    }
        
}
