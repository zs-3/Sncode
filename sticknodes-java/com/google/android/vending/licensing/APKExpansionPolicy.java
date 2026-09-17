package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public class APKExpansionPolicy implements com.google.android.vending.licensing.Policy {
    private static final java.lang.String DEFAULT_MAX_RETRIES = "0";
    private static final java.lang.String DEFAULT_RETRY_COUNT = "0";
    private static final java.lang.String DEFAULT_RETRY_UNTIL = "0";
    private static final java.lang.String DEFAULT_VALIDITY_TIMESTAMP = "0";
    public static final int MAIN_FILE_URL_INDEX = 0;
    private static final long MILLIS_PER_MINUTE = 60000;
    public static final int PATCH_FILE_URL_INDEX = 1;
    private static final java.lang.String PREFS_FILE = "com.android.vending.licensing.APKExpansionPolicy";
    private static final java.lang.String PREF_LAST_RESPONSE = "lastResponse";
    private static final java.lang.String PREF_MAX_RETRIES = "maxRetries";
    private static final java.lang.String PREF_RETRY_COUNT = "retryCount";
    private static final java.lang.String PREF_RETRY_UNTIL = "retryUntil";
    private static final java.lang.String PREF_VALIDITY_TIMESTAMP = "validityTimestamp";
    private static final java.lang.String TAG = "APKExpansionPolicy";
    private java.util.Vector<java.lang.String> mExpansionFileNames;
    private java.util.Vector<java.lang.Long> mExpansionFileSizes;
    private java.util.Vector<java.lang.String> mExpansionURLs;
    private int mLastResponse;
    private long mLastResponseTime;
    private long mMaxRetries;
    private com.google.android.vending.licensing.PreferenceObfuscator mPreferences;
    private long mRetryCount;
    private long mRetryUntil;
    private long mValidityTimestamp;

    public APKExpansionPolicy(android.content.Context r3, com.google.android.vending.licensing.Obfuscator r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mLastResponseTime = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r2.mExpansionURLs = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r2.mExpansionFileNames = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r2.mExpansionFileSizes = r0
            java.lang.String r0 = "com.android.vending.licensing.APKExpansionPolicy"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            com.google.android.vending.licensing.PreferenceObfuscator r0 = new com.google.android.vending.licensing.PreferenceObfuscator
            r0.<init>(r3, r4)
            r2.mPreferences = r0
            r3 = 291(0x123, float:4.08E-43)
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "lastResponse"
            java.lang.String r3 = r0.getString(r4, r3)
            int r3 = java.lang.Integer.parseInt(r3)
            r2.mLastResponse = r3
            com.google.android.vending.licensing.PreferenceObfuscator r3 = r2.mPreferences
            java.lang.String r4 = "validityTimestamp"
            java.lang.String r0 = "0"
            java.lang.String r3 = r3.getString(r4, r0)
            long r3 = java.lang.Long.parseLong(r3)
            r2.mValidityTimestamp = r3
            com.google.android.vending.licensing.PreferenceObfuscator r3 = r2.mPreferences
            java.lang.String r4 = "retryUntil"
            java.lang.String r3 = r3.getString(r4, r0)
            long r3 = java.lang.Long.parseLong(r3)
            r2.mRetryUntil = r3
            com.google.android.vending.licensing.PreferenceObfuscator r3 = r2.mPreferences
            java.lang.String r4 = "maxRetries"
            java.lang.String r3 = r3.getString(r4, r0)
            long r3 = java.lang.Long.parseLong(r3)
            r2.mMaxRetries = r3
            com.google.android.vending.licensing.PreferenceObfuscator r3 = r2.mPreferences
            java.lang.String r4 = "retryCount"
            java.lang.String r3 = r3.getString(r4, r0)
            long r3 = java.lang.Long.parseLong(r3)
            r2.mRetryCount = r3
            return
    }

    private java.util.Map<java.lang.String, java.lang.String> decodeExtras(java.lang.String r6) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L5a
            r2.<init>()     // Catch: java.net.URISyntaxException -> L5a
            java.lang.String r3 = "?"
            r2.append(r3)     // Catch: java.net.URISyntaxException -> L5a
            r2.append(r6)     // Catch: java.net.URISyntaxException -> L5a
            java.lang.String r6 = r2.toString()     // Catch: java.net.URISyntaxException -> L5a
            r1.<init>(r6)     // Catch: java.net.URISyntaxException -> L5a
            java.lang.String r6 = "UTF-8"
            java.util.List r6 = org.apache.http.client.utils.URLEncodedUtils.parse(r1, r6)     // Catch: java.net.URISyntaxException -> L5a
            java.util.Iterator r6 = r6.iterator()     // Catch: java.net.URISyntaxException -> L5a
        L25:
            boolean r1 = r6.hasNext()     // Catch: java.net.URISyntaxException -> L5a
            if (r1 == 0) goto L61
            java.lang.Object r1 = r6.next()     // Catch: java.net.URISyntaxException -> L5a
            org.apache.http.NameValuePair r1 = (org.apache.http.NameValuePair) r1     // Catch: java.net.URISyntaxException -> L5a
            java.lang.String r2 = r1.getName()     // Catch: java.net.URISyntaxException -> L5a
            r3 = 0
        L36:
            boolean r4 = r0.containsKey(r2)     // Catch: java.net.URISyntaxException -> L5a
            if (r4 == 0) goto L52
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L5a
            r2.<init>()     // Catch: java.net.URISyntaxException -> L5a
            java.lang.String r4 = r1.getName()     // Catch: java.net.URISyntaxException -> L5a
            r2.append(r4)     // Catch: java.net.URISyntaxException -> L5a
            int r3 = r3 + 1
            r2.append(r3)     // Catch: java.net.URISyntaxException -> L5a
            java.lang.String r2 = r2.toString()     // Catch: java.net.URISyntaxException -> L5a
            goto L36
        L52:
            java.lang.String r1 = r1.getValue()     // Catch: java.net.URISyntaxException -> L5a
            r0.put(r2, r1)     // Catch: java.net.URISyntaxException -> L5a
            goto L25
        L5a:
            java.lang.String r6 = "APKExpansionPolicy"
            java.lang.String r1 = "Invalid syntax error while decoding extras data from server."
            android.util.Log.w(r6, r1)
        L61:
            return r0
    }

    private void setLastResponse(int r3) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.mLastResponseTime = r0
            r2.mLastResponse = r3
            com.google.android.vending.licensing.PreferenceObfuscator r0 = r2.mPreferences
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r1 = "lastResponse"
            r0.putString(r1, r3)
            return
    }

    private void setMaxRetries(java.lang.String r3) {
            r2 = this;
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L9
            goto L18
        L9:
            java.lang.String r3 = "APKExpansionPolicy"
            java.lang.String r0 = "Licence retry count (GR) missing, grace period disabled"
            android.util.Log.w(r3, r0)
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "0"
        L18:
            long r0 = r0.longValue()
            r2.mMaxRetries = r0
            com.google.android.vending.licensing.PreferenceObfuscator r0 = r2.mPreferences
            java.lang.String r1 = "maxRetries"
            r0.putString(r1, r3)
            return
    }

    private void setRetryCount(long r2) {
            r1 = this;
            r1.mRetryCount = r2
            com.google.android.vending.licensing.PreferenceObfuscator r0 = r1.mPreferences
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "retryCount"
            r0.putString(r3, r2)
            return
    }

    private void setRetryUntil(java.lang.String r3) {
            r2 = this;
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L9
            goto L18
        L9:
            java.lang.String r3 = "APKExpansionPolicy"
            java.lang.String r0 = "License retry timestamp (GT) missing, grace period disabled"
            android.util.Log.w(r3, r0)
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "0"
        L18:
            long r0 = r0.longValue()
            r2.mRetryUntil = r0
            com.google.android.vending.licensing.PreferenceObfuscator r0 = r2.mPreferences
            java.lang.String r1 = "retryUntil"
            r0.putString(r1, r3)
            return
    }

    private void setValidityTimestamp(java.lang.String r5) {
            r4 = this;
            long r0 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L9
            goto L24
        L9:
            java.lang.String r5 = "APKExpansionPolicy"
            java.lang.String r0 = "License validity timestamp (VT) missing, caching for a minute"
            android.util.Log.w(r5, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r0.longValue()
            java.lang.String r5 = java.lang.Long.toString(r1)
        L24:
            long r0 = r0.longValue()
            r4.mValidityTimestamp = r0
            com.google.android.vending.licensing.PreferenceObfuscator r0 = r4.mPreferences
            java.lang.String r1 = "validityTimestamp"
            r0.putString(r1, r5)
            return
    }

    @Override // com.google.android.vending.licensing.Policy
    public boolean allowAccess() {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r9.mLastResponse
            r3 = 1
            r4 = 0
            r5 = 256(0x100, float:3.59E-43)
            if (r2 != r5) goto L13
            long r5 = r9.mValidityTimestamp
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L32
            return r3
        L13:
            r5 = 291(0x123, float:4.08E-43)
            if (r2 != r5) goto L32
            long r5 = r9.mLastResponseTime
            r7 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 + r7
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L32
            long r5 = r9.mRetryUntil
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L31
            long r0 = r9.mRetryCount
            long r5 = r9.mMaxRetries
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L30
            goto L31
        L30:
            r3 = 0
        L31:
            return r3
        L32:
            return r4
    }

    public java.lang.String getExpansionFileName(int r2) {
            r1 = this;
            java.util.Vector<java.lang.String> r0 = r1.mExpansionFileNames
            int r0 = r0.size()
            if (r2 >= r0) goto L11
            java.util.Vector<java.lang.String> r0 = r1.mExpansionFileNames
            java.lang.Object r2 = r0.elementAt(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    public long getExpansionFileSize(int r3) {
            r2 = this;
            java.util.Vector<java.lang.Long> r0 = r2.mExpansionFileSizes
            int r0 = r0.size()
            if (r3 >= r0) goto L15
            java.util.Vector<java.lang.Long> r0 = r2.mExpansionFileSizes
            java.lang.Object r3 = r0.elementAt(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            return r0
        L15:
            r0 = -1
            return r0
    }

    public java.lang.String getExpansionURL(int r2) {
            r1 = this;
            java.util.Vector<java.lang.String> r0 = r1.mExpansionURLs
            int r0 = r0.size()
            if (r2 >= r0) goto L11
            java.util.Vector<java.lang.String> r0 = r1.mExpansionURLs
            java.lang.Object r2 = r0.elementAt(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    public int getExpansionURLCount() {
            r1 = this;
            java.util.Vector<java.lang.String> r0 = r1.mExpansionURLs
            int r0 = r0.size()
            return r0
    }

    public long getMaxRetries() {
            r2 = this;
            long r0 = r2.mMaxRetries
            return r0
    }

    public long getRetryCount() {
            r2 = this;
            long r0 = r2.mRetryCount
            return r0
    }

    public long getRetryUntil() {
            r2 = this;
            long r0 = r2.mRetryUntil
            return r0
    }

    public long getValidityTimestamp() {
            r2 = this;
            long r0 = r2.mValidityTimestamp
            return r0
    }

    @Override // com.google.android.vending.licensing.Policy
    public void processServerResponse(int r6, com.google.android.vending.licensing.ResponseData r7) {
            r5 = this;
            r0 = 291(0x123, float:4.08E-43)
            if (r6 == r0) goto La
            r0 = 0
            r5.setRetryCount(r0)
            goto L12
        La:
            long r0 = r5.mRetryCount
            r2 = 1
            long r0 = r0 + r2
            r5.setRetryCount(r0)
        L12:
            r0 = 256(0x100, float:3.59E-43)
            if (r6 != r0) goto Ld4
            java.lang.String r7 = r7.extra
            java.util.Map r7 = r5.decodeExtras(r7)
            r5.mLastResponse = r6
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 + r2
            java.lang.String r0 = java.lang.Long.toString(r0)
            r5.setValidityTimestamp(r0)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "VT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L53
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5.setValidityTimestamp(r1)
            goto L35
        L53:
            java.lang.String r2 = "GT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L65
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5.setRetryUntil(r1)
            goto L35
        L65:
            java.lang.String r2 = "GR"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L77
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5.setMaxRetries(r1)
            goto L35
        L77:
            java.lang.String r2 = "FILE_URL"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L95
            r2 = 8
            java.lang.String r2 = r1.substring(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 + (-1)
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5.setExpansionURL(r2, r1)
            goto L35
        L95:
            java.lang.String r2 = "FILE_NAME"
            boolean r2 = r1.startsWith(r2)
            r3 = 9
            if (r2 == 0) goto Lb3
            java.lang.String r2 = r1.substring(r3)
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 + (-1)
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5.setExpansionFileName(r2, r1)
            goto L35
        Lb3:
            java.lang.String r2 = "FILE_SIZE"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L35
            java.lang.String r2 = r1.substring(r3)
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 + (-1)
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            long r3 = java.lang.Long.parseLong(r1)
            r5.setExpansionFileSize(r2, r3)
            goto L35
        Ld4:
            r7 = 561(0x231, float:7.86E-43)
            if (r6 != r7) goto Le3
            java.lang.String r7 = "0"
            r5.setValidityTimestamp(r7)
            r5.setRetryUntil(r7)
            r5.setMaxRetries(r7)
        Le3:
            r5.setLastResponse(r6)
            com.google.android.vending.licensing.PreferenceObfuscator r6 = r5.mPreferences
            r6.commit()
            return
    }

    public void resetPolicy() {
            r3 = this;
            com.google.android.vending.licensing.PreferenceObfuscator r0 = r3.mPreferences
            r1 = 291(0x123, float:4.08E-43)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "lastResponse"
            r0.putString(r2, r1)
            java.lang.String r0 = "0"
            r3.setRetryUntil(r0)
            r3.setMaxRetries(r0)
            long r1 = java.lang.Long.parseLong(r0)
            r3.setRetryCount(r1)
            r3.setValidityTimestamp(r0)
            com.google.android.vending.licensing.PreferenceObfuscator r0 = r3.mPreferences
            r0.commit()
            return
    }

    public void setExpansionFileName(int r3, java.lang.String r4) {
            r2 = this;
            java.util.Vector<java.lang.String> r0 = r2.mExpansionFileNames
            int r0 = r0.size()
            if (r3 < r0) goto Lf
            java.util.Vector<java.lang.String> r0 = r2.mExpansionFileNames
            int r1 = r3 + 1
            r0.setSize(r1)
        Lf:
            java.util.Vector<java.lang.String> r0 = r2.mExpansionFileNames
            r0.set(r3, r4)
            return
    }

    public void setExpansionFileSize(int r3, long r4) {
            r2 = this;
            java.util.Vector<java.lang.Long> r0 = r2.mExpansionFileSizes
            int r0 = r0.size()
            if (r3 < r0) goto Lf
            java.util.Vector<java.lang.Long> r0 = r2.mExpansionFileSizes
            int r1 = r3 + 1
            r0.setSize(r1)
        Lf:
            java.util.Vector<java.lang.Long> r0 = r2.mExpansionFileSizes
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.set(r3, r4)
            return
    }

    public void setExpansionURL(int r3, java.lang.String r4) {
            r2 = this;
            java.util.Vector<java.lang.String> r0 = r2.mExpansionURLs
            int r0 = r0.size()
            if (r3 < r0) goto Lf
            java.util.Vector<java.lang.String> r0 = r2.mExpansionURLs
            int r1 = r3 + 1
            r0.setSize(r1)
        Lf:
            java.util.Vector<java.lang.String> r0 = r2.mExpansionURLs
            r0.set(r3, r4)
            return
    }
}
