//菱形
public class lx4 {
    public static void main(String[] args) {
        //前五行的三角形
    	//控制行数
        for(int i=1;i<=5;i++) {
            //控制空格
            for(int k=5-i;k>=0;k--) {
                System.out.print(" ");
            }
            //控制每行的*
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
        System.out.println();
        }
        //后四行的三角形
        //控制行数
        for(int i=4;i>=1;i--) {
            //控制空格
        	for(int k=5-i;k>=0;k--) {
                System.out.print(" ");
            }
        	//控制每行的*
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
            //打印图案
        System.out.println();
        }
    }
}
