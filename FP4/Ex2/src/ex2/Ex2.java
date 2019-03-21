/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author NERD-X
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    static User user1;
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B','r', 'u', 'n', 'o'};
        user1.email = new char[]{'b','m', 'o', '@'};
//        user1.expenses.carNumber = 0;
//        user1.expenses.foodNumber = 0;
        
        user1.expenses.setCarNumber(0);
        System.out.println(user1.expenses.getCarNumber());
        
        //adicionar despesas
        for(int i = 0; i < 31; i++){ //user1.expenses.getCarNumber()
//            user1.expenses.carValue[i]=i+1;
//            user1.expenses.carNumber += 1;
              user1.expenses.setCarValue((i+1), i);
              user1.expenses.setCarNumber((user1.expenses.getCarNumber() + 1));
        }
        
        for(int i = 0; i < 31; i++){
            user1.expenses.setFoodValue((i+1), i);
            user1.expenses.setFoodNumber((user1.expenses.getFoodNumber() + 1));
//            user1.expenses.foodValue[i]=i+1;
//            user1.expenses.foodNumber += 1;
        }
        
        System.out.println("-------------USER1-----------");
        System.out.print("UserID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        System.out.print("Car Number: ");
        System.out.println(user1.expenses.getCarNumber());
        System.out.print("Description: ");
        System.out.println(user1.expenses.getCarDescription());
        System.out.print("Food Number: ");
        System.out.println(user1.expenses.getFoodNumber());
        System.out.print("Description: ");
        System.out.println(user1.expenses.getFoodDescription());
        
        double addCar = 0;
        double addFood = 0;
        
        for(int i = 0; i < 31; i++){
            addCar += user1.expenses.getCarValue(i);
            addFood += user1.expenses.getFoodValue(i);
        }
//        
        System.out.print("Car Value : ");
        System.out.println(addCar);
//        
        System.out.print("Food Value : ");
        System.out.println(addFood);
//        
        System.out.print("Total : ");
        System.out.println(addFood + addCar);
//        
        System.out.print("Media : ");
        System.out.println((addFood + addCar)/31);
   
    }
    
}
