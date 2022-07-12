import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ChangeCalculatorTest {

    @Test
    void changeForADollarTest(){
        CoinCounts out = ChangeCalculator.calculateChange(1.00f);
        assertThat(out.getCoinsArray()).containsExactly(2,0,0,0,0);
    }

    @Test
    void changeForEightyCents(){
        CoinCounts out = ChangeCalculator.calculateChange(0.8f);
        assertThat(out.getHalfDollars()).isEqualTo(1).as("0.80-0.50 = 0.30");
        assertThat(out.getQuarters()).isEqualTo(1).as("0.30 - 0.25 = 0.05");
        assertThat(out.getDimes()).isEqualTo(0).as("0.05 > 0.10");
        assertThat(out.getNickles()).isEqualTo(1);
    }

    @Test
    void changeForEightyNineCents(){
        CoinCounts out = ChangeCalculator.calculateChange(0.89f);
        assertThat(out.getHalfDollars()).isEqualTo(1).as("0.89-0.50=0.39");
        assertThat(out.getQuarters()).isEqualTo(1).as( "0.39-0.25=0.14");
        assertThat(out.getDimes()).isEqualTo(1).as("0.14 - 0.10 = 0.04");
        assertThat(out.getNickles()).isEqualTo(0);
        assertThat(out.getPennies()).isEqualTo(4).as("0.04 - 0.01*4 = 0");
    
    }
}