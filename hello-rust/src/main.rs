// cerner_2^5_2019
// Basic multi-threaded HTTP server in Rust
use std::io::prelude::*;
use std::net::TcpListener;
use std::net::TcpStream;
use std::thread;

fn main() {
    let listener = TcpListener::bind("127.0.0.1:7878").unwrap();
    for stream in listener.incoming() {
        let stream = stream.unwrap();
        thread::spawn(|| {
            handle_connection(stream);
        });
    }
}

fn handle_connection(mut stream: TcpStream) {
    let mut buffer = [0; 512];
    stream.read(&mut buffer).unwrap();

    let response = if buffer.starts_with(b"GET / HTTP/1.1\r\n") {
        "HTTP/1.1 200 OK\r\n\r\n<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"utf-8\"><title>Hello!</title></head><body><h1>Hello!</h1><p>Hi from Rust</p></body></html>"
    } else {
        "HTTP/1.1 404 NOT FOUND\r\n\r\n<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"utf-8\"><title>Hello!</title></head><body><h1>Oops!</h1><p>Sorry, I don't know what you're asking for.</p></body></html>"
    };

    stream.write(response.as_bytes()).unwrap();
    stream.flush().unwrap();
}