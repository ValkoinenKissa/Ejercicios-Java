public class Test3 {
    public int factorialRecursivo(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        return num * factorialRecursivo(num - 1);
    }
}
