//Imprima os fatoriais de 1 a 10.
public class ExerFor4{
    public static void main(String args[]){
        int fat = 1;
        for(int x=1; x<=10; x++){
            fat*=x;
            System.out.println(fat + " ");
        }
    }
}