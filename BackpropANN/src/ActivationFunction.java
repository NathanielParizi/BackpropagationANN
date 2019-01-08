
public class ActivationFunction {

	
	public static float dSigmoid(float x) {
		
		return x * (1 -x);
	}

	public static float sigmoid(float x) {
		// TODO Auto-generated method stub
		return (float) (1/ (1+ Math.exp(-x)));
	}

}
