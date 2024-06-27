package minimini.물고기잡기게임;



public class GameStage {
    char[][] xy_arr = new char[Game.MAX_Y][Game.MAX_X];

    public void setStage(GameObject b, GameObject f) {
        for (int i = 0; i < xy_arr.length; i++) {
            for (int j = 0; j < xy_arr[i].length; j++) {
                xy_arr[i][j] = '-';
            }
        }
        xy_arr[f.getY()][f.getX()] = f.getShape();
        xy_arr[b.getY()][b.getX()] = b.getShape();
    }

    public void stageView() {
        for (char[] y_arr : xy_arr) {
            for (char x_arr : y_arr) {
                System.out.print(x_arr);
            }
            System.out.println();
        }
    }


}
