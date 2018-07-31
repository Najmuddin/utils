import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

public class ReadPass{
  public static void main(String[] args) throws IOException {
     Configuration conf = new Configuration();
     conf.addResource(new Path("file:///","/tmp/my-site.xml"));
     String pass = String.valueOf(conf.getPassword("<Alias_given_while_creating_creds_file>" ));
     System.out.println("PASS" + pass );

  }
}
