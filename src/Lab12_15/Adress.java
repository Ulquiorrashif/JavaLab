package Lab12_15;

import java.util.StringTokenizer;

public class Adress {
    String Land;
    String Reg;
    String Stadt;
    String Strasse;
    String Haus;
    String Korp;
    String Kv;

    public Adress( String adress) {
        StringTokenizer str = new StringTokenizer(adress,", ; . -");
        Land = str.nextToken();
        Reg=str.nextToken();
        Stadt=str.nextToken();
        Strasse=str.nextToken();
        Haus=str.nextToken();
        Korp=str.nextToken();
        Kv=str.nextToken();
    }
    public void only(String adress){
        String[] mas = adress.split(", ");
        Land = mas[0];
        Reg=mas[1];
        Stadt=mas[2];
        Strasse=mas[3];
        Haus=mas[4];
        Korp=mas[5];
        Kv=mas[6];
    }

    @Override
    public String toString() {
        return new StringBuffer(Land).append(" ")
                .append(Reg).append(" ")
                .append(Stadt).append(" ")
                .append(Strasse).append(" ")
                .append(Haus).append(" ")
                .append(Korp).append(" ")
                .append(Kv).toString();
    }
}
