public class Main {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Изначальный массив ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Перевернутый массив");
        for (int i = arr.length-1; i != -1; i--) {
            System.out.println(arr[i]);

        }

    }
}