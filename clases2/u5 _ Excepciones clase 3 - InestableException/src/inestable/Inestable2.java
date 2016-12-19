package inestable;

import excepciones.InestableException2;

public class Inestable2 extends Inestable {

	@Override
	public void hacer() throws InestableException2 {
		
		throw new InestableException2();

	}

}
