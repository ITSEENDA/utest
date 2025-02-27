package src;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CreditRatingCalculatorTest {

    @Test
    void testExcellent() {
        assertEquals("Excellent", CreditRatingCalculator.calculateCreditRating(800, 6, 0));
    }

    @Test
    void testGood() {
        assertEquals("Good", CreditRatingCalculator.calculateCreditRating(720, 4, 1));
    }

    @Test
    void testFair() {
        assertEquals("Fair", CreditRatingCalculator.calculateCreditRating(660, 2, 2));
    }

    @Test
    void testPoor() {
        assertEquals("Poor", CreditRatingCalculator.calculateCreditRating(610, 0, 5));
    }

    @Test
    void testBad() {
        assertEquals("Bad", CreditRatingCalculator.calculateCreditRating(500, 2, 5));
    }

    @Test
    void testCreditScoreJustBelowExcellent() {
        assertEquals("Good", CreditRatingCalculator.calculateCreditRating(720, 5, 0));
    }

    @Test
    void testYearsWithCardJustBelowExcellent() {
        assertEquals("Good", CreditRatingCalculator.calculateCreditRating(800, 4, 0));
    }

    @Test
    void testLatePaymentsJustAboveExcellent() {
        assertEquals("Good", CreditRatingCalculator.calculateCreditRating(800, 6, 1));
    }

    @Test
    void testCreditScoreJustBelowGood() {
        assertEquals("Fair", CreditRatingCalculator.calculateCreditRating(660, 4, 1));
    }

    @Test
    void testYearsWithCardJustBelowGood() {
        assertEquals("Fair", CreditRatingCalculator.calculateCreditRating(720, 2, 1));
    }

    @Test
    void testLatePaymentsJustAboveGood() {
        assertEquals("Fair", CreditRatingCalculator.calculateCreditRating(720, 4, 2));
    }

    @Test
    void testLatePaymentsJustAboveGood1() {
        assertEquals("Poor", CreditRatingCalculator.calculateCreditRating(660, 1, 4));
    }


    @Test
    void testCreditScoreJustBelowFair() {
        assertEquals("Poor", CreditRatingCalculator.calculateCreditRating(610, 0, 5));
    }

    @Test
    void testYearsWithCardJustBelowFair() {
        assertEquals("Poor", CreditRatingCalculator.calculateCreditRating(660, 0, 5));
    }

    @Test
    void testLatePaymentsJustAboveFair() {
        assertEquals("Poor", CreditRatingCalculator.calculateCreditRating(660, 1, 5));
    }

    @Test
    void testCreditScoreJustBelowPoor() {
        assertEquals("Bad", CreditRatingCalculator.calculateCreditRating(500, 0, 4));
    }

    @Test
    void testLatePaymentsJustAbovePoor() {
        assertEquals("Bad", CreditRatingCalculator.calculateCreditRating(500, 0, 6));
    }

    @Test
    void testNegativeCreditScore() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreditRatingCalculator.calculateCreditRating(-1, 3, 0);
        });
        assertEquals("Dữ liệu không hợp lệ", exception.getMessage());
    }




    @Test
    void testNegativeLatePayments() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreditRatingCalculator.calculateCreditRating(720, 4, -2);
        });
        assertEquals("Dữ liệu không hợp lệ", exception.getMessage());
    }

    @Test
    void testCreditScoreOver850() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreditRatingCalculator.calculateCreditRating(900, 6, 0);
        });
        assertEquals("Dữ liệu không hợp lệ", exception.getMessage());
    }
    @Test
    void testCreditScoreOver8501() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreditRatingCalculator.calculateCreditRating(720, -1, 0);
        });
        assertEquals("Dữ liệu không hợp lệ", exception.getMessage());
    }

}
