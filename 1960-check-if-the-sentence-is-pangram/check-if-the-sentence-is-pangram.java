class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch[]=sentence.toCharArray();
        int freq[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            freq[(int)ch[i]-97]++;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(freq[i]<=0){
                flag=false;
            }
        }
        return flag;
    }
}