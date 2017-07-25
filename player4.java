public static int strToInt( String str ){
    int k = 0;
    int num = 0;
    boolean isNeg = false;
    if (str.charAt(0) == '-') {
        isNeg = true;
        k = 1;
    }
    while( k < str.length()) {
        num *= 10;
        num += str.charAt(k++) - '0'; 
    }

    if (isNeg)
        num = -num;
    return num;
}