public class Int32toIPv4 {
    public static String longToIP(long ip) {
        byte a = (byte) ((ip));
        byte b = (byte) ((ip >>> 8));
        byte c = (byte) ((ip >>> 16));
        byte d = (byte) ((ip >>> 24));
        return (d&0xff)+"."+(c&0xff)+"."+(b&0xff)+"."+(a&0xff);
    }

    public static void main(String[] args) {
        System.out.println(longToIP(2149583361L));
    }
}
