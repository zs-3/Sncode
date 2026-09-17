package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RegisterResponseDataCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public class RegisterResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisterResponseData> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegisterData", id = 2)
    private final byte[] zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClientDataString", id = 4)
    private final java.lang.String zzc;

    static {
            com.google.android.gms.fido.u2f.api.common.zzi r0 = new com.google.android.gms.fido.u2f.api.common.zzi
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.RegisterResponseData.CREATOR = r0
            return
    }

    public RegisterResponseData(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            byte[] r1 = (byte[]) r1
            r0.zza = r1
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1
            r0.zzb = r1
            r1 = 0
            r0.zzc = r1
            return
    }

    public RegisterResponseData(byte[] r3, com.google.android.gms.fido.u2f.api.common.ProtocolVersion r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r3 = (byte[]) r3
            r2.zza = r3
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = (com.google.android.gms.fido.u2f.api.common.ProtocolVersion) r3
            r2.zzb = r3
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN
            r0 = 1
            r1 = 0
            if (r4 == r3) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1
            if (r4 != r3) goto L2e
            if (r5 != 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r3 = 0
            r2.zzc = r3
            return
        L2e:
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.String r3 = (java.lang.String) r3
            r2.zzc = r3
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    RegisterResponseData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(r2)     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> Le
            r0.zzb = r1     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> Le
            r0.zzc = r3
            return
        Le:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.u2f.api.common.RegisterResponseData
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.u2f.api.common.RegisterResponseData r4 = (com.google.android.gms.fido.u2f.api.common.RegisterResponseData) r4
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r3.zzb
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L28
            byte[] r0 = r3.zza
            byte[] r2 = r4.zza
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = r3.zzc
            java.lang.String r4 = r4.zzc
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    public java.lang.String getClientDataString() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r1.zzb
            return r0
    }

    public byte[] getRegisterData() {
            r1 = this;
            byte[] r0 = r1.zza
            return r0
    }

    public int getVersionCode() {
            r2 = this;
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r2.zzb
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L10
            r1 = 2
            if (r0 == r1) goto L10
            r0 = -1
            return r0
        L10:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r3.zzb
            r2 = 0
            r0[r2] = r1
            byte[] r1 = r3.zza
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public org.json.JSONObject toJsonObject() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2f
            r0.<init>()     // Catch: org.json.JSONException -> L2f
            java.lang.String r1 = "registrationData"
            byte[] r2 = r4.zza     // Catch: org.json.JSONException -> L2f
            r3 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: org.json.JSONException -> L2f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2f
            java.lang.String r1 = "version"
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r2 = r4.zzb     // Catch: org.json.JSONException -> L2f
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L2f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2f
            java.lang.String r1 = r4.zzc     // Catch: org.json.JSONException -> L2f
            if (r1 == 0) goto L2e
            java.lang.String r2 = "clientData"
            byte[] r1 = r1.getBytes()     // Catch: org.json.JSONException -> L2f
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)     // Catch: org.json.JSONException -> L2f
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L2f
        L2e:
            return r0
        L2f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String toString() {
            r5 = this;
            com.google.android.gms.internal.fido.zzaj r0 = com.google.android.gms.internal.fido.zzak.zza(r5)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r5.zzb
            java.lang.String r2 = "protocolVersion"
            r0.zzb(r2, r1)
            com.google.android.gms.internal.fido.zzbf r1 = com.google.android.gms.internal.fido.zzbf.zzd()
            byte[] r2 = r5.zza
            int r3 = r2.length
            r4 = 0
            java.lang.String r1 = r1.zze(r2, r4, r3)
            java.lang.String r2 = "registerData"
            r0.zzb(r2, r1)
            java.lang.String r1 = r5.zzc
            if (r1 == 0) goto L25
            java.lang.String r2 = "clientDataString"
            r0.zzb(r2, r1)
        L25:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            byte[] r0 = r3.getRegisterData()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r3.zzb
            java.lang.String r0 = r0.toString()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getClientDataString()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
