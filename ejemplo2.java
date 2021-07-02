public class ejemplo2{
public long ejemplo2(int n){
        long ant = 1;
        System.out.println(ant + " " );
        long ant2 = 1;
        System.out.println(ant2 + " " );
        long ant3 = 1;
        System.out.println(ant3 + " " );
        long actual = 0;
        for(int i = 4; i <= n; i++){
            if(i == 4 || i == 5){
                actual = ant + ant2;
            }else{}
            if(i == 6){
                actual += ant ;
            }else{}
            if(i == 7){
                actual += ant2;
            }else{}
            if(i == 8){
                actual += ant3;
                ant = ant2 + ant3;
            }else{}
            if(i == 9){
                actual += ant;
            }else{}
            if (i == 10){
                actual += ant;
                ant += ant2;
            }else{}
            if(i == 11){
                actual += ant;
                ant += ant3;
            }else{}
            if(i == 12){
                actual += ant;
            }else{}
            if(i == 13){
                actual += ant + ant3;
                ant += ant3;
                ant += ant2 + ant3;
            }else{}
            if(i == 14){
                actual += ant;
                ant += ant2+ ant3;
            }else{}
            if(i == 15){
                actual += ant;
                ant += ant2+ ant3 + ant2; 
            }else{}
            if(i == 16){
                actual += ant;
                ant2 += ant + ant3 + ant2+ ant3;
            }else{}
            if(i == 17){
                actual += ant2;
                ant2 +=  ant3 + ant3 + ant3 + ant3 + ant3;
            }else{}
            if(i == 18){
                actual += ant2;
                ant2 = ant + ant + ant3 +ant3 + ant3 +ant3;
            }else{}
            if(i == 19){
                actual += ant2;
                ant2 = ant + ant + ant + ant3;
            }else{}
            if(i == 20){
                actual += ant2;
                ant2 += ant;
            }else{}
            if(i == 21){
                actual += ant2;
                ant2 += ant + ant3 + ant3 + ant3 + ant3;
            }else{}
            if(i == 22){
                actual += ant2;
                ant2 += ant + ant3 +ant3 + ant3 + ant3 + ant3 + ant3 + ant3 + ant3 + ant3;
            }else{}
            if(i == 23){
                actual += ant2;
            }
            System.out.println(actual + " " );
        }
        return actual;
    }
}
