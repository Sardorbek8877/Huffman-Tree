public class HuffmanTree {

    private HuffmanTriple content;
    private HuffmanTree leftChild, rightChild;

    public HuffmanTree(){
        content = null;
        leftChild = null;
        rightChild = null;
    }

    public HuffmanTree( HuffmanTriple t ){
        content = t;
        leftChild = new HuffmanTree();
        rightChild = new HuffmanTree();
    }

    public HuffmanTree( HuffmanTree lc, HuffmanTree rc ){
        content = new HuffmanTriple(' ', lc.getContent().getQuantity() + rc.getContent().getQuantity());
        leftChild = lc;
        rightChild = rc;
    }

    public boolean isEmpty(){
        return content == null;
    }

    public boolean isLeaf(){
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public HuffmanTriple getContent(){
        if( !isEmpty() ){
            return content;
        }
        else {
            throw new IllegalStateException();
        }
    }

    public int compareTo( HuffmanTree other ){
        if ( !isEmpty() && !other.isEmpty() ){
            return content.compareTo(other.content);
        }
        else{
            throw new IllegalStateException();
        }
    }
}
