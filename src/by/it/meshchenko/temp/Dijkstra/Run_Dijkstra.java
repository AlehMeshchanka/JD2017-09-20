package by.it.meshchenko.temp.Dijkstra;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Run_Dijkstra {

    public static void main(String[] args) {

        int INF = Integer.MAX_VALUE;
        int vNum = 5; // количество вершин
        int[][] graph = new int[][]{
                {0, 10, INF, 30, 100},
                {10, 0, 50, INF, INF},
                {INF, 50, 0, INF, 10},
                {30, INF, INF, 0, 60},
                {100, INF, 10, 60, 0}}; // матрица смежности

        dijkstra(0, vNum, graph);
    }

    /* Алгоритм Дейкстры за O(V^2) */
    private static void dijkstra(int start, int vNum, int[][] graph) {

        //int[] dist = new int[vNum]; // массив расстояния. dist[v] = минимальное_расстояние(start, v)

        boolean[] used = new boolean[vNum]; // массив пометок
        int[] s = new int[vNum];
        int[] p = new int[vNum];
        int[] dist = Arrays.copyOfRange(graph[start], 0, vNum - 1);
        Arrays.copyOf(s, -1);
        Arrays.copyOf(p, Integer.MAX_VALUE);
        int min = Integer.MAX_VALUE;
        int w = start;
        used[start] = true;
//        for(int i = 0; i < vNum; i++) {
//            dist[i] = graph[start][i];
//        }

        s[0] = start;
        p[0] = 0;
        for (int nv = 1; nv < vNum; nv++) {

            for (int i = 0; i < vNum - 1; i++) {
                if (!used[i] && graph[s[w]][i] < min) {
                    min = graph[s[w]][i];
                    dist[nv] = min;
                    //p[nv] = dist[i];
                    s[nv] = i;
                    w = i;
                }
            }
            if ()
            used[w] = true;
        }




        int INF = Integer.MAX_VALUE / 2; // "Бесконечность"
        boolean[] used = new boolean[vNum]; // массив пометок


        Arrays.fill(dist, INF); // устанавливаем расстояние до всех вершин INF
        dist[start] = 0; // для начальной вершины положим 0

        for (; ; ) {
            int v = -1;
            for (int nv = 0; nv < vNum; nv++) {// перебираем вершины
                //System.out.print("v = " + v + " ; nv = " + nv);
                if (!used[nv] && dist[nv] < INF && (v == -1 || dist[v] > dist[nv])) { // выбираем самую близкую непомеченную вершину
                    System.out.print("\t--->v = " + v + " ; nv = " + nv);
                    v = nv;
                    System.out.println("\t---> v = " + v + " ; nv = " + nv);
                }
            }
            if (v == -1) {
                break;
            } // ближайшая вершина не найдена
            used[v] = true; // помечаем ее
            for (int nv = 0; nv < vNum; nv++) {
                if (!used[nv] && graph[v][nv] < INF) // для всех непомеченных смежных
                    dist[nv] = Math.min(dist[nv], dist[v] + graph[v][nv]); // улучшаем оценку расстояния (релаксация)
            }
        }
    }
}
