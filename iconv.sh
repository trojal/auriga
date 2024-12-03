#!/bin/bash

# Specify the input directory
input_dir="src/char"

# Find all files in the directory
find "$input_dir" -type f -name "*.dsp" | xargs -I {} iconv -f CP932 -t UTF-8 "{}" -o "{}_utf8"
