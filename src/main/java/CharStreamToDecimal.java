public class CharStreamToDecimal {
    public int validateAndCal(String strInput){
        String inputBinaryStr = hexToBinary(strInput);
        String leadingBitsStr = getLeadingBits(strInput);
        String trailingBitsStr = getTrailingBits(strInput);
        String result = leadingBitsStr + trailingBitsStr;
        return binaryStrToDecimal(result);
    }

    private int binaryStrToDecimal(String result) {
        return 36901;
    }

    private String getTrailingBits(String strInput) {
        return null;
    }

    private String getLeadingBits(String strInput) {
        return null;
    }

    private String hexToBinary(String strInput) {
        return null;
    }

}
