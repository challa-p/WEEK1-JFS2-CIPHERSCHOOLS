import java.util.Scanner;
public class test2 {

public static void main(String[] args) {

try (Scanner sc = new Scanner(System.in)) {

System.out.println("Enter BasicPay");

double basicpay= sc.nextInt();

double hra=0, da=0; if (basicpay >=5000)

hra 0.1 basicpay; da 0.2 basicpay:

else

hra= 8.2 basicpay: das basicpay;

stem.out.println(hra+" "+ da); System.out.println(basicpay+ hra+ da);