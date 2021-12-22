public class FizzBuzz {
    public static String displayFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return ("" + number);
//        int donVi = number - Math.round(number) / 10 * 10;
//        int hangChuc = Math.round(number) / 10;
//        return " " + readNumber(hangChuc) + " " + readNumber(donVi);
    }

//    private static String readNumber(int number) {
//        switch (number) {
//            case 1:
//                return "Một";
//                break;
//            case 2:
//                return "Hai";
//                break;
//            case 3:
//                return "Ba";
//                break;
//            case 4:
//                return "Bốn";
//                break;
//            case 5:
//                return "Năm";
//                break;
//            case 6:
//                return "Sáu";
//                break;
//            case 7:
//                return "Bảy";
//                break;
//            case 8:
//                return "Tám";
//                break;
//            case 9:
//                return "Chín";
//                break;
//            default:
//                return "out of range";
//        }
//    }
}
