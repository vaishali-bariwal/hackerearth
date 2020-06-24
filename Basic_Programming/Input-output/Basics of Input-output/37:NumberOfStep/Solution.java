import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

import java.util.StringTokenizer;

public class Solution {

    public static BufferedReader br;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {

            arr1[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr1[i]);

        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {

            arr2[i] = Integer.parseInt(st.nextToken());

        }

        boolean notSame = true;
        int count = 0;

        while(notSame) {

            notSame = false;
            for(int i=0; i<n; i++) {

                while(arr1[i]>min && arr2[i]!=0) {

                arr1[i] = arr1[i]-arr2[i];
                notSame = true;
                count++;

                }

            if(min>arr1[i]) min = arr1[i];
            if(min<0) break;

            }

        }

        if(min<0) System.out.println(-1);
        else System.out.println(count);

}

}

