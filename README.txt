
Package "client": Example code pulling data from
http://spacestationlive.jsc.nasa.gov/

Package "schema": Catalog meta data in tab separated values file, and
java enumerated type.  

Quick start: run 
    ./compile.sh
and
    ./run.sh

Schema units: The units detailed in the meta data (including
schema.tsv) are likely to contain bugs.  Assumptions like fluid
quantities and gas pressures have been pulled from a cursory search
and applied uniformly.  Some other assumptions, like seconds or
minutes for time units, are far weaker.  Of course, many units are
known from the descriptions.
