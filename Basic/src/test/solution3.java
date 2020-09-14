package test;

import java.util.HashMap;

public class solution3 {

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150",
						 "python frontend senior chicken 210",
						 "python frontend senior chicken 150",
						 "cpp backend senior pizza 260",
						 "java backend junior chicken 80",
						 "python backend senior chicken 50"};
		
		String[] query = {"java and backend and junior and pizza 100",
						  "python and frontend and senior and chicken 200",
						  "cpp and - and senior and pizza 250",
						  "- and backend and senior and - 150",
						  "- and - and - and chicken 100",
						  "- and - and - and - 150"};
		int[] answer = new int[query.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// 조건 각각 비교할 수 있도록 분류
		String[][] member = new String[info.length][5];
		for(int i=0; i<info.length; i++) {
			String[] temp = info[i].split(" ");
			for(int j=0; j<temp.length; j++) {
				member[i][j] = temp[j];
			}
		}
		
		// 조건으로 맞는 사람 찾기
		for(int i=0; i<query.length; i++) {
			String[] temp = query[i].split(" ");
			
			// cpp, java, python 
			if("java".equals(temp[0])) {
				for(int j=0; j<member.length; j++) {
					if("java".equals(member[j][0])) {
						map.put(j, 1);
					} else {
						map.put(j, 0);
					}
				}
				
			} else if("cpp".equals(temp[0])) {
				for(int j=0; j<member.length; j++) {
					if("cpp".equals(member[j][0])) {
						map.put(j, 1);
					} else {
						map.put(j, 0);
					}
				}
			} else if("python".equals(temp[0])){
				for(int j=0; j<member.length; j++) {
					if("python".equals(member[j][0])) {
						map.put(j, 1);
					} else {
						map.put(j, 0);
					}
				}
			} else {
				for(int j=0; j<member.length; j++) {
					map.put(j, 1);
				}
			}
			
			// backend, frontend
			if("backend".equals(temp[2])) {
				for(int j=0; j<member.length; j++) {
					if("backend".equals(member[j][1])) {
						if(map.get(j)!=0) {
							map.put(j, 1);
						} else {
							map.put(j, 0);
						}
					} else {
						map.put(j, 0);
					}
				}
			} else if("frontend".equals(temp[2])) {
				for(int j=0; j<member.length; j++) {
					if("frontend".equals(member[j][1])) {
						if(map.get(j)!=0) {
							map.put(j, 1);
						} else {
							map.put(j, 0);
						}
					} else {
						map.put(j, 0);
					}
				}
			}
			
			// junior, senior 
			if("junior".equals(temp[4])) {
				for(int j=0; j<member.length; j++) {
					if("junior".equals(member[j][2])) {
						if(map.get(j)!=0) {
							map.put(j, 1);
						} else {
							map.put(j, 0);
						}
					} else {
						map.put(j, 0);
					}
				}
			} else if("senior".equals(temp[4])) {
				for(int j=0; j<member.length; j++) {
					if("senior".equals(member[j][2])) {
						if(map.get(j)!=0) {
							map.put(j, 1);
						} else {
							map.put(j, 0);
						}
					} else {
						map.put(j, 0);
					}
				}
			}
			
			// chicken, pizza
			if("chicken".equals(temp[6])) {
				for(int j=0; j<member.length; j++) {
					if("chicken".equals(member[j][3])) {
						if(map.get(j)!=0) {
							map.put(j, 1);
						} else {
							map.put(j, 0);
						}
					} else {
						map.put(j, 0);
					}
				}
			} else if("pizza".equals(temp[6])) {
				for(int j=0; j<member.length; j++) {
					if("pizza".equals(member[j][3])) {
						if(map.get(j)!=0) {
							map.put(j, 1);
						} else {
							map.put(j, 0);
						}
					} else {
						map.put(j, 0);
					}
				}
			}
			
			for(int j=0; j<member.length; j++) {
				if(Integer.parseInt(temp[7])<=Integer.parseInt(member[j][4])){ //200
					if(map.get(j)!=0) {
						map.put(j, 1);
					} else {
						map.put(j, 0);
					}
				} else {
					map.put(j, 0);
				}
			}
			int cnt = 0;
			for(int g=0; g<map.size(); g++) {
				if(map.get(g)==1) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}
		
		for(int ans : answer) {
			System.out.println(ans);
		}
		
	}

}
