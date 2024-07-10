public class Solution {
    public static void main(String[] args) {
        String num_str = "12345";
        int sum =0;
        for(int i =0;i<num_str.length();i++){
            sum += Integer.parseInt((num_str.charAt(i)+""));
        }
    }

}