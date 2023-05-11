import java.util.*;
class Parent{
    String familyName,motherName,fatherName;
    // Parent(String familyName,String motherName, String fatherName){
    //     this.familyName = familyName;
    //     this.motherName = motherName;
    //     this.fatherName = fatherName;
    // } 
    // Parent(Parent a){
    //     this(familyName, motherName, fatherName);
    // }

}
class child extends Parent{
    String name;
    char gender;
    child(String name,char gender, String familyName, String motherName, String fatherName){
        super.familyName = familyName;
        super.motherName = motherName;
        super.fatherName = fatherName;
        this.name = name;
        this.gender = gender;
    }
    void display(child a[],int n){
        System.out.println("Name: "+a[n].name+"\nFathers Name "+a[n].fatherName+"\nMother name "+a[n].motherName+"\nSurname "+a[n].familyName+"\nGender "+a[n].gender);
    }
    void setter(String name, char gender, String familyName, String motherName, String fatherName){
        super.familyName = familyName;
        super.fatherName = fatherName;
        super.motherName = motherName;
        this.name = name;
        this.gender = gender;
    }

}
class family{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        child[] a = new child[5];
        for(int i=0;i<5;i++){
            String familyName,motherName,fatherName,name;
            char gender;
            System.out.println("Enter family Name");
            familyName = sc.next();
            System.out.println("Enter mother name");
            motherName = sc.next();
            System.out.println("Enter Father name");
            fatherName = sc.next();
            System.out.println("Enter Name of the child");
            name = sc.next();
            System.out.println("Enter the gender of the child");
            gender = sc.next().charAt(0);
            a[i] = new child(name, gender,familyName,motherName,fatherName);
        }
        boolean bh = true;
        while(bh){
            int choice = 0;
            System.out.println("Enter 1 to display info\nEnter 2 to update info\nEnter 3 to exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the child name");
                    String childname = sc.next();
                    int set=100;
                    for (int i = 0; i < a.length; i++) {
                        if(childname.equals(a[i].name)){
                            set =i;
                        }
                        
                    }
                    if(set!=100)
                    a[0].display(a, set);
                    break;

                case 2:
                 System.out.println("Enter the child name");
                    String childname1 = sc.next();
                    int set1=100;
                    for (int i = 0; i < a.length; i++) {
                        if(childname1.equals(a[i].name)){
                            set1 =i;
                        }
                    }
                    String familyName, motherName, fatherName, name;
                    char gender;
                    System.out.println("Enter family Name");
                    familyName = sc.next();
                    System.out.println("Enter mother name");
                    motherName = sc.next();
                    System.out.println("Enter Father name");
                    fatherName = sc.next();
                    System.out.println("Enter Name of the child");
                    name = sc.next();
                    System.out.println("Enter the gender of the child");
                    gender = sc.next().charAt(0);
                    a[set1].setter(name, gender, familyName, motherName, fatherName);
                    
                break;
                case 3:
                    bh = false;
                    break;
        }
    }
}
}