/* Datoon, Philip Bryan B.
 * 131311399
 * Project - Cluster 2 (Vehicle Identification Number)
 */
 
class VIN {
   private String VIN;
   private boolean isValid;
   private int TotalWeight;
	
   public void setVIN(String VIN) {
   // converts all letters to upper case once VIN is set
      VIN = VIN.toUpperCase();
   
      this.VIN = VIN;
   }

   public String getVIN() {
      return this.VIN;
   }

   public boolean isLengthValid() {
      boolean isLengthValid = true;
   
   // checks VIN length
      if (getVIN().length() != 17) {
         System.out.println("ERROR: VIN must have 17 characters.");
         isLengthValid = false;
      }
   
      return isLengthValid;
   }

	public boolean hasNoIllegalValues() {
		boolean hasNoIllegalValues = true;
		
      for (int x = 0; x < getVIN().length(); x++) {
         // checks if has I, O, or Q, or illegal characters
         if (getVIN().charAt(x) == 'I' || getVIN().charAt(x) == 'O' || getVIN().charAt(x) == 'Q') {
               System.out.println("ERROR: VIN has letter " + getVIN().charAt(x) + ".");
               hasNoIllegalValues = false;
         } else if (!Character.isLetterOrDigit(getVIN().charAt(x))) {
               System.out.println("ERROR: VIN has illegal character " + getVIN().charAt(x) + ".");
               hasNoIllegalValues = false;
         }
         
         // checks if last four characters are digits
         if (x >= 13) {
            if (!Character.isDigit(getVIN().charAt(x))) {
               System.out.println("ERROR: " + (x + 1) + "th character must be a digit.");
               hasNoIllegalValues = false;
            }
         }
      }
		
		return hasNoIllegalValues;
	}

   public int computeWeight() {
      this.TotalWeight = 0;
      String letter = "ABCDEFGHJKLMNPRSTUVWXYZ";
      String value = "12345678123457823456789";
      int[] weight = new int[] {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
   
      for (int x = 0; x < getVIN().length(); x++) { 
      // performs this IF statement if VIN character is a digit          
         if (Character.isDigit(getVIN().charAt(x))) {
            // converts digit in VIN (char) to int
            int digitVIN;
            digitVIN = Character.getNumericValue(getVIN().charAt(x));
            
            TotalWeight += weight[x] * digitVIN;     
         } else if (Character.isLetter(getVIN().charAt(x))) {
         	// performs this ELSE-IF statement if VIN character is a letter
            for (int y = 0; y < letter.length(); y++) {
               if (getVIN().charAt(x) == letter.charAt(y)) {                        
                  // converts digit in value (char) to int
                  int valueInt;
                  valueInt = Character.getNumericValue(value.charAt(y));
               
                  TotalWeight += weight[x] * valueInt;
               }
            }
         }
      }
   
      return TotalWeight;
   }

   public boolean isCheckDigitValid() {
      boolean isCheckDigitValid = true;
   
      if (computeWeight() % 11 == 10) {
         if (getCheckDigit() != 'X') {
            System.out.println("ERROR: Check digit is incorrect.");
            isCheckDigitValid = false;
         }
      } else {
         if (Character.getNumericValue(getCheckDigit()) != computeWeight() % 11) {
            System.out.println("ERROR: Check digit is incorrect.");
            isCheckDigitValid = false;
         }
   	}
		
      return isCheckDigitValid;
   }

   public boolean isVINValid() {
   // checks if VIN is valid
      if (isLengthValid() && hasNoIllegalValues() && isCheckDigitValid()) {
         isValid = true;
      } else {
         isValid = false;
      }
   
      return isValid;
   }

   public String getWorldIdentifier() {
      return this.VIN.substring(0,3);
   }

   public char getCountry() {
      return this.VIN.charAt(0);
   }

   public char getManufacturer() {
      return this.VIN.charAt(1);
   }

   public char getMake() {
      return this.VIN.charAt(2);
   }

   public String getDescSection() {
      return this.VIN.substring(3, 8);
   }

   public char getCheckDigit() {
      return this.VIN.charAt(8);
   }

   public String getIDSection() {
      return this.VIN.substring(9, 17);
   }
}