package ir.javacup.salary;

public class HrmSalaryListCreator extends SalaryListCreator {

    public HrmSalaryListCreator(Encoder encoder) {
        super(encoder);
    }

    @Override
    protected String doCreate(Employee[] employees) {
        String strToReturn = "";
        for(Employee e:employees) {
            strToReturn = strToReturn + addZeroPrefix(e.getCode().toString(),8);
            strToReturn = strToReturn + getItemSeparator();
            strToReturn = strToReturn + addZeroPrefix(Long.toString(e.getSalary()), 10);
            strToReturn = strToReturn + getRecordSeparator();
        }
        return strToReturn.substring(0, strToReturn.length() - 1);
    }
}
