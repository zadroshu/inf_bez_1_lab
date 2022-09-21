public class Main {
    public static void main(String[] args) {
//        CezarCrypt crypt = new CezarCrypt();
//        System.out.println(crypt.getCrypt("sdfsdf    dsafsadf"));
//        System.out.println(crypt.getDeCrypt("fsdfsd    sfsdfssd"));

        SubstitutionCrypt substitutionCrypt = new SubstitutionCrypt();
        String text = substitutionCrypt.crypt("encrypted text");
        System.out.println(text);
        System.out.println(substitutionCrypt.decrypt(text));
    }
}
