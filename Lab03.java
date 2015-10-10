import java.util.Scanner;

class lab03{ 

public static void main(String[] args){

int a = 4;
int b = 40;
int c = 2;

int firstnum = 0, secnum = 0, thirnum = 0;

	if(b<a){

		firstnum = b;
		secnum = a;
		thirnum = c;
		
		if(a<c){

			firstnum = b;
			secnum = a;
			thirnum = c;

		}

		else if(a>c){

		firstnum = b;
		secnum = c;
		thirnum = a;

		if(b>c){

		firstnum = c;
		secnum = b;
		thirnum = a;

		}

		}

	}

	else if(b>a){

		firstnum = a;
		secnum = b;
		thirnum = c;

		if(b<c){

		firstnum = a;
		secnum = b;
		thirnum = c;
		}

		else if(b>c){

		firstnum = a;
		secnum = c;
		thirnum = b;

		if(a>c){

		firstnum = c;
		secnum = a;
		thirnum = b;
		}

		}
	}
	

System.out.println(firstnum + ", " + secnum + ", " + thirnum );


}


}




