package inestable;

import excepciones.InestableException1;

public class Inestable1 extends Inestable {

	@Override
	public void hacer() throws InestableException1 {

		throw new InestableException1();

	}

}
