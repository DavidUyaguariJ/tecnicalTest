
package reserveSeats;

public class Cinema {
    private final char [][] sits;
    
    public Cinema(){
    this.sits=new char[10][10];
    inizialiceData();
    }
    
    private void inizialiceData(){
        for(int r=0;r<10; r++ ){
           for(int c=0; c<10;c++){
               sits[r][c]='L';
           }
       }
    }
    public final void getSits(){
        for(int r=0;r<10; r++ ){
           for(int c=0; c<10;c++){
               System.out.print(this.sits[r][c] + "   ");
           }
            System.out.print('\n');
       }
    }
    public final String reserveSits(int r, int c){
        if((r>0&&c>0)&&(r<=10&&c<=10)){
            if(this.sits[r-1][c-1]!='L'){
            return "El asiento ya esta ocupado no se puede reservar.";
            }
            this.sits[r-1][c-1]='X';
            this.getSits();
            return "Se reservo Exitosamente en la fila: "+r +" y colunma: "+c;
        }
        return "El numero que seleccionaste no es correcto, debe ser entre 1 y 10";
    }
}
