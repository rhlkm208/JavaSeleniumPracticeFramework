package ConceptualTrickyPrograms;

public class ArrayCovarianceRuntimeFailure {

	public static void main(String[] args) {

		Object[] arr = new String[3];
		arr[0] = "Java";
		arr[1] = 100;
	}
}


// Compiles successfully but throws: ArrayStoreException at runtime.