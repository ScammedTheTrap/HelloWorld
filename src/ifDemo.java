public class ifDemo {
    public static void main(String[] args){
        int alder = 18; // ændrer man alderen ændrer man aaben eller luk

        String dag = "fredag"; //ændrer man datoen lukker fredagsbaren
        if (alder >= 18 && dag.equals("fredag")) { //dag.equals er special når det strings
            System.out.println("Fredagsbaren er aaben!");
        } else {
            System.out.println("der lukket : (");

        }




    }
}
