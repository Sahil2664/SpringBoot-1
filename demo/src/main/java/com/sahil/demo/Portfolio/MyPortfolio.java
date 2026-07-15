package com.sahil.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/myself")
    public String getMyself() {
        return "<h1>Myself</h1>\n" +
               "<p>Hello I am Sahil.</p>\n" +
               "<ul>\n" +
               "    <li>GitHub: https://github.com/Sahil2664</li>\n" +
               "    <li>https://leetcode.com/u/Sahil_-Singh/</li>\n" +
               "</ul>";
    }

    @GetMapping("/education")
    public String getEducation() {
        return "<h2>Education</h2>\n" +
               "<ul>\n" +
               "    <li><b>Bachelors of Technology (BTech)</b></li>\n" +
               "    <li>Semester: 7th</li>\n" +
               "    <li>Background: Technical </li>\n" +
               "</ul>";
    }

    @GetMapping("/skills")
    public String getSkills() {
        return "<h2>Technical Skills</h2>\n" +
               "<ul>\n" +
               "    <li>Java</li>\n" +
               "    <li>Spring Core</li>\n" +
               "    <li>Spring Boot</li>\n" +
               "    <li>Spring MVC</li>\n" +
               "    <li>Spring Data JPA</li>\n" +
               "    <li>Hibernate</li>\n" +
               "    <li>REST API Development</li>\n" +
               "    <li>MySQL</li>\n" +
               "    <li>H2 Database</li>\n" +
               "    <li>Maven</li>\n" +
               "    <li>Git &amp; GitHub</li>\n" +
               "    <li>HTML</li>\n" +
               "    <li>CSS</li>\n" +
               "    <li>JavaScript</li>\n" +
               "    <li>React</li>\n" +
               "</ul>";
    }

    @GetMapping("/projects")
    public String getProjects() {
        return "<h2>Projects</h2>\n" +
               "<ol>\n" +
               "    <li><b>Travel Booking Platform</b> - Built using Java, Spring Boot, RBAC, and REST APIs.</li>\n" +
               "    <li><b>URL Shortener</b> - Node.js, Express.js, MongoDB, and EJS.</li>\n" +
               "    <li><b>Student Management System</b> - Spring Boot, Spring Data JPA, H2/MySQL.</li>\n" +
               "</ol>";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "<h2>Contact</h2>\n" +
               "<ul>\n" +
               "    <li>Name: Sahil</li>\n" +
               "    <li>Role: Software Engineer</li>\n" +
               "    <li>GitHub: https://github.com/Sahil2664</li>\n" +
               "    <li>LinkedIn: https://www.linkedin.com/in/sahilsingh2664/</li>\n" +
               "    <li>Email: sahilsingh26644@gmail.com</li>\n" +
               "</ul>";
    }
}