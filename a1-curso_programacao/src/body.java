import java.util.Locale;

public class body {
	public static void main(String[] args)
{
String prod1 = "computer";
String prod2 = "Office desk";

int age = 30;
int code = 5290;
char gender = 'F';

double price1 = 2100.0;
double price2 = 650.0;
double measure = 53.234567;


	System.out.print("Products: \n\n");
	System.out.printf("%s, which price is $ %.2f \n",prod1, price1);
	System.out.printf("%s, which price is $ %.2f \n\n ",prod2, price2);
	System.out.printf("Record: %d years old, code %d and gender: %s \n",age, code, gender);
	System.out.printf("Measue with eight decimenal places: %f \n",measure);
	System.out.printf("Rouded (three decimal places): %.3f \n",measure);
	Locale.setDefault(Locale.US);
	System.out.printf("US decimenal point: %f",measure);


			}

}
