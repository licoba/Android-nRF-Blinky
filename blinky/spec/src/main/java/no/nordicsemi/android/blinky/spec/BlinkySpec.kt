package no.nordicsemi.android.blinky.spec

import java.util.UUID

class BlinkySpec {
    companion object {
        val BLINKY_SERVICE_UUID: UUID = UUID.fromString("00001523-1212-efde-1523-785feabcd123")
        val BLINKY_BUTTON_CHARACTERISTIC_UUID: UUID = UUID.fromString("00001524-1212-efde-1523-785feabcd123")
        val BLINKY_LED_CHARACTERISTIC_UUID: UUID = UUID.fromString("00001525-1212-efde-1523-785feabcd123")
    }

}

enum class ScanUUIDFilter(val uuidString: String) {
    WT2(UUIDWith("6f25")),
    WT2_BK(UUIDWith("6f26")),
    M2(UUIDWith("6f27")),
    WT2_Edge(UUIDWith("6f28")),
    WT2_Edge_Fac(UUIDWith("6f20")),
    W_UPGRADE(StandardUUIDWith("FE59")),
    M2P(UUIDWith("6f29")),
    M3(UUIDWith("6f2a")),
    W3Pro(UUIDWith("6f31")),
    W3Pro_Fac(UUIDWith("6f32"));
}

fun UUIDWith(channel: String): String {
    return "592e$channel-432f-4669-84b1-ddc45cc40dd9"
}

fun StandardUUIDWith(channel: String): String {
    return "0000$channel-0000-1000-8000-00805f9b34fb"
}