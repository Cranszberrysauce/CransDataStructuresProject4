package cransbtree2017;

/*****************************************************
***  BTree
***  Nick Crans
******************************************************
*** This is the class that inserts the words and 
*** traverses the tree to print.
******************************************************
* 09/26/2017: Created Insert, recInsert
* 09/28/2017: Finished insert, recInsert methods
* 09/29/2017: Created and finished the transverse  
* methods
*****************************************************/
public class BTree 
{
    private int count;
    private Node root;
    
    /******************************************************
    ‘***  BTree
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Constructor
    ‘*** Initializes all the variables to there default 
    ‘*** values.
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public BTree()
    {
        count = 0;
        root = null;
    }
    
    /******************************************************
    ‘***  insert
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Allows access to the recursive function that does
    ‘*** the actual insertion into the tree. It is sent a
    ‘*** word of type string from the Gui class.
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public void insert(String word)
    {
        root = recInsert(root, word);
    }
    
    /******************************************************
    ‘***  recInsert
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Inserts the word into the tree. If the root is null
    ‘*** then a new node is created, representing the 
    ‘*** beginning of the tree. If there is a beginning node 
    ‘*** then there is a test if the word is smaller than  
    ‘*** the word being passed to it. If the word is smaller
    ‘*** or larger than the current nodes value, then it 
    ‘*** checks if the word being passed is already in the 
    ‘*** tree. If not then the left or right leaf is passed  
    ‘*** along with the word, depending on whether the word
    ‘*** is smaller or larger. This pattern is continued
    ‘*** until a null is passed. Once a null is received
    ‘*** then a new node is created, returned, and set in
    ‘*** either the roots left or right leaf. Then a 
    ‘*** reference to the updated tree is returned and 
    ‘*** assigned to the root variable in insert method.
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    private Node recInsert(Node aRoot, String word)
    {
        if(aRoot == null) //If the tree is empty or the leaf that is passed is 
                          //null then a new node is created and returned to 
                          //either the insert function or set as a right or left
                          //leaf.
        {
            Node newRoot = new Node(word, null, null);
            count++;
            
            return newRoot;
        }
        if(aRoot.getWord().compareTo(word) > 0) //If smaller than pass the left 
                                                //leaf and the word.
        {
            if(aRoot.getWord().compareTo(word) == 0)
                return aRoot;
            
            Node newRoot = recInsert(aRoot.getLeft(), word);
            aRoot.setLeft(newRoot);
        } 
        else //If larger than pass the right 
             //leaf and the word.
        {
            if(aRoot.getWord().compareTo(word) == 0)
                return aRoot;
            
            Node newRoot = recInsert(aRoot.getRight(), word);
            aRoot.setRight(newRoot);
        }
            
        return aRoot;
    }
    
    /******************************************************
    ‘***  getCount()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Returns the number of words in the text file. Neat
    ‘******************************************************
    ‘*** 09/29/2017
    ‘******************************************************/
    public int getCount()
    {
        return count;
    }
    
    /******************************************************
    ‘***  traverseTree()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Allows access to the method that creates the 
    ‘*** string that is returned and displayed to the gui. 
    ‘******************************************************
    ‘*** 09/29/2017
    ‘******************************************************/
    public String traverseTree()
    {
        return recTraverseTree(root);
    }
    
    /******************************************************
    ‘***  recTraverseTree()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** This creates the string that displays the words
    ‘*** in alphabetical order. The left of the every subtree
    ‘*** is traversed until the left is null. Then it jumps 
    ‘*** out of that call, and add the word in the 
    ‘*** previous node to the string until it reaches the
    ‘*** first left leaf. The first left leaf has a right 
    ‘*** leaf so it then starts to repeat the process for
    ‘*** that subtree.
    ‘******************************************************
    ‘*** 09/29/2017
    ‘******************************************************/
    private String recTraverseTree(Node aRoot)
    {
        String words = "";
        if(aRoot == null)
            return words; //This is just a way to stop the recursion. As the null
                         //leaf of the previous leaf is passed. There for the
                        //smallest or largest value will be concatinated once
                       //the line after the recursive call is finished.
        
        words += recTraverseTree(aRoot.getLeft()); //Traverses through the left
                                                  //branches in the tree for
                                                 //each node. Passed null once
                                                //the last leaf is reached, allowing
                                               //the current nodes value to be 
                                              //concatinated to the string.
        words += aRoot.getWord() + " " + "\n";
        words += recTraverseTree(aRoot.getRight());//Traverses through the right
                                                  //branches in the tree for
                                                 //each node. Passed null once
                                                //the last leaf is reached, allowing
                                               //the current nodes value to be 
                                              //concatinated to the string.
                                     
        return words;
    }
}
