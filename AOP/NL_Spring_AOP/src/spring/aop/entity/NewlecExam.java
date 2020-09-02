package spring.aop.entity;

public class NewlecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;

	public NewlecExam() {

	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	@Override
	public int total() {
		//long start = System.currentTimeMillis(); 
		
		int result = kor + eng + math + com; // 사용자를 위한 업무
		
		if (kor > 100)
			throw new IllegalArgumentException("유효하지 않은 국어 점수");

//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		long end = System.currentTimeMillis();
//		String message = (end - start) + "ms 시간이 걸렸습니다";
//		
//		System.out.println(message); // 개발자를 위한 업무
		
		return result;
	}

	@Override
	public float avg() {
		
		float result = (float) (total() / 4.0);
		
		return result;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

}
