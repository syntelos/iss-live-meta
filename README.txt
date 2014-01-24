
Abstract

    Example application pulls JSON telemetry data from
    http://spacestationlive.jsc.nasa.gov/ : Space State Live Data API
    protocol and catalog meta data for the Liverstreamer server.  Code
    and catalog for looking into data values and schema units.

Quick start

    ./run.sh

Usage

    ./run.sh [CONSOLE|SYMBOL]*

    Watch any combination of consoles, e.g. "VVO" or "SPARTAN", or
    symbols, e.g. "S0000001" or "S0000003". Default "VVO".

Package "client"

    A particularly transparent implementation of a working HTTP
    protocol for talking to the Space State Live application.

Table "schema"

    File "schema.tsv" lists meta data as tab separated values with the
    following columns: name (symbol), console (mission control), tmtc
    (a derived symbol), units, columns, format type, format, short
    description, long description.  

    See also "schema.java" in this directory, which is run by the
    script named "gen.sh" to generate the catalog found in the schema
    package.

Package "schema"

    Example application of "schema.tsv", catalog meta data in tab
    separated values file, generated into a java enumerated type.

Data values

    Data values from the web stream have both "Value" and
    "CalibratedData" values.  The floating point types (format type
    "sprintf", format "%f") have precision - correct values in their
    "CalibratedData". The enumerated types have their "map range"
    values in their "CalibratedData", and their "map domain" values in
    their "Value" values.

Schema units

    The units detailed in the meta data (including "schema.tsv") are
    likely to contain bugs.  Assumptions like fluid quantities and gas
    pressures have been pulled from a cursory search and applied
    uniformly.  Some other assumptions, like seconds or minutes for
    time units, are far weaker.  Of course, many units are known from
    the descriptions.

Author

    John Pritchard
    Leonardo, NJ, US

    http://www.syntelos.com/

See also

    http://www.lightstreamer.com/
