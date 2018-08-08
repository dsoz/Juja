package ua.com.juja.core;

/**
 * Created by Diana on 23.07.2018.
 */
public class ExchangeMoney {

    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(0));
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int[] coins = {1, 2, 5, 10, 25, 50};
        if (amountForExchange == 0)
            return 0;
        else
            return ex(coins, coins.length, amountForExchange);
    }

    private static int ex(int S[], int m, int n){
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (m <=0 && n >= 1)
            return 0;

        return ex( S, m - 1, n ) + ex( S, m, n-S[m-1] );
    }
}
