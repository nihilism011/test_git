package minimini.물고기잡기게임;

public class Game {
    public static final int MAX_X = 20;
    public static final int MAX_Y = 10;
    public static final int BEAR_D = 1;
    public static final int FISH_D = 2;
    public static final int FISH_PER = 30;
    public static void main(String[] args) {
        GameStage stage = new GameStage();
        Bear bear = new Bear();
        Fish fish = new Fish();

        while (!bear.collide(fish)) {
            stage.setStage(bear, fish);     //판에 현재 bear과 fish의 위치를 세팅
            stage.stageView();              //판을 보여줌
            bear.move();                //w,a,s,d 를 입력받아 bear를 움직임
            fish.move();                //물고기는 자동으로 움직임

        }
        stage.setStage(bear,fish);          //bear 와 fish가 겹쳐서 fish가 잡아먹힌 상황
        stage.stageView();                  //그 상황을 보여줌
        System.out.println("Bear Wins!!");  //bear 이김!

    }

}
