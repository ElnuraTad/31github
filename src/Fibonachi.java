public class Fibonachi {
    public static void main(String[] args) {
//        System.out.println(fibEffective(3));
        System.out.println(fibEffective(1000));
//        System.out.println(fibNaive(100));

    }
    //fibonachi
    private static long fibNaive(int n){
        if(n<=1)
            return n;

        return fibNaive(n-1)+ fibNaive(n-2);
    }

    //using data structure
    private static long fibEffective(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n];

    }
}
