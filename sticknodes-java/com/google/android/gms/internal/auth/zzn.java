package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zzn extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzo {
    public zzn() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 2
            if (r1 != r3) goto L1b
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.auth.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.auth.zzc.zza(r2, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.auth.zzc.zzb(r2)
            r0.zzb(r1, r3)
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }
}
