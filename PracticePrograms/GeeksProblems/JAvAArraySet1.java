package GeeksProblems;

public class JAvAArraySet1 {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        int n=5;
        String s=average(a,n);
        System.out.println(s);
    }
    static String average(int A[], int N)
    {
        int sum=0;
        for (int i = 0; i < A.length ; i++) {
            sum+=A[i];
        }

        double avg= sum/N;
        return sum+" "+String.format("%.02f", avg);
    }
}
