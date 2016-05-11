	//Name______________________________ Date_____________
   public class EMail
   {
      private String myUserName;
      private String myHostName;
      private String myExtension;
      public EMail(String address)
      {
         	int at = address.indexOf('@');
            myUserName = address.substring(0, at);
            int period = address.lastIndexOf('.');
            myHostName = address.substring(at + 1, period);
            myExtension = address.substring(period + 1);
            /************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public String getUserName()
      {
         return myUserName;
      }
      public String getHostName()
      {
         return myHostName;
      }
      public String getExtension()
      {
         return myExtension;
      }
      public String toString()
      {
         	return myUserName + "@" + myHostName + "." + myExtension;
      }
   }