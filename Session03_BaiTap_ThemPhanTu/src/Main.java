import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Input:
        *   Nhap so phan tu va khoi tao mang
        *   Nhap gia tri can them va chi so chen vao
        * Output:
        *   Them gia tri vao chi so can chen trong mang
        * */
        //B1. Nhap so phan tu va khoi tao mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int[n];
        System.out.println("NHAP GIA TRI CAC PHAN TU MANG:");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("old[%d]=",i);
            old[i] = Integer.parseInt(sc.nextLine());
        }
        //B2. In gia tri cac phan tu cua mang truoc khi them
        System.out.println("Gia tri cac phan tu mang truoc khi them: ");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("%d\t",old[i]);
        }
        System.out.printf("\n");
        //B3. Nhap vao gia tri can them va chi so can chen vao mang
        System.out.println("Nhap vao gia tri can them vao mang: ");
        int valueInsert = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao chi so can chen vao mang: ");
        int indexInsert = Integer.parseInt(sc.nextLine());
        //B4. KHoi tao mang moi arrNew de chua cac phan tu gom ca phan tu can them
        int[] arrNew = new int[old.length+1];
        //B5. Copy cac phan tu tu mang old va them phan tu moi vao mang arrNew
        for (int i = 0; i < arrNew.length; i++) {
            if(i<indexInsert){
                arrNew[i] = old[i];
            }else if(i==indexInsert){
                arrNew[i] = valueInsert;
            }else{
                arrNew[i] = old[i-1];
            }
        }
        //B6. In ra cac phan tu san khi them moi 1 phan tu
        System.out.println("Gia tri cac phan tu sau khi them moi: ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t",arrNew[i]);
        }
        System.out.printf("\n");
    }
}