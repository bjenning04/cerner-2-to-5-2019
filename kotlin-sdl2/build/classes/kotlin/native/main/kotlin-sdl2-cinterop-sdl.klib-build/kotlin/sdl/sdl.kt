@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package sdl

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*
import cnames.structs.SDL_BlitMap
import cnames.structs.SDL_Cursor
import cnames.structs.SDL_Renderer
import cnames.structs.SDL_SysWMmsg
import cnames.structs.SDL_Texture
import cnames.structs.SDL_Thread
import cnames.structs.SDL_Window
import cnames.structs.SDL_cond
import cnames.structs.SDL_mutex
import cnames.structs.SDL_semaphore
import cnames.structs._SDL_AudioStream
import cnames.structs._SDL_GameController
import cnames.structs._SDL_Haptic
import cnames.structs._SDL_Joystick
import cnames.structs._SDL_Sensor
import cnames.structs._SDL_iconv_t
import platform.posix.FILE
import platform.posix.int16_t
import platform.posix.int32_t
import platform.posix.int64_t
import platform.posix.int8_t
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.uint16_t
import platform.posix.uint32_t
import platform.posix.uint64_t
import platform.posix.uint8_t
import platform.posix.va_list
import platform.posix.wchar_tVar

// NOTE THIS FILE IS AUTO-GENERATED

@CStruct("struct { int p0; unsigned int p1; void* p2; void* p3; int p4; void* p5; void* p6; }")
class SDL_AssertData(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var always_ignore: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var trigger_count: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var condition: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var filename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var linenum: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var function: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var next: CPointer<SDL_AssertData>?
        get() = memberAt<CPointerVar<SDL_AssertData>>(40).value
        set(value) { memberAt<CPointerVar<SDL_AssertData>>(40).value = value }
}

@CStruct("struct { int p0; }")
class SDL_atomic_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var value: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; unsigned int p5; union { struct { unsigned int p0; void* p1; } p0; struct { void* p0; void* p1; void* p2; } p1; struct { void* p0; void* p1; } p2; } p6; }")
class SDL_RWops(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var size: CPointer<CFunction<(CPointer<SDL_RWops>?) -> Sint64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Sint64>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Sint64>>>(0).value = value }
    
    var seek: CPointer<CFunction<(CPointer<SDL_RWops>?, Sint64, Int) -> Sint64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, Sint64, Int) -> Sint64>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, Sint64, Int) -> Sint64>>>(8).value = value }
    
    var read: CPointer<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(16).value = value }
    
    var write: CPointer<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(24).value = value }
    
    var close: CPointer<CFunction<(CPointer<SDL_RWops>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Int>>>(32).value = value }
    
    var type: Uint32
        get() = memberAt<Uint32Var>(40).value
        set(value) { memberAt<Uint32Var>(40).value = value }
    
    val hidden: anonymousStruct1
        get() = memberAt(48)
}

@CStruct("union { struct { unsigned int p0; void* p1; } p0; struct { void* p0; void* p1; void* p2; } p1; struct { void* p0; void* p1; } p2; }")
class anonymousStruct1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    val stdio: anonymousStruct2
        get() = memberAt(0)
    
    val mem: anonymousStruct3
        get() = memberAt(0)
    
    val unknown: anonymousStruct4
        get() = memberAt(0)
}

@CStruct("struct { unsigned int p0; void* p1; }")
class anonymousStruct2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var autoclose: SDL_bool
        get() = memberAt<SDL_boolVar>(0).value
        set(value) { memberAt<SDL_boolVar>(0).value = value }
    
    var fp: CPointer<FILE>?
        get() = memberAt<CPointerVar<FILE>>(8).value
        set(value) { memberAt<CPointerVar<FILE>>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; }")
class anonymousStruct3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var base: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(0).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(0).value = value }
    
    var here: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(8).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(8).value = value }
    
    var stop: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(16).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(16).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class anonymousStruct4(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var data1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var data2: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
}

@CStruct("struct { int p0; unsigned short p1; unsigned char p2; unsigned char p3; unsigned short p4; unsigned short p5; unsigned int p6; void* p7; void* p8; }")
class SDL_AudioSpec(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var freq: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var format: SDL_AudioFormat
        get() = memberAt<SDL_AudioFormatVar>(4).value
        set(value) { memberAt<SDL_AudioFormatVar>(4).value = value }
    
    var channels: Uint8
        get() = memberAt<Uint8Var>(6).value
        set(value) { memberAt<Uint8Var>(6).value = value }
    
    var silence: Uint8
        get() = memberAt<Uint8Var>(7).value
        set(value) { memberAt<Uint8Var>(7).value = value }
    
    var samples: Uint16
        get() = memberAt<Uint16Var>(8).value
        set(value) { memberAt<Uint16Var>(8).value = value }
    
    var padding: Uint16
        get() = memberAt<Uint16Var>(10).value
        set(value) { memberAt<Uint16Var>(10).value = value }
    
    var size: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var callback: SDL_AudioCallback?
        get() = memberAt<SDL_AudioCallbackVar>(16).value
        set(value) { memberAt<SDL_AudioCallbackVar>(16).value = value }
    
    var userdata: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
}

@CStruct("struct __attribute__((packed)) { int p0; unsigned short p1; unsigned short p2; double p3; void* p4; int p5; int p6; int p7; double p8; void* p9[10]; int p10; }")
class SDL_AudioCVT(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 1)
    
    var needed: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var src_format: SDL_AudioFormat
        get() = memberAt<SDL_AudioFormatVar>(4).value
        set(value) { memberAt<SDL_AudioFormatVar>(4).value = value }
    
    var dst_format: SDL_AudioFormat
        get() = memberAt<SDL_AudioFormatVar>(6).value
        set(value) { memberAt<SDL_AudioFormatVar>(6).value = value }
    
    var rate_incr: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var buf: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(16).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(16).value = value }
    
    var len: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var len_cvt: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var len_mult: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var len_ratio: Double
        get() = memberAt<DoubleVar>(36).value
        set(value) { memberAt<DoubleVar>(36).value = value }
    
    val filters: CArrayPointer<SDL_AudioFilterVar>
        get() = arrayMemberAt(44)
    
    var filter_index: Int
        get() = memberAt<IntVar>(124).value
        set(value) { memberAt<IntVar>(124).value = value }
}

@CStruct("struct { unsigned char p0; unsigned char p1; unsigned char p2; unsigned char p3; }")
class SDL_Color(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 1)
    
    var r: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    var g: Uint8
        get() = memberAt<Uint8Var>(1).value
        set(value) { memberAt<Uint8Var>(1).value = value }
    
    var b: Uint8
        get() = memberAt<Uint8Var>(2).value
        set(value) { memberAt<Uint8Var>(2).value = value }
    
    var a: Uint8
        get() = memberAt<Uint8Var>(3).value
        set(value) { memberAt<Uint8Var>(3).value = value }
}

@CStruct("struct { int p0; void* p1; unsigned int p2; int p3; }")
class SDL_Palette(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var ncolors: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var colors: CPointer<SDL_Color>?
        get() = memberAt<CPointerVar<SDL_Color>>(8).value
        set(value) { memberAt<CPointerVar<SDL_Color>>(8).value = value }
    
    var version: Uint32
        get() = memberAt<Uint32Var>(16).value
        set(value) { memberAt<Uint32Var>(16).value = value }
    
    var refcount: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; unsigned char p2; unsigned char p3; unsigned char p4[2]; unsigned int p5; unsigned int p6; unsigned int p7; unsigned int p8; unsigned char p9; unsigned char p10; unsigned char p11; unsigned char p12; unsigned char p13; unsigned char p14; unsigned char p15; unsigned char p16; int p17; void* p18; }")
class SDL_PixelFormat(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var format: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var palette: CPointer<SDL_Palette>?
        get() = memberAt<CPointerVar<SDL_Palette>>(8).value
        set(value) { memberAt<CPointerVar<SDL_Palette>>(8).value = value }
    
    var BitsPerPixel: Uint8
        get() = memberAt<Uint8Var>(16).value
        set(value) { memberAt<Uint8Var>(16).value = value }
    
    var BytesPerPixel: Uint8
        get() = memberAt<Uint8Var>(17).value
        set(value) { memberAt<Uint8Var>(17).value = value }
    
    val padding: CArrayPointer<Uint8Var>
        get() = arrayMemberAt(18)
    
    var Rmask: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var Gmask: Uint32
        get() = memberAt<Uint32Var>(24).value
        set(value) { memberAt<Uint32Var>(24).value = value }
    
    var Bmask: Uint32
        get() = memberAt<Uint32Var>(28).value
        set(value) { memberAt<Uint32Var>(28).value = value }
    
    var Amask: Uint32
        get() = memberAt<Uint32Var>(32).value
        set(value) { memberAt<Uint32Var>(32).value = value }
    
    var Rloss: Uint8
        get() = memberAt<Uint8Var>(36).value
        set(value) { memberAt<Uint8Var>(36).value = value }
    
    var Gloss: Uint8
        get() = memberAt<Uint8Var>(37).value
        set(value) { memberAt<Uint8Var>(37).value = value }
    
    var Bloss: Uint8
        get() = memberAt<Uint8Var>(38).value
        set(value) { memberAt<Uint8Var>(38).value = value }
    
    var Aloss: Uint8
        get() = memberAt<Uint8Var>(39).value
        set(value) { memberAt<Uint8Var>(39).value = value }
    
    var Rshift: Uint8
        get() = memberAt<Uint8Var>(40).value
        set(value) { memberAt<Uint8Var>(40).value = value }
    
    var Gshift: Uint8
        get() = memberAt<Uint8Var>(41).value
        set(value) { memberAt<Uint8Var>(41).value = value }
    
    var Bshift: Uint8
        get() = memberAt<Uint8Var>(42).value
        set(value) { memberAt<Uint8Var>(42).value = value }
    
    var Ashift: Uint8
        get() = memberAt<Uint8Var>(43).value
        set(value) { memberAt<Uint8Var>(43).value = value }
    
    var refcount: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var next: CPointer<SDL_PixelFormat>?
        get() = memberAt<CPointerVar<SDL_PixelFormat>>(48).value
        set(value) { memberAt<CPointerVar<SDL_PixelFormat>>(48).value = value }
}

@CStruct("struct { int p0; int p1; }")
class SDL_Point(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
}

@CStruct("struct { float p0; float p1; }")
class SDL_FPoint(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; }")
class SDL_Rect(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var w: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var h: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
}

@CStruct("struct { float p0; float p1; float p2; float p3; }")
class SDL_FRect(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var w: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var h: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; int p2; int p3; int p4; void* p5; void* p6; int p7; void* p8; struct { int p0; int p1; int p2; int p3; } p9; void* p10; int p11; }")
class SDL_Surface(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(96, 8)
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var format: CPointer<SDL_PixelFormat>?
        get() = memberAt<CPointerVar<SDL_PixelFormat>>(8).value
        set(value) { memberAt<CPointerVar<SDL_PixelFormat>>(8).value = value }
    
    var w: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var h: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var pitch: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var pixels: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
    var userdata: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(40).value
        set(value) { memberAt<COpaquePointerVar>(40).value = value }
    
    var locked: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var lock_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(56).value
        set(value) { memberAt<COpaquePointerVar>(56).value = value }
    
    val clip_rect: SDL_Rect
        get() = memberAt(64)
    
    var map: CPointer<SDL_BlitMap>?
        get() = memberAt<CPointerVar<SDL_BlitMap>>(80).value
        set(value) { memberAt<CPointerVar<SDL_BlitMap>>(80).value = value }
    
    var refcount: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
}

@CStruct("struct { unsigned int p0; int p1; int p2; int p3; void* p4; }")
class SDL_DisplayMode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var format: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var w: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var h: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var refresh_rate: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var driverdata: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
}

@CStruct("struct { unsigned int p0; int p1; unsigned short p2; unsigned int p3; }")
class SDL_Keysym(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var scancode: SDL_Scancode
        get() = memberAt<SDL_ScancodeVar>(0).value
        set(value) { memberAt<SDL_ScancodeVar>(0).value = value }
    
    var sym: SDL_Keycode
        get() = memberAt<SDL_KeycodeVar>(4).value
        set(value) { memberAt<SDL_KeycodeVar>(4).value = value }
    
    var mod: Uint16
        get() = memberAt<Uint16Var>(8).value
        set(value) { memberAt<Uint16Var>(8).value = value }
    
    var unused: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
}

@CStruct("struct { unsigned char p0[16]; }")
class SDL_JoystickGUID(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 1)
    
    val data: CArrayPointer<Uint8Var>
        get() = arrayMemberAt(0)
}

@CStruct("struct { unsigned int p0; union { int p0; int p1; struct { int p0; int p1; } p2; } p1; }")
class SDL_GameControllerButtonBind(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var bindType: SDL_GameControllerBindType
        get() = memberAt<SDL_GameControllerBindTypeVar>(0).value
        set(value) { memberAt<SDL_GameControllerBindTypeVar>(0).value = value }
    
    val value: anonymousStruct5
        get() = memberAt(4)
}

@CStruct("union { int p0; int p1; struct { int p0; int p1; } p2; }")
class anonymousStruct5(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var button: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var axis: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val hat: anonymousStruct6
        get() = memberAt(0)
}

@CStruct("struct { int p0; int p1; }")
class anonymousStruct6(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var hat: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var hat_mask: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
}

@CStruct("struct { long long p0; float p1; float p2; float p3; }")
class SDL_Finger(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var id: SDL_FingerID
        get() = memberAt<SDL_FingerIDVar>(0).value
        set(value) { memberAt<SDL_FingerIDVar>(0).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
    var pressure: Float
        get() = memberAt<FloatVar>(16).value
        set(value) { memberAt<FloatVar>(16).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; }")
class SDL_CommonEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; int p7; }")
class SDL_DisplayEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var display: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var event: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var data1: Sint32
        get() = memberAt<Sint32Var>(16).value
        set(value) { memberAt<Sint32Var>(16).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; int p7; int p8; }")
class SDL_WindowEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var event: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var data1: Sint32
        get() = memberAt<Sint32Var>(16).value
        set(value) { memberAt<Sint32Var>(16).value = value }
    
    var data2: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; struct { unsigned int p0; int p1; unsigned short p2; unsigned int p3; } p7; }")
