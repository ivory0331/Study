package programmers.level2;

public class 스킬트리 {

	public static void main(String[] args) { // 왜 틀리지???
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		
		for(int i=0; i<skill_trees.length; i++) {
			
			for(int j=0; j<skill_trees[i].length(); j++) {
				
				String s = String.valueOf(skill_trees[i].charAt(j));
				
				if(!skill.contains(s)) {
					skill_trees[i] = skill_trees[i].replace(s, "");
				}
			}
			if(skill.indexOf(skill_trees[i])==0) {
				answer++;
			}
		}
		
	}

}
