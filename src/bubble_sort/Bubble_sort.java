package bubble_sort;

public class Bubble_sort {

    public static void main(String[] args) {
        
        int qt = 80; // 80 элементов массива
        
        int[] list1 = new int[qt]; // Объявляем целочисленный массив
        int m = 0;

        while(m < qt) {
            list1[m] = (int) (Math.random() * 100); // Заполняем массив случайными значениями от 0 до 100
            m = m + 1;
        }
        
        System.out.println("Было:");
        int n = 0;
        while(n < list1.length) {
            System.out.print(list1[n]);
            System.out.print("; ");
            n = n + 1;
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Идёт пересчёт...");
        
        int i = 0;
        int k = 0;
        int buf;
        while(i < list1.length) {
            while(k < list1.length) {
                if (list1[i] > list1[k]) { // Для сортировки по убыванию зам."<"
                    buf = list1[i];
                    list1[i] = list1[k];
                    list1[k] = buf;
                }
                k = k + 1;
            }
            k = i + 2;
            i = i + 1;
        }
        System.out.println("Стало:");
        n = 0;
        while(n < list1.length) {
            System.out.print(list1[n] + "; ");
            n = n + 1;
        }
        System.out.println();
    }
    
}