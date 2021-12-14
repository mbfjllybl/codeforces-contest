package Div2.CodeforcesRound759.problemA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            cas();
        }
        reader.close();
    }

    public static void cas() throws IOException {
        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        String[] strs = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(strs[i]));
        }
        int res = list.get(0) + 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == 0 && list.get(i - 1) == 0) {
                System.out.println(-1);
                return;
            } else if (list.get(i - 1) == 1 && list.get(i) == 1) {
                res += 5;
            } else if (list.get(i) == 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
