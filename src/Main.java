import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] a = {2,4,6,8,13};
        int[] b = {1,3,5,7,9,10,11,12,14,15};

        int[] c = merge(a, b);
        for(int i : c){
            System.out.println(i);
        }
    }

    public static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++] = b[j++];
        }

        return c;

    }
}