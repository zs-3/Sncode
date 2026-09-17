package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public enum PublicKeyCredentialType extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType> CREATOR = null;
    public static final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType PUBLIC_KEY = null;
    private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] zza = null;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedPublicKeyCredTypeException extends java.lang.Exception {
        public UnsupportedPublicKeyCredTypeException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r0 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType
            java.lang.String r1 = "PUBLIC_KEY"
            r2 = 0
            java.lang.String r3 = "public-key"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.PUBLIC_KEY = r0
            r1 = 1
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] r1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[r1]
            r1[r2] = r0
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.zza = r1
            com.google.android.gms.fido.fido2.api.common.zzaq r0 = new com.google.android.gms.fido.fido2.api.common.zzaq
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.CREATOR = r0
            return
    }

    PublicKeyCredentialType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            java.lang.String r1 = "PUBLIC_KEY"
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.String r1 = "public-key"
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType fromString(java.lang.String r6) throws com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException {
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] r0 = values()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            java.lang.String r5 = r4.zzb
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L14
            return r4
        L14:
            int r3 = r3 + 1
            goto L7
        L17:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException r0 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "PublicKeyCredentialType %s not supported"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            r0.<init>(r6)
            throw r0
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType> r0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType) r1
            return r1
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] values() {
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] r0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] r0 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[]) r0
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
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
