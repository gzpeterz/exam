package First;
import java.util.*;
public class First {
	public static void main(String[] args) {
		System.out.println("һ���ж��ٸ�ѧ����");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] student=new String[n];
		for(int i=0;i<student.length;i++){
			System.out.println("�������"+(i+1)+"��ѧ����������");
			student[i]=in.next();
		}
		Random s=new Random(n+1);
		for(int i=0;i<student.length;i++){
			if(s.nextInt(n)==i){
				if(i==0){
					System.out.println("�����Ϊ��"+(s.nextInt(n+1)+1)+"ѧ������Ϊ:"+student[i]);
					break;
				}
				System.out.println("�����Ϊ��"+s.nextInt(n+1)+"ѧ������Ϊ:"+student[i]);
				break;
			}
		}
	}
}
