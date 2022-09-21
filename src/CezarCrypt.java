public class CezarCrypt {
    int shift = 2;

    public String crypt(String str, int s) {
        String rez = "";
        for (char symbol : str.toCharArray()) {
            if(symbol != ' '){
                int i = str.indexOf(symbol);
                i = (i + s * shift + str.length()) % str.length();
                rez = rez + str.charAt(i);
            }
            else {
                rez += ' ';
            }
        }
        return rez;
    }

    public String getCrypt(String text) {
        return crypt(text, 1);
    }
    public String getDeCrypt(String text) {
        return crypt(text, -1);
    }
}
