import java.util.ArrayList;

public class KeywordList {
    public static void main(String[] args) {        
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");      
        if (keywords.contains("Python")) {
            System.out.println("\"Python\" co trong danh sach.");
        } else {
            System.out.println("\"Python\" khong co trong danh sach.");
        }
    }
}
