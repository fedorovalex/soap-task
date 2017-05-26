package Soap;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.Date;
import model.Report;
import model.SalePoint;
import model.filling.ComposeReports;

@WebService(serviceName = "SoapWebService")
public class SoapWebService {

    @WebMethod(operationName = "getReceiveReportOnProducts")
    public Response getReceiveReportOnProducts(@WebParam(name = "date") Date date, @WebParam(name = "salePoint") SalePoint salePoint) {

        Response response = new Response();
        ArrayList<Report> allReports = new ComposeReports().composeTestData();
        ArrayList<Report> filterReports = new ArrayList<>();

        for (Report report : allReports) {
            if (report.getData().equals(date) && report.getSalePoint().equals(salePoint)) {
                filterReports.add(report);
            }
        }

        response.setReports(filterReports);

        return response;
    }
}
