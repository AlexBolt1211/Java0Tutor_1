package by.traning.tutor.strings;

public class StringsRun {

    public static void main(String[] args) {

        String[] arr = new String[]{"firstName", "secondName"};

        StringBuffer result = new StringBuffer();
        for (String str : arr) {
            char[] chars = str.toCharArray();
            for (char ch : chars) {
                if (Character.isUpperCase(ch)) {

                    result.append("_").append(Character.toLowerCase(ch));

                } else {

                    result.append(ch);
                }
            }
            result.append("\n");
        }

        System.out.println(result);

    }
}
