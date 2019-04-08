#include "limit_ability.h"
bool LUOXIANG::init_sdk() {
#ifdef LUOXIANG_LIMIT_TIME
    uint64_t limit_time = LUOXIANG_LIMIT_TIME;
    struct timeval tv;
    gettimeofday(&tv, NULL);
    uint64_t t = static_cast<uint64_t>(tv.tv_sec);
    t *= 1000;
    t += tv.tv_usec / 1000;
    return t <= limit_time;
#endif
    return true;
}