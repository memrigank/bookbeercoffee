public class id{

static int idn;


/*static void updateid(int id){
id = 1001;
}

public static void main(String[] args){

int id = 1000;
System.out.println(id);
updateid(id);
System.out.println(id);

}*/
static void updateid(id S1){
S1.idn=1001;
}

public static void main(String[] args){
	id S1 = new id();
	S1.idn = 1000;
	System.out.println(S1.idn);
	S1.updateid(S1);
	System.out.println(S1.idn);
}
}