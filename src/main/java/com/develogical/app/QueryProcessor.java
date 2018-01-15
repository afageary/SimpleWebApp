package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("spain")) {
            return "Nice country";
        }
        if (query.toLowerCase().contains("sudan")) {
            return "Nice country too. Located in the heart of Africa";
        }
        if (query.toLowerCase().contains("portugal")) {
            return "Nice weather";
        }

        return "";
    }
}
