package aulas;

public class Teste extends MomentoAvaliacao{
    
    public String local;

    public Teste(String local, Aluno aluno, int nota, int dificuldade, String data) {
        super(aluno, nota, dificuldade, data);
        this.local = local;
    }
    
    
}
