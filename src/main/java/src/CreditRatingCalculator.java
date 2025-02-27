package src;

import java.util.logging.Logger;

public class CreditRatingCalculator {
    private static final Logger logger = Logger.getLogger(CreditRatingCalculator.class.getName());

    public static String calculateCreditRating(int creditScore, int yearsWithCard, int latePayments) {

        if (creditScore < 0 || creditScore > 850 || yearsWithCard < 0 || latePayments < 0) {
            logger.warning("Invalid input detected. Throwing exception.");
            throw new IllegalArgumentException("Dữ liệu không hợp lệ");
        }

        if (creditScore >= 750 && yearsWithCard >= 5 && latePayments == 0) {
            logger.info("Customer classified as: Excellent");
            return "Excellent";
        }
        if ((creditScore >= 700) && (yearsWithCard >= 3) && (latePayments <= 1)) {
            logger.info("Customer classified as: Good");
            return "Good";
        }
        if ((creditScore >= 650) && (yearsWithCard >= 1) && (latePayments <= 3)) {
            logger.info("Customer classified as: Fair");
            return "Fair";
        }
        if ((creditScore >= 600) && (latePayments <= 5)) {
            logger.info("Customer classified as: Poor");
            return "Poor";
        }

        logger.info("Customer classified as: Bad");
        return "Bad";
    }
}
