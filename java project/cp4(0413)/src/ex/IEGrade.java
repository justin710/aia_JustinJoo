package ex;

public class IEGrade {

	public static void main(String[] args) {

		int score = 79;

		String grade = ""; // A+,A,A-,B+,B,B-,C

		if (score >= 90) {
			grade = "A";

			if (score >= 98) {
				grade = grade + "+";
			} else if (score < 94) { // 90이상
				grade = grade + "-";
 
		}
		}else if (score >= 80) {
				grade = "B";

				if (score >= 88) {
					grade = grade + "+";
				} else if (score < 84) { // 80이상
					grade = grade + "-";

				}
			}
		else {
			grade = "C";
		}

		System.out.println(grade);
		// 100~98:A+, 97~94:A, 93~90 : A-
		/*
		 * if(score>=98 && score<=100) { grade="A+"; } if(score>=94 && score<=97) {
		 * grade="A+"; } if(score>=90 && score<=93) { grade="A+"; }
		 */
	}}
