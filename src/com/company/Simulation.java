package com.company;

public class Simulation {
    public boolean simulate() {
        int position = 0;
        for (int count = 0; count < maxHops; count++) {
            position += hopDistance();
            if (position >= goalDistance) {
                return true;
            }
            else if (position < 0) {
            }

        }
        return false;
    }
}
public double runSimulations(int num)
{
    int countSuccess = 0;

    for (int count = 0; count < num; count++)
    {
        if (simulate())
        {
            countSuccess++;
        }

    }
    return (double)countSuccess / num;
}
