void main() {

        int a = 10, b = 20, c = 15;

        if (a > b && a > c) {
            System.out.println("a наибольшее");
        } else if (b > a && b > c) {
            System.out.println("b наибольшее");
        } else {
            System.out.println("c наибольшее");
        }

        if (a > 5 || b < 25) {
            System.out.println("Как надо");
        } else if (a == 10 && c > 10) {
            System.out.println("По другому");
        } else {
            System.out.println("Не как надо");
        }

        if ((a > 5 && b < 30) || (c > 10 && a < 15)) {
            System.out.println("Выполнено");
        } else if ((a == 10 || b == 20) && c == 15) {
            System.out.println("Выполнено по другому");
        } else {
            System.out.println("Не выполнено");
        }

    int day = 3;

    switch (day) {
        case 1:
            System.out.println("Понедельник");
            break;
        case 2:
            System.out.println("Вторник");
            break;
        case 3:
            System.out.println("Среда");
            break;
        case 4:
            System.out.println("Четверг");
            break;
        case 5:
            System.out.println("Пятница");
            break;
        case 6:
            System.out.println("Суббота");
            break;
        case 7:
            System.out.println("Воскресенье");
            break;
        default:
            System.out.println("Мимо");
    }

            int number = 15;
            String result = (number > 10) ? "Больше 10" : "Не 10";
            System.out.println(result);
}
