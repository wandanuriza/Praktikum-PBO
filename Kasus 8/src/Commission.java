//*********************************************************************
// Commission.Java	   
//
// Represents one more employee type that is called Commission
//*********************************************************************

public class Commission extends Hourly
{
	double totalSales;
	double commissionRate;
	
	//constructor
	public Commission (String eName, String eAddress, String ePhone,String socSecNumber, double rate, double commission_rate)
	{
		super(eName,eAddress,ePhone,socSecNumber,rate); //memanggil constructor dari Hourly Class
		commissionRate = commission_rate; //set commission rate
	}
	
	public void  addSales (double total_sales)
	{
		totalSales = total_sales;
	}
	
	@Override
	public double pay() 
    { 
        double payment = super.pay() + (totalSales*commissionRate); //override method pay() pada Executive Class 
        totalSales = 0; //total sales harus di set kembali jadi nol
        return payment; 
    }
	
    @Override
    public String toString(){  //override method toString() pada Hourly Class 
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales; //add total sales
        return result; //output total sales
    }
}