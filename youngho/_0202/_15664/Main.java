package _0202._15664;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int N;
    static int M;

    static int[] resultArr;
    static int[] arr;

    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        resultArr = new int[M];
        arr = new int[N];
        visited = new boolean[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        back(0, 0);
        System.out.println(sb.toString());
    }
    static void back(int depth, int start){
        StringBuilder sb1 = new StringBuilder();

        if(depth == M){
            for(int x : resultArr){
                sb1.append(x).append(" ");
            }
            sb1.append("\n");

            if(!set.contains(sb1.toString())){
                sb.append(sb1.toString());
                set.add(sb1.toString());
            }
            return;
        }

        for(int i = start; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                resultArr[depth] = arr[i];
                back(depth + 1 , i + 1);
                visited[i] = false;
            }

        }

    }
}

// 1 7
//1 9
//7 9
//9 9


