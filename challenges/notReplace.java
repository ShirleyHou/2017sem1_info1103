//this is suppose to be a method.
public String notReplace(String str){
	int p = str.indexOf("is");
	int check;
	while(p != -1)
	{
  	check = 0;
  	if(p > 0)
  	{
			if(!Character.isLetter(str.charAt(p-1)))
				check++;
		}
		else{
			check++;
		}

		if(p < str.length()-2)
  	{
			if(!Character.isLetter(str.charAt(p+2))){
				check++;
			}
		}
		else{
			check++;
		}
		if(check == 2)
			str = str.substring(0, p) + "is not" + str.substring(p+2);
		p = str.indexOf("is", p+2);
	}
	return str;
}
