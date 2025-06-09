class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> first = new HashMap<>();
        HashMap<Character,Integer> second = new HashMap<>();
        for(char c: s.toCharArray()){
            first.put(c,first.getOrDefault(first.get(c)+1,0));
        }
        for(char ch: t.toCharArray()){
            second.put(ch,second.getOrDefault(second.get(ch)+1,0));
        }
        for(int i = 0 ; i< s.length() ; i++){
            if(!t.containsKey(s.charAt(i))){
                return false;
            }else{
                if(t.get(s.charAt(i)==s.get(s.charAT\t(i)))){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
