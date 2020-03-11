package lab5_abstraction.problem1.rulesets;

import java.awt.Component;

import lab5_abstraction.problem1.gui.CDWindow;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cd;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cd = (CDWindow) ob;
		nonemptyRule();
		priceisfloatRule();
		pricegreaterthan049Rule();
	}
	private void nonemptyRule() throws RuleException {
		if(cd.getArtistValue().trim().isEmpty() ||
				cd.getTitleValue().trim().isEmpty() ||
				cd.getPriceValue().trim().isEmpty() ){
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void priceisfloatRule() throws RuleException {
		String val = cd.getPriceValue().trim();
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
		String val = cd.getPriceValue().trim();
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
