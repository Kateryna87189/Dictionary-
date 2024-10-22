public class Dictionary {
    Word[] words;
    private int size = 0;

    public Dictionary() {
        words = new Word[5];
    }

    public Dictionary(Word[] words) {
        this.words = words;
        size = words.length;
    }

    public void addWords(Word word) {
        //збільшуєм масів
        if (size >= words.length) {
            enlargeWords();
        }
        words[size] = word;
        size++;
    }

    private void enlargeWords() {
        Word[] newWords = new Word[words.length * 2];

        for (int i = 0; i < words.length; i++) {
            newWords[i] = words[i];
        }
        words = newWords;
    }


    public String translation(String value) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].getValue().equalsIgnoreCase(value)) {
                return words[i].getTranslation();
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].getTranslation().equalsIgnoreCase(translation)) {
                return words[i].getValue();
            }
        }
        return "";
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i] + System.lineSeparator();  // \n
        }
        return result;
    }
//wukae kartku jaky nam treba zminutu
    public Word find(String value) {
        for (int i = 0; i < size; i++) {
            if (words[i].getValue().equalsIgnoreCase(value)) {
                return words[i];
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





