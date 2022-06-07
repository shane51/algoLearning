import java.util.Locale;

public class CharStreamToDecimal {
        final String INVALID = "";
    public int validateAndCal(String strInput){
        String inputBinaryStr = hexToBinary(strInput.toUpperCase(Locale.ROOT));
        String leadingBitsStr = getLeadingBits(inputBinaryStr);
        String trailingBitsStr = getTrailingBits(inputBinaryStr);
        if(leadingBitsStr.isEmpty() || trailingBitsStr.isEmpty()){
            return -1;
        }
        String result = leadingBitsStr + trailingBitsStr;
        return binaryStrToDecimal(result);
    }

    public int binaryStrToDecimal(String result) {
        return Integer.parseInt(result,2);
    }

    public String getTrailingBits(String binaryStr) {
        StringBuilder trailingBits = new StringBuilder();
        for(int i = 8; i < binaryStr.length(); i = i+8){
            if(!binaryStr.startsWith("10", i)){
                return INVALID;
            }
            trailingBits.append(binaryStr, i + 2, i + 8);
        }
        return trailingBits.toString();
    }

    public String getLeadingBits(String binaryStr) {
        switch(binaryStr.length()/8){
            case 1:
                return  getLeadingBitsByPrefix(binaryStr, "0", 1);

            case 2:
                return getLeadingBitsByPrefix(binaryStr, "110", 3);

            case 3:
                return getLeadingBitsByPrefix(binaryStr, "1110", 4);

            case 4:
                return getLeadingBitsByPrefix(binaryStr, "11110", 5);

            case 5:
                return getLeadingBitsByPrefix(binaryStr, "111110", 6);

            case 6:
                return getLeadingBitsByPrefix(binaryStr, "1111110", 7);

            default:
                return INVALID;
        }
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

    private String getLeadingBitsByPrefix(String binaryStr, String prefix, int cutIndex) {
        if (!binaryStr.startsWith(prefix)) {
            return INVALID;
        }
        return binaryStr.substring(cutIndex, 8);
    }

}
