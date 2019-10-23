// cerner_2^5_2019

import kotlinx.cinterop.*
import sdl.*

fun main() {
    if (SDL_Init(SDL_INIT_VIDEO) != 0) {
        println("SDL could not initialize! SDL_Error: ${SDL_GetError()}")
    } else {
        val window = SDL_CreateWindow("Basic SDL Window", SDL_WINDOWPOS_CENTERED.toInt(), SDL_WINDOWPOS_CENTERED.toInt(), 640, 480, SDL_WINDOW_SHOWN)
        if (window == null) {
            println("Window could not be created! SDL_Error: ${SDL_GetError()}")
        } else {
            val screenSurface = SDL_GetWindowSurface(window)
            SDL_FillRect(screenSurface, null, SDL_MapRGB(screenSurface?.pointed?.format, 0xFF, 0xFF, 0xFF))
            SDL_UpdateWindowSurface(window)

            var quit = false
            while (!quit) {
                memScoped {
                    val event = alloc<SDL_Event>()
                    while (SDL_PollEvent(event.ptr.reinterpret()) != 0) {
                        when (event.type) {
                            SDL_QUIT -> quit = true
                        }
                    }
                }
            }
            SDL_DestroyWindow(window)
        }
    }
    SDL_Quit()
}