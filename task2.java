//Вывести все простые числа от 1 до 1000
package Seminar1;

/**
 * task1
 */
public class task2{

public static void main(String[] args) {
    int[] arr= new int[1000];
    int a=1;
    
    for(int i=0; i< arr.length; i++){
        arr[i]=a;
        a++;
    }
    for (int i=0; i<arr.length; i++)   
    {  
    System.out.println(arr[i]);
}
}
}