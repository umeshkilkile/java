package interfaces;

public interface Add {
	int sum(int num1, int num2);
	float sum(float num1, float num2);
	int add();//add() method is same as add method in Sum interface
	
	//Interfaces can’t have static methods/fileds
	//int static staticField;
}
