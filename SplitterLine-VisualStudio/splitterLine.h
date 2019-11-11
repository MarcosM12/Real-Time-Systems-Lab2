#pragma once
#include<interface.h>

void setBitValue(uInt8* variable, int n_bit, int new_value_bit);
int getBitValue(uInt8 value, uInt8 n_bit);
void initializeHardwarePorts();

int getIdentificationSensors();

int cylinder2_getPosition();
void cylinder2_moveForward();
void cylinder2_moveBackward();
void cylinder2_stop();

int cylinder1_getPosition();
void cylinder1_moveForward();
void cylinder1_moveBackward();
void cylinder1_stop();

int cylinder3_getPosition();
void cylinder3_moveForward();
void cylinder3_moveBackward();
void cylinder3_stop();

void conveyorMove();
void conveyorStop();
