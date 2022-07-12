import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CoinCountsTest {

    @Test
    void createCoinCountsWithArray(){
        int[] array = {1,2,3,4,5 };
        CoinCounts cc = new CoinCounts(array);
        assertThat(cc.getHalfDollars()).isEqualTo(1);
        assertThat(cc.getQuarters()).isEqualTo(2);
        assertThat(cc.getDimes()).isEqualTo(3);
        assertThat(cc.getNickles()).isEqualTo(4);
        assertThat(cc.getPennies()).isEqualTo(5);
    }

    @Test
    void incrementingAndDecrmenting(){
        CoinCounts cc = new CoinCounts();
        cc.pennies +=1;
        cc.dimes +=10;
        cc.halfDollars +=2;
        cc.halfDollars -=1;
        
        assertThat(cc.pennies).isEqualTo(1);
        assertThat(cc.dimes).isEqualTo(10);
        assertThat(cc.halfDollars).isEqualTo(1);
    }

    
}
