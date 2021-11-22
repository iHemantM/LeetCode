class Solution {
    public int reverse(int x) {
        
        int answer = 0;
        
        while (x != 0) {
            if(answer > 214748364 || answer < -214748364) {
                return 0;
            }
            answer = answer * 10 + x % 10;
            x /= 10;
        }
        return answer;
    }
}