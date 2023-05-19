public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();
        
        // Criando alguns jogos de exemplo
        Game game1 = new Game();
        game1.setName("The Legend of Zelda: Breath of the Wild");
        game1.setConsole("Nintendo Switch");
        game1.setValor(59.99);
        
        Game game2 = new Game();
        game2.setName("Super Mario Odyssey");
        game2.setConsole("Nintendo Switch");
        game2.setValor(49.99);
        
        Game game3 = new Game();
        game3.setName("God of War");
        game3.setConsole("PlayStation 4");
        game3.setValor(39.99);
        
        // Cadastrando os jogos no estoque
        estoque.cadastrarGame(game1);
        estoque.cadastrarGame(game2);
        estoque.cadastrarGame(game3);
        
        // Testando a funcionalidade de buscar por nome
        List<Game> jogosPorNome = estoque.buscarPorNome("Super Mario Odyssey");
        System.out.println("Jogos encontrados por nome:");
        for (Game jogo : jogosPorNome) {
            System.out.println(jogo.getName() + " - " + jogo.getConsole() + " - R$" + jogo.getValor());
        }
        System.out.println();
        
        // Testando a funcionalidade de buscar por console
        List<Game> jogosPorConsole = estoque.buscarPorConsole("Nintendo Switch");
        System.out.println("Jogos encontrados por console:");
        for (Game jogo : jogosPorConsole) {
            System.out.println(jogo.getName() + " - " + jogo.getConsole() + " - R$" + jogo.getValor());
        }
        System.out.println();
        
        // Testando a funcionalidade de buscar por valor
        List<Game> jogosPorValor = estoque.buscarPorValor(39.99);
        System.out.println("Jogos encontrados por valor:");
        for (Game jogo : jogosPorValor) {
            System.out.println(jogo.getName() + " - " + jogo.getConsole() + " - R$" + jogo.getValor());
        }
        System.out.println();
    }
}