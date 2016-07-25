package com.week1.day5.assignment1;



public class MethodsAndFlow {

	private String[] stringArray;

	public MethodsAndFlow(){

	}

	public MethodsAndFlow(String[] stringArray) {

		this.stringArray = stringArray;
	}

	public void outputSubset(int startPosition, int numberOfValues) {

		//This method must output only the values in stringArray found at or between startPosition and the lesser of numberOfValues or stringArray.length - 1;

		if(stringArray == startPosition ||

			if(numberOfValues < stringArray.length - 1) {

			}
		if(numberOfValues < stringArray > stringArray.length - 1) {

			System.out.println(stringArray);
		}

		if(startPosition < 0 || startPosition > stringArray.length - 1) {

			startPosition = 0;
		}
		
		if(numberOfValues > stringArray.length - 1) {

			numberOfValues = stringArray.length - 1;
		}

	}

	public void outputAll() {

		outputSubset allValues = (stringArray);
		
		
	}


}


