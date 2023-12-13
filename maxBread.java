class Solution{
    public static int maxBread(int money, int price, int sticker){
        int buyBread = money / price;

        return maxBreadHelper(price, sticker, buyBread, buyBread);
    }

    public static int maxBreadHelper(int price, int sticker,int haveSticker,int bread){
        
        if(haveSticker < sticker){
            return bread;
        } 
        //�V�[���Ŕ������p���̐�
        int buyBread = haveSticker / sticker;


        return maxBreadHelper(price, sticker, (haveSticker / sticker) + (haveSticker % haveSticker), bread + buyBread);
    }

    //�����Ă��邨���Ńp���𔃂�(�����͂����őS�Ė����Ȃ�)
    //�p���𔃂����������V�[�������炦��
    //�V�[����sticker���W�܂��1�p�������炦��
}
