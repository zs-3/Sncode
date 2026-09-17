package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignResponseDataCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public class SignResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.SignResponseData> CREATOR = null;

    @com.google.android.gms.common.util.VisibleForTesting
    public static final java.lang.String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";

    @com.google.android.gms.common.util.VisibleForTesting
    public static final java.lang.String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";

    @com.google.android.gms.common.util.VisibleForTesting
    public static final java.lang.String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClientDataString", id = 3)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSignatureData", id = 4)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getApplication", id = 5)
    private final byte[] zzd;

    static {
            com.google.android.gms.fido.u2f.api.common.zzl r0 = new com.google.android.gms.fido.u2f.api.common.zzl
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.SignResponseData.CREATOR = r0
            return
    }

    @java.lang.Deprecated
    public SignResponseData(byte[] r2, java.lang.String r3, byte[] r4) {
            r1 = this;
            r0 = 0
            byte[] r0 = new byte[r0]
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public SignResponseData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) byte[] r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            byte[] r1 = (byte[]) r1
            r0.zza = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r1 = (byte[]) r1
            r0.zzc = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            byte[] r1 = (byte[]) r1
            r0.zzd = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.u2f.api.common.SignResponseData
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.u2f.api.common.SignResponseData r4 = (com.google.android.gms.fido.u2f.api.common.SignResponseData) r4
            byte[] r0 = r3.zza
            byte[] r2 = r4.zza
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L32
            java.lang.String r0 = r3.zzb
            java.lang.String r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L32
            byte[] r0 = r3.zzc
            byte[] r2 = r4.zzc
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L32
            byte[] r0 = r3.zzd
            byte[] r4 = r4.zzd
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L32
            r4 = 1
            return r4
        L32:
            return r1
    }

    public java.lang.String getClientDataString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public byte[] getKeyHandle() {
            r1 = this;
            byte[] r0 = r1.zza
            return r0
    }

    public byte[] getSignatureData() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte[] r1 = r3.zza
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.zzc
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            byte[] r1 = r3.zzd
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public org.json.JSONObject toJsonObject() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r0.<init>()     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "keyHandle"
            byte[] r2 = r4.zza     // Catch: org.json.JSONException -> L2d
            r3 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "clientData"
            java.lang.String r2 = r4.zzb     // Catch: org.json.JSONException -> L2d
            byte[] r2 = r2.getBytes()     // Catch: org.json.JSONException -> L2d
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "signatureData"
            byte[] r2 = r4.zzc     // Catch: org.json.JSONException -> L2d
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            return r0
        L2d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String toString() {
            r5 = this;
            com.google.android.gms.internal.fido.zzaj r0 = com.google.android.gms.internal.fido.zzak.zza(r5)
            com.google.android.gms.internal.fido.zzbf r1 = com.google.android.gms.internal.fido.zzbf.zzd()
            byte[] r2 = r5.zza
            int r3 = r2.length
            r4 = 0
            java.lang.String r1 = r1.zze(r2, r4, r3)
            java.lang.String r2 = "keyHandle"
            r0.zzb(r2, r1)
            java.lang.String r1 = r5.zzb
            java.lang.String r2 = "clientDataString"
            r0.zzb(r2, r1)
            com.google.android.gms.internal.fido.zzbf r1 = com.google.android.gms.internal.fido.zzbf.zzd()
            byte[] r2 = r5.zzc
            int r3 = r2.length
            java.lang.String r1 = r1.zze(r2, r4, r3)
            java.lang.String r2 = "signatureData"
            r0.zzb(r2, r1)
            com.google.android.gms.internal.fido.zzbf r1 = com.google.android.gms.internal.fido.zzbf.zzd()
            byte[] r2 = r5.zzd
            int r3 = r2.length
            java.lang.String r1 = r1.zze(r2, r4, r3)
            java.lang.String r2 = "application"
            r0.zzb(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            byte[] r0 = r3.getKeyHandle()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            java.lang.String r0 = r3.getClientDataString()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            byte[] r0 = r3.getSignatureData()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            byte[] r0 = r3.zzd
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
