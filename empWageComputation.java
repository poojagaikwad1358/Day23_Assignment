public class employeeWage {
     public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation Problem");
	//UseCase1 - Check employee present or absent
	int IsPresent=1;
	int empRatePerHrs=20;
	int empHrs=0;
	int empwage=0;

	double empcheck=Math.floor(Math.random() * 10)%2;
	if ( empcheck == IsPresent)
		empHrs=8;
	else
		empHrs=0;

		empwage=empHrs*empRatePerHrs;
		System.out.println("Employee Daily Wage= " +empwage); //Usecase2-daily wage
	}
}
