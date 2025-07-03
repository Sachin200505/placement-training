class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen=0;
        for(int i=0;i<sentences.length;i++){
            int currLen=sentences[i].split(" ").length;
            if(maxLen<currLen){
                maxLen=currLen;
            }
        }
                    return maxLen;

    }
}