#include "resistor_color.h"

int color_code(resistor_band_t color) {
    return color;
}

static resistor_band_t all_bands[] = {
    BLACK, BROWN, RED, ORANGE, YELLOW,
    GREEN, BLUE, VIOLET, GREY, WHITE
};

const resistor_band_t* colors(void) {
    return all_bands;
}