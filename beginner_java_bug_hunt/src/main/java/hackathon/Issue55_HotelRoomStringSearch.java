public class Issue55_HotelRoomStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A10", "B10", "C10"};
        String target = new String("B10");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
