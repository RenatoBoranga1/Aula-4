public class comparar {
    public static boolean arraysIguais(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] al = {3, 6, 10};
        int[] a2 = {3, 6, 10};
        int[] a3 = {10, 6, 3};

        System.out.println(arraysIguais(al, a2)); 
        System.out.println(arraysIguais(al, a3)); 
    }
}
