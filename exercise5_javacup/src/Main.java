
public class Main {
    public static void main(String[] args){

        Matrix matrix = new Matrix(2,3);
        Matrix matrix2 = new Matrix(2, 3);
        System.out.println(matrix.isSquareMatrix());
        System.out.println(matrix.getElements());
        System.out.println(matrix.getRow());
        System.out.println(matrix.getColumn());
        matrix.toLowerTriangular();
        System.out.println(matrix.getRow());
        System.out.println(matrix.getColumn());
        matrix.toUpperTriangular();
        System.out.println(matrix.getRow());
        System.out.println(matrix.getColumn());

        matrix.setElement(0,1,12);
    }
}
