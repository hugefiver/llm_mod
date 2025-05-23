package com.reprisesoftware.rlm;

/* loaded from: rlm1603.jar:com/reprisesoftware/rlm/RlmAvailableProduct.class */
public class RlmAvailableProduct implements RlmConstants {
    private String name;
    private String version;
    private String actKey;
    private int count;
    private String contract;
    private String customer;
    private int expDays;
    private String expTime;
    private String expiration;
    private int inUse;
    private int resInUse;
    private int hostBased;
    private String hostId;
    private int hold;
    private boolean isMetered;
    private String issuer;
    private int maxRoam;
    private int maxRoamCount;
    private int maxShare;
    private int meterCounter;
    private int meterCurCount;
    private int minRemove;
    private int minCheckout;
    private int minTimeout;
    private int namedUserCount;
    private int nRes;
    private int nRoamAllowed;
    private String options;
    private int currentRoam;
    private String server;
    private int share;
    private int softLimit;
    private String start;
    private int timeout;
    private int timezone;
    private boolean isAlias;
    private boolean isFloating;
    private boolean isNodelocked;
    private boolean isRoaming;
    private boolean isSingle;
    private boolean isTokenBased;
    private int type;
    private int userBased;
    private int clientCache;
    private long prodHandle;
    private int index;

    RlmAvailableProduct() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    protected void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    protected void setActKey(String actKey) {
        this.actKey = actKey;
    }

    public String getActKey() {
        return this.actKey;
    }

    protected void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    protected void setContract(String contract) {
        this.contract = contract;
    }

    public String getContract() {
        return this.contract;
    }

    protected void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return this.customer;
    }

    protected void setExpTime(String expTime) {
        this.expTime = expTime;
    }

    public String getExpTime() {
        return this.expTime;
    }

    protected void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getExpiration() {
        return this.expiration;
    }

    protected void setExpDays(int expDays) {
        this.expDays = expDays;
    }

    public int getExpDays() {
        return this.expDays;
    }

    protected void setCurrentInUse(int count) {
        this.inUse = count;
    }

    public int getCurrentInUse() {
        return this.inUse;
    }

    protected void setCurrentResUse(int count) {
        this.resInUse = count;
    }

    public int getCurrentResUse() {
        return this.resInUse;
    }

    protected void setHostBased(int count) {
        this.hostBased = count;
    }

    public int getHostBased() {
        return this.hostBased;
    }

    protected void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostId() {
        return this.hostId;
    }

    protected void setHold(int count) {
        this.hold = count;
    }

    public int getHold() {
        return this.hold;
    }

    protected void setIsMetered(int isMetered) {
        if (isMetered != 0) {
            this.isMetered = true;
        } else {
            this.isMetered = false;
        }
    }

    public boolean getIsMetered() {
        return this.isMetered;
    }

    protected void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssuer() {
        return this.issuer;
    }

    protected void setMaxRoam(int count) {
        this.maxRoam = count;
    }

    public int getMaxRoam() {
        return this.maxRoam;
    }

    protected void setMaxRoamCount(int count) {
        this.maxRoamCount = count;
    }

    public int getMaxRoamCount() {
        return this.maxRoamCount;
    }

    protected void setMaxShare(int count) {
        this.maxShare = count;
    }

    public int getMaxShare() {
        return this.maxShare;
    }

    protected void setMeterCounter(int counter) {
        this.meterCounter = counter;
    }

    public int getMeterCounter() {
        return this.meterCounter;
    }

    protected void setMeterCurCount(int count) {
        this.meterCurCount = count;
    }

    public int getMeterCurCount() {
        return this.meterCurCount;
    }

    protected void setMinCheckout(int count) {
        this.minCheckout = count;
    }

    public int getMinCheckout() {
        return this.minCheckout;
    }

    protected void setMinTimeout(int count) {
        this.minTimeout = count;
    }

    public int getMinTimeout() {
        return this.minTimeout;
    }

    protected void setMinRemove(int count) {
        this.minRemove = count;
    }

    public int getMinRemove() {
        return this.minRemove;
    }

    protected void setNamedUserCount(int count) {
        this.namedUserCount = count;
    }

    public int getNamedUserCount() {
        return this.namedUserCount;
    }

    protected void setNRes(int count) {
        this.nRes = count;
    }

    public int getNRes() {
        return this.nRes;
    }

    protected void setNRoamAllowed(int count) {
        this.nRoamAllowed = count;
    }

    public int getNRoamAllowed() {
        return this.nRoamAllowed;
    }

    protected void setCurrentRoam(int count) {
        this.currentRoam = count;
    }

    public int getCurrentRoam() {
        return this.currentRoam;
    }

    protected void setOptions(String options) {
        this.options = options;
    }

    public String getOptions() {
        return this.options;
    }

    protected void setServer(String server) {
        this.server = server;
    }

    public String getServer() {
        return this.server;
    }

    protected void setShare(int count) {
        this.share = count;
    }

    public int getShare() {
        return this.share;
    }

    protected void setSoftLimit(int count) {
        this.softLimit = count;
    }

    public int getSoftLimit() {
        return this.softLimit;
    }

    protected void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return this.start;
    }

    protected void setTimeout(int count) {
        this.timeout = count;
    }

    public int getTimeout() {
        return this.timeout;
    }

    protected void setTimezone(int count) {
        this.timezone = count;
    }

    public int getTimezone() {
        return this.timezone;
    }

    protected void setIsAlias(int alias) {
        if (alias == 0) {
            this.isAlias = false;
        } else {
            this.isAlias = true;
        }
    }

    public boolean getIsAlias() {
        return this.isAlias;
    }

    protected void setIsFloating(int floating) {
        if (floating == 0) {
            this.isFloating = false;
        } else {
            this.isFloating = true;
        }
    }

    public boolean getIsFloating() {
        return this.isFloating;
    }

    protected void setIsNodelocked(int nodelocked) {
        if (nodelocked == 0) {
            this.isNodelocked = false;
        } else {
            this.isNodelocked = true;
        }
    }

    public boolean getIsNodelocked() {
        return this.isNodelocked;
    }

    protected void setIsRoaming(int roaming) {
        if (roaming == 0) {
            this.isRoaming = false;
        } else {
            this.isRoaming = true;
        }
    }

    public boolean getIsRoaming() {
        return this.isRoaming;
    }

    protected void setIsSingle(int single) {
        if (single == 0) {
            this.isSingle = false;
        } else {
            this.isSingle = true;
        }
    }

    public boolean getIsSingle() {
        return this.isSingle;
    }

    protected void setIsTokenBased(boolean tokenBased) {
        this.isTokenBased = tokenBased;
    }

    protected void setIsTokenBased(int tokenBased) {
        if (tokenBased == 0) {
            this.isTokenBased = false;
        } else {
            this.isTokenBased = true;
        }
    }

    public boolean getIsTokenBased() {
        return this.isTokenBased;
    }

    protected void setType(int count) {
        this.type = count;
    }

    public int getType() {
        return this.type;
    }

    protected void setUserBased(int count) {
        this.userBased = count;
    }

    public int getUserBased() {
        return this.userBased;
    }

    protected void setClientCache(int cache) {
        this.clientCache = cache;
    }

    protected int getClientCache() {
        return this.clientCache;
    }

    protected void setProdHandle(long prodHandle) {
        this.prodHandle = prodHandle;
    }

    protected long getProdHandle() {
        return this.prodHandle;
    }

    protected void setIndex(int index) {
        this.index = index;
    }

    protected int getIndex() {
        return this.index;
    }
}
