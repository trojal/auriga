#!/bin/bash

# Get the current directory
directory="src/char/txt"

# Specify the old and new extensions (adjust as needed)
old_extension="dsp_utf8"
new_extension="dsp"

# Loop through each file in the directory
for file in "$directory"/*.$old_extension; do
  # Check if the file is a regular file
  if [[ -f "$file" ]]; then
    # Get the filename without the extension
    filename="${file%.$old_extension}"

    # Construct the new filename with the new extension
    new_file="$filename.$new_extension"

    # Rename the file
    mv "$file" "$new_file"
  fi
done