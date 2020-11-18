package Work_3;

class Player implements Playable, Recodable{
    @Override
    public void play () {}

    @Override
    public void pause() {}

    @Override
    public void stop() {}

    @Override
    public void record() {}

}

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.play();
        player.pause();
        player.pause();
        player.stop();

    }
}
