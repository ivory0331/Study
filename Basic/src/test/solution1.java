package test;

public class solution1 {

	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
		String answer = "";
		// ��� �ҹ��ڷ�
		new_id = new_id.toLowerCase(); //...!@bat#*..y.abcdefghijklm
		// ���ĺ� ���� ������ Ư������ ����
		char[] idArr = new_id.toCharArray();
		new_id = "";
		for(int i=0; i<idArr.length; i++) {
			if((97<=idArr[i]&&idArr[i]<=122)||(0<=idArr[i]-'0'&&idArr[i]-'0'<=9)||idArr[i]==45||idArr[i]==95||idArr[i]==46) {
				new_id += idArr[i]; //...bat..y.abcdefghijklm
			} 
		} 
		// �ߺ� �� ����
		idArr = new_id.toCharArray();
		new_id = "";
		for(int i=0; i<idArr.length; i++) {
			if(idArr[i]==46) {
				if(idArr.length>=2) {
					if(i!=idArr.length-1) {
						if(idArr[i]!=idArr[i+1]) new_id += idArr[i];
					}
					else new_id += idArr[i];
				}else {
					new_id += idArr[i];
				}
			} else new_id += idArr[i]; //z-.
		}
		// ��ó�� ������ ���� ����
		idArr = new_id.toCharArray();
		if(idArr[0]==46) {
			new_id = "";
			for(int i=1; i<idArr.length; i++) {
				new_id += idArr[i]; //bat.y.abcdefghijklm
			}
		} else if(idArr[idArr.length-1]==46) {
			new_id = "";
			for(int i=0; i<idArr.length-1; i++) {
				new_id += idArr[i]; //bat.y.abcdefghijklm
			}
		}		
		// ���ڿ��� ����ٸ�
		idArr = new_id.toCharArray();
		if(idArr.length==0) {
			new_id = "";
			new_id = "a";
		}
		// ���ڿ��� 16�� �̻��̸�
		idArr = new_id.toCharArray();
		if(idArr.length>=16) {
			new_id = "";
			for(int i=0; i<15; i++) {
				new_id += idArr[i];
			} //bat.y.abcdefghi
		}
		//�ٵ� ������ �� �������� .�̶��
		char d = new_id.charAt(new_id.length()-1);
		if(d==46) {
			new_id =new_id.substring(0,new_id.length()-1);
		}
		// ���ڿ��� 2�� ���϶��
		idArr = new_id.toCharArray(); //z-
		if(idArr.length<=2) {
			char t = idArr[idArr.length-1]; // ������ ���� -
			for(int j=0; j<3; j++) {
				if(new_id.length()==3) break;
				else new_id += t;
			}
		}

		System.out.println(new_id);
	}

}
