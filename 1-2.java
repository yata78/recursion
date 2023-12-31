package recursion;

class Main{

    public static int multiply(int m , int n){
        if(n == 0) return 0;

        return multiply(m-1, n) + m;
    }

    public static void main(String[] args){
        // 5 × 4 を再帰的に計算
        System.out.println(multiply(5,4));

        // 7 × 3 を再帰的に計算
        System.out.println(multiply(7,3));
    }
}
