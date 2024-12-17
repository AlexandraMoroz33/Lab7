import work7.*;

public class Main {
    public static void main(String[] args) {
        String expression = "5 10 * 25 /";
        Expression parsedExpression = ExpressionParser.parseExpression(expression);
        System.out.println(parsedExpression.interpret());
    }
}