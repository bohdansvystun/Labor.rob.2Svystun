package lab2;

public class Main {
    static Customer[] clients = new Customer[10];
    public static void main(String[] args) {
        createClients();
        /** список покупців з вказаним іменем*/
        String name = "Ivan";
        System.out.println("Customers that have name: " + name);
        System.out.println(searchName(name));
        /** Список покупців з картою в інтервалі*/
        Integer minInterval = 2000, maxInterval = 4000;
        System.out.println("Customers that have a cardnumber in range from " + minInterval + " to " + maxInterval);
        System.out.println(searchCardNumber(minInterval, maxInterval));
        /** к-сть та список покупців, які мають заборгованість*/
        System.out.println("Customers with debts");
        System.out.println(searchCardCredit() + "Quantity: " +searchCardCreditCount());
    }

    public static String searchID (Integer data){
        String result = "";
        for (Customer client : clients) {
            if (client.getValue("id").equals(data)) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static String searchName (String data){
        String result = "";
        for (Customer client : clients) {
            if (client.getValue("name").equals(data)) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static String searchSurname (String data){
        String result = "";
        for (Customer client : clients) {
            if (client.getValue("surname").equals(data)) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static String searchMiddleName (String data){
        String result = "";
        for (Customer client : clients) {
            if (client.getValue("middleName").equals(data)) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static String searchAddress (String data){
        String result = "";
        for (Customer client : clients) {
            String address = (String) client.getValue("address");
            if (address.toLowerCase().contains(data.toLowerCase())) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static String searchCardNumber (Integer min, Integer max){
        String result = "";
        for (Customer client : clients) {
            Integer number = (Integer) client.getValue("cardNumber");
            if (number > min && number < max) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static String searchCardMoney (Integer data){
        String result = "";
        for (Customer client : clients) {
            if (client.getValue("cardMoney").equals(data)) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static String searchCardCredit(){
        String result = "";
        for (Customer client : clients) {
            Integer money = (Integer) client.getValue("cardMoney");
            if (money < 0) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static Integer searchCardCreditCount(){
        Integer result = 0;
        for (Customer client : clients) {
            Integer money = (Integer) client.getValue("cardMoney");
            if (money < 0) {
                result++;
            }
        }
        return result;
    }
    public static String searchCardMoney (Integer min, Integer max){
        String result = "";
        for (Customer client : clients) {
            Integer money = (Integer) client.getValue("cardMoney");
            if (money > min && money < max) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }

    public static void createClients() {
        clients[0] = new Customer(1, "Ivanovich", "Ivan", "Ivanovich", "Lviv, Lukasha street", 1234, 3000);
        clients[1] = new Customer(2, "Grudd", "Ivan", "Olegovich", "Lviv, Striyska street", 6742, -1000);
        clients[2] = new Customer(3, "Uzurmak", "Hanjabec", "Belibanovich", "Verhne Sinevidne, dark street", 3241, 7423);
        clients[3] = new Customer(4, "Svystun", "Bohdan", "Ihorovich", "Lviv, top street", 4365, 24123412);
        clients[4] = new Customer(5, "Medici", "Lorenzo", "Piero", "Kyiv, Lvivs street", 6754, 1232);
        clients[5] = new Customer(6, "Putin", "Gigik", "Vladimirovich", "Kyiv, Bankova street", 8975, 1232);
        clients[6] = new Customer(7, "Blackman", "John", "Peter", "Kyiv, Shevchenka street", 6573, 1232);
        clients[7] = new Customer(8, "Churchill", "Winston", "Robert", "London, Stripe street", 3522, 1232);
        clients[8] = new Customer(9, "Genius", "Genome", "Dmytrovych", "Kyiv, Zelena street", 7854, 1245);
        clients[9] = new Customer(10, "Brucks", "Phil", "Thomas", "Kyiv, Green street", 5323, -1232);
    }
}

