package Unite8;


/* 综合样例 */
interface canPlay {
    void play();
}
public class Game {
    String name;
    public Game(String game_game){
        name = game_game;
    }
    public void begin(String name){
        new Desk(name);
    }
    class Desk implements canPlay{
        public void play(){
            System.out.println("正在玩.."+name);
        }
        public Desk(String desk_name){
            name = desk_name;
        }
    }
    public static void main(String args[]){
        Game x = new Game("Chess");
        x.begin(x.name);
        Game y = new Game("Poker");
        y.begin(x.name);
    }
}

