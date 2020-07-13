public class employeeWage {
	public static final int IsPresent=1;
       	public static final int IsPartTime=2;
        public static final int empRatePerHrs=20;

	public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage computation Problem");
	//UseCase1 - Check employee present or absent
	int empHrs=0;
	int empwage=0;

	int empcheck=((int)Math.floor(Math.random() * 10))%3;
	switch ((empcheck)) //UseCase4- Switch case
	{
		case IsPresent:
			empHrs=8;
			break;
		case IsPartTime:  //Usecase3-part time
			empHrs=4;
			break;
		default:
			empHrs=0;
	}
		empwage=empHrs*empRatePerHrs;
		System.out.println("Employee Daily Wage= " +empwage); //Usecase2-daily wage
	}
}
