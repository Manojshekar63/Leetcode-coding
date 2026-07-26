import java.util.*;

class Solution {
    private int[][] memo;

    public int change(int amount, int[] coins) {
        memo = new int[coins.length][amount + 1];
        for (int[] row : memo) Arrays.fill(row, -1);
        return dfs(0, amount, coins);
    }

    private int dfs(int index, int amount, int[] coins) {
        if (amount == 0) return 1; // found valid combination
        if (index == coins.length) return 0; // no coins left

        if (memo[index][amount] != -1) return memo[index][amount];

        int ways = 0;
        // Option 1: take current coin if possible
        if (amount >= coins[index]) {
            ways += dfs(index, amount - coins[index], coins);
        }
        // Option 2: skip current coin
        ways += dfs(index + 1, amount, coins);

        memo[index][amount] = ways;
        return ways;
    }
}
