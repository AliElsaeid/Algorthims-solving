class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0 ; 
        for(int i = 0 ;i<sentences.length;i++){
            String s =sentences[i];
            int c = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' ')
                    c++;
            }
            c++;
            if(c>max)
                max=c;
        }
        return max;
    }
}