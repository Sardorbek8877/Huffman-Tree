public class HuffmanTriple {

    private char token;
    private String code;
    private int quantity;

    public HuffmanTriple( char t, int q ){
        token = t;
        code = "";
        quantity = q;
    }

    public HuffmanTriple( char t ){
        this( t, 1 );
    }

    public HuffmanTriple(){
        this(' ', 0);
    }
}
