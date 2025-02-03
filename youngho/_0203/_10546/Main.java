package _0203._10546;

import java.util.*;


// map.merge -> 이게되네
// map merge (key, new value, bifunction )
// key 의 값에 (oldvalue, new value ) -> oldvalue + newValue
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String input = sc.nextLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        for(int i = 0; i < N - 1; i++){
            String input = sc.nextLine();

            map.merge(input, -1, (ov, nv) -> ov + nv);
        }

        for( Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }

    }
}
