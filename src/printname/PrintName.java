/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printname;

/**
 *
 * @author srinivsi
 */
public class PrintName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        PrintModel in=new PrintModel("test");
        System.out.println(in.getName());
    }
    
}
