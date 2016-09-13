package com.goeuro.reports;

import com.goeuro.exception.CityException;
import com.goeuro.model.CityVO;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by Timy on 12/09/16.
 */
public class ReportGenerator {

    public static File generateCSVReport(List<CityVO> cityVOs,String cityName) throws CityException{
        try {
            if(cityVOs != null && cityVOs.size()>0){
                FileOutputStream fileOut = new FileOutputStream("City Details-"+cityName+".csv");
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet worksheet = workbook.createSheet("City");
                //Add header
                worksheet = addHeader(worksheet);
                int rowCount = 0 ;
                for (int j = 0; j <cityVOs.size() ; j++) {
                    HSSFRow row = worksheet.createRow(++rowCount);
                    int columnCount = 0;
                    CityVO cityVO = cityVOs.get(j);
                    for (int k = 0; k < 5; k++) {
                        HSSFCell cell = row.createCell((short) columnCount);
                        switch (k){

                            case 0:
                                cell.setCellValue(cityVO.get_id());
                                break;
                            case 1 :
                                cell.setCellValue(cityVO.getName());
                                break;
                            case 2:
                                cell.setCellValue(cityVO.getType());
                                break;
                            case 3:
                                cell.setCellValue(cityVO.getGeo_position().getLatitude());
                                break;
                            case 4:
                                cell.setCellValue(cityVO.getGeo_position().getLongitude());
                                break;
                            default:
                                break;
                        }
                        columnCount++;
                    }

                }
                workbook.write(fileOut);
                fileOut.flush();
                fileOut.close();

            }
        }catch (Exception e){
            throw new CityException(e.getMessage());
        }
        return null ;
    }

    private static HSSFSheet addHeader( HSSFSheet worksheet  ) {
        HSSFRow row = worksheet.createRow(0);
        HSSFCell cell = row.createCell((short)0);
        cell.setCellValue("Id");
        HSSFCell name = row.createCell((short)1);
        name.setCellValue("Name");
        HSSFCell type = row.createCell((short)2);
        type.setCellValue("Type");
        HSSFCell latitude = row.createCell((short)3);
        latitude.setCellValue("Latitude");
        HSSFCell longitude = row.createCell((short)4);
        longitude.setCellValue("Longitude");
        return  worksheet ;
    }
}
