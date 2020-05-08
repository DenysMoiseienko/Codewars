package SmallerNumberWithSameTheDigits;

public class Kata {

    public static long nextSmaller(long n) {

        String text = Long.toString(n);
        int index = - 1;
        long result;

        for (int i = text.length() - 1; i > 0; i--){
            if(text.charAt(i) < text.charAt(i - 1)){
                index = i - 1;
                break;
            }
        }
        if (index == -1) return index;

        String rightPart = text.substring(0, index);
        String leftPart = text.substring(index).chars().sorted().
                collect(StringBuilder :: new, StringBuilder::appendCodePoint,
                        StringBuilder :: append).toString();

        result = Long.parseLong(rightPart + leftPart);

        if (result == n) return -1;

        return result;
    }
}
