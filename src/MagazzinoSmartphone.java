public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        if (other!=null){
            count=other.count;
            for (int i=0; i<count;i++){
                if(smartphones[i]!=null){
                    smartphones[i]=new Smartphone(other.smartphones[i]);
                }
        
            }

        }
    
    }


    public void addSmartphone(Smartphone smartphone) {
        if (count<10){
            int i=0;
            while(smartphones[i]!=null){
                i++;
            } 
            smartphones[i]=new Smartphone(smartphone);
            count++;
        }        
    }

    public void removeSmartphone(Smartphone smartphone) {
       int i=0;
       boolean trovato=false;
       while (trovato!=true&&i<count){
        if(!smartphones[i].equals(smartphone)){
            trovato=true;
        }
        i++;
       }
       if(trovato==true){
        smartphones[i-1]=null;
        count--;
        for(int x=i; x<count;x++){
            smartphones[x]=smartphones[x+1];

        }
       }
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }


    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;


        return smartphone;
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();


        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();

        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String s="";
        for (int i=0; i<count;i++){
            if(smartphones[i]!=null){
                s=s+smartphones[i].toString()+"\n";

            }
    

        }
         return s;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Object obj) {
       

        return true;
    }


}