
public class Solution {
    public static boolean hero(long bullets, long dragons){
        return bullets >= dragons * 2;
    }
    public static void main(String[] args) {
        int[] dragonHeads = {2,5,8};
        int[] dragonStrengths = {3,2,1};
        long bullets = 10;
        System.out.println(hero(bullets, dragonHeads.length));
        
        long bulletsBig = 1843432583;
        long dragonsBig = 1243543918;
        System.out.println(hero(bulletsBig, dragonsBig));
    }
    
}
