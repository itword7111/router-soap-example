package com.example.command_web_service;



import javax.jws.WebService;
import java.io.IOException;
import java.util.List;

@WebService(endpointInterface = "com.example.command_web_service.RouterSenderService")
public class RouterSenderServiceImpl implements RouterSenderService {
    public void notifyUser(String user, String message) {

    }

    public List<String> getAdmins() {
        return null;
    }

    public List<String> getLecturers() {
        return null;
    }

    public List<String> getThreeDaysNotTrackingUsers() {
        return null;
    }

    public List<String> getOneDaysNotTrackingUsers() {
        return null;
    }

    public List<Report> getReportsToday() {
        return null;
    }

    public List<String> getUserNamesByRole(String roleName) {
        return null;
    }

    public void pdf(byte[] pdfBytes, List<String> lectorNickName) throws IOException {

    }

}
