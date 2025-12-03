public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("Amerikan Formatı");
        System.out.println( day + "," + date + "," + month + "," + year + ",");
        // TODO
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("Avrupa Formatı");
        System.out.println(date + "," +  month + "," + year + "," + day);
        // TODO
    }

    public static void main(String[] args) {
        String day = "Monday";
        String month = "July";
        int date = 20;
        int year = 2020;
        printAmerican(day,date,month,year);
        printEuropean(date,month,year,day);
        // TODO: test methods
    }
}
