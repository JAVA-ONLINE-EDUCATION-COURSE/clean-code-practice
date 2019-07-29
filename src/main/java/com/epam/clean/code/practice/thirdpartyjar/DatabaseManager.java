package com.epam.clean.code.practice.thirdpartyjar;

import java.util.List;

public interface DatabaseManager {


    public List<DataSet> getTableData(String tableName);

}