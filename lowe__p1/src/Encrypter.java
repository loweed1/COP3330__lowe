public class Encrypter {
    int nd1, nd2, nd3, nd4;

    public String Encrypt(final String n) {
        int value = getNumberAtPosition(n, 0);

        System.out.println(value);
        nd1 = (value + 7) % 10;


        value = getNumberAtPosition(n, 1);

        System.out.println(value);
        nd2 = (value + 7) % 10;


        value = getNumberAtPosition(n, 2);

        System.out.println(value);
        nd3 = (value + 7) % 10;

        value = getNumberAtPosition(n, 3);

        System.out.println(value);

        nd4 = (value + 7) % 10;

        return ""+nd3 +nd4 +nd1 +nd2;

    }
    public int getNumberAtPosition(String n, int index){
        String number= ""+n;
        char character = number.charAt(index);
        return Character.getNumericValue(character);
    }
}
