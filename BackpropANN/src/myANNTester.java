//********************************************
// Back-propagation Neural Network 
// Train on Boolean logic
// Nathaniel-Joel Parizi (Chapter 7: Implementation)
//********************************************

public class myANNTester {

	public static void main(String[] args) {

		float[][] trainingResults = new float[][] {

			new float[] { 0 },
			new float[] { 1 },
			new float[] { 1 },
			new float[] { 0 }};
		
		float[][] trainingData = new float[][] {
			new float[] { 0, 0 },
			new float[] { 0, 1 },
			new float[] { 1, 0 },
			new float[] { 1, 1 }};



		BackpropagationANN backpropANN = new BackpropagationANN(2, 3, 1);

		for (int iteration = 0; iteration < constantsANN.iteration; iteration++) {

			for (int i = 0; i < trainingResults.length; i++) {

				backpropANN.train(trainingData[i], trainingResults[i], constantsANN.LEARNING_RATE,
						constantsANN.momentum);

			}

			System.out.println("\n**********************");

			for (int i = 0; i < trainingResults.length; i++) {
				float[] t = trainingData[i];
				System.out.println("Number of epochs:" + iteration+1);
				System.out.printf("%.1f %.1f ---> %.3f\n", t[0], t[1], backpropANN.run(t)[0]);

			}

		}
	}

}
