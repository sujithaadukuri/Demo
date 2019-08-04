import org.testng.annotations.*;

public class S {
    @Test
    public void testcase1(){
        System.out.println("this is testcase1");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("execute before suite");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("execute before test");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("execute beforeclass");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("execute beforemethod");
    }
    /*@AfterSuite
    public void aftersuite(){
        System.out.println("execute aftersuite");
    }*/
    @AfterTest
    public void aftertest(){
        System.out.println("exceute after test");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("execute afterclass");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("execute aftermethod");
    }
}
