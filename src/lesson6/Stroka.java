package lesson6;

public class Stroka {
    public static void main(String[] args) {
        String s = "Предложение  один     Теперь предложение    два   Предложение   три    Предложение 4";
        String s1 = s.replaceAll(" +", " ");
        StringBuilder s2 = new StringBuilder(s1);

        for (int i = 1; i < s1.length(); i++) {



            if(s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {
                s2.setCharAt(i-1, '.');

            }

        }

        for (int i = 1; i < s1.length(); i++) {

            if(s2.charAt(i) == '.') {
                s2.insert(i+1,' ');;

            }

        }

        if (s2.charAt(s2.length()-1) != '.') {
            System.out.println(s2.toString() + ".");
        }
        else
            System.out.println(s2.toString());
    }
}
