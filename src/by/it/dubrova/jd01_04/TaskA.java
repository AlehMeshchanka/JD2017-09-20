package by.it.dubrova.jd01_04;

public class TaskA {
    public static void main(String[] args) {
     //   int[10][10] = createMultiplicationTable(10,10);  // таблица умножения 0 - 9
        int[][]  z = new int[20][20];
        z = createMultiplicationTable(20,20);
    }

    public static int[][] createMultiplicationTable(int x, int y){
        //Создать массив и заполнить
        int[][] mt = new int[x][y];
        for (int i = 0; i < y; i++){ // заполняем x
            //mt[i] = i;
            for (int j = 0; j < x; j++){ // заполняем y
                mt[i][j] = i * j;
                System.out.print(i + "*" + j + "=" + mt[i][j] + "\t");
            }

            System.out.println();
        }
        return mt;
    }

}
