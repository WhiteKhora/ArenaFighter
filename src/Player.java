public class Player {

    private String name;
    private int rank;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public void setRank(int number) {
        this.rank = number;
    }

}
