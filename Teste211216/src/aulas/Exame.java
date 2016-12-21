package aulas;

public class Exame extends MomentoAvaliacao{
    
    private Questao[] questoes = new Questao[10];

    public Exame(Aluno aluno, int nota, int dificuldade, String data) {
        super(aluno, nota, dificuldade, data);
    }
    
}
