package ir.javacup.salary;

public class FmSalaryListCreator extends SalaryListCreator {
    public FmSalaryListCreator(Encoder encoder) {
        super(encoder);
    }

    @Override
    protected String doCreate(Employee[] employees) {
        String strToReturn = "";
        for(Employee e:employees) {
            strToReturn = strToReturn + addZeroPrefix(Long.toString(e.getSalary()), 10);
            strToReturn = strToReturn + getItemSeparator();
            strToReturn = strToReturn + addZeroPrefix(e.getCode().toString(),10);
            strToReturn = strToReturn + getRecordSeparator();
        }
        return strToReturn.substring(0, strToReturn.length() - 1);
    }
}
