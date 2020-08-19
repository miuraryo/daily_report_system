package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportVaridator {
    public static List<String> varidate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _varidateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _varidateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    private static String _varidateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力そてください。";
        }

        return "";
    }

    private static String _varidateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }

}
