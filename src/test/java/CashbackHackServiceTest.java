import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturnCorrectAmount_1 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnCorrectAmount_2 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnCorrectAmount_3 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnCorrectAmount_4 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnCorrectAmount_5 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }
}
