package com.Ankur.Exercism;

import java.util.regex.Pattern;

public class PhoneNumber {

    private static final int MINIMUM_LENGTH = 10;
    private static final int MAXIMUM_LENGTH = 11;
    private static final String LESS_THAN_MINIMUM = "incorrect number of digits";
    private static final Pattern REGEX_FIND_ANY_LETTER = Pattern.compile("[A-Za-z]");
    private static final Pattern REGEX_ILLEGAL_CHARACTER = Pattern.compile("[^-0-9()+. ]");
    private String number;

    public PhoneNumber(String rawPhoneNumber) {
        String errorMessage = "";
        // Preprocessing error checks (rawPhoneNumber)
        if (rawPhoneNumber.length() < MINIMUM_LENGTH)
            errorMessage = LESS_THAN_MINIMUM;
        else if (REGEX_FIND_ANY_LETTER.matcher(rawPhoneNumber).find())
            errorMessage = "letters not permitted";
        else if (REGEX_ILLEGAL_CHARACTER.matcher(rawPhoneNumber).find())
            errorMessage = "punctuations not permitted";
        if (!errorMessage.isEmpty())
            throw new IllegalArgumentException(errorMessage);

        String candidateNumber = setCandidateNumber(rawPhoneNumber);

        // Postprocessing error checks (candidateNumber)
        if (candidateNumber.length() > MAXIMUM_LENGTH)
            errorMessage = "more than 11 digits";
        else if (candidateNumber.length() < MINIMUM_LENGTH)
            errorMessage = LESS_THAN_MINIMUM;
        else {
            // Candidate's length is in correct range
            if (candidateNumber.length() == MAXIMUM_LENGTH) {
                if (candidateNumber.startsWith("1"))
                    candidateNumber = candidateNumber.substring(1);
                else
                    errorMessage = "11 digits must start with 1";
            }

            // Candidate is length 10 (no leading 1)
            if (candidateNumber.startsWith("0"))
                errorMessage = "area code cannot start with zero";
            else if (candidateNumber.startsWith("1"))
                errorMessage = "area code cannot start with one";
            else if (candidateNumber.charAt(3) == '0')
                errorMessage = "exchange code cannot start with zero";
            else if (candidateNumber.charAt(3) == '1')
                errorMessage = "exchange code cannot start with one";
        }
        if (!errorMessage.isEmpty())
            throw new IllegalArgumentException(errorMessage);
        this.number = candidateNumber;
    }

    String getNumber() {
        return number;
    }

    final String setCandidateNumber(String rawPhoneNumber) {
        return rawPhoneNumber
                .chars()
                .filter(Character::isDigit)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        PhoneNumber pn = new PhoneNumber("123456789");
    }

}
