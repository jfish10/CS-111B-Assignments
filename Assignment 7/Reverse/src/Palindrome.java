class Palindrome extends Reverse {
	
	
	public Palindrome() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!(obj instanceof Reverse)) return false;
		final Reverse other = (Reverse) obj;
		if(this.integer != other.integer) return false;
		return true;
	}
	
	public void checkPalindrome(Object obj) {
		//call equals method here 
		Reverse r = new Reverse();
		System.out.println("This is : " + r.equals(r));
		
		 
	}


public void isPalindrome(int integer) {
    int palindrome = integer;
    int reverse = 0;

    // Compute the reverse
    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

    // The integer is a palindrome if integer and reverse are equal
    if(integer==reverse) 
    	System.out.println("This is a palindrome");
    else 
    	System.out.println("Not a palindrome");
    

}
}