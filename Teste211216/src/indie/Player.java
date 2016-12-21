package indie;

public class Player extends SensibleDummy{
    private int     fatigue,
                    atack,
                    defense;
    private char    faceTo;

    public Player(int fatigue, int atack, int defense, char faceTo, String nome, String cor) {
        super(nome, cor);
        this.fatigue = fatigue;
        this.atack = atack;
        this.defense = defense;
        this.faceTo = faceTo;
    }
    
    public void pass() {
        
    }
    
    public void shot() {
        
    }
    
}
