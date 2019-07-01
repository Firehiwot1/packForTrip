public class Wearable {
    private int size;
    private String material;// linon,
    private String company;//addids, niki
    private String color;

    public Wearable() {

    }


    public Wearable(int size, String material, String Company, String color){
        this.size=size;
        this.material=material;
        this.company=company;
        this.company=color;

    }
       public void setSize (int size)
       {
       this.size=size;
       }
       public int getSize(){
        return this.size;
       }
       public void setMaterial(String material){
        this.material=material;
       }
      public String getMaterial(){
        return this.material;
      }
      public void setCompany(String company){
        this.company=company;
    }
       public String getCompany(){
        return this.company;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }

        }




