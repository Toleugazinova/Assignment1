import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   System.out.println("1)");
    int n1 = sc.nextInt();
    System.out.println(sum1(n1));

    System.out.println("2)");
    int n2 = sc.nextInt();
    int k=sc.nextInt();
    int arr[]= new int[k];
    for (int i=0;i<k;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(sum2(n2,arr));

   System.out.println("3)");
    int b= sc.nextInt();
    int n3=sc.nextInt();
    System.out.println(sum3(b,n3));

    System.out.println("4)");
    int N=sc.nextInt();
    reversePrint(N);
}

public static int sum1(int n){
    if (n==1) return 1;
    return n*n+sum1(n-1);
}


public static int sum2(int n,int arr[]){
    if (n==1) return arr[0];
    return arr[n-1]+sum2(n-1,arr);
}

public static int sum3(int b, int n){
    if (n==0) return 1;
    return pow(b,n)+sum3(b,n-1);
}
private static int pow(int b, int n){
    if  (n==0) return 1;
    return b*pow(b,n-1);
}

public static void reversePrint(int N){
    Scanner sc = new Scanner(System.in);
    reverse(N,sc);
}
public static void reverse(int N,Scanner sc){
    if (N==0) return;
    int n=sc.nextInt();
    reverse(N-1,sc);
    System.out.print(n+" ");
}