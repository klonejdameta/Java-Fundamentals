package StringsExp;

public class ContainsString {

        public static boolean containsStr(String txt1, String txt2){
            String s1 = txt1;
            Boolean result = s1.contains(txt2);
                return result;
        }
    public static void main(String[] args) {
        System.out.println(containsStr("The Witcher","Witcher"));
    }
}
