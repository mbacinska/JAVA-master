import java.util.HashMap;
import java.util.Map;

public class MapExcersise {

  public static void main(String[] args) {

    Map<String, Integer> hm = new HashMap<String, Integer>();

    System.out.println("Size: " + hm.size());
    System.out.println("Is HM empty: " + hm.isEmpty());

    hm.put("a", 100);
    hm.put("b", 200);
    hm.put("c", 300);
    hm.put("d", 400);

    System.out.println("Size after put: " + hm.size());
    System.out.println("Is HM empty after put: " + hm.isEmpty());

    for (Map.Entry<String, Integer> me : hm.entrySet()) {

      System.out.println(" Key: Value " + me.getKey() + " --> " + me.getValue());
    }

    
  }
}
