#include "grains.h"

uint64_t square(uint8_t index) {
    if (index < 1 || index > 64) {
        return 0;
    }
    uint64_t count = 1;
    for (int i=1; i<index; i++) {
        count *= 2;
    }
    return count;
}


uint64_t total(void) {
    uint64_t count = 1;
    uint64_t total = 1;
    for (int i=1; i<64; i++) {
        count *= 2;
        total += count;
    }
    return total;
}