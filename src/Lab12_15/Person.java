package Lab12_15;

public class Person {
    String name;
    String forname;
    String vatername;

    public Person(String name, String forname, String vatername) {
        this.name = name;
        this.forname = forname;
        this.vatername = vatername;
    }


    public String getForname() {
        StringBuffer temp=new StringBuffer(forname);
        temp.append(" ");

        if (name.length() != 0) {
            temp.append(name.charAt(0)).append(".");
        }
        if (vatername.length() != 0) {
            temp.append(vatername.charAt(0)).append(".");
        }
        if(temp.equals(forname))
            return temp.toString();

        else
            return temp.substring(0,temp.length()-1).toString();
    }
}
