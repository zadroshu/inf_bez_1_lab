public class SubstitutionCrypt {
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static int shift;

    public String crypt(String text) {
        shift = 3;
        String rez = "";
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                int i = alphabet.indexOf(c);
                i = (i + shift + alphabet.length()) % alphabet.length();
                rez = rez + alphabet.charAt(i);
                shift=alphabet.charAt(i)-'a';
            } else
                rez = rez + " ";
        }
        return rez;
    }


    public String decrypt(String text) {
        shift =3;
        String rez = "";
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                int i = alphabet.indexOf(c);
                i = (i -shift + alphabet.length()) % alphabet.length();
                rez = rez + alphabet.charAt(i);
                shift=c-'a';
            } else
                rez = rez + " ";
        }
        return rez;
    }
}
