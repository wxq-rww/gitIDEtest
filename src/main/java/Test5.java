public class Test5 {

    int temp;

    public void name(int[] a ) {


        for (int i = a.length-1; i >0; i--) {
            for (int j = i-1; j >0;j--) {
                if (a[j]>a[i]){
                   temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }


    }

    public static void main(String[] args) {
        Test5 test5=new Test5();
        int[] a={5,4,8,1,3,11,5};
        test5.name(a);
    }


}
