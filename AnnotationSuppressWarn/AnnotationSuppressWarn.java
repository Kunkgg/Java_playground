import java.util.*;

class AnnotationSuppressWarn{
    @SuppressWarnings("unchecked") // <.>
    static void wordList(){
        // ArrayList<String> wordList = new ArrayList<>(); // <.>
        ArrayList wordList = new ArrayList<>(); // <.>
        wordList.add("cat");
        wordList.add("dog");

        System.out.println("Word list => " + wordList);
    }
    public static void main(String[] args){
        wordList();
    }
}
