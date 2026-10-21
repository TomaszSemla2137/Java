

class zad2_1{
    public static void main(String args[]){
String wspanialy_jezyk="Java to wspaniały język";
String wspanialy="wspaniały";
String nowe_slowo="Najlepszy";
String najlepszy_jezyk="";
int Id_docelowe = wspanialy_jezyk.indexOf(wspanialy);
if(Id_docelowe != -1){
    String pref= wspanialy_jezyk.substring(0, Id_docelowe);
int koniec_id=Id_docelowe + wspanialy.length();
String suf=wspanialy_jezyk.substring(koniec_id);
StringBuilder builder = new StringBuilder();
builder.append(pref).append(nowe_slowo).append(suf);
najlepszy_jezyk=builder.toString();
}
        System.out.println(wspanialy_jezyk);
System.out.println("A teraz: ");
System.out.println(najlepszy_jezyk);
    }
}