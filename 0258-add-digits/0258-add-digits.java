class Solution {
    public int addDigits(int num) {
    if(num==0)
    return 0;
    else if(num<=9)
    return num;
    else {
        int sum=0;
    while (num>0){
        int rem =num%10;
        sum+=rem;
        num=num/10;
    }
    return addDigits(sum);
    }
    }
}