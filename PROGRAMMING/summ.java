
import java.util.Arrays;

public class summ {

    public static void main(String[] args)
    {
        int a[] = {20, 50, 70, 80, 90};
        int n = 2;

        // sort in descending order
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Nth biggest: " + a[n - 1]);
        System.out.println(Arrays.toString(a));
    }
}
    
    

