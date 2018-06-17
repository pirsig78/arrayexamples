
package arrayexample;

//import javax.swing.JOptionPane;

public class ArrayExamples {
    public static void main(String[] args) {
    //int n = Integer.parseInt(JOptionPane.showInputDialog("Строки: "));
    //int m = Integer.parseInt(JOptionPane.showInputDialog("Столбцы: "));
    int n = (int)(7*Math.random()+2);
    int array [][] = new int [n][];
    int i;
    int j;
    int k;
    int c ;
    
    for (i=0; i<n; i++){
        k = (int)(7*Math.random()+2);
        array[i] = new int [k];
        
        for (j=0; j<k ; j++){
            array[i][j] = (int)(11*Math.random()+1);
            String text = array[i][j]<10 ? "   " : "  ";
            System.out.print (array[i][j] + text);
        }
        System.out.println();
    }
    System.out.println();
    
    for (i=0; i<array.length; i++){
        for (j=0; j<array[i].length; j++ ){
            for (n=i; n<array.length; n++){
                c=(n==i) ? j : 0;
                
                for ( int m = c ; m<array[n].length; m++ ){
                    
                    if (array[i][j]>array[n][m]){
                        int z = array[i][j];
                        array[i][j] = array[n][m];
                        array[n][m] = z;     
                    }
                   
                }
            }
            String text = array[i][j]<10 ? "   " : "  ";
            System.out.print (array[i][j] + text);
        }
      System.out.println();  
    }

     
   }
}
    
