package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "KeyHandleCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public class KeyHandle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.KeyHandle> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBytes", id = 2)
    private final byte[] zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTransports", id = 4)
    private final java.util.List zzd;

    static {
            com.google.android.gms.fido.u2f.api.common.zze r0 = new com.google.android.gms.fido.u2f.api.common.zze
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.KeyHandle.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    KeyHandle(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(r3)     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> L10
            r0.zzc = r1     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> L10
            r0.zzd = r4
            return
        L10:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public KeyHandle(byte[] r2, com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3, java.util.List<com.google.android.gms.fido.common.Transport> r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            return
    }

    public static com.google.android.gms.fido.u2f.api.common.KeyHandle parseFromJson(org.json.JSONObject r5) throws org.json.JSONException {
            java.lang.String r0 = "version"
            boolean r1 = r5.has(r0)
            r2 = 0
            if (r1 == 0) goto Le
            java.lang.String r0 = r5.getString(r0)
            goto Lf
        Le:
            r0 = r2
        Lf:
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(r0)     // Catch: com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException -> L41
            java.lang.String r1 = "keyHandle"
            java.lang.String r1 = r5.getString(r1)
            r3 = 8
            byte[] r1 = android.util.Base64.decode(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L36
            java.lang.String r3 = "transports"
            boolean r4 = r5.has(r3)
            if (r4 != 0) goto L28
            goto L30
        L28:
            org.json.JSONArray r5 = r5.getJSONArray(r3)
            java.util.List r2 = com.google.android.gms.fido.common.Transport.parseTransports(r5)
        L30:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r5 = new com.google.android.gms.fido.u2f.api.common.KeyHandle
            r5.<init>(r1, r0, r2)
            return r5
        L36:
            r5 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L41:
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
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.KeyHandle
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r5 = (com.google.android.gms.fido.u2f.api.common.KeyHandle) r5
            byte[] r1 = r4.zzb
            byte[] r3 = r5.zzb
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r4.zzc
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = r5.zzc
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.zzd
            if (r1 != 0) goto L2c
            java.util.List r3 = r5.zzd
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            return r0
        L2c:
            if (r1 == 0) goto L44
            java.util.List r3 = r5.zzd
            if (r3 != 0) goto L33
            goto L44
        L33:
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L44
            java.util.List r5 = r5.zzd
            java.util.List r1 = r4.zzd
            boolean r5 = r5.containsAll(r1)
            if (r5 == 0) goto L44
            return r0
        L44:
            return r2
    }

    public byte[] getBytes() {
            r1 = this;
            byte[] r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r1.zzc
            return r0
    }

    public java.util.List<com.google.android.gms.fido.common.Transport> getTransports() {
            r1 = this;
            java.util.List r0 = r1.zzd
            return r0
    }

    public int getVersionCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte[] r1 = r3.zzb
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r3.zzc
            r2 = 1
            r0[r2] = r1
            java.util.List r1 = r3.zzd
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public org.json.JSONObject toJson() {
            r1 = this;
            org.json.JSONObject r0 = r1.zza()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.zzd
            if (r0 != 0) goto L7
            java.lang.String r0 = "null"
            goto Lb
        L7:
            java.lang.String r0 = r0.toString()
        Lb:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            byte[] r3 = r4.zzb
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = r4.zzc
            r1[r2] = r3
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = "{keyHandle: %s, version: %s, transports: %s}"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.getVersionCode()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            byte[] r0 = r3.getBytes()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = r3.zzc
            java.lang.String r0 = r0.toString()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.util.List r0 = r3.getTransports()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final org.json.JSONObject zza() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            byte[] r1 = r4.zzb     // Catch: org.json.JSONException -> L4a
            if (r1 == 0) goto L14
            java.lang.String r2 = "keyHandle"
            r3 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)     // Catch: org.json.JSONException -> L4a
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L4a
        L14:
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r4.zzc     // Catch: org.json.JSONException -> L4a
            if (r1 == 0) goto L21
            java.lang.String r2 = "version"
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L4a
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L4a
        L21:
            java.util.List r1 = r4.zzd     // Catch: org.json.JSONException -> L4a
            if (r1 == 0) goto L49
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4a
            r1.<init>()     // Catch: org.json.JSONException -> L4a
            java.util.List r2 = r4.zzd     // Catch: org.json.JSONException -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L4a
        L30:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L4a
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L4a
            com.google.android.gms.fido.common.Transport r3 = (com.google.android.gms.fido.common.Transport) r3     // Catch: org.json.JSONException -> L4a
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L4a
            r1.put(r3)     // Catch: org.json.JSONException -> L4a
            goto L30
        L44:
            java.lang.String r2 = "transports"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L4a
        L49:
            return r0
        L4a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
