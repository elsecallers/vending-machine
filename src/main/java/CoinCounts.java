public class CoinCounts {
    int pennies;
    int nickles;
    int dimes; 
    int quarters;
    int halfDollars;

    private CoinCounts(int halfDollars, int quarters, int dimes, int nickles, int pennies){
        this.pennies = pennies;
        this.nickles = nickles;
        this.dimes = dimes;
        this.quarters = quarters;
        this.halfDollars = halfDollars;
    }

    public CoinCounts(int[] coins){
        this.pennies = coins[4];
        this.nickles = coins[3];
        this.dimes = coins[2];
        this.quarters = coins[1];
        this.halfDollars = coins[0];
    }

    public CoinCounts(){
        new CoinCounts(0,0,0,0,0);
    }



    public int getPennies(){return this.pennies;}
    public int getNickles(){return this.nickles;}
    public int getDimes(){return this.dimes;}
    public int getQuarters(){return this.quarters;}
    public int getHalfDollars(){return this.halfDollars;}

    public int[] getCoinsArray(){
        int[] literal =  {this.halfDollars, this.quarters, this.dimes, this.nickles, this.pennies};
        return literal;
    }
}
        