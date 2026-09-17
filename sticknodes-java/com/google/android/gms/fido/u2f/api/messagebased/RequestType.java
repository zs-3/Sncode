package com.google.android.gms.fido.u2f.api.messagebased;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public enum RequestType extends java.lang.Enum<com.google.android.gms.fido.u2f.api.messagebased.RequestType> {
    public static final com.google.android.gms.fido.u2f.api.messagebased.RequestType REGISTER = null;
    public static final com.google.android.gms.fido.u2f.api.messagebased.RequestType SIGN = null;
    private static final /* synthetic */ com.google.android.gms.fido.u2f.api.messagebased.RequestType[] zza = null;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedRequestTypeException extends java.lang.Exception {
        public UnsupportedRequestTypeException(java.lang.String r2) {
                r1 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r0 = "Unsupported request type "
                java.lang.String r2 = r0.concat(r2)
                r1.<init>(r2)
                return
        }
    }

    static {
            com.google.android.gms.fido.u2f.api.messagebased.RequestType r0 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType
            java.lang.String r1 = "REGISTER"
            r2 = 0
            java.lang.String r3 = "u2f_register_request"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.u2f.api.messagebased.RequestType.REGISTER = r0
            com.google.android.gms.fido.u2f.api.messagebased.RequestType r1 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType
            java.lang.String r3 = "SIGN"
            r4 = 1
            java.lang.String r5 = "u2f_sign_request"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.u2f.api.messagebased.RequestType.SIGN = r1
            r3 = 2
            com.google.android.gms.fido.u2f.api.messagebased.RequestType[] r3 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.google.android.gms.fido.u2f.api.messagebased.RequestType.zza = r3
            return
    }

    RequestType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.RequestType fromString(java.lang.String r5) throws com.google.android.gms.fido.u2f.api.messagebased.RequestType.UnsupportedRequestTypeException {
            com.google.android.gms.fido.u2f.api.messagebased.RequestType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            java.lang.String r4 = r3.zzb
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L13
            return r3
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException r0 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException
            r0.<init>(r5)
            throw r0
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.RequestType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.u2f.api.messagebased.RequestType> r0 = com.google.android.gms.fido.u2f.api.messagebased.RequestType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.u2f.api.messagebased.RequestType r1 = (com.google.android.gms.fido.u2f.api.messagebased.RequestType) r1
            return r1
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.RequestType[] values() {
            com.google.android.gms.fido.u2f.api.messagebased.RequestType[] r0 = com.google.android.gms.fido.u2f.api.messagebased.RequestType.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.u2f.api.messagebased.RequestType[] r0 = (com.google.android.gms.fido.u2f.api.messagebased.RequestType[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
