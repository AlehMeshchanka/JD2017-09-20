package by.it.meshchenko.jd01_06;

public class Runner06 {
    public static void main(String[] args){
        final String text = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо - песнь заводит,\n" +
                "Налево - сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" +
                "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,\n" +
                "И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" +
                "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" +
                "Пленяет грозного царя;\n" +
                "Там в облаках перед народом\n" +
                "Через леса, через моря\n" +
                "Колдун несёт богатыря;\n" +
                "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" +
                "Там ступа с Бабою Ягой\n" +
                "Идёт, бредёт сама собой,\n" +
                "Там царь Кащей над златом чахнет;\n" +
                "Там русский дух... там Русью пахнет!\n" +
                "И там я был, и мёд я пил;\n" +
                "У моря видел дуб зелёный;\n" +
                "Под ним сидел, и кот учёный\n" +
                "Свои мне сказки говорил.\n";

        // A.1
        // В каждом слове текста 4-ю и 7-ю буквы заменить символом #. Для слов короче 4
        // символов корректировку не выполнять. Для слов короче 7 символов заменять
        // только 4-ю букву.
        System.out.println("A.1");
        TaskA.replace47(text);
        // A.2
        // Определить, сколько раз повторяется в тексте каждое слово, которое
        // встречается в нем.
        System.out.println("A.2");
        TaskA.repeatWolds(text);
        // B.1
        // В стихотворении найти количество слов, начинающихся и заканчивающихся
        // гласной буквой (удобно сделать для этого отдельный метод).
        System.out.println("B.1");
        TaskB.firstEndVowel(text);
        // B.2
        // Вывести все предложения заданного текста в порядке возрастания количества
        // слов (!) в каждом из них. В предложениях нужно убрать переносы строк.
        System.out.println("B.2");
        TaskB.sentenceASC(text);
    }
}
