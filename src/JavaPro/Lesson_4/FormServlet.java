package JavaPro.Lesson_4;/*
Created by matua on 06.09.2018 at 17:37
*/

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@WebServlet(name = "FormServlet", urlPatterns = "/form")
public class FormServlet extends HttpServlet {

    static final String CURRENT_USER_INPUT = "<html>" +
            "<head><title>Answers registered</title></head>" +
            "<body><p>Your answers are registered and are as follows:</p>\n" +
            "<ol>\n" +
            "<li>%s</li>\n" +
            "<li>%s</li>\n" +
            "<li>%s</li>\n" +
            "<li>%s</li>\n" +
            "<li>%s</li>\n" +
            "</ol>\n";

    private Set<Answers> answersList = new HashSet<>();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String whyDoYouLikeJava = req.getParameter("whyDoYouLikeJava");
        String whyDontYouLikeJava = req.getParameter("whyDontYouLikeJava");

        answersList.add(new Answers(firstName, lastName, age, whyDoYouLikeJava, whyDontYouLikeJava));

        resp.getWriter().printf(CURRENT_USER_INPUT, firstName, lastName, age, whyDoYouLikeJava, whyDontYouLikeJava);

        PrintWriter allUsers = resp.getWriter();

        allUsers.println("<p>The information on users:</p>\n<ol>");

        for (Answers answer : answersList) {
            allUsers.print("<li>");
            allUsers.printf("%s %s, %s years old:\n", answer.firstName, answer.lastName, answer.age);
            allUsers.println("<ul>");
            allUsers.println("<li>Answers:");
            allUsers.println("<ul>");
            allUsers.printf("<li>%s</li>", answer.whyDoYouLikeJava);
            allUsers.printf("<li>%s</li>", answer.whyDontYouLikeJava);
            allUsers.println("</ul>");
            allUsers.println("</li>");
            allUsers.println("</ul>");
            allUsers.println("</li>");
        }

        allUsers.println("</ol>");
        allUsers.println("<p>Good luck!</p></html>" +
                "<p>Go back to <a href=\"index.html\">home</a> page.</p>");
    }

    private static class Answers {
        private String firstName;
        private String lastName;
        private String age;
        private String whyDoYouLikeJava;
        private String whyDontYouLikeJava;

        public Answers(String firstName, String lastName, String age, String whyDoYouLikeJava, String whyDontYouLikeJava) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.whyDoYouLikeJava = whyDoYouLikeJava;
            this.whyDontYouLikeJava = whyDontYouLikeJava;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Answers)) return false;
            Answers answers = (Answers) o;
            return Objects.equals(firstName, answers.firstName) &&
                    Objects.equals(lastName, answers.lastName) &&
                    Objects.equals(age, answers.age) &&
                    Objects.equals(whyDoYouLikeJava, answers.whyDoYouLikeJava) &&
                    Objects.equals(whyDontYouLikeJava, answers.whyDontYouLikeJava);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, age, whyDoYouLikeJava, whyDontYouLikeJava);
        }
    }
}
