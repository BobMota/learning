package beginLearning;

public class Lesson01Variant02 {

	public static void main(String[] args) {
		
			int eleNum = 1;
			String word = "elefantes";
			
			while (eleNum <99){
				
				if (eleNum ==1){
					
					word = "elefante"; //palavra no singular
					
				}
				
				System.out.println(eleNum + " "+word + " " +  "incomoda muita gente");

				eleNum = eleNum+1;
				
				if(eleNum > 1){
					
					System.out.println(eleNum + " "+word + " " + "incomodam muito mais.");
				}else {
					
					System.out.println("não tem mais elefantes.");
					
				}//fim do else
					
			}//fim do if 
		}//fim do loop while
	}

