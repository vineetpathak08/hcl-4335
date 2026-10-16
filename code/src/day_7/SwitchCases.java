package day_7;

public class SwitchCases {
    public static void main() {

            int dayNumber = 3;
            String dayName;
            switch (dayNumber) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                default:
                    dayName = "Weekend";
                    break;
            }

            System.out.println("Today is: " + dayName);
        dayNumber = dayNumber + 3;
        String dayName2 = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };

        System.out.println("Today is: " + dayName2);

    }
}
