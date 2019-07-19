import java.security.*;


public class Main {

  static private void listEncryptions() {
    for (Provider provider: Security.getProviders()) {
      System.out.println(provider.getName());
      for (String key: provider.stringPropertyNames())
        System.out.println("\t" + key + "\t" + provider.getProperty(key));
    }
  }


  public static void main(String[] args) {
    listEncryptions();
  }

}


