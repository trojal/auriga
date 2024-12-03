#!/bin/bash

# Specify the input directory
input_dir="conf"

# Find all files in the directory and print the filename before conversion
find "$input_dir" -type f -name "*.conf" | while read file; do
  echo "Converting: $file"
  iconv -f CP932 -t UTF-8 "$file" -o "${file}_utf8"
done
