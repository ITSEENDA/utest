package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomerLoyaltyTest {

    @Test
    void testVIPPlatinum() {
        assertEquals("VIP Platinum", CustomerLoyalty.classifyCustomer(15000, 120, 6));
    }

    @Test
    void testGoldMember() {
        assertEquals("Gold Member", CustomerLoyalty.classifyCustomer(6000, 60, 4));
    }

    @Test
    void testSilverMember() {
        assertEquals("Silver Member", CustomerLoyalty.classifyCustomer(2500, 25, 2));
    }

    @Test
    void testBronzeMember() {
        assertEquals("Bronze Member", CustomerLoyalty.classifyCustomer(1000, 10, 0));
    }

    @Test
    void testRegularCustomer() {
        assertEquals("Regular Customer", CustomerLoyalty.classifyCustomer(200, 2, 0));
    }

    @Test
    void testInvalidNegativeTotalSpent() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CustomerLoyalty.classifyCustomer(-1, 10, 2);
        });
        assertEquals("Dữ liệu không hợp lệ", exception.getMessage());
    }

    @Test
    void testInvalidNegativePurchaseCount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CustomerLoyalty.classifyCustomer(1000, -5, 2);
        });
        assertEquals("Dữ liệu không hợp lệ", exception.getMessage());
    }

    @Test
    void testInvalidNegativeLoyaltyYears() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CustomerLoyalty.classifyCustomer(1000, 10, -1);
        });
        assertEquals("Dữ liệu không hợp lệ", exception.getMessage());
    }

//    @Test
//    void testBorderlineNotVIP() {
//        assertEquals("Silver Member", CustomerLoyalty.classifyCustomer(4999, 99, 4));
//    }
//
//    @Test
//    void testBorderlineNotGold() {
//        assertEquals("Silver Member", CustomerLoyalty.classifyCustomer(4999, 49, 2));
//    }
//
//    @Test
//    void testBorderlineNotSilver() {
//        assertEquals("Bronze Member", CustomerLoyalty.classifyCustomer(1999, 19, 0));
//    }
//
//    @Test
//    void testBorderlineNotBronze() {
//        assertEquals("Regular Customer", CustomerLoyalty.classifyCustomer(499, 4, 0));
//    }
//
//    @Test
//    void testNotVIPBecauseTotalSpent() {
//        assertEquals("Silver Member", CustomerLoyalty.classifyCustomer(9000, 49, 6));
//    }
//    @Test
//    void testNotVIPBecauseTotalSpent2() {
//        assertEquals("Silver Member", CustomerLoyalty.classifyCustomer(9000, 50, 2));
//    }
//    @Test
//    void testNotVIPBecauseTotalSpent1() {
//        assertEquals("Silver Member", CustomerLoyalty.classifyCustomer(4999, 100, 2));
//    }
//
//    @Test
//    void testNotVIPBecausePurchaseCount() {
//        assertEquals("Gold Member", CustomerLoyalty.classifyCustomer(11000, 99, 4));
//    }
//
////    @Test
////    void testNotVIPBecauseLoyaltyYears() {
////        assertEquals("Gold Member", CustomerLoyalty.classifyCustomer(11000, 120, 4));
////    }
////
////    @Test
////    void testNotVIPBecauseTotalSpent3() {
////        assertEquals("Bronze Member", CustomerLoyalty.classifyCustomer(2000, 19, 6));
////    }
////    @Test
////    void testNotVIPBecauseTotalSpent4() {
////        assertEquals("Bronze Member", CustomerLoyalty.classifyCustomer(2000, 20, 0));
////    }
////    @Test
////    void testNotVIPBecauseTotalSpent5() {
////        assertEquals("Regular Customer", CustomerLoyalty.classifyCustomer(500, 2, 0));
////    }
}