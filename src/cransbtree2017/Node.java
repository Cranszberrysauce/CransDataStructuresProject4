package cransbtree2017;

/*****************************************************
***  Node
***  Nick Crans
******************************************************
*** This class creates a node that contains a word
*** and contains pointers to two more nodes.
******************************************************
* 09/26/2017: Class created 
* 09/26/2017: Created and finished the sets and gets for 
* the word, left leaf, and right leaf
*****************************************************/
public class Node 
{
    private String word;
    private Node leftLeaf;
    private Node rightLeaf;
    
    /******************************************************
    ‘***  Node
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Constructor
    ‘*** Initializes all the variables to there default 
    ‘*** values.
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public Node()
    {
        word = "";
        leftLeaf = null;
        rightLeaf = null;
    }
    
    /******************************************************
    ‘***  Node
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Constructor
    ‘*** Initializes all the variables with the the values 
    ‘*** that is passed to it when a new node is created
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public Node(String word, Node leftLeaf, Node rightLeaf)
    {
        this.word = word;
        this.leftLeaf = leftLeaf;
        this.rightLeaf = rightLeaf;
    }
    
    /******************************************************
    ‘***  getLeft()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Returns the pointer to the left leaf
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public Node getLeft()
    {
        return leftLeaf;
    }
    
    /******************************************************
    ‘***  getRight()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Returns the pointer to the right leaf
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public Node getRight()
    {
        return rightLeaf;
    }
    
    /******************************************************
    ‘***  getWord()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Returns the word stored in the node
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public String getWord()
    {
        return word;
    }
    
    /******************************************************
    ‘***  setLeft()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Assigns a reference to the left leaf in the tree
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public void setLeft(Node leftLeaf)
    {
        this.leftLeaf = leftLeaf;
    }
    
    /******************************************************
    ‘***  setReft()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Assigns a reference to the right leaf in the tree
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public void setRight(Node rightLeaf)
    {
        this.rightLeaf = rightLeaf;
    }
    
    /******************************************************
    ‘***  setWord()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Assigns the value passed to the word variable in
    ‘*** the node.
    ‘******************************************************
    ‘*** 09/26/2017
    ‘******************************************************/
    public void setWord(String word)
    {
        this.word = word;
    }
}
