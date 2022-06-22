public class methods {
    public static void leapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void installTheApp(int clientDeviceYear, int clientOS) {

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите обдегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
    }

    public static int deliverySpeed(int distance2) {
        int deliverySpeed = 1;
        for (int distance1 = 20; distance1 < distance2; deliverySpeed++) {
            distance1 = distance1 + 40;
        }
        System.out.println("потребуется дней: " + deliverySpeed);
        return deliverySpeed;
    }
    public static void searchForDuplicates(String Evangeline) {
        for (int i = 0; i < Evangeline.length() - 1; i++) {
            if (Evangeline.charAt(i) == Evangeline.charAt(i + 1)) {
                System.out.println("обнаружен дубль: " + Evangeline.charAt(i) + " !");
                return;
            }
        }
    }
    public static void reverseText() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int x = reverseFullName.length;
        while (x <= reverseFullName.length && x > 0) {
            x = x - 1;
            System.out.print(reverseFullName[x]);
        }
    }
    public static void removeDuplicates(String Evangeline) {
        String result = new StringBuilder(Evangeline).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
            }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void averageAmount() {
        int[] arr = generateRandomArray();
        float sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("«Средняя сумма трат за месяц составила " + sum + " рублей.");
    }
        public static void main (String[]args){
            int year = 2010;
            leapYear(year);
            int clientDeviceYear = year;
            int clientOS = 1;
            installTheApp(clientDeviceYear, clientOS);
            System.out.println(deliverySpeed(90));
            String Evangeline = "abccddefgghiijjkk";
            searchForDuplicates(Evangeline);
            reverseText();
            System.out.println();
            removeDuplicates(Evangeline);
            averageAmount();
        }
    }