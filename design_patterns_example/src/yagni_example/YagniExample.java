package yagni_example;

public class YagniExample {
    public int vur(int vur,int vur2){
        return vur+vur2;
    }
    public int topla(int topla,int topla2){
        return topla+topla2;
    }
    public double bolme(int bol,int bol2){
        if (bol2!=0){
            return (double) bol/bol2;
        }else {
            return -1;
        }
    }
}
