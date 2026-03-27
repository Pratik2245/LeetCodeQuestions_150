public class LD_2946MatrixSimilarityAfterCyclicShifts {
    public static void main(String[] args) {
     int mat[][]={{1,2,1,2},{5,5,5,5},{6,3,6,3}};
     int k = 2;
        System.out.println(areSimilar(mat,k));
    }
    public static boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        k=k%m;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(i%2==0){
                    //  left shift <--
                    if(mat[i][j]!=mat[i][(j+k)%m]){
                        return false;
                    }
                }else{
                    //  right shift -->
                    if(mat[i][j]!=mat[i][(j-k+m)%m]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
