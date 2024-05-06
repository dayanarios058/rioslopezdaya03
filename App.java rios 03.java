public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        public class Main {
            public static void main(String[] args) {
                // crear un arreglo desarreglado
                int[] arreglo = {28, 7, 15, 2, 10, 5, 24};
        
                //imprimir el arreglo desordenado
                System.out.println( "el arreglo desordenado es:");
                printArray(arreglo);
        
                // ordenar el arreglo usando mergeSort
                mergeSort(arreglo, 0, arreglo.length - 1);
        
                // imprimir el arreglo ordenado
                System.out.println( "el arreglo ordenado es:");
                printArray(arreglo);
            }
        
            // metodo mergesort
            public static void mergeSort(int[] arr, int left, int right) {
                if (left < right) {
                    int medio = (left + right) / 2;
                    mergeSort(arr, left, medio);
                    mergeSort(arr, medio + 1, right);
                    merge(arr, left, medio, right);
                }
            }
        
            // metodo merge
            public static void merge(int[] arr, int left, int middle, int right) {
                int n1 = middle - left + 1;
                int n2 = right - middle;
        
                int[] leftArray = new int[n1];
                int[] rightArray = new int[n2];
        
                for (int i = 0; i < n1; ++i)
                    leftArray[i] = arr[left + i];
                for (int j = 0; j < n2; ++j)
                    rightArray[j] = arr[middle + 1 + j];
        
                int i = 0, j = 0;
                int n = left;
        
                while (i < n1 && j < n2) {
                    if (leftArray[i] <= rightArray[j]) {
                        arr[n] = leftArray[i];
                        i++;
                    } else {
                        arr[n] = rightArray[j];
                        j++;
                    }
                    n++;
                }
        
                while (i < n1) {
                    arr[n] = leftArray[i];
                    i++;
                    n++;
                }
        
                while (j < n2) {
                    arr[n] = rightArray[j];
                    j++;
                    n++;
                }
            }
        
            // imprimir el arreglo
            public static void printArray(int[] arr) {
                for (int value : arr) {
                    System.out.print(value + " ");
                }
            }
        }
    }
}
