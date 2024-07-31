package steps;

import io.cucumber.java.*;

public class Hooks {
//    @Before("@staging")
//    public void setUp() {
//        System.out.println("\n@Before hook - Launching Browser");
//    }
//
//    @After("@staging")
//    public void tearDown() {
//        System.out.println("\n@After hook - Quitting Browser");
//    }

    @Before(order = 1)
    public void setUp() {
        System.out.println("\n@Before hook - Launching Browser");
    }

    @Before(order = 0)
    public void setUp1() {
        System.out.println("\n@Before hook - Launching Browser 1");
    }

    @After(order = 0)
    public void tearDown() {
        System.out.println("\n@After hook - Quitting Browser");
    }

    @After(order = 1)
    public void tearDown1() {
        System.out.println("\n@After hook - Quitting Browser 1");
    }

    @BeforeAll
    public static void before_all() {
        System.out.println("\n\n@BeforeAll - Create DB Conn");
    }

    @AfterAll
    public static void after_all() {
        System.out.println("\n\n@AfterAll - Close DB Conn");
    }

    @BeforeStep
    public void before_step() {
        System.out.println("@BeforeStep - Adding a log");
    }

    @AfterStep
    public void after_step() {
        System.out.println("@AfterStep - Deleting a log");
    }
}
