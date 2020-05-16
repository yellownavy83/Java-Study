package tct;

//문제 설명
//        앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다.
//        문자열 s가 주어질 때, s의 부분문자열(Substring)중 가장 긴 팰린드롬의 길이를 return 하는 solution 함수를 완성해 주세요.
//
//        예를들면, 문자열 s가 abcdcba이면 7을 return하고 abacde이면 3을 return합니다.
//
//        제한사항
//        문자열 s의 길이 : 2,500 이하의 자연수
//        문자열 s는 알파벳 소문자로만 구성
//        입출력 예
//        s	answer
//        abcdcba	7
//        abacde	3
//        입출력 예 설명
//        입출력 예 #1
//        4번째자리 'd'를 기준으로 문자열 s 전체가 팰린드롬이 되므로 7을 return합니다.
//
//        입출력 예 #2
//        2번째자리 'b'를 기준으로 aba가 팰린드롬이 되므로 3을 return합니다.


public class Palindrome2 {

    public int solution(String s) {
        for (int answer = s.length(); answer > 1; answer--) {
            int start = 0;
            int end = 0 + answer - 1;

            while (end < s.length()) {
                if (isPalindrome(s, start, end)) {
                    return answer;
                }

                start++;
                end++;
            }
        }

        return 1;
    }

    private boolean isPalindrome(String s, int start, int end) {
        int diffBy2 = (end - start + 1) / 2 - 1;

        for (int i = 0; i <= diffBy2; i++) {
            char c1 = s.charAt(start + i);
            char c2 = s.charAt(end - i);

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Palindrome2 palindrome2 = new Palindrome2();

        int result = palindrome2.solution("abcdcba");
        System.out.println(result);
    }
}
