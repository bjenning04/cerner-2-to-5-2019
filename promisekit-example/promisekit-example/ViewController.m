// cerner_2^5_2019
// Simple Objective-C implementation of PromiseKit.
#import "ViewController.h"
#import <PromiseKit/PromiseKit.h>

@interface ViewController ()

@property (weak) IBOutlet NSTextField *url;
@property (unsafe_unretained) IBOutlet NSTextView *content;

@end

@implementation ViewController

- (IBAction)load:(id)sender {
    [self download].then(^(NSString *content) {
        [self.content setString:content ?: @"nil"];
    }).catch(^(NSError *error) {
        [self.content setString:error.localizedDescription];
    });
}

- (AnyPromise *)download {
    return [AnyPromise promiseWithResolverBlock:^(PMKResolver _Nonnull resolver) {
        NSURLSession *session = [NSURLSession sessionWithConfiguration:[NSURLSessionConfiguration defaultSessionConfiguration]];
        NSURLSessionDataTask *task = [session dataTaskWithURL:[NSURL URLWithString:[self.url stringValue]] completionHandler:^(NSData * _Nullable data, NSURLResponse * _Nullable response, NSError * _Nullable error) {
            if (error) {
                resolver(error);
            }
            resolver([[NSString alloc] initWithData:data encoding:NSASCIIStringEncoding]);
        }];
        [task resume];
    }];
}

@end
