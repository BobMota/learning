package beginLearning;

public class Lesson01Variant {

	public static void main(String[] args) {
		int eleNum = 99;
		String word = "elefantes";
		
		while (eleNum >0){
			
			if (eleNum ==1){
				
				word = "elefante"; //palavra no singular
				
			}
			
			System.out.println(eleNum + " "+word + " " +  "incomodam muita gente");

			eleNum = eleNum-1;
			
			if(eleNum > 0){
				
				System.out.println(eleNum + " "+word + " " + "incomodam um pouco menos");
			}else {
				
				System.out.println("não tem mais elefantes.");
				
			}//fim do else
				
		}//fim do if 
	}//fim do loop while
	

}
