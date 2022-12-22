package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BowlingGame {
    private static LinkedList<Frame> frames = new LinkedList<>();
    private static final int MAX_NUMBER_OF_FRAMES = 10;
    private static final int MAX_NUMBER_OF_PINS = 10;

    public void roll(int pins) {
        if (frames.isEmpty()) {
            frames.add(new Frame());
        }
        if (pins < 0) {
            startNewGame();
            throw new IllegalStateException("Negative roll is invalid");
        }
        if (pins > MAX_NUMBER_OF_PINS) {
            startNewGame();
            throw new IllegalStateException("Pin count exceeds pins on the lane");
        }
        hitPins(pins);
    }

    private static void startNewGame() {
        frames = new LinkedList<>();
        frames.add(new Frame());
    }

    private static void goToNextFrame() {
        frames.add(new Frame());
        if (frames.size() == 10) {
            frames.getLast().isLast = true;
        }
    }

    private static void hitPins(int pins) {
        final Frame currentFrame = frames.getLast();
        if (currentFrame.isLast) {
            handleLastFrame(currentFrame, pins);
        } else {
            handleFrame(currentFrame, pins);
        }
    }

    private static void handleFrame(Frame frame, int pins) {
        addPinsToSum(frame, pins);
        frame.hits.add(pins);
        if (frame.sum == MAX_NUMBER_OF_PINS || frame.hits.size() == 2) {
            goToNextFrame();
        }
    }

    private static void handleLastFrame(Frame frame, int pins) {
        if (frame.hits.size() < 3 && frame.sum < 10) {
            addPinsToSum(frame, pins);
        }
        frame.hits.add(pins);
        if ((frame.hits.size() > 3 && frame.hits.get(1) <= 10) ||
                (frame.hits.size() > 2 && frame.sum < 10)) {
            startNewGame();
            throw new IllegalStateException("Cannot roll after game is over");
        }
        if (frame.hits.get(0) == 10 && frame.hits.size() == 3) {
            if (frame.hits.get(1) != 10 && (frame.hits.get(1) + frame.hits.get(2)) > 10) {
                startNewGame();
                throw new IllegalStateException("Pin count exceeds pins on the lane");
            }
        }
    }

    private static void addPinsToSum(Frame frame, int pins) {
        frame.sum += pins;
        if (frame.sum > MAX_NUMBER_OF_PINS) {
            startNewGame();
            throw new IllegalStateException("Pin count exceeds pins on the lane");
        }
    }

    public int score() {
        if (frames.size() < 10)
            throw new IllegalStateException("Score cannot be taken until the end of the game");
        int output = 0;
        for (int i = 0; i < MAX_NUMBER_OF_FRAMES - 1; i++) {
            Frame frame = frames.get(i);
            if (frame.sum < 10) {
                output += frame.sum;
            } else {
                if (frame.hits.size() == 2) {
                    output += (frame.sum + frames.get(i + 1).hits.get(0));
                } else {
                    if (frames.get(i + 1).hits.size() == 1) {
                        output += (frame.sum + 10 + frames.get(i + 2).hits.get(0));
                    } else {
                        output += (frame.sum + frames.get(i + 1).hits.get(0) + frames.get(i + 1).hits.get(1));
                    }
                }
            }
        }
        Frame lastFrame = frames.getLast();
        output += lastFrame.sum;
        if (lastFrame.sum == 10) {
            if (lastFrame.hits.size() < 3) {
                startNewGame();
                throw new IllegalStateException("Score cannot be taken until the end of the game");
            }
            output += lastFrame.hits.get(2);
            if (lastFrame.hits.get(0) == 10) {
                output += (lastFrame.hits.get(1));
            }
        }
        startNewGame();
        return output;
    }

    private static class Frame {
        int sum = 0;
        final List<Integer> hits = new ArrayList<>();
        boolean isLast = false;
    }
}
