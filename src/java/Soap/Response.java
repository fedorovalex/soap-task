package Soap;

import java.util.ArrayList;
import java.util.Objects;
import model.Report;

public class Response {

    private ArrayList<Report> reports;

    public Response() {
    }

    public Response(ArrayList<Report> reports) {
        this.reports = reports;
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.reports);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Response other = (Response) obj;
        if (this.reports.size() != other.reports.size() || !this.reports.containsAll(other.reports)) {
            return false;
        }
        return true;
    }

}
