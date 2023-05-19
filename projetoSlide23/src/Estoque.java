import java.util.LinkedList;
import java.util.List;

public class Estoque {
    private List<Game> games = new ArrayList<>();
    
    public void cadastrarGame(Game game) {
        games.add(game);
    }
    
    public List<Game> buscarPorNome(String nome) {
        List<Game> resultados = new ArrayList<>();
        
        for (Game game : games) {
            if (game.getName().equalsIgnoreCase(nome)) {
                resultados.add(game);
            }
        }
        
        return resultados;
    }
    
    public List<Game> buscarPorConsole(String console) {
        List<Game> resultados = new ArrayList<>();
        
        for (Game game : games) {
            if (game.getConsole().equalsIgnoreCase(console)) {
                resultados.add(game);
            }
        }
        
        return resultados;
    }
    
    public List<Game> buscarPorValor(double valor) {
        List<Game> resultados = new ArrayList<>();
        
        for (Game game : games) {
            if (game.getValor() == valor) {
                resultados.add(game);
            }
        }
        
        return resultados;
    }
}