class Solution {
    public String frequencySort(String s) {
        
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int cnt = map.get(ch);
                map.put(ch,cnt+1);
            }
            else{
                map.put(ch,1);
            }
        }
         List<Map.Entry<Character,Integer>> list =
        new ArrayList<>(map.entrySet());

Collections.sort(list,
        (a,b) -> b.getValue() - a.getValue());

StringBuilder str = new StringBuilder();

for(Map.Entry<Character,Integer> entry : list){

    char ch = entry.getKey();
    int freq = entry.getValue();

    for(int i = 0; i < freq; i++){
        str.append(ch);
    }
}

return str.toString();
    }
}