
package reserveSeats;

public class Cinema {
    private final char [][] sits;
    
    public Cinema(){
    this.sits=new char[10][10];
    inizialiceData();
    }
    
    private void inizialiceData(){
        for(int f=0;f<10; f++ ){
           for(int c=0; c<10;c++){
               sits[f][c]='L';
           }
       }
    }
    public final void getSits(){
        for(int f=0;f<10; f++ ){
           for(int c=0; c<10;c++){
               System.out.print(this.sits[f][c] + "   ");
           }
            System.out.print('\n');
       }
    }
    public final String reserveSits(int f, int c){
        if((f>0&&c>0)&&(f<=10&&c<=10)){
            if(this.sits[f-1][c-1]!='L'){
            return "El asiento ya esta ocupado no se puede reservar.";
            }
            this.sits[f-1][c-1]='R';
            this.getSits();
            return "Se reservo Exitosamente en la fila: "+f +" y colunma: "+c;
        }
        return "El numero que seleccionaste no es correcto, debe ser entre 1 y 10";
    }
}
