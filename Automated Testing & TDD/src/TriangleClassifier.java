public class TriangleClassifier {
    public static String classifierTriangle(double firstNumber, double secondNumber, double thirdNumber) {
        if (firstNumber > 0 && secondNumber > 0 && thirdNumber > 0) {
            if (firstNumber + secondNumber > thirdNumber && firstNumber + thirdNumber > secondNumber && secondNumber + thirdNumber > firstNumber) {
                if (firstNumber == secondNumber && firstNumber == thirdNumber) {
                    return "Tam giác đều";
                } else if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) {
                    return "Tam giác cân";
                } else {
                    return "Tam giác thường";
                }
            } else {
                return "Không phải tam giác";
            }
        } else {
            return "Không phải tam giác";
        }
    }
}
