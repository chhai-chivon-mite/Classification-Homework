
public class Flower {
	
	/*	
 		Attribute Information:
		1. sepal length in cm
		2. sepal width in cm
		3. petal length in cm
		4. petal width in cm
		5. class:
		-- Iris Setosa
		-- Iris Versicolour
		-- Iris Virginica
		*/
	
	private double sepalLength;
	private double sepalWidth;
	private double petalLength;
	private double petalWidth;
	private IrisClass irisClass;
	
	public double getSepalLength() {
		return sepalLength;
	}
	public void setSepalLength(double sepalLength) {
		this.sepalLength = sepalLength;
	}
	public double getSepalWidth() {
		return sepalWidth;
	}
	public void setSepalWidth(double sepalWidth) {
		this.sepalWidth = sepalWidth;
	}
	public double getPetalLength() {
		return petalLength;
	}
	public void setPetalLength(double petalLength) {
		this.petalLength = petalLength;
	}
	public double getPetalWidth() {
		return petalWidth;
	}
	public void setPetalWidth(double petalWidth) {
		this.petalWidth = petalWidth;
	}
	public IrisClass getIrisClass() {
		return irisClass;
	}
	public void setIrisClass(IrisClass irisClass) {
		this.irisClass = irisClass;
	}
	
}
