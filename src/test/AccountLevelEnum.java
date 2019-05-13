package test;

public enum AccountLevelEnum {
    OTHERS("其它", (byte)0),
    CAMPUS_AMBASSADOR("校园大使", (byte)1),;
    
    private String type;
    private byte id;
    private AccountLevelEnum(String type, byte id) {
        this.type = type;
        this.id = id;
    }
    
    public byte getId() {
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public static String getType(byte id) {
        for (AccountLevelEnum c : AccountLevelEnum.values()) {
             if (c.getId() == id) {
                return c.type;
             }
        }
        return null;
    }
}
