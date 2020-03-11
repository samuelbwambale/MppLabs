package lab5_abstraction.problem1.rulesets;



import java.awt.Component;

import lab5_abstraction.problem1.gui.BookWindow;





/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bkw;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		bkw = (BookWindow) ob;
		nonemptyRule();
		isbnNumericRule();
		isbnLengthRule();
		isbnLength10Rule();
		isbnLength13Rule();
		priceisfloatRule();
		pricegreaterthan049Rule();
		
	}

	private void nonemptyRule() throws RuleException {
		if(bkw.getIsbnValue().trim().isEmpty() ||bkw.getTitleValue().trim().isEmpty() ||bkw.getPriceValue().trim().isEmpty() )
		{
			throw new RuleException("All fields must be non-empty!");
		}
	}
	
	private void isbnNumericRule() throws RuleException {
		String val = bkw.getIsbnValue().trim();
		try {
			Integer.parseInt(val);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}		
	}
	
	private void isbnLengthRule() throws RuleException {
		String val = bkw.getIsbnValue().trim();
		try {
			
			if(((val.length()) != 10) && ((val.length()) != 13 )) 
		throw new RuleException("ISBN must have 10 or 13 digits");
			
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}
	}
	
	private void isbnLength10Rule() throws RuleException {
		String val = bkw.getIsbnValue().trim();
		try {
			if((val.length())==10)
			{
			String first = ""+val.charAt(0);
			//System.out.println(first);
			if(Integer.parseInt(first)!=0 && Integer.parseInt(first)!=1)
				throw new RuleException("The first digit must be 0 or 1");
			}
			
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}
		//if(val.length() != 10 || val.length() != 13 ) throw new RuleException("ISBN must have 10 or 13 digits");
	}
	
	private void isbnLength13Rule() throws RuleException {
		String val = bkw.getIsbnValue().trim();
		try {
			
			if(val.length()==13)
			{
			String first = bkw.getIsbnValue().substring(0,3);
			//String first = ""+val.charAt(0);
			if(Integer.parseInt(first)!=978 && Integer.parseInt(first)!=979)
				throw new RuleException("The first 3 digits must be either 978 or 979");
			}
			
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}
	//	if(val.length() != 10 || val.length() != 13 ) throw new RuleException("ISBN must have 10 or 13 digits");
	}
	
	private void priceisfloatRule() throws RuleException {
		String val = bkw.getPriceValue().trim();
		try {
			
			Float.parseFloat(val);
			String[] arraySplit_3 = val.split("\\.",2);
			System.out.println(arraySplit_3.length);
			
			if(arraySplit_3.length!=2)
				throw new RuleException("Price must be float with two decimal places");
			else
			{
				String arraySplit = val.split("\\.",2)[1];
				if(arraySplit.length()!=2)
				{
					throw new RuleException("Price must be float with two decimal places");
				}
			}
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be float with two decimal places");
		}		
	}

	private void pricegreaterthan049Rule() throws RuleException {
		String val = bkw.getPriceValue().trim();
		try {
			float price = Float.parseFloat(val);
			
			if(price<=0.49)
				throw new RuleException("Price must be a number greater than 0.49");
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be a number greater than 0.49");
		}		
	}

}
