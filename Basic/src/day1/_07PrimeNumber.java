package day1;

public class _07PrimeNumber { // �Ҽ����� �����ϱ�

	public static void main(String[] args) {
		
		int num = 13;
		
		// �Ҽ� -> 1�� �ڱ��ڽ��� �����ϰ� ������ �������� ����� ���� ����
		
		boolean isPrimeNumber = true;
		
		for(int i=2; i<=num-1; i++) { // 1���� 13���� ��������. �� 1�� �ڱ��ڽ��� ����(������ ��� ���ڿ� �ش��ϴϱ�)
			if(num % i == 0) {
				// ���� ���� primeNumber�� �ƴ�
				isPrimeNumber = false;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println(num+" �� �Ҽ� �Դϴ�");
		}
		else {
			System.out.println(num+" �� �Ҽ��� �ƴմϴ�");
		}
	}

	
	// for������ i<=num-1; ��ſ� i<= num/2��� �ص� ���� ���´�.
}
