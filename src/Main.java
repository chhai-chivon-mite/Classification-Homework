import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	// 1. Find sample attributes'value of Setosa, Verginica, Versicolor
	// 2. Using eclidean distace similarity make a prediction for a record
	//    (Sepal Length : 3.1, Sepal Width : 2.3,Petal Length : 1.5, PetalWidth : 2.8)
	
	public static double sepalLength = 3.1;
	public static double sepalWidth = 2.3;
	public static double petalLength = 1.5;
	public static double petalWidth = 2.8;
	
	
	public static void main(String[] agrs) throws IOException {
		Map<Flower,Double> result = new HashMap<>();
	    for(Flower f : getFlowsers()) {	    	
	    	double distanceValue = calculateDistance(getInstance(),f);
	    	System.out.println("Distance Value = " + distanceValue);
	    	result.put(f, distanceValue);
	    }
	}
	
	private static Flower getInstance() {
		Flower f = new Flower();
		f.setSepalLength(sepalLength);
		f.setSepalWidth(sepalWidth);
		f.setPetalLength(petalLength);
		f.setPetalWidth(petalWidth);
		return f;
	}
	
	private static double calculateDistance(Flower from, Flower to) {
		 double distance = 0.0;
	     distance += Math.pow(from.getSepalLength() - to.getSepalLength(), 2);
	     distance += Math.pow(from.getSepalWidth() - to.getSepalWidth(), 2);
	     distance += Math.pow(from.getPetalLength() - to.getPetalLength(), 2);
	     distance += Math.pow(from.getPetalWidth() - to.getPetalWidth(), 2);
	     return Math.sqrt(distance);
	}
	
	public static List<Flower> getFlowsers() throws IOException{
		List<Flower> flowsers = new ArrayList();
		
	    String data = readFile("iris.data");
	    String datas[] = data.split("\\r?\\n");

	    for(int i = 0 ; i < datas.length ; i++) {
	    	String[] objects = datas[i].split(",");
	    	Flower f = new Flower();
	    	f.setSepalLength(Double.valueOf(objects[0]));
	    	f.setSepalWidth(Double.valueOf(objects[1]));
	    	f.setPetalLength(Double.valueOf(objects[2]));
	    	f.setPetalWidth(Double.valueOf(objects[3]));
	    	f.setIrisClass(IrisClass.findByValue(objects[4]));
	    	flowsers.add(f);
	    }
	    return flowsers;
	}

	public static String readFile(String filename) throws IOException{
	    String content = null;
	    File file = new File(filename);
	    FileReader reader = null;
	    try {
	        reader = new FileReader(file);
	        char[] chars = new char[(int) file.length()];
	        reader.read(chars);
	        content = new String(chars);
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if(reader != null){
	            reader.close();
	        }
	    }
	    return content;
	}
}
