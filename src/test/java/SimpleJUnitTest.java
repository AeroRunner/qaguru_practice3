import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {
    int result;
    @BeforeEach
    void beforeeach(){
        result = getResult();
    }
@Test

void firsttest() {
    System.out.println("###        first test");
    Assertions.assertTrue(3>2);

}
    void twotest() {
        System.out.println("###        two test");
        Assertions.assertTrue(3>1);

    }
    void freesttest() {
        System.out.println("###        free test");
        Assertions.assertTrue(3>1);

    }
}
