class Solution {
    public String longestPalindrome(String s) { 
        int n=s.length();
        int low=0,a=0,b=0,tot=0;
        int high=0;
        int k=Integer.MIN_VALUE;
        char[] ch=s.toCharArray();
        HashMap<Integer,Character> stac=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                a=i;
                b=j;
                if(ch[i]==ch[j]&&tot<b-a){
                    low=i;
                    high=j;
                    tot=high-low;
                }
            }
        }
        for(int i=low;i<high;i++){
            stac.put(i);
        }
        for(int i=low;i<high;i++){
            if()
        }
        System.out.println(low+" "+high);
        return s.substring(low,high+1);
    }
}
