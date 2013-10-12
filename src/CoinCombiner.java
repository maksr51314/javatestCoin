public class CoinCombiner {

    public static int findCombinationsCount(int suma, int vals[]) {

        if (suma < 1) {
            return 0;
        }
        //TODO:add rules for unused vals

        int dp[] = new int[suma + 1];
        dp[0] = 1;
        for (int i = 0; i < vals.length; ++i) {
            for (int j = vals[i]; j <= suma; ++j) {
                dp[j] += dp[j - vals[i]];
            }
        }

        return dp[suma];
    }

    public static void main(String[] args) {
        //can you add right data
        int[] coins = {1 ,2, 5, 10, 50, 100};
        int sum = 100;

        System.out.println(findCombinationsCount(sum, coins));
    }

}
