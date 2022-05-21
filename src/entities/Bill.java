package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softdrink;

	public double cover() {
		if (feeding() > 30) {
			return 0;
		} else {
			return 4;
		}
	}

	public double feeding() {
		return  beer * 5 + softdrink * 3 + barbecue * 7;
		
	}

	public double ticket() {
		if (gender == 'F')   {
			return 8.00;
		} 
		else  {
			return 10.00;
		}
	}

	public double total() {
		return  cover() + feeding() + ticket();	 
	}

}




                     //Projeto da classe (UML) //
       
          // Bill- conta  //

         // gender - Gênero sexual //
        // beer- cerveja //                  -> // Atributos da classe //
       // barbecue-churrasco//
      // softdrink-  drinque suave //


     // cover- Couvert  //
    // feeding-consumo//     -> Métodos da classe ou funções
   //ticket-Ingresso //
  //total //





