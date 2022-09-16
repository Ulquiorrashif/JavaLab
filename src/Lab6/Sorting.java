package Lab6;

public class Sorting {

    public void insertionSort (Comparable[] args) {
        for(int i=1; i< args.length;i++){
            int j=i-1;

            Comparable save =args[i];
            for (;j>=0;j--){
                if( args[j].compareTo(save)<0){
                    args[j+1]=save;
                    break;
                }
                args[j+1]=args[j];
            }
            args[j+1]=save;
        }
    }

    public static void main(String[] args) {

    }
}
