public class ProductElements {

    public int product(int[] arr) {

        int pr = 1;
        for (int i = 0; i < arr.length; i++) {
            pr = pr * arr[i];
        }
        return pr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        ProductElements p = new ProductElements();
        int pr = p.product(arr);
        System.out.println("The product of the array elements is " + pr);
    }
}
