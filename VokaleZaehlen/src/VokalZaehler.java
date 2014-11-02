
public class VokalZaehler {
	
	
	public Integer zaehleVokale(String zeichenKette) {
		Integer aktuellePosition = 0;
		Integer letztePosition = zeichenKette.length()-1;
		Integer anzahlVonA = 0;
		Integer anzahlVonVokal = 0;
		String zeichenKetteklein = zeichenKette.toLowerCase();
		
		while(aktuellePosition <= letztePosition) {
			Character buchstabe = zeichenKetteklein.charAt(aktuellePosition);
			
			
			if(buchstabe == 'a') {
				anzahlVonA++;
			}
			if(buchstabe == 'a') {
				anzahlVonVokal++;
			}
			if(buchstabe == 'e') {
				anzahlVonVokal++;
			}
			if(buchstabe == 'i') {
				anzahlVonVokal++;
			}
			if(buchstabe == 'o') {
				anzahlVonVokal++;
			}
			if(buchstabe == 'u') {
				anzahlVonVokal++;
			}
			
			
			aktuellePosition++;

		}
		System.out.println("Anzahl aller a's in '" + zeichenKette + "': " + anzahlVonA);
		
		System.out.println("Anzahl aller Vokale in '" + zeichenKette + "': " + anzahlVonVokal);
		return 0;
	}

}
