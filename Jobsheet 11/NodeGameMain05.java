public class NodeGameMain05 {
    public static void main(String[] args) {
        ScavengerHunt05 hunt = new ScavengerHunt05();

        hunt.addPoint("Brand mobil TOYOTA berasal dari negara mana?","Jepang");
        hunt.addPoint("Apa kegunaan sistem hybrid pada mobil?", "Efisiensi BBM");
        hunt.addPoint("Apa mall terbesar yang berada di surabaya?", "Pakuwon Mall");
        hunt.addPoint("Sebutkan nama ibu kota Australia!", "Sydney");
        hunt.addPoint("Brand mobil VOLVO berasal dari negara mana?","Swedia");


        hunt.startHunt();
    }
}