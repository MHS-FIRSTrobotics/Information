package com.ftdi.j2xx;

public class FT_EEPROM_232R extends FT_EEPROM
{
    public byte CBus0;
    public byte CBus1;
    public byte CBus2;
    public byte CBus3;
    public byte CBus4;
    public boolean ExternalOscillator;
    public boolean HighIO;
    public boolean InvertCTS;
    public boolean InvertDCD;
    public boolean InvertDSR;
    public boolean InvertDTR;
    public boolean InvertRI;
    public boolean InvertRTS;
    public boolean InvertRXD;
    public boolean InvertTXD;
    public boolean LoadVCP;
    
    public FT_EEPROM_232R() {
        this.HighIO = false;
        this.ExternalOscillator = false;
        this.InvertTXD = false;
        this.InvertRXD = false;
        this.InvertRTS = false;
        this.InvertCTS = false;
        this.InvertDTR = false;
        this.InvertDSR = false;
        this.InvertDCD = false;
        this.InvertRI = false;
        this.CBus0 = 0;
        this.CBus1 = 0;
        this.CBus2 = 0;
        this.CBus3 = 0;
        this.CBus4 = 0;
        this.LoadVCP = false;
    }
    
    public static final class CBUS
    {
    }
}