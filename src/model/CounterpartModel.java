package model;

public class CounterpartModel {
    private String proCode;
    private String conCode;

    public CounterpartModel() {
    }
    
    public CounterpartModel(String proCode, String conCode) {
        setProCode(proCode);
        setConCode(conCode);
    }
    
    public String getProCode() {
        return proCode;
    }
    public void setProCode(String proCode) {
        this.proCode = proCode;
    }
    public String getConCode() {
        return conCode;
    }
    public void setConCode(String conCode) {
        this.conCode = conCode;
    }
    
}
