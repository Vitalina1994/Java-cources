public static BigInteger factorial(int n)
{
    BigInteger res = BigInteger.valueOf(1);
    for (int i = 2; i <= n; i++){
        res = res.multiply(BigInteger.valueOf(i));
    }
    return res;
}
