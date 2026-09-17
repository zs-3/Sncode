package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RegisterRequestCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public class RegisterRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisterRequest> CREATOR = null;
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 2, type = "java.lang.String")
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAppId", id = 4)
    private final java.lang.String zzd;

    static {
            com.google.android.gms.fido.u2f.api.common.zzg r0 = new com.google.android.gms.fido.u2f.api.common.zzg
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.RegisterRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    RegisterRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(r2)     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> L10
            r0.zzb = r1     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> L10
            r0.zzc = r3
            r0.zzd = r4
            return
        L10:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public RegisterRequest(com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3, byte[] r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.zza = r0
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = (com.google.android.gms.fido.u2f.api.common.ProtocolVersion) r1
            r2.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            byte[] r1 = (byte[]) r1
            r2.zzc = r1
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1
            if (r3 != r1) goto L26
            int r3 = r4.length
            r4 = 65
            if (r3 != r4) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.String r3 = "invalid challengeValue length for V1"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
        L26:
            r2.zzd = r5
            return
    }

    public static com.google.android.gms.fido.u2f.api.common.RegisterRequest parseFromJson(org.json.JSONObject r5) throws org.json.JSONException {
            java.lang.String r0 = "version"
            boolean r1 = r5.has(r0)
            r2 = 0
            if (r1 == 0) goto Le
            java.lang.String r0 = r5.getString(r0)
            goto Lf
        Le:
            r0 = r2
        Lf:
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(r0)     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> L47
            java.lang.String r1 = "challenge"
            java.lang.String r1 = r5.getString(r1)
            r3 = 8
            byte[] r1 = android.util.Base64.decode(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L3c
            java.lang.String r3 = "appId"
            boolean r4 = r5.has(r3)
            if (r4 == 0) goto L2b
            java.lang.String r2 = r5.getString(r3)
        L2b:
            com.google.android.gms.fido.u2f.api.common.RegisterRequest r5 = new com.google.android.gms.fido.u2f.api.common.RegisterRequest     // Catch: java.lang.IllegalArgumentException -> L31
            r5.<init>(r0, r1, r2)     // Catch: java.lang.IllegalArgumentException -> L31
            return r5
        L31:
            r5 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r5 = r5.getMessage()
            r0.<init>(r5)
            throw r0
        L3c:
            r5 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L47:
            r5 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.fido.u2f.api.common.RegisterRequest r5 = (com.google.android.gms.fido.u2f.api.common.RegisterRequest) r5
            byte[] r1 = r4.zzc
            byte[] r3 = r5.zzc
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r4.zzb
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = r5.zzb
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.zzd
            if (r1 != 0) goto L27
            java.lang.String r5 = r5.zzd
            if (r5 == 0) goto L30
            return r2
        L27:
            java.lang.String r5 = r5.zzd
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    public byte[] getChallengeValue() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r1.zzb
            return r0
    }

    public int getVersionCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r2 = this;
            byte[] r0 = r2.zzc
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + 31
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r2.zzb
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            java.lang.String r1 = r2.zzd
            if (r1 != 0) goto L17
            r1 = 0
            goto L1b
        L17:
            int r1 = r1.hashCode()
        L1b:
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
    }

    public org.json.JSONObject toJson() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "version"
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r2 = r4.zzb     // Catch: org.json.JSONException -> L27
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L27
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L27
            java.lang.String r1 = "challenge"
            byte[] r2 = r4.zzc     // Catch: org.json.JSONException -> L27
            r3 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: org.json.JSONException -> L27
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L27
            java.lang.String r1 = r4.zzd     // Catch: org.json.JSONException -> L27
            if (r1 == 0) goto L26
            java.lang.String r2 = "appId"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L27
        L26:
            return r0
        L27:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.getVersionCode()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r3.zzb
            java.lang.String r0 = r0.toString()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            byte[] r0 = r3.getChallengeValue()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            java.lang.String r0 = r3.getAppId()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
