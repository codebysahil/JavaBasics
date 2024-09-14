// this is a way to create and reference a Hash Map object using Parent class reference variable ( Map in this case) 
// this program uses Lambda function for hash map traversal

package HashMapConcepts;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {

    public static void main(String[] args) {

        Map<String,Integer> empMap = new HashMap<String,Integer>(); // here Map is an interface
        empMap.put("Tom",101);
        empMap.put("Peter",102);
        empMap.put("Minti",103);
        empMap.put("Moller",104);
        empMap.put("Jalwa",105);

        empMap.forEach((k,v) -> System.out.println("key is :" + k + "  value is : "+ v));
    }
}
