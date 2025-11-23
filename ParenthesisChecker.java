//
//  Rayan
//  11/22/2025
//  Basic check for adjacent bracket matching.
//

public class ParenthesisChecker {

    //
    //  Pre condition String s contains only (, ), {, }, [, ]
    //  Post condition Returns true only if each pair is correct.
    //
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) { //because if it's odd you can never have a pair
            return false;
        }

        for (int i = 1; i < s.length(); i += 2) {
            String first = s.substring(i - 1, i);
            String second = s.substring(i, i + 1);

            if (first.equals("(") && !second.equals(")")) return false;
            if (first.equals("{") && !second.equals("}")) return false;
            if (first.equals("[") && !second.equals("]")) return false;
            if (!first.equals("(") && !first.equals("{") && !first.equals("[")) return false; //to make sure all strings meet prereq
        }

        return true;
    }

    //
    //  Pre-condition: Program runs normally.
    //  Post-condition: Outputs true or false for test cases.
    //
    public static void main(String[] args) {
        System.out.println(isValid("()")); //test
    }
}
