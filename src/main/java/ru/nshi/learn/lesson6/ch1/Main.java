package ru.nshi.learn.lesson6.ch1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;



public class Main {

    public static final String MAIN_TEXT = "С другой стороны постоянный количественный рост и сфера нашей активности обеспечивает" +
        " широкому ростов кругу специалистов участие в формировании модели развития! Разнообразный и богатый опыт консультация" +
        " ростом профессионалами из IT требует определения и уточнения соответствующих условий активизации?" +
        " Разнообразный и богатый опыт постоянный количественный рост и сфера нашей активности способствует роста" +
        " повышению актуальности роста финансовых и административных условий!";
    //Regular expressions
    public static void main(String[] args) {
        Main m = new Main();
//        m.parseIntFromString();
//        m.testSimpleRegexp();
//        m.test1();
//        m.test2();
//        m.testLenientAndGreedy2();
//        m.testOr();
//        m.testIpAddress();
//        m.testSentence();
//        m.testViews();
        m.testFlags();
    }

    void parseIntFromString(){
        String text = "123";
        int integer = Integer.parseInt(text);
        double d = Double.parseDouble("123,2".replace(",", "."));
        System.out.println(integer + 1);
        System.out.println(d + 1);
    }

    void testSimpleRegexp(){
        String text = "в";
        System.out.println(text.matches("[абвг]"));
    }

    void test1(){
        String text = "123";
        Pattern p = Pattern.compile("[1-3][1-3][1-3]");
        Matcher m = p.matcher(text);
        boolean matches = m.matches();
        System.out.println(matches);
    }

    /** '\\s' - пробел
     '\\d' - число (0-9)
     '\\w' - буква, число или знак подчеркивания [a-zA-Z0-9_]
     '^' и '$' - начало строки и конец строки соотв.
     '\\S' - не пробел
     '.' - любой символ кроме \n
     '[^abc]' - любой символ, кроме a b c
     '*' - от 0 до бесконечности вхождений в строку
     '+' - от 1 до бесконечности вхождений в строку
     '?' - от 0 до 1 вхождений в строку
     '{n}' - n вхождений в строку
     '{n,}' - n и более вхождений в строку
     '{n,m}' - от n до m вхождений
     **/
    void test2(){
        String text = "unknown1235";
        Pattern p = Pattern.compile("\\w{5,7}\\d{3}");
        Matcher m = p.matcher(text);
        System.out.println(m.matches());
    }

    void testLenientAndGreedy(){
        Matcher m = Pattern.compile(".+?!").matcher(MAIN_TEXT);
        if (m.find()){
            System.out.println(m.group());
        }
    }

    void testLenientAndGreedy2(){
        Matcher m = Pattern.compile("(?<openTag>\\(b\\))(?<value>\\w+)(?<closeTag>\\(/b\\))").
            matcher("(b)Text1(/b)Text2(b)Text3(/b)");
        while (m.find()){
            for(int i = 1;i <= m.groupCount();i++){
                System.out.println("Группа " + i);
                System.out.println(m.group(i));
            }
        }
    }

    void testOr(){
        Matcher m = Pattern.compile("(рост)(ов|а|ы)?").
            matcher(MAIN_TEXT);
        while (m.find()){
            System.out.println(m.group());
            System.out.println("Начало слова " + m.start());
            System.out.println("Начало окончания слова " + m.start(2));
        }
    }

    void testIpAddress(){
        String ip = "192.168.0.1";
        Matcher m = compile("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
                            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)").matcher(ip);
        System.out.println(m.matches());
    }

    void testSentence(){
        String text = "Если индекс " +
            "не указан или равняется 0, то получим строку, полностью соответствующую шаблону.";
        Matcher m = compile(
            "^(" +
            "(?<start>[ЁА-Я][А-Яа-яЁё]*(,?\\s))" +
            "(?<middle>([А-Яа-яЁё\\d]+(,?\\s))*)" +
            "(?<end>[А-Яа-яЁё\\d]+\\.)" +
            ")$").matcher(text);
        if (m.find()){
            System.out.println(m.group("start"));
            System.out.println(m.group("middle"));
            System.out.println(m.group("end"));
            System.out.println(m.groupCount());
        }
    }

    //?= - положительный просмотр вперед
    //?<= - положительный просмотр назад
    //?! - отрицательный просмотр вперед
    //?<! - отрицательный просмотр назад
    void testViews(){
        String text = "Text1</b>Text2<b>Text3";
        Matcher m = compile("(?<=<\\w>|^)(\\w+?)(?=</\\w>|$)").matcher(text);
        while (m.find()){
            System.out.println(m.group());
        }
    }

    void testFlags(){
        String text = "Hi\nHello";
        Matcher m = compile(".+", Pattern.DOTALL).matcher(text);
        System.out.println(m.matches());
    }

    void testFlags2(){
        String text = "[а-я]+";
        Matcher m = compile("[а-я]+", Pattern.LITERAL).matcher(text);
        System.out.println(m.matches());
    }
}
