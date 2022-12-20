package com.Ankur.Exercism;

class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance;
    int battery;

    NeedForSpeed(int speed, int drain) {
        this.speed = speed;
        this.batteryDrain = drain;
        this.distance = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return this.battery == 0;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (this.battery != 0) {
            this.battery -= this.batteryDrain;
            this.distance += this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (this.distance > car.distance && !car.batteryDrained()) {
            car.drive();
        }
        return car.distance >= this.distance;
    }
}

