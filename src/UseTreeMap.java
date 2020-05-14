import java.util.TreeMap;
public class UseTreeMap {
    public static void main(String[] args) {
        String str = "Java is a programming language and computing platform first released by Sun Microsystems in 1995";
        TreeMap<String, Integer> myTreeMap = new TreeMap();

        String[] myString = str.split("\\s");

        for (int i = 0; i < myString.length; i++) {
            String myWord = String.valueOf(myString[i]).toUpperCase();
            if (myTreeMap.containsKey(myWord)) {
                myTreeMap.put(myWord, myTreeMap.get(myWord) + 1);
            } else {
                myTreeMap.put(myWord, 1);
            }
        }
        System.out.printf(String.valueOf(myTreeMap));
    }
}
