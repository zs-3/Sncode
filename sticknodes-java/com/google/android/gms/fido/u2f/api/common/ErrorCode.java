package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public enum ErrorCode extends java.lang.Enum<com.google.android.gms.fido.u2f.api.common.ErrorCode> implements android.os.Parcelable {
    public static final com.google.android.gms.fido.u2f.api.common.ErrorCode BAD_REQUEST = null;
    public static final com.google.android.gms.fido.u2f.api.common.ErrorCode CONFIGURATION_UNSUPPORTED = null;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ErrorCode> CREATOR = null;
    public static final com.google.android.gms.fido.u2f.api.common.ErrorCode DEVICE_INELIGIBLE = null;
    public static final com.google.android.gms.fido.u2f.api.common.ErrorCode OK = null;
    public static final com.google.android.gms.fido.u2f.api.common.ErrorCode OTHER_ERROR = null;
    public static final com.google.android.gms.fido.u2f.api.common.ErrorCode TIMEOUT = null;
    private static final java.lang.String zza = null;
    private static final /* synthetic */ com.google.android.gms.fido.u2f.api.common.ErrorCode[] zzb = null;
    private final int zzc;

    static {
            com.google.android.gms.fido.u2f.api.common.ErrorCode r0 = new com.google.android.gms.fido.u2f.api.common.ErrorCode
            java.lang.String r1 = "OK"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.fido.u2f.api.common.ErrorCode.OK = r0
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = new com.google.android.gms.fido.u2f.api.common.ErrorCode
            java.lang.String r3 = "OTHER_ERROR"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR = r1
            com.google.android.gms.fido.u2f.api.common.ErrorCode r3 = new com.google.android.gms.fido.u2f.api.common.ErrorCode
            java.lang.String r5 = "BAD_REQUEST"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.fido.u2f.api.common.ErrorCode.BAD_REQUEST = r3
            com.google.android.gms.fido.u2f.api.common.ErrorCode r5 = new com.google.android.gms.fido.u2f.api.common.ErrorCode
            java.lang.String r7 = "CONFIGURATION_UNSUPPORTED"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.fido.u2f.api.common.ErrorCode.CONFIGURATION_UNSUPPORTED = r5
            com.google.android.gms.fido.u2f.api.common.ErrorCode r7 = new com.google.android.gms.fido.u2f.api.common.ErrorCode
            java.lang.String r9 = "DEVICE_INELIGIBLE"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.fido.u2f.api.common.ErrorCode.DEVICE_INELIGIBLE = r7
            com.google.android.gms.fido.u2f.api.common.ErrorCode r9 = new com.google.android.gms.fido.u2f.api.common.ErrorCode
            java.lang.String r11 = "TIMEOUT"
            r12 = 5
            r9.<init>(r11, r12, r12)
            com.google.android.gms.fido.u2f.api.common.ErrorCode.TIMEOUT = r9
            r11 = 6
            com.google.android.gms.fido.u2f.api.common.ErrorCode[] r11 = new com.google.android.gms.fido.u2f.api.common.ErrorCode[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.fido.u2f.api.common.ErrorCode.zzb = r11
            java.lang.Class<com.google.android.gms.fido.u2f.api.common.ErrorCode> r0 = com.google.android.gms.fido.u2f.api.common.ErrorCode.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.gms.fido.u2f.api.common.ErrorCode.zza = r0
            com.google.android.gms.fido.u2f.api.common.zzc r0 = new com.google.android.gms.fido.u2f.api.common.zzc
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.ErrorCode.CREATOR = r0
            return
    }

    ErrorCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.fido.u2f.api.common.ErrorCode toErrorCode(int r5) {
            com.google.android.gms.fido.u2f.api.common.ErrorCode[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.zzc
            if (r5 != r4) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.fido.u2f.api.common.ErrorCode r5 = com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR
            return r5
    }

    public static com.google.android.gms.fido.u2f.api.common.ErrorCode valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.u2f.api.common.ErrorCode> r0 = com.google.android.gms.fido.u2f.api.common.ErrorCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = (com.google.android.gms.fido.u2f.api.common.ErrorCode) r1
            return r1
    }

    public static com.google.android.gms.fido.u2f.api.common.ErrorCode[] values() {
            com.google.android.gms.fido.u2f.api.common.ErrorCode[] r0 = com.google.android.gms.fido.u2f.api.common.ErrorCode.zzb
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.u2f.api.common.ErrorCode[] r0 = (com.google.android.gms.fido.u2f.api.common.ErrorCode[]) r0
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
            int r0 = r1.zzc
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.zzc
            r1.writeInt(r2)
            return
    }
}
