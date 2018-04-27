package com.mygdx.game.gameworld;

import com.badlogic.gdx.Gdx;

import java.util.Random;

/**
 * Created by the-french-cat on 19/05/17.
 */

class CarFactory {

    /*public fields*/

    /*private fields*/
    private Random mRandGen;
    private float initAngle;

    /*constructors*/
    CarFactory() {
        mRandGen = new Random();
    }

    /*public and package-private methods*/
    Car newCar(CarTypes carType) {
        this.initAngle = calcInitAngle();
        CarMoveDirection carMoveDirection = getMoveDirection();

        return new Car(carType.type, carType.numSprites, this.initAngle, carMoveDirection);
    }

    Car newCar(CarTypes carType, float initAngle) {
        CarMoveDirection carMoveDirection = getMoveDirection();
        this.initAngle = initAngle;
        return new Car(carType.type, carType.numSprites, this.initAngle, carMoveDirection);
    }

    /*private methods*/
    private CarMoveDirection getMoveDirection() {
        int random = mRandGen.nextInt(CarMoveDirection.values().length);
        return (CarMoveDirection.values())[random];
    }

    private float calcInitAngle() {
        float angle = 0;
        int rand = mRandGen.nextInt(4);
        Gdx.app.log("Rand ", "" + rand);
        switch (rand) {
            case 0:
                angle = 0f;
                break;
            case 1:
                angle = -90f;
                break;
            case 2:
                angle = -180f;
                break;
            case 3:
                angle = -270f;
                break;
        }
        return angle;
    }
}
