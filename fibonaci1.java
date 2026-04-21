public static int fibonacci(int n){
    if(n <= 1) return n;
    int fib0 = 0, fib1 = 1, fibN = 0;
    for(int i = 2; i <= n; i++){
        fibN = fib0 + fib1;
        fib0 = fib1;
        fib1 = fibN;
    }
    return fibN;
}
