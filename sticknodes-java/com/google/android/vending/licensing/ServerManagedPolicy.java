package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public class ServerManagedPolicy implements com.google.android.vending.licensing.Policy {
    private static final java.lang.String DEFAULT_MAX_RETRIES = "0";
    private static final java.lang.String DEFAULT_RETRY_COUNT = "0";
    private static final java.lang.String DEFAULT_RETRY_UNTIL = "0";
    private static final java.lang.String DEFAULT_VALIDITY_TIMESTAMP = "0";
    private static final long MILLIS_PER_MINUTE = 60000;
    private static final java.lang.String PREFS_FILE = "com.android.vending.licensing.ServerManagedPolicy";
    private static final java.lang.String PREF_LAST_RESPONSE = "lastResponse";
    private static final java.lang.String PREF_MAX_RETRIES = "maxRetries";
    private static final java.lang.String PREF_RETRY_COUNT = "retryCount";
    private static final java.lang.String PREF_RETRY_UNTIL = "retryUntil";
    private static final java.lang.String PREF_VALIDITY_TIMESTAMP = "validityTimestamp";
    private static final java.lang.String TAG = "ServerManagedPolicy";
    private int mLastResponse;
    private long mLastResponseTime;
    private long mMaxRetries;
    private com.google.android.vending.licensing.PreferenceObfuscator mPreferences;
    private long mRetryCount;
    private long mRetryUntil;
    private long mValidityTimestamp;

    public ServerManagedPolicy(android.content.Context r3, com.google.android.vending.licensing.Obfuscator r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mLastResponseTime = r0
            java.lang.String r0 = "com.android.vending.licensing.ServerManagedPolicy"
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

    private java.util.Map<java.lang.String, java.lang.String> decodeExtras(java.lang.String r5) {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L3d
            r2.<init>()     // Catch: java.net.URISyntaxException -> L3d
            java.lang.String r3 = "?"
            r2.append(r3)     // Catch: java.net.URISyntaxException -> L3d
            r2.append(r5)     // Catch: java.net.URISyntaxException -> L3d
            java.lang.String r5 = r2.toString()     // Catch: java.net.URISyntaxException -> L3d
            r1.<init>(r5)     // Catch: java.net.URISyntaxException -> L3d
            java.lang.String r5 = "UTF-8"
            java.util.List r5 = org.apache.http.client.utils.URLEncodedUtils.parse(r1, r5)     // Catch: java.net.URISyntaxException -> L3d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.net.URISyntaxException -> L3d
        L25:
            boolean r1 = r5.hasNext()     // Catch: java.net.URISyntaxException -> L3d
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()     // Catch: java.net.URISyntaxException -> L3d
            org.apache.http.NameValuePair r1 = (org.apache.http.NameValuePair) r1     // Catch: java.net.URISyntaxException -> L3d
            java.lang.String r2 = r1.getName()     // Catch: java.net.URISyntaxException -> L3d
            java.lang.String r1 = r1.getValue()     // Catch: java.net.URISyntaxException -> L3d
            r0.put(r2, r1)     // Catch: java.net.URISyntaxException -> L3d
            goto L25
        L3d:
            java.lang.String r5 = "ServerManagedPolicy"
            java.lang.String r1 = "Invalid syntax error while decoding extras data from server."
            android.util.Log.w(r5, r1)
        L44:
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
            java.lang.String r3 = "ServerManagedPolicy"
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
            java.lang.String r3 = "ServerManagedPolicy"
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
            java.lang.String r5 = "ServerManagedPolicy"
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
    public void processServerResponse(int r5, com.google.android.vending.licensing.ResponseData r6) {
            r4 = this;
            r0 = 291(0x123, float:4.08E-43)
            if (r5 == r0) goto La
            r0 = 0
            r4.setRetryCount(r0)
            goto L12
        La:
            long r0 = r4.mRetryCount
            r2 = 1
            long r0 = r0 + r2
            r4.setRetryCount(r0)
        L12:
            r0 = 256(0x100, float:3.59E-43)
            if (r5 != r0) goto L40
            java.lang.String r6 = r6.extra
            java.util.Map r6 = r4.decodeExtras(r6)
            r4.mLastResponse = r5
            java.lang.String r0 = "VT"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.setValidityTimestamp(r0)
            java.lang.String r0 = "GT"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.setRetryUntil(r0)
            java.lang.String r0 = "GR"
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            r4.setMaxRetries(r6)
            goto L4f
        L40:
            r6 = 561(0x231, float:7.86E-43)
            if (r5 != r6) goto L4f
            java.lang.String r6 = "0"
            r4.setValidityTimestamp(r6)
            r4.setRetryUntil(r6)
            r4.setMaxRetries(r6)
        L4f:
            r4.setLastResponse(r5)
            com.google.android.vending.licensing.PreferenceObfuscator r5 = r4.mPreferences
            r5.commit()
            return
    }
}
