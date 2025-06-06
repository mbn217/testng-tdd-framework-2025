package demo;

import utilities.ExcelUtils;

public class ExcelDemo {

    public static void main(String[] args) {


        ExcelUtils.getExcelInstance("data/dataSet.xlsx","Sheet1");

        System.out.println("Row count is : " + ExcelUtils.getRowCount());
        System.out.println("Column count is : " + ExcelUtils.getColCount());

        System.out.println(ExcelUtils.getCellDataString(2,0));

        System.out.println("--------------------------------");
        for (int i = 0; i < ExcelUtils.getRowCount(); i++) {
            for (int j = 0; j < ExcelUtils.getColCount(); j++) {
                String cellData = ExcelUtils.getCellDataString(i,j);
                System.out.print(cellData + "   |   ");

            }
            System.out.println();
        }






    }


}
