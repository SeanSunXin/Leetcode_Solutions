public int RomantoInt(string s){
    int[] numbers = new int[s.length()];
    for(int i=0;i<s.length();i++){
        switch(s.charAt(i){
            case 'M':
            numbers[i]=1000;
            break;
            case 'D':
            numbers[i]=500;
            break;
            case 'C':
            numbers[i]=100;
            break;
            case 'L':
            numbers[i]=50;
            break;
            case 'X':
            numbers[i]=10;
            break;
            case 'V':
            numbers[i]=5;
            case 'I':
            numbers[i]=1;
            break;
            default:
        }
    }
    int sum=0;
    for(int i=0;i<s.length();i++){
        if(numbers[i]<numbers[i+1]){
            sum-=numbers[i];
        }else
            sum+=numbers[i];
    }
    return  sum+numbers[numbers.length-1];
}