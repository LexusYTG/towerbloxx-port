package javax.bluetooth;

public interface ServiceRecord {
    int NOAUTHENTICATE_NOENCRYPT = 0;
    int AUTHENTICATE_NOENCRYPT = 1;
    int AUTHENTICATE_ENCRYPT = 2;

    RemoteDevice getHostDevice();
    String getConnectionURL(int requiredSecurity, boolean mustBeMaster);
    boolean setDeviceServiceClasses(int classes);
}
