
import java.io.File;
import java.util.Random;

public class Main{

    public static void main(String[] args) {
	Random random = new Random(1234);
	File file = new File("C://input.txt");
	TwoLayerBackpropagation tlb = new TwoLayerBackpropagation(4, 4, 1, -1, 1, 0.1, random, file);
	tlb.train();
	tlb.writeNetwork("C://output.txt");
    }

}

