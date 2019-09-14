// cerner_2^5_2019

/**
 Synchronizes the specified code block across threads.
 
 - parameter lock: The object to perform synchronization lock on.
 - parameter body: The block of code to synchronize.
 - returns: The result of the synchronized and executed code block.
 */
@discardableResult
public func synchronized<T>(_ lock: Any, _ body: () throws -> T) rethrows -> T {
    objc_sync_enter(lock)
    defer {
        objc_sync_exit(lock)
    }
    return try body()
}
