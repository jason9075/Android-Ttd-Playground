package com.jason9075.androidttdplayground.car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jason9075 on 2016/3/14.
 */
public class CarTest {

    @Test
    public void normalCarSpeedTest() throws Exception {
        Motor normalMotor = new NormalMotor();
        Car normalCar = new Car("Toyota",normalMotor);
        assertEquals(normalCar.run(),"Speed:30");
    }

    @Test
    public void fastCarSpeedTest() throws Exception {
        Motor fastMotor = new FastMotor();
        Car fastCar = new Car("Toyota",fastMotor);
        assertEquals(fastCar.run(),"Speed:60");

    }
}
