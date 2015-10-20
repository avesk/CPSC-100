class PowerDemo{

	public static void main(String[] args)
	throws java.io.IOException{

		char b;
		char e;

		do{
			System.out.println("Enter a base");
			b = (char) System.in.read();

			switch(b){

				case 'A':
				b = 2;
				break;

				case 'B':
				b = 10;
				break;

				case 'C':
				b = 16;
				break;
			}

			System.out.println("enter an Exp");
			e = (char) System.in.read();

			switch(e){

				case 'A':
				e = 2;
				break;

				case 'B':
				e = 3;
				break;

				case 'C':
				e = 4;
				break;
			}

			Power x = new Power(b, e);

			System.out.println(x.getPwr());

		} while(b != '.' & e != '.');

		
		}



	 }
	 




		

	
