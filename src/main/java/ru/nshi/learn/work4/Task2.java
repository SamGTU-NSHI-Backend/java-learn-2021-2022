package ru.nshi.learn.work4;

public class Task2 {
    public static void main (String[] args) {
        Task2 task2 = new Task2();
        String string = "ФSва12ЕE_3Q";
        String filtered_string = task2.filterUpper(string);
        System.out.println(filtered_string);
    }
    public String filterUpper(String string) {
        String filtered_string = 
            string
            .chars()
            .mapToObj(c -> (char) c)
            .filter(chr -> Character.isUpperCase(chr))
            .map(c -> c.toString())
            .reduce("", (String str1, String str2) -> str1 + str2);

        return filtered_string;
    }
}
