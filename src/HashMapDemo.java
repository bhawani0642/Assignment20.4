import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemo {
public static void main(String[] args) {
  /*
   * Creating a HashMap Object and insert some key value pairs in it
   */
  HashMap < String, String > m = new HashMap < String, String > ();
  m.put("Marty", "Stepp");
  m.put("Stuart", "Reges");
  m.put("Jessica", "Miller");
  m.put("Amanda", "Camp");
  m.put("Hal", "Perkins");
  //Synchronizing the HashMap Explicitly
  Map map = Collections.synchronizedMap(m);
  synchronized(m) {
   Set < String > kys = m.keySet();
   //Displaying the Keys 
   System.out.println("\nDisplaying the keys :");
   for (String key: kys) {
    System.out.println(key);
   }
   Set st = m.entrySet();
   //Creating an Iterator Object
   Iterator itr = st.iterator();
   //Displaying the values
   System.out.println("Displaying the values :");
   while (itr.hasNext()) {
    Map.Entry mp = (Map.Entry) itr.next();
    System.out.println(mp.getValue());
   }
  }
}
}