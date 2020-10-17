class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List <Boolean> list = new ArrayList<Boolean>();
        
        int max = candies[0];
        
        for(int each : candies){
            if(each > max){
                max = each;
            }    
        }
        
        for(int each:candies){
            
            if(each+extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
        
    }
}
