abspath_wa = $(join $(filter %:,$(subst :,: ,$1)),$(abspath $(filter-out %:,$(subst :,: ,$1))))

LOCAL_PATH := $(call my-dir)
JNI_SRC_PATH := $(call abspath_wa, $(LOCAL_PATH)/src/main/cpp)
include $(CLEAR_VARS)

# build our app's shared lib
include $(CLEAR_VARS)
LOCAL_CFLAGS := -std=c++11
LOCAL_MODULE    := limit
LOCAL_SRC_FILES := $(JNI_SRC_PATH)/limit_ability.cpp \
                    $(JNI_SRC_PATH)/native_jni.cpp
LOCAL_CFLAGS += -DLUOXIANG_LIMIT_TIME=1559994206767
LOCAL_LDLIBS    := -llog -landroid

include $(BUILD_SHARED_LIBRARY)