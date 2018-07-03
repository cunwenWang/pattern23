public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void play () {
        BasketballTrain.play(this);
    }

    public void dunk () {
        System.out.println("扣篮");
    }

    public void shoot() {
        System.out.println("投篮");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
