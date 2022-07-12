public class ChangeCalculator {

    static private int[] coins = {50, 25, 10, 5, 1 };

    static public CoinCounts calculateChange(float amount){
        int remaining = Math.round(amount* 100);
        int[] counts = new int[5];

        while (remaining > 0){
            for (int coinIndex = 0; coinIndex < coins.length; coinIndex++){
                int division = remaining / coins[coinIndex];
                if (division > 0){
                    counts[coinIndex] = division;
                    remaining -= coins[coinIndex] * division;
                    if (remaining == 0){
                        break;
                    }
                }

            }
        }
        return new CoinCounts(counts);
    }
}