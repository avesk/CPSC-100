class Power{

	double val;
	int e;
	double b;
	Power(double base, int exp){

		b = base;
		e = exp;
		if(exp==0)return;
		for(;exp>0;exp--) val = val*base;
	}

	double getPwr(){

		return val;

	}


}