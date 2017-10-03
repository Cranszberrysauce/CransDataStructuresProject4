package cransbtree2017;

import javax.swing.JFrame;

/*****************************************************
***  CransBTree2017 
***  Nick Crans
******************************************************
*** This class initializes the gui and sets it visable
*** 
******************************************************
* 09/26/2017: Created Insert, recInsert, getCount,
* print, recPrint methods
* 09/28/2017: Finished insert, getCount, print methods
* 09/29/2017: Finished and corrected the recursive 
* methods.
*****************************************************/
public class CransBTree2017 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Gui newGui = new Gui();
        newGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newGui.setSize(550, 350);
        newGui.setVisible(true);
    }
}
