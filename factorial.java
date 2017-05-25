Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал NN вычисляется как 1⋅2⋅...⋅N1⋅2⋅...⋅N.

Поскольку это очень быстро растущая функция, то даже для небольших NN вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Sample Input 1:
1
Sample Output 1:
1
Sample Input 2:
3
Sample Output 2:
6
 Гарна відповідь!

public static BigInteger factorial(int n)
{
    BigInteger res = BigInteger.valueOf(1);
    for (int i = 2; i <= n; i++){
        res = res.multiply(BigInteger.valueOf(i));
    }
    return res;
}
