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
    @Test
    @DisplayName("Test - Full Potions Made")
    public void TestFullPotionsMade(){
        assertEquals(2, PotionCalculator.fullPotionsMade(14));
        assertEquals(4, PotionCalculator.fullPotionsMade(28));
    }
    @Test
    @DisplayName("Test - Leftover Units")
    public void TestLeftoverUnits(){
        assertEquals(1, PotionCalculator.leftOverUnits(15));
        assertEquals(2, PotionCalculator.leftOverUnits(30));
    }
    @Test
    @DisplayName("Test - Total Cost of Ingredients")
    public void TestTotalCostOfIngredients(){
        assertEquals(24.95, PotionCalculator.totalCostOfIngredients(5), 0.0001);
        assertEquals(49.90, PotionCalculator.totalCostOfIngredients(10), 0.0001);
    }

}