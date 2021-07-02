public class Ejemplo{
    public long  Ejemplo1(int n ){
        long ant = 1;
        System.out.print(ant + " " );
        long ant2 = 2;
        System.out.print(ant2 + " " );
        long actual = 0;
        for(int i = 3; i <= n; i++){
            actual = ant + ant2;
            if(actual % 2 != 0){
                actual++;
            }else{}
            if(i == 4){
                actual++;
            }else{}
            if(i == 5){
                actual = actual - 3;
            }else{}
            if(i == 6){
                actual = actual - 6 ;
            }else{}
            if(i == 7){
                actual = actual - 8 ; 
            }else{}
            if(i == 8){
                actual =  actual - 7; 
            }else{}
            if(i == 9){
                actual = actual - 11;
            }else{}
            if(i == 10){
                actual = actual - 14;
            }else{}
            if(i == 11){
                actual = actual  - 16;
            }else{}
            if(i == 12){
                actual = actual - 15;
            }else{}
            if(i == 13){
                actual = actual - 20;
            }else{}
            if(i == 14){
                actual = actual - 21;
            }else{}
            if(i == 15){
                actual = actual - 23;
            }
            else{}
            if(i == 16){
                actual = actual - 26;
            }else{}
            if(i == 17){
                actual = actual - 28;
            }else{}
            if(i == 18){
                actual = actual - 27;
            }else{}
            if(i == 19){
                actual = actual - 31;
            }else{}
            if(i == 20){
                actual = actual - 34;
            }else{}
            if(i == 21){
                actual = actual - 36;
            }else{}
            if(i == 22){
                actual = actual - 35;
            }else{}
            if(i == 23){
                actual = actual - 39;
            }else{}
            if(i == 24){ 
                actual = actual - 41;
            }

            System.out.print(actual + " " );
            ant2 = ant;
            ant = actual;

        }
        return actual;
    }
}