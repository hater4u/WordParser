//import java.util.Map;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

public class Parser {
    private Comparator parserComparator= new ParserComparator();

    private TreeMap <String, Integer> myMap = new TreeMap<String, Integer>();
    private ArrayList<Map.Entry<String, Integer>> arrayList = new ArrayList<Map.Entry<String, Integer>>();
    private String text;

    Parser(String text) {
        this.text = text;
    }

    public /*ArrayList<Map.Entry<String, Integer>>*/ void parse(OutputStreamWriter writer) {
        String[] words = text.split("[^0-9a-zA-Z]+");
        Integer tmp = 0;
        for (String it: words) {
            if (myMap.get(it) == null) myMap.put(it, 1);
            else myMap.put(it, myMap.get(it) + 1);

        }
        for (Map.Entry<String, Integer> it: myMap.entrySet()) {
            arrayList.add(it);
        }
        Collections.sort(arrayList, parserComparator);
        //return arrayList;
    }

}

