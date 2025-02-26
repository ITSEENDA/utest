package src;

public class CustomerLoyalty {
    public static String classifyCustomer(double totalSpent, int purchaseCount, int loyaltyYears) {
        if (totalSpent < 0 || purchaseCount < 0 || loyaltyYears < 0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ");
        }

        if (totalSpent >= 10000 && purchaseCount >= 100 && loyaltyYears >= 5) {
            return "VIP Platinum";
        }
        if (totalSpent >= 5000 && purchaseCount >= 50 && loyaltyYears >= 3) {
            return "Gold Member";
        }
        if (totalSpent >= 2000 && purchaseCount >= 20 && loyaltyYears >= 1) {
            return "Silver Member";
        }
        if (totalSpent >= 500 && purchaseCount >= 5) {
            return "Bronze Member";
        }
        return "Regular Customer";
    }
}