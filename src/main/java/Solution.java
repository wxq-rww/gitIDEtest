

public class Solution {

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.monotoneIncreasingDigits(332);
    }

    public int monotoneIncreasingDigits2(int N) {
        return 0;
    }

        public int monotoneIncreasingDigits(int N) {
            char[] aim = Integer.toString(N).toCharArray();
            int length=aim.length;
            int pos=length;
            for (int i = length-1; i >0; i--) {
                if (aim[i]<aim[i-1]){
                    pos=i;
                    aim[i-1]--;
                }
            }
            for (int i = pos; i <length ; i++) {
                aim[i]='9';
            }
            int resoult = Integer.parseInt(new String(aim));
            System.out.println(resoult);
            return  resoult;

        }
}
