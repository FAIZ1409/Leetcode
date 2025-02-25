import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> seen = new HashSet<>();
        int[] mc={0};

        backtrack(s,0,seen,0,mc);
        return mc[0];
    }

    private void backtrack(String s,int start,Set<String> seen,int count,int[] mc){
        if(count+ (s.length()-start)<=mc[0]) return;


        if(start==s.length()){
            mc[0]=Math.max(mc[0],count);
            return;
        }
        for(int end=start+1;end<= s.length();++end){
            String substring=s.substring(start,end);

            if(!seen.contains(substring)){
                seen.add(substring);
                backtrack(s,end,seen,count+1,mc);
                seen.remove(substring);
            }
        }
    }

}
