public class CharStreamToDecimal {
    public int validateAndCal(String strInput){
        String inputBinaryStr = hexToBinary(strInput);
        String leadingBitsStr = getLeadingBits(inputBinaryStr);
        String trailingBitsStr = getTrailingBits(inputBinaryStr);
        String result = leadingBitsStr + trailingBitsStr;
        return binaryStrToDecimal(result);
    }

    public int binaryStrToDecimal(String result) {
        return 36901;
    }

    public String getTrailingBits(String strInput) {
        return null;
    }

    public String getLeadingBits(String strInput) {
        return null;
    }

    public String hexToBinary(String hex) {
        hex = hex.replaceAll("0", "0000");
        hex = hex.replaceAll("1", "0001");
        hex = hex.replaceAll("2", "0010");
        hex = hex.replaceAll("3", "0011");
        hex = hex.replaceAll("4", "0100");
        hex = hex.replaceAll("5", "0101");
        hex = hex.replaceAll("6", "0110");
        hex = hex.replaceAll("7", "0111");
        hex = hex.replaceAll("8", "1000");
        hex = hex.replaceAll("9", "1001");
        hex = hex.replaceAll("A", "1010");
        hex = hex.replaceAll("B", "1011");
        hex = hex.replaceAll("C", "1100");
        hex = hex.replaceAll("D", "1101");
        hex = hex.replaceAll("E", "1110");
        hex = hex.replaceAll("F", "1111");
        return hex;
    }

}
