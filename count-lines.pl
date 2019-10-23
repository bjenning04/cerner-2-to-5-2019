# cerner_2^5_2019
# Simple Perl program to count number of blank, commented, and code lines in a program. Only counts single line
# comments, does not handle block comments. Please change the regular expression for comments to match the file's
# programming language.
use strict;

# Retrieves blank, commented, and actual code line statistics for a specified file.
sub count {
    my ($fn) = @_;

    open(IN, $fn) or return (-1, $!);

    my $nblank = 0;
    my $ncomm = 0;
    my $ncode = 0;

    while(my $line = <IN>) {
        if($line =~ /^\s*$/) { ++$nblank; }        # Blank line
        elsif($line =~ /^\s*\;/) { ++$ncomm; }     # Comment line
        else { ++$ncode; }                         # Code line
    }

    close IN;

    return ($nblank, $ncomm, $ncode);
}

# Calculate the padding so that filenames and stats are aligned.
my $npadding = length ((
    map { $_->[0] }
    sort { $b->[1] <=> $a->[1] }
    map { [ $_, length $_ ] } @ARGV
)[0]) + 2;

while(my $fn = shift @ARGV) {
    #Print the filename with padding so that all the filenames and stats are aligned.
    printf("%-*s", $npadding, "$fn:");

    my ($blcount, $commcount, $codecount) = count($fn);
    if($blcount < 0) {
        print "Not readable.\n";
    } else {
        print "$codecount code lines, $blcount blank lines, $commcount comments.\n";
    }
}