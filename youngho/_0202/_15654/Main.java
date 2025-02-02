package _0202._15654;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N;
    static int M;

    static boolean[] visited;
    static int[] resultArr;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        visited = new boolean[N];
        resultArr = new int[M];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        back(0);

        System.out.println(sb.toString());

    }

    public static void back(int depth){
        if(depth == M){
            for(int x : resultArr){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                resultArr[depth] = arr[i];
                back(depth + 1);
                visited[i] = false;
            }
        }

    }
}
