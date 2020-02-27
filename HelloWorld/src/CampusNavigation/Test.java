package CampusNavigation;

public class Test {
    public int[][] MAP = new int[8][8];
    int index = 4;

    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                MAP[i][j] = (i+j)/2;
            }
        }



        for (int i = index; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                MAP[i][j] = MAP[i + 1][j];
            }
        }

        for (int i = index; i < 7; i++) {
        for (int j = 0; j < 8; j++) {
            MAP[j][i] = MAP[j][i+1];
        }
    }

    }



    public void show() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Test().show();
    }

}
