import java.io.IOException;
import java.util.List;

public class ConsoleIOServiceImpl implements PayrollService {
    @Override
    public boolean writePayrollData(List<EmployeePayrollData> employeePayrollDataList) {
        return false;
    }

    @Override
    public void readPayrollData() {

    }
    @Override
    public long countEntries() throws IOException {
        return 0;
    }
}
