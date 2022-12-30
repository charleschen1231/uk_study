package data_structure;

import java.util.HashSet;

/*
     finished a no duplication string
 */
public class Test1 {
    public static void main(String[] args) {
        // use Hashset to stored data
        String str1="abcrffffad";
        System.out.println(Math.max( 5,12 ));
        System.out.println(str1.charAt( 0 ));
        System.out.println(longestSubtringStr( "abcadefesfade" ));



    }


    public static int longestSubtringStr(String str){
        final HashSet<Character> occ = new HashSet<Character>();
        int n=str.length();
        int rk=-1, ant=0;
        for(int i=0;i<n;i++){
            if(i!=0){
                 occ.add( str.charAt( i - 1 ) );
            }
            System.out.println(occ);
            while(rk+1<n & !occ.contains( str.charAt( rk+1 ) )){
                occ.add( str.charAt( rk+1 ) );
                rk++;
            }
            ant=Math.max( ant,rk-i+1 );

        }
        return ant;
    }
}
