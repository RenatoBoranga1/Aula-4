public class reverse {
    public static void main(String[] args) {
        
        int[] b1 = {15, 6, 10};  
        int[] result = new int[b1.length];
        

        for (int i = 0; i < b1.length; i++) {
            result[i] = b1[b1.length - 1 - i];
        }
        System.out.print("Array invertido: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
