import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int number, index;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }  //Tao 1 mang moi co kich co hon mang ban dau 1

        System.out.print("Enter index :");
        index = sc.nextInt();
        newArray[index - 1] = 0;
        for (int i = index - 1, j = index; i < newArray.length -1; i++, j++) {
            newArray[j] = array[i];
        } // chen vao vi tri moi cua mang

        System.out.print("Enter new value: ");
        number = sc.nextInt();
        newArray[index - 1] = number;
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        } // them vao gia tri moi
    }
}
