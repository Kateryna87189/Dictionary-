import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    //Word[] words;
    private List<Word> words = new ArrayList<>();


    public Dictionary(Word[] words) {
        //this.words = words;
        for (int i =0; i<words.length; i++){
            this.words.add(words[i]);
        }
    }

    public String translation(String value){
        for (int i = 0; i<words.size(); i++){
            if (words.get(i).value.equalsIgnoreCase(value)){
                return words.get(i).translation;
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation){
        for (int i = 0; i<words.size(); i++){
            if (words.get(i).translation.equalsIgnoreCase(translation)){
                return words.get(i).value;
            }
        }
        return "";
    }

    public String toString(){
        String result="";
        for (int i = 0; i < words.size(); i++) {
            result+= words.get(i)+ System.lineSeparator();  // \n
        }
        return result;
    }

}
