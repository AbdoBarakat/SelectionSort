
package selectionsort;

public class SelectionSort {
    
    public static void print (int [] a) {        
        System.out.printf("{%d", a[0]);        
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
        }        
        System.out.println("}");
    }
    
    public static void swap (int [] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
    }
    
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                minIndex = j;
                }
            }
        swap(a, i, minIndex);
        }
    }

    public static void main(String[] args) {
          int [] a = {42, 77, 35, 12, 101, 5};
          print(a);
          selectionSort(a);  
          print(a);
    }
}