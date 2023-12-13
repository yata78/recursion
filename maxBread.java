class Solution{
    public static int maxBread(int money, int price, int sticker){
        int buyBread = money / price;

        return maxBreadHelper(price, sticker, buyBread, buyBread);
    }

    public static int maxBreadHelper(int price, int sticker,int haveSticker,int bread){
        
        if(haveSticker < sticker){
            return bread;
        } 
        //シールで買えたパンの数
        int buyBread = haveSticker / sticker;


        return maxBreadHelper(price, sticker, (haveSticker / sticker) + (haveSticker % haveSticker), bread + buyBread);
    }

    //持っているお金でパンを買う(お金はここで全て無くなる)
    //パンを買った数だけシールがもらえる
    //シールがsticker枚集まると1つパンがもらえる
}
