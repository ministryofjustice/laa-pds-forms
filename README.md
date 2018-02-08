# laa-pds-forms
laa pds forms


== Setting up postgres locally

from the terminal  window type psql
 
CREATE ROLE pds WITH LOGIN PASSWORD ‘password’;
\q
psql postgres -U pds
CREATE DATABASE laa_pds_forms;
GRANT ALL PRIVILEGES ON DATABASE laa_pds_forms TO pds;

== running  liquibase

