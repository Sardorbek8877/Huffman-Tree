public class Main {
    public static void main(String[] args) {
//        HuffmanTriple[] tokens1 =
//                { new HuffmanTriple('a', 30),
//                  new HuffmanTriple('b', 20),
//                  new HuffmanTriple('c', 10),
//                  new HuffmanTriple('d', 15),
//                  new HuffmanTriple('e', 80)
//                };
//
//        HuffmanCoding hc = new HuffmanCoding(tokens1);
//        hc.showCodeTable();

        HuffmanTriple[] tokens2 =
                { new HuffmanTriple('a', 5),
                        new HuffmanTriple('b', 6),
                        new HuffmanTriple('c', 9),
                        new HuffmanTriple('d', 10),
                        new HuffmanTriple('e', 15),
                        new HuffmanTriple('f', 28),
                        new HuffmanTriple('g', 32)
                };

        HuffmanCoding hc = new HuffmanCoding(tokens2);
        hc.showCodeTable();
    }
}