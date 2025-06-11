class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        int i=0;
        String str="";
        while(i<s.length()){
            if(s.charAt(i)!=' '){
                str=str+s.charAt(i);
            }
            
            else{
                if(!str.equals("")){
                    list.add(str);
                }
                str="";
            }
            if(i==s.length()-1){
                list.add(str);
                str="";
            }
            i++;
        }
        str="";
        for(int j = list.size()-1;j>=0;j--){
            str=str+list.get(j)+" ";
        }
        return str.trim();
    }
}
