package engenharia3.singleton;

import engenharia3.singleton.classes.Cafeteria;

public class Application {
    public static void main(String[] args) {
        // Obtendo a instância única da Cafeteria
        Cafeteria cafeteria = Cafeteria.getInstance();

        // Alterando o nome do café
        cafeteria.setNomeCafe("Café Especial");

        // Preparando o café
        cafeteria.prepararCafe();

        // Tentando obter outra instância - deve retornar a mesma instância
        Cafeteria outraCafeteria = Cafeteria.getInstance();
        System.out.println("São a mesma instância? " + (cafeteria == outraCafeteria));
    }
}
