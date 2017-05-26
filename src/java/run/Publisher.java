package run;

import Soap.SoapWebService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.ws.Endpoint;
import model.Report;
import model.SalePoint;
import model.filling.ComposeReports;
import model.filling.DateAdapter;
import model.localstorage.SalePointLocal;

public class Publisher {

    public static void main(String[] args) throws ParseException {

        localTestAllReports();
        localTestFilterReports();
        startServer();
    }

    private static void startServer() {
        Endpoint.publish("http://localhost:1986/soap-task", new SoapWebService());
    }

    private static void localTestAllReports() {

        ArrayList<Report> reports = new ComposeReports().composeTestData();
        System.out.println("Amount product from ALL Reports:");

        for (Report report : reports) {
            System.out.println(report.getAmount());
        }

    }

    private static void localTestFilterReports() {

        DateAdapter dateAdapter = new DateAdapter(new SimpleDateFormat("yyyy-MM-dd"));
        Date date = dateAdapter.toDateFormat("2017-05-25");
        SalePoint salePoint = SalePointLocal.get().getSalePoints().get("ali");

        ArrayList<Report> result = (new SoapWebService()
                .getReceiveReportOnProducts(
                        date,
                        salePoint
                )).getReports();

        System.out.println("Amount product from FILTER Reports:");

        for (Report report : result) {
            System.out.println(report.getAmount());
        }
    }

}
