package engenharia3.singleton.classes;

public class Cafeteria {
    private static Cafeteria instance;
    private String nomeCafe;

    private Cafeteria() {
        nomeCafe = "Café do Dia";
    }

    public static synchronized Cafeteria getInstance() {
        if (instance == null) {
            instance = new Cafeteria();
        }
        return instance;
    }

    public String getNomeCafe() {
        return nomeCafe;
    }

    public void setNomeCafe(String nomeCafe) {
        this.nomeCafe = nomeCafe;
    }

    public void prepararCafe() {
        System.out.println("Preparando " + nomeCafe);
    }
}