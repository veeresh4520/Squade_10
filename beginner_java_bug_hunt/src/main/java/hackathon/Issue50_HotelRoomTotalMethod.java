public class Issue50_HotelRoomTotalMethod {
    public static void main(String[] args) {
        int unitFee = 30;
        int quantity = 9;
        int discountPercent = 30;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
