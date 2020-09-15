public class Decrypter {
    int nd1, nd2, nd3, nd4;

    public String Decrypt(String n) {
        nd1 = getNumberAtPosition(n, 0);

        nd2 = getNumberAtPosition(n, 1);

        nd3 = getNumberAtPosition(n, 2);

        nd4 = getNumberAtPosition(n, 3);


        nd1 = nd1 % 10;
        nd2 = nd2 % 10;
        nd3 = nd3 % 10;
        nd4 = nd4  % 10;

        return "" +nd1 +nd2 +nd3 +nd4;
    }
    public int getNumberAtPosition(String n, int index){
        String number= ""+n;
        char character = number.charAt(index);
        return Character.getNumericValue(character);
    }

}
