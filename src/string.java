void main() {
    String text = "   На полу пятно    ";


    String replaced = text.replace("Пятно", "Лужа").trim();
    System.out.println(text);
    System.out.println("С заменой без пробелов: " + replaced);

    String data = "банан,апельсин,груша";
    String[] fruits = data.split(",");
    System.out.println("Разбиение:");
    for (String fruit : fruits) {
        System.out.println(fruit);
    }

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "Bye";
    String str4 = "hello";
    System.out.println("1 и 2 совпали:" + (str1 == str2));
    System.out.println("1 и 3 совпали:" + (str1 == str3));

    System.out.println("1 и 4 совпали): " + str1.equals(str4));

    System.out.println("1 и 4 совпали): " + str1.equalsIgnoreCase(str4)); // true
}