class SDL_KeyboardEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var repeat: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    val keysym: SDL_Keysym
        get() = memberAt(16)
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; char p3[32]; int p4; int p5; }")
class SDL_TextEditingEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(52, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    val text: CArrayPointer<ByteVar>
        get() = arrayMemberAt(12)
    
    var start: Sint32
        get() = memberAt<Sint32Var>(44).value
        set(value) { memberAt<Sint32Var>(44).value = value }
    
    var length: Sint32
        get() = memberAt<Sint32Var>(48).value
        set(value) { memberAt<Sint32Var>(48).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; char p3[32]; }")
class SDL_TextInputEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(44, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    val text: CArrayPointer<ByteVar>
        get() = arrayMemberAt(12)
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; unsigned int p4; int p5; int p6; int p7; int p8; }")
class SDL_MouseMotionEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var state: Uint32
        get() = memberAt<Uint32Var>(16).value
        set(value) { memberAt<Uint32Var>(16).value = value }
    
    var x: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
    
    var y: Sint32
        get() = memberAt<Sint32Var>(24).value
        set(value) { memberAt<Sint32Var>(24).value = value }
    
    var xrel: Sint32
        get() = memberAt<Sint32Var>(28).value
        set(value) { memberAt<Sint32Var>(28).value = value }
    
    var yrel: Sint32
        get() = memberAt<Sint32Var>(32).value
        set(value) { memberAt<Sint32Var>(32).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; unsigned char p4; unsigned char p5; unsigned char p6; unsigned char p7; int p8; int p9; }")
class SDL_MouseButtonEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(28, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var button: Uint8
        get() = memberAt<Uint8Var>(16).value
        set(value) { memberAt<Uint8Var>(16).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(17).value
        set(value) { memberAt<Uint8Var>(17).value = value }
    
    var clicks: Uint8
        get() = memberAt<Uint8Var>(18).value
        set(value) { memberAt<Uint8Var>(18).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(19).value
        set(value) { memberAt<Uint8Var>(19).value = value }
    
    var x: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
    
    var y: Sint32
        get() = memberAt<Sint32Var>(24).value
        set(value) { memberAt<Sint32Var>(24).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; int p4; int p5; unsigned int p6; }")
class SDL_MouseWheelEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(28, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var x: Sint32
        get() = memberAt<Sint32Var>(16).value
        set(value) { memberAt<Sint32Var>(16).value = value }
    
    var y: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
    
    var direction: Uint32
        get() = memberAt<Uint32Var>(24).value
        set(value) { memberAt<Uint32Var>(24).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; short p7; unsigned short p8; }")
class SDL_JoyAxisEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var axis: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var value: Sint16
        get() = memberAt<Sint16Var>(16).value
        set(value) { memberAt<Sint16Var>(16).value = value }
    
    var padding4: Uint16
        get() = memberAt<Uint16Var>(18).value
        set(value) { memberAt<Uint16Var>(18).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; short p7; short p8; }")
class SDL_JoyBallEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var ball: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var xrel: Sint16
        get() = memberAt<Sint16Var>(16).value
        set(value) { memberAt<Sint16Var>(16).value = value }
    
    var yrel: Sint16
        get() = memberAt<Sint16Var>(18).value
        set(value) { memberAt<Sint16Var>(18).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; }")
class SDL_JoyHatEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var hat: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var value: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; }")
class SDL_JoyButtonEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var button: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; }")
class SDL_JoyDeviceEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: Sint32
        get() = memberAt<Sint32Var>(8).value
        set(value) { memberAt<Sint32Var>(8).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; short p7; unsigned short p8; }")
class SDL_ControllerAxisEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var axis: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var value: Sint16
        get() = memberAt<Sint16Var>(16).value
        set(value) { memberAt<Sint16Var>(16).value = value }
    
    var padding4: Uint16
        get() = memberAt<Uint16Var>(18).value
        set(value) { memberAt<Uint16Var>(18).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; }")
class SDL_ControllerButtonEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var button: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; }")
class SDL_ControllerDeviceEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: Sint32
        get() = memberAt<Sint32Var>(8).value
        set(value) { memberAt<Sint32Var>(8).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; }")
class SDL_AudioDeviceEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var iscapture: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; long long p2; long long p3; float p4; float p5; float p6; float p7; float p8; }")
class SDL_TouchFingerEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var touchId: SDL_TouchID
        get() = memberAt<SDL_TouchIDVar>(8).value
        set(value) { memberAt<SDL_TouchIDVar>(8).value = value }
    
    var fingerId: SDL_FingerID
        get() = memberAt<SDL_FingerIDVar>(16).value
        set(value) { memberAt<SDL_FingerIDVar>(16).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(24).value
        set(value) { memberAt<FloatVar>(24).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(28).value
        set(value) { memberAt<FloatVar>(28).value = value }
    
    var dx: Float
        get() = memberAt<FloatVar>(32).value
        set(value) { memberAt<FloatVar>(32).value = value }
    
    var dy: Float
        get() = memberAt<FloatVar>(36).value
        set(value) { memberAt<FloatVar>(36).value = value }
    
    var pressure: Float
        get() = memberAt<FloatVar>(40).value
        set(value) { memberAt<FloatVar>(40).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; long long p2; float p3; float p4; float p5; float p6; unsigned short p7; unsigned short p8; }")
class SDL_MultiGestureEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var touchId: SDL_TouchID
        get() = memberAt<SDL_TouchIDVar>(8).value
        set(value) { memberAt<SDL_TouchIDVar>(8).value = value }
    
    var dTheta: Float
        get() = memberAt<FloatVar>(16).value
        set(value) { memberAt<FloatVar>(16).value = value }
    
    var dDist: Float
        get() = memberAt<FloatVar>(20).value
        set(value) { memberAt<FloatVar>(20).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(24).value
        set(value) { memberAt<FloatVar>(24).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(28).value
        set(value) { memberAt<FloatVar>(28).value = value }
    
    var numFingers: Uint16
        get() = memberAt<Uint16Var>(32).value
        set(value) { memberAt<Uint16Var>(32).value = value }
    
    var padding: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; long long p2; long long p3; unsigned int p4; float p5; float p6; float p7; }")
class SDL_DollarGestureEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var touchId: SDL_TouchID
        get() = memberAt<SDL_TouchIDVar>(8).value
        set(value) { memberAt<SDL_TouchIDVar>(8).value = value }
    
    var gestureId: SDL_GestureID
        get() = memberAt<SDL_GestureIDVar>(16).value
        set(value) { memberAt<SDL_GestureIDVar>(16).value = value }
    
    var numFingers: Uint32
        get() = memberAt<Uint32Var>(24).value
        set(value) { memberAt<Uint32Var>(24).value = value }
    
    var error: Float
        get() = memberAt<FloatVar>(28).value
        set(value) { memberAt<FloatVar>(28).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(32).value
        set(value) { memberAt<FloatVar>(32).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(36).value
        set(value) { memberAt<FloatVar>(36).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; void* p2; unsigned int p3; }")
class SDL_DropEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var file: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(16).value
        set(value) { memberAt<Uint32Var>(16).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; int p2; float p3[6]; }")
class SDL_SensorEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: Sint32
        get() = memberAt<Sint32Var>(8).value
        set(value) { memberAt<Sint32Var>(8).value = value }
    
    val data: CArrayPointer<FloatVar>
        get() = arrayMemberAt(12)
}

@CStruct("struct { unsigned int p0; unsigned int p1; }")
class SDL_QuitEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; }")
class SDL_OSEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; int p3; void* p4; void* p5; }")
class SDL_UserEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var code: Sint32
        get() = memberAt<Sint32Var>(12).value
        set(value) { memberAt<Sint32Var>(12).value = value }
    
    var data1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var data2: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; void* p2; }")
class SDL_SysWMEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var msg: CPointer<SDL_SysWMmsg>?
        get() = memberAt<CPointerVar<SDL_SysWMmsg>>(8).value
        set(value) { memberAt<CPointerVar<SDL_SysWMmsg>>(8).value = value }
}

@CStruct("union { unsigned int p0; struct { unsigned int p0; unsigned int p1; } p1; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; int p7; } p2; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; int p7; int p8; } p3; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; struct { unsigned int p0; int p1; unsigned short p2; unsigned int p3; } p7; } p4; struct { unsigned int p0; unsigned int p1; unsigned int p2; char p3[32]; int p4; int p5; } p5; struct { unsigned int p0; unsigned int p1; unsigned int p2; char p3[32]; } p6; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; unsigned int p4; int p5; int p6; int p7; int p8; } p7; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; unsigned char p4; unsigned char p5; unsigned char p6; unsigned char p7; int p8; int p9; } p8; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; int p4; int p5; unsigned int p6; } p9; struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; short p7; unsigned short p8; } p10; struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; short p7; short p8; } p11; struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; } p12; struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; } p13; struct { unsigned int p0; unsigned int p1; int p2; } p14; struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; short p7; unsigned short p8; } p15; struct { unsigned int p0; unsigned int p1; int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; } p16; struct { unsigned int p0; unsigned int p1; int p2; } p17; struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned char p3; unsigned char p4; unsigned char p5; unsigned char p6; } p18; struct { unsigned int p0; unsigned int p1; int p2; float p3[6]; } p19; struct { unsigned int p0; unsigned int p1; } p20; struct { unsigned int p0; unsigned int p1; unsigned int p2; int p3; void* p4; void* p5; } p21; struct { unsigned int p0; unsigned int p1; void* p2; } p22; struct { unsigned int p0; unsigned int p1; long long p2; long long p3; float p4; float p5; float p6; float p7; float p8; } p23; struct { unsigned int p0; unsigned int p1; long long p2; float p3; float p4; float p5; float p6; unsigned short p7; unsigned short p8; } p24; struct { unsigned int p0; unsigned int p1; long long p2; long long p3; unsigned int p4; float p5; float p6; float p7; } p25; struct { unsigned int p0; unsigned int p1; void* p2; unsigned int p3; } p26; unsigned char p27[56]; }")
class SDL_Event(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    val common: SDL_CommonEvent
        get() = memberAt(0)
    
    val display: SDL_DisplayEvent
        get() = memberAt(0)
    
    val window: SDL_WindowEvent
        get() = memberAt(0)
    
    val key: SDL_KeyboardEvent
        get() = memberAt(0)
    
    val edit: SDL_TextEditingEvent
        get() = memberAt(0)
    
    val text: SDL_TextInputEvent
        get() = memberAt(0)
    
    val motion: SDL_MouseMotionEvent
        get() = memberAt(0)
    
    val button: SDL_MouseButtonEvent
        get() = memberAt(0)
    
    val wheel: SDL_MouseWheelEvent
        get() = memberAt(0)
    
    val jaxis: SDL_JoyAxisEvent
        get() = memberAt(0)
    
    val jball: SDL_JoyBallEvent
        get() = memberAt(0)
    
    val jhat: SDL_JoyHatEvent
        get() = memberAt(0)
    
    val jbutton: SDL_JoyButtonEvent
        get() = memberAt(0)
    
    val jdevice: SDL_JoyDeviceEvent
        get() = memberAt(0)
    
    val caxis: SDL_ControllerAxisEvent
        get() = memberAt(0)
    
    val cbutton: SDL_ControllerButtonEvent
        get() = memberAt(0)
    
    val cdevice: SDL_ControllerDeviceEvent
        get() = memberAt(0)
    
    val adevice: SDL_AudioDeviceEvent
        get() = memberAt(0)
    
    val sensor: SDL_SensorEvent
        get() = memberAt(0)
    
    val quit: SDL_QuitEvent
        get() = memberAt(0)
    
    val user: SDL_UserEvent
        get() = memberAt(0)
    
    val syswm: SDL_SysWMEvent
        get() = memberAt(0)
    
    val tfinger: SDL_TouchFingerEvent
        get() = memberAt(0)
    
    val mgesture: SDL_MultiGestureEvent
        get() = memberAt(0)
    
    val dgesture: SDL_DollarGestureEvent
        get() = memberAt(0)
    
    val drop: SDL_DropEvent
        get() = memberAt(0)
    
    val padding: CArrayPointer<Uint8Var>
        get() = arrayMemberAt(0)
}

@CStruct("struct { unsigned char p0; int p1[3]; }")
class SDL_HapticDirection(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    val dir: CArrayPointer<Sint32Var>
        get() = arrayMemberAt(4)
}

@CStruct("struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; short p6; unsigned short p7; unsigned short p8; unsigned short p9; unsigned short p10; }")
class SDL_HapticConstant(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var level: Sint16
        get() = memberAt<Sint16Var>(30).value
        set(value) { memberAt<Sint16Var>(30).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(32).value
        set(value) { memberAt<Uint16Var>(32).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(36).value
        set(value) { memberAt<Uint16Var>(36).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(38).value
        set(value) { memberAt<Uint16Var>(38).value = value }
}

@CStruct("struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; unsigned short p6; short p7; short p8; unsigned short p9; unsigned short p10; unsigned short p11; unsigned short p12; unsigned short p13; }")
class SDL_HapticPeriodic(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var period: Uint16
        get() = memberAt<Uint16Var>(30).value
        set(value) { memberAt<Uint16Var>(30).value = value }
    
    var magnitude: Sint16
        get() = memberAt<Sint16Var>(32).value
        set(value) { memberAt<Sint16Var>(32).value = value }
    
    var offset: Sint16
        get() = memberAt<Sint16Var>(34).value
        set(value) { memberAt<Sint16Var>(34).value = value }
    
    var phase: Uint16
        get() = memberAt<Uint16Var>(36).value
        set(value) { memberAt<Uint16Var>(36).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(38).value
        set(value) { memberAt<Uint16Var>(38).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(40).value
        set(value) { memberAt<Uint16Var>(40).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(42).value
        set(value) { memberAt<Uint16Var>(42).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(44).value
        set(value) { memberAt<Uint16Var>(44).value = value }
}

@CStruct("struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; unsigned short p6[3]; unsigned short p7[3]; short p8[3]; short p9[3]; unsigned short p10[3]; short p11[3]; }")
class SDL_HapticCondition(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(68, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    val right_sat: CArrayPointer<Uint16Var>
        get() = arrayMemberAt(30)
    
    val left_sat: CArrayPointer<Uint16Var>
        get() = arrayMemberAt(36)
    
    val right_coeff: CArrayPointer<Sint16Var>
        get() = arrayMemberAt(42)
    
    val left_coeff: CArrayPointer<Sint16Var>
        get() = arrayMemberAt(48)
    
    val deadband: CArrayPointer<Uint16Var>
        get() = arrayMemberAt(54)
    
    val center: CArrayPointer<Sint16Var>
        get() = arrayMemberAt(60)
}

@CStruct("struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; short p6; short p7; unsigned short p8; unsigned short p9; unsigned short p10; unsigned short p11; }")
class SDL_HapticRamp(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(44, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var start: Sint16
        get() = memberAt<Sint16Var>(30).value
        set(value) { memberAt<Sint16Var>(30).value = value }
    
    var end: Sint16
        get() = memberAt<Sint16Var>(32).value
        set(value) { memberAt<Sint16Var>(32).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(36).value
        set(value) { memberAt<Uint16Var>(36).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(38).value
        set(value) { memberAt<Uint16Var>(38).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(40).value
        set(value) { memberAt<Uint16Var>(40).value = value }
}

@CStruct("struct { unsigned short p0; unsigned int p1; unsigned short p2; unsigned short p3; }")
class SDL_HapticLeftRight(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    var length: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var large_magnitude: Uint16
        get() = memberAt<Uint16Var>(8).value
        set(value) { memberAt<Uint16Var>(8).value = value }
    
    var small_magnitude: Uint16
        get() = memberAt<Uint16Var>(10).value
        set(value) { memberAt<Uint16Var>(10).value = value }
}

@CStruct("struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; unsigned char p6; unsigned short p7; unsigned short p8; void* p9; unsigned short p10; unsigned short p11; unsigned short p12; unsigned short p13; }")
class SDL_HapticCustom(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var channels: Uint8
        get() = memberAt<Uint8Var>(30).value
        set(value) { memberAt<Uint8Var>(30).value = value }
    
    var period: Uint16
        get() = memberAt<Uint16Var>(32).value
        set(value) { memberAt<Uint16Var>(32).value = value }
    
    var samples: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
    
    var data: CPointer<Uint16Var>?
        get() = memberAt<CPointerVar<Uint16Var>>(40).value
        set(value) { memberAt<CPointerVar<Uint16Var>>(40).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(48).value
        set(value) { memberAt<Uint16Var>(48).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(50).value
        set(value) { memberAt<Uint16Var>(50).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(52).value
        set(value) { memberAt<Uint16Var>(52).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(54).value
        set(value) { memberAt<Uint16Var>(54).value = value }
}

@CStruct("union { unsigned short p0; struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; short p6; unsigned short p7; unsigned short p8; unsigned short p9; unsigned short p10; } p1; struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; unsigned short p6; short p7; short p8; unsigned short p9; unsigned short p10; unsigned short p11; unsigned short p12; unsigned short p13; } p2; struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; unsigned short p6[3]; unsigned short p7[3]; short p8[3]; short p9[3]; unsigned short p10[3]; short p11[3]; } p3; struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; short p6; short p7; unsigned short p8; unsigned short p9; unsigned short p10; unsigned short p11; } p4; struct { unsigned short p0; unsigned int p1; unsigned short p2; unsigned short p3; } p5; struct { unsigned short p0; struct { unsigned char p0; int p1[3]; } p1; unsigned int p2; unsigned short p3; unsigned short p4; unsigned short p5; unsigned char p6; unsigned short p7; unsigned short p8; void* p9; unsigned short p10; unsigned short p11; unsigned short p12; unsigned short p13; } p6; }")
class SDL_HapticEffect(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val constant: SDL_HapticConstant
        get() = memberAt(0)
    
    val periodic: SDL_HapticPeriodic
        get() = memberAt(0)
    
    val condition: SDL_HapticCondition
        get() = memberAt(0)
    
    val ramp: SDL_HapticRamp
        get() = memberAt(0)
    
    val leftright: SDL_HapticLeftRight
        get() = memberAt(0)
    
    val custom: SDL_HapticCustom
        get() = memberAt(0)
}

@CStruct("struct { unsigned int p0; int p1; void* p2; }")
class SDL_MessageBoxButtonData(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var buttonid: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var text: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
}

@CStruct("struct { unsigned char p0; unsigned char p1; unsigned char p2; }")
class SDL_MessageBoxColor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(3, 1)
    
    var r: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    var g: Uint8
        get() = memberAt<Uint8Var>(1).value
        set(value) { memberAt<Uint8Var>(1).value = value }
    
    var b: Uint8
        get() = memberAt<Uint8Var>(2).value
        set(value) { memberAt<Uint8Var>(2).value = value }
}

@CStruct("struct { struct { unsigned char p0; unsigned char p1; unsigned char p2; } p0[5]; }")
class SDL_MessageBoxColorScheme(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(15, 1)
    
    val colors: CArrayPointer<SDL_MessageBoxColor>
        get() = arrayMemberAt(0)
}

@CStruct("struct { unsigned int p0; void* p1; void* p2; void* p3; int p4; void* p5; void* p6; }")
class SDL_MessageBoxData(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var window: CPointer<SDL_Window>?
        get() = memberAt<CPointerVar<SDL_Window>>(8).value
        set(value) { memberAt<CPointerVar<SDL_Window>>(8).value = value }
    
    var title: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var message: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var numbuttons: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var buttons: CPointer<SDL_MessageBoxButtonData>?
        get() = memberAt<CPointerVar<SDL_MessageBoxButtonData>>(40).value
        set(value) { memberAt<CPointerVar<SDL_MessageBoxButtonData>>(40).value = value }
    
    var colorScheme: CPointer<SDL_MessageBoxColorScheme>?
        get() = memberAt<CPointerVar<SDL_MessageBoxColorScheme>>(48).value
        set(value) { memberAt<CPointerVar<SDL_MessageBoxColorScheme>>(48).value = value }
}

@CStruct("struct { void* p0; unsigned int p1; unsigned int p2; unsigned int p3[16]; int p4; int p5; }")
class SDL_RendererInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var num_texture_formats: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    val texture_formats: CArrayPointer<Uint32Var>
        get() = arrayMemberAt(16)
    
    var max_texture_width: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var max_texture_height: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
}

@CStruct("union { unsigned char p0; struct { unsigned char p0; unsigned char p1; unsigned char p2; unsigned char p3; } p1; }")
class SDL_WindowShapeParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 1)
    
    var binarizationCutoff: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    val colorKey: SDL_Color
        get() = memberAt(0)
}

@CStruct("struct { unsigned int p0; union { unsigned char p0; struct { unsigned char p0; unsigned char p1; unsigned char p2; unsigned char p3; } p1; } p1; }")
class SDL_WindowShapeMode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var mode: WindowShapeMode
        get() = memberAt<WindowShapeMode.Var>(0).value
        set(value) { memberAt<WindowShapeMode.Var>(0).value = value }
    
    val parameters: SDL_WindowShapeParams
        get() = memberAt(4)
}

@CStruct("struct { unsigned char p0; unsigned char p1; unsigned char p2; }")
class SDL_version(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(3, 1)
    
    var major: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    var minor: Uint8
        get() = memberAt<Uint8Var>(1).value
        set(value) { memberAt<Uint8Var>(1).value = value }
    
    var patch: Uint8
        get() = memberAt<Uint8Var>(2).value
        set(value) { memberAt<Uint8Var>(2).value = value }
}

enum class SDL_DUMMY_ENUM(override val value: UInt) : CEnum {
    DUMMY_ENUM_VALUE(0u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_DUMMY_ENUM.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_DUMMY_ENUM
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_AssertState(override val value: UInt) : CEnum {
    SDL_ASSERTION_RETRY(0u),
    SDL_ASSERTION_BREAK(1u),
    SDL_ASSERTION_ABORT(2u),
    SDL_ASSERTION_IGNORE(3u),
    SDL_ASSERTION_ALWAYS_IGNORE(4u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_AssertState.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_AssertState
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_errorcode(override val value: UInt) : CEnum {
    SDL_ENOMEM(0u),
    SDL_EFREAD(1u),
    SDL_EFWRITE(2u),
    SDL_EFSEEK(3u),
    SDL_UNSUPPORTED(4u),
    SDL_LASTERROR(5u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_errorcode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_errorcode
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_ThreadPriority(override val value: UInt) : CEnum {
    SDL_THREAD_PRIORITY_LOW(0u),
    SDL_THREAD_PRIORITY_NORMAL(1u),
    SDL_THREAD_PRIORITY_HIGH(2u),
    SDL_THREAD_PRIORITY_TIME_CRITICAL(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_ThreadPriority.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_ThreadPriority
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_YUV_CONVERSION_MODE(override val value: UInt) : CEnum {
    SDL_YUV_CONVERSION_JPEG(0u),
    SDL_YUV_CONVERSION_BT601(1u),
    SDL_YUV_CONVERSION_BT709(2u),
    SDL_YUV_CONVERSION_AUTOMATIC(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_YUV_CONVERSION_MODE.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_YUV_CONVERSION_MODE
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_WindowEventID(override val value: UInt) : CEnum {
    SDL_WINDOWEVENT_NONE(0u),
    SDL_WINDOWEVENT_SHOWN(1u),
    SDL_WINDOWEVENT_HIDDEN(2u),
    SDL_WINDOWEVENT_EXPOSED(3u),
    SDL_WINDOWEVENT_MOVED(4u),
    SDL_WINDOWEVENT_RESIZED(5u),
    SDL_WINDOWEVENT_SIZE_CHANGED(6u),
    SDL_WINDOWEVENT_MINIMIZED(7u),
    SDL_WINDOWEVENT_MAXIMIZED(8u),
    SDL_WINDOWEVENT_RESTORED(9u),
    SDL_WINDOWEVENT_ENTER(10u),
    SDL_WINDOWEVENT_LEAVE(11u),
    SDL_WINDOWEVENT_FOCUS_GAINED(12u),
    SDL_WINDOWEVENT_FOCUS_LOST(13u),
    SDL_WINDOWEVENT_CLOSE(14u),
    SDL_WINDOWEVENT_TAKE_FOCUS(15u),
    SDL_WINDOWEVENT_HIT_TEST(16u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_WindowEventID.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_WindowEventID
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_DisplayEventID(override val value: UInt) : CEnum {
    SDL_DISPLAYEVENT_NONE(0u),
    SDL_DISPLAYEVENT_ORIENTATION(1u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_DisplayEventID.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_DisplayEventID
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_DisplayOrientation(override val value: UInt) : CEnum {
    SDL_ORIENTATION_UNKNOWN(0u),
    SDL_ORIENTATION_LANDSCAPE(1u),
    SDL_ORIENTATION_LANDSCAPE_FLIPPED(2u),
    SDL_ORIENTATION_PORTRAIT(3u),
    SDL_ORIENTATION_PORTRAIT_FLIPPED(4u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_DisplayOrientation.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_DisplayOrientation
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_GLattr(override val value: UInt) : CEnum {
    SDL_GL_RED_SIZE(0u),
    SDL_GL_GREEN_SIZE(1u),
    SDL_GL_BLUE_SIZE(2u),
    SDL_GL_ALPHA_SIZE(3u),
    SDL_GL_BUFFER_SIZE(4u),
    SDL_GL_DOUBLEBUFFER(5u),
    SDL_GL_DEPTH_SIZE(6u),
    SDL_GL_STENCIL_SIZE(7u),
    SDL_GL_ACCUM_RED_SIZE(8u),
    SDL_GL_ACCUM_GREEN_SIZE(9u),
    SDL_GL_ACCUM_BLUE_SIZE(10u),
    SDL_GL_ACCUM_ALPHA_SIZE(11u),
    SDL_GL_STEREO(12u),
    SDL_GL_MULTISAMPLEBUFFERS(13u),
    SDL_GL_MULTISAMPLESAMPLES(14u),
    SDL_GL_ACCELERATED_VISUAL(15u),
    SDL_GL_RETAINED_BACKING(16u),
    SDL_GL_CONTEXT_MAJOR_VERSION(17u),
    SDL_GL_CONTEXT_MINOR_VERSION(18u),
    SDL_GL_CONTEXT_EGL(19u),
    SDL_GL_CONTEXT_FLAGS(20u),
    SDL_GL_CONTEXT_PROFILE_MASK(21u),
    SDL_GL_SHARE_WITH_CURRENT_CONTEXT(22u),
    SDL_GL_FRAMEBUFFER_SRGB_CAPABLE(23u),
    SDL_GL_CONTEXT_RELEASE_BEHAVIOR(24u),
    SDL_GL_CONTEXT_RESET_NOTIFICATION(25u),
    SDL_GL_CONTEXT_NO_ERROR(26u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_GLattr.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_GLattr
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_HitTestResult(override val value: UInt) : CEnum {
    SDL_HITTEST_NORMAL(0u),
    SDL_HITTEST_DRAGGABLE(1u),
    SDL_HITTEST_RESIZE_TOPLEFT(2u),
    SDL_HITTEST_RESIZE_TOP(3u),
    SDL_HITTEST_RESIZE_TOPRIGHT(4u),
    SDL_HITTEST_RESIZE_RIGHT(5u),
    SDL_HITTEST_RESIZE_BOTTOMRIGHT(6u),
    SDL_HITTEST_RESIZE_BOTTOM(7u),
    SDL_HITTEST_RESIZE_BOTTOMLEFT(8u),
    SDL_HITTEST_RESIZE_LEFT(9u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_HitTestResult.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_HitTestResult
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_SystemCursor(override val value: UInt) : CEnum {
    SDL_SYSTEM_CURSOR_ARROW(0u),
    SDL_SYSTEM_CURSOR_IBEAM(1u),
    SDL_SYSTEM_CURSOR_WAIT(2u),
    SDL_SYSTEM_CURSOR_CROSSHAIR(3u),
    SDL_SYSTEM_CURSOR_WAITARROW(4u),
    SDL_SYSTEM_CURSOR_SIZENWSE(5u),
    SDL_SYSTEM_CURSOR_SIZENESW(6u),
    SDL_SYSTEM_CURSOR_SIZEWE(7u),
    SDL_SYSTEM_CURSOR_SIZENS(8u),
    SDL_SYSTEM_CURSOR_SIZEALL(9u),
    SDL_SYSTEM_CURSOR_NO(10u),
    SDL_SYSTEM_CURSOR_HAND(11u),
    SDL_NUM_SYSTEM_CURSORS(12u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_SystemCursor.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_SystemCursor
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_MouseWheelDirection(override val value: UInt) : CEnum {
    SDL_MOUSEWHEEL_NORMAL(0u),
    SDL_MOUSEWHEEL_FLIPPED(1u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_MouseWheelDirection.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_MouseWheelDirection
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_JoystickType(override val value: UInt) : CEnum {
    SDL_JOYSTICK_TYPE_UNKNOWN(0u),
    SDL_JOYSTICK_TYPE_GAMECONTROLLER(1u),
    SDL_JOYSTICK_TYPE_WHEEL(2u),
    SDL_JOYSTICK_TYPE_ARCADE_STICK(3u),
    SDL_JOYSTICK_TYPE_FLIGHT_STICK(4u),
    SDL_JOYSTICK_TYPE_DANCE_PAD(5u),
    SDL_JOYSTICK_TYPE_GUITAR(6u),
    SDL_JOYSTICK_TYPE_DRUM_KIT(7u),
    SDL_JOYSTICK_TYPE_ARCADE_PAD(8u),
    SDL_JOYSTICK_TYPE_THROTTLE(9u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_JoystickType.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_JoystickType
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_eventaction(override val value: UInt) : CEnum {
    SDL_ADDEVENT(0u),
    SDL_PEEKEVENT(1u),
    SDL_GETEVENT(2u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_eventaction.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_eventaction
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_HintPriority(override val value: UInt) : CEnum {
    SDL_HINT_DEFAULT(0u),
    SDL_HINT_NORMAL(1u),
    SDL_HINT_OVERRIDE(2u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_HintPriority.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_HintPriority
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_MessageBoxColorType(override val value: UInt) : CEnum {
    SDL_MESSAGEBOX_COLOR_BACKGROUND(0u),
    SDL_MESSAGEBOX_COLOR_TEXT(1u),
    SDL_MESSAGEBOX_COLOR_BUTTON_BORDER(2u),
    SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND(3u),
    SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED(4u),
    SDL_MESSAGEBOX_COLOR_MAX(5u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_MessageBoxColorType.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_MessageBoxColorType
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_PowerState(override val value: UInt) : CEnum {
    SDL_POWERSTATE_UNKNOWN(0u),
    SDL_POWERSTATE_ON_BATTERY(1u),
    SDL_POWERSTATE_NO_BATTERY(2u),
    SDL_POWERSTATE_CHARGING(3u),
    SDL_POWERSTATE_CHARGED(4u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_PowerState.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_PowerState
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class SDL_TextureAccess(override val value: UInt) : CEnum {
    SDL_TEXTUREACCESS_STATIC(0u),
    SDL_TEXTUREACCESS_STREAMING(1u),
    SDL_TEXTUREACCESS_TARGET(2u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = SDL_TextureAccess.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: SDL_TextureAccess
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class WindowShapeMode(override val value: UInt) : CEnum {
    ShapeModeDefault(0u),
    ShapeModeBinarizeAlpha(1u),
    ShapeModeReverseBinarizeAlpha(2u),
    ShapeModeColorKey(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = WindowShapeMode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: WindowShapeMode
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

fun SDL_GetPlatform(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge0())
}

fun SDL_malloc(size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge1(size))
}

fun SDL_calloc(nmemb: size_t, size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge2(nmemb, size))
}

fun SDL_realloc(mem: CValuesRef<*>?, size: size_t): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge3(mem?.getPointer(memScope).rawValue, size))
    }
}

fun SDL_free(mem: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge4(mem?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetMemoryFunctions(malloc_func: CValuesRef<SDL_malloc_funcVar>?, calloc_func: CValuesRef<SDL_calloc_funcVar>?, realloc_func: CValuesRef<SDL_realloc_funcVar>?, free_func: CValuesRef<SDL_free_funcVar>?): Unit {
    memScoped {
        return kniBridge5(malloc_func?.getPointer(memScope).rawValue, calloc_func?.getPointer(memScope).rawValue, realloc_func?.getPointer(memScope).rawValue, free_func?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetMemoryFunctions(malloc_func: SDL_malloc_func?, calloc_func: SDL_calloc_func?, realloc_func: SDL_realloc_func?, free_func: SDL_free_func?): Int {
    return kniBridge6(malloc_func.rawValue, calloc_func.rawValue, realloc_func.rawValue, free_func.rawValue)
}

fun SDL_GetNumAllocations(): Int {
    return kniBridge7()
}

fun SDL_getenv(@CCall.CString name: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge8(name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_setenv(@CCall.CString name: String?, @CCall.CString value: String?, overwrite: Int): Int {
    memScoped {
        return kniBridge9(name?.cstr?.getPointer(memScope).rawValue, value?.cstr?.getPointer(memScope).rawValue, overwrite)
    }
}

fun SDL_qsort(base: CValuesRef<*>?, nmemb: size_t, size: size_t, compare: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>?): Unit {
    memScoped {
        return kniBridge10(base?.getPointer(memScope).rawValue, nmemb, size, compare.rawValue)
    }
}

fun SDL_abs(x: Int): Int {
    return kniBridge11(x)
}

fun SDL_isdigit(x: Int): Int {
    return kniBridge12(x)
}

fun SDL_isspace(x: Int): Int {
    return kniBridge13(x)
}

fun SDL_toupper(x: Int): Int {
    return kniBridge14(x)
}

fun SDL_tolower(x: Int): Int {
    return kniBridge15(x)
}

fun SDL_memset(dst: CValuesRef<*>?, c: Int, len: size_t): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge16(dst?.getPointer(memScope).rawValue, c, len))
    }
}

fun SDL_memset4(dst: CValuesRef<*>?, `val`: Uint32, dwords: size_t): Unit {
    memScoped {
        return kniBridge17(dst?.getPointer(memScope).rawValue, `val`, dwords)
    }
}

fun SDL_memcpy(dst: CValuesRef<*>?, src: CValuesRef<*>?, len: size_t): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge18(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, len))
    }
}

fun SDL_memmove(dst: CValuesRef<*>?, src: CValuesRef<*>?, len: size_t): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge19(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, len))
    }
}

fun SDL_memcmp(s1: CValuesRef<*>?, s2: CValuesRef<*>?, len: size_t): Int {
    memScoped {
        return kniBridge20(s1?.getPointer(memScope).rawValue, s2?.getPointer(memScope).rawValue, len)
    }
}

fun SDL_wcsdup(wstr: CValuesRef<wchar_tVar>?): CPointer<wchar_tVar>? {
    memScoped {
        return interpretCPointer<wchar_tVar>(kniBridge21(wstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_wcslen(wstr: CValuesRef<wchar_tVar>?): size_t {
    memScoped {
        return kniBridge22(wstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_wcslcpy(dst: CValuesRef<wchar_tVar>?, src: CValuesRef<wchar_tVar>?, maxlen: size_t): size_t {
    memScoped {
        return kniBridge23(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, maxlen)
    }
}

fun SDL_wcslcat(dst: CValuesRef<wchar_tVar>?, src: CValuesRef<wchar_tVar>?, maxlen: size_t): size_t {
    memScoped {
        return kniBridge24(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, maxlen)
    }
}

fun SDL_wcscmp(str1: CValuesRef<wchar_tVar>?, str2: CValuesRef<wchar_tVar>?): Int {
    memScoped {
        return kniBridge25(str1?.getPointer(memScope).rawValue, str2?.getPointer(memScope).rawValue)
    }
}

fun SDL_strlen(@CCall.CString str: String?): size_t {
    memScoped {
        return kniBridge26(str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_strlcpy(dst: CValuesRef<ByteVar>?, @CCall.CString src: String?, maxlen: size_t): size_t {
    memScoped {
        return kniBridge27(dst?.getPointer(memScope).rawValue, src?.cstr?.getPointer(memScope).rawValue, maxlen)
    }
}

fun SDL_utf8strlcpy(dst: CValuesRef<ByteVar>?, @CCall.CString src: String?, dst_bytes: size_t): size_t {
    memScoped {
        return kniBridge28(dst?.getPointer(memScope).rawValue, src?.cstr?.getPointer(memScope).rawValue, dst_bytes)
    }
}

fun SDL_strlcat(dst: CValuesRef<ByteVar>?, @CCall.CString src: String?, maxlen: size_t): size_t {
    memScoped {
        return kniBridge29(dst?.getPointer(memScope).rawValue, src?.cstr?.getPointer(memScope).rawValue, maxlen)
    }
}

fun SDL_strdup(@CCall.CString str: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge30(str?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_strrev(str: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge31(str?.getPointer(memScope).rawValue))
    }
}

fun SDL_strupr(str: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge32(str?.getPointer(memScope).rawValue))
    }
}

fun SDL_strlwr(str: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge33(str?.getPointer(memScope).rawValue))
    }
}

fun SDL_strchr(@CCall.CString str: String?, c: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge34(str?.cstr?.getPointer(memScope).rawValue, c))
    }
}

fun SDL_strrchr(@CCall.CString str: String?, c: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge35(str?.cstr?.getPointer(memScope).rawValue, c))
    }
}

fun SDL_strstr(@CCall.CString haystack: String?, @CCall.CString needle: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge36(haystack?.cstr?.getPointer(memScope).rawValue, needle?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_utf8strlen(@CCall.CString str: String?): size_t {
    memScoped {
        return kniBridge37(str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_itoa(value: Int, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge38(value, str?.getPointer(memScope).rawValue, radix))
    }
}

fun SDL_uitoa(value: UInt, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge39(value, str?.getPointer(memScope).rawValue, radix))
    }
}

fun SDL_ltoa(value: Long, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge40(value, str?.getPointer(memScope).rawValue, radix))
    }
}

fun SDL_ultoa(value: ULong, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge41(value, str?.getPointer(memScope).rawValue, radix))
    }
}

fun SDL_lltoa(value: Sint64, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge42(value, str?.getPointer(memScope).rawValue, radix))
    }
}

fun SDL_ulltoa(value: Uint64, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge43(value, str?.getPointer(memScope).rawValue, radix))
    }
}

fun SDL_atoi(@CCall.CString str: String?): Int {
    memScoped {
        return kniBridge44(str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_atof(@CCall.CString str: String?): Double {
    memScoped {
        return kniBridge45(str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_strtol(@CCall.CString str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): Long {
    memScoped {
        return kniBridge46(str?.cstr?.getPointer(memScope).rawValue, endp?.getPointer(memScope).rawValue, base)
    }
}

fun SDL_strtoul(@CCall.CString str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): ULong {
    memScoped {
        return kniBridge47(str?.cstr?.getPointer(memScope).rawValue, endp?.getPointer(memScope).rawValue, base)
    }
}

fun SDL_strtoll(@CCall.CString str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): Sint64 {
    memScoped {
        return kniBridge48(str?.cstr?.getPointer(memScope).rawValue, endp?.getPointer(memScope).rawValue, base)
    }
}

fun SDL_strtoull(@CCall.CString str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): Uint64 {
    memScoped {
        return kniBridge49(str?.cstr?.getPointer(memScope).rawValue, endp?.getPointer(memScope).rawValue, base)
    }
}

fun SDL_strtod(@CCall.CString str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?): Double {
    memScoped {
        return kniBridge50(str?.cstr?.getPointer(memScope).rawValue, endp?.getPointer(memScope).rawValue)
    }
}

fun SDL_strcmp(@CCall.CString str1: String?, @CCall.CString str2: String?): Int {
    memScoped {
        return kniBridge51(str1?.cstr?.getPointer(memScope).rawValue, str2?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_strncmp(@CCall.CString str1: String?, @CCall.CString str2: String?, maxlen: size_t): Int {
    memScoped {
        return kniBridge52(str1?.cstr?.getPointer(memScope).rawValue, str2?.cstr?.getPointer(memScope).rawValue, maxlen)
    }
}

fun SDL_strcasecmp(@CCall.CString str1: String?, @CCall.CString str2: String?): Int {
    memScoped {
        return kniBridge53(str1?.cstr?.getPointer(memScope).rawValue, str2?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_strncasecmp(@CCall.CString str1: String?, @CCall.CString str2: String?, len: size_t): Int {
    memScoped {
        return kniBridge54(str1?.cstr?.getPointer(memScope).rawValue, str2?.cstr?.getPointer(memScope).rawValue, len)
    }
}

@CCall("knifunptr_sdl0")
external fun SDL_sscanf(@CCall.CString text: String?, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Int

fun SDL_vsscanf(@CCall.CString text: String?, @CCall.CString fmt: String?, ap: va_list?): Int {
    memScoped {
        return kniBridge55(text?.cstr?.getPointer(memScope).rawValue, fmt?.cstr?.getPointer(memScope).rawValue, ap.rawValue)
    }
}

@CCall("knifunptr_sdl1")
external fun SDL_snprintf(text: CValuesRef<ByteVar>?, maxlen: size_t, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Int

fun SDL_vsnprintf(text: CValuesRef<ByteVar>?, maxlen: size_t, @CCall.CString fmt: String?, ap: va_list?): Int {
    memScoped {
        return kniBridge56(text?.getPointer(memScope).rawValue, maxlen, fmt?.cstr?.getPointer(memScope).rawValue, ap.rawValue)
    }
}

fun SDL_acos(x: Double): Double {
    return kniBridge57(x)
}

fun SDL_acosf(x: Float): Float {
    return kniBridge58(x)
}

fun SDL_asin(x: Double): Double {
    return kniBridge59(x)
}

fun SDL_asinf(x: Float): Float {
    return kniBridge60(x)
}

fun SDL_atan(x: Double): Double {
    return kniBridge61(x)
}

fun SDL_atanf(x: Float): Float {
    return kniBridge62(x)
}

fun SDL_atan2(x: Double, y: Double): Double {
    return kniBridge63(x, y)
}

fun SDL_atan2f(x: Float, y: Float): Float {
    return kniBridge64(x, y)
}

fun SDL_ceil(x: Double): Double {
    return kniBridge65(x)
}

fun SDL_ceilf(x: Float): Float {
    return kniBridge66(x)
}

fun SDL_copysign(x: Double, y: Double): Double {
    return kniBridge67(x, y)
}

fun SDL_copysignf(x: Float, y: Float): Float {
    return kniBridge68(x, y)
}

fun SDL_cos(x: Double): Double {
    return kniBridge69(x)
}

fun SDL_cosf(x: Float): Float {
    return kniBridge70(x)
}

fun SDL_exp(x: Double): Double {
    return kniBridge71(x)
}

fun SDL_expf(x: Float): Float {
    return kniBridge72(x)
}

fun SDL_fabs(x: Double): Double {
    return kniBridge73(x)
}

fun SDL_fabsf(x: Float): Float {
    return kniBridge74(x)
}

fun SDL_floor(x: Double): Double {
    return kniBridge75(x)
}

fun SDL_floorf(x: Float): Float {
    return kniBridge76(x)
}

fun SDL_fmod(x: Double, y: Double): Double {
    return kniBridge77(x, y)
}

fun SDL_fmodf(x: Float, y: Float): Float {
    return kniBridge78(x, y)
}

fun SDL_log(x: Double): Double {
    return kniBridge79(x)
}

fun SDL_logf(x: Float): Float {
    return kniBridge80(x)
}

fun SDL_log10(x: Double): Double {
    return kniBridge81(x)
}

fun SDL_log10f(x: Float): Float {
    return kniBridge82(x)
}

fun SDL_pow(x: Double, y: Double): Double {
    return kniBridge83(x, y)
}

fun SDL_powf(x: Float, y: Float): Float {
    return kniBridge84(x, y)
}

fun SDL_scalbn(x: Double, n: Int): Double {
    return kniBridge85(x, n)
}

fun SDL_scalbnf(x: Float, n: Int): Float {
    return kniBridge86(x, n)
}

fun SDL_sin(x: Double): Double {
    return kniBridge87(x)
}

fun SDL_sinf(x: Float): Float {
    return kniBridge88(x)
}

fun SDL_sqrt(x: Double): Double {
    return kniBridge89(x)
}

fun SDL_sqrtf(x: Float): Float {
    return kniBridge90(x)
}

fun SDL_tan(x: Double): Double {
    return kniBridge91(x)
}

fun SDL_tanf(x: Float): Float {
    return kniBridge92(x)
}

fun SDL_iconv_open(@CCall.CString tocode: String?, @CCall.CString fromcode: String?): SDL_iconv_t? {
    memScoped {
        return interpretCPointer<_SDL_iconv_t>(kniBridge93(tocode?.cstr?.getPointer(memScope).rawValue, fromcode?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_iconv_close(cd: SDL_iconv_t?): Int {
    return kniBridge94(cd.rawValue)
}

fun SDL_iconv(cd: SDL_iconv_t?, inbuf: CValuesRef<CPointerVar<ByteVar>>?, inbytesleft: CValuesRef<size_tVar>?, outbuf: CValuesRef<CPointerVar<ByteVar>>?, outbytesleft: CValuesRef<size_tVar>?): size_t {
    memScoped {
        return kniBridge95(cd.rawValue, inbuf?.getPointer(memScope).rawValue, inbytesleft?.getPointer(memScope).rawValue, outbuf?.getPointer(memScope).rawValue, outbytesleft?.getPointer(memScope).rawValue)
    }
}

fun SDL_iconv_string(@CCall.CString tocode: String?, @CCall.CString fromcode: String?, @CCall.CString inbuf: String?, inbytesleft: size_t): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge96(tocode?.cstr?.getPointer(memScope).rawValue, fromcode?.cstr?.getPointer(memScope).rawValue, inbuf?.cstr?.getPointer(memScope).rawValue, inbytesleft))
    }
}

fun SDL_memcpy4(dst: CValuesRef<*>?, src: CValuesRef<*>?, dwords: size_t): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge97(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, dwords))
    }
}

fun SDL_main(argc: Int, argv: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge98(argc, argv?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetMainReady(): Unit {
    return kniBridge99()
}

fun SDL_ReportAssertion(arg0: CValuesRef<SDL_AssertData>?, @CCall.CString arg1: String?, @CCall.CString arg2: String?, arg3: Int): SDL_AssertState {
    memScoped {
        return SDL_AssertState.byValue(kniBridge100(arg0?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue, arg2?.cstr?.getPointer(memScope).rawValue, arg3))
    }
}

fun SDL_SetAssertionHandler(handler: SDL_AssertionHandler?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge101(handler.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetDefaultAssertionHandler(): SDL_AssertionHandler? {
    return interpretCPointer<CFunction<(CPointer<SDL_AssertData>?, COpaquePointer?) -> SDL_AssertState>>(kniBridge102())
}

fun SDL_GetAssertionHandler(puserdata: CValuesRef<COpaquePointerVar>?): SDL_AssertionHandler? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<SDL_AssertData>?, COpaquePointer?) -> SDL_AssertState>>(kniBridge103(puserdata?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetAssertionReport(): CPointer<SDL_AssertData>? {
    return interpretCPointer<SDL_AssertData>(kniBridge104())
}

fun SDL_ResetAssertionReport(): Unit {
    return kniBridge105()
}

fun SDL_AtomicTryLock(lock: CValuesRef<SDL_SpinLockVar>?): SDL_bool {
    memScoped {
        return kniBridge106(lock?.getPointer(memScope).rawValue)
    }
}

fun SDL_AtomicLock(lock: CValuesRef<SDL_SpinLockVar>?): Unit {
    memScoped {
        return kniBridge107(lock?.getPointer(memScope).rawValue)
    }
}

fun SDL_AtomicUnlock(lock: CValuesRef<SDL_SpinLockVar>?): Unit {
    memScoped {
        return kniBridge108(lock?.getPointer(memScope).rawValue)
    }
}

fun SDL_MemoryBarrierReleaseFunction(): Unit {
    return kniBridge109()
}

fun SDL_MemoryBarrierAcquireFunction(): Unit {
    return kniBridge110()
}

fun SDL_AtomicCAS(a: CValuesRef<SDL_atomic_t>?, oldval: Int, newval: Int): SDL_bool {
    memScoped {
        return kniBridge111(a?.getPointer(memScope).rawValue, oldval, newval)
    }
}

fun SDL_AtomicSet(a: CValuesRef<SDL_atomic_t>?, v: Int): Int {
    memScoped {
        return kniBridge112(a?.getPointer(memScope).rawValue, v)
    }
}

fun SDL_AtomicGet(a: CValuesRef<SDL_atomic_t>?): Int {
    memScoped {
        return kniBridge113(a?.getPointer(memScope).rawValue)
    }
}

fun SDL_AtomicAdd(a: CValuesRef<SDL_atomic_t>?, v: Int): Int {
    memScoped {
        return kniBridge114(a?.getPointer(memScope).rawValue, v)
    }
}

fun SDL_AtomicCASPtr(a: CValuesRef<COpaquePointerVar>?, oldval: CValuesRef<*>?, newval: CValuesRef<*>?): SDL_bool {
    memScoped {
        return kniBridge115(a?.getPointer(memScope).rawValue, oldval?.getPointer(memScope).rawValue, newval?.getPointer(memScope).rawValue)
    }
}

fun SDL_AtomicSetPtr(a: CValuesRef<COpaquePointerVar>?, v: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge116(a?.getPointer(memScope).rawValue, v?.getPointer(memScope).rawValue))
    }
}

fun SDL_AtomicGetPtr(a: CValuesRef<COpaquePointerVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge117(a?.getPointer(memScope).rawValue))
    }
}

@CCall("knifunptr_sdl2")
external fun SDL_SetError(@CCall.CString fmt: String?, vararg variadicArguments: Any?): Int

fun SDL_GetError(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge118())
}

fun SDL_ClearError(): Unit {
    return kniBridge119()
}

fun SDL_Error(code: SDL_errorcode): Int {
    return kniBridge120(code.value)
}

fun SDL_Swap16(x: Uint16): Uint16 {
    return kniBridge121(x)
}

fun SDL_Swap32(x: Uint32): Uint32 {
    return kniBridge122(x)
}

fun SDL_Swap64(x: Uint64): Uint64 {
    return kniBridge123(x)
}

fun SDL_SwapFloat(x: Float): Float {
    return kniBridge124(x)
}

fun SDL_CreateMutex(): CPointer<SDL_mutex>? {
    return interpretCPointer<SDL_mutex>(kniBridge125())
}

fun SDL_LockMutex(mutex: CValuesRef<SDL_mutex>?): Int {
    memScoped {
        return kniBridge126(mutex?.getPointer(memScope).rawValue)
    }
}

fun SDL_TryLockMutex(mutex: CValuesRef<SDL_mutex>?): Int {
    memScoped {
        return kniBridge127(mutex?.getPointer(memScope).rawValue)
    }
}

fun SDL_UnlockMutex(mutex: CValuesRef<SDL_mutex>?): Int {
    memScoped {
        return kniBridge128(mutex?.getPointer(memScope).rawValue)
    }
}

fun SDL_DestroyMutex(mutex: CValuesRef<SDL_mutex>?): Unit {
    memScoped {
        return kniBridge129(mutex?.getPointer(memScope).rawValue)
    }
}

fun SDL_CreateSemaphore(initial_value: Uint32): CPointer<SDL_sem>? {
    return interpretCPointer<SDL_sem>(kniBridge130(initial_value))
}

fun SDL_DestroySemaphore(sem: CValuesRef<SDL_sem>?): Unit {
    memScoped {
        return kniBridge131(sem?.getPointer(memScope).rawValue)
    }
}

fun SDL_SemWait(sem: CValuesRef<SDL_sem>?): Int {
    memScoped {
        return kniBridge132(sem?.getPointer(memScope).rawValue)
    }
}

fun SDL_SemTryWait(sem: CValuesRef<SDL_sem>?): Int {
    memScoped {
        return kniBridge133(sem?.getPointer(memScope).rawValue)
    }
}

fun SDL_SemWaitTimeout(sem: CValuesRef<SDL_sem>?, ms: Uint32): Int {
    memScoped {
        return kniBridge134(sem?.getPointer(memScope).rawValue, ms)
    }
}

fun SDL_SemPost(sem: CValuesRef<SDL_sem>?): Int {
    memScoped {
        return kniBridge135(sem?.getPointer(memScope).rawValue)
    }
}

fun SDL_SemValue(sem: CValuesRef<SDL_sem>?): Uint32 {
    memScoped {
        return kniBridge136(sem?.getPointer(memScope).rawValue)
    }
}

fun SDL_CreateCond(): CPointer<SDL_cond>? {
    return interpretCPointer<SDL_cond>(kniBridge137())
}

fun SDL_DestroyCond(cond: CValuesRef<SDL_cond>?): Unit {
    memScoped {
        return kniBridge138(cond?.getPointer(memScope).rawValue)
    }
}

fun SDL_CondSignal(cond: CValuesRef<SDL_cond>?): Int {
    memScoped {
        return kniBridge139(cond?.getPointer(memScope).rawValue)
    }
}

fun SDL_CondBroadcast(cond: CValuesRef<SDL_cond>?): Int {
    memScoped {
        return kniBridge140(cond?.getPointer(memScope).rawValue)
    }
}

fun SDL_CondWait(cond: CValuesRef<SDL_cond>?, mutex: CValuesRef<SDL_mutex>?): Int {
    memScoped {
        return kniBridge141(cond?.getPointer(memScope).rawValue, mutex?.getPointer(memScope).rawValue)
    }
}

fun SDL_CondWaitTimeout(cond: CValuesRef<SDL_cond>?, mutex: CValuesRef<SDL_mutex>?, ms: Uint32): Int {
    memScoped {
        return kniBridge142(cond?.getPointer(memScope).rawValue, mutex?.getPointer(memScope).rawValue, ms)
    }
}

fun SDL_CreateThread(fn: SDL_ThreadFunction?, @CCall.CString name: String?, data: CValuesRef<*>?): CPointer<SDL_Thread>? {
    memScoped {
        return interpretCPointer<SDL_Thread>(kniBridge143(fn.rawValue, name?.cstr?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue))
    }
}

fun SDL_CreateThreadWithStackSize(fn: SDL_ThreadFunction?, @CCall.CString name: String?, stacksize: size_t, data: CValuesRef<*>?): CPointer<SDL_Thread>? {
    memScoped {
        return interpretCPointer<SDL_Thread>(kniBridge144(fn.rawValue, name?.cstr?.getPointer(memScope).rawValue, stacksize, data?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetThreadName(thread: CValuesRef<SDL_Thread>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge145(thread?.getPointer(memScope).rawValue))
    }
}

fun SDL_ThreadID(): SDL_threadID {
    return kniBridge146()
}

fun SDL_GetThreadID(thread: CValuesRef<SDL_Thread>?): SDL_threadID {
    memScoped {
        return kniBridge147(thread?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetThreadPriority(priority: SDL_ThreadPriority): Int {
    return kniBridge148(priority.value)
}

fun SDL_WaitThread(thread: CValuesRef<SDL_Thread>?, status: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge149(thread?.getPointer(memScope).rawValue, status?.getPointer(memScope).rawValue)
    }
}

fun SDL_DetachThread(thread: CValuesRef<SDL_Thread>?): Unit {
    memScoped {
        return kniBridge150(thread?.getPointer(memScope).rawValue)
    }
}

fun SDL_TLSCreate(): SDL_TLSID {
    return kniBridge151()
}

fun SDL_TLSGet(id: SDL_TLSID): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge152(id))
}

fun SDL_TLSSet(id: SDL_TLSID, value: CValuesRef<*>?, destructor: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge153(id, value?.getPointer(memScope).rawValue, destructor.rawValue)
    }
}

fun SDL_RWFromFile(@CCall.CString file: String?, @CCall.CString mode: String?): CPointer<SDL_RWops>? {
    memScoped {
        return interpretCPointer<SDL_RWops>(kniBridge154(file?.cstr?.getPointer(memScope).rawValue, mode?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_RWFromFP(fp: CValuesRef<FILE>?, autoclose: SDL_bool): CPointer<SDL_RWops>? {
    memScoped {
        return interpretCPointer<SDL_RWops>(kniBridge155(fp?.getPointer(memScope).rawValue, autoclose))
    }
}

fun SDL_RWFromMem(mem: CValuesRef<*>?, size: Int): CPointer<SDL_RWops>? {
    memScoped {
        return interpretCPointer<SDL_RWops>(kniBridge156(mem?.getPointer(memScope).rawValue, size))
    }
}

fun SDL_RWFromConstMem(mem: CValuesRef<*>?, size: Int): CPointer<SDL_RWops>? {
    memScoped {
        return interpretCPointer<SDL_RWops>(kniBridge157(mem?.getPointer(memScope).rawValue, size))
    }
}

fun SDL_AllocRW(): CPointer<SDL_RWops>? {
    return interpretCPointer<SDL_RWops>(kniBridge158())
}

fun SDL_FreeRW(area: CValuesRef<SDL_RWops>?): Unit {
    memScoped {
        return kniBridge159(area?.getPointer(memScope).rawValue)
    }
}

fun SDL_RWsize(context: CValuesRef<SDL_RWops>?): Sint64 {
    memScoped {
        return kniBridge160(context?.getPointer(memScope).rawValue)
    }
}

fun SDL_RWseek(context: CValuesRef<SDL_RWops>?, offset: Sint64, whence: Int): Sint64 {
    memScoped {
        return kniBridge161(context?.getPointer(memScope).rawValue, offset, whence)
    }
}

fun SDL_RWtell(context: CValuesRef<SDL_RWops>?): Sint64 {
    memScoped {
        return kniBridge162(context?.getPointer(memScope).rawValue)
    }
}

fun SDL_RWread(context: CValuesRef<SDL_RWops>?, ptr: CValuesRef<*>?, size: size_t, maxnum: size_t): size_t {
    memScoped {
        return kniBridge163(context?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, size, maxnum)
    }
}

fun SDL_RWwrite(context: CValuesRef<SDL_RWops>?, ptr: CValuesRef<*>?, size: size_t, num: size_t): size_t {
    memScoped {
        return kniBridge164(context?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, size, num)
    }
}

fun SDL_RWclose(context: CValuesRef<SDL_RWops>?): Int {
    memScoped {
        return kniBridge165(context?.getPointer(memScope).rawValue)
    }
}

fun SDL_LoadFile_RW(src: CValuesRef<SDL_RWops>?, datasize: CValuesRef<size_tVar>?, freesrc: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge166(src?.getPointer(memScope).rawValue, datasize?.getPointer(memScope).rawValue, freesrc))
    }
}

fun SDL_LoadFile(@CCall.CString file: String?, datasize: CValuesRef<size_tVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge167(file?.cstr?.getPointer(memScope).rawValue, datasize?.getPointer(memScope).rawValue))
    }
}

fun SDL_ReadU8(src: CValuesRef<SDL_RWops>?): Uint8 {
    memScoped {
        return kniBridge168(src?.getPointer(memScope).rawValue)
    }
}

fun SDL_ReadLE16(src: CValuesRef<SDL_RWops>?): Uint16 {
    memScoped {
        return kniBridge169(src?.getPointer(memScope).rawValue)
    }
}

fun SDL_ReadBE16(src: CValuesRef<SDL_RWops>?): Uint16 {
    memScoped {
        return kniBridge170(src?.getPointer(memScope).rawValue)
    }
}

fun SDL_ReadLE32(src: CValuesRef<SDL_RWops>?): Uint32 {
    memScoped {
        return kniBridge171(src?.getPointer(memScope).rawValue)
    }
}

fun SDL_ReadBE32(src: CValuesRef<SDL_RWops>?): Uint32 {
    memScoped {
        return kniBridge172(src?.getPointer(memScope).rawValue)
    }
}

fun SDL_ReadLE64(src: CValuesRef<SDL_RWops>?): Uint64 {
    memScoped {
        return kniBridge173(src?.getPointer(memScope).rawValue)
    }
}

fun SDL_ReadBE64(src: CValuesRef<SDL_RWops>?): Uint64 {
    memScoped {
        return kniBridge174(src?.getPointer(memScope).rawValue)
    }
}

fun SDL_WriteU8(dst: CValuesRef<SDL_RWops>?, value: Uint8): size_t {
    memScoped {
        return kniBridge175(dst?.getPointer(memScope).rawValue, value)
    }
}

fun SDL_WriteLE16(dst: CValuesRef<SDL_RWops>?, value: Uint16): size_t {
    memScoped {
        return kniBridge176(dst?.getPointer(memScope).rawValue, value)
    }
}

fun SDL_WriteBE16(dst: CValuesRef<SDL_RWops>?, value: Uint16): size_t {
    memScoped {
        return kniBridge177(dst?.getPointer(memScope).rawValue, value)
    }
}

fun SDL_WriteLE32(dst: CValuesRef<SDL_RWops>?, value: Uint32): size_t {
    memScoped {
        return kniBridge178(dst?.getPointer(memScope).rawValue, value)
    }
}

fun SDL_WriteBE32(dst: CValuesRef<SDL_RWops>?, value: Uint32): size_t {
    memScoped {
        return kniBridge179(dst?.getPointer(memScope).rawValue, value)
    }
}

fun SDL_WriteLE64(dst: CValuesRef<SDL_RWops>?, value: Uint64): size_t {
    memScoped {
        return kniBridge180(dst?.getPointer(memScope).rawValue, value)
    }
}

fun SDL_WriteBE64(dst: CValuesRef<SDL_RWops>?, value: Uint64): size_t {
    memScoped {
        return kniBridge181(dst?.getPointer(memScope).rawValue, value)
    }
}

fun SDL_GetNumAudioDrivers(): Int {
    return kniBridge182()
}

fun SDL_GetAudioDriver(index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge183(index))
}

fun SDL_AudioInit(@CCall.CString driver_name: String?): Int {
    memScoped {
        return kniBridge184(driver_name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_AudioQuit(): Unit {
    return kniBridge185()
}

fun SDL_GetCurrentAudioDriver(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge186())
}

fun SDL_OpenAudio(desired: CValuesRef<SDL_AudioSpec>?, obtained: CValuesRef<SDL_AudioSpec>?): Int {
    memScoped {
        return kniBridge187(desired?.getPointer(memScope).rawValue, obtained?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetNumAudioDevices(iscapture: Int): Int {
    return kniBridge188(iscapture)
}

fun SDL_GetAudioDeviceName(index: Int, iscapture: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge189(index, iscapture))
}

fun SDL_OpenAudioDevice(@CCall.CString device: String?, iscapture: Int, desired: CValuesRef<SDL_AudioSpec>?, obtained: CValuesRef<SDL_AudioSpec>?, allowed_changes: Int): SDL_AudioDeviceID {
    memScoped {
        return kniBridge190(device?.cstr?.getPointer(memScope).rawValue, iscapture, desired?.getPointer(memScope).rawValue, obtained?.getPointer(memScope).rawValue, allowed_changes)
    }
}

fun SDL_GetAudioStatus(): SDL_AudioStatus {
    return kniBridge191()
}

fun SDL_GetAudioDeviceStatus(dev: SDL_AudioDeviceID): SDL_AudioStatus {
    return kniBridge192(dev)
}

fun SDL_PauseAudio(pause_on: Int): Unit {
    return kniBridge193(pause_on)
}

fun SDL_PauseAudioDevice(dev: SDL_AudioDeviceID, pause_on: Int): Unit {
    return kniBridge194(dev, pause_on)
}

fun SDL_LoadWAV_RW(src: CValuesRef<SDL_RWops>?, freesrc: Int, spec: CValuesRef<SDL_AudioSpec>?, audio_buf: CValuesRef<CPointerVar<Uint8Var>>?, audio_len: CValuesRef<Uint32Var>?): CPointer<SDL_AudioSpec>? {
    memScoped {
        return interpretCPointer<SDL_AudioSpec>(kniBridge195(src?.getPointer(memScope).rawValue, freesrc, spec?.getPointer(memScope).rawValue, audio_buf?.getPointer(memScope).rawValue, audio_len?.getPointer(memScope).rawValue))
    }
}

fun SDL_FreeWAV(audio_buf: CValuesRef<Uint8Var>?): Unit {
    memScoped {
        return kniBridge196(audio_buf?.getPointer(memScope).rawValue)
    }
}

fun SDL_BuildAudioCVT(cvt: CValuesRef<SDL_AudioCVT>?, src_format: SDL_AudioFormat, src_channels: Uint8, src_rate: Int, dst_format: SDL_AudioFormat, dst_channels: Uint8, dst_rate: Int): Int {
    memScoped {
        return kniBridge197(cvt?.getPointer(memScope).rawValue, src_format, src_channels, src_rate, dst_format, dst_channels, dst_rate)
    }
}

fun SDL_ConvertAudio(cvt: CValuesRef<SDL_AudioCVT>?): Int {
    memScoped {
        return kniBridge198(cvt?.getPointer(memScope).rawValue)
    }
}

fun SDL_NewAudioStream(src_format: SDL_AudioFormat, src_channels: Uint8, src_rate: Int, dst_format: SDL_AudioFormat, dst_channels: Uint8, dst_rate: Int): CPointer<SDL_AudioStream>? {
    return interpretCPointer<SDL_AudioStream>(kniBridge199(src_format, src_channels, src_rate, dst_format, dst_channels, dst_rate))
}

fun SDL_AudioStreamPut(stream: CValuesRef<SDL_AudioStream>?, buf: CValuesRef<*>?, len: Int): Int {
    memScoped {
        return kniBridge200(stream?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, len)
    }
}

fun SDL_AudioStreamGet(stream: CValuesRef<SDL_AudioStream>?, buf: CValuesRef<*>?, len: Int): Int {
    memScoped {
        return kniBridge201(stream?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, len)
    }
}

fun SDL_AudioStreamAvailable(stream: CValuesRef<SDL_AudioStream>?): Int {
    memScoped {
        return kniBridge202(stream?.getPointer(memScope).rawValue)
    }
}

fun SDL_AudioStreamFlush(stream: CValuesRef<SDL_AudioStream>?): Int {
    memScoped {
        return kniBridge203(stream?.getPointer(memScope).rawValue)
    }
}

fun SDL_AudioStreamClear(stream: CValuesRef<SDL_AudioStream>?): Unit {
    memScoped {
        return kniBridge204(stream?.getPointer(memScope).rawValue)
    }
}

fun SDL_FreeAudioStream(stream: CValuesRef<SDL_AudioStream>?): Unit {
    memScoped {
        return kniBridge205(stream?.getPointer(memScope).rawValue)
    }
}

fun SDL_MixAudio(dst: CValuesRef<Uint8Var>?, src: CValuesRef<Uint8Var>?, len: Uint32, volume: Int): Unit {
    memScoped {
        return kniBridge206(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, len, volume)
    }
}

fun SDL_MixAudioFormat(dst: CValuesRef<Uint8Var>?, src: CValuesRef<Uint8Var>?, format: SDL_AudioFormat, len: Uint32, volume: Int): Unit {
    memScoped {
        return kniBridge207(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, format, len, volume)
    }
}

fun SDL_QueueAudio(dev: SDL_AudioDeviceID, data: CValuesRef<*>?, len: Uint32): Int {
    memScoped {
        return kniBridge208(dev, data?.getPointer(memScope).rawValue, len)
    }
}

fun SDL_DequeueAudio(dev: SDL_AudioDeviceID, data: CValuesRef<*>?, len: Uint32): Uint32 {
    memScoped {
        return kniBridge209(dev, data?.getPointer(memScope).rawValue, len)
    }
}

fun SDL_GetQueuedAudioSize(dev: SDL_AudioDeviceID): Uint32 {
    return kniBridge210(dev)
}

fun SDL_ClearQueuedAudio(dev: SDL_AudioDeviceID): Unit {
    return kniBridge211(dev)
}

fun SDL_LockAudio(): Unit {
    return kniBridge212()
}

fun SDL_LockAudioDevice(dev: SDL_AudioDeviceID): Unit {
    return kniBridge213(dev)
}

fun SDL_UnlockAudio(): Unit {
    return kniBridge214()
}

fun SDL_UnlockAudioDevice(dev: SDL_AudioDeviceID): Unit {
    return kniBridge215(dev)
}

fun SDL_CloseAudio(): Unit {
    return kniBridge216()
}

fun SDL_CloseAudioDevice(dev: SDL_AudioDeviceID): Unit {
    return kniBridge217(dev)
}

fun SDL_SetClipboardText(@CCall.CString text: String?): Int {
    memScoped {
        return kniBridge218(text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetClipboardText(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge219())
}

fun SDL_HasClipboardText(): SDL_bool {
    return kniBridge220()
}

fun SDL_GetCPUCount(): Int {
    return kniBridge221()
}

fun SDL_GetCPUCacheLineSize(): Int {
    return kniBridge222()
}

fun SDL_HasRDTSC(): SDL_bool {
    return kniBridge223()
}

fun SDL_HasAltiVec(): SDL_bool {
    return kniBridge224()
}

fun SDL_HasMMX(): SDL_bool {
    return kniBridge225()
}

fun SDL_Has3DNow(): SDL_bool {
    return kniBridge226()
}

fun SDL_HasSSE(): SDL_bool {
    return kniBridge227()
}

fun SDL_HasSSE2(): SDL_bool {
    return kniBridge228()
}

fun SDL_HasSSE3(): SDL_bool {
    return kniBridge229()
}

fun SDL_HasSSE41(): SDL_bool {
    return kniBridge230()
}

fun SDL_HasSSE42(): SDL_bool {
    return kniBridge231()
}

fun SDL_HasAVX(): SDL_bool {
    return kniBridge232()
}

fun SDL_HasAVX2(): SDL_bool {
    return kniBridge233()
}

fun SDL_HasAVX512F(): SDL_bool {
    return kniBridge234()
}

fun SDL_HasNEON(): SDL_bool {
    return kniBridge235()
}

fun SDL_GetSystemRAM(): Int {
    return kniBridge236()
}

fun SDL_SIMDGetAlignment(): size_t {
    return kniBridge237()
}

fun SDL_SIMDAlloc(len: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge238(len))
}

fun SDL_SIMDFree(ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge239(ptr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetPixelFormatName(format: Uint32): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge240(format))
}

fun SDL_PixelFormatEnumToMasks(format: Uint32, bpp: CValuesRef<IntVar>?, Rmask: CValuesRef<Uint32Var>?, Gmask: CValuesRef<Uint32Var>?, Bmask: CValuesRef<Uint32Var>?, Amask: CValuesRef<Uint32Var>?): SDL_bool {
    memScoped {
        return kniBridge241(format, bpp?.getPointer(memScope).rawValue, Rmask?.getPointer(memScope).rawValue, Gmask?.getPointer(memScope).rawValue, Bmask?.getPointer(memScope).rawValue, Amask?.getPointer(memScope).rawValue)
    }
}

fun SDL_MasksToPixelFormatEnum(bpp: Int, Rmask: Uint32, Gmask: Uint32, Bmask: Uint32, Amask: Uint32): Uint32 {
    return kniBridge242(bpp, Rmask, Gmask, Bmask, Amask)
}

fun SDL_AllocFormat(pixel_format: Uint32): CPointer<SDL_PixelFormat>? {
    return interpretCPointer<SDL_PixelFormat>(kniBridge243(pixel_format))
}

fun SDL_FreeFormat(format: CValuesRef<SDL_PixelFormat>?): Unit {
    memScoped {
        return kniBridge244(format?.getPointer(memScope).rawValue)
    }
}

fun SDL_AllocPalette(ncolors: Int): CPointer<SDL_Palette>? {
    return interpretCPointer<SDL_Palette>(kniBridge245(ncolors))
}

fun SDL_SetPixelFormatPalette(format: CValuesRef<SDL_PixelFormat>?, palette: CValuesRef<SDL_Palette>?): Int {
    memScoped {
        return kniBridge246(format?.getPointer(memScope).rawValue, palette?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetPaletteColors(palette: CValuesRef<SDL_Palette>?, colors: CValuesRef<SDL_Color>?, firstcolor: Int, ncolors: Int): Int {
    memScoped {
        return kniBridge247(palette?.getPointer(memScope).rawValue, colors?.getPointer(memScope).rawValue, firstcolor, ncolors)
    }
}

fun SDL_FreePalette(palette: CValuesRef<SDL_Palette>?): Unit {
    memScoped {
        return kniBridge248(palette?.getPointer(memScope).rawValue)
    }
}

fun SDL_MapRGB(format: CValuesRef<SDL_PixelFormat>?, r: Uint8, g: Uint8, b: Uint8): Uint32 {
    memScoped {
        return kniBridge249(format?.getPointer(memScope).rawValue, r, g, b)
    }
}

fun SDL_MapRGBA(format: CValuesRef<SDL_PixelFormat>?, r: Uint8, g: Uint8, b: Uint8, a: Uint8): Uint32 {
    memScoped {
        return kniBridge250(format?.getPointer(memScope).rawValue, r, g, b, a)
    }
}

fun SDL_GetRGB(pixel: Uint32, format: CValuesRef<SDL_PixelFormat>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?): Unit {
    memScoped {
        return kniBridge251(pixel, format?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetRGBA(pixel: Uint32, format: CValuesRef<SDL_PixelFormat>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?, a: CValuesRef<Uint8Var>?): Unit {
    memScoped {
        return kniBridge252(pixel, format?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun SDL_CalculateGammaRamp(gamma: Float, ramp: CValuesRef<Uint16Var>?): Unit {
    memScoped {
        return kniBridge253(gamma, ramp?.getPointer(memScope).rawValue)
    }
}

fun SDL_PointInRect(p: CValuesRef<SDL_Point>?, r: CValuesRef<SDL_Rect>?): SDL_bool {
    memScoped {
        return kniBridge254(p?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue)
    }
}

fun SDL_RectEmpty(r: CValuesRef<SDL_Rect>?): SDL_bool {
    memScoped {
        return kniBridge255(r?.getPointer(memScope).rawValue)
    }
}

fun SDL_RectEquals(a: CValuesRef<SDL_Rect>?, b: CValuesRef<SDL_Rect>?): SDL_bool {
    memScoped {
        return kniBridge256(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun SDL_HasIntersection(A: CValuesRef<SDL_Rect>?, B: CValuesRef<SDL_Rect>?): SDL_bool {
    memScoped {
        return kniBridge257(A?.getPointer(memScope).rawValue, B?.getPointer(memScope).rawValue)
    }
}

fun SDL_IntersectRect(A: CValuesRef<SDL_Rect>?, B: CValuesRef<SDL_Rect>?, result: CValuesRef<SDL_Rect>?): SDL_bool {
    memScoped {
        return kniBridge258(A?.getPointer(memScope).rawValue, B?.getPointer(memScope).rawValue, result?.getPointer(memScope).rawValue)
    }
}

fun SDL_UnionRect(A: CValuesRef<SDL_Rect>?, B: CValuesRef<SDL_Rect>?, result: CValuesRef<SDL_Rect>?): Unit {
    memScoped {
        return kniBridge259(A?.getPointer(memScope).rawValue, B?.getPointer(memScope).rawValue, result?.getPointer(memScope).rawValue)
    }
}

fun SDL_EnclosePoints(points: CValuesRef<SDL_Point>?, count: Int, clip: CValuesRef<SDL_Rect>?, result: CValuesRef<SDL_Rect>?): SDL_bool {
    memScoped {
        return kniBridge260(points?.getPointer(memScope).rawValue, count, clip?.getPointer(memScope).rawValue, result?.getPointer(memScope).rawValue)
    }
}

fun SDL_IntersectRectAndLine(rect: CValuesRef<SDL_Rect>?, X1: CValuesRef<IntVar>?, Y1: CValuesRef<IntVar>?, X2: CValuesRef<IntVar>?, Y2: CValuesRef<IntVar>?): SDL_bool {
    memScoped {
        return kniBridge261(rect?.getPointer(memScope).rawValue, X1?.getPointer(memScope).rawValue, Y1?.getPointer(memScope).rawValue, X2?.getPointer(memScope).rawValue, Y2?.getPointer(memScope).rawValue)
    }
}

fun SDL_ComposeCustomBlendMode(srcColorFactor: SDL_BlendFactor, dstColorFactor: SDL_BlendFactor, colorOperation: SDL_BlendOperation, srcAlphaFactor: SDL_BlendFactor, dstAlphaFactor: SDL_BlendFactor, alphaOperation: SDL_BlendOperation): SDL_BlendMode {
    return kniBridge262(srcColorFactor, dstColorFactor, colorOperation, srcAlphaFactor, dstAlphaFactor, alphaOperation)
}

fun SDL_CreateRGBSurface(flags: Uint32, width: Int, height: Int, depth: Int, Rmask: Uint32, Gmask: Uint32, Bmask: Uint32, Amask: Uint32): CPointer<SDL_Surface>? {
    return interpretCPointer<SDL_Surface>(kniBridge263(flags, width, height, depth, Rmask, Gmask, Bmask, Amask))
}

fun SDL_CreateRGBSurfaceWithFormat(flags: Uint32, width: Int, height: Int, depth: Int, format: Uint32): CPointer<SDL_Surface>? {
    return interpretCPointer<SDL_Surface>(kniBridge264(flags, width, height, depth, format))
}

fun SDL_CreateRGBSurfaceFrom(pixels: CValuesRef<*>?, width: Int, height: Int, depth: Int, pitch: Int, Rmask: Uint32, Gmask: Uint32, Bmask: Uint32, Amask: Uint32): CPointer<SDL_Surface>? {
    memScoped {
        return interpretCPointer<SDL_Surface>(kniBridge265(pixels?.getPointer(memScope).rawValue, width, height, depth, pitch, Rmask, Gmask, Bmask, Amask))
    }
}

fun SDL_CreateRGBSurfaceWithFormatFrom(pixels: CValuesRef<*>?, width: Int, height: Int, depth: Int, pitch: Int, format: Uint32): CPointer<SDL_Surface>? {
    memScoped {
        return interpretCPointer<SDL_Surface>(kniBridge266(pixels?.getPointer(memScope).rawValue, width, height, depth, pitch, format))
    }
}

fun SDL_FreeSurface(surface: CValuesRef<SDL_Surface>?): Unit {
    memScoped {
        return kniBridge267(surface?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetSurfacePalette(surface: CValuesRef<SDL_Surface>?, palette: CValuesRef<SDL_Palette>?): Int {
    memScoped {
        return kniBridge268(surface?.getPointer(memScope).rawValue, palette?.getPointer(memScope).rawValue)
    }
}

fun SDL_LockSurface(surface: CValuesRef<SDL_Surface>?): Int {
    memScoped {
        return kniBridge269(surface?.getPointer(memScope).rawValue)
    }
}

fun SDL_UnlockSurface(surface: CValuesRef<SDL_Surface>?): Unit {
    memScoped {
        return kniBridge270(surface?.getPointer(memScope).rawValue)
    }
}

fun SDL_LoadBMP_RW(src: CValuesRef<SDL_RWops>?, freesrc: Int): CPointer<SDL_Surface>? {
    memScoped {
        return interpretCPointer<SDL_Surface>(kniBridge271(src?.getPointer(memScope).rawValue, freesrc))
    }
}

fun SDL_SaveBMP_RW(surface: CValuesRef<SDL_Surface>?, dst: CValuesRef<SDL_RWops>?, freedst: Int): Int {
    memScoped {
        return kniBridge272(surface?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, freedst)
    }
}

fun SDL_SetSurfaceRLE(surface: CValuesRef<SDL_Surface>?, flag: Int): Int {
    memScoped {
        return kniBridge273(surface?.getPointer(memScope).rawValue, flag)
    }
}

fun SDL_SetColorKey(surface: CValuesRef<SDL_Surface>?, flag: Int, key: Uint32): Int {
    memScoped {
        return kniBridge274(surface?.getPointer(memScope).rawValue, flag, key)
    }
}

fun SDL_HasColorKey(surface: CValuesRef<SDL_Surface>?): SDL_bool {
    memScoped {
        return kniBridge275(surface?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetColorKey(surface: CValuesRef<SDL_Surface>?, key: CValuesRef<Uint32Var>?): Int {
    memScoped {
        return kniBridge276(surface?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetSurfaceColorMod(surface: CValuesRef<SDL_Surface>?, r: Uint8, g: Uint8, b: Uint8): Int {
    memScoped {
        return kniBridge277(surface?.getPointer(memScope).rawValue, r, g, b)
    }
}

fun SDL_GetSurfaceColorMod(surface: CValuesRef<SDL_Surface>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?): Int {
    memScoped {
        return kniBridge278(surface?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetSurfaceAlphaMod(surface: CValuesRef<SDL_Surface>?, alpha: Uint8): Int {
    memScoped {
        return kniBridge279(surface?.getPointer(memScope).rawValue, alpha)
    }
}

fun SDL_GetSurfaceAlphaMod(surface: CValuesRef<SDL_Surface>?, alpha: CValuesRef<Uint8Var>?): Int {
    memScoped {
        return kniBridge280(surface?.getPointer(memScope).rawValue, alpha?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetSurfaceBlendMode(surface: CValuesRef<SDL_Surface>?, blendMode: SDL_BlendMode): Int {
    memScoped {
        return kniBridge281(surface?.getPointer(memScope).rawValue, blendMode)
    }
}

fun SDL_GetSurfaceBlendMode(surface: CValuesRef<SDL_Surface>?, blendMode: CValuesRef<SDL_BlendModeVar>?): Int {
    memScoped {
        return kniBridge282(surface?.getPointer(memScope).rawValue, blendMode?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetClipRect(surface: CValuesRef<SDL_Surface>?, rect: CValuesRef<SDL_Rect>?): SDL_bool {
    memScoped {
        return kniBridge283(surface?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetClipRect(surface: CValuesRef<SDL_Surface>?, rect: CValuesRef<SDL_Rect>?): Unit {
    memScoped {
        return kniBridge284(surface?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_DuplicateSurface(surface: CValuesRef<SDL_Surface>?): CPointer<SDL_Surface>? {
    memScoped {
        return interpretCPointer<SDL_Surface>(kniBridge285(surface?.getPointer(memScope).rawValue))
    }
}

fun SDL_ConvertSurface(src: CValuesRef<SDL_Surface>?, fmt: CValuesRef<SDL_PixelFormat>?, flags: Uint32): CPointer<SDL_Surface>? {
    memScoped {
        return interpretCPointer<SDL_Surface>(kniBridge286(src?.getPointer(memScope).rawValue, fmt?.getPointer(memScope).rawValue, flags))
    }
}

fun SDL_ConvertSurfaceFormat(src: CValuesRef<SDL_Surface>?, pixel_format: Uint32, flags: Uint32): CPointer<SDL_Surface>? {
    memScoped {
        return interpretCPointer<SDL_Surface>(kniBridge287(src?.getPointer(memScope).rawValue, pixel_format, flags))
    }
}

fun SDL_ConvertPixels(width: Int, height: Int, src_format: Uint32, src: CValuesRef<*>?, src_pitch: Int, dst_format: Uint32, dst: CValuesRef<*>?, dst_pitch: Int): Int {
    memScoped {
        return kniBridge288(width, height, src_format, src?.getPointer(memScope).rawValue, src_pitch, dst_format, dst?.getPointer(memScope).rawValue, dst_pitch)
    }
}

fun SDL_FillRect(dst: CValuesRef<SDL_Surface>?, rect: CValuesRef<SDL_Rect>?, color: Uint32): Int {
    memScoped {
        return kniBridge289(dst?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue, color)
    }
}

fun SDL_FillRects(dst: CValuesRef<SDL_Surface>?, rects: CValuesRef<SDL_Rect>?, count: Int, color: Uint32): Int {
    memScoped {
        return kniBridge290(dst?.getPointer(memScope).rawValue, rects?.getPointer(memScope).rawValue, count, color)
    }
}

fun SDL_UpperBlit(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge291(src?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue)
    }
}

fun SDL_LowerBlit(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge292(src?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue)
    }
}

fun SDL_SoftStretch(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge293(src?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue)
    }
}

fun SDL_UpperBlitScaled(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge294(src?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue)
    }
}

fun SDL_LowerBlitScaled(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge295(src?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetYUVConversionMode(mode: SDL_YUV_CONVERSION_MODE): Unit {
    return kniBridge296(mode.value)
}

fun SDL_GetYUVConversionMode(): SDL_YUV_CONVERSION_MODE {
    return SDL_YUV_CONVERSION_MODE.byValue(kniBridge297())
}

fun SDL_GetYUVConversionModeForResolution(width: Int, height: Int): SDL_YUV_CONVERSION_MODE {
    return SDL_YUV_CONVERSION_MODE.byValue(kniBridge298(width, height))
}

fun SDL_GetNumVideoDrivers(): Int {
    return kniBridge299()
}

fun SDL_GetVideoDriver(index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge300(index))
}

fun SDL_VideoInit(@CCall.CString driver_name: String?): Int {
    memScoped {
        return kniBridge301(driver_name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_VideoQuit(): Unit {
    return kniBridge302()
}

fun SDL_GetCurrentVideoDriver(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge303())
}

fun SDL_GetNumVideoDisplays(): Int {
    return kniBridge304()
}

fun SDL_GetDisplayName(displayIndex: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge305(displayIndex))
}

fun SDL_GetDisplayBounds(displayIndex: Int, rect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge306(displayIndex, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetDisplayUsableBounds(displayIndex: Int, rect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge307(displayIndex, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetDisplayDPI(displayIndex: Int, ddpi: CValuesRef<FloatVar>?, hdpi: CValuesRef<FloatVar>?, vdpi: CValuesRef<FloatVar>?): Int {
    memScoped {
        return kniBridge308(displayIndex, ddpi?.getPointer(memScope).rawValue, hdpi?.getPointer(memScope).rawValue, vdpi?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetDisplayOrientation(displayIndex: Int): SDL_DisplayOrientation {
    return SDL_DisplayOrientation.byValue(kniBridge309(displayIndex))
}

fun SDL_GetNumDisplayModes(displayIndex: Int): Int {
    return kniBridge310(displayIndex)
}

fun SDL_GetDisplayMode(displayIndex: Int, modeIndex: Int, mode: CValuesRef<SDL_DisplayMode>?): Int {
    memScoped {
        return kniBridge311(displayIndex, modeIndex, mode?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetDesktopDisplayMode(displayIndex: Int, mode: CValuesRef<SDL_DisplayMode>?): Int {
    memScoped {
        return kniBridge312(displayIndex, mode?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetCurrentDisplayMode(displayIndex: Int, mode: CValuesRef<SDL_DisplayMode>?): Int {
    memScoped {
        return kniBridge313(displayIndex, mode?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetClosestDisplayMode(displayIndex: Int, mode: CValuesRef<SDL_DisplayMode>?, closest: CValuesRef<SDL_DisplayMode>?): CPointer<SDL_DisplayMode>? {
    memScoped {
        return interpretCPointer<SDL_DisplayMode>(kniBridge314(displayIndex, mode?.getPointer(memScope).rawValue, closest?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetWindowDisplayIndex(window: CValuesRef<SDL_Window>?): Int {
    memScoped {
        return kniBridge315(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowDisplayMode(window: CValuesRef<SDL_Window>?, mode: CValuesRef<SDL_DisplayMode>?): Int {
    memScoped {
        return kniBridge316(window?.getPointer(memScope).rawValue, mode?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetWindowDisplayMode(window: CValuesRef<SDL_Window>?, mode: CValuesRef<SDL_DisplayMode>?): Int {
    memScoped {
        return kniBridge317(window?.getPointer(memScope).rawValue, mode?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetWindowPixelFormat(window: CValuesRef<SDL_Window>?): Uint32 {
    memScoped {
        return kniBridge318(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_CreateWindow(@CCall.CString title: String?, x: Int, y: Int, w: Int, h: Int, flags: Uint32): CPointer<SDL_Window>? {
    memScoped {
        return interpretCPointer<SDL_Window>(kniBridge319(title?.cstr?.getPointer(memScope).rawValue, x, y, w, h, flags))
    }
}

fun SDL_CreateWindowFrom(data: CValuesRef<*>?): CPointer<SDL_Window>? {
    memScoped {
        return interpretCPointer<SDL_Window>(kniBridge320(data?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetWindowID(window: CValuesRef<SDL_Window>?): Uint32 {
    memScoped {
        return kniBridge321(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetWindowFromID(id: Uint32): CPointer<SDL_Window>? {
    return interpretCPointer<SDL_Window>(kniBridge322(id))
}

fun SDL_GetWindowFlags(window: CValuesRef<SDL_Window>?): Uint32 {
    memScoped {
        return kniBridge323(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowTitle(window: CValuesRef<SDL_Window>?, @CCall.CString title: String?): Unit {
    memScoped {
        return kniBridge324(window?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetWindowTitle(window: CValuesRef<SDL_Window>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge325(window?.getPointer(memScope).rawValue))
    }
}

fun SDL_SetWindowIcon(window: CValuesRef<SDL_Window>?, icon: CValuesRef<SDL_Surface>?): Unit {
    memScoped {
        return kniBridge326(window?.getPointer(memScope).rawValue, icon?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowData(window: CValuesRef<SDL_Window>?, @CCall.CString name: String?, userdata: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge327(window?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, userdata?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetWindowData(window: CValuesRef<SDL_Window>?, @CCall.CString name: String?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge328(window?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_SetWindowPosition(window: CValuesRef<SDL_Window>?, x: Int, y: Int): Unit {
    memScoped {
        return kniBridge329(window?.getPointer(memScope).rawValue, x, y)
    }
}

fun SDL_GetWindowPosition(window: CValuesRef<SDL_Window>?, x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge330(window?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowSize(window: CValuesRef<SDL_Window>?, w: Int, h: Int): Unit {
    memScoped {
        return kniBridge331(window?.getPointer(memScope).rawValue, w, h)
    }
}

fun SDL_GetWindowSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge332(window?.getPointer(memScope).rawValue, w?.getPointer(memScope).rawValue, h?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetWindowBordersSize(window: CValuesRef<SDL_Window>?, top: CValuesRef<IntVar>?, left: CValuesRef<IntVar>?, bottom: CValuesRef<IntVar>?, right: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge333(window?.getPointer(memScope).rawValue, top?.getPointer(memScope).rawValue, left?.getPointer(memScope).rawValue, bottom?.getPointer(memScope).rawValue, right?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowMinimumSize(window: CValuesRef<SDL_Window>?, min_w: Int, min_h: Int): Unit {
    memScoped {
        return kniBridge334(window?.getPointer(memScope).rawValue, min_w, min_h)
    }
}

fun SDL_GetWindowMinimumSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge335(window?.getPointer(memScope).rawValue, w?.getPointer(memScope).rawValue, h?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowMaximumSize(window: CValuesRef<SDL_Window>?, max_w: Int, max_h: Int): Unit {
    memScoped {
        return kniBridge336(window?.getPointer(memScope).rawValue, max_w, max_h)
    }
}

fun SDL_GetWindowMaximumSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge337(window?.getPointer(memScope).rawValue, w?.getPointer(memScope).rawValue, h?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowBordered(window: CValuesRef<SDL_Window>?, bordered: SDL_bool): Unit {
    memScoped {
        return kniBridge338(window?.getPointer(memScope).rawValue, bordered)
    }
}

fun SDL_SetWindowResizable(window: CValuesRef<SDL_Window>?, resizable: SDL_bool): Unit {
    memScoped {
        return kniBridge339(window?.getPointer(memScope).rawValue, resizable)
    }
}

fun SDL_ShowWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge340(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_HideWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge341(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_RaiseWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge342(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_MaximizeWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge343(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_MinimizeWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge344(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_RestoreWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge345(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowFullscreen(window: CValuesRef<SDL_Window>?, flags: Uint32): Int {
    memScoped {
        return kniBridge346(window?.getPointer(memScope).rawValue, flags)
    }
}

fun SDL_GetWindowSurface(window: CValuesRef<SDL_Window>?): CPointer<SDL_Surface>? {
    memScoped {
        return interpretCPointer<SDL_Surface>(kniBridge347(window?.getPointer(memScope).rawValue))
    }
}

fun SDL_UpdateWindowSurface(window: CValuesRef<SDL_Window>?): Int {
    memScoped {
        return kniBridge348(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_UpdateWindowSurfaceRects(window: CValuesRef<SDL_Window>?, rects: CValuesRef<SDL_Rect>?, numrects: Int): Int {
    memScoped {
        return kniBridge349(window?.getPointer(memScope).rawValue, rects?.getPointer(memScope).rawValue, numrects)
    }
}

fun SDL_SetWindowGrab(window: CValuesRef<SDL_Window>?, grabbed: SDL_bool): Unit {
    memScoped {
        return kniBridge350(window?.getPointer(memScope).rawValue, grabbed)
    }
}

fun SDL_GetWindowGrab(window: CValuesRef<SDL_Window>?): SDL_bool {
    memScoped {
        return kniBridge351(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetGrabbedWindow(): CPointer<SDL_Window>? {
    return interpretCPointer<SDL_Window>(kniBridge352())
}

fun SDL_SetWindowBrightness(window: CValuesRef<SDL_Window>?, brightness: Float): Int {
    memScoped {
        return kniBridge353(window?.getPointer(memScope).rawValue, brightness)
    }
}

fun SDL_GetWindowBrightness(window: CValuesRef<SDL_Window>?): Float {
    memScoped {
        return kniBridge354(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowOpacity(window: CValuesRef<SDL_Window>?, opacity: Float): Int {
    memScoped {
        return kniBridge355(window?.getPointer(memScope).rawValue, opacity)
    }
}

fun SDL_GetWindowOpacity(window: CValuesRef<SDL_Window>?, out_opacity: CValuesRef<FloatVar>?): Int {
    memScoped {
        return kniBridge356(window?.getPointer(memScope).rawValue, out_opacity?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowModalFor(modal_window: CValuesRef<SDL_Window>?, parent_window: CValuesRef<SDL_Window>?): Int {
    memScoped {
        return kniBridge357(modal_window?.getPointer(memScope).rawValue, parent_window?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowInputFocus(window: CValuesRef<SDL_Window>?): Int {
    memScoped {
        return kniBridge358(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowGammaRamp(window: CValuesRef<SDL_Window>?, red: CValuesRef<Uint16Var>?, green: CValuesRef<Uint16Var>?, blue: CValuesRef<Uint16Var>?): Int {
    memScoped {
        return kniBridge359(window?.getPointer(memScope).rawValue, red?.getPointer(memScope).rawValue, green?.getPointer(memScope).rawValue, blue?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetWindowGammaRamp(window: CValuesRef<SDL_Window>?, red: CValuesRef<Uint16Var>?, green: CValuesRef<Uint16Var>?, blue: CValuesRef<Uint16Var>?): Int {
    memScoped {
        return kniBridge360(window?.getPointer(memScope).rawValue, red?.getPointer(memScope).rawValue, green?.getPointer(memScope).rawValue, blue?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowHitTest(window: CValuesRef<SDL_Window>?, callback: SDL_HitTest?, callback_data: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge361(window?.getPointer(memScope).rawValue, callback.rawValue, callback_data?.getPointer(memScope).rawValue)
    }
}

fun SDL_DestroyWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge362(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_IsScreenSaverEnabled(): SDL_bool {
    return kniBridge363()
}

fun SDL_EnableScreenSaver(): Unit {
    return kniBridge364()
}

fun SDL_DisableScreenSaver(): Unit {
    return kniBridge365()
}

fun SDL_GL_LoadLibrary(@CCall.CString path: String?): Int {
    memScoped {
        return kniBridge366(path?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GL_GetProcAddress(@CCall.CString proc: String?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge367(proc?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_GL_UnloadLibrary(): Unit {
    return kniBridge368()
}

fun SDL_GL_ExtensionSupported(@CCall.CString extension: String?): SDL_bool {
    memScoped {
        return kniBridge369(extension?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GL_ResetAttributes(): Unit {
    return kniBridge370()
}

fun SDL_GL_SetAttribute(attr: SDL_GLattr, value: Int): Int {
    return kniBridge371(attr.value, value)
}

fun SDL_GL_GetAttribute(attr: SDL_GLattr, value: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge372(attr.value, value?.getPointer(memScope).rawValue)
    }
}

fun SDL_GL_CreateContext(window: CValuesRef<SDL_Window>?): SDL_GLContext? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge373(window?.getPointer(memScope).rawValue))
    }
}

fun SDL_GL_MakeCurrent(window: CValuesRef<SDL_Window>?, context: SDL_GLContext?): Int {
    memScoped {
        return kniBridge374(window?.getPointer(memScope).rawValue, context.rawValue)
    }
}

fun SDL_GL_GetCurrentWindow(): CPointer<SDL_Window>? {
    return interpretCPointer<SDL_Window>(kniBridge375())
}

fun SDL_GL_GetCurrentContext(): SDL_GLContext? {
    return interpretCPointer<COpaque>(kniBridge376())
}

fun SDL_GL_GetDrawableSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge377(window?.getPointer(memScope).rawValue, w?.getPointer(memScope).rawValue, h?.getPointer(memScope).rawValue)
    }
}

fun SDL_GL_SetSwapInterval(interval: Int): Int {
    return kniBridge378(interval)
}

fun SDL_GL_GetSwapInterval(): Int {
    return kniBridge379()
}

fun SDL_GL_SwapWindow(window: CValuesRef<SDL_Window>?): Unit {
    memScoped {
        return kniBridge380(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_GL_DeleteContext(context: SDL_GLContext?): Unit {
    return kniBridge381(context.rawValue)
}

fun SDL_GetKeyboardFocus(): CPointer<SDL_Window>? {
    return interpretCPointer<SDL_Window>(kniBridge382())
}

fun SDL_GetKeyboardState(numkeys: CValuesRef<IntVar>?): CPointer<Uint8Var>? {
    memScoped {
        return interpretCPointer<Uint8Var>(kniBridge383(numkeys?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetModState(): SDL_Keymod {
    return kniBridge384()
}

fun SDL_SetModState(modstate: SDL_Keymod): Unit {
    return kniBridge385(modstate)
}

fun SDL_GetKeyFromScancode(scancode: SDL_Scancode): SDL_Keycode {
    return kniBridge386(scancode)
}

fun SDL_GetScancodeFromKey(key: SDL_Keycode): SDL_Scancode {
    return kniBridge387(key)
}

fun SDL_GetScancodeName(scancode: SDL_Scancode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge388(scancode))
}

fun SDL_GetScancodeFromName(@CCall.CString name: String?): SDL_Scancode {
    memScoped {
        return kniBridge389(name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetKeyName(key: SDL_Keycode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge390(key))
}

fun SDL_GetKeyFromName(@CCall.CString name: String?): SDL_Keycode {
    memScoped {
        return kniBridge391(name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_StartTextInput(): Unit {
    return kniBridge392()
}

fun SDL_IsTextInputActive(): SDL_bool {
    return kniBridge393()
}

fun SDL_StopTextInput(): Unit {
    return kniBridge394()
}

fun SDL_SetTextInputRect(rect: CValuesRef<SDL_Rect>?): Unit {
    memScoped {
        return kniBridge395(rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_HasScreenKeyboardSupport(): SDL_bool {
    return kniBridge396()
}

fun SDL_IsScreenKeyboardShown(window: CValuesRef<SDL_Window>?): SDL_bool {
    memScoped {
        return kniBridge397(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetMouseFocus(): CPointer<SDL_Window>? {
    return interpretCPointer<SDL_Window>(kniBridge398())
}

fun SDL_GetMouseState(x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Uint32 {
    memScoped {
        return kniBridge399(x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetGlobalMouseState(x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Uint32 {
    memScoped {
        return kniBridge400(x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetRelativeMouseState(x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Uint32 {
    memScoped {
        return kniBridge401(x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue)
    }
}

fun SDL_WarpMouseInWindow(window: CValuesRef<SDL_Window>?, x: Int, y: Int): Unit {
    memScoped {
        return kniBridge402(window?.getPointer(memScope).rawValue, x, y)
    }
}

fun SDL_WarpMouseGlobal(x: Int, y: Int): Int {
    return kniBridge403(x, y)
}

fun SDL_SetRelativeMouseMode(enabled: SDL_bool): Int {
    return kniBridge404(enabled)
}

fun SDL_CaptureMouse(enabled: SDL_bool): Int {
    return kniBridge405(enabled)
}

fun SDL_GetRelativeMouseMode(): SDL_bool {
    return kniBridge406()
}

fun SDL_CreateCursor(data: CValuesRef<Uint8Var>?, mask: CValuesRef<Uint8Var>?, w: Int, h: Int, hot_x: Int, hot_y: Int): CPointer<SDL_Cursor>? {
    memScoped {
        return interpretCPointer<SDL_Cursor>(kniBridge407(data?.getPointer(memScope).rawValue, mask?.getPointer(memScope).rawValue, w, h, hot_x, hot_y))
    }
}

fun SDL_CreateColorCursor(surface: CValuesRef<SDL_Surface>?, hot_x: Int, hot_y: Int): CPointer<SDL_Cursor>? {
    memScoped {
        return interpretCPointer<SDL_Cursor>(kniBridge408(surface?.getPointer(memScope).rawValue, hot_x, hot_y))
    }
}

fun SDL_CreateSystemCursor(id: SDL_SystemCursor): CPointer<SDL_Cursor>? {
    return interpretCPointer<SDL_Cursor>(kniBridge409(id.value))
}

fun SDL_SetCursor(cursor: CValuesRef<SDL_Cursor>?): Unit {
    memScoped {
        return kniBridge410(cursor?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetCursor(): CPointer<SDL_Cursor>? {
    return interpretCPointer<SDL_Cursor>(kniBridge411())
}

fun SDL_GetDefaultCursor(): CPointer<SDL_Cursor>? {
    return interpretCPointer<SDL_Cursor>(kniBridge412())
}

fun SDL_FreeCursor(cursor: CValuesRef<SDL_Cursor>?): Unit {
    memScoped {
        return kniBridge413(cursor?.getPointer(memScope).rawValue)
    }
}

fun SDL_ShowCursor(toggle: Int): Int {
    return kniBridge414(toggle)
}

fun SDL_LockJoysticks(): Unit {
    return kniBridge415()
}

fun SDL_UnlockJoysticks(): Unit {
    return kniBridge416()
}

fun SDL_NumJoysticks(): Int {
    return kniBridge417()
}

fun SDL_JoystickNameForIndex(device_index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge418(device_index))
}

fun SDL_JoystickGetDevicePlayerIndex(device_index: Int): Int {
    return kniBridge419(device_index)
}

fun SDL_JoystickGetDeviceGUID(device_index: Int): CValue<SDL_JoystickGUID> {
    val kniRetVal = nativeHeap.alloc<SDL_JoystickGUID>()
    try {
        kniBridge420(device_index, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun SDL_JoystickGetDeviceVendor(device_index: Int): Uint16 {
    return kniBridge421(device_index)
}

fun SDL_JoystickGetDeviceProduct(device_index: Int): Uint16 {
    return kniBridge422(device_index)
}

fun SDL_JoystickGetDeviceProductVersion(device_index: Int): Uint16 {
    return kniBridge423(device_index)
}

fun SDL_JoystickGetDeviceType(device_index: Int): SDL_JoystickType {
    return SDL_JoystickType.byValue(kniBridge424(device_index))
}

fun SDL_JoystickGetDeviceInstanceID(device_index: Int): SDL_JoystickID {
    return kniBridge425(device_index)
}

fun SDL_JoystickOpen(device_index: Int): CPointer<SDL_Joystick>? {
    return interpretCPointer<SDL_Joystick>(kniBridge426(device_index))
}

fun SDL_JoystickFromInstanceID(joyid: SDL_JoystickID): CPointer<SDL_Joystick>? {
    return interpretCPointer<SDL_Joystick>(kniBridge427(joyid))
}

fun SDL_JoystickName(joystick: CValuesRef<SDL_Joystick>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge428(joystick?.getPointer(memScope).rawValue))
    }
}

fun SDL_JoystickGetPlayerIndex(joystick: CValuesRef<SDL_Joystick>?): Int {
    memScoped {
        return kniBridge429(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickGetGUID(joystick: CValuesRef<SDL_Joystick>?): CValue<SDL_JoystickGUID> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<SDL_JoystickGUID>()
        try {
            kniBridge430(joystick?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun SDL_JoystickGetVendor(joystick: CValuesRef<SDL_Joystick>?): Uint16 {
    memScoped {
        return kniBridge431(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickGetProduct(joystick: CValuesRef<SDL_Joystick>?): Uint16 {
    memScoped {
        return kniBridge432(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickGetProductVersion(joystick: CValuesRef<SDL_Joystick>?): Uint16 {
    memScoped {
        return kniBridge433(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickGetType(joystick: CValuesRef<SDL_Joystick>?): SDL_JoystickType {
    memScoped {
        return SDL_JoystickType.byValue(kniBridge434(joystick?.getPointer(memScope).rawValue))
    }
}

fun SDL_JoystickGetGUIDString(guid: CValue<SDL_JoystickGUID>, pszGUID: CValuesRef<ByteVar>?, cbGUID: Int): Unit {
    memScoped {
        return kniBridge435(guid.getPointer(memScope).rawValue, pszGUID?.getPointer(memScope).rawValue, cbGUID)
    }
}

fun SDL_JoystickGetGUIDFromString(@CCall.CString pchGUID: String?): CValue<SDL_JoystickGUID> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<SDL_JoystickGUID>()
        try {
            kniBridge436(pchGUID?.cstr?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun SDL_JoystickGetAttached(joystick: CValuesRef<SDL_Joystick>?): SDL_bool {
    memScoped {
        return kniBridge437(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickInstanceID(joystick: CValuesRef<SDL_Joystick>?): SDL_JoystickID {
    memScoped {
        return kniBridge438(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickNumAxes(joystick: CValuesRef<SDL_Joystick>?): Int {
    memScoped {
        return kniBridge439(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickNumBalls(joystick: CValuesRef<SDL_Joystick>?): Int {
    memScoped {
        return kniBridge440(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickNumHats(joystick: CValuesRef<SDL_Joystick>?): Int {
    memScoped {
        return kniBridge441(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickNumButtons(joystick: CValuesRef<SDL_Joystick>?): Int {
    memScoped {
        return kniBridge442(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickUpdate(): Unit {
    return kniBridge443()
}

fun SDL_JoystickEventState(state: Int): Int {
    return kniBridge444(state)
}

fun SDL_JoystickGetAxis(joystick: CValuesRef<SDL_Joystick>?, axis: Int): Sint16 {
    memScoped {
        return kniBridge445(joystick?.getPointer(memScope).rawValue, axis)
    }
}

fun SDL_JoystickGetAxisInitialState(joystick: CValuesRef<SDL_Joystick>?, axis: Int, state: CValuesRef<Sint16Var>?): SDL_bool {
    memScoped {
        return kniBridge446(joystick?.getPointer(memScope).rawValue, axis, state?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickGetHat(joystick: CValuesRef<SDL_Joystick>?, hat: Int): Uint8 {
    memScoped {
        return kniBridge447(joystick?.getPointer(memScope).rawValue, hat)
    }
}

fun SDL_JoystickGetBall(joystick: CValuesRef<SDL_Joystick>?, ball: Int, dx: CValuesRef<IntVar>?, dy: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge448(joystick?.getPointer(memScope).rawValue, ball, dx?.getPointer(memScope).rawValue, dy?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickGetButton(joystick: CValuesRef<SDL_Joystick>?, button: Int): Uint8 {
    memScoped {
        return kniBridge449(joystick?.getPointer(memScope).rawValue, button)
    }
}

fun SDL_JoystickRumble(joystick: CValuesRef<SDL_Joystick>?, low_frequency_rumble: Uint16, high_frequency_rumble: Uint16, duration_ms: Uint32): Int {
    memScoped {
        return kniBridge450(joystick?.getPointer(memScope).rawValue, low_frequency_rumble, high_frequency_rumble, duration_ms)
    }
}

fun SDL_JoystickClose(joystick: CValuesRef<SDL_Joystick>?): Unit {
    memScoped {
        return kniBridge451(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_JoystickCurrentPowerLevel(joystick: CValuesRef<SDL_Joystick>?): SDL_JoystickPowerLevel {
    memScoped {
        return kniBridge452(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerAddMappingsFromRW(rw: CValuesRef<SDL_RWops>?, freerw: Int): Int {
    memScoped {
        return kniBridge453(rw?.getPointer(memScope).rawValue, freerw)
    }
}

fun SDL_GameControllerAddMapping(@CCall.CString mappingString: String?): Int {
    memScoped {
        return kniBridge454(mappingString?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerNumMappings(): Int {
    return kniBridge455()
}

fun SDL_GameControllerMappingForIndex(mapping_index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge456(mapping_index))
}

fun SDL_GameControllerMappingForGUID(guid: CValue<SDL_JoystickGUID>): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge457(guid.getPointer(memScope).rawValue))
    }
}

fun SDL_GameControllerMapping(gamecontroller: CValuesRef<SDL_GameController>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge458(gamecontroller?.getPointer(memScope).rawValue))
    }
}

fun SDL_IsGameController(joystick_index: Int): SDL_bool {
    return kniBridge459(joystick_index)
}

fun SDL_GameControllerNameForIndex(joystick_index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge460(joystick_index))
}

fun SDL_GameControllerMappingForDeviceIndex(joystick_index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge461(joystick_index))
}

fun SDL_GameControllerOpen(joystick_index: Int): CPointer<SDL_GameController>? {
    return interpretCPointer<SDL_GameController>(kniBridge462(joystick_index))
}

fun SDL_GameControllerFromInstanceID(joyid: SDL_JoystickID): CPointer<SDL_GameController>? {
    return interpretCPointer<SDL_GameController>(kniBridge463(joyid))
}

fun SDL_GameControllerName(gamecontroller: CValuesRef<SDL_GameController>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge464(gamecontroller?.getPointer(memScope).rawValue))
    }
}

fun SDL_GameControllerGetPlayerIndex(gamecontroller: CValuesRef<SDL_GameController>?): Int {
    memScoped {
        return kniBridge465(gamecontroller?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerGetVendor(gamecontroller: CValuesRef<SDL_GameController>?): Uint16 {
    memScoped {
        return kniBridge466(gamecontroller?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerGetProduct(gamecontroller: CValuesRef<SDL_GameController>?): Uint16 {
    memScoped {
        return kniBridge467(gamecontroller?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerGetProductVersion(gamecontroller: CValuesRef<SDL_GameController>?): Uint16 {
    memScoped {
        return kniBridge468(gamecontroller?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerGetAttached(gamecontroller: CValuesRef<SDL_GameController>?): SDL_bool {
    memScoped {
        return kniBridge469(gamecontroller?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerGetJoystick(gamecontroller: CValuesRef<SDL_GameController>?): CPointer<SDL_Joystick>? {
    memScoped {
        return interpretCPointer<SDL_Joystick>(kniBridge470(gamecontroller?.getPointer(memScope).rawValue))
    }
}

fun SDL_GameControllerEventState(state: Int): Int {
    return kniBridge471(state)
}

fun SDL_GameControllerUpdate(): Unit {
    return kniBridge472()
}

fun SDL_GameControllerGetAxisFromString(@CCall.CString pchString: String?): SDL_GameControllerAxis {
    memScoped {
        return kniBridge473(pchString?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerGetStringForAxis(axis: SDL_GameControllerAxis): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge474(axis))
}

fun SDL_GameControllerGetBindForAxis(gamecontroller: CValuesRef<SDL_GameController>?, axis: SDL_GameControllerAxis): CValue<SDL_GameControllerButtonBind> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<SDL_GameControllerButtonBind>()
        try {
            kniBridge475(gamecontroller?.getPointer(memScope).rawValue, axis, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun SDL_GameControllerGetAxis(gamecontroller: CValuesRef<SDL_GameController>?, axis: SDL_GameControllerAxis): Sint16 {
    memScoped {
        return kniBridge476(gamecontroller?.getPointer(memScope).rawValue, axis)
    }
}

fun SDL_GameControllerGetButtonFromString(@CCall.CString pchString: String?): SDL_GameControllerButton {
    memScoped {
        return kniBridge477(pchString?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GameControllerGetStringForButton(button: SDL_GameControllerButton): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge478(button))
}

fun SDL_GameControllerGetBindForButton(gamecontroller: CValuesRef<SDL_GameController>?, button: SDL_GameControllerButton): CValue<SDL_GameControllerButtonBind> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<SDL_GameControllerButtonBind>()
        try {
            kniBridge479(gamecontroller?.getPointer(memScope).rawValue, button, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun SDL_GameControllerGetButton(gamecontroller: CValuesRef<SDL_GameController>?, button: SDL_GameControllerButton): Uint8 {
    memScoped {
        return kniBridge480(gamecontroller?.getPointer(memScope).rawValue, button)
    }
}

fun SDL_GameControllerRumble(gamecontroller: CValuesRef<SDL_GameController>?, low_frequency_rumble: Uint16, high_frequency_rumble: Uint16, duration_ms: Uint32): Int {
    memScoped {
        return kniBridge481(gamecontroller?.getPointer(memScope).rawValue, low_frequency_rumble, high_frequency_rumble, duration_ms)
    }
}

fun SDL_GameControllerClose(gamecontroller: CValuesRef<SDL_GameController>?): Unit {
    memScoped {
        return kniBridge482(gamecontroller?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetNumTouchDevices(): Int {
    return kniBridge483()
}

fun SDL_GetTouchDevice(index: Int): SDL_TouchID {
    return kniBridge484(index)
}

fun SDL_GetTouchDeviceType(touchID: SDL_TouchID): SDL_TouchDeviceType {
    return kniBridge485(touchID)
}

fun SDL_GetNumTouchFingers(touchID: SDL_TouchID): Int {
    return kniBridge486(touchID)
}

fun SDL_GetTouchFinger(touchID: SDL_TouchID, index: Int): CPointer<SDL_Finger>? {
    return interpretCPointer<SDL_Finger>(kniBridge487(touchID, index))
}

fun SDL_RecordGesture(touchId: SDL_TouchID): Int {
    return kniBridge488(touchId)
}

fun SDL_SaveAllDollarTemplates(dst: CValuesRef<SDL_RWops>?): Int {
    memScoped {
        return kniBridge489(dst?.getPointer(memScope).rawValue)
    }
}

fun SDL_SaveDollarTemplate(gestureId: SDL_GestureID, dst: CValuesRef<SDL_RWops>?): Int {
    memScoped {
        return kniBridge490(gestureId, dst?.getPointer(memScope).rawValue)
    }
}

fun SDL_LoadDollarTemplates(touchId: SDL_TouchID, src: CValuesRef<SDL_RWops>?): Int {
    memScoped {
        return kniBridge491(touchId, src?.getPointer(memScope).rawValue)
    }
}

fun SDL_PumpEvents(): Unit {
    return kniBridge492()
}

fun SDL_PeepEvents(events: CValuesRef<SDL_Event>?, numevents: Int, action: SDL_eventaction, minType: Uint32, maxType: Uint32): Int {
    memScoped {
        return kniBridge493(events?.getPointer(memScope).rawValue, numevents, action.value, minType, maxType)
    }
}

fun SDL_HasEvent(type: Uint32): SDL_bool {
    return kniBridge494(type)
}

fun SDL_HasEvents(minType: Uint32, maxType: Uint32): SDL_bool {
    return kniBridge495(minType, maxType)
}

fun SDL_FlushEvent(type: Uint32): Unit {
    return kniBridge496(type)
}

fun SDL_FlushEvents(minType: Uint32, maxType: Uint32): Unit {
    return kniBridge497(minType, maxType)
}

fun SDL_PollEvent(event: CValuesRef<SDL_Event>?): Int {
    memScoped {
        return kniBridge498(event?.getPointer(memScope).rawValue)
    }
}

fun SDL_WaitEvent(event: CValuesRef<SDL_Event>?): Int {
    memScoped {
        return kniBridge499(event?.getPointer(memScope).rawValue)
    }
}

fun SDL_WaitEventTimeout(event: CValuesRef<SDL_Event>?, timeout: Int): Int {
    memScoped {
        return kniBridge500(event?.getPointer(memScope).rawValue, timeout)
    }
}

fun SDL_PushEvent(event: CValuesRef<SDL_Event>?): Int {
    memScoped {
        return kniBridge501(event?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetEventFilter(filter: SDL_EventFilter?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge502(filter.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetEventFilter(filter: CValuesRef<SDL_EventFilterVar>?, userdata: CValuesRef<COpaquePointerVar>?): SDL_bool {
    memScoped {
        return kniBridge503(filter?.getPointer(memScope).rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_AddEventWatch(filter: SDL_EventFilter?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge504(filter.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_DelEventWatch(filter: SDL_EventFilter?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge505(filter.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_FilterEvents(filter: SDL_EventFilter?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge506(filter.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_EventState(type: Uint32, state: Int): Uint8 {
    return kniBridge507(type, state)
}

fun SDL_RegisterEvents(numevents: Int): Uint32 {
    return kniBridge508(numevents)
}

fun SDL_GetBasePath(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge509())
}

fun SDL_GetPrefPath(@CCall.CString org: String?, @CCall.CString app: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge510(org?.cstr?.getPointer(memScope).rawValue, app?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_NumHaptics(): Int {
    return kniBridge511()
}

fun SDL_HapticName(device_index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge512(device_index))
}

fun SDL_HapticOpen(device_index: Int): CPointer<SDL_Haptic>? {
    return interpretCPointer<SDL_Haptic>(kniBridge513(device_index))
}

fun SDL_HapticOpened(device_index: Int): Int {
    return kniBridge514(device_index)
}

fun SDL_HapticIndex(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge515(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_MouseIsHaptic(): Int {
    return kniBridge516()
}

fun SDL_HapticOpenFromMouse(): CPointer<SDL_Haptic>? {
    return interpretCPointer<SDL_Haptic>(kniBridge517())
}

fun SDL_JoystickIsHaptic(joystick: CValuesRef<SDL_Joystick>?): Int {
    memScoped {
        return kniBridge518(joystick?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticOpenFromJoystick(joystick: CValuesRef<SDL_Joystick>?): CPointer<SDL_Haptic>? {
    memScoped {
        return interpretCPointer<SDL_Haptic>(kniBridge519(joystick?.getPointer(memScope).rawValue))
    }
}

fun SDL_HapticClose(haptic: CValuesRef<SDL_Haptic>?): Unit {
    memScoped {
        return kniBridge520(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticNumEffects(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge521(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticNumEffectsPlaying(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge522(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticQuery(haptic: CValuesRef<SDL_Haptic>?): UInt {
    memScoped {
        return kniBridge523(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticNumAxes(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge524(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticEffectSupported(haptic: CValuesRef<SDL_Haptic>?, effect: CValuesRef<SDL_HapticEffect>?): Int {
    memScoped {
        return kniBridge525(haptic?.getPointer(memScope).rawValue, effect?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticNewEffect(haptic: CValuesRef<SDL_Haptic>?, effect: CValuesRef<SDL_HapticEffect>?): Int {
    memScoped {
        return kniBridge526(haptic?.getPointer(memScope).rawValue, effect?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticUpdateEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int, data: CValuesRef<SDL_HapticEffect>?): Int {
    memScoped {
        return kniBridge527(haptic?.getPointer(memScope).rawValue, effect, data?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticRunEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int, iterations: Uint32): Int {
    memScoped {
        return kniBridge528(haptic?.getPointer(memScope).rawValue, effect, iterations)
    }
}

fun SDL_HapticStopEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int): Int {
    memScoped {
        return kniBridge529(haptic?.getPointer(memScope).rawValue, effect)
    }
}

fun SDL_HapticDestroyEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int): Unit {
    memScoped {
        return kniBridge530(haptic?.getPointer(memScope).rawValue, effect)
    }
}

fun SDL_HapticGetEffectStatus(haptic: CValuesRef<SDL_Haptic>?, effect: Int): Int {
    memScoped {
        return kniBridge531(haptic?.getPointer(memScope).rawValue, effect)
    }
}

fun SDL_HapticSetGain(haptic: CValuesRef<SDL_Haptic>?, gain: Int): Int {
    memScoped {
        return kniBridge532(haptic?.getPointer(memScope).rawValue, gain)
    }
}

fun SDL_HapticSetAutocenter(haptic: CValuesRef<SDL_Haptic>?, autocenter: Int): Int {
    memScoped {
        return kniBridge533(haptic?.getPointer(memScope).rawValue, autocenter)
    }
}

fun SDL_HapticPause(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge534(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticUnpause(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge535(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticStopAll(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge536(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticRumbleSupported(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge537(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticRumbleInit(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge538(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_HapticRumblePlay(haptic: CValuesRef<SDL_Haptic>?, strength: Float, length: Uint32): Int {
    memScoped {
        return kniBridge539(haptic?.getPointer(memScope).rawValue, strength, length)
    }
}

fun SDL_HapticRumbleStop(haptic: CValuesRef<SDL_Haptic>?): Int {
    memScoped {
        return kniBridge540(haptic?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetHintWithPriority(@CCall.CString name: String?, @CCall.CString value: String?, priority: SDL_HintPriority): SDL_bool {
    memScoped {
        return kniBridge541(name?.cstr?.getPointer(memScope).rawValue, value?.cstr?.getPointer(memScope).rawValue, priority.value)
    }
}

fun SDL_SetHint(@CCall.CString name: String?, @CCall.CString value: String?): SDL_bool {
    memScoped {
        return kniBridge542(name?.cstr?.getPointer(memScope).rawValue, value?.cstr?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetHint(@CCall.CString name: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge543(name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetHintBoolean(@CCall.CString name: String?, default_value: SDL_bool): SDL_bool {
    memScoped {
        return kniBridge544(name?.cstr?.getPointer(memScope).rawValue, default_value)
    }
}

fun SDL_AddHintCallback(@CCall.CString name: String?, callback: SDL_HintCallback?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge545(name?.cstr?.getPointer(memScope).rawValue, callback.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_DelHintCallback(@CCall.CString name: String?, callback: SDL_HintCallback?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge546(name?.cstr?.getPointer(memScope).rawValue, callback.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_ClearHints(): Unit {
    return kniBridge547()
}

fun SDL_LoadObject(@CCall.CString sofile: String?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge548(sofile?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_LoadFunction(handle: CValuesRef<*>?, @CCall.CString name: String?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge549(handle?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun SDL_UnloadObject(handle: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge550(handle?.getPointer(memScope).rawValue)
    }
}

fun SDL_LogSetAllPriority(priority: SDL_LogPriority): Unit {
    return kniBridge551(priority)
}

fun SDL_LogSetPriority(category: Int, priority: SDL_LogPriority): Unit {
    return kniBridge552(category, priority)
}

fun SDL_LogGetPriority(category: Int): SDL_LogPriority {
    return kniBridge553(category)
}

fun SDL_LogResetPriorities(): Unit {
    return kniBridge554()
}

@CCall("knifunptr_sdl3")
external fun SDL_Log(@CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sdl4")
external fun SDL_LogVerbose(category: Int, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sdl5")
external fun SDL_LogDebug(category: Int, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sdl6")
external fun SDL_LogInfo(category: Int, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sdl7")
external fun SDL_LogWarn(category: Int, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sdl8")
external fun SDL_LogError(category: Int, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sdl9")
external fun SDL_LogCritical(category: Int, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

@CCall("knifunptr_sdl10")
external fun SDL_LogMessage(category: Int, priority: SDL_LogPriority, @CCall.CString fmt: String?, vararg variadicArguments: Any?): Unit

fun SDL_LogMessageV(category: Int, priority: SDL_LogPriority, @CCall.CString fmt: String?, ap: va_list?): Unit {
    memScoped {
        return kniBridge555(category, priority, fmt?.cstr?.getPointer(memScope).rawValue, ap.rawValue)
    }
}

fun SDL_LogGetOutputFunction(callback: CValuesRef<SDL_LogOutputFunctionVar>?, userdata: CValuesRef<COpaquePointerVar>?): Unit {
    memScoped {
        return kniBridge556(callback?.getPointer(memScope).rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_LogSetOutputFunction(callback: SDL_LogOutputFunction?, userdata: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge557(callback.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun SDL_ShowMessageBox(messageboxdata: CValuesRef<SDL_MessageBoxData>?, buttonid: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge558(messageboxdata?.getPointer(memScope).rawValue, buttonid?.getPointer(memScope).rawValue)
    }
}

fun SDL_ShowSimpleMessageBox(flags: Uint32, @CCall.CString title: String?, @CCall.CString message: String?, window: CValuesRef<SDL_Window>?): Int {
    memScoped {
        return kniBridge559(flags, title?.cstr?.getPointer(memScope).rawValue, message?.cstr?.getPointer(memScope).rawValue, window?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetPowerInfo(secs: CValuesRef<IntVar>?, pct: CValuesRef<IntVar>?): SDL_PowerState {
    memScoped {
        return SDL_PowerState.byValue(kniBridge560(secs?.getPointer(memScope).rawValue, pct?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetNumRenderDrivers(): Int {
    return kniBridge561()
}

fun SDL_GetRenderDriverInfo(index: Int, info: CValuesRef<SDL_RendererInfo>?): Int {
    memScoped {
        return kniBridge562(index, info?.getPointer(memScope).rawValue)
    }
}

fun SDL_CreateWindowAndRenderer(width: Int, height: Int, window_flags: Uint32, window: CValuesRef<CPointerVar<SDL_Window>>?, renderer: CValuesRef<CPointerVar<SDL_Renderer>>?): Int {
    memScoped {
        return kniBridge563(width, height, window_flags, window?.getPointer(memScope).rawValue, renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_CreateRenderer(window: CValuesRef<SDL_Window>?, index: Int, flags: Uint32): CPointer<SDL_Renderer>? {
    memScoped {
        return interpretCPointer<SDL_Renderer>(kniBridge564(window?.getPointer(memScope).rawValue, index, flags))
    }
}

fun SDL_CreateSoftwareRenderer(surface: CValuesRef<SDL_Surface>?): CPointer<SDL_Renderer>? {
    memScoped {
        return interpretCPointer<SDL_Renderer>(kniBridge565(surface?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetRenderer(window: CValuesRef<SDL_Window>?): CPointer<SDL_Renderer>? {
    memScoped {
        return interpretCPointer<SDL_Renderer>(kniBridge566(window?.getPointer(memScope).rawValue))
    }
}

fun SDL_GetRendererInfo(renderer: CValuesRef<SDL_Renderer>?, info: CValuesRef<SDL_RendererInfo>?): Int {
    memScoped {
        return kniBridge567(renderer?.getPointer(memScope).rawValue, info?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetRendererOutputSize(renderer: CValuesRef<SDL_Renderer>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge568(renderer?.getPointer(memScope).rawValue, w?.getPointer(memScope).rawValue, h?.getPointer(memScope).rawValue)
    }
}

fun SDL_CreateTexture(renderer: CValuesRef<SDL_Renderer>?, format: Uint32, access: Int, w: Int, h: Int): CPointer<SDL_Texture>? {
    memScoped {
        return interpretCPointer<SDL_Texture>(kniBridge569(renderer?.getPointer(memScope).rawValue, format, access, w, h))
    }
}

fun SDL_CreateTextureFromSurface(renderer: CValuesRef<SDL_Renderer>?, surface: CValuesRef<SDL_Surface>?): CPointer<SDL_Texture>? {
    memScoped {
        return interpretCPointer<SDL_Texture>(kniBridge570(renderer?.getPointer(memScope).rawValue, surface?.getPointer(memScope).rawValue))
    }
}

fun SDL_QueryTexture(texture: CValuesRef<SDL_Texture>?, format: CValuesRef<Uint32Var>?, access: CValuesRef<IntVar>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge571(texture?.getPointer(memScope).rawValue, format?.getPointer(memScope).rawValue, access?.getPointer(memScope).rawValue, w?.getPointer(memScope).rawValue, h?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetTextureColorMod(texture: CValuesRef<SDL_Texture>?, r: Uint8, g: Uint8, b: Uint8): Int {
    memScoped {
        return kniBridge572(texture?.getPointer(memScope).rawValue, r, g, b)
    }
}

fun SDL_GetTextureColorMod(texture: CValuesRef<SDL_Texture>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?): Int {
    memScoped {
        return kniBridge573(texture?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetTextureAlphaMod(texture: CValuesRef<SDL_Texture>?, alpha: Uint8): Int {
    memScoped {
        return kniBridge574(texture?.getPointer(memScope).rawValue, alpha)
    }
}

fun SDL_GetTextureAlphaMod(texture: CValuesRef<SDL_Texture>?, alpha: CValuesRef<Uint8Var>?): Int {
    memScoped {
        return kniBridge575(texture?.getPointer(memScope).rawValue, alpha?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetTextureBlendMode(texture: CValuesRef<SDL_Texture>?, blendMode: SDL_BlendMode): Int {
    memScoped {
        return kniBridge576(texture?.getPointer(memScope).rawValue, blendMode)
    }
}

fun SDL_GetTextureBlendMode(texture: CValuesRef<SDL_Texture>?, blendMode: CValuesRef<SDL_BlendModeVar>?): Int {
    memScoped {
        return kniBridge577(texture?.getPointer(memScope).rawValue, blendMode?.getPointer(memScope).rawValue)
    }
}

fun SDL_UpdateTexture(texture: CValuesRef<SDL_Texture>?, rect: CValuesRef<SDL_Rect>?, pixels: CValuesRef<*>?, pitch: Int): Int {
    memScoped {
        return kniBridge578(texture?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue, pixels?.getPointer(memScope).rawValue, pitch)
    }
}

fun SDL_UpdateYUVTexture(texture: CValuesRef<SDL_Texture>?, rect: CValuesRef<SDL_Rect>?, Yplane: CValuesRef<Uint8Var>?, Ypitch: Int, Uplane: CValuesRef<Uint8Var>?, Upitch: Int, Vplane: CValuesRef<Uint8Var>?, Vpitch: Int): Int {
    memScoped {
        return kniBridge579(texture?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue, Yplane?.getPointer(memScope).rawValue, Ypitch, Uplane?.getPointer(memScope).rawValue, Upitch, Vplane?.getPointer(memScope).rawValue, Vpitch)
    }
}

fun SDL_LockTexture(texture: CValuesRef<SDL_Texture>?, rect: CValuesRef<SDL_Rect>?, pixels: CValuesRef<COpaquePointerVar>?, pitch: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge580(texture?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue, pixels?.getPointer(memScope).rawValue, pitch?.getPointer(memScope).rawValue)
    }
}

fun SDL_UnlockTexture(texture: CValuesRef<SDL_Texture>?): Unit {
    memScoped {
        return kniBridge581(texture?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderTargetSupported(renderer: CValuesRef<SDL_Renderer>?): SDL_bool {
    memScoped {
        return kniBridge582(renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetRenderTarget(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?): Int {
    memScoped {
        return kniBridge583(renderer?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetRenderTarget(renderer: CValuesRef<SDL_Renderer>?): CPointer<SDL_Texture>? {
    memScoped {
        return interpretCPointer<SDL_Texture>(kniBridge584(renderer?.getPointer(memScope).rawValue))
    }
}

fun SDL_RenderSetLogicalSize(renderer: CValuesRef<SDL_Renderer>?, w: Int, h: Int): Int {
    memScoped {
        return kniBridge585(renderer?.getPointer(memScope).rawValue, w, h)
    }
}

fun SDL_RenderGetLogicalSize(renderer: CValuesRef<SDL_Renderer>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge586(renderer?.getPointer(memScope).rawValue, w?.getPointer(memScope).rawValue, h?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderSetIntegerScale(renderer: CValuesRef<SDL_Renderer>?, enable: SDL_bool): Int {
    memScoped {
        return kniBridge587(renderer?.getPointer(memScope).rawValue, enable)
    }
}

fun SDL_RenderGetIntegerScale(renderer: CValuesRef<SDL_Renderer>?): SDL_bool {
    memScoped {
        return kniBridge588(renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderSetViewport(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge589(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderGetViewport(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Unit {
    memScoped {
        return kniBridge590(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderSetClipRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge591(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderGetClipRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Unit {
    memScoped {
        return kniBridge592(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderIsClipEnabled(renderer: CValuesRef<SDL_Renderer>?): SDL_bool {
    memScoped {
        return kniBridge593(renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderSetScale(renderer: CValuesRef<SDL_Renderer>?, scaleX: Float, scaleY: Float): Int {
    memScoped {
        return kniBridge594(renderer?.getPointer(memScope).rawValue, scaleX, scaleY)
    }
}

fun SDL_RenderGetScale(renderer: CValuesRef<SDL_Renderer>?, scaleX: CValuesRef<FloatVar>?, scaleY: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge595(renderer?.getPointer(memScope).rawValue, scaleX?.getPointer(memScope).rawValue, scaleY?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetRenderDrawColor(renderer: CValuesRef<SDL_Renderer>?, r: Uint8, g: Uint8, b: Uint8, a: Uint8): Int {
    memScoped {
        return kniBridge596(renderer?.getPointer(memScope).rawValue, r, g, b, a)
    }
}

fun SDL_GetRenderDrawColor(renderer: CValuesRef<SDL_Renderer>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?, a: CValuesRef<Uint8Var>?): Int {
    memScoped {
        return kniBridge597(renderer?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetRenderDrawBlendMode(renderer: CValuesRef<SDL_Renderer>?, blendMode: SDL_BlendMode): Int {
    memScoped {
        return kniBridge598(renderer?.getPointer(memScope).rawValue, blendMode)
    }
}

fun SDL_GetRenderDrawBlendMode(renderer: CValuesRef<SDL_Renderer>?, blendMode: CValuesRef<SDL_BlendModeVar>?): Int {
    memScoped {
        return kniBridge599(renderer?.getPointer(memScope).rawValue, blendMode?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderClear(renderer: CValuesRef<SDL_Renderer>?): Int {
    memScoped {
        return kniBridge600(renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderDrawPoint(renderer: CValuesRef<SDL_Renderer>?, x: Int, y: Int): Int {
    memScoped {
        return kniBridge601(renderer?.getPointer(memScope).rawValue, x, y)
    }
}

fun SDL_RenderDrawPoints(renderer: CValuesRef<SDL_Renderer>?, points: CValuesRef<SDL_Point>?, count: Int): Int {
    memScoped {
        return kniBridge602(renderer?.getPointer(memScope).rawValue, points?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderDrawLine(renderer: CValuesRef<SDL_Renderer>?, x1: Int, y1: Int, x2: Int, y2: Int): Int {
    memScoped {
        return kniBridge603(renderer?.getPointer(memScope).rawValue, x1, y1, x2, y2)
    }
}

fun SDL_RenderDrawLines(renderer: CValuesRef<SDL_Renderer>?, points: CValuesRef<SDL_Point>?, count: Int): Int {
    memScoped {
        return kniBridge604(renderer?.getPointer(memScope).rawValue, points?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderDrawRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge605(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderDrawRects(renderer: CValuesRef<SDL_Renderer>?, rects: CValuesRef<SDL_Rect>?, count: Int): Int {
    memScoped {
        return kniBridge606(renderer?.getPointer(memScope).rawValue, rects?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderFillRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge607(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderFillRects(renderer: CValuesRef<SDL_Renderer>?, rects: CValuesRef<SDL_Rect>?, count: Int): Int {
    memScoped {
        return kniBridge608(renderer?.getPointer(memScope).rawValue, rects?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderCopy(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?, srcrect: CValuesRef<SDL_Rect>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    memScoped {
        return kniBridge609(renderer?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderCopyEx(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?, srcrect: CValuesRef<SDL_Rect>?, dstrect: CValuesRef<SDL_Rect>?, angle: Double, center: CValuesRef<SDL_Point>?, flip: SDL_RendererFlip): Int {
    memScoped {
        return kniBridge610(renderer?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue, angle, center?.getPointer(memScope).rawValue, flip)
    }
}

fun SDL_RenderDrawPointF(renderer: CValuesRef<SDL_Renderer>?, x: Float, y: Float): Int {
    memScoped {
        return kniBridge611(renderer?.getPointer(memScope).rawValue, x, y)
    }
}

fun SDL_RenderDrawPointsF(renderer: CValuesRef<SDL_Renderer>?, points: CValuesRef<SDL_FPoint>?, count: Int): Int {
    memScoped {
        return kniBridge612(renderer?.getPointer(memScope).rawValue, points?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderDrawLineF(renderer: CValuesRef<SDL_Renderer>?, x1: Float, y1: Float, x2: Float, y2: Float): Int {
    memScoped {
        return kniBridge613(renderer?.getPointer(memScope).rawValue, x1, y1, x2, y2)
    }
}

fun SDL_RenderDrawLinesF(renderer: CValuesRef<SDL_Renderer>?, points: CValuesRef<SDL_FPoint>?, count: Int): Int {
    memScoped {
        return kniBridge614(renderer?.getPointer(memScope).rawValue, points?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderDrawRectF(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_FRect>?): Int {
    memScoped {
        return kniBridge615(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderDrawRectsF(renderer: CValuesRef<SDL_Renderer>?, rects: CValuesRef<SDL_FRect>?, count: Int): Int {
    memScoped {
        return kniBridge616(renderer?.getPointer(memScope).rawValue, rects?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderFillRectF(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_FRect>?): Int {
    memScoped {
        return kniBridge617(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderFillRectsF(renderer: CValuesRef<SDL_Renderer>?, rects: CValuesRef<SDL_FRect>?, count: Int): Int {
    memScoped {
        return kniBridge618(renderer?.getPointer(memScope).rawValue, rects?.getPointer(memScope).rawValue, count)
    }
}

fun SDL_RenderCopyF(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?, srcrect: CValuesRef<SDL_Rect>?, dstrect: CValuesRef<SDL_FRect>?): Int {
    memScoped {
        return kniBridge619(renderer?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderCopyExF(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?, srcrect: CValuesRef<SDL_Rect>?, dstrect: CValuesRef<SDL_FRect>?, angle: Double, center: CValuesRef<SDL_FPoint>?, flip: SDL_RendererFlip): Int {
    memScoped {
        return kniBridge620(renderer?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, srcrect?.getPointer(memScope).rawValue, dstrect?.getPointer(memScope).rawValue, angle, center?.getPointer(memScope).rawValue, flip)
    }
}

fun SDL_RenderReadPixels(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?, format: Uint32, pixels: CValuesRef<*>?, pitch: Int): Int {
    memScoped {
        return kniBridge621(renderer?.getPointer(memScope).rawValue, rect?.getPointer(memScope).rawValue, format, pixels?.getPointer(memScope).rawValue, pitch)
    }
}

fun SDL_RenderPresent(renderer: CValuesRef<SDL_Renderer>?): Unit {
    memScoped {
        return kniBridge622(renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_DestroyTexture(texture: CValuesRef<SDL_Texture>?): Unit {
    memScoped {
        return kniBridge623(texture?.getPointer(memScope).rawValue)
    }
}

fun SDL_DestroyRenderer(renderer: CValuesRef<SDL_Renderer>?): Unit {
    memScoped {
        return kniBridge624(renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderFlush(renderer: CValuesRef<SDL_Renderer>?): Int {
    memScoped {
        return kniBridge625(renderer?.getPointer(memScope).rawValue)
    }
}

fun SDL_GL_BindTexture(texture: CValuesRef<SDL_Texture>?, texw: CValuesRef<FloatVar>?, texh: CValuesRef<FloatVar>?): Int {
    memScoped {
        return kniBridge626(texture?.getPointer(memScope).rawValue, texw?.getPointer(memScope).rawValue, texh?.getPointer(memScope).rawValue)
    }
}

fun SDL_GL_UnbindTexture(texture: CValuesRef<SDL_Texture>?): Int {
    memScoped {
        return kniBridge627(texture?.getPointer(memScope).rawValue)
    }
}

fun SDL_RenderGetMetalLayer(renderer: CValuesRef<SDL_Renderer>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge628(renderer?.getPointer(memScope).rawValue))
    }
}

fun SDL_RenderGetMetalCommandEncoder(renderer: CValuesRef<SDL_Renderer>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge629(renderer?.getPointer(memScope).rawValue))
    }
}

fun SDL_NumSensors(): Int {
    return kniBridge630()
}

fun SDL_SensorGetDeviceName(device_index: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge631(device_index))
}

fun SDL_SensorGetDeviceType(device_index: Int): SDL_SensorType {
    return kniBridge632(device_index)
}

fun SDL_SensorGetDeviceNonPortableType(device_index: Int): Int {
    return kniBridge633(device_index)
}

fun SDL_SensorGetDeviceInstanceID(device_index: Int): SDL_SensorID {
    return kniBridge634(device_index)
}

fun SDL_SensorOpen(device_index: Int): CPointer<SDL_Sensor>? {
    return interpretCPointer<SDL_Sensor>(kniBridge635(device_index))
}

fun SDL_SensorFromInstanceID(instance_id: SDL_SensorID): CPointer<SDL_Sensor>? {
    return interpretCPointer<SDL_Sensor>(kniBridge636(instance_id))
}

fun SDL_SensorGetName(sensor: CValuesRef<SDL_Sensor>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge637(sensor?.getPointer(memScope).rawValue))
    }
}

fun SDL_SensorGetType(sensor: CValuesRef<SDL_Sensor>?): SDL_SensorType {
    memScoped {
        return kniBridge638(sensor?.getPointer(memScope).rawValue)
    }
}

fun SDL_SensorGetNonPortableType(sensor: CValuesRef<SDL_Sensor>?): Int {
    memScoped {
        return kniBridge639(sensor?.getPointer(memScope).rawValue)
    }
}

fun SDL_SensorGetInstanceID(sensor: CValuesRef<SDL_Sensor>?): SDL_SensorID {
    memScoped {
        return kniBridge640(sensor?.getPointer(memScope).rawValue)
    }
}

fun SDL_SensorGetData(sensor: CValuesRef<SDL_Sensor>?, data: CValuesRef<FloatVar>?, num_values: Int): Int {
    memScoped {
        return kniBridge641(sensor?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, num_values)
    }
}

fun SDL_SensorClose(sensor: CValuesRef<SDL_Sensor>?): Unit {
    memScoped {
        return kniBridge642(sensor?.getPointer(memScope).rawValue)
    }
}

fun SDL_SensorUpdate(): Unit {
    return kniBridge643()
}

fun SDL_CreateShapedWindow(@CCall.CString title: String?, x: UInt, y: UInt, w: UInt, h: UInt, flags: Uint32): CPointer<SDL_Window>? {
    memScoped {
        return interpretCPointer<SDL_Window>(kniBridge644(title?.cstr?.getPointer(memScope).rawValue, x, y, w, h, flags))
    }
}

fun SDL_IsShapedWindow(window: CValuesRef<SDL_Window>?): SDL_bool {
    memScoped {
        return kniBridge645(window?.getPointer(memScope).rawValue)
    }
}

fun SDL_SetWindowShape(window: CValuesRef<SDL_Window>?, shape: CValuesRef<SDL_Surface>?, shape_mode: CValuesRef<SDL_WindowShapeMode>?): Int {
    memScoped {
        return kniBridge646(window?.getPointer(memScope).rawValue, shape?.getPointer(memScope).rawValue, shape_mode?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetShapedWindowMode(window: CValuesRef<SDL_Window>?, shape_mode: CValuesRef<SDL_WindowShapeMode>?): Int {
    memScoped {
        return kniBridge647(window?.getPointer(memScope).rawValue, shape_mode?.getPointer(memScope).rawValue)
    }
}

fun SDL_IsTablet(): SDL_bool {
    return kniBridge648()
}

fun SDL_GetTicks(): Uint32 {
    return kniBridge649()
}

fun SDL_GetPerformanceCounter(): Uint64 {
    return kniBridge650()
}

fun SDL_GetPerformanceFrequency(): Uint64 {
    return kniBridge651()
}

fun SDL_Delay(ms: Uint32): Unit {
    return kniBridge652(ms)
}

fun SDL_AddTimer(interval: Uint32, callback: SDL_TimerCallback?, param: CValuesRef<*>?): SDL_TimerID {
    memScoped {
        return kniBridge653(interval, callback.rawValue, param?.getPointer(memScope).rawValue)
    }
}

fun SDL_RemoveTimer(id: SDL_TimerID): SDL_bool {
    return kniBridge654(id)
}

fun SDL_GetVersion(ver: CValuesRef<SDL_version>?): Unit {
    memScoped {
        return kniBridge655(ver?.getPointer(memScope).rawValue)
    }
}

fun SDL_GetRevision(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge656())
}

fun SDL_GetRevisionNumber(): Int {
    return kniBridge657()
}

fun SDL_Init(flags: Uint32): Int {
    return kniBridge658(flags)
}

fun SDL_InitSubSystem(flags: Uint32): Int {
    return kniBridge659(flags)
}

fun SDL_QuitSubSystem(flags: Uint32): Unit {
    return kniBridge660(flags)
}

fun SDL_WasInit(flags: Uint32): Uint32 {
    return kniBridge661(flags)
}

fun SDL_Quit(): Unit {
    return kniBridge662()
}

const val __MACOSX__: Int = 1

const val SIZEOF_VOIDP: Int = 8

const val HAVE_GCC_ATOMICS: Int = 1

const val HAVE_LIBC: Int = 1

const val STDC_HEADERS: Int = 1

const val HAVE_ALLOCA_H: Int = 1

const val HAVE_CTYPE_H: Int = 1

const val HAVE_FLOAT_H: Int = 1

const val HAVE_ICONV_H: Int = 1

const val HAVE_INTTYPES_H: Int = 1

const val HAVE_LIMITS_H: Int = 1

const val HAVE_MATH_H: Int = 1

const val HAVE_MEMORY_H: Int = 1

const val HAVE_SIGNAL_H: Int = 1

const val HAVE_STDARG_H: Int = 1

const val HAVE_STDINT_H: Int = 1

const val HAVE_STDIO_H: Int = 1

const val HAVE_STDLIB_H: Int = 1

const val HAVE_STRINGS_H: Int = 1

const val HAVE_STRING_H: Int = 1

const val HAVE_SYS_TYPES_H: Int = 1

const val HAVE_WCHAR_H: Int = 1

const val HAVE_LIBUNWIND_H: Int = 1

const val HAVE_MALLOC: Int = 1

const val HAVE_CALLOC: Int = 1

const val HAVE_REALLOC: Int = 1

const val HAVE_FREE: Int = 1

const val HAVE_ALLOCA: Int = 1

const val HAVE_GETENV: Int = 1

const val HAVE_SETENV: Int = 1

const val HAVE_PUTENV: Int = 1

const val HAVE_UNSETENV: Int = 1

const val HAVE_QSORT: Int = 1

const val HAVE_ABS: Int = 1

const val HAVE_BCOPY: Int = 1

const val HAVE_MEMSET: Int = 1

const val HAVE_MEMCPY: Int = 1

const val HAVE_MEMMOVE: Int = 1

const val HAVE_MEMCMP: Int = 1

const val HAVE_WCSLEN: Int = 1

const val HAVE_WCSCMP: Int = 1

const val HAVE_STRLEN: Int = 1

const val HAVE_STRLCPY: Int = 1

const val HAVE_STRLCAT: Int = 1

const val HAVE_STRCHR: Int = 1

const val HAVE_STRRCHR: Int = 1

const val HAVE_STRSTR: Int = 1

const val HAVE_STRTOL: Int = 1

const val HAVE_STRTOUL: Int = 1

const val HAVE_STRTOLL: Int = 1

const val HAVE_STRTOULL: Int = 1

const val HAVE_STRTOD: Int = 1

const val HAVE_ATOI: Int = 1

const val HAVE_ATOF: Int = 1

const val HAVE_STRCMP: Int = 1

const val HAVE_STRNCMP: Int = 1

const val HAVE_STRCASECMP: Int = 1

const val HAVE_STRNCASECMP: Int = 1

const val HAVE_VSSCANF: Int = 1

const val HAVE_VSNPRINTF: Int = 1

const val HAVE_ACOS: Int = 1

const val HAVE_ACOSF: Int = 1

const val HAVE_ASIN: Int = 1

const val HAVE_ASINF: Int = 1

const val HAVE_ATAN: Int = 1

const val HAVE_ATANF: Int = 1

const val HAVE_ATAN2: Int = 1

const val HAVE_ATAN2F: Int = 1

const val HAVE_CEIL: Int = 1

const val HAVE_CEILF: Int = 1

const val HAVE_COPYSIGN: Int = 1

const val HAVE_COPYSIGNF: Int = 1

const val HAVE_COS: Int = 1

const val HAVE_COSF: Int = 1

const val HAVE_EXP: Int = 1

const val HAVE_EXPF: Int = 1

const val HAVE_FABS: Int = 1

const val HAVE_FABSF: Int = 1

const val HAVE_FLOOR: Int = 1

const val HAVE_FLOORF: Int = 1

const val HAVE_FMOD: Int = 1

const val HAVE_FMODF: Int = 1

const val HAVE_LOG: Int = 1

const val HAVE_LOGF: Int = 1

const val HAVE_LOG10: Int = 1

const val HAVE_LOG10F: Int = 1

const val HAVE_POW: Int = 1

const val HAVE_POWF: Int = 1

const val HAVE_SCALBN: Int = 1

const val HAVE_SCALBNF: Int = 1

const val HAVE_SIN: Int = 1

const val HAVE_SINF: Int = 1

const val HAVE_SQRT: Int = 1

const val HAVE_SQRTF: Int = 1

const val HAVE_TAN: Int = 1

const val HAVE_TANF: Int = 1

const val HAVE_FSEEKO: Int = 1

const val HAVE_SIGACTION: Int = 1

const val HAVE_SA_SIGACTION: Int = 1

const val HAVE_SETJMP: Int = 1

const val HAVE_NANOSLEEP: Int = 1

const val HAVE_SYSCONF: Int = 1

const val HAVE_SYSCTLBYNAME: Int = 1

const val HAVE_MPROTECT: Int = 1

const val HAVE_ICONV: Int = 1

const val HAVE_PTHREAD_SETNAME_NP: Int = 1

const val HAVE_POLL: Int = 1

const val HAVE__EXIT: Int = 1

const val HAVE_IMMINTRIN_H: Int = 1

const val SDL_AUDIO_DRIVER_COREAUDIO: Int = 1

const val SDL_AUDIO_DRIVER_DISK: Int = 1

const val SDL_AUDIO_DRIVER_DUMMY: Int = 1

const val SDL_JOYSTICK_IOKIT: Int = 1

const val SDL_JOYSTICK_HIDAPI: Int = 1

const val SDL_HAPTIC_IOKIT: Int = 1

const val SDL_SENSOR_DUMMY: Int = 1

const val SDL_LOADSO_DLOPEN: Int = 1

const val SDL_THREAD_PTHREAD: Int = 1

const val SDL_THREAD_PTHREAD_RECURSIVE_MUTEX: Int = 1

const val SDL_TIMER_UNIX: Int = 1

const val SDL_VIDEO_DRIVER_COCOA: Int = 1

const val SDL_VIDEO_DRIVER_DUMMY: Int = 1

const val SDL_VIDEO_RENDER_OGL: Int = 1

const val SDL_VIDEO_RENDER_OGL_ES2: Int = 1

const val SDL_VIDEO_RENDER_METAL: Int = 1

const val SDL_VIDEO_OPENGL: Int = 1

const val SDL_VIDEO_OPENGL_ES2: Int = 1

const val SDL_VIDEO_OPENGL_CGL: Int = 1

const val SDL_VIDEO_OPENGL_EGL: Int = 1

const val SDL_VIDEO_VULKAN: Int = 1

const val SDL_POWER_MACOSX: Int = 1

const val SDL_FILESYSTEM_COCOA: Int = 1

const val SDL_ASSEMBLY_ROUTINES: Int = 1

const val SDL_MAX_SINT8: Sint8 = 127

const val SDL_MIN_SINT8: Sint8 = -128

const val SDL_MAX_UINT8: Uint8 = 255u

const val SDL_MIN_UINT8: Uint8 = 0u

const val SDL_MAX_SINT16: Sint16 = 32767

const val SDL_MIN_SINT16: Sint16 = -32768

const val SDL_MAX_UINT16: Uint16 = 65535u

const val SDL_MIN_UINT16: Uint16 = 0u

const val SDL_MAX_SINT32: Sint32 = 2147483647

const val SDL_MIN_SINT32: Sint32 = -2147483648

const val SDL_MAX_UINT32: Uint32 = 4294967295u

const val SDL_MIN_UINT32: Uint32 = 0u

const val SDL_MAX_SINT64: Sint64 = 9223372036854775807

const val SDL_MIN_SINT64: Sint64 = -9223372036854775807 - 1

const val SDL_MAX_UINT64: Uint64 = 18446744073709551615u

const val SDL_MIN_UINT64: Uint64 = 0u

val SDL_PRIs64: String get() = "lld"

val SDL_PRIu64: String get() = "llu"

val SDL_PRIx64: String get() = "llx"

val SDL_PRIX64: String get() = "llX"

const val SDL_ICONV_ERROR: size_t = 18446744073709551615u

const val SDL_ICONV_E2BIG: size_t = 18446744073709551614u

const val SDL_ICONV_EILSEQ: size_t = 18446744073709551613u

const val SDL_ICONV_EINVAL: size_t = 18446744073709551612u

const val SDL_ASSERT_LEVEL: Int = 2

val SDL_FILE: String get() = "\u002Fvar\u002Ffolders\u002Fk2\u002F52j57c4x3z70g8798dlbxtc488m_4m\u002FT\u002Ftmp5981812362422081686.c"

const val SDL_LINE: Int = 512

const val SDL_NULL_WHILE_LOOP_CONDITION: Int = 0

const val SDL_LIL_ENDIAN: Int = 1234

const val SDL_BIG_ENDIAN: Int = 4321

const val SDL_BYTEORDER: Int = 1234

const val SDL_MUTEX_TIMEDOUT: Int = 1

const val SDL_MUTEX_MAXWAIT: Uint32 = 4294967295u

const val SDL_RWOPS_UNKNOWN: UInt = 0u

const val SDL_RWOPS_WINFILE: UInt = 1u

const val SDL_RWOPS_STDFILE: UInt = 2u

const val SDL_RWOPS_JNIFILE: UInt = 3u

const val SDL_RWOPS_MEMORY: UInt = 4u

const val SDL_RWOPS_MEMORY_RO: UInt = 5u

const val RW_SEEK_SET: Int = 0

const val RW_SEEK_CUR: Int = 1

const val RW_SEEK_END: Int = 2

const val SDL_AUDIO_MASK_BITSIZE: Int = 255

const val SDL_AUDIO_MASK_DATATYPE: Int = 256

const val SDL_AUDIO_MASK_ENDIAN: Int = 4096

const val SDL_AUDIO_MASK_SIGNED: Int = 32768

const val AUDIO_U8: Int = 8

const val AUDIO_S8: Int = 32776

const val AUDIO_U16LSB: Int = 16

const val AUDIO_S16LSB: Int = 32784

const val AUDIO_U16MSB: Int = 4112

const val AUDIO_S16MSB: Int = 36880

const val AUDIO_U16: Int = 16

const val AUDIO_S16: Int = 32784

const val AUDIO_S32LSB: Int = 32800

const val AUDIO_S32MSB: Int = 36896

const val AUDIO_S32: Int = 32800

const val AUDIO_F32LSB: Int = 33056

const val AUDIO_F32MSB: Int = 37152

const val AUDIO_F32: Int = 33056

const val AUDIO_U16SYS: Int = 16

const val AUDIO_S16SYS: Int = 32784

const val AUDIO_S32SYS: Int = 32800

const val AUDIO_F32SYS: Int = 33056

const val SDL_AUDIO_ALLOW_FREQUENCY_CHANGE: Int = 1

const val SDL_AUDIO_ALLOW_FORMAT_CHANGE: Int = 2

const val SDL_AUDIO_ALLOW_CHANNELS_CHANGE: Int = 4

const val SDL_AUDIO_ALLOW_SAMPLES_CHANGE: Int = 8

const val SDL_AUDIO_ALLOW_ANY_CHANGE: Int = 15

const val SDL_AUDIOCVT_MAX_FILTERS: Int = 9

const val SDL_MIX_MAXVOLUME: Int = 128

const val SDL_CACHELINE_SIZE: Int = 128

const val SDL_ALPHA_OPAQUE: Int = 255

const val SDL_ALPHA_TRANSPARENT: Int = 0

const val SDL_SWSURFACE: Int = 0

const val SDL_PREALLOC: Int = 1

const val SDL_RLEACCEL: Int = 2

const val SDL_DONTFREE: Int = 4

const val SDL_SIMD_ALIGNED: Int = 8

const val SDL_WINDOWPOS_UNDEFINED_MASK: UInt = 536805376u

const val SDL_WINDOWPOS_UNDEFINED: UInt = 536805376u

const val SDL_WINDOWPOS_CENTERED_MASK: UInt = 805240832u

const val SDL_WINDOWPOS_CENTERED: UInt = 805240832u

const val SDLK_SCANCODE_MASK: Int = 1073741824

const val KMOD_CTRL: Int = 192

const val KMOD_SHIFT: Int = 3

const val KMOD_ALT: Int = 768

const val KMOD_GUI: Int = 3072

const val SDL_BUTTON_LEFT: Int = 1

const val SDL_BUTTON_MIDDLE: Int = 2

const val SDL_BUTTON_RIGHT: Int = 3

const val SDL_BUTTON_X1: Int = 4

const val SDL_BUTTON_X2: Int = 5

const val SDL_BUTTON_LMASK: Int = 1

const val SDL_BUTTON_MMASK: Int = 2

const val SDL_BUTTON_RMASK: Int = 4

const val SDL_BUTTON_X1MASK: Int = 8

const val SDL_BUTTON_X2MASK: Int = 16

const val SDL_JOYSTICK_AXIS_MAX: Int = 32767

const val SDL_JOYSTICK_AXIS_MIN: Int = -32768

const val SDL_HAT_CENTERED: Int = 0

const val SDL_HAT_UP: Int = 1

const val SDL_HAT_RIGHT: Int = 2

const val SDL_HAT_DOWN: Int = 4

const val SDL_HAT_LEFT: Int = 8

const val SDL_HAT_RIGHTUP: Int = 3

const val SDL_HAT_RIGHTDOWN: Int = 6

const val SDL_HAT_LEFTUP: Int = 9

const val SDL_HAT_LEFTDOWN: Int = 12

const val SDL_TOUCH_MOUSEID: Uint32 = 4294967295u

const val SDL_MOUSE_TOUCHID: Sint64 = -1

const val SDL_RELEASED: Int = 0

const val SDL_PRESSED: Int = 1

const val SDL_TEXTEDITINGEVENT_TEXT_SIZE: Int = 32

const val SDL_TEXTINPUTEVENT_TEXT_SIZE: Int = 32

const val SDL_QUERY: Int = -1

const val SDL_IGNORE: Int = 0

const val SDL_DISABLE: Int = 0

const val SDL_ENABLE: Int = 1

const val SDL_HAPTIC_CONSTANT: UInt = 1u

const val SDL_HAPTIC_SINE: UInt = 2u

const val SDL_HAPTIC_LEFTRIGHT: UInt = 4u

const val SDL_HAPTIC_TRIANGLE: UInt = 8u

const val SDL_HAPTIC_SAWTOOTHUP: UInt = 16u

const val SDL_HAPTIC_SAWTOOTHDOWN: UInt = 32u

const val SDL_HAPTIC_RAMP: UInt = 64u

const val SDL_HAPTIC_SPRING: UInt = 128u

const val SDL_HAPTIC_DAMPER: UInt = 256u

const val SDL_HAPTIC_INERTIA: UInt = 512u

const val SDL_HAPTIC_FRICTION: UInt = 1024u

const val SDL_HAPTIC_CUSTOM: UInt = 2048u

const val SDL_HAPTIC_GAIN: UInt = 4096u

const val SDL_HAPTIC_AUTOCENTER: UInt = 8192u

const val SDL_HAPTIC_STATUS: UInt = 16384u

const val SDL_HAPTIC_PAUSE: UInt = 32768u

const val SDL_HAPTIC_POLAR: Int = 0

const val SDL_HAPTIC_CARTESIAN: Int = 1

const val SDL_HAPTIC_SPHERICAL: Int = 2

const val SDL_HAPTIC_INFINITY: UInt = 4294967295u

val SDL_HINT_FRAMEBUFFER_ACCELERATION: String get() = "SDL_FRAMEBUFFER_ACCELERATION"

val SDL_HINT_RENDER_DRIVER: String get() = "SDL_RENDER_DRIVER"

val SDL_HINT_RENDER_OPENGL_SHADERS: String get() = "SDL_RENDER_OPENGL_SHADERS"

val SDL_HINT_RENDER_DIRECT3D_THREADSAFE: String get() = "SDL_RENDER_DIRECT3D_THREADSAFE"

val SDL_HINT_RENDER_DIRECT3D11_DEBUG: String get() = "SDL_RENDER_DIRECT3D11_DEBUG"

val SDL_HINT_RENDER_LOGICAL_SIZE_MODE: String get() = "SDL_RENDER_LOGICAL_SIZE_MODE"

val SDL_HINT_RENDER_SCALE_QUALITY: String get() = "SDL_RENDER_SCALE_QUALITY"

val SDL_HINT_RENDER_VSYNC: String get() = "SDL_RENDER_VSYNC"

val SDL_HINT_VIDEO_ALLOW_SCREENSAVER: String get() = "SDL_VIDEO_ALLOW_SCREENSAVER"

val SDL_HINT_VIDEO_X11_XVIDMODE: String get() = "SDL_VIDEO_X11_XVIDMODE"

val SDL_HINT_VIDEO_X11_XINERAMA: String get() = "SDL_VIDEO_X11_XINERAMA"

val SDL_HINT_VIDEO_X11_XRANDR: String get() = "SDL_VIDEO_X11_XRANDR"

val SDL_HINT_VIDEO_X11_NET_WM_PING: String get() = "SDL_VIDEO_X11_NET_WM_PING"

val SDL_HINT_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR: String get() = "SDL_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR"

val SDL_HINT_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN: String get() = "SDL_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN"

val SDL_HINT_WINDOWS_INTRESOURCE_ICON: String get() = "SDL_WINDOWS_INTRESOURCE_ICON"

val SDL_HINT_WINDOWS_INTRESOURCE_ICON_SMALL: String get() = "SDL_WINDOWS_INTRESOURCE_ICON_SMALL"

val SDL_HINT_WINDOWS_ENABLE_MESSAGELOOP: String get() = "SDL_WINDOWS_ENABLE_MESSAGELOOP"

val SDL_HINT_GRAB_KEYBOARD: String get() = "SDL_GRAB_KEYBOARD"

val SDL_HINT_MOUSE_DOUBLE_CLICK_TIME: String get() = "SDL_MOUSE_DOUBLE_CLICK_TIME"

val SDL_HINT_MOUSE_DOUBLE_CLICK_RADIUS: String get() = "SDL_MOUSE_DOUBLE_CLICK_RADIUS"

val SDL_HINT_MOUSE_NORMAL_SPEED_SCALE: String get() = "SDL_MOUSE_NORMAL_SPEED_SCALE"

val SDL_HINT_MOUSE_RELATIVE_SPEED_SCALE: String get() = "SDL_MOUSE_RELATIVE_SPEED_SCALE"

val SDL_HINT_MOUSE_RELATIVE_MODE_WARP: String get() = "SDL_MOUSE_RELATIVE_MODE_WARP"

val SDL_HINT_MOUSE_FOCUS_CLICKTHROUGH: String get() = "SDL_MOUSE_FOCUS_CLICKTHROUGH"

val SDL_HINT_TOUCH_MOUSE_EVENTS: String get() = "SDL_TOUCH_MOUSE_EVENTS"

val SDL_HINT_MOUSE_TOUCH_EVENTS: String get() = "SDL_MOUSE_TOUCH_EVENTS"

val SDL_HINT_VIDEO_MINIMIZE_ON_FOCUS_LOSS: String get() = "SDL_VIDEO_MINIMIZE_ON_FOCUS_LOSS"

val SDL_HINT_IDLE_TIMER_DISABLED: String get() = "SDL_IOS_IDLE_TIMER_DISABLED"

val SDL_HINT_ORIENTATIONS: String get() = "SDL_IOS_ORIENTATIONS"

val SDL_HINT_APPLE_TV_CONTROLLER_UI_EVENTS: String get() = "SDL_APPLE_TV_CONTROLLER_UI_EVENTS"

val SDL_HINT_APPLE_TV_REMOTE_ALLOW_ROTATION: String get() = "SDL_APPLE_TV_REMOTE_ALLOW_ROTATION"

val SDL_HINT_IOS_HIDE_HOME_INDICATOR: String get() = "SDL_IOS_HIDE_HOME_INDICATOR"

val SDL_HINT_ACCELEROMETER_AS_JOYSTICK: String get() = "SDL_ACCELEROMETER_AS_JOYSTICK"

val SDL_HINT_TV_REMOTE_AS_JOYSTICK: String get() = "SDL_TV_REMOTE_AS_JOYSTICK"

val SDL_HINT_XINPUT_ENABLED: String get() = "SDL_XINPUT_ENABLED"

val SDL_HINT_XINPUT_USE_OLD_JOYSTICK_MAPPING: String get() = "SDL_XINPUT_USE_OLD_JOYSTICK_MAPPING"

val SDL_HINT_GAMECONTROLLERCONFIG: String get() = "SDL_GAMECONTROLLERCONFIG"

val SDL_HINT_GAMECONTROLLERCONFIG_FILE: String get() = "SDL_GAMECONTROLLERCONFIG_FILE"

val SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES: String get() = "SDL_GAMECONTROLLER_IGNORE_DEVICES"

val SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT: String get() = "SDL_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT"

val SDL_HINT_JOYSTICK_ALLOW_BACKGROUND_EVENTS: String get() = "SDL_JOYSTICK_ALLOW_BACKGROUND_EVENTS"

val SDL_HINT_JOYSTICK_HIDAPI: String get() = "SDL_JOYSTICK_HIDAPI"

val SDL_HINT_JOYSTICK_HIDAPI_PS4: String get() = "SDL_JOYSTICK_HIDAPI_PS4"

val SDL_HINT_JOYSTICK_HIDAPI_PS4_RUMBLE: String get() = "SDL_JOYSTICK_HIDAPI_PS4_RUMBLE"

val SDL_HINT_JOYSTICK_HIDAPI_STEAM: String get() = "SDL_JOYSTICK_HIDAPI_STEAM"

val SDL_HINT_JOYSTICK_HIDAPI_SWITCH: String get() = "SDL_JOYSTICK_HIDAPI_SWITCH"

val SDL_HINT_JOYSTICK_HIDAPI_XBOX: String get() = "SDL_JOYSTICK_HIDAPI_XBOX"

val SDL_HINT_ENABLE_STEAM_CONTROLLERS: String get() = "SDL_ENABLE_STEAM_CONTROLLERS"

val SDL_HINT_ALLOW_TOPMOST: String get() = "SDL_ALLOW_TOPMOST"

val SDL_HINT_TIMER_RESOLUTION: String get() = "SDL_TIMER_RESOLUTION"

val SDL_HINT_QTWAYLAND_CONTENT_ORIENTATION: String get() = "SDL_QTWAYLAND_CONTENT_ORIENTATION"

val SDL_HINT_QTWAYLAND_WINDOW_FLAGS: String get() = "SDL_QTWAYLAND_WINDOW_FLAGS"

val SDL_HINT_THREAD_STACK_SIZE: String get() = "SDL_THREAD_STACK_SIZE"

val SDL_HINT_VIDEO_HIGHDPI_DISABLED: String get() = "SDL_VIDEO_HIGHDPI_DISABLED"

val SDL_HINT_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK: String get() = "SDL_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK"

val SDL_HINT_VIDEO_WIN_D3DCOMPILER: String get() = "SDL_VIDEO_WIN_D3DCOMPILER"

val SDL_HINT_VIDEO_WINDOW_SHARE_PIXEL_FORMAT: String get() = "SDL_VIDEO_WINDOW_SHARE_PIXEL_FORMAT"

val SDL_HINT_WINRT_PRIVACY_POLICY_URL: String get() = "SDL_WINRT_PRIVACY_POLICY_URL"

val SDL_HINT_WINRT_PRIVACY_POLICY_LABEL: String get() = "SDL_WINRT_PRIVACY_POLICY_LABEL"

val SDL_HINT_WINRT_HANDLE_BACK_BUTTON: String get() = "SDL_WINRT_HANDLE_BACK_BUTTON"

val SDL_HINT_VIDEO_MAC_FULLSCREEN_SPACES: String get() = "SDL_VIDEO_MAC_FULLSCREEN_SPACES"

val SDL_HINT_MAC_BACKGROUND_APP: String get() = "SDL_MAC_BACKGROUND_APP"

val SDL_HINT_ANDROID_APK_EXPANSION_MAIN_FILE_VERSION: String get() = "SDL_ANDROID_APK_EXPANSION_MAIN_FILE_VERSION"

val SDL_HINT_ANDROID_APK_EXPANSION_PATCH_FILE_VERSION: String get() = "SDL_ANDROID_APK_EXPANSION_PATCH_FILE_VERSION"

val SDL_HINT_IME_INTERNAL_EDITING: String get() = "SDL_IME_INTERNAL_EDITING"

val SDL_HINT_ANDROID_TRAP_BACK_BUTTON: String get() = "SDL_ANDROID_TRAP_BACK_BUTTON"

val SDL_HINT_ANDROID_BLOCK_ON_PAUSE: String get() = "SDL_ANDROID_BLOCK_ON_PAUSE"

val SDL_HINT_RETURN_KEY_HIDES_IME: String get() = "SDL_RETURN_KEY_HIDES_IME"

val SDL_HINT_EMSCRIPTEN_KEYBOARD_ELEMENT: String get() = "SDL_EMSCRIPTEN_KEYBOARD_ELEMENT"

val SDL_HINT_NO_SIGNAL_HANDLERS: String get() = "SDL_NO_SIGNAL_HANDLERS"

val SDL_HINT_WINDOWS_NO_CLOSE_ON_ALT_F4: String get() = "SDL_WINDOWS_NO_CLOSE_ON_ALT_F4"

val SDL_HINT_BMP_SAVE_LEGACY_FORMAT: String get() = "SDL_BMP_SAVE_LEGACY_FORMAT"

val SDL_HINT_WINDOWS_DISABLE_THREAD_NAMING: String get() = "SDL_WINDOWS_DISABLE_THREAD_NAMING"

val SDL_HINT_RPI_VIDEO_LAYER: String get() = "SDL_RPI_VIDEO_LAYER"

val SDL_HINT_VIDEO_DOUBLE_BUFFER: String get() = "SDL_VIDEO_DOUBLE_BUFFER"

val SDL_HINT_OPENGL_ES_DRIVER: String get() = "SDL_OPENGL_ES_DRIVER"

val SDL_HINT_AUDIO_RESAMPLING_MODE: String get() = "SDL_AUDIO_RESAMPLING_MODE"

val SDL_HINT_AUDIO_CATEGORY: String get() = "SDL_AUDIO_CATEGORY"

val SDL_HINT_RENDER_BATCHING: String get() = "SDL_RENDER_BATCHING"

val SDL_HINT_EVENT_LOGGING: String get() = "SDL_EVENT_LOGGING"

val SDL_HINT_WAVE_RIFF_CHUNK_SIZE: String get() = "SDL_WAVE_RIFF_CHUNK_SIZE"

val SDL_HINT_WAVE_TRUNCATION: String get() = "SDL_WAVE_TRUNCATION"

val SDL_HINT_WAVE_FACT_CHUNK: String get() = "SDL_WAVE_FACT_CHUNK"

const val SDL_MAX_LOG_MESSAGE: Int = 4096

val SDL_STANDARD_GRAVITY: Float get() = bitsToFloat(1092413450) /* == 9.80665 */

const val SDL_NONSHAPEABLE_WINDOW: Int = -1

const val SDL_INVALID_SHAPE_ARGUMENT: Int = -2

const val SDL_WINDOW_LACKS_SHAPE: Int = -3

const val SDL_MAJOR_VERSION: Int = 2

const val SDL_MINOR_VERSION: Int = 0

const val SDL_PATCHLEVEL: Int = 10

const val SDL_COMPILEDVERSION: Int = 2010

const val SDL_INIT_TIMER: UInt = 1u

const val SDL_INIT_AUDIO: UInt = 16u

const val SDL_INIT_VIDEO: UInt = 32u

const val SDL_INIT_JOYSTICK: UInt = 512u

const val SDL_INIT_HAPTIC: UInt = 4096u

const val SDL_INIT_GAMECONTROLLER: UInt = 8192u

const val SDL_INIT_EVENTS: UInt = 16384u

const val SDL_INIT_SENSOR: UInt = 32768u

const val SDL_INIT_NOPARACHUTE: UInt = 1048576u

const val SDL_INIT_EVERYTHING: UInt = 62001u

val SDL_FUNCTION: CPointer<ByteVar>?
    get() = interpretCPointer<ByteVar>(kniBridge663())

val SDL_BlitSurface: CPointer<CFunction<(CPointer<SDL_Surface>?, CPointer<SDL_Rect>?, CPointer<SDL_Surface>?, CPointer<SDL_Rect>?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<SDL_Surface>?, CPointer<SDL_Rect>?, CPointer<SDL_Surface>?, CPointer<SDL_Rect>?) -> Int>>(kniBridge664())

val SDL_BlitScaled: CPointer<CFunction<(CPointer<SDL_Surface>?, CPointer<SDL_Rect>?, CPointer<SDL_Surface>?, CPointer<SDL_Rect>?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<SDL_Surface>?, CPointer<SDL_Rect>?, CPointer<SDL_Surface>?, CPointer<SDL_Rect>?) -> Int>>(kniBridge665())

typealias Sint8Var = ByteVarOf<Sint8>

typealias Sint8 = int8_t

typealias Uint8Var = UByteVarOf<Uint8>

typealias Uint8 = uint8_t

typealias Sint16Var = ShortVarOf<Sint16>

typealias Sint16 = int16_t

typealias Uint16Var = UShortVarOf<Uint16>

typealias Uint16 = uint16_t

typealias Sint32Var = IntVarOf<Sint32>

typealias Sint32 = int32_t

typealias Uint32Var = UIntVarOf<Uint32>

typealias Uint32 = uint32_t

typealias Sint64Var = LongVarOf<Sint64>

typealias Sint64 = int64_t

typealias Uint64Var = ULongVarOf<Uint64>

typealias Uint64 = uint64_t

typealias SDL_compile_time_assert_uint8Var = CPointerVarOf<SDL_compile_time_assert_uint8>

typealias SDL_compile_time_assert_uint8 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint8Var = CPointerVarOf<SDL_compile_time_assert_sint8>

typealias SDL_compile_time_assert_sint8 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_uint16Var = CPointerVarOf<SDL_compile_time_assert_uint16>

typealias SDL_compile_time_assert_uint16 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint16Var = CPointerVarOf<SDL_compile_time_assert_sint16>

typealias SDL_compile_time_assert_sint16 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_uint32Var = CPointerVarOf<SDL_compile_time_assert_uint32>

typealias SDL_compile_time_assert_uint32 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint32Var = CPointerVarOf<SDL_compile_time_assert_sint32>

typealias SDL_compile_time_assert_sint32 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_uint64Var = CPointerVarOf<SDL_compile_time_assert_uint64>

typealias SDL_compile_time_assert_uint64 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint64Var = CPointerVarOf<SDL_compile_time_assert_sint64>

typealias SDL_compile_time_assert_sint64 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_enumVar = CPointerVarOf<SDL_compile_time_assert_enum>

typealias SDL_compile_time_assert_enum = CArrayPointer<IntVar>

typealias SDL_malloc_funcVar = CPointerVarOf<SDL_malloc_func>

typealias SDL_malloc_func = CPointer<CFunction<(size_t) -> COpaquePointer?>>

typealias SDL_calloc_funcVar = CPointerVarOf<SDL_calloc_func>

typealias SDL_calloc_func = CPointer<CFunction<(size_t, size_t) -> COpaquePointer?>>

typealias SDL_realloc_funcVar = CPointerVarOf<SDL_realloc_func>

typealias SDL_realloc_func = CPointer<CFunction<(COpaquePointer?, size_t) -> COpaquePointer?>>

typealias SDL_free_funcVar = CPointerVarOf<SDL_free_func>

typealias SDL_free_func = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias SDL_iconv_tVar = CPointerVarOf<SDL_iconv_t>

typealias SDL_iconv_t = CPointer<_SDL_iconv_t>

typealias SDL_main_funcVar = CPointerVarOf<SDL_main_func>

typealias SDL_main_func = CPointer<CFunction<(Int, CArrayPointer<CPointerVar<ByteVar>>?) -> Int>>

typealias SDL_AssertionHandlerVar = CPointerVarOf<SDL_AssertionHandler>

typealias SDL_AssertionHandler = CPointer<CFunction<(CPointer<SDL_AssertData>?, COpaquePointer?) -> SDL_AssertState>>

typealias SDL_SpinLockVar = IntVarOf<SDL_SpinLock>

typealias SDL_SpinLock = Int

typealias SDL_sem = SDL_semaphore

typealias SDL_threadIDVar = ULongVarOf<SDL_threadID>

typealias SDL_threadID = ULong

typealias SDL_TLSIDVar = UIntVarOf<SDL_TLSID>

typealias SDL_TLSID = UInt

typealias SDL_ThreadFunctionVar = CPointerVarOf<SDL_ThreadFunction>

typealias SDL_ThreadFunction = CPointer<CFunction<(COpaquePointer?) -> Int>>

typealias SDL_AudioFormatVar = UShortVarOf<SDL_AudioFormat>

typealias SDL_AudioFormat = Uint16

typealias SDL_AudioCallbackVar = CPointerVarOf<SDL_AudioCallback>

typealias SDL_AudioCallback = CPointer<CFunction<(COpaquePointer?, CPointer<Uint8Var>?, Int) -> Unit>>

typealias SDL_AudioFilterVar = CPointerVarOf<SDL_AudioFilter>

typealias SDL_AudioFilter = CPointer<CFunction<(CPointer<SDL_AudioCVT>?, SDL_AudioFormat) -> Unit>>

typealias SDL_AudioDeviceIDVar = UIntVarOf<SDL_AudioDeviceID>

typealias SDL_AudioDeviceID = Uint32

typealias SDL_AudioStream = _SDL_AudioStream

typealias SDL_blitVar = CPointerVarOf<SDL_blit>

typealias SDL_blit = CPointer<CFunction<(CPointer<SDL_Surface>?, CPointer<SDL_Rect>?, CPointer<SDL_Surface>?, CPointer<SDL_Rect>?) -> Int>>

typealias SDL_GLContextVar = CPointerVarOf<SDL_GLContext>

typealias SDL_GLContext = COpaquePointer

typealias SDL_HitTestVar = CPointerVarOf<SDL_HitTest>

typealias SDL_HitTest = CPointer<CFunction<(CPointer<SDL_Window>?, CPointer<SDL_Point>?, COpaquePointer?) -> SDL_HitTestResult>>

typealias SDL_KeycodeVar = IntVarOf<SDL_Keycode>

typealias SDL_Keycode = Sint32

typealias SDL_Joystick = _SDL_Joystick

typealias SDL_JoystickIDVar = IntVarOf<SDL_JoystickID>

typealias SDL_JoystickID = Sint32

typealias SDL_GameController = _SDL_GameController

typealias SDL_TouchIDVar = LongVarOf<SDL_TouchID>

typealias SDL_TouchID = Sint64

typealias SDL_FingerIDVar = LongVarOf<SDL_FingerID>

typealias SDL_FingerID = Sint64

typealias SDL_GestureIDVar = LongVarOf<SDL_GestureID>

typealias SDL_GestureID = Sint64

typealias SDL_compile_time_assert_SDL_EventVar = CPointerVarOf<SDL_compile_time_assert_SDL_Event>

typealias SDL_compile_time_assert_SDL_Event = CArrayPointer<IntVar>

typealias SDL_EventFilterVar = CPointerVarOf<SDL_EventFilter>

typealias SDL_EventFilter = CPointer<CFunction<(COpaquePointer?, CPointer<SDL_Event>?) -> Int>>

typealias SDL_Haptic = _SDL_Haptic

typealias SDL_HintCallbackVar = CPointerVarOf<SDL_HintCallback>

typealias SDL_HintCallback = CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Unit>>

typealias SDL_LogOutputFunctionVar = CPointerVarOf<SDL_LogOutputFunction>

typealias SDL_LogOutputFunction = CPointer<CFunction<(COpaquePointer?, Int, SDL_LogPriority, CPointer<ByteVar>?) -> Unit>>

typealias SDL_Sensor = _SDL_Sensor

typealias SDL_SensorIDVar = IntVarOf<SDL_SensorID>

typealias SDL_SensorID = Sint32

typealias SDL_TimerCallbackVar = CPointerVarOf<SDL_TimerCallback>

typealias SDL_TimerCallback = CPointer<CFunction<(Uint32, COpaquePointer?) -> Uint32>>

typealias SDL_TimerIDVar = IntVarOf<SDL_TimerID>

typealias SDL_TimerID = Int


val SDL_FALSE: SDL_bool get() = 0u

val SDL_TRUE: SDL_bool get() = 1u

typealias SDL_boolVar = UIntVarOf<SDL_bool>

typealias SDL_bool = UInt


val SDL_AUDIO_STOPPED: SDL_AudioStatus get() = 0u

val SDL_AUDIO_PLAYING: SDL_AudioStatus get() = 1u

val SDL_AUDIO_PAUSED: SDL_AudioStatus get() = 2u

typealias SDL_AudioStatusVar = UIntVarOf<SDL_AudioStatus>

typealias SDL_AudioStatus = UInt

// enum (anonymous at /usr/local/include/SDL2/SDL_pixels.h:51:1):

val SDL_PIXELTYPE_UNKNOWN: UInt get() = 0u

val SDL_PIXELTYPE_INDEX1: UInt get() = 1u

val SDL_PIXELTYPE_INDEX4: UInt get() = 2u

val SDL_PIXELTYPE_INDEX8: UInt get() = 3u

val SDL_PIXELTYPE_PACKED8: UInt get() = 4u

val SDL_PIXELTYPE_PACKED16: UInt get() = 5u

val SDL_PIXELTYPE_PACKED32: UInt get() = 6u

val SDL_PIXELTYPE_ARRAYU8: UInt get() = 7u

val SDL_PIXELTYPE_ARRAYU16: UInt get() = 8u

val SDL_PIXELTYPE_ARRAYU32: UInt get() = 9u

val SDL_PIXELTYPE_ARRAYF16: UInt get() = 10u

val SDL_PIXELTYPE_ARRAYF32: UInt get() = 11u

// enum (anonymous at /usr/local/include/SDL2/SDL_pixels.h:68:1):

val SDL_BITMAPORDER_NONE: UInt get() = 0u

val SDL_BITMAPORDER_4321: UInt get() = 1u

val SDL_BITMAPORDER_1234: UInt get() = 2u

// enum (anonymous at /usr/local/include/SDL2/SDL_pixels.h:76:1):

val SDL_PACKEDORDER_NONE: UInt get() = 0u

val SDL_PACKEDORDER_XRGB: UInt get() = 1u

val SDL_PACKEDORDER_RGBX: UInt get() = 2u

val SDL_PACKEDORDER_ARGB: UInt get() = 3u

val SDL_PACKEDORDER_RGBA: UInt get() = 4u

val SDL_PACKEDORDER_XBGR: UInt get() = 5u

val SDL_PACKEDORDER_BGRX: UInt get() = 6u

val SDL_PACKEDORDER_ABGR: UInt get() = 7u

val SDL_PACKEDORDER_BGRA: UInt get() = 8u

// enum (anonymous at /usr/local/include/SDL2/SDL_pixels.h:92:1):

val SDL_ARRAYORDER_NONE: UInt get() = 0u

val SDL_ARRAYORDER_RGB: UInt get() = 1u

val SDL_ARRAYORDER_RGBA: UInt get() = 2u

val SDL_ARRAYORDER_ARGB: UInt get() = 3u

val SDL_ARRAYORDER_BGR: UInt get() = 4u

val SDL_ARRAYORDER_BGRA: UInt get() = 5u

val SDL_ARRAYORDER_ABGR: UInt get() = 6u

// enum (anonymous at /usr/local/include/SDL2/SDL_pixels.h:104:1):

val SDL_PACKEDLAYOUT_NONE: UInt get() = 0u

val SDL_PACKEDLAYOUT_332: UInt get() = 1u

val SDL_PACKEDLAYOUT_4444: UInt get() = 2u

val SDL_PACKEDLAYOUT_1555: UInt get() = 3u

val SDL_PACKEDLAYOUT_5551: UInt get() = 4u

val SDL_PACKEDLAYOUT_565: UInt get() = 5u

val SDL_PACKEDLAYOUT_8888: UInt get() = 6u

val SDL_PACKEDLAYOUT_2101010: UInt get() = 7u

val SDL_PACKEDLAYOUT_1010102: UInt get() = 8u


val SDL_PIXELFORMAT_UNKNOWN: SDL_PixelFormatEnum get() = 0u

val SDL_PIXELFORMAT_INDEX1LSB: SDL_PixelFormatEnum get() = 286261504u

val SDL_PIXELFORMAT_INDEX1MSB: SDL_PixelFormatEnum get() = 287310080u

val SDL_PIXELFORMAT_INDEX4LSB: SDL_PixelFormatEnum get() = 303039488u

val SDL_PIXELFORMAT_INDEX4MSB: SDL_PixelFormatEnum get() = 304088064u

val SDL_PIXELFORMAT_INDEX8: SDL_PixelFormatEnum get() = 318769153u

val SDL_PIXELFORMAT_RGB332: SDL_PixelFormatEnum get() = 336660481u

val SDL_PIXELFORMAT_RGB444: SDL_PixelFormatEnum get() = 353504258u

val SDL_PIXELFORMAT_RGB555: SDL_PixelFormatEnum get() = 353570562u

val SDL_PIXELFORMAT_BGR555: SDL_PixelFormatEnum get() = 357764866u

val SDL_PIXELFORMAT_ARGB4444: SDL_PixelFormatEnum get() = 355602434u

val SDL_PIXELFORMAT_RGBA4444: SDL_PixelFormatEnum get() = 356651010u

val SDL_PIXELFORMAT_ABGR4444: SDL_PixelFormatEnum get() = 359796738u

val SDL_PIXELFORMAT_BGRA4444: SDL_PixelFormatEnum get() = 360845314u

val SDL_PIXELFORMAT_ARGB1555: SDL_PixelFormatEnum get() = 355667970u

val SDL_PIXELFORMAT_RGBA5551: SDL_PixelFormatEnum get() = 356782082u

val SDL_PIXELFORMAT_ABGR1555: SDL_PixelFormatEnum get() = 359862274u

val SDL_PIXELFORMAT_BGRA5551: SDL_PixelFormatEnum get() = 360976386u

val SDL_PIXELFORMAT_RGB565: SDL_PixelFormatEnum get() = 353701890u

val SDL_PIXELFORMAT_BGR565: SDL_PixelFormatEnum get() = 357896194u

val SDL_PIXELFORMAT_RGB24: SDL_PixelFormatEnum get() = 386930691u

val SDL_PIXELFORMAT_BGR24: SDL_PixelFormatEnum get() = 390076419u

val SDL_PIXELFORMAT_RGB888: SDL_PixelFormatEnum get() = 370546692u

val SDL_PIXELFORMAT_RGBX8888: SDL_PixelFormatEnum get() = 371595268u

val SDL_PIXELFORMAT_BGR888: SDL_PixelFormatEnum get() = 374740996u

val SDL_PIXELFORMAT_BGRX8888: SDL_PixelFormatEnum get() = 375789572u

val SDL_PIXELFORMAT_ARGB8888: SDL_PixelFormatEnum get() = 372645892u

val SDL_PIXELFORMAT_RGBA8888: SDL_PixelFormatEnum get() = 373694468u

val SDL_PIXELFORMAT_ABGR8888: SDL_PixelFormatEnum get() = 376840196u

val SDL_PIXELFORMAT_BGRA8888: SDL_PixelFormatEnum get() = 377888772u

val SDL_PIXELFORMAT_ARGB2101010: SDL_PixelFormatEnum get() = 372711428u

val SDL_PIXELFORMAT_RGBA32: SDL_PixelFormatEnum get() = 376840196u

val SDL_PIXELFORMAT_ARGB32: SDL_PixelFormatEnum get() = 377888772u

val SDL_PIXELFORMAT_BGRA32: SDL_PixelFormatEnum get() = 372645892u

val SDL_PIXELFORMAT_ABGR32: SDL_PixelFormatEnum get() = 373694468u

val SDL_PIXELFORMAT_YV12: SDL_PixelFormatEnum get() = 842094169u

val SDL_PIXELFORMAT_IYUV: SDL_PixelFormatEnum get() = 1448433993u

val SDL_PIXELFORMAT_YUY2: SDL_PixelFormatEnum get() = 844715353u

val SDL_PIXELFORMAT_UYVY: SDL_PixelFormatEnum get() = 1498831189u

val SDL_PIXELFORMAT_YVYU: SDL_PixelFormatEnum get() = 1431918169u

val SDL_PIXELFORMAT_NV12: SDL_PixelFormatEnum get() = 842094158u

val SDL_PIXELFORMAT_NV21: SDL_PixelFormatEnum get() = 825382478u

val SDL_PIXELFORMAT_EXTERNAL_OES: SDL_PixelFormatEnum get() = 542328143u

typealias SDL_PixelFormatEnumVar = UIntVarOf<SDL_PixelFormatEnum>

typealias SDL_PixelFormatEnum = UInt


val SDL_BLENDMODE_NONE: SDL_BlendMode get() = 0u

val SDL_BLENDMODE_BLEND: SDL_BlendMode get() = 1u

val SDL_BLENDMODE_ADD: SDL_BlendMode get() = 2u

val SDL_BLENDMODE_MOD: SDL_BlendMode get() = 4u

val SDL_BLENDMODE_INVALID: SDL_BlendMode get() = 2147483647u

typealias SDL_BlendModeVar = UIntVarOf<SDL_BlendMode>

typealias SDL_BlendMode = UInt


val SDL_BLENDOPERATION_ADD: SDL_BlendOperation get() = 1u

val SDL_BLENDOPERATION_SUBTRACT: SDL_BlendOperation get() = 2u

val SDL_BLENDOPERATION_REV_SUBTRACT: SDL_BlendOperation get() = 3u

val SDL_BLENDOPERATION_MINIMUM: SDL_BlendOperation get() = 4u

val SDL_BLENDOPERATION_MAXIMUM: SDL_BlendOperation get() = 5u

typealias SDL_BlendOperationVar = UIntVarOf<SDL_BlendOperation>

typealias SDL_BlendOperation = UInt


val SDL_BLENDFACTOR_ZERO: SDL_BlendFactor get() = 1u

val SDL_BLENDFACTOR_ONE: SDL_BlendFactor get() = 2u

val SDL_BLENDFACTOR_SRC_COLOR: SDL_BlendFactor get() = 3u

val SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR: SDL_BlendFactor get() = 4u

val SDL_BLENDFACTOR_SRC_ALPHA: SDL_BlendFactor get() = 5u

val SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA: SDL_BlendFactor get() = 6u

val SDL_BLENDFACTOR_DST_COLOR: SDL_BlendFactor get() = 7u

val SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR: SDL_BlendFactor get() = 8u

val SDL_BLENDFACTOR_DST_ALPHA: SDL_BlendFactor get() = 9u

val SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA: SDL_BlendFactor get() = 10u

typealias SDL_BlendFactorVar = UIntVarOf<SDL_BlendFactor>

typealias SDL_BlendFactor = UInt


val SDL_WINDOW_FULLSCREEN: SDL_WindowFlags get() = 1u

val SDL_WINDOW_OPENGL: SDL_WindowFlags get() = 2u

val SDL_WINDOW_SHOWN: SDL_WindowFlags get() = 4u

val SDL_WINDOW_HIDDEN: SDL_WindowFlags get() = 8u

val SDL_WINDOW_BORDERLESS: SDL_WindowFlags get() = 16u

val SDL_WINDOW_RESIZABLE: SDL_WindowFlags get() = 32u

val SDL_WINDOW_MINIMIZED: SDL_WindowFlags get() = 64u

val SDL_WINDOW_MAXIMIZED: SDL_WindowFlags get() = 128u

val SDL_WINDOW_INPUT_GRABBED: SDL_WindowFlags get() = 256u

val SDL_WINDOW_INPUT_FOCUS: SDL_WindowFlags get() = 512u

val SDL_WINDOW_MOUSE_FOCUS: SDL_WindowFlags get() = 1024u

val SDL_WINDOW_FULLSCREEN_DESKTOP: SDL_WindowFlags get() = 4097u

val SDL_WINDOW_FOREIGN: SDL_WindowFlags get() = 2048u

val SDL_WINDOW_ALLOW_HIGHDPI: SDL_WindowFlags get() = 8192u

val SDL_WINDOW_MOUSE_CAPTURE: SDL_WindowFlags get() = 16384u

val SDL_WINDOW_ALWAYS_ON_TOP: SDL_WindowFlags get() = 32768u

val SDL_WINDOW_SKIP_TASKBAR: SDL_WindowFlags get() = 65536u

val SDL_WINDOW_UTILITY: SDL_WindowFlags get() = 131072u

val SDL_WINDOW_TOOLTIP: SDL_WindowFlags get() = 262144u

val SDL_WINDOW_POPUP_MENU: SDL_WindowFlags get() = 524288u

val SDL_WINDOW_VULKAN: SDL_WindowFlags get() = 268435456u

typealias SDL_WindowFlagsVar = UIntVarOf<SDL_WindowFlags>

typealias SDL_WindowFlags = UInt


val SDL_GL_CONTEXT_PROFILE_CORE: SDL_GLprofile get() = 1u

val SDL_GL_CONTEXT_PROFILE_COMPATIBILITY: SDL_GLprofile get() = 2u

val SDL_GL_CONTEXT_PROFILE_ES: SDL_GLprofile get() = 4u

typealias SDL_GLprofileVar = UIntVarOf<SDL_GLprofile>

typealias SDL_GLprofile = UInt


val SDL_GL_CONTEXT_DEBUG_FLAG: SDL_GLcontextFlag get() = 1u

val SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG: SDL_GLcontextFlag get() = 2u

val SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG: SDL_GLcontextFlag get() = 4u

val SDL_GL_CONTEXT_RESET_ISOLATION_FLAG: SDL_GLcontextFlag get() = 8u

typealias SDL_GLcontextFlagVar = UIntVarOf<SDL_GLcontextFlag>

typealias SDL_GLcontextFlag = UInt


val SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE: SDL_GLcontextReleaseFlag get() = 0u

val SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH: SDL_GLcontextReleaseFlag get() = 1u

typealias SDL_GLcontextReleaseFlagVar = UIntVarOf<SDL_GLcontextReleaseFlag>

typealias SDL_GLcontextReleaseFlag = UInt


val SDL_GL_CONTEXT_RESET_NO_NOTIFICATION: SDL_GLContextResetNotification get() = 0u

val SDL_GL_CONTEXT_RESET_LOSE_CONTEXT: SDL_GLContextResetNotification get() = 1u

typealias SDL_GLContextResetNotificationVar = UIntVarOf<SDL_GLContextResetNotification>

typealias SDL_GLContextResetNotification = UInt


val SDL_SCANCODE_UNKNOWN: SDL_Scancode get() = 0u

val SDL_SCANCODE_A: SDL_Scancode get() = 4u

val SDL_SCANCODE_B: SDL_Scancode get() = 5u

val SDL_SCANCODE_C: SDL_Scancode get() = 6u

val SDL_SCANCODE_D: SDL_Scancode get() = 7u

val SDL_SCANCODE_E: SDL_Scancode get() = 8u

val SDL_SCANCODE_F: SDL_Scancode get() = 9u

val SDL_SCANCODE_G: SDL_Scancode get() = 10u

val SDL_SCANCODE_H: SDL_Scancode get() = 11u

val SDL_SCANCODE_I: SDL_Scancode get() = 12u

val SDL_SCANCODE_J: SDL_Scancode get() = 13u

val SDL_SCANCODE_K: SDL_Scancode get() = 14u

val SDL_SCANCODE_L: SDL_Scancode get() = 15u

val SDL_SCANCODE_M: SDL_Scancode get() = 16u

val SDL_SCANCODE_N: SDL_Scancode get() = 17u

val SDL_SCANCODE_O: SDL_Scancode get() = 18u

val SDL_SCANCODE_P: SDL_Scancode get() = 19u

val SDL_SCANCODE_Q: SDL_Scancode get() = 20u

val SDL_SCANCODE_R: SDL_Scancode get() = 21u

val SDL_SCANCODE_S: SDL_Scancode get() = 22u

val SDL_SCANCODE_T: SDL_Scancode get() = 23u

val SDL_SCANCODE_U: SDL_Scancode get() = 24u

val SDL_SCANCODE_V: SDL_Scancode get() = 25u

val SDL_SCANCODE_W: SDL_Scancode get() = 26u

val SDL_SCANCODE_X: SDL_Scancode get() = 27u

val SDL_SCANCODE_Y: SDL_Scancode get() = 28u

val SDL_SCANCODE_Z: SDL_Scancode get() = 29u

val SDL_SCANCODE_1: SDL_Scancode get() = 30u

val SDL_SCANCODE_2: SDL_Scancode get() = 31u

val SDL_SCANCODE_3: SDL_Scancode get() = 32u

val SDL_SCANCODE_4: SDL_Scancode get() = 33u

val SDL_SCANCODE_5: SDL_Scancode get() = 34u

val SDL_SCANCODE_6: SDL_Scancode get() = 35u

val SDL_SCANCODE_7: SDL_Scancode get() = 36u

val SDL_SCANCODE_8: SDL_Scancode get() = 37u

val SDL_SCANCODE_9: SDL_Scancode get() = 38u

val SDL_SCANCODE_0: SDL_Scancode get() = 39u

val SDL_SCANCODE_RETURN: SDL_Scancode get() = 40u

val SDL_SCANCODE_ESCAPE: SDL_Scancode get() = 41u

val SDL_SCANCODE_BACKSPACE: SDL_Scancode get() = 42u

val SDL_SCANCODE_TAB: SDL_Scancode get() = 43u

val SDL_SCANCODE_SPACE: SDL_Scancode get() = 44u

val SDL_SCANCODE_MINUS: SDL_Scancode get() = 45u

val SDL_SCANCODE_EQUALS: SDL_Scancode get() = 46u

val SDL_SCANCODE_LEFTBRACKET: SDL_Scancode get() = 47u

val SDL_SCANCODE_RIGHTBRACKET: SDL_Scancode get() = 48u

val SDL_SCANCODE_BACKSLASH: SDL_Scancode get() = 49u

val SDL_SCANCODE_NONUSHASH: SDL_Scancode get() = 50u

val SDL_SCANCODE_SEMICOLON: SDL_Scancode get() = 51u

val SDL_SCANCODE_APOSTROPHE: SDL_Scancode get() = 52u

val SDL_SCANCODE_GRAVE: SDL_Scancode get() = 53u

val SDL_SCANCODE_COMMA: SDL_Scancode get() = 54u

val SDL_SCANCODE_PERIOD: SDL_Scancode get() = 55u

val SDL_SCANCODE_SLASH: SDL_Scancode get() = 56u

val SDL_SCANCODE_CAPSLOCK: SDL_Scancode get() = 57u

val SDL_SCANCODE_F1: SDL_Scancode get() = 58u

val SDL_SCANCODE_F2: SDL_Scancode get() = 59u

val SDL_SCANCODE_F3: SDL_Scancode get() = 60u

val SDL_SCANCODE_F4: SDL_Scancode get() = 61u

val SDL_SCANCODE_F5: SDL_Scancode get() = 62u

val SDL_SCANCODE_F6: SDL_Scancode get() = 63u

val SDL_SCANCODE_F7: SDL_Scancode get() = 64u

val SDL_SCANCODE_F8: SDL_Scancode get() = 65u

val SDL_SCANCODE_F9: SDL_Scancode get() = 66u

val SDL_SCANCODE_F10: SDL_Scancode get() = 67u

val SDL_SCANCODE_F11: SDL_Scancode get() = 68u

val SDL_SCANCODE_F12: SDL_Scancode get() = 69u

val SDL_SCANCODE_PRINTSCREEN: SDL_Scancode get() = 70u

val SDL_SCANCODE_SCROLLLOCK: SDL_Scancode get() = 71u

val SDL_SCANCODE_PAUSE: SDL_Scancode get() = 72u

val SDL_SCANCODE_INSERT: SDL_Scancode get() = 73u

val SDL_SCANCODE_HOME: SDL_Scancode get() = 74u

val SDL_SCANCODE_PAGEUP: SDL_Scancode get() = 75u

val SDL_SCANCODE_DELETE: SDL_Scancode get() = 76u

val SDL_SCANCODE_END: SDL_Scancode get() = 77u

val SDL_SCANCODE_PAGEDOWN: SDL_Scancode get() = 78u

val SDL_SCANCODE_RIGHT: SDL_Scancode get() = 79u

val SDL_SCANCODE_LEFT: SDL_Scancode get() = 80u

val SDL_SCANCODE_DOWN: SDL_Scancode get() = 81u

val SDL_SCANCODE_UP: SDL_Scancode get() = 82u

val SDL_SCANCODE_NUMLOCKCLEAR: SDL_Scancode get() = 83u

val SDL_SCANCODE_KP_DIVIDE: SDL_Scancode get() = 84u

val SDL_SCANCODE_KP_MULTIPLY: SDL_Scancode get() = 85u

val SDL_SCANCODE_KP_MINUS: SDL_Scancode get() = 86u

val SDL_SCANCODE_KP_PLUS: SDL_Scancode get() = 87u

val SDL_SCANCODE_KP_ENTER: SDL_Scancode get() = 88u

val SDL_SCANCODE_KP_1: SDL_Scancode get() = 89u

val SDL_SCANCODE_KP_2: SDL_Scancode get() = 90u

val SDL_SCANCODE_KP_3: SDL_Scancode get() = 91u

val SDL_SCANCODE_KP_4: SDL_Scancode get() = 92u

val SDL_SCANCODE_KP_5: SDL_Scancode get() = 93u

val SDL_SCANCODE_KP_6: SDL_Scancode get() = 94u

val SDL_SCANCODE_KP_7: SDL_Scancode get() = 95u

val SDL_SCANCODE_KP_8: SDL_Scancode get() = 96u

val SDL_SCANCODE_KP_9: SDL_Scancode get() = 97u

val SDL_SCANCODE_KP_0: SDL_Scancode get() = 98u

val SDL_SCANCODE_KP_PERIOD: SDL_Scancode get() = 99u

val SDL_SCANCODE_NONUSBACKSLASH: SDL_Scancode get() = 100u

val SDL_SCANCODE_APPLICATION: SDL_Scancode get() = 101u

val SDL_SCANCODE_POWER: SDL_Scancode get() = 102u

val SDL_SCANCODE_KP_EQUALS: SDL_Scancode get() = 103u

val SDL_SCANCODE_F13: SDL_Scancode get() = 104u

val SDL_SCANCODE_F14: SDL_Scancode get() = 105u

val SDL_SCANCODE_F15: SDL_Scancode get() = 106u

val SDL_SCANCODE_F16: SDL_Scancode get() = 107u

val SDL_SCANCODE_F17: SDL_Scancode get() = 108u

val SDL_SCANCODE_F18: SDL_Scancode get() = 109u

val SDL_SCANCODE_F19: SDL_Scancode get() = 110u

val SDL_SCANCODE_F20: SDL_Scancode get() = 111u

val SDL_SCANCODE_F21: SDL_Scancode get() = 112u

val SDL_SCANCODE_F22: SDL_Scancode get() = 113u

val SDL_SCANCODE_F23: SDL_Scancode get() = 114u

val SDL_SCANCODE_F24: SDL_Scancode get() = 115u

val SDL_SCANCODE_EXECUTE: SDL_Scancode get() = 116u

val SDL_SCANCODE_HELP: SDL_Scancode get() = 117u

val SDL_SCANCODE_MENU: SDL_Scancode get() = 118u

val SDL_SCANCODE_SELECT: SDL_Scancode get() = 119u

val SDL_SCANCODE_STOP: SDL_Scancode get() = 120u

val SDL_SCANCODE_AGAIN: SDL_Scancode get() = 121u

val SDL_SCANCODE_UNDO: SDL_Scancode get() = 122u

val SDL_SCANCODE_CUT: SDL_Scancode get() = 123u

val SDL_SCANCODE_COPY: SDL_Scancode get() = 124u

val SDL_SCANCODE_PASTE: SDL_Scancode get() = 125u

val SDL_SCANCODE_FIND: SDL_Scancode get() = 126u

val SDL_SCANCODE_MUTE: SDL_Scancode get() = 127u

val SDL_SCANCODE_VOLUMEUP: SDL_Scancode get() = 128u

val SDL_SCANCODE_VOLUMEDOWN: SDL_Scancode get() = 129u

val SDL_SCANCODE_KP_COMMA: SDL_Scancode get() = 133u

val SDL_SCANCODE_KP_EQUALSAS400: SDL_Scancode get() = 134u

val SDL_SCANCODE_INTERNATIONAL1: SDL_Scancode get() = 135u

val SDL_SCANCODE_INTERNATIONAL2: SDL_Scancode get() = 136u

val SDL_SCANCODE_INTERNATIONAL3: SDL_Scancode get() = 137u

val SDL_SCANCODE_INTERNATIONAL4: SDL_Scancode get() = 138u

val SDL_SCANCODE_INTERNATIONAL5: SDL_Scancode get() = 139u

val SDL_SCANCODE_INTERNATIONAL6: SDL_Scancode get() = 140u

val SDL_SCANCODE_INTERNATIONAL7: SDL_Scancode get() = 141u

val SDL_SCANCODE_INTERNATIONAL8: SDL_Scancode get() = 142u

val SDL_SCANCODE_INTERNATIONAL9: SDL_Scancode get() = 143u

val SDL_SCANCODE_LANG1: SDL_Scancode get() = 144u

val SDL_SCANCODE_LANG2: SDL_Scancode get() = 145u

val SDL_SCANCODE_LANG3: SDL_Scancode get() = 146u

val SDL_SCANCODE_LANG4: SDL_Scancode get() = 147u

val SDL_SCANCODE_LANG5: SDL_Scancode get() = 148u

val SDL_SCANCODE_LANG6: SDL_Scancode get() = 149u

val SDL_SCANCODE_LANG7: SDL_Scancode get() = 150u

val SDL_SCANCODE_LANG8: SDL_Scancode get() = 151u

val SDL_SCANCODE_LANG9: SDL_Scancode get() = 152u

val SDL_SCANCODE_ALTERASE: SDL_Scancode get() = 153u

val SDL_SCANCODE_SYSREQ: SDL_Scancode get() = 154u

val SDL_SCANCODE_CANCEL: SDL_Scancode get() = 155u

val SDL_SCANCODE_CLEAR: SDL_Scancode get() = 156u

val SDL_SCANCODE_PRIOR: SDL_Scancode get() = 157u

val SDL_SCANCODE_RETURN2: SDL_Scancode get() = 158u

val SDL_SCANCODE_SEPARATOR: SDL_Scancode get() = 159u

val SDL_SCANCODE_OUT: SDL_Scancode get() = 160u

val SDL_SCANCODE_OPER: SDL_Scancode get() = 161u

val SDL_SCANCODE_CLEARAGAIN: SDL_Scancode get() = 162u

val SDL_SCANCODE_CRSEL: SDL_Scancode get() = 163u

val SDL_SCANCODE_EXSEL: SDL_Scancode get() = 164u

val SDL_SCANCODE_KP_00: SDL_Scancode get() = 176u

val SDL_SCANCODE_KP_000: SDL_Scancode get() = 177u

val SDL_SCANCODE_THOUSANDSSEPARATOR: SDL_Scancode get() = 178u

val SDL_SCANCODE_DECIMALSEPARATOR: SDL_Scancode get() = 179u

val SDL_SCANCODE_CURRENCYUNIT: SDL_Scancode get() = 180u

val SDL_SCANCODE_CURRENCYSUBUNIT: SDL_Scancode get() = 181u

val SDL_SCANCODE_KP_LEFTPAREN: SDL_Scancode get() = 182u

val SDL_SCANCODE_KP_RIGHTPAREN: SDL_Scancode get() = 183u

val SDL_SCANCODE_KP_LEFTBRACE: SDL_Scancode get() = 184u

val SDL_SCANCODE_KP_RIGHTBRACE: SDL_Scancode get() = 185u

val SDL_SCANCODE_KP_TAB: SDL_Scancode get() = 186u

val SDL_SCANCODE_KP_BACKSPACE: SDL_Scancode get() = 187u

val SDL_SCANCODE_KP_A: SDL_Scancode get() = 188u

val SDL_SCANCODE_KP_B: SDL_Scancode get() = 189u

val SDL_SCANCODE_KP_C: SDL_Scancode get() = 190u

val SDL_SCANCODE_KP_D: SDL_Scancode get() = 191u

val SDL_SCANCODE_KP_E: SDL_Scancode get() = 192u

val SDL_SCANCODE_KP_F: SDL_Scancode get() = 193u

val SDL_SCANCODE_KP_XOR: SDL_Scancode get() = 194u

val SDL_SCANCODE_KP_POWER: SDL_Scancode get() = 195u

val SDL_SCANCODE_KP_PERCENT: SDL_Scancode get() = 196u

val SDL_SCANCODE_KP_LESS: SDL_Scancode get() = 197u

val SDL_SCANCODE_KP_GREATER: SDL_Scancode get() = 198u

val SDL_SCANCODE_KP_AMPERSAND: SDL_Scancode get() = 199u

val SDL_SCANCODE_KP_DBLAMPERSAND: SDL_Scancode get() = 200u

val SDL_SCANCODE_KP_VERTICALBAR: SDL_Scancode get() = 201u

val SDL_SCANCODE_KP_DBLVERTICALBAR: SDL_Scancode get() = 202u

val SDL_SCANCODE_KP_COLON: SDL_Scancode get() = 203u

val SDL_SCANCODE_KP_HASH: SDL_Scancode get() = 204u

val SDL_SCANCODE_KP_SPACE: SDL_Scancode get() = 205u

val SDL_SCANCODE_KP_AT: SDL_Scancode get() = 206u

val SDL_SCANCODE_KP_EXCLAM: SDL_Scancode get() = 207u

val SDL_SCANCODE_KP_MEMSTORE: SDL_Scancode get() = 208u

val SDL_SCANCODE_KP_MEMRECALL: SDL_Scancode get() = 209u

val SDL_SCANCODE_KP_MEMCLEAR: SDL_Scancode get() = 210u

val SDL_SCANCODE_KP_MEMADD: SDL_Scancode get() = 211u

val SDL_SCANCODE_KP_MEMSUBTRACT: SDL_Scancode get() = 212u

val SDL_SCANCODE_KP_MEMMULTIPLY: SDL_Scancode get() = 213u

val SDL_SCANCODE_KP_MEMDIVIDE: SDL_Scancode get() = 214u

val SDL_SCANCODE_KP_PLUSMINUS: SDL_Scancode get() = 215u

val SDL_SCANCODE_KP_CLEAR: SDL_Scancode get() = 216u

val SDL_SCANCODE_KP_CLEARENTRY: SDL_Scancode get() = 217u

val SDL_SCANCODE_KP_BINARY: SDL_Scancode get() = 218u

val SDL_SCANCODE_KP_OCTAL: SDL_Scancode get() = 219u

val SDL_SCANCODE_KP_DECIMAL: SDL_Scancode get() = 220u

val SDL_SCANCODE_KP_HEXADECIMAL: SDL_Scancode get() = 221u

val SDL_SCANCODE_LCTRL: SDL_Scancode get() = 224u

val SDL_SCANCODE_LSHIFT: SDL_Scancode get() = 225u

val SDL_SCANCODE_LALT: SDL_Scancode get() = 226u

val SDL_SCANCODE_LGUI: SDL_Scancode get() = 227u

val SDL_SCANCODE_RCTRL: SDL_Scancode get() = 228u

val SDL_SCANCODE_RSHIFT: SDL_Scancode get() = 229u

val SDL_SCANCODE_RALT: SDL_Scancode get() = 230u

val SDL_SCANCODE_RGUI: SDL_Scancode get() = 231u

val SDL_SCANCODE_MODE: SDL_Scancode get() = 257u

val SDL_SCANCODE_AUDIONEXT: SDL_Scancode get() = 258u

val SDL_SCANCODE_AUDIOPREV: SDL_Scancode get() = 259u

val SDL_SCANCODE_AUDIOSTOP: SDL_Scancode get() = 260u

val SDL_SCANCODE_AUDIOPLAY: SDL_Scancode get() = 261u

val SDL_SCANCODE_AUDIOMUTE: SDL_Scancode get() = 262u

val SDL_SCANCODE_MEDIASELECT: SDL_Scancode get() = 263u

val SDL_SCANCODE_WWW: SDL_Scancode get() = 264u

val SDL_SCANCODE_MAIL: SDL_Scancode get() = 265u

val SDL_SCANCODE_CALCULATOR: SDL_Scancode get() = 266u

val SDL_SCANCODE_COMPUTER: SDL_Scancode get() = 267u

val SDL_SCANCODE_AC_SEARCH: SDL_Scancode get() = 268u

val SDL_SCANCODE_AC_HOME: SDL_Scancode get() = 269u

val SDL_SCANCODE_AC_BACK: SDL_Scancode get() = 270u

val SDL_SCANCODE_AC_FORWARD: SDL_Scancode get() = 271u

val SDL_SCANCODE_AC_STOP: SDL_Scancode get() = 272u

val SDL_SCANCODE_AC_REFRESH: SDL_Scancode get() = 273u

val SDL_SCANCODE_AC_BOOKMARKS: SDL_Scancode get() = 274u

val SDL_SCANCODE_BRIGHTNESSDOWN: SDL_Scancode get() = 275u

val SDL_SCANCODE_BRIGHTNESSUP: SDL_Scancode get() = 276u

val SDL_SCANCODE_DISPLAYSWITCH: SDL_Scancode get() = 277u

val SDL_SCANCODE_KBDILLUMTOGGLE: SDL_Scancode get() = 278u

val SDL_SCANCODE_KBDILLUMDOWN: SDL_Scancode get() = 279u

val SDL_SCANCODE_KBDILLUMUP: SDL_Scancode get() = 280u

val SDL_SCANCODE_EJECT: SDL_Scancode get() = 281u

val SDL_SCANCODE_SLEEP: SDL_Scancode get() = 282u

val SDL_SCANCODE_APP1: SDL_Scancode get() = 283u

val SDL_SCANCODE_APP2: SDL_Scancode get() = 284u

val SDL_SCANCODE_AUDIOREWIND: SDL_Scancode get() = 285u

val SDL_SCANCODE_AUDIOFASTFORWARD: SDL_Scancode get() = 286u

val SDL_NUM_SCANCODES: SDL_Scancode get() = 512u

typealias SDL_ScancodeVar = UIntVarOf<SDL_Scancode>

typealias SDL_Scancode = UInt

// enum (anonymous at /usr/local/include/SDL2/SDL_keycode.h:50:1):

val SDLK_UNKNOWN: UInt get() = 0u

val SDLK_RETURN: UInt get() = 13u

val SDLK_ESCAPE: UInt get() = 27u

val SDLK_BACKSPACE: UInt get() = 8u

val SDLK_TAB: UInt get() = 9u

val SDLK_SPACE: UInt get() = 32u

val SDLK_EXCLAIM: UInt get() = 33u

val SDLK_QUOTEDBL: UInt get() = 34u

val SDLK_HASH: UInt get() = 35u

val SDLK_PERCENT: UInt get() = 37u

val SDLK_DOLLAR: UInt get() = 36u

val SDLK_AMPERSAND: UInt get() = 38u

val SDLK_QUOTE: UInt get() = 39u

val SDLK_LEFTPAREN: UInt get() = 40u

val SDLK_RIGHTPAREN: UInt get() = 41u

val SDLK_ASTERISK: UInt get() = 42u

val SDLK_PLUS: UInt get() = 43u

val SDLK_COMMA: UInt get() = 44u

val SDLK_MINUS: UInt get() = 45u

val SDLK_PERIOD: UInt get() = 46u

val SDLK_SLASH: UInt get() = 47u

val SDLK_0: UInt get() = 48u

val SDLK_1: UInt get() = 49u

val SDLK_2: UInt get() = 50u

val SDLK_3: UInt get() = 51u

val SDLK_4: UInt get() = 52u

val SDLK_5: UInt get() = 53u

val SDLK_6: UInt get() = 54u

val SDLK_7: UInt get() = 55u

val SDLK_8: UInt get() = 56u

val SDLK_9: UInt get() = 57u

val SDLK_COLON: UInt get() = 58u

val SDLK_SEMICOLON: UInt get() = 59u

val SDLK_LESS: UInt get() = 60u

val SDLK_EQUALS: UInt get() = 61u

val SDLK_GREATER: UInt get() = 62u

val SDLK_QUESTION: UInt get() = 63u

val SDLK_AT: UInt get() = 64u

val SDLK_LEFTBRACKET: UInt get() = 91u

val SDLK_BACKSLASH: UInt get() = 92u

val SDLK_RIGHTBRACKET: UInt get() = 93u

val SDLK_CARET: UInt get() = 94u

val SDLK_UNDERSCORE: UInt get() = 95u

val SDLK_BACKQUOTE: UInt get() = 96u

val SDLK_a: UInt get() = 97u

val SDLK_b: UInt get() = 98u

val SDLK_c: UInt get() = 99u

val SDLK_d: UInt get() = 100u

val SDLK_e: UInt get() = 101u

val SDLK_f: UInt get() = 102u

val SDLK_g: UInt get() = 103u

val SDLK_h: UInt get() = 104u

val SDLK_i: UInt get() = 105u

val SDLK_j: UInt get() = 106u

val SDLK_k: UInt get() = 107u

val SDLK_l: UInt get() = 108u

val SDLK_m: UInt get() = 109u

val SDLK_n: UInt get() = 110u

val SDLK_o: UInt get() = 111u

val SDLK_p: UInt get() = 112u

val SDLK_q: UInt get() = 113u

val SDLK_r: UInt get() = 114u

val SDLK_s: UInt get() = 115u

val SDLK_t: UInt get() = 116u

val SDLK_u: UInt get() = 117u

val SDLK_v: UInt get() = 118u

val SDLK_w: UInt get() = 119u

val SDLK_x: UInt get() = 120u

val SDLK_y: UInt get() = 121u

val SDLK_z: UInt get() = 122u

val SDLK_CAPSLOCK: UInt get() = 1073741881u

val SDLK_F1: UInt get() = 1073741882u

val SDLK_F2: UInt get() = 1073741883u

val SDLK_F3: UInt get() = 1073741884u

val SDLK_F4: UInt get() = 1073741885u

val SDLK_F5: UInt get() = 1073741886u

val SDLK_F6: UInt get() = 1073741887u

val SDLK_F7: UInt get() = 1073741888u

val SDLK_F8: UInt get() = 1073741889u

val SDLK_F9: UInt get() = 1073741890u

val SDLK_F10: UInt get() = 1073741891u

val SDLK_F11: UInt get() = 1073741892u

val SDLK_F12: UInt get() = 1073741893u

val SDLK_PRINTSCREEN: UInt get() = 1073741894u

val SDLK_SCROLLLOCK: UInt get() = 1073741895u

val SDLK_PAUSE: UInt get() = 1073741896u

val SDLK_INSERT: UInt get() = 1073741897u

val SDLK_HOME: UInt get() = 1073741898u

val SDLK_PAGEUP: UInt get() = 1073741899u

val SDLK_DELETE: UInt get() = 127u

val SDLK_END: UInt get() = 1073741901u

val SDLK_PAGEDOWN: UInt get() = 1073741902u

val SDLK_RIGHT: UInt get() = 1073741903u

val SDLK_LEFT: UInt get() = 1073741904u

val SDLK_DOWN: UInt get() = 1073741905u

val SDLK_UP: UInt get() = 1073741906u

val SDLK_NUMLOCKCLEAR: UInt get() = 1073741907u

val SDLK_KP_DIVIDE: UInt get() = 1073741908u

val SDLK_KP_MULTIPLY: UInt get() = 1073741909u

val SDLK_KP_MINUS: UInt get() = 1073741910u

val SDLK_KP_PLUS: UInt get() = 1073741911u

val SDLK_KP_ENTER: UInt get() = 1073741912u

val SDLK_KP_1: UInt get() = 1073741913u

val SDLK_KP_2: UInt get() = 1073741914u

val SDLK_KP_3: UInt get() = 1073741915u

val SDLK_KP_4: UInt get() = 1073741916u

val SDLK_KP_5: UInt get() = 1073741917u

val SDLK_KP_6: UInt get() = 1073741918u

val SDLK_KP_7: UInt get() = 1073741919u

val SDLK_KP_8: UInt get() = 1073741920u

val SDLK_KP_9: UInt get() = 1073741921u

val SDLK_KP_0: UInt get() = 1073741922u

val SDLK_KP_PERIOD: UInt get() = 1073741923u

val SDLK_APPLICATION: UInt get() = 1073741925u

val SDLK_POWER: UInt get() = 1073741926u

val SDLK_KP_EQUALS: UInt get() = 1073741927u

val SDLK_F13: UInt get() = 1073741928u

val SDLK_F14: UInt get() = 1073741929u

val SDLK_F15: UInt get() = 1073741930u

val SDLK_F16: UInt get() = 1073741931u

val SDLK_F17: UInt get() = 1073741932u

val SDLK_F18: UInt get() = 1073741933u

val SDLK_F19: UInt get() = 1073741934u

val SDLK_F20: UInt get() = 1073741935u

val SDLK_F21: UInt get() = 1073741936u

val SDLK_F22: UInt get() = 1073741937u

val SDLK_F23: UInt get() = 1073741938u

val SDLK_F24: UInt get() = 1073741939u

val SDLK_EXECUTE: UInt get() = 1073741940u

val SDLK_HELP: UInt get() = 1073741941u

val SDLK_MENU: UInt get() = 1073741942u

val SDLK_SELECT: UInt get() = 1073741943u

val SDLK_STOP: UInt get() = 1073741944u

val SDLK_AGAIN: UInt get() = 1073741945u

val SDLK_UNDO: UInt get() = 1073741946u

val SDLK_CUT: UInt get() = 1073741947u

val SDLK_COPY: UInt get() = 1073741948u

val SDLK_PASTE: UInt get() = 1073741949u

val SDLK_FIND: UInt get() = 1073741950u

val SDLK_MUTE: UInt get() = 1073741951u

val SDLK_VOLUMEUP: UInt get() = 1073741952u

val SDLK_VOLUMEDOWN: UInt get() = 1073741953u

val SDLK_KP_COMMA: UInt get() = 1073741957u

val SDLK_KP_EQUALSAS400: UInt get() = 1073741958u

val SDLK_ALTERASE: UInt get() = 1073741977u

val SDLK_SYSREQ: UInt get() = 1073741978u

val SDLK_CANCEL: UInt get() = 1073741979u

val SDLK_CLEAR: UInt get() = 1073741980u

val SDLK_PRIOR: UInt get() = 1073741981u

val SDLK_RETURN2: UInt get() = 1073741982u

val SDLK_SEPARATOR: UInt get() = 1073741983u

val SDLK_OUT: UInt get() = 1073741984u

val SDLK_OPER: UInt get() = 1073741985u

val SDLK_CLEARAGAIN: UInt get() = 1073741986u

val SDLK_CRSEL: UInt get() = 1073741987u

val SDLK_EXSEL: UInt get() = 1073741988u

val SDLK_KP_00: UInt get() = 1073742000u

val SDLK_KP_000: UInt get() = 1073742001u

val SDLK_THOUSANDSSEPARATOR: UInt get() = 1073742002u

val SDLK_DECIMALSEPARATOR: UInt get() = 1073742003u

val SDLK_CURRENCYUNIT: UInt get() = 1073742004u

val SDLK_CURRENCYSUBUNIT: UInt get() = 1073742005u

val SDLK_KP_LEFTPAREN: UInt get() = 1073742006u

val SDLK_KP_RIGHTPAREN: UInt get() = 1073742007u

val SDLK_KP_LEFTBRACE: UInt get() = 1073742008u

val SDLK_KP_RIGHTBRACE: UInt get() = 1073742009u

val SDLK_KP_TAB: UInt get() = 1073742010u

val SDLK_KP_BACKSPACE: UInt get() = 1073742011u

val SDLK_KP_A: UInt get() = 1073742012u

val SDLK_KP_B: UInt get() = 1073742013u

val SDLK_KP_C: UInt get() = 1073742014u

val SDLK_KP_D: UInt get() = 1073742015u

val SDLK_KP_E: UInt get() = 1073742016u

val SDLK_KP_F: UInt get() = 1073742017u

val SDLK_KP_XOR: UInt get() = 1073742018u

val SDLK_KP_POWER: UInt get() = 1073742019u

val SDLK_KP_PERCENT: UInt get() = 1073742020u

val SDLK_KP_LESS: UInt get() = 1073742021u

val SDLK_KP_GREATER: UInt get() = 1073742022u

val SDLK_KP_AMPERSAND: UInt get() = 1073742023u

val SDLK_KP_DBLAMPERSAND: UInt get() = 1073742024u

val SDLK_KP_VERTICALBAR: UInt get() = 1073742025u

val SDLK_KP_DBLVERTICALBAR: UInt get() = 1073742026u

val SDLK_KP_COLON: UInt get() = 1073742027u

val SDLK_KP_HASH: UInt get() = 1073742028u

val SDLK_KP_SPACE: UInt get() = 1073742029u

val SDLK_KP_AT: UInt get() = 1073742030u

val SDLK_KP_EXCLAM: UInt get() = 1073742031u

val SDLK_KP_MEMSTORE: UInt get() = 1073742032u

val SDLK_KP_MEMRECALL: UInt get() = 1073742033u

val SDLK_KP_MEMCLEAR: UInt get() = 1073742034u

val SDLK_KP_MEMADD: UInt get() = 1073742035u

val SDLK_KP_MEMSUBTRACT: UInt get() = 1073742036u

val SDLK_KP_MEMMULTIPLY: UInt get() = 1073742037u

val SDLK_KP_MEMDIVIDE: UInt get() = 1073742038u

val SDLK_KP_PLUSMINUS: UInt get() = 1073742039u

val SDLK_KP_CLEAR: UInt get() = 1073742040u

val SDLK_KP_CLEARENTRY: UInt get() = 1073742041u

val SDLK_KP_BINARY: UInt get() = 1073742042u

val SDLK_KP_OCTAL: UInt get() = 1073742043u

val SDLK_KP_DECIMAL: UInt get() = 1073742044u

val SDLK_KP_HEXADECIMAL: UInt get() = 1073742045u

val SDLK_LCTRL: UInt get() = 1073742048u

val SDLK_LSHIFT: UInt get() = 1073742049u

val SDLK_LALT: UInt get() = 1073742050u

val SDLK_LGUI: UInt get() = 1073742051u

val SDLK_RCTRL: UInt get() = 1073742052u

val SDLK_RSHIFT: UInt get() = 1073742053u

val SDLK_RALT: UInt get() = 1073742054u

val SDLK_RGUI: UInt get() = 1073742055u

val SDLK_MODE: UInt get() = 1073742081u

val SDLK_AUDIONEXT: UInt get() = 1073742082u

val SDLK_AUDIOPREV: UInt get() = 1073742083u

val SDLK_AUDIOSTOP: UInt get() = 1073742084u

val SDLK_AUDIOPLAY: UInt get() = 1073742085u

val SDLK_AUDIOMUTE: UInt get() = 1073742086u

val SDLK_MEDIASELECT: UInt get() = 1073742087u

val SDLK_WWW: UInt get() = 1073742088u

val SDLK_MAIL: UInt get() = 1073742089u

val SDLK_CALCULATOR: UInt get() = 1073742090u

val SDLK_COMPUTER: UInt get() = 1073742091u

val SDLK_AC_SEARCH: UInt get() = 1073742092u

val SDLK_AC_HOME: UInt get() = 1073742093u

val SDLK_AC_BACK: UInt get() = 1073742094u

val SDLK_AC_FORWARD: UInt get() = 1073742095u

val SDLK_AC_STOP: UInt get() = 1073742096u

val SDLK_AC_REFRESH: UInt get() = 1073742097u

val SDLK_AC_BOOKMARKS: UInt get() = 1073742098u

val SDLK_BRIGHTNESSDOWN: UInt get() = 1073742099u

val SDLK_BRIGHTNESSUP: UInt get() = 1073742100u

val SDLK_DISPLAYSWITCH: UInt get() = 1073742101u

val SDLK_KBDILLUMTOGGLE: UInt get() = 1073742102u

val SDLK_KBDILLUMDOWN: UInt get() = 1073742103u

val SDLK_KBDILLUMUP: UInt get() = 1073742104u

val SDLK_EJECT: UInt get() = 1073742105u

val SDLK_SLEEP: UInt get() = 1073742106u

val SDLK_APP1: UInt get() = 1073742107u

val SDLK_APP2: UInt get() = 1073742108u

val SDLK_AUDIOREWIND: UInt get() = 1073742109u

val SDLK_AUDIOFASTFORWARD: UInt get() = 1073742110u


val KMOD_NONE: SDL_Keymod get() = 0u

val KMOD_LSHIFT: SDL_Keymod get() = 1u

val KMOD_RSHIFT: SDL_Keymod get() = 2u

val KMOD_LCTRL: SDL_Keymod get() = 64u

val KMOD_RCTRL: SDL_Keymod get() = 128u

val KMOD_LALT: SDL_Keymod get() = 256u

val KMOD_RALT: SDL_Keymod get() = 512u

val KMOD_LGUI: SDL_Keymod get() = 1024u

val KMOD_RGUI: SDL_Keymod get() = 2048u

val KMOD_NUM: SDL_Keymod get() = 4096u

val KMOD_CAPS: SDL_Keymod get() = 8192u

val KMOD_MODE: SDL_Keymod get() = 16384u

val KMOD_RESERVED: SDL_Keymod get() = 32768u

typealias SDL_KeymodVar = UIntVarOf<SDL_Keymod>

typealias SDL_Keymod = UInt


val SDL_JOYSTICK_POWER_UNKNOWN: SDL_JoystickPowerLevel get() = -1

val SDL_JOYSTICK_POWER_EMPTY: SDL_JoystickPowerLevel get() = 0

val SDL_JOYSTICK_POWER_LOW: SDL_JoystickPowerLevel get() = 1

val SDL_JOYSTICK_POWER_MEDIUM: SDL_JoystickPowerLevel get() = 2

val SDL_JOYSTICK_POWER_FULL: SDL_JoystickPowerLevel get() = 3

val SDL_JOYSTICK_POWER_WIRED: SDL_JoystickPowerLevel get() = 4

val SDL_JOYSTICK_POWER_MAX: SDL_JoystickPowerLevel get() = 5

typealias SDL_JoystickPowerLevelVar = IntVarOf<SDL_JoystickPowerLevel>

typealias SDL_JoystickPowerLevel = Int


val SDL_CONTROLLER_BINDTYPE_NONE: SDL_GameControllerBindType get() = 0u

val SDL_CONTROLLER_BINDTYPE_BUTTON: SDL_GameControllerBindType get() = 1u

val SDL_CONTROLLER_BINDTYPE_AXIS: SDL_GameControllerBindType get() = 2u

val SDL_CONTROLLER_BINDTYPE_HAT: SDL_GameControllerBindType get() = 3u

typealias SDL_GameControllerBindTypeVar = UIntVarOf<SDL_GameControllerBindType>

typealias SDL_GameControllerBindType = UInt


val SDL_CONTROLLER_AXIS_INVALID: SDL_GameControllerAxis get() = -1

val SDL_CONTROLLER_AXIS_LEFTX: SDL_GameControllerAxis get() = 0

val SDL_CONTROLLER_AXIS_LEFTY: SDL_GameControllerAxis get() = 1

val SDL_CONTROLLER_AXIS_RIGHTX: SDL_GameControllerAxis get() = 2

val SDL_CONTROLLER_AXIS_RIGHTY: SDL_GameControllerAxis get() = 3

val SDL_CONTROLLER_AXIS_TRIGGERLEFT: SDL_GameControllerAxis get() = 4

val SDL_CONTROLLER_AXIS_TRIGGERRIGHT: SDL_GameControllerAxis get() = 5

val SDL_CONTROLLER_AXIS_MAX: SDL_GameControllerAxis get() = 6

typealias SDL_GameControllerAxisVar = IntVarOf<SDL_GameControllerAxis>

typealias SDL_GameControllerAxis = Int


val SDL_CONTROLLER_BUTTON_INVALID: SDL_GameControllerButton get() = -1

val SDL_CONTROLLER_BUTTON_A: SDL_GameControllerButton get() = 0

val SDL_CONTROLLER_BUTTON_B: SDL_GameControllerButton get() = 1

val SDL_CONTROLLER_BUTTON_X: SDL_GameControllerButton get() = 2

val SDL_CONTROLLER_BUTTON_Y: SDL_GameControllerButton get() = 3

val SDL_CONTROLLER_BUTTON_BACK: SDL_GameControllerButton get() = 4

val SDL_CONTROLLER_BUTTON_GUIDE: SDL_GameControllerButton get() = 5

val SDL_CONTROLLER_BUTTON_START: SDL_GameControllerButton get() = 6

val SDL_CONTROLLER_BUTTON_LEFTSTICK: SDL_GameControllerButton get() = 7

val SDL_CONTROLLER_BUTTON_RIGHTSTICK: SDL_GameControllerButton get() = 8

val SDL_CONTROLLER_BUTTON_LEFTSHOULDER: SDL_GameControllerButton get() = 9

val SDL_CONTROLLER_BUTTON_RIGHTSHOULDER: SDL_GameControllerButton get() = 10

val SDL_CONTROLLER_BUTTON_DPAD_UP: SDL_GameControllerButton get() = 11

val SDL_CONTROLLER_BUTTON_DPAD_DOWN: SDL_GameControllerButton get() = 12

val SDL_CONTROLLER_BUTTON_DPAD_LEFT: SDL_GameControllerButton get() = 13

val SDL_CONTROLLER_BUTTON_DPAD_RIGHT: SDL_GameControllerButton get() = 14

val SDL_CONTROLLER_BUTTON_MAX: SDL_GameControllerButton get() = 15

typealias SDL_GameControllerButtonVar = IntVarOf<SDL_GameControllerButton>

typealias SDL_GameControllerButton = Int


val SDL_TOUCH_DEVICE_INVALID: SDL_TouchDeviceType get() = -1

val SDL_TOUCH_DEVICE_DIRECT: SDL_TouchDeviceType get() = 0

val SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE: SDL_TouchDeviceType get() = 1

val SDL_TOUCH_DEVICE_INDIRECT_RELATIVE: SDL_TouchDeviceType get() = 2

typealias SDL_TouchDeviceTypeVar = IntVarOf<SDL_TouchDeviceType>

typealias SDL_TouchDeviceType = Int


val SDL_FIRSTEVENT: SDL_EventType get() = 0u

val SDL_QUIT: SDL_EventType get() = 256u

val SDL_APP_TERMINATING: SDL_EventType get() = 257u

val SDL_APP_LOWMEMORY: SDL_EventType get() = 258u

val SDL_APP_WILLENTERBACKGROUND: SDL_EventType get() = 259u

val SDL_APP_DIDENTERBACKGROUND: SDL_EventType get() = 260u

val SDL_APP_WILLENTERFOREGROUND: SDL_EventType get() = 261u

val SDL_APP_DIDENTERFOREGROUND: SDL_EventType get() = 262u

val SDL_DISPLAYEVENT: SDL_EventType get() = 336u

val SDL_WINDOWEVENT: SDL_EventType get() = 512u

val SDL_SYSWMEVENT: SDL_EventType get() = 513u

val SDL_KEYDOWN: SDL_EventType get() = 768u

val SDL_KEYUP: SDL_EventType get() = 769u

val SDL_TEXTEDITING: SDL_EventType get() = 770u

val SDL_TEXTINPUT: SDL_EventType get() = 771u

val SDL_KEYMAPCHANGED: SDL_EventType get() = 772u

val SDL_MOUSEMOTION: SDL_EventType get() = 1024u

val SDL_MOUSEBUTTONDOWN: SDL_EventType get() = 1025u

val SDL_MOUSEBUTTONUP: SDL_EventType get() = 1026u

val SDL_MOUSEWHEEL: SDL_EventType get() = 1027u

val SDL_JOYAXISMOTION: SDL_EventType get() = 1536u

val SDL_JOYBALLMOTION: SDL_EventType get() = 1537u

val SDL_JOYHATMOTION: SDL_EventType get() = 1538u

val SDL_JOYBUTTONDOWN: SDL_EventType get() = 1539u

val SDL_JOYBUTTONUP: SDL_EventType get() = 1540u

val SDL_JOYDEVICEADDED: SDL_EventType get() = 1541u

val SDL_JOYDEVICEREMOVED: SDL_EventType get() = 1542u

val SDL_CONTROLLERAXISMOTION: SDL_EventType get() = 1616u

val SDL_CONTROLLERBUTTONDOWN: SDL_EventType get() = 1617u

val SDL_CONTROLLERBUTTONUP: SDL_EventType get() = 1618u

val SDL_CONTROLLERDEVICEADDED: SDL_EventType get() = 1619u

val SDL_CONTROLLERDEVICEREMOVED: SDL_EventType get() = 1620u

val SDL_CONTROLLERDEVICEREMAPPED: SDL_EventType get() = 1621u

val SDL_FINGERDOWN: SDL_EventType get() = 1792u

val SDL_FINGERUP: SDL_EventType get() = 1793u

val SDL_FINGERMOTION: SDL_EventType get() = 1794u

val SDL_DOLLARGESTURE: SDL_EventType get() = 2048u

val SDL_DOLLARRECORD: SDL_EventType get() = 2049u

val SDL_MULTIGESTURE: SDL_EventType get() = 2050u

val SDL_CLIPBOARDUPDATE: SDL_EventType get() = 2304u

val SDL_DROPFILE: SDL_EventType get() = 4096u

val SDL_DROPTEXT: SDL_EventType get() = 4097u

val SDL_DROPBEGIN: SDL_EventType get() = 4098u

val SDL_DROPCOMPLETE: SDL_EventType get() = 4099u

val SDL_AUDIODEVICEADDED: SDL_EventType get() = 4352u

val SDL_AUDIODEVICEREMOVED: SDL_EventType get() = 4353u

val SDL_SENSORUPDATE: SDL_EventType get() = 4608u

val SDL_RENDER_TARGETS_RESET: SDL_EventType get() = 8192u

val SDL_RENDER_DEVICE_RESET: SDL_EventType get() = 8193u

val SDL_USEREVENT: SDL_EventType get() = 32768u

val SDL_LASTEVENT: SDL_EventType get() = 65535u

typealias SDL_EventTypeVar = UIntVarOf<SDL_EventType>

typealias SDL_EventType = UInt

// enum (anonymous at /usr/local/include/SDL2/SDL_log.h:64:1):

val SDL_LOG_CATEGORY_APPLICATION: UInt get() = 0u

val SDL_LOG_CATEGORY_ERROR: UInt get() = 1u

val SDL_LOG_CATEGORY_ASSERT: UInt get() = 2u

val SDL_LOG_CATEGORY_SYSTEM: UInt get() = 3u

val SDL_LOG_CATEGORY_AUDIO: UInt get() = 4u

val SDL_LOG_CATEGORY_VIDEO: UInt get() = 5u

val SDL_LOG_CATEGORY_RENDER: UInt get() = 6u

val SDL_LOG_CATEGORY_INPUT: UInt get() = 7u

val SDL_LOG_CATEGORY_TEST: UInt get() = 8u

val SDL_LOG_CATEGORY_RESERVED1: UInt get() = 9u

val SDL_LOG_CATEGORY_RESERVED2: UInt get() = 10u

val SDL_LOG_CATEGORY_RESERVED3: UInt get() = 11u

val SDL_LOG_CATEGORY_RESERVED4: UInt get() = 12u

val SDL_LOG_CATEGORY_RESERVED5: UInt get() = 13u

val SDL_LOG_CATEGORY_RESERVED6: UInt get() = 14u

val SDL_LOG_CATEGORY_RESERVED7: UInt get() = 15u

val SDL_LOG_CATEGORY_RESERVED8: UInt get() = 16u

val SDL_LOG_CATEGORY_RESERVED9: UInt get() = 17u

val SDL_LOG_CATEGORY_RESERVED10: UInt get() = 18u

val SDL_LOG_CATEGORY_CUSTOM: UInt get() = 19u


val SDL_LOG_PRIORITY_VERBOSE: SDL_LogPriority get() = 1u

val SDL_LOG_PRIORITY_DEBUG: SDL_LogPriority get() = 2u

val SDL_LOG_PRIORITY_INFO: SDL_LogPriority get() = 3u

val SDL_LOG_PRIORITY_WARN: SDL_LogPriority get() = 4u

val SDL_LOG_PRIORITY_ERROR: SDL_LogPriority get() = 5u

val SDL_LOG_PRIORITY_CRITICAL: SDL_LogPriority get() = 6u

val SDL_NUM_LOG_PRIORITIES: SDL_LogPriority get() = 7u

typealias SDL_LogPriorityVar = UIntVarOf<SDL_LogPriority>

typealias SDL_LogPriority = UInt


val SDL_MESSAGEBOX_ERROR: SDL_MessageBoxFlags get() = 16u

val SDL_MESSAGEBOX_WARNING: SDL_MessageBoxFlags get() = 32u

val SDL_MESSAGEBOX_INFORMATION: SDL_MessageBoxFlags get() = 64u

typealias SDL_MessageBoxFlagsVar = UIntVarOf<SDL_MessageBoxFlags>

typealias SDL_MessageBoxFlags = UInt


val SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT: SDL_MessageBoxButtonFlags get() = 1u

val SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT: SDL_MessageBoxButtonFlags get() = 2u

typealias SDL_MessageBoxButtonFlagsVar = UIntVarOf<SDL_MessageBoxButtonFlags>

typealias SDL_MessageBoxButtonFlags = UInt


val SDL_RENDERER_SOFTWARE: SDL_RendererFlags get() = 1u

val SDL_RENDERER_ACCELERATED: SDL_RendererFlags get() = 2u

val SDL_RENDERER_PRESENTVSYNC: SDL_RendererFlags get() = 4u

val SDL_RENDERER_TARGETTEXTURE: SDL_RendererFlags get() = 8u

typealias SDL_RendererFlagsVar = UIntVarOf<SDL_RendererFlags>

typealias SDL_RendererFlags = UInt


val SDL_TEXTUREMODULATE_NONE: SDL_TextureModulate get() = 0u

val SDL_TEXTUREMODULATE_COLOR: SDL_TextureModulate get() = 1u

val SDL_TEXTUREMODULATE_ALPHA: SDL_TextureModulate get() = 2u

typealias SDL_TextureModulateVar = UIntVarOf<SDL_TextureModulate>

typealias SDL_TextureModulate = UInt


val SDL_FLIP_NONE: SDL_RendererFlip get() = 0u

val SDL_FLIP_HORIZONTAL: SDL_RendererFlip get() = 1u

val SDL_FLIP_VERTICAL: SDL_RendererFlip get() = 2u

typealias SDL_RendererFlipVar = UIntVarOf<SDL_RendererFlip>

typealias SDL_RendererFlip = UInt


val SDL_SENSOR_INVALID: SDL_SensorType get() = -1

val SDL_SENSOR_UNKNOWN: SDL_SensorType get() = 0

val SDL_SENSOR_ACCEL: SDL_SensorType get() = 1

val SDL_SENSOR_GYRO: SDL_SensorType get() = 2

typealias SDL_SensorTypeVar = IntVarOf<SDL_SensorType>

typealias SDL_SensorType = Int
@SymbolName("sdl_kniBridge0")
private external fun kniBridge0(): NativePtr
@SymbolName("sdl_kniBridge1")
private external fun kniBridge1(p0: ULong): NativePtr
@SymbolName("sdl_kniBridge2")
private external fun kniBridge2(p0: ULong, p1: ULong): NativePtr
@SymbolName("sdl_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("sdl_kniBridge4")
private external fun kniBridge4(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sdl_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge7")
private external fun kniBridge7(): Int
@SymbolName("sdl_kniBridge8")
private external fun kniBridge8(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): Unit
@SymbolName("sdl_kniBridge11")
private external fun kniBridge11(p0: Int): Int
@SymbolName("sdl_kniBridge12")
private external fun kniBridge12(p0: Int): Int
@SymbolName("sdl_kniBridge13")
private external fun kniBridge13(p0: Int): Int
@SymbolName("sdl_kniBridge14")
private external fun kniBridge14(p0: Int): Int
@SymbolName("sdl_kniBridge15")
private external fun kniBridge15(p0: Int): Int
@SymbolName("sdl_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: Int, p2: ULong): NativePtr
@SymbolName("sdl_kniBridge17")
private external fun kniBridge17(p0: NativePtr, p1: UInt, p2: ULong): Unit
@SymbolName("sdl_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@SymbolName("sdl_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@SymbolName("sdl_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("sdl_kniBridge21")
private external fun kniBridge21(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge22")
private external fun kniBridge22(p0: NativePtr): ULong
@SymbolName("sdl_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("sdl_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("sdl_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge26")
private external fun kniBridge26(p0: NativePtr): ULong
@SymbolName("sdl_kniBridge27")
private external fun kniBridge27(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("sdl_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("sdl_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("sdl_kniBridge30")
private external fun kniBridge30(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge31")
private external fun kniBridge31(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge32")
private external fun kniBridge32(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge33")
private external fun kniBridge33(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sdl_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sdl_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge37")
private external fun kniBridge37(p0: NativePtr): ULong
@SymbolName("sdl_kniBridge38")
private external fun kniBridge38(p0: Int, p1: NativePtr, p2: Int): NativePtr
@SymbolName("sdl_kniBridge39")
private external fun kniBridge39(p0: UInt, p1: NativePtr, p2: Int): NativePtr
@SymbolName("sdl_kniBridge40")
private external fun kniBridge40(p0: Long, p1: NativePtr, p2: Int): NativePtr
@SymbolName("sdl_kniBridge41")
private external fun kniBridge41(p0: ULong, p1: NativePtr, p2: Int): NativePtr
@SymbolName("sdl_kniBridge42")
private external fun kniBridge42(p0: Long, p1: NativePtr, p2: Int): NativePtr
@SymbolName("sdl_kniBridge43")
private external fun kniBridge43(p0: ULong, p1: NativePtr, p2: Int): NativePtr
@SymbolName("sdl_kniBridge44")
private external fun kniBridge44(p0: NativePtr): Int
@SymbolName("sdl_kniBridge45")
private external fun kniBridge45(p0: NativePtr): Double
@SymbolName("sdl_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("sdl_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("sdl_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("sdl_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("sdl_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr): Double
@SymbolName("sdl_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("sdl_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("sdl_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sdl_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge57")
private external fun kniBridge57(p0: Double): Double
@SymbolName("sdl_kniBridge58")
private external fun kniBridge58(p0: Float): Float
@SymbolName("sdl_kniBridge59")
private external fun kniBridge59(p0: Double): Double
@SymbolName("sdl_kniBridge60")
private external fun kniBridge60(p0: Float): Float
@SymbolName("sdl_kniBridge61")
private external fun kniBridge61(p0: Double): Double
@SymbolName("sdl_kniBridge62")
private external fun kniBridge62(p0: Float): Float
@SymbolName("sdl_kniBridge63")
private external fun kniBridge63(p0: Double, p1: Double): Double
@SymbolName("sdl_kniBridge64")
private external fun kniBridge64(p0: Float, p1: Float): Float
@SymbolName("sdl_kniBridge65")
private external fun kniBridge65(p0: Double): Double
@SymbolName("sdl_kniBridge66")
private external fun kniBridge66(p0: Float): Float
@SymbolName("sdl_kniBridge67")
private external fun kniBridge67(p0: Double, p1: Double): Double
@SymbolName("sdl_kniBridge68")
private external fun kniBridge68(p0: Float, p1: Float): Float
@SymbolName("sdl_kniBridge69")
private external fun kniBridge69(p0: Double): Double
@SymbolName("sdl_kniBridge70")
private external fun kniBridge70(p0: Float): Float
@SymbolName("sdl_kniBridge71")
private external fun kniBridge71(p0: Double): Double
@SymbolName("sdl_kniBridge72")
private external fun kniBridge72(p0: Float): Float
@SymbolName("sdl_kniBridge73")
private external fun kniBridge73(p0: Double): Double
@SymbolName("sdl_kniBridge74")
private external fun kniBridge74(p0: Float): Float
@SymbolName("sdl_kniBridge75")
private external fun kniBridge75(p0: Double): Double
@SymbolName("sdl_kniBridge76")
private external fun kniBridge76(p0: Float): Float
@SymbolName("sdl_kniBridge77")
private external fun kniBridge77(p0: Double, p1: Double): Double
@SymbolName("sdl_kniBridge78")
private external fun kniBridge78(p0: Float, p1: Float): Float
@SymbolName("sdl_kniBridge79")
private external fun kniBridge79(p0: Double): Double
@SymbolName("sdl_kniBridge80")
private external fun kniBridge80(p0: Float): Float
@SymbolName("sdl_kniBridge81")
private external fun kniBridge81(p0: Double): Double
@SymbolName("sdl_kniBridge82")
private external fun kniBridge82(p0: Float): Float
@SymbolName("sdl_kniBridge83")
private external fun kniBridge83(p0: Double, p1: Double): Double
@SymbolName("sdl_kniBridge84")
private external fun kniBridge84(p0: Float, p1: Float): Float
@SymbolName("sdl_kniBridge85")
private external fun kniBridge85(p0: Double, p1: Int): Double
@SymbolName("sdl_kniBridge86")
private external fun kniBridge86(p0: Float, p1: Int): Float
@SymbolName("sdl_kniBridge87")
private external fun kniBridge87(p0: Double): Double
@SymbolName("sdl_kniBridge88")
private external fun kniBridge88(p0: Float): Float
@SymbolName("sdl_kniBridge89")
private external fun kniBridge89(p0: Double): Double
@SymbolName("sdl_kniBridge90")
private external fun kniBridge90(p0: Float): Float
@SymbolName("sdl_kniBridge91")
private external fun kniBridge91(p0: Double): Double
@SymbolName("sdl_kniBridge92")
private external fun kniBridge92(p0: Float): Float
@SymbolName("sdl_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge94")
private external fun kniBridge94(p0: NativePtr): Int
@SymbolName("sdl_kniBridge95")
private external fun kniBridge95(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): ULong
@SymbolName("sdl_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): NativePtr
@SymbolName("sdl_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@SymbolName("sdl_kniBridge98")
private external fun kniBridge98(p0: Int, p1: NativePtr): Int
@SymbolName("sdl_kniBridge99")
private external fun kniBridge99(): Unit
@SymbolName("sdl_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): UInt
@SymbolName("sdl_kniBridge101")
private external fun kniBridge101(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge102")
private external fun kniBridge102(): NativePtr
@SymbolName("sdl_kniBridge103")
private external fun kniBridge103(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge104")
private external fun kniBridge104(): NativePtr
@SymbolName("sdl_kniBridge105")
private external fun kniBridge105(): Unit
@SymbolName("sdl_kniBridge106")
private external fun kniBridge106(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge107")
private external fun kniBridge107(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge108")
private external fun kniBridge108(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge109")
private external fun kniBridge109(): Unit
@SymbolName("sdl_kniBridge110")
private external fun kniBridge110(): Unit
@SymbolName("sdl_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: Int, p2: Int): UInt
@SymbolName("sdl_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge113")
private external fun kniBridge113(p0: NativePtr): Int
@SymbolName("sdl_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge115")
private external fun kniBridge115(p0: NativePtr, p1: NativePtr, p2: NativePtr): UInt
@SymbolName("sdl_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge117")
private external fun kniBridge117(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge118")
private external fun kniBridge118(): NativePtr
@SymbolName("sdl_kniBridge119")
private external fun kniBridge119(): Unit
@SymbolName("sdl_kniBridge120")
private external fun kniBridge120(p0: UInt): Int
@SymbolName("sdl_kniBridge121")
private external fun kniBridge121(p0: UShort): UShort
@SymbolName("sdl_kniBridge122")
private external fun kniBridge122(p0: UInt): UInt
@SymbolName("sdl_kniBridge123")
private external fun kniBridge123(p0: ULong): ULong
@SymbolName("sdl_kniBridge124")
private external fun kniBridge124(p0: Float): Float
@SymbolName("sdl_kniBridge125")
private external fun kniBridge125(): NativePtr
@SymbolName("sdl_kniBridge126")
private external fun kniBridge126(p0: NativePtr): Int
@SymbolName("sdl_kniBridge127")
private external fun kniBridge127(p0: NativePtr): Int
@SymbolName("sdl_kniBridge128")
private external fun kniBridge128(p0: NativePtr): Int
@SymbolName("sdl_kniBridge129")
private external fun kniBridge129(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge130")
private external fun kniBridge130(p0: UInt): NativePtr
@SymbolName("sdl_kniBridge131")
private external fun kniBridge131(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge132")
private external fun kniBridge132(p0: NativePtr): Int
@SymbolName("sdl_kniBridge133")
private external fun kniBridge133(p0: NativePtr): Int
@SymbolName("sdl_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: UInt): Int
@SymbolName("sdl_kniBridge135")
private external fun kniBridge135(p0: NativePtr): Int
@SymbolName("sdl_kniBridge136")
private external fun kniBridge136(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge137")
private external fun kniBridge137(): NativePtr
@SymbolName("sdl_kniBridge138")
private external fun kniBridge138(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge139")
private external fun kniBridge139(p0: NativePtr): Int
@SymbolName("sdl_kniBridge140")
private external fun kniBridge140(p0: NativePtr): Int
@SymbolName("sdl_kniBridge141")
private external fun kniBridge141(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr, p2: UInt): Int
@SymbolName("sdl_kniBridge143")
private external fun kniBridge143(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sdl_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): NativePtr
@SymbolName("sdl_kniBridge145")
private external fun kniBridge145(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge146")
private external fun kniBridge146(): ULong
@SymbolName("sdl_kniBridge147")
private external fun kniBridge147(p0: NativePtr): ULong
@SymbolName("sdl_kniBridge148")
private external fun kniBridge148(p0: UInt): Int
@SymbolName("sdl_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge150")
private external fun kniBridge150(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge151")
private external fun kniBridge151(): UInt
@SymbolName("sdl_kniBridge152")
private external fun kniBridge152(p0: UInt): NativePtr
@SymbolName("sdl_kniBridge153")
private external fun kniBridge153(p0: UInt, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sdl_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge155")
private external fun kniBridge155(p0: NativePtr, p1: UInt): NativePtr
@SymbolName("sdl_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sdl_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sdl_kniBridge158")
private external fun kniBridge158(): NativePtr
@SymbolName("sdl_kniBridge159")
private external fun kniBridge159(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge160")
private external fun kniBridge160(p0: NativePtr): Long
@SymbolName("sdl_kniBridge161")
private external fun kniBridge161(p0: NativePtr, p1: Long, p2: Int): Long
@SymbolName("sdl_kniBridge162")
private external fun kniBridge162(p0: NativePtr): Long
@SymbolName("sdl_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong): ULong
@SymbolName("sdl_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong): ULong
@SymbolName("sdl_kniBridge165")
private external fun kniBridge165(p0: NativePtr): Int
@SymbolName("sdl_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr, p2: Int): NativePtr
@SymbolName("sdl_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge168")
private external fun kniBridge168(p0: NativePtr): UByte
@SymbolName("sdl_kniBridge169")
private external fun kniBridge169(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge170")
private external fun kniBridge170(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge171")
private external fun kniBridge171(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge172")
private external fun kniBridge172(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge173")
private external fun kniBridge173(p0: NativePtr): ULong
@SymbolName("sdl_kniBridge174")
private external fun kniBridge174(p0: NativePtr): ULong
@SymbolName("sdl_kniBridge175")
private external fun kniBridge175(p0: NativePtr, p1: UByte): ULong
@SymbolName("sdl_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: UShort): ULong
@SymbolName("sdl_kniBridge177")
private external fun kniBridge177(p0: NativePtr, p1: UShort): ULong
@SymbolName("sdl_kniBridge178")
private external fun kniBridge178(p0: NativePtr, p1: UInt): ULong
@SymbolName("sdl_kniBridge179")
private external fun kniBridge179(p0: NativePtr, p1: UInt): ULong
@SymbolName("sdl_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: ULong): ULong
@SymbolName("sdl_kniBridge181")
private external fun kniBridge181(p0: NativePtr, p1: ULong): ULong
@SymbolName("sdl_kniBridge182")
private external fun kniBridge182(): Int
@SymbolName("sdl_kniBridge183")
private external fun kniBridge183(p0: Int): NativePtr
@SymbolName("sdl_kniBridge184")
private external fun kniBridge184(p0: NativePtr): Int
@SymbolName("sdl_kniBridge185")
private external fun kniBridge185(): Unit
@SymbolName("sdl_kniBridge186")
private external fun kniBridge186(): NativePtr
@SymbolName("sdl_kniBridge187")
private external fun kniBridge187(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge188")
private external fun kniBridge188(p0: Int): Int
@SymbolName("sdl_kniBridge189")
private external fun kniBridge189(p0: Int, p1: Int): NativePtr
@SymbolName("sdl_kniBridge190")
private external fun kniBridge190(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr, p4: Int): UInt
@SymbolName("sdl_kniBridge191")
private external fun kniBridge191(): UInt
@SymbolName("sdl_kniBridge192")
private external fun kniBridge192(p0: UInt): UInt
@SymbolName("sdl_kniBridge193")
private external fun kniBridge193(p0: Int): Unit
@SymbolName("sdl_kniBridge194")
private external fun kniBridge194(p0: UInt, p1: Int): Unit
@SymbolName("sdl_kniBridge195")
private external fun kniBridge195(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("sdl_kniBridge196")
private external fun kniBridge196(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge197")
private external fun kniBridge197(p0: NativePtr, p1: UShort, p2: UByte, p3: Int, p4: UShort, p5: UByte, p6: Int): Int
@SymbolName("sdl_kniBridge198")
private external fun kniBridge198(p0: NativePtr): Int
@SymbolName("sdl_kniBridge199")
private external fun kniBridge199(p0: UShort, p1: UByte, p2: Int, p3: UShort, p4: UByte, p5: Int): NativePtr
@SymbolName("sdl_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge201")
private external fun kniBridge201(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge202")
private external fun kniBridge202(p0: NativePtr): Int
@SymbolName("sdl_kniBridge203")
private external fun kniBridge203(p0: NativePtr): Int
@SymbolName("sdl_kniBridge204")
private external fun kniBridge204(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge205")
private external fun kniBridge205(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: NativePtr, p2: UInt, p3: Int): Unit
@SymbolName("sdl_kniBridge207")
private external fun kniBridge207(p0: NativePtr, p1: NativePtr, p2: UShort, p3: UInt, p4: Int): Unit
@SymbolName("sdl_kniBridge208")
private external fun kniBridge208(p0: UInt, p1: NativePtr, p2: UInt): Int
@SymbolName("sdl_kniBridge209")
private external fun kniBridge209(p0: UInt, p1: NativePtr, p2: UInt): UInt
@SymbolName("sdl_kniBridge210")
private external fun kniBridge210(p0: UInt): UInt
@SymbolName("sdl_kniBridge211")
private external fun kniBridge211(p0: UInt): Unit
@SymbolName("sdl_kniBridge212")
private external fun kniBridge212(): Unit
@SymbolName("sdl_kniBridge213")
private external fun kniBridge213(p0: UInt): Unit
@SymbolName("sdl_kniBridge214")
private external fun kniBridge214(): Unit
@SymbolName("sdl_kniBridge215")
private external fun kniBridge215(p0: UInt): Unit
@SymbolName("sdl_kniBridge216")
private external fun kniBridge216(): Unit
@SymbolName("sdl_kniBridge217")
private external fun kniBridge217(p0: UInt): Unit
@SymbolName("sdl_kniBridge218")
private external fun kniBridge218(p0: NativePtr): Int
@SymbolName("sdl_kniBridge219")
private external fun kniBridge219(): NativePtr
@SymbolName("sdl_kniBridge220")
private external fun kniBridge220(): UInt
@SymbolName("sdl_kniBridge221")
private external fun kniBridge221(): Int
@SymbolName("sdl_kniBridge222")
private external fun kniBridge222(): Int
@SymbolName("sdl_kniBridge223")
private external fun kniBridge223(): UInt
@SymbolName("sdl_kniBridge224")
private external fun kniBridge224(): UInt
@SymbolName("sdl_kniBridge225")
private external fun kniBridge225(): UInt
@SymbolName("sdl_kniBridge226")
private external fun kniBridge226(): UInt
@SymbolName("sdl_kniBridge227")
private external fun kniBridge227(): UInt
@SymbolName("sdl_kniBridge228")
private external fun kniBridge228(): UInt
@SymbolName("sdl_kniBridge229")
private external fun kniBridge229(): UInt
@SymbolName("sdl_kniBridge230")
private external fun kniBridge230(): UInt
@SymbolName("sdl_kniBridge231")
private external fun kniBridge231(): UInt
@SymbolName("sdl_kniBridge232")
private external fun kniBridge232(): UInt
@SymbolName("sdl_kniBridge233")
private external fun kniBridge233(): UInt
@SymbolName("sdl_kniBridge234")
private external fun kniBridge234(): UInt
@SymbolName("sdl_kniBridge235")
private external fun kniBridge235(): UInt
@SymbolName("sdl_kniBridge236")
private external fun kniBridge236(): Int
@SymbolName("sdl_kniBridge237")
private external fun kniBridge237(): ULong
@SymbolName("sdl_kniBridge238")
private external fun kniBridge238(p0: ULong): NativePtr
@SymbolName("sdl_kniBridge239")
private external fun kniBridge239(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge240")
private external fun kniBridge240(p0: UInt): NativePtr
@SymbolName("sdl_kniBridge241")
private external fun kniBridge241(p0: UInt, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): UInt
@SymbolName("sdl_kniBridge242")
private external fun kniBridge242(p0: Int, p1: UInt, p2: UInt, p3: UInt, p4: UInt): UInt
@SymbolName("sdl_kniBridge243")
private external fun kniBridge243(p0: UInt): NativePtr
@SymbolName("sdl_kniBridge244")
private external fun kniBridge244(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge245")
private external fun kniBridge245(p0: Int): NativePtr
@SymbolName("sdl_kniBridge246")
private external fun kniBridge246(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge247")
private external fun kniBridge247(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Int
@SymbolName("sdl_kniBridge248")
private external fun kniBridge248(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge249")
private external fun kniBridge249(p0: NativePtr, p1: UByte, p2: UByte, p3: UByte): UInt
@SymbolName("sdl_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: UByte, p2: UByte, p3: UByte, p4: UByte): UInt
@SymbolName("sdl_kniBridge251")
private external fun kniBridge251(p0: UInt, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("sdl_kniBridge252")
private external fun kniBridge252(p0: UInt, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("sdl_kniBridge253")
private external fun kniBridge253(p0: Float, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge255")
private external fun kniBridge255(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge256")
private external fun kniBridge256(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge257")
private external fun kniBridge257(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr, p2: NativePtr): UInt
@SymbolName("sdl_kniBridge259")
private external fun kniBridge259(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge260")
private external fun kniBridge260(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): UInt
@SymbolName("sdl_kniBridge261")
private external fun kniBridge261(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): UInt
@SymbolName("sdl_kniBridge262")
private external fun kniBridge262(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: UInt, p5: UInt): UInt
@SymbolName("sdl_kniBridge263")
private external fun kniBridge263(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: UInt, p7: UInt): NativePtr
@SymbolName("sdl_kniBridge264")
private external fun kniBridge264(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt): NativePtr
@SymbolName("sdl_kniBridge265")
private external fun kniBridge265(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int, p5: UInt, p6: UInt, p7: UInt, p8: UInt): NativePtr
@SymbolName("sdl_kniBridge266")
private external fun kniBridge266(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int, p5: UInt): NativePtr
@SymbolName("sdl_kniBridge267")
private external fun kniBridge267(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge268")
private external fun kniBridge268(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge269")
private external fun kniBridge269(p0: NativePtr): Int
@SymbolName("sdl_kniBridge270")
private external fun kniBridge270(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge271")
private external fun kniBridge271(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sdl_kniBridge272")
private external fun kniBridge272(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge273")
private external fun kniBridge273(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge274")
private external fun kniBridge274(p0: NativePtr, p1: Int, p2: UInt): Int
@SymbolName("sdl_kniBridge275")
private external fun kniBridge275(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge276")
private external fun kniBridge276(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge277")
private external fun kniBridge277(p0: NativePtr, p1: UByte, p2: UByte, p3: UByte): Int
@SymbolName("sdl_kniBridge278")
private external fun kniBridge278(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge279")
private external fun kniBridge279(p0: NativePtr, p1: UByte): Int
@SymbolName("sdl_kniBridge280")
private external fun kniBridge280(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge281")
private external fun kniBridge281(p0: NativePtr, p1: UInt): Int
@SymbolName("sdl_kniBridge282")
private external fun kniBridge282(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge283")
private external fun kniBridge283(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge284")
private external fun kniBridge284(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge285")
private external fun kniBridge285(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge286")
private external fun kniBridge286(p0: NativePtr, p1: NativePtr, p2: UInt): NativePtr
@SymbolName("sdl_kniBridge287")
private external fun kniBridge287(p0: NativePtr, p1: UInt, p2: UInt): NativePtr
@SymbolName("sdl_kniBridge288")
private external fun kniBridge288(p0: Int, p1: Int, p2: UInt, p3: NativePtr, p4: Int, p5: UInt, p6: NativePtr, p7: Int): Int
@SymbolName("sdl_kniBridge289")
private external fun kniBridge289(p0: NativePtr, p1: NativePtr, p2: UInt): Int
@SymbolName("sdl_kniBridge290")
private external fun kniBridge290(p0: NativePtr, p1: NativePtr, p2: Int, p3: UInt): Int
@SymbolName("sdl_kniBridge291")
private external fun kniBridge291(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge292")
private external fun kniBridge292(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge293")
private external fun kniBridge293(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge294")
private external fun kniBridge294(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge295")
private external fun kniBridge295(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge296")
private external fun kniBridge296(p0: UInt): Unit
@SymbolName("sdl_kniBridge297")
private external fun kniBridge297(): UInt
@SymbolName("sdl_kniBridge298")
private external fun kniBridge298(p0: Int, p1: Int): UInt
@SymbolName("sdl_kniBridge299")
private external fun kniBridge299(): Int
@SymbolName("sdl_kniBridge300")
private external fun kniBridge300(p0: Int): NativePtr
@SymbolName("sdl_kniBridge301")
private external fun kniBridge301(p0: NativePtr): Int
@SymbolName("sdl_kniBridge302")
private external fun kniBridge302(): Unit
@SymbolName("sdl_kniBridge303")
private external fun kniBridge303(): NativePtr
@SymbolName("sdl_kniBridge304")
private external fun kniBridge304(): Int
@SymbolName("sdl_kniBridge305")
private external fun kniBridge305(p0: Int): NativePtr
@SymbolName("sdl_kniBridge306")
private external fun kniBridge306(p0: Int, p1: NativePtr): Int
@SymbolName("sdl_kniBridge307")
private external fun kniBridge307(p0: Int, p1: NativePtr): Int
@SymbolName("sdl_kniBridge308")
private external fun kniBridge308(p0: Int, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge309")
private external fun kniBridge309(p0: Int): UInt
@SymbolName("sdl_kniBridge310")
private external fun kniBridge310(p0: Int): Int
@SymbolName("sdl_kniBridge311")
private external fun kniBridge311(p0: Int, p1: Int, p2: NativePtr): Int
@SymbolName("sdl_kniBridge312")
private external fun kniBridge312(p0: Int, p1: NativePtr): Int
@SymbolName("sdl_kniBridge313")
private external fun kniBridge313(p0: Int, p1: NativePtr): Int
@SymbolName("sdl_kniBridge314")
private external fun kniBridge314(p0: Int, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sdl_kniBridge315")
private external fun kniBridge315(p0: NativePtr): Int
@SymbolName("sdl_kniBridge316")
private external fun kniBridge316(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge317")
private external fun kniBridge317(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge318")
private external fun kniBridge318(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge319")
private external fun kniBridge319(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int, p5: UInt): NativePtr
@SymbolName("sdl_kniBridge320")
private external fun kniBridge320(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge321")
private external fun kniBridge321(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge322")
private external fun kniBridge322(p0: UInt): NativePtr
@SymbolName("sdl_kniBridge323")
private external fun kniBridge323(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge324")
private external fun kniBridge324(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge325")
private external fun kniBridge325(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge326")
private external fun kniBridge326(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge327")
private external fun kniBridge327(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sdl_kniBridge328")
private external fun kniBridge328(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge329")
private external fun kniBridge329(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("sdl_kniBridge330")
private external fun kniBridge330(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge331")
private external fun kniBridge331(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("sdl_kniBridge332")
private external fun kniBridge332(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge333")
private external fun kniBridge333(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sdl_kniBridge334")
private external fun kniBridge334(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("sdl_kniBridge335")
private external fun kniBridge335(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge336")
private external fun kniBridge336(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("sdl_kniBridge337")
private external fun kniBridge337(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge338")
private external fun kniBridge338(p0: NativePtr, p1: UInt): Unit
@SymbolName("sdl_kniBridge339")
private external fun kniBridge339(p0: NativePtr, p1: UInt): Unit
@SymbolName("sdl_kniBridge340")
private external fun kniBridge340(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge341")
private external fun kniBridge341(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge342")
private external fun kniBridge342(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge343")
private external fun kniBridge343(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge344")
private external fun kniBridge344(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge345")
private external fun kniBridge345(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge346")
private external fun kniBridge346(p0: NativePtr, p1: UInt): Int
@SymbolName("sdl_kniBridge347")
private external fun kniBridge347(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge348")
private external fun kniBridge348(p0: NativePtr): Int
@SymbolName("sdl_kniBridge349")
private external fun kniBridge349(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge350")
private external fun kniBridge350(p0: NativePtr, p1: UInt): Unit
@SymbolName("sdl_kniBridge351")
private external fun kniBridge351(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge352")
private external fun kniBridge352(): NativePtr
@SymbolName("sdl_kniBridge353")
private external fun kniBridge353(p0: NativePtr, p1: Float): Int
@SymbolName("sdl_kniBridge354")
private external fun kniBridge354(p0: NativePtr): Float
@SymbolName("sdl_kniBridge355")
private external fun kniBridge355(p0: NativePtr, p1: Float): Int
@SymbolName("sdl_kniBridge356")
private external fun kniBridge356(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge357")
private external fun kniBridge357(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge358")
private external fun kniBridge358(p0: NativePtr): Int
@SymbolName("sdl_kniBridge359")
private external fun kniBridge359(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge360")
private external fun kniBridge360(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge361")
private external fun kniBridge361(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sdl_kniBridge362")
private external fun kniBridge362(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge363")
private external fun kniBridge363(): UInt
@SymbolName("sdl_kniBridge364")
private external fun kniBridge364(): Unit
@SymbolName("sdl_kniBridge365")
private external fun kniBridge365(): Unit
@SymbolName("sdl_kniBridge366")
private external fun kniBridge366(p0: NativePtr): Int
@SymbolName("sdl_kniBridge367")
private external fun kniBridge367(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge368")
private external fun kniBridge368(): Unit
@SymbolName("sdl_kniBridge369")
private external fun kniBridge369(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge370")
private external fun kniBridge370(): Unit
@SymbolName("sdl_kniBridge371")
private external fun kniBridge371(p0: UInt, p1: Int): Int
@SymbolName("sdl_kniBridge372")
private external fun kniBridge372(p0: UInt, p1: NativePtr): Int
@SymbolName("sdl_kniBridge373")
private external fun kniBridge373(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge374")
private external fun kniBridge374(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge375")
private external fun kniBridge375(): NativePtr
@SymbolName("sdl_kniBridge376")
private external fun kniBridge376(): NativePtr
@SymbolName("sdl_kniBridge377")
private external fun kniBridge377(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge378")
private external fun kniBridge378(p0: Int): Int
@SymbolName("sdl_kniBridge379")
private external fun kniBridge379(): Int
@SymbolName("sdl_kniBridge380")
private external fun kniBridge380(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge381")
private external fun kniBridge381(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge382")
private external fun kniBridge382(): NativePtr
@SymbolName("sdl_kniBridge383")
private external fun kniBridge383(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge384")
private external fun kniBridge384(): UInt
@SymbolName("sdl_kniBridge385")
private external fun kniBridge385(p0: UInt): Unit
@SymbolName("sdl_kniBridge386")
private external fun kniBridge386(p0: UInt): Int
@SymbolName("sdl_kniBridge387")
private external fun kniBridge387(p0: Int): UInt
@SymbolName("sdl_kniBridge388")
private external fun kniBridge388(p0: UInt): NativePtr
@SymbolName("sdl_kniBridge389")
private external fun kniBridge389(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge390")
private external fun kniBridge390(p0: Int): NativePtr
@SymbolName("sdl_kniBridge391")
private external fun kniBridge391(p0: NativePtr): Int
@SymbolName("sdl_kniBridge392")
private external fun kniBridge392(): Unit
@SymbolName("sdl_kniBridge393")
private external fun kniBridge393(): UInt
@SymbolName("sdl_kniBridge394")
private external fun kniBridge394(): Unit
@SymbolName("sdl_kniBridge395")
private external fun kniBridge395(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge396")
private external fun kniBridge396(): UInt
@SymbolName("sdl_kniBridge397")
private external fun kniBridge397(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge398")
private external fun kniBridge398(): NativePtr
@SymbolName("sdl_kniBridge399")
private external fun kniBridge399(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge400")
private external fun kniBridge400(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge401")
private external fun kniBridge401(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge402")
private external fun kniBridge402(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("sdl_kniBridge403")
private external fun kniBridge403(p0: Int, p1: Int): Int
@SymbolName("sdl_kniBridge404")
private external fun kniBridge404(p0: UInt): Int
@SymbolName("sdl_kniBridge405")
private external fun kniBridge405(p0: UInt): Int
@SymbolName("sdl_kniBridge406")
private external fun kniBridge406(): UInt
@SymbolName("sdl_kniBridge407")
private external fun kniBridge407(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int, p5: Int): NativePtr
@SymbolName("sdl_kniBridge408")
private external fun kniBridge408(p0: NativePtr, p1: Int, p2: Int): NativePtr
@SymbolName("sdl_kniBridge409")
private external fun kniBridge409(p0: UInt): NativePtr
@SymbolName("sdl_kniBridge410")
private external fun kniBridge410(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge411")
private external fun kniBridge411(): NativePtr
@SymbolName("sdl_kniBridge412")
private external fun kniBridge412(): NativePtr
@SymbolName("sdl_kniBridge413")
private external fun kniBridge413(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge414")
private external fun kniBridge414(p0: Int): Int
@SymbolName("sdl_kniBridge415")
private external fun kniBridge415(): Unit
@SymbolName("sdl_kniBridge416")
private external fun kniBridge416(): Unit
@SymbolName("sdl_kniBridge417")
private external fun kniBridge417(): Int
@SymbolName("sdl_kniBridge418")
private external fun kniBridge418(p0: Int): NativePtr
@SymbolName("sdl_kniBridge419")
private external fun kniBridge419(p0: Int): Int
@SymbolName("sdl_kniBridge420")
private external fun kniBridge420(p0: Int, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge421")
private external fun kniBridge421(p0: Int): UShort
@SymbolName("sdl_kniBridge422")
private external fun kniBridge422(p0: Int): UShort
@SymbolName("sdl_kniBridge423")
private external fun kniBridge423(p0: Int): UShort
@SymbolName("sdl_kniBridge424")
private external fun kniBridge424(p0: Int): UInt
@SymbolName("sdl_kniBridge425")
private external fun kniBridge425(p0: Int): Int
@SymbolName("sdl_kniBridge426")
private external fun kniBridge426(p0: Int): NativePtr
@SymbolName("sdl_kniBridge427")
private external fun kniBridge427(p0: Int): NativePtr
@SymbolName("sdl_kniBridge428")
private external fun kniBridge428(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge429")
private external fun kniBridge429(p0: NativePtr): Int
@SymbolName("sdl_kniBridge430")
private external fun kniBridge430(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge431")
private external fun kniBridge431(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge432")
private external fun kniBridge432(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge433")
private external fun kniBridge433(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge434")
private external fun kniBridge434(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge435")
private external fun kniBridge435(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sdl_kniBridge436")
private external fun kniBridge436(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge437")
private external fun kniBridge437(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge438")
private external fun kniBridge438(p0: NativePtr): Int
@SymbolName("sdl_kniBridge439")
private external fun kniBridge439(p0: NativePtr): Int
@SymbolName("sdl_kniBridge440")
private external fun kniBridge440(p0: NativePtr): Int
@SymbolName("sdl_kniBridge441")
private external fun kniBridge441(p0: NativePtr): Int
@SymbolName("sdl_kniBridge442")
private external fun kniBridge442(p0: NativePtr): Int
@SymbolName("sdl_kniBridge443")
private external fun kniBridge443(): Unit
@SymbolName("sdl_kniBridge444")
private external fun kniBridge444(p0: Int): Int
@SymbolName("sdl_kniBridge445")
private external fun kniBridge445(p0: NativePtr, p1: Int): Short
@SymbolName("sdl_kniBridge446")
private external fun kniBridge446(p0: NativePtr, p1: Int, p2: NativePtr): UInt
@SymbolName("sdl_kniBridge447")
private external fun kniBridge447(p0: NativePtr, p1: Int): UByte
@SymbolName("sdl_kniBridge448")
private external fun kniBridge448(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge449")
private external fun kniBridge449(p0: NativePtr, p1: Int): UByte
@SymbolName("sdl_kniBridge450")
private external fun kniBridge450(p0: NativePtr, p1: UShort, p2: UShort, p3: UInt): Int
@SymbolName("sdl_kniBridge451")
private external fun kniBridge451(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge452")
private external fun kniBridge452(p0: NativePtr): Int
@SymbolName("sdl_kniBridge453")
private external fun kniBridge453(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge454")
private external fun kniBridge454(p0: NativePtr): Int
@SymbolName("sdl_kniBridge455")
private external fun kniBridge455(): Int
@SymbolName("sdl_kniBridge456")
private external fun kniBridge456(p0: Int): NativePtr
@SymbolName("sdl_kniBridge457")
private external fun kniBridge457(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge458")
private external fun kniBridge458(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge459")
private external fun kniBridge459(p0: Int): UInt
@SymbolName("sdl_kniBridge460")
private external fun kniBridge460(p0: Int): NativePtr
@SymbolName("sdl_kniBridge461")
private external fun kniBridge461(p0: Int): NativePtr
@SymbolName("sdl_kniBridge462")
private external fun kniBridge462(p0: Int): NativePtr
@SymbolName("sdl_kniBridge463")
private external fun kniBridge463(p0: Int): NativePtr
@SymbolName("sdl_kniBridge464")
private external fun kniBridge464(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge465")
private external fun kniBridge465(p0: NativePtr): Int
@SymbolName("sdl_kniBridge466")
private external fun kniBridge466(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge467")
private external fun kniBridge467(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge468")
private external fun kniBridge468(p0: NativePtr): UShort
@SymbolName("sdl_kniBridge469")
private external fun kniBridge469(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge470")
private external fun kniBridge470(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge471")
private external fun kniBridge471(p0: Int): Int
@SymbolName("sdl_kniBridge472")
private external fun kniBridge472(): Unit
@SymbolName("sdl_kniBridge473")
private external fun kniBridge473(p0: NativePtr): Int
@SymbolName("sdl_kniBridge474")
private external fun kniBridge474(p0: Int): NativePtr
@SymbolName("sdl_kniBridge475")
private external fun kniBridge475(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge476")
private external fun kniBridge476(p0: NativePtr, p1: Int): Short
@SymbolName("sdl_kniBridge477")
private external fun kniBridge477(p0: NativePtr): Int
@SymbolName("sdl_kniBridge478")
private external fun kniBridge478(p0: Int): NativePtr
@SymbolName("sdl_kniBridge479")
private external fun kniBridge479(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge480")
private external fun kniBridge480(p0: NativePtr, p1: Int): UByte
@SymbolName("sdl_kniBridge481")
private external fun kniBridge481(p0: NativePtr, p1: UShort, p2: UShort, p3: UInt): Int
@SymbolName("sdl_kniBridge482")
private external fun kniBridge482(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge483")
private external fun kniBridge483(): Int
@SymbolName("sdl_kniBridge484")
private external fun kniBridge484(p0: Int): Long
@SymbolName("sdl_kniBridge485")
private external fun kniBridge485(p0: Long): Int
@SymbolName("sdl_kniBridge486")
private external fun kniBridge486(p0: Long): Int
@SymbolName("sdl_kniBridge487")
private external fun kniBridge487(p0: Long, p1: Int): NativePtr
@SymbolName("sdl_kniBridge488")
private external fun kniBridge488(p0: Long): Int
@SymbolName("sdl_kniBridge489")
private external fun kniBridge489(p0: NativePtr): Int
@SymbolName("sdl_kniBridge490")
private external fun kniBridge490(p0: Long, p1: NativePtr): Int
@SymbolName("sdl_kniBridge491")
private external fun kniBridge491(p0: Long, p1: NativePtr): Int
@SymbolName("sdl_kniBridge492")
private external fun kniBridge492(): Unit
@SymbolName("sdl_kniBridge493")
private external fun kniBridge493(p0: NativePtr, p1: Int, p2: UInt, p3: UInt, p4: UInt): Int
@SymbolName("sdl_kniBridge494")
private external fun kniBridge494(p0: UInt): UInt
@SymbolName("sdl_kniBridge495")
private external fun kniBridge495(p0: UInt, p1: UInt): UInt
@SymbolName("sdl_kniBridge496")
private external fun kniBridge496(p0: UInt): Unit
@SymbolName("sdl_kniBridge497")
private external fun kniBridge497(p0: UInt, p1: UInt): Unit
@SymbolName("sdl_kniBridge498")
private external fun kniBridge498(p0: NativePtr): Int
@SymbolName("sdl_kniBridge499")
private external fun kniBridge499(p0: NativePtr): Int
@SymbolName("sdl_kniBridge500")
private external fun kniBridge500(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge501")
private external fun kniBridge501(p0: NativePtr): Int
@SymbolName("sdl_kniBridge502")
private external fun kniBridge502(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge503")
private external fun kniBridge503(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge504")
private external fun kniBridge504(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge505")
private external fun kniBridge505(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge506")
private external fun kniBridge506(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge507")
private external fun kniBridge507(p0: UInt, p1: Int): UByte
@SymbolName("sdl_kniBridge508")
private external fun kniBridge508(p0: Int): UInt
@SymbolName("sdl_kniBridge509")
private external fun kniBridge509(): NativePtr
@SymbolName("sdl_kniBridge510")
private external fun kniBridge510(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge511")
private external fun kniBridge511(): Int
@SymbolName("sdl_kniBridge512")
private external fun kniBridge512(p0: Int): NativePtr
@SymbolName("sdl_kniBridge513")
private external fun kniBridge513(p0: Int): NativePtr
@SymbolName("sdl_kniBridge514")
private external fun kniBridge514(p0: Int): Int
@SymbolName("sdl_kniBridge515")
private external fun kniBridge515(p0: NativePtr): Int
@SymbolName("sdl_kniBridge516")
private external fun kniBridge516(): Int
@SymbolName("sdl_kniBridge517")
private external fun kniBridge517(): NativePtr
@SymbolName("sdl_kniBridge518")
private external fun kniBridge518(p0: NativePtr): Int
@SymbolName("sdl_kniBridge519")
private external fun kniBridge519(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge520")
private external fun kniBridge520(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge521")
private external fun kniBridge521(p0: NativePtr): Int
@SymbolName("sdl_kniBridge522")
private external fun kniBridge522(p0: NativePtr): Int
@SymbolName("sdl_kniBridge523")
private external fun kniBridge523(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge524")
private external fun kniBridge524(p0: NativePtr): Int
@SymbolName("sdl_kniBridge525")
private external fun kniBridge525(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge526")
private external fun kniBridge526(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge527")
private external fun kniBridge527(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("sdl_kniBridge528")
private external fun kniBridge528(p0: NativePtr, p1: Int, p2: UInt): Int
@SymbolName("sdl_kniBridge529")
private external fun kniBridge529(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge530")
private external fun kniBridge530(p0: NativePtr, p1: Int): Unit
@SymbolName("sdl_kniBridge531")
private external fun kniBridge531(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge532")
private external fun kniBridge532(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge533")
private external fun kniBridge533(p0: NativePtr, p1: Int): Int
@SymbolName("sdl_kniBridge534")
private external fun kniBridge534(p0: NativePtr): Int
@SymbolName("sdl_kniBridge535")
private external fun kniBridge535(p0: NativePtr): Int
@SymbolName("sdl_kniBridge536")
private external fun kniBridge536(p0: NativePtr): Int
@SymbolName("sdl_kniBridge537")
private external fun kniBridge537(p0: NativePtr): Int
@SymbolName("sdl_kniBridge538")
private external fun kniBridge538(p0: NativePtr): Int
@SymbolName("sdl_kniBridge539")
private external fun kniBridge539(p0: NativePtr, p1: Float, p2: UInt): Int
@SymbolName("sdl_kniBridge540")
private external fun kniBridge540(p0: NativePtr): Int
@SymbolName("sdl_kniBridge541")
private external fun kniBridge541(p0: NativePtr, p1: NativePtr, p2: UInt): UInt
@SymbolName("sdl_kniBridge542")
private external fun kniBridge542(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge543")
private external fun kniBridge543(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge544")
private external fun kniBridge544(p0: NativePtr, p1: UInt): UInt
@SymbolName("sdl_kniBridge545")
private external fun kniBridge545(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge546")
private external fun kniBridge546(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge547")
private external fun kniBridge547(): Unit
@SymbolName("sdl_kniBridge548")
private external fun kniBridge548(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge549")
private external fun kniBridge549(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge550")
private external fun kniBridge550(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge551")
private external fun kniBridge551(p0: UInt): Unit
@SymbolName("sdl_kniBridge552")
private external fun kniBridge552(p0: Int, p1: UInt): Unit
@SymbolName("sdl_kniBridge553")
private external fun kniBridge553(p0: Int): UInt
@SymbolName("sdl_kniBridge554")
private external fun kniBridge554(): Unit
@SymbolName("sdl_kniBridge555")
private external fun kniBridge555(p0: Int, p1: UInt, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sdl_kniBridge556")
private external fun kniBridge556(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge557")
private external fun kniBridge557(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge558")
private external fun kniBridge558(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge559")
private external fun kniBridge559(p0: UInt, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge560")
private external fun kniBridge560(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sdl_kniBridge561")
private external fun kniBridge561(): Int
@SymbolName("sdl_kniBridge562")
private external fun kniBridge562(p0: Int, p1: NativePtr): Int
@SymbolName("sdl_kniBridge563")
private external fun kniBridge563(p0: Int, p1: Int, p2: UInt, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sdl_kniBridge564")
private external fun kniBridge564(p0: NativePtr, p1: Int, p2: UInt): NativePtr
@SymbolName("sdl_kniBridge565")
private external fun kniBridge565(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge566")
private external fun kniBridge566(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge567")
private external fun kniBridge567(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge568")
private external fun kniBridge568(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sdl_kniBridge569")
private external fun kniBridge569(p0: NativePtr, p1: UInt, p2: Int, p3: Int, p4: Int): NativePtr
@SymbolName("sdl_kniBridge570")
private external fun kniBridge570(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sdl_kniBridge571")
private external fun kniBridge571(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sdl_kniBridge572")
private external fun kniBridge572(p0: NativePtr, p1: UByte, p2: UByte, p3: UByte): Int
@SymbolName("sdl_kniBridge573")
private external fun kniBridge573(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge574")
private external fun kniBridge574(p0: NativePtr, p1: UByte): Int
@SymbolName("sdl_kniBridge575")
private external fun kniBridge575(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge576")
private external fun kniBridge576(p0: NativePtr, p1: UInt): Int
@SymbolName("sdl_kniBridge577")
private external fun kniBridge577(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge578")
private external fun kniBridge578(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("sdl_kniBridge579")
private external fun kniBridge579(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr, p5: Int, p6: NativePtr, p7: Int): Int
@SymbolName("sdl_kniBridge580")
private external fun kniBridge580(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge581")
private external fun kniBridge581(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge582")
private external fun kniBridge582(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge583")
private external fun kniBridge583(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge584")
private external fun kniBridge584(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge585")
private external fun kniBridge585(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("sdl_kniBridge586")
private external fun kniBridge586(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge587")
private external fun kniBridge587(p0: NativePtr, p1: UInt): Int
@SymbolName("sdl_kniBridge588")
private external fun kniBridge588(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge589")
private external fun kniBridge589(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge590")
private external fun kniBridge590(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge591")
private external fun kniBridge591(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge592")
private external fun kniBridge592(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sdl_kniBridge593")
private external fun kniBridge593(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge594")
private external fun kniBridge594(p0: NativePtr, p1: Float, p2: Float): Int
@SymbolName("sdl_kniBridge595")
private external fun kniBridge595(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sdl_kniBridge596")
private external fun kniBridge596(p0: NativePtr, p1: UByte, p2: UByte, p3: UByte, p4: UByte): Int
@SymbolName("sdl_kniBridge597")
private external fun kniBridge597(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sdl_kniBridge598")
private external fun kniBridge598(p0: NativePtr, p1: UInt): Int
@SymbolName("sdl_kniBridge599")
private external fun kniBridge599(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge600")
private external fun kniBridge600(p0: NativePtr): Int
@SymbolName("sdl_kniBridge601")
private external fun kniBridge601(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("sdl_kniBridge602")
private external fun kniBridge602(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge603")
private external fun kniBridge603(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int): Int
@SymbolName("sdl_kniBridge604")
private external fun kniBridge604(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge605")
private external fun kniBridge605(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge606")
private external fun kniBridge606(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge607")
private external fun kniBridge607(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge608")
private external fun kniBridge608(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge609")
private external fun kniBridge609(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge610")
private external fun kniBridge610(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Double, p5: NativePtr, p6: UInt): Int
@SymbolName("sdl_kniBridge611")
private external fun kniBridge611(p0: NativePtr, p1: Float, p2: Float): Int
@SymbolName("sdl_kniBridge612")
private external fun kniBridge612(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge613")
private external fun kniBridge613(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Int
@SymbolName("sdl_kniBridge614")
private external fun kniBridge614(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge615")
private external fun kniBridge615(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge616")
private external fun kniBridge616(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge617")
private external fun kniBridge617(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge618")
private external fun kniBridge618(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge619")
private external fun kniBridge619(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sdl_kniBridge620")
private external fun kniBridge620(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Double, p5: NativePtr, p6: UInt): Int
@SymbolName("sdl_kniBridge621")
private external fun kniBridge621(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr, p4: Int): Int
@SymbolName("sdl_kniBridge622")
private external fun kniBridge622(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge623")
private external fun kniBridge623(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge624")
private external fun kniBridge624(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge625")
private external fun kniBridge625(p0: NativePtr): Int
@SymbolName("sdl_kniBridge626")
private external fun kniBridge626(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sdl_kniBridge627")
private external fun kniBridge627(p0: NativePtr): Int
@SymbolName("sdl_kniBridge628")
private external fun kniBridge628(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge629")
private external fun kniBridge629(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge630")
private external fun kniBridge630(): Int
@SymbolName("sdl_kniBridge631")
private external fun kniBridge631(p0: Int): NativePtr
@SymbolName("sdl_kniBridge632")
private external fun kniBridge632(p0: Int): Int
@SymbolName("sdl_kniBridge633")
private external fun kniBridge633(p0: Int): Int
@SymbolName("sdl_kniBridge634")
private external fun kniBridge634(p0: Int): Int
@SymbolName("sdl_kniBridge635")
private external fun kniBridge635(p0: Int): NativePtr
@SymbolName("sdl_kniBridge636")
private external fun kniBridge636(p0: Int): NativePtr
@SymbolName("sdl_kniBridge637")
private external fun kniBridge637(p0: NativePtr): NativePtr
@SymbolName("sdl_kniBridge638")
private external fun kniBridge638(p0: NativePtr): Int
@SymbolName("sdl_kniBridge639")
private external fun kniBridge639(p0: NativePtr): Int
@SymbolName("sdl_kniBridge640")
private external fun kniBridge640(p0: NativePtr): Int
@SymbolName("sdl_kniBridge641")
private external fun kniBridge641(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sdl_kniBridge642")
private external fun kniBridge642(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge643")
private external fun kniBridge643(): Unit
@SymbolName("sdl_kniBridge644")
private external fun kniBridge644(p0: NativePtr, p1: UInt, p2: UInt, p3: UInt, p4: UInt, p5: UInt): NativePtr
@SymbolName("sdl_kniBridge645")
private external fun kniBridge645(p0: NativePtr): UInt
@SymbolName("sdl_kniBridge646")
private external fun kniBridge646(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sdl_kniBridge647")
private external fun kniBridge647(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sdl_kniBridge648")
private external fun kniBridge648(): UInt
@SymbolName("sdl_kniBridge649")
private external fun kniBridge649(): UInt
@SymbolName("sdl_kniBridge650")
private external fun kniBridge650(): ULong
@SymbolName("sdl_kniBridge651")
private external fun kniBridge651(): ULong
@SymbolName("sdl_kniBridge652")
private external fun kniBridge652(p0: UInt): Unit
@SymbolName("sdl_kniBridge653")
private external fun kniBridge653(p0: UInt, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sdl_kniBridge654")
private external fun kniBridge654(p0: Int): UInt
@SymbolName("sdl_kniBridge655")
private external fun kniBridge655(p0: NativePtr): Unit
@SymbolName("sdl_kniBridge656")
private external fun kniBridge656(): NativePtr
@SymbolName("sdl_kniBridge657")
private external fun kniBridge657(): Int
@SymbolName("sdl_kniBridge658")
private external fun kniBridge658(p0: UInt): Int
@SymbolName("sdl_kniBridge659")
private external fun kniBridge659(p0: UInt): Int
@SymbolName("sdl_kniBridge660")
private external fun kniBridge660(p0: UInt): Unit
@SymbolName("sdl_kniBridge661")
private external fun kniBridge661(p0: UInt): UInt
@SymbolName("sdl_kniBridge662")
private external fun kniBridge662(): Unit
@SymbolName("sdl_kniBridge663")
private external fun kniBridge663(): NativePtr
@SymbolName("sdl_kniBridge664")
private external fun kniBridge664(): NativePtr
@SymbolName("sdl_kniBridge665")
private external fun kniBridge665(): NativePtr
