""" This module parses JSON objects from log files and writes them to separate files """
# cerner_2^5_2019
import sys
import uuid
import os
import errno
import regex

def parse_json_from_logs(input_filename, output_directory):
    """ This function parses the contents of the given log file into separate JSON files """
    # Read input file.
    in_file = open(input_filename, "r")
    text = in_file.read()
    in_file.close()

    # Create output directory if it doesn't exist.
    try:
        os.makedirs(output_directory)
    except OSError as ex:
        if ex.errno != errno.EEXIST:
            raise

    # Parse and output JSON objects to separate files.
    counter = 1
    for match in regex.findall(r"\{(?:[^{}]|(?R))*\}", text):
        out_file = open("%s/%s.json" % (output_directory, str(uuid.uuid4())), "w")
        out_file.write(match)
        out_file.close()
        counter += 1

if len(sys.argv) > 2:
    parse_json_from_logs(sys.argv[1], sys.argv[2])