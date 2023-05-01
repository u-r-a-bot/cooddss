import java.util.Scanner;

class cart{
    item[] items;
    cart(int n){
        items = new item[n];
    }
    cart(item items[]){
        this.items = items;
    }
    void display(cart a[]){
        System.out.println("name\t\t Price");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].items.length;j++){
                    if(a[i].items[j].isPerishable)
                        System.out.println(a[i].items[j].name+"\t\t"+a[i].items[j].price);
            }
        }
    }
    void costliest(cart a[]){
        float max = 0;
        int ival=0,jval=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].items.length;j++){
                if(!a[i].items[j].isPerishable){
                    if(a[i].items[j].price > max){
                        max = a[i].items[j].price;
                        ival = i;
                        jval = j;
                    }
                }
            }
        }
        System.out.println("Costliest item non perishable item is: "+ a[ival].items[jval].name+" with a price of = "+ a[ival].items[jval].price);
    }
    
}
class item{
    String name;
    float price;
    boolean isPerishable;
    item(String name, float price, boolean isPerishable) {
        this.name = name;
        this.price = price;
        this.isPerishable = isPerishable;
    }
    

}
class shopkart{
    public static void main(String[] args) {
        cart[] conbelt = new cart[3];
        int n =0,nitems;
        Scanner sc = new Scanner(System.in);
        while (n<3) {
            System.out.println("Enter the number of items in cart: "+ (n+1));
            nitems = sc.nextInt();
            conbelt[n] = new cart(nitems);
            item[] temp = new item[nitems];
            for(int i = 0; i < nitems; i++) {
                System.out.println("Enter name");
                String name = sc.next();
                System.out.println("Enter price");
                float price = sc.nextFloat();
                System.out.println("Enter if 1 if its perishable or 0 if its not perishable ");
                int bo = sc.nextInt();
                boolean isPerishable =false;
                if(bo==1) isPerishable = true;
                temp[i] = new item(name, price, isPerishable);
                
            }
            conbelt[n] = new cart(temp);
            n++;
        }
        for(int i=0;i<3;i++){
            float sum =0;
            for(int j=0;j<conbelt[i].items.length;j++){
                sum += conbelt[i].items[j].price;
            }
            System.out.println("Total cost of cart "+ (i+1)+(" is = ")+sum);
        }
        System.out.println("Name and cost of Perishable items is: ");
        conbelt[0].display(conbelt);
        conbelt[0].costliest(conbelt);
    }
}