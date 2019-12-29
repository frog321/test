import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Test1 {


    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("tearDownAfterClass");
    }

    ///////////////////////////////////////////////////////////

    @Test

    public void test1() {
        ABC tester = new ABC(); // MyClass is tested
        List<Integer> l = new ArrayList<>();
        l.add(1);
        System.out.println(l.size());

        if (l.size() == 1) {
            System.out.println("L is null");
        }

    }

    @Test
    public void test2() {

        assertTrue(true);
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

}
