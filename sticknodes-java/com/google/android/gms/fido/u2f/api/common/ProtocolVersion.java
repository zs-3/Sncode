package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public enum ProtocolVersion extends java.lang.Enum<com.google.android.gms.fido.u2f.api.common.ProtocolVersion> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ProtocolVersion> CREATOR = null;
    public static final com.google.android.gms.fido.u2f.api.common.ProtocolVersion UNKNOWN = null;
    public static final com.google.android.gms.fido.u2f.api.common.ProtocolVersion V1 = null;
    public static final com.google.android.gms.fido.u2f.api.common.ProtocolVersion V2 = null;
    private static final /* synthetic */ com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] zza = null;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedProtocolException extends java.lang.Exception {
        public UnsupportedProtocolException(java.lang.String r3) {
                r2 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r3
                java.lang.String r3 = "Protocol version %s not supported"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                r2.<init>(r3)
                return
        }
    }

    static {
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r1)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN = r0
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion
            java.lang.String r3 = "V1"
            r4 = 1
            java.lang.String r5 = "U2F_V1"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1 = r1
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion
            java.lang.String r5 = "V2"
            r6 = 2
            java.lang.String r7 = "U2F_V2"
            r3.<init>(r5, r6, r7)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V2 = r3
            r5 = 3
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] r5 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion.zza = r5
            com.google.android.gms.fido.u2f.api.common.zzf r0 = new com.google.android.gms.fido.u2f.api.common.zzf
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion.CREATOR = r0
            return
    }

    ProtocolVersion(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion fromBytes(byte[] r2) throws com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> Lc
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r2 = fromString(r0)
            return r2
        Lc:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion fromString(java.lang.String r5) throws com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException {
            if (r5 != 0) goto L5
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r5 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN
            return r5
        L5:
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] r0 = values()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            java.lang.String r4 = r3.zzb
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L18
            return r3
        L18:
            int r2 = r2 + 1
            goto Lb
        L1b:
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException r0 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException
            r0.<init>(r5)
            throw r0
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.u2f.api.common.ProtocolVersion> r0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = (com.google.android.gms.fido.u2f.api.common.ProtocolVersion) r1
            return r1
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] values() {
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] r0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] r0 = (com.google.android.gms.fido.u2f.api.common.ProtocolVersion[]) r0
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isCompatible(com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3) {
            r2 = this;
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L14
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            boolean r3 = r2.equals(r3)
            return r3
        L14:
            r3 = 1
            return r3
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zzb
            r1.writeString(r2)
            return
    }
}
