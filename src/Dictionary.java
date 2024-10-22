import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    //Word[] words;
   private List<Word> words = new ArrayList<>();
  private int size;

    public Dictionary() {
    }

    // public Dictionary() {
   /*     words = new Word[5];
    }
*/
    public Dictionary(Word []words) {
        this.size = size;
        for (int i = 0; i < words.length; i++) {
            this.words.add(words[i]);
        }
    }

   public void addWords(Word word) {
       words.add(word);
    }



    public String translation(String value) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getValue().equalsIgnoreCase(value)) {
                return words.get(i).getTranslation();
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getTranslation().equalsIgnoreCase(translation)) {
                return words.get(i).getValue();
            }
        }
        return "";
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < words.size(); i++) {
            result += words.get(i) + System.lineSeparator();  // \n
        }
        return result;
    }
//wukae kartku jaky nam treba zminutu
    public Word find(String value) {
        for (int i = 0; i < size; i++) {
            if (words.get(i).getValue().equalsIgnoreCase(value)) {
                return words.get(i);
            }

        }
        return null;
    }
    //znaxodut' kartky ta zminuem
    public Word changeWordCard(String value, String newDescription, String newExample){
       Word word = find(value);
       if (word!=null){
           //zminutu zna4ennja
           word.setDescription(newDescription);
           word.setExample(newExample);
       }
       return word;
    }
    public Word changeDesription(String value, String newDescription){
      return changeWordCard(value, newDescription, "");
    }
    public Word changeExample(String value, String newExample){
      return changeWordCard(value,"", newExample);
    }
}





