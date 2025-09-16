package session.one.operators;

public class ArithmeticTest {
  public static void main(String[] args) {
    // var oneYearSeconds = 365 * 24 * 60 * 60;
    // var twoYearsSeconds = oneYearSeconds * 2;
    // var threeYearsSeconds = oneYearSeconds * 3;
    // var twoYearsSecondsDifference = twoYearsSeconds - oneYearSeconds;
    // var threeYearsSecondsDifference = threeYearsSeconds - oneYearSeconds;

    // System.out.println(oneYearSeconds);
    // System.out.println(twoYearsSeconds);
    // System.out.println(threeYearsSeconds);
    // System.out.println(twoYearsSecondsDifference);
    // System.out.println(threeYearsSecondsDifference);

    var formuleOneTop = Math.pow(6 * (3 + 2), 2); 
    var formuleOneTopBottom = 3 * 2;
    var formuleOneResult = formuleOneTop / formuleOneTopBottom;
     
    var formuleTwoTop = (1 - 5) * (2 - 7); 
    var formuleTwoTopBottom = 2;
    var formuleTwoResult = Math.pow(formuleTwoTop / formuleTwoTopBottom, 2);

    var formuleTop = Math.pow(formuleOneResult - formuleTwoResult, 3);
    var resultTop = formuleTop;
    var resultBottom =  Math.pow(10, 3);
    var result = resultTop / resultBottom;

    System.out.println(result);
 }
}
 