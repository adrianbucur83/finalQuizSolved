package com.siit;
/*

Please implement a small logistics application that will simulate package delivery.
        For each package you need to have the following data:
        - target location
        - target distance in km
        - package value
        - delivery date

        The system should be able to group the packages based on the target
        location and delivery date.
        For each group of packages which are delivered to the same location
        on a given date, the system must calculate:

        - the group value considering the package value
        - the group revenue considering a fixed price of 1 LEU / 1 km

        Each group of packages must be delivered by a separate thread
        that will print to the console a line like in the following example:

        --------------------------------------------------

        [Delivering for <Apahida> and date <2017-09-02> in <15> seconds]

        --------------------------------------------------

        Each delivery action must be completed in a time interval equal in
        seconds with the distance in km to destination.

        E.g. if there is a location 20 km far, the delivery for that
        location should take 20 seconds.



        RESULT: After all the package groups in all delivery dates are complete, print the following to console:

        - total value of all delivered packages

        - total value of the revenue computed for all groups delivered



        The test data must be loaded from a file in the classpath containing the following data lines:

        --------------------------------------------------

        Apahida,15,100,2017-09-01

        Apahida,15,150,2017-09-01

        Apahida,15,199,2017-09-01

        Apahida,15,149,2017-09-02

        Apahida,15,200,2017-09-02

        Apahida,15,349,2017-09-02

        Apahida,15,199,2017-09-03

        Apahida,15,249,2017-09-03

        Apahida,15,299,2017-09-03

        Floresti,7,100,2017-09-01

        Floresti,7,250,2017-09-01

        Floresti,7,399,2017-09-01

        Floresti,7,549,2017-09-02

        Floresti,7,400,2017-09-02

        Floresti,7,349,2017-09-02

        Floresti,7,299,2017-09-03

        Floresti,7,449,2017-09-03

        Floresti,7,299,2017-09-03

        Turda,29,120,2017-09-01

        Turda,29,130,2017-09-01

        Turda,29,149,2017-09-01

        Turda,29,199,2017-09-02

        Turda,29,299,2017-09-02

        Turda,29,349,2017-09-02

        Turda,29,399,2017-09-03

        Turda,29,249,2017-09-03

        Turda,29,599,2017-09-03

        --------------------------------------------------



        HINT:

        - create a main class that triggers the load of the data from a file into a List

- with the above list, trigger the calculation process

*/

public class Req {
}
