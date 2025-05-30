package com.codeland;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PotionCalculatorTest {
    @BeforeAll // JUnit runs this once before any test method in this class.
    static void beforeAllTests() {
        System.out.println("\uD83E\uDDFF Stating PotionCalculator Tests...  ");
    }

    @BeforeEach
    void setUp() {
        System.out.println("\uD83D\uDD38 New Setup: Create a new object.");

    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("✔\uFE0FTest Passed: 📃 " + testInfo.getDisplayName());
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("✅  PotionCalculator ✨ Tests  Successfully Done ✨");
    }

    // -----------------------------------------------------
    // TESTS
    // -----------------------------------------------------

}