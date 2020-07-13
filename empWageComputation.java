public class employeeWage {
     public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation Problem");
	//UseCase1 - Check employee present or absent
	int IsPresent=1;
	int IsPartTime=2;
	int empRatePerHrs=20;
	int empHrs=0;
	int empwage=0;

	double empcheck=Math.floor(Math.random() * 10)%3;
	if ( empcheck == IsPresent)
		empHrs=8;
	else if (empcheck == IsPartTime) //UseCase3- Part time
		empHrs=4;

		empwage=empHrs*empRatePerHrs;
		System.out.println("Employee Daily Wage= " +empwage); //Usecase2-daily wage
	}
}
