package CSES;

import java.util.Arrays;

public class maximum_population_year {
    public int maximumPopulation(int[][] logs) {
        int maxyear = 0;
        int minyear = Integer.MAX_VALUE;
        int n = logs.length;
        for(int i = 0; i < n; i++){
            int year = logs[i][1];
            maxyear = Math.max(year,maxyear);
            minyear = Math.min(year,minyear);
        }
        int[] years = new int[maxyear+1];
        Arrays.fill(years,0);

        for(int[] val : logs){
            int byear = val[0];
            int dyear = val[1];

            years[byear] = years[byear]+1;
            years[dyear] = years[dyear]-1;
        }
        int[] prefix = new int[maxyear+1];
        prefix[0] = years[0];
        for(int i = 1; i <= maxyear; i++){
            prefix[i] = prefix[i-1] + years[i];
        }

        int year = 0;
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < prefix.length; i++){
            if(prefix[i] > large){
                large = prefix[i];
                year = i;
            }
        }
        return year;
    }
}
