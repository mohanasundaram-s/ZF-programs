import java.util.*;
class selectionSort{
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the total no.of.elements :");

		// to get the length of the array
		int noOfElement = inputScanner.nextInt();
		int[] userElement = new int[noOfElement];
		System.out.println("Enter the Elements");

		//to get the elements one by one
		for(int i=0;i<noOfElement;i++){
			System.out.print("array["+i+"] :");
			int elements = inputScanner.nextInt();
			userElement[i] = elements;
			//userElement[i] = inputScanner.nextInt();
		}

		// storing userinput in an another array and sorting the array
		int[] elementsArr = userElement;
		for(int i=0;i<elementsArr.length-1;i++){
			int position = i;
			for(int j=i+1;j<elementsArr.length;j++){
				if(elementsArr[j]<elementsArr[i]){
					position = j;
				}
			}
			int temp = elementsArr[position];
			elementsArr[position] = elementsArr[i];
			elementsArr[i] = temp;
		}
		
		System.out.print(Arrays.toString(elementsArr));
		/*
		for each loop not needed for printing the sorted array:
		for(int i=0;i<elementsArr.length;i++){
			for(int j=i+1;j<elementsArr.length;j++){
				if(elementsArr[j]<elementsArr[i] && i<elementsArr.length-1){
					int temp = elementsArr[j];
					elementsArr[j] = elementsArr[i];
					elementsArr[i] = temp;
				}
			}
			//System.out.println(elementsArr[i]);
		}
		
		
		// printing the elements in the array in foreach loop
		System.out.print("Sorted Array :");
		for(int elements:elementsArr){
			System.out.print(elements+" ");
		}
		System.out.println();*?
	}
}
