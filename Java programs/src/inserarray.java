


	import java.util.Arrays;

	public class inserarray {
	    public static void main(String[] args) {
	        // Sample array
	        int[] array = { 1, 2, 3, 45,45,43,23,4, 5 };
	        
	        // Element to insert
	        int elementToInsert = 10;
	        
	        // Position to insert (0-based index)
	        int insertPosition = 2;

	        // Check if the insert position is valid
	        if (insertPosition < 0 || insertPosition > array.length) {
	            System.out.println("Invalid insert position");
	            return;
	        }

	        // Create a new array with a length one greater than the original array
	        int[] newArray = new int[array.length + 1];

	        // Copy elements from the original array to the new array up to the insert position
	        for (int i = 0; i < insertPosition; i++) {
	            newArray[i] = array[i];
	        }

	        // Insert the new element at the specified position
	        newArray[insertPosition] = elementToInsert;

	        // Copy the remaining elements from the original array to the new array
	        for (int i = insertPosition + 1; i < newArray.length; i++) {
	            newArray[i] = array[i - 1];
	        }

	        // Print the updated array
	        System.out.println("Original Array: " + Arrays.toString(array));
	        System.out.println("Element to Insert: " + elementToInsert);
	        System.out.println("Insert Position: " + insertPosition);
	        System.out.println("Updated Array: " + Arrays.toString(newArray));
	    }
	}
