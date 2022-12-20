package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    enum Signal {

        WINK("wink"),
        DOUBLE_BLINK("double blink"),
        CLOSE_YOUR_EYES("close your eyes"),
        JUMP("jump");
        private String code;

        Signal(String s) {
            this.code = s;
        }

        public String getCode() {
            return code;
        }
    }

    List<Signal> calculateHandshake(int number) {
        if (number == 0)
            return new ArrayList<>();
        List<Signal> response = new ArrayList<>();
        String s = binary(number);
        for (int i = 0; i < s.length() && i < 4; i++) {
            boolean equals = Character.toString(s.charAt(i)).equals("1");
            if (i == 0 && equals)
                response.add(Signal.WINK);
            if (i == 1 && equals)
                response.add(Signal.DOUBLE_BLINK);
            if (i == 2 && equals)
                response.add(Signal.CLOSE_YOUR_EYES);
            if (i == 3 && equals)
                response.add(Signal.JUMP);
        }
        if (s.length() > 4 && Character.toString(s.charAt(4)).equals("1"))
            Collections.reverse(response);
        return response;
    }

    String binary(int n) {
        StringBuilder response = new StringBuilder();
        while (n > 0) {
            response.append(n % 2);
            n /= 2;
        }
        return response.toString();
    }

    public static void main(String[] args) {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        System.out.println(handshakeCalculator.calculateHandshake(19));
    }

}
