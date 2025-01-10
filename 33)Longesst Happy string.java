class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int maxlen=a+b+c,i=0;
        int curra=0,currb=0,currc=0;
        StringBuilder sb = new StringBuilder();
        while(i<maxlen){
            if(curra!=2 && a>=b && a>=c || a>0 && (currb==2 || currc==2)){
                sb.append('a');
                curra++;
                currb=0;
                currc=0;
                a--;
            }
            else if(currb!=2 && b>=a && b>=c || b>0 && (curra==2 || currc==2)){
                sb.append('b');
                currb++;
                curra=0;
                currc=0;
                b--;
            }
            else if(currc!=2 && c>=a && c>=b || c>0 && (curra==2 || currb==2)){
                sb.append('c');
                currc++;
                curra=0;
                currb=0;
                c--;
            }
            i++;
        }
        return sb.toString();
    }
}
