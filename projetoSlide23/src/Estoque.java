import java.util.LinkedList;
import java.util.List;

public class Estoque {
    private List<Game> games = new LinkedList<Game>();
    
    public void cadastrarGame(Game game){
        games.add(game)
    }
    public List<Game> buscarPorName(String name){
        for(Game game : games){
            if (game.getName().equals(name)){
            
            }
            
        }
        

    }

}
