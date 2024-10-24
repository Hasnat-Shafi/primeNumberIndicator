import java.util.Scanner;
public static boolean isPrime(int n)
{
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    System.out.println("Input a number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (isPrime(n)) {
        System.out.println("The number is a prime number.");
    }
    else {
        System.out.println("The number is not a prime number.");
    }
}
