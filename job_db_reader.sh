#!/bin/bash

# Read the input from the command line or a file
input_data=$(<db/job_hp_db.txt)
# echo $input_data

# Skip the first line (comments)
IFS='\n' read -r -d '' _ < <(tail -n +2 <<< "$input_data")

# Split the remaining input into lines
IFS='\n' read -ra lines <<< "$input_data"
echo ${lines[@]}

# Initialize an array to store the column headers
declare -a headers=("${lines[0]}")
#echo ${headers[@]}

# Initialize an array to store the column data
declare -A data

# Iterate over each line, starting from the third line (index 2)
for ((i=2; i<${#lines[@]}; i++)); do
  IFS=, read -ra values <<< "${lines[i]}"
  for ((j=0; j<${#headers[@]}; j++)); do
    data["${headers[j]}"][$i-2]="${values[j]}"
  done
done

# Print the extracted columns
for header in "${headers[@]}"; do
  echo "A"
  #echo "$header"
  #printf "%s\n" "${data[$header][@]}"
done