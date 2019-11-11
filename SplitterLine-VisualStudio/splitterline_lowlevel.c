#include <stdio.h>
#include <conio.h>
#include <stdio.h>

#include <interface.h>


void initializeHardwarePorts(){

	createDigitalInput(0);
	createDigitalInput(1);
	createDigitalOutput(2);
}


void setBitValue(uInt8* variable, int n_bit, int new_value_bit)
// given a byte value, set the n bit to value
{
	uInt8  mask_on = (uInt8)(1 << n_bit);
	uInt8  mask_off = ~mask_on;
	if (new_value_bit)  *variable |= mask_on;
	else                *variable &= mask_off;
}


int getBitValue(uInt8 value, uInt8 n_bit)
// given a byte value, returns the value of bit n
{
	return(value & (1 << n_bit));
}


int getIdentificationSensors() {

	uInt8 p = readDigitalU8(1);
	if (getBitValue(p, 5) == 0 && getBitValue(p,6)== 0)
		return 0;
	else{
		if (getBitValue(p, 5) == 1)
			return 1;
		if (getBitValue(p, 6) == 1)
			return 2;
	}
	return(-1);
}


int cylinder2_getPosition()
{
	int v = readDigitalU8(0);
	if (!getBitValue(v, 4))
		return 0;
	else if (!getBitValue(v, 3))
		return 0;
	return(-1);
}

int cylinder1_getPosition()
{
	int v = readDigitalU8(0);
	if (!getBitValue(v, 6))
		return 0;
	else if (!getBitValue(v, 5))
		return 0;
	return(-1);
}

int cylinder3_getPosition()
{
	int v = readDigitalU8(0);
	if (!getBitValue(v, 2))
		return 0;
	else if (!getBitValue(v, 1))
		return 0;
	return(-1);
}


void cylinder2_moveForward()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 4, 1);
	setBitValue(&p, 3, 0);
	writeDigitalU8(2, p);
}

void cylinder1_moveForward()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 1, 1);
	setBitValue(&p, 0, 0);
	writeDigitalU8(2, p);
}

void cylinder3_moveForward()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 6, 1);
	setBitValue(&p, 5, 0);
	writeDigitalU8(2, p);
}



void cylinder2_moveBackward()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 4, 0);
	setBitValue(&p, 3, 1);
	writeDigitalU8(2, p);
}

void cylinder1_moveBackward()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 1, 0);
	setBitValue(&p, 0, 1);
	writeDigitalU8(2, p);
}

void cylinder3_moveBackward()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 6, 0);
	setBitValue(&p, 5, 1);
	writeDigitalU8(2, p);
}

void cylinder2_stop()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 4, 0);
	setBitValue(&p, 3, 0);
	writeDigitalU8(2, p);
}


void cylinder1_stop()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 1, 0);
	setBitValue(&p, 0, 0);
	writeDigitalU8(2, p);

}

void cylinder3_stop()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 6, 0);
	setBitValue(&p, 5, 0);
	writeDigitalU8(2, p);
}


void conveyorMove()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 2, 1);
	writeDigitalU8(2, p);

}


void conveyorStop()
{
	uInt8 p = readDigitalU8(2);
	setBitValue(&p, 2, 0);
	writeDigitalU8(2, p);

}

