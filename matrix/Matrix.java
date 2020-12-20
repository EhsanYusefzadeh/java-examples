
/*
* I learned I have to make and initialize the array everywhere row and column defines
* always was showing errors to me
*/

public class Matrix {
	private int row;
	private int column;
	private int[][] elements;


	public Matrix(){
		this.row = 0;
		this.column = 0;

		elements = new int[row][column];
		for(int i = 0; i<row; i++){
			for(int j=0; j<column; j++){
				elements[i][j] = 0;
			}
		}
	}

	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;


		elements = new int[row][column];
		for (int i = 0; i< row; i++){
			for (int j = 0; j<column; j++){
				elements[i][j] = 0;
			}
		}
	}
	
	public Matrix(int length){
		this.row = length;
		this.column = length;

		elements = new int[row][column];
		elements = new int[row][column];
		for(int i = 0; i<row; i++){
			for(int j=0; j<column; j++){
				elements[i][j] = 0;
			}
		}
	}
	
	public Matrix(int[][] elements){
		this.row = elements.length;
		this.column = elements[0].length;
		this.elements = elements;
	}
	
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public int[][] getElements() {
		return elements;
	}

	public boolean add(Matrix newMatrix) {
		if(this.row == newMatrix.getRow() && this.column == newMatrix.getColumn()){
			for(int i = 0; i < this.row; i++){
				for(int j = 0; j < this.column; j++){
					this.elements[i][j] += newMatrix.getElements()[i][j];
				}
			}
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setElement(int i, int j, int value){
			this.elements[i][j] = value;
	}

	public boolean isSquareMatrix() {
		if(this.row == this.column){
			return true;
		}else {
			return false;
		}
	}

	public void toLowerTriangular() {
		if(isSquareMatrix()){
			for (int i = 0; i < this.row; i++){
				for (int j = 0; j<this.column; j++){
					if(i < j){
						this.elements[i][j] = 0;
					}
				}
			}
		}
	}

	public void toUpperTriangular() {
		if(isSquareMatrix()){
			for (int i = 0; i < this.row; i++){
				for (int j = 0; j<this.column; j++){
					if(i > j){
						this.elements[i][j] = 0;
					}
				}
			}
		}
	}
}