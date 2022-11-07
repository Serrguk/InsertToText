public class Main {
    public static void main(String[] args) {
        //Нужен вывод в формате: (1) Это (2) просто (3) текст, (4) для (5) примера (6) работы (7) программы
        String text = "Это просто текст, для примера работы программы, а не какая-то хуита";
        System.out.println(sequentialWordsNumbers(text));
    }
    //charAt(int index) - возвращает символ по указанному индексу
    //indexOf(char symbol) - возвращает индекс по указанному символу
    public static String sequentialWordsNumbers(String text) {
        String endText = text;
        int indexOfSpace;
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < endText.length(); i++) {
            char symbol = endText.charAt(i);
            if (symbol == ' ') {
                indexOfSpace = endText.indexOf(symbol);
                builder.append(" (").append(count).append(") ").append(endText, 0, indexOfSpace);
                endText = endText.substring(indexOfSpace).trim();
                count++;
                i = 0;
            }
        }
        builder.append(" (").append(count).append(") ").append(endText);
        return String.valueOf(builder).trim();
    }
}
