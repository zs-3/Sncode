package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RegisteredKeyCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public class RegisteredKey extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisteredKey> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final com.google.android.gms.fido.u2f.api.common.KeyHandle zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAppId", id = 4)
    private final java.lang.String zzc;

    static {
            com.google.android.gms.fido.u2f.api.common.zzj r0 = new com.google.android.gms.fido.u2f.api.common.zzj
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR = r0
            return
    }

    public RegisteredKey(com.google.android.gms.fido.u2f.api.common.KeyHandle r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public RegisteredKey(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.fido.u2f.api.common.KeyHandle r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = (com.google.android.gms.fido.u2f.api.common.KeyHandle) r1
            r0.zzb = r1
            r0.zza = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.fido.u2f.api.common.RegisteredKey parseFromJson(org.json.JSONObject r5) throws org.json.JSONException {
            java.lang.String r0 = "challenge"
            boolean r1 = r5.has(r0)
            r2 = 0
            if (r1 == 0) goto Le
            java.lang.String r0 = r5.getString(r0)
            goto Lf
        Le:
            r0 = r2
        Lf:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = com.google.android.gms.fido.u2f.api.common.KeyHandle.parseFromJson(r5)
            java.lang.String r3 = "appId"
            boolean r4 = r5.has(r3)
            if (r4 == 0) goto L1f
            java.lang.String r2 = r5.getString(r3)
        L1f:
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r5 = new com.google.android.gms.fido.u2f.api.common.RegisteredKey
            r5.<init>(r1, r0, r2)
            return r5
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisteredKey
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r5 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r5
            java.lang.String r1 = r4.zza
            if (r1 != 0) goto L16
            java.lang.String r1 = r5.zza
            if (r1 != 0) goto L15
            goto L1f
        L15:
            return r2
        L16:
            java.lang.String r3 = r5.zza
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1f
            return r2
        L1f:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r4.zzb
            com.google.android.gms.fido.u2f.api.common.KeyHandle r3 = r5.zzb
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            java.lang.String r1 = r4.zzc
            if (r1 != 0) goto L33
            java.lang.String r5 = r5.zzc
            if (r5 == 0) goto L3c
            return r2
        L33:
            java.lang.String r5 = r5.zzc
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L3c
            return r2
        L3c:
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public java.lang.String getChallengeValue() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public com.google.android.gms.fido.u2f.api.common.KeyHandle getKeyHandle() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.KeyHandle r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r2 = r3.zzb
            int r0 = r0 + 31
            int r0 = r0 * 31
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            java.lang.String r2 = r3.zzc
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r2.hashCode()
        L1f:
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
    }

    public org.json.JSONObject toJson() {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r5.zza     // Catch: org.json.JSONException -> L36
            if (r1 == 0) goto Le
            java.lang.String r2 = "challenge"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L36
        Le:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r5.zzb     // Catch: org.json.JSONException -> L36
            org.json.JSONObject r1 = r1.zza()     // Catch: org.json.JSONException -> L36
            java.util.Iterator r2 = r1.keys()     // Catch: org.json.JSONException -> L36
        L18:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L36
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L36
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L36
            java.lang.Object r4 = r1.get(r3)     // Catch: org.json.JSONException -> L36
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L36
            goto L18
        L2c:
            java.lang.String r1 = r5.zzc     // Catch: org.json.JSONException -> L36
            if (r1 == 0) goto L35
            java.lang.String r2 = "appId"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L36
        L35:
            return r0
        L36:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String toString() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            r0.<init>()     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "keyHandle"
            com.google.android.gms.fido.u2f.api.common.KeyHandle r2 = r4.zzb     // Catch: org.json.JSONException -> L5d
            byte[] r2 = r2.getBytes()     // Catch: org.json.JSONException -> L5d
            r3 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: org.json.JSONException -> L5d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5d
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r4.zzb     // Catch: org.json.JSONException -> L5d
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r1.getProtocolVersion()     // Catch: org.json.JSONException -> L5d
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r2 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN     // Catch: org.json.JSONException -> L5d
            if (r1 == r2) goto L2f
            java.lang.String r1 = "version"
            com.google.android.gms.fido.u2f.api.common.KeyHandle r2 = r4.zzb     // Catch: org.json.JSONException -> L5d
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r2 = r2.getProtocolVersion()     // Catch: org.json.JSONException -> L5d
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L5d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5d
        L2f:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r4.zzb     // Catch: org.json.JSONException -> L5d
            java.util.List r1 = r1.getTransports()     // Catch: org.json.JSONException -> L5d
            if (r1 == 0) goto L46
            java.lang.String r1 = "transports"
            com.google.android.gms.fido.u2f.api.common.KeyHandle r2 = r4.zzb     // Catch: org.json.JSONException -> L5d
            java.util.List r2 = r2.getTransports()     // Catch: org.json.JSONException -> L5d
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L5d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5d
        L46:
            java.lang.String r1 = r4.zza     // Catch: org.json.JSONException -> L5d
            if (r1 == 0) goto L4f
            java.lang.String r2 = "challenge"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L5d
        L4f:
            java.lang.String r1 = r4.zzc     // Catch: org.json.JSONException -> L5d
            if (r1 == 0) goto L58
            java.lang.String r2 = "appId"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L5d
        L58:
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L5d
            return r0
        L5d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r4.getKeyHandle()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.getChallengeValue()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.lang.String r6 = r4.getAppId()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
