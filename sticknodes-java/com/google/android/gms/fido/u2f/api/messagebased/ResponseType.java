package com.google.android.gms.fido.u2f.api.messagebased;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public enum ResponseType extends java.lang.Enum<com.google.android.gms.fido.u2f.api.messagebased.ResponseType> {
    public static final com.google.android.gms.fido.u2f.api.messagebased.ResponseType REGISTER = null;
    public static final com.google.android.gms.fido.u2f.api.messagebased.ResponseType SIGN = null;
    private static final /* synthetic */ com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] zza = null;
    private final java.lang.String zzb;

    static {
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType r0 = new com.google.android.gms.fido.u2f.api.messagebased.ResponseType
            java.lang.String r1 = "REGISTER"
            r2 = 0
            java.lang.String r3 = "u2f_register_response"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType.REGISTER = r0
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType r1 = new com.google.android.gms.fido.u2f.api.messagebased.ResponseType
            java.lang.String r3 = "SIGN"
            r4 = 1
            java.lang.String r5 = "u2f_sign_response"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType.SIGN = r1
            r3 = 2
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] r3 = new com.google.android.gms.fido.u2f.api.messagebased.ResponseType[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType.zza = r3
            return
    }

    ResponseType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.ResponseType getResponseTypeForRequestType(com.google.android.gms.fido.u2f.api.messagebased.RequestType r2) throws com.google.android.gms.fido.u2f.api.messagebased.RequestType.UnsupportedRequestTypeException {
            if (r2 == 0) goto L1b
            int r0 = r2.ordinal()
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 != r1) goto Le
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType r2 = com.google.android.gms.fido.u2f.api.messagebased.ResponseType.SIGN
            return r2
        Le:
            com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException r0 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L18:
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType r2 = com.google.android.gms.fido.u2f.api.messagebased.ResponseType.REGISTER
            return r2
        L1b:
            com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException r2 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException
            r0 = 0
            r2.<init>(r0)
            throw r2
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.ResponseType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.u2f.api.messagebased.ResponseType> r0 = com.google.android.gms.fido.u2f.api.messagebased.ResponseType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType r1 = (com.google.android.gms.fido.u2f.api.messagebased.ResponseType) r1
            return r1
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] values() {
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] r0 = com.google.android.gms.fido.u2f.api.messagebased.ResponseType.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] r0 = (com.google.android.gms.fido.u2f.api.messagebased.ResponseType[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
