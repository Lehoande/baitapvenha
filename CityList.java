import java.util.ArrayList;

public class CityList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("TP Ho Chi Minh");
        cities.add("Da Nang");
        cities.add("Hue");
        cities.add("Nha Trang");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
