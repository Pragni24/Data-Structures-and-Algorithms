class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern==null){
            return true;
        }
        HashMap<Character,String> map = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char a = pattern.charAt(i);
            String b = str[i];
            if(map.containsKey(a)){
                if(map.get(a).equals(b)){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(!map.containsValue(b)){
                    map.put(a,b);

                }else{
                    return false;
                }
            }

        }
        return true;
    }
}
