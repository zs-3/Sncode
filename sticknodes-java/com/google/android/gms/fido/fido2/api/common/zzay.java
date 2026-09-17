package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.ShowFirstParty
/* loaded from: classes.dex */
public enum zzay extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.zzay> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzay> CREATOR = null;
    public static final com.google.android.gms.fido.fido2.api.common.zzay zza = null;
    public static final com.google.android.gms.fido.fido2.api.common.zzay zzb = null;
    public static final com.google.android.gms.fido.fido2.api.common.zzay zzc = null;
    private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.zzay[] zzd = null;
    private final java.lang.String zze;

    static {
            com.google.android.gms.fido.fido2.api.common.zzay r0 = new com.google.android.gms.fido.fido2.api.common.zzay
            java.lang.String r1 = "USER_VERIFICATION_REQUIRED"
            r2 = 0
            java.lang.String r3 = "required"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.fido2.api.common.zzay.zza = r0
            com.google.android.gms.fido.fido2.api.common.zzay r1 = new com.google.android.gms.fido.fido2.api.common.zzay
            java.lang.String r3 = "USER_VERIFICATION_PREFERRED"
            r4 = 1
            java.lang.String r5 = "preferred"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.fido2.api.common.zzay.zzb = r1
            com.google.android.gms.fido.fido2.api.common.zzay r3 = new com.google.android.gms.fido.fido2.api.common.zzay
            java.lang.String r5 = "USER_VERIFICATION_DISCOURAGED"
            r6 = 2
            java.lang.String r7 = "discouraged"
            r3.<init>(r5, r6, r7)
            com.google.android.gms.fido.fido2.api.common.zzay.zzc = r3
            r5 = 3
            com.google.android.gms.fido.fido2.api.common.zzay[] r5 = new com.google.android.gms.fido.fido2.api.common.zzay[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.gms.fido.fido2.api.common.zzay.zzd = r5
            com.google.android.gms.fido.fido2.api.common.zzaw r0 = new com.google.android.gms.fido.fido2.api.common.zzaw
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.zzay.CREATOR = r0
            return
    }

    zzay(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zze = r3
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.zzay[] values() {
            com.google.android.gms.fido.fido2.api.common.zzay[] r0 = com.google.android.gms.fido.fido2.api.common.zzay.zzd
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.fido2.api.common.zzay[] r0 = (com.google.android.gms.fido.fido2.api.common.zzay[]) r0
            return r0
    }

    public static com.google.android.gms.fido.fido2.api.common.zzay zza(java.lang.String r5) throws com.google.android.gms.fido.fido2.api.common.zzax {
            com.google.android.gms.fido.fido2.api.common.zzay[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            java.lang.String r4 = r3.zze
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L13
            return r3
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            com.google.android.gms.fido.fido2.api.common.zzax r0 = new com.google.android.gms.fido.fido2.api.common.zzax
            r0.<init>(r5)
            throw r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zze
            r1.writeString(r2)
            return
    }
}
