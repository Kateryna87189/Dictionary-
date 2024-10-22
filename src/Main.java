
/*
в проекте про словарь добавить возможность добавления словарной карточки в словарь,
т.е. в классе Dictionary реализовать "рост" массива

Совет: сначала как на уроке реализуйте создание Dictionary с "пустым" массивом,
и научите класс делать addWord последовательно заполняя массив.
 */


//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addWords(new Word("shop","магазин"));
        dictionary.addWords(new Word("phone","телефон","'[f:one]'"));

        System.out.println(dictionary);

        Word[] words = {
                new Word("dog", "собака"),
                new Word("cat", "кот"),
                new Word("book", "книга"),
                new Word("table", "стол", "'opus'"),
                new Word("school", "школа", "'opus'", "'pruklad'")

        };
        Dictionary dictionary2= new Dictionary(words);
        dictionary2.addWords(new Word("world","слово"));
        System.out.println(dictionary2);

        dictionary2.changeWordCard("dog","description for dog "," dog eat sosidg");
        System.out.println(dictionary2);

        dictionary2.changeDesription("dog","description for dog");
        System.out.println(dictionary2);

      /*  //peredat' zna4enie null
        Word word = new Word("gwe","gytr");
        word.setExample("hhhff");*/

       /* Scanner scanner = new Scanner(System.in);
        Word[] words = {
                new Word("dog", "собака"),
                new Word("cat", "кот"),
                new Word("book", "книга"),
                new Word("table", "стол"),
                new Word("school", "школа"),
                new Word("chair", "стул"),
                new Word("bad", "кровать"),
                new Word("blanket", "одеяло"),
                new Word("wardrobe", "шкаф"),
                new Word("toe", "носок"),
                new Word("programmer", "программист"),
                new Word("computer", "компьютер"),
                new Word("notebook", "тетрадь"),
                new Word("pan", "ручка"),
                new Word("cap", "шапка"),
                new Word("fur coat", "шуба"),
                new Word("winter", "зима"),
                new Word("summer", "лето"),
                new Word("garden", "сад"),
                new Word("carpet", "ковер")
        };
        Dictionary dictionary = new Dictionary(words);
        System.out.println(words);



        int mode=1;

        while (true) {
            System.out.println("Выберите режим работы:\n '1'. прямой \n '2'. обратный \n '3'. все слова \n '0'. завершить программу");
            mode = scanner.nextInt();
            scanner.nextLine(); //очистить поток ввода
            if (mode==0) break;
            String word="";
            if (mode==1){
                System.out.println("Введите слово:");
                word = scanner.nextLine();
                System.out.println("Перевод:" + dictionary.translation(word));
            } else if (mode==2){
                System.out.println("Введите перевод:");
                word = scanner.nextLine();
                System.out.println("Слово:" + dictionary.getWordByTranslation(word));
            } else if(mode==3){
                System.out.println("Текущий словарь:");
                System.out.println(dictionary);
            }
            System.out.println("-----------------------------------------------------------");
        }*/
    }
}