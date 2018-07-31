# utils

# Read / Verify Password from Hadoop Credentials file. 

### Hadoop Credential file is used to store password in a different file and in non-plaintext format. 
The sample program help to retrive the password stored in hadoop credetnails file to verify/read it. 

## ReadPass.java 

` $ hadoop credential create javax.jdo.option.ConnectionPassword -value My_mysql_Secret -provider jceks://file/tmp/sql_pass.jceks`
` javax.jdo.option.ConnectionPassword has been successfully created`

## Compile, 

` $ javac -cp /opt/mapr/lib/hadoop-common-2.7.0.jar:. ReadPass.java`

## Run it.

` $ java -cp `hadoop classpath`:. ReadPass`
