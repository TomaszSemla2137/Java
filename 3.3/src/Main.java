
public static void main(String[] args) {
    int[] tab1 = {1410, 1944, 1989};
    int[] tab2 = {2137, 69, 34};
    int [] tab3 =new int [(tab1.length+tab2.length)];
for(int i=0; i<tab1.length; i++){
    tab3[i]=tab1[i];}
for(int i=tab1.length; i<(tab1.length+tab2.length); i++){
    tab3[i]=tab2[i-tab1.length];
}
for(int number: tab3){
    System.out.println(number);
}
}