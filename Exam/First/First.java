package First;
import java.util.*;
public class First {
	public static void main(String[] args) {
		System.out.println("一共有多少个学生？");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] student=new String[n];
		for(int i=0;i<student.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生的姓名：");
			student[i]=in.next();
		}
		Random s=new Random(n+1);
		for(int i=0;i<student.length;i++){
			if(s.nextInt(n)==i){
				if(i==0){
					System.out.println("随机数为："+(s.nextInt(n+1)+1)+"学生姓名为:"+student[i]);
					break;
				}
				System.out.println("随机数为："+s.nextInt(n+1)+"学生姓名为:"+student[i]);
				break;
			}
		}
	}
}
