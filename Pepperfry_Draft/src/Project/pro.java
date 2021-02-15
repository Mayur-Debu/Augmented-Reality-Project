/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author MAYUR_DEBU
 */
public class pro {
    public static void main(String args[])
    {
        int i=0,j=0;
        for( i=0;i<3;i++)
        {
            for(j=0;j<5;j++)
            {
                if(j>=i&&j<=8-i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
                System.out.println("");
            }
        }
    }
    
}
