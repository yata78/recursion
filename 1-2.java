package recursion;

class Main{

    public static int multiply(int m , int n){
        if(n == 0) return 0;

        return multiply(m-1, n) + m;
    }

    public static void main(String[] args){
        // 5 �~ 4 ���ċA�I�Ɍv�Z
        System.out.println(multiply(5,4));

        // 7 �~ 3 ���ċA�I�Ɍv�Z
        System.out.println(multiply(7,3));
    }
}
