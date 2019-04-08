#include <jni.h>
#include <string>
#include <limit_ability.h>

extern "C" {

JNIEXPORT jboolean JNICALL
Java_com_compatsdk_LiteApi_iniSdk(
        JNIEnv *env,
        jobject /* this */) {
    return LUOXIANG::init_sdk();
}

}
