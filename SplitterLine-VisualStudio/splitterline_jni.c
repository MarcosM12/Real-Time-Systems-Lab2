#include <jni.h>
#include <splitterLine.h>
/* Header for class SplitterLine */

#ifndef _Included_SplitterLine
#define _Included_SplitterLine
#ifdef __cplusplus
extern "C" {
#endif
	/*
	 * Class:     SplitterLine
	 * Method:    initializeHardwarePorts
	 * Signature: ()V
	 */
	JNIEXPORT void JNICALL Java_SplitterLine_initializeHardwarePorts (JNIEnv *ignoreEnv, jclass ignorejClass){

		initializeHardwarePorts();
	}

	/*
	 * Class:     SplitterLine
	 * Method:    cylinder2MoveForward
	 * Signature: ()V
	 */
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder2MoveForward (JNIEnv* ignoreEnv, jclass ignorejClass){
	
		cylinder2_moveForward();

	}

	/*
	 * Class:     SplitterLine
	 * Method:    cylinder2MoveBackward
	 * Signature: ()V
	 */
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder2MoveBackward(JNIEnv* ignoreEnv, jclass ignorejClass){

	
		cylinder2_moveBackward();

	}

	/*
	 * Class:     SplitterLine
	 * Method:    cylinder2Stop
	 * Signature: ()V
	 */
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder2Stop(JNIEnv* ignoreEnv, jclass ignorejClass){
	
		cylinder2_stop();
	}

	/*
	 * Class:     SplitterLine
	 * Method:    conveyorMove
	 * Signature: ()V
	 */
	JNIEXPORT void JNICALL Java_SplitterLine_conveyorMove(JNIEnv* ignoreEnv, jclass ignorejClass){

		conveyorMove();

	}

	/*
	 * Class:     SplitterLine
	 * Method:    conveyorStop
	 * Signature: ()V
	 */
	JNIEXPORT void JNICALL Java_SplitterLine_conveyorStop(JNIEnv* ignoreEnv, jclass ignorejClass){

		conveyorStop();

	}

	/*
	 * Class:     SplitterLine
	 * Method:    getCylinder2Position
	 * Signature: ()I
	 */
	JNIEXPORT jint JNICALL Java_SplitterLine_getCylinder2Position(JNIEnv* ignoreEnv, jclass ignorejClass){
	
		return cylinder2_getPosition();	
	}
	/*
	 * Class:     SplitterLine
	 * Method:    getCylinder1Position
	 * Signature: ()I
	 */
	JNIEXPORT jint JNICALL Java_SplitterLine_getCylinder1Position(JNIEnv* ignoreEnv, jclass ignorejClass){

		return cylinder1_getPosition();

	}

	/*
	 * Class:     SplitterLine
	 * Method:    getCylinder3Position
	 * Signature: ()I
	 */
	JNIEXPORT jint JNICALL Java_SplitterLine_getCylinder3Position(JNIEnv* ignoreEnv, jclass ignorejClass){

		cylinder3_getPosition();

	}

	/*
		* Class:     SplitterLine
		* Method:    cylinder1MoveForward
		* Signature: ()V
	*/
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder1MoveForward(JNIEnv* ignoreEnv, jclass ignorejClass){

		cylinder1_moveForward();

	}

	/*
		* Class:     SplitterLine
		* Method:    cylinder1MoveBackward
		* Signature: ()V
		*/
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder1MoveBackward (JNIEnv* ignoreEnv, jclass ignorejClass){

		cylinder1_moveBackward();

	}

	/*
		* Class:     SplitterLine
		* Method:    cylinder1Stop
		* Signature: ()V
		*/
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder1Stop(JNIEnv* ignoreEnv, jclass ignorejClass){

		cylinder1_stop();

	}

	/*
		* Class:     SplitterLine
		* Method:    cylinder3MoveForward
		* Signature: ()V
		*/
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder3MoveForward(JNIEnv* ignoreEnv, jclass ignorejClass){

		cylinder3_moveForward();

	}
	

	/*
		* Class:     SplitterLine
		* Method:    cylinder3MoveBackward
		* Signature: ()V
		*/
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder3MoveBackward(JNIEnv* ignoreEnv, jclass ignorejClass){

		cylinder3_moveBackward();

	}
	

	/*
		* Class:     SplitterLine
		* Method:    cylinder3Stop
		* Signature: ()V
		*/
	JNIEXPORT void JNICALL Java_SplitterLine_cylinder3Stop(JNIEnv* ignoreEnv, jclass ignorejClass){

		cylinder3_stop();

	}


	/*
 * Class:     SplitterLine
 * Method:    isPartAtGate1
 * Signature: ()Z
 */
	JNIEXPORT jboolean JNICALL Java_SplitterLine_isPartAtGate1
	(JNIEnv*, jclass);

	/*
	 * Class:     SplitterLine
	 * Method:    getIdentificationSensors
	 * Signature: ()I
	 */
	JNIEXPORT jint JNICALL Java_SplitterLine_getIdentificationSensors
	(JNIEnv*, jclass);







#ifdef __cplusplus
}
#endif
#endif
