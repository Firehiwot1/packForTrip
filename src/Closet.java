import java.util.ArrayList;


public class Closet {
    //closet1
    private ArrayList<Jacket> cottonJacket;
    private ArrayList<Shirt> greenShirt;
    private ArrayList<Pants> nikePants;
    private ArrayList<Shoes> leathershoes;
    //closet2
    private ArrayList<Jacket> LinonJacket;
    private ArrayList<Shirt> yelowShirt;
    private ArrayList<Pants> addidasPants;
    private ArrayList<Shoes> nylonShoes;
    //closet3
    private ArrayList<Jacket> polystarJacket;
    private ArrayList<Shirt> redShirt;
    private ArrayList<Pants> calvinKleinPants;
    private ArrayList<Shoes> artificialLeathershoes;


    public Closet() {
    }

    public Closet(ArrayList<Jacket> jacket, ArrayList<Shirt> shirt, ArrayList<Pants> pants, ArrayList<Shoes> shoes) {
        this.cottonJacket = jacket;
        this.greenShirt = shirt;
        this.nikePants = pants;
        this.leathershoes = shoes;
        this.LinonJacket = jacket;
        this.yelowShirt = shirt;
        this.addidasPants = pants;
        this.nylonShoes = shoes;
        this.polystarJacket = jacket;
        this.redShirt = shirt;
        this.calvinKleinPants = pants;
        this.artificialLeathershoes = shoes;


    }

    public ArrayList<Jacket> getCottonJacket() {
        return cottonJacket;
    }

    public void setCottonJacket(ArrayList<Jacket> cottonJacket) {
        this.cottonJacket = cottonJacket;
    }

    public ArrayList<Shirt> getGreenShirt() {
        return greenShirt;
    }

    public void setGreenShirt(ArrayList<Shirt> greenShirt) {
        this.greenShirt = greenShirt;
    }

    public ArrayList<Pants> getNikePants() {
        return nikePants;
    }

    public void setNikePants(ArrayList<Pants> nikePants) {
        this.nikePants = nikePants;
    }

    public ArrayList<Shoes> getLeathershoes() {
        return leathershoes;
    }

    public void setLeathershoes(ArrayList<Shoes> leathershoes) {
        this.leathershoes = leathershoes;
    }

    public ArrayList<Jacket> getLinonJacket() {
        return LinonJacket;
    }

    public void setLinonJacket(ArrayList<Jacket> linonJacket) {
        LinonJacket = linonJacket;
    }

    public ArrayList<Shirt> getYelowShirt() {
        return yelowShirt;
    }

    public void setYelowShirt(ArrayList<Shirt> yelowShirt) {
        this.yelowShirt = yelowShirt;
    }

    public ArrayList<Pants> getAddidasPants() {
        return addidasPants;
    }

    public void setAddidasPants(ArrayList<Pants> addidasPants) {
        this.addidasPants = addidasPants;
    }

    public ArrayList<Shoes> getNylonShoes() {
        return nylonShoes;
    }

    public void setNylonShoes(ArrayList<Shoes> nylonShoes) {
        this.nylonShoes = nylonShoes;
    }

    public ArrayList<Jacket> getPolystarJacket() {
        return polystarJacket;
    }

    public void setPolystarJacket(ArrayList<Jacket> polystarJacket) {
        this.polystarJacket = polystarJacket;
    }

    public ArrayList<Shirt> getRedShirt() {
        return redShirt;
    }

    public void setRedShirt(ArrayList<Shirt> redShirt) {
        this.redShirt = redShirt;
    }

    public ArrayList<Pants> getCalvinKleinPants() {
        return calvinKleinPants;
    }

    public void setCalvinKleinPants(ArrayList<Pants> calvinKleinPants) {
        this.calvinKleinPants = calvinKleinPants;
    }

    public ArrayList<Shoes> getArtificialLeathershoes() {
        return artificialLeathershoes;
    }

    public void setArtificialLeathershoes(ArrayList<Shoes> artificialLeathershoes) {
        this.artificialLeathershoes = artificialLeathershoes;
    }

    public String getCloset1() {
        int answer1 = 0;
        if (answer1 == 1) {
            return " This is closet1: cottonJacket, " + " greenShirt, " + " nikePants, " + " leathershoes. ";
        }else{
            return " cottonJacket," + " greenShirt," + " nikePants," + " leathershoes.";
        }

    }

    public String getCloset2() {
        int answer2 = 0;
        if (answer2 == 2) {
            return " This is closet2: LinonJacket, " + " yelowShirt, " + " addidasPants, " + " nylonShoes. ";
        } else {
            return  " LinonJacket, " + " yelowShirt, " + " addidasPants, " + " nylonShoes. ";

        }
    }


        public String getCloset3(){
            int answer3 = 0;
            if (answer3 == 3) {
                return " This is closet3: polystarJacket, " + " redShirt, " + " calvinKleinPants, " + " artificialLeathershoes. ";
            } else {
                return " polystarJacket, " + "redShirt, " + "calvinKleinPants, " + "artificialLeathershoes, ";
            }

        }
    }










