/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Factory {
    
    /**
     *
     * @param factoryType
     * @return Factory de Stacks o de Listas
     */
    public static AbstractFactory makeFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Stack")){
            return new StackFactory();
        }
        if(factoryType.equalsIgnoreCase("List")){
            return new ListFactory();
        }
        return null;
    }
}

