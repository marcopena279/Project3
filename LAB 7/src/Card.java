import javax.swing.JButton;

@SuppressWarnings("serial")
public class Card extends JButton{
	//INSTANCE VARIABLES
    private int id;
    private boolean matched = false;

    //SETTER METHOD
    public void setId(int id){
        this.id = id;
    }
    //GETTER METHOS
    public int getId(){
        return this.id;
    }

    //SETTER METHOD
    public void setMatched(boolean matched){
        this.matched = matched;
    }
    //GETTER METHOD
    public boolean getMatched(){
        return this.matched;
    }
}