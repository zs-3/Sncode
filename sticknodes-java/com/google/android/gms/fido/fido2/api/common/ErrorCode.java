package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public enum ErrorCode extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.ErrorCode> implements android.os.Parcelable {
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode ABORT_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode ATTESTATION_NOT_PRIVATE_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode CONSTRAINT_ERR = null;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.ErrorCode> CREATOR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode DATA_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode ENCODING_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode INVALID_STATE_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode NETWORK_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode NOT_ALLOWED_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode NOT_SUPPORTED_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode SECURITY_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode TIMEOUT_ERR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ErrorCode UNKNOWN_ERR = null;
    private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.ErrorCode[] zza = null;
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedErrorCodeException extends java.lang.Exception {
        public UnsupportedErrorCodeException(int r4) {
                r3 = this;
                java.util.Locale r0 = java.util.Locale.US
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2 = 0
                r1[r2] = r4
                java.lang.String r4 = "Error code %d is not supported"
                java.lang.String r4 = java.lang.String.format(r0, r4, r1)
                r3.<init>(r4)
                return
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.ErrorCode r0 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r1 = "NOT_SUPPORTED_ERR"
            r2 = 0
            r3 = 9
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_SUPPORTED_ERR = r0
            com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r4 = "INVALID_STATE_ERR"
            r5 = 1
            r6 = 11
            r1.<init>(r4, r5, r6)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.INVALID_STATE_ERR = r1
            com.google.android.gms.fido.fido2.api.common.ErrorCode r4 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r7 = "SECURITY_ERR"
            r8 = 2
            r9 = 18
            r4.<init>(r7, r8, r9)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.SECURITY_ERR = r4
            com.google.android.gms.fido.fido2.api.common.ErrorCode r7 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r9 = "NETWORK_ERR"
            r10 = 3
            r11 = 19
            r7.<init>(r9, r10, r11)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.NETWORK_ERR = r7
            com.google.android.gms.fido.fido2.api.common.ErrorCode r9 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r11 = "ABORT_ERR"
            r12 = 4
            r13 = 20
            r9.<init>(r11, r12, r13)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.ABORT_ERR = r9
            com.google.android.gms.fido.fido2.api.common.ErrorCode r11 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r13 = "TIMEOUT_ERR"
            r14 = 5
            r15 = 23
            r11.<init>(r13, r14, r15)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.TIMEOUT_ERR = r11
            com.google.android.gms.fido.fido2.api.common.ErrorCode r13 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r15 = "ENCODING_ERR"
            r14 = 6
            r12 = 27
            r13.<init>(r15, r14, r12)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.ENCODING_ERR = r13
            com.google.android.gms.fido.fido2.api.common.ErrorCode r12 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r15 = "UNKNOWN_ERR"
            r14 = 7
            r10 = 28
            r12.<init>(r15, r14, r10)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.UNKNOWN_ERR = r12
            com.google.android.gms.fido.fido2.api.common.ErrorCode r10 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r15 = "CONSTRAINT_ERR"
            r14 = 8
            r8 = 29
            r10.<init>(r15, r14, r8)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.CONSTRAINT_ERR = r10
            com.google.android.gms.fido.fido2.api.common.ErrorCode r8 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r15 = "DATA_ERR"
            r14 = 30
            r8.<init>(r15, r3, r14)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.DATA_ERR = r8
            com.google.android.gms.fido.fido2.api.common.ErrorCode r14 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r15 = "NOT_ALLOWED_ERR"
            r3 = 10
            r5 = 35
            r14.<init>(r15, r3, r5)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_ALLOWED_ERR = r14
            com.google.android.gms.fido.fido2.api.common.ErrorCode r5 = new com.google.android.gms.fido.fido2.api.common.ErrorCode
            java.lang.String r15 = "ATTESTATION_NOT_PRIVATE_ERR"
            r3 = 36
            r5.<init>(r15, r6, r3)
            com.google.android.gms.fido.fido2.api.common.ErrorCode.ATTESTATION_NOT_PRIVATE_ERR = r5
            r3 = 12
            com.google.android.gms.fido.fido2.api.common.ErrorCode[] r3 = new com.google.android.gms.fido.fido2.api.common.ErrorCode[r3]
            r3[r2] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r4
            r0 = 3
            r3[r0] = r7
            r0 = 4
            r3[r0] = r9
            r0 = 5
            r3[r0] = r11
            r0 = 6
            r3[r0] = r13
            r0 = 7
            r3[r0] = r12
            r0 = 8
            r3[r0] = r10
            r0 = 9
            r3[r0] = r8
            r0 = 10
            r3[r0] = r14
            r3[r6] = r5
            com.google.android.gms.fido.fido2.api.common.ErrorCode.zza = r3
            com.google.android.gms.fido.fido2.api.common.zzw r0 = new com.google.android.gms.fido.fido2.api.common.zzw
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.ErrorCode.CREATOR = r0
            return
    }

    ErrorCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.ErrorCode toErrorCode(int r5) throws com.google.android.gms.fido.fido2.api.common.ErrorCode.UnsupportedErrorCodeException {
            com.google.android.gms.fido.fido2.api.common.ErrorCode[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.zzb
            if (r5 != r4) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException r0 = new com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException
            r0.<init>(r5)
            throw r0
    }

    public static com.google.android.gms.fido.fido2.api.common.ErrorCode valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.fido2.api.common.ErrorCode> r0 = com.google.android.gms.fido.fido2.api.common.ErrorCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = (com.google.android.gms.fido.fido2.api.common.ErrorCode) r1
            return r1
    }

    public static com.google.android.gms.fido.fido2.api.common.ErrorCode[] values() {
            com.google.android.gms.fido.fido2.api.common.ErrorCode[] r0 = com.google.android.gms.fido.fido2.api.common.ErrorCode.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.fido2.api.common.ErrorCode[] r0 = (com.google.android.gms.fido.fido2.api.common.ErrorCode[]) r0
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.zzb
            r1.writeInt(r2)
            return
    }
}
