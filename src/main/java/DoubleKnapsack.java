public class DoubleKnapsack {
    static int maxN = 31;
    static int maxW = 31;

    // 3D array to store statis of DP
    static int dp [][][] = new int[maxN][maxW][maxW];
    // w1_r 代表 第一背包剩余的空间， w2_r代表 第二个背包剩余的空间
    // i 代表当前数组的下标

    static int maxWeight(int arr[], int n, int w1_r, int w2_r, int i) {
        // 跳出递归的用例
        // arr被遍历完了
        if (i == n) {
            return 0;
        }
        //如果中间结果被缓存过，就直接返回，没有被缓存到对应的dp,那么就继续递归。
        if (dp[i][w1_r][w2_r] != -1 ){
            return dp[i][w1_r][w2_r];
        }
        //3个变量去保存3个递归的关系
        int fill_w1 = 0, fill_w2 = 0, fill_none = 0;

        //如果w1的剩余空间能装下arr[i]，那么装尝试一直往下装
        if (w1_r >= arr[i]) {
            fill_w1 = arr[i] + maxWeight(arr, n, w1_r - arr[i], w2_r, i + 1);
        }

        if (w2_r >= arr[i]) {
            fill_w2 = arr[i] + maxWeight(arr, n, w1_r, w2_r - arr[i], i + 1);
        }

        fill_none = maxWeight(arr, n, w1_r, w2_r, i + 1);

        dp[i][w1_r][w2_r] = Math.max(fill_none, Math.max(fill_w2, fill_w1));

        return dp[i][w1_r][w2_r];
    }
}